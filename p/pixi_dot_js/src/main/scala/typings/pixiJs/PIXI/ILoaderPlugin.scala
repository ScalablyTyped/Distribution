package typings.pixiJs.PIXI

import typings.pixiJs.PIXI.Loader.loaderMiddleware
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Plugin to be installed for handling specific Loader resources.
  *
  * @memberof PIXI
  * @typedef {object} ILoaderPlugin
  * @property {function} [add] - Function to call immediate after registering plugin.
  * @property {PIXI.Loader.loaderMiddleware} [pre] - Middleware function to run before load, the
  *           arguments for this are `(resource, next)`
  * @property {PIXI.Loader.loaderMiddleware} [use] - Middleware function to run after load, the
  *           arguments for this are `(resource, next)`
  */
trait ILoaderPlugin extends StObject {
  
  var add: js.UndefOr[js.Function1[/* repeated */ js.Any, js.Any]] = js.undefined
  
  var pre: js.UndefOr[loaderMiddleware] = js.undefined
  
  var use: js.UndefOr[loaderMiddleware] = js.undefined
}
object ILoaderPlugin {
  
  inline def apply(): ILoaderPlugin = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ILoaderPlugin]
  }
  
  extension [Self <: ILoaderPlugin](x: Self) {
    
    inline def setAdd(value: /* repeated */ js.Any => js.Any): Self = StObject.set(x, "add", js.Any.fromFunction1(value))
    
    inline def setAddUndefined: Self = StObject.set(x, "add", js.undefined)
    
    inline def setPre(
      value: (/* resource */ LoaderResource, /* next */ js.Function1[/* repeated */ js.Any, js.Any]) => Unit
    ): Self = StObject.set(x, "pre", js.Any.fromFunction2(value))
    
    inline def setPreUndefined: Self = StObject.set(x, "pre", js.undefined)
    
    inline def setUse(
      value: (/* resource */ LoaderResource, /* next */ js.Function1[/* repeated */ js.Any, js.Any]) => Unit
    ): Self = StObject.set(x, "use", js.Any.fromFunction2(value))
    
    inline def setUseUndefined: Self = StObject.set(x, "use", js.undefined)
  }
}
