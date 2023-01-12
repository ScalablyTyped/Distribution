package typings.pixiLoaders.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ILoaderPlugin extends StObject {
  
  /** Function to call immediate after registering plugin. */
  var add: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    * Middleware function to run before load
    * @param {LoaderResource} resource - resource
    * @param {LoaderResource} next - next middleware
    */
  var pre: js.UndefOr[
    js.Function2[
      /* resource */ LoaderResource, 
      /* next */ js.Function1[/* repeated */ Any, Unit], 
      Unit
    ]
  ] = js.undefined
  
  /**
    * Middleware function to run after load
    * @param {LoaderResource} resource - resource
    * @param {LoaderResource} next - next middleware
    */
  var use: js.UndefOr[
    js.Function2[
      /* resource */ LoaderResource, 
      /* next */ js.Function1[/* repeated */ Any, Unit], 
      Unit
    ]
  ] = js.undefined
}
object ILoaderPlugin {
  
  inline def apply(): ILoaderPlugin = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ILoaderPlugin]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ILoaderPlugin] (val x: Self) extends AnyVal {
    
    inline def setAdd(value: () => Unit): Self = StObject.set(x, "add", js.Any.fromFunction0(value))
    
    inline def setAddUndefined: Self = StObject.set(x, "add", js.undefined)
    
    inline def setPre(value: (/* resource */ LoaderResource, /* next */ js.Function1[/* repeated */ Any, Unit]) => Unit): Self = StObject.set(x, "pre", js.Any.fromFunction2(value))
    
    inline def setPreUndefined: Self = StObject.set(x, "pre", js.undefined)
    
    inline def setUse(value: (/* resource */ LoaderResource, /* next */ js.Function1[/* repeated */ Any, Unit]) => Unit): Self = StObject.set(x, "use", js.Any.fromFunction2(value))
    
    inline def setUseUndefined: Self = StObject.set(x, "use", js.undefined)
  }
}
