package typings.pixiCore

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSystemIsystemMod {
  
  trait ISystem[InitOptions, DestroyOptions] extends StObject {
    
    /** Generic destroy methods to be overridden by the subclass */
    var destroy: js.UndefOr[js.Function1[/* options */ js.UndefOr[DestroyOptions], Unit]] = js.undefined
    
    var init: js.UndefOr[js.Function1[/* options */ js.UndefOr[InitOptions], Unit]] = js.undefined
  }
  object ISystem {
    
    inline def apply[InitOptions, DestroyOptions](): ISystem[InitOptions, DestroyOptions] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ISystem[InitOptions, DestroyOptions]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ISystem[?, ?], InitOptions, DestroyOptions] (val x: Self & (ISystem[InitOptions, DestroyOptions])) extends AnyVal {
      
      inline def setDestroy(value: /* options */ js.UndefOr[DestroyOptions] => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction1(value))
      
      inline def setDestroyUndefined: Self = StObject.set(x, "destroy", js.undefined)
      
      inline def setInit(value: /* options */ js.UndefOr[InitOptions] => Unit): Self = StObject.set(x, "init", js.Any.fromFunction1(value))
      
      inline def setInitUndefined: Self = StObject.set(x, "init", js.undefined)
    }
  }
  
  @js.native
  trait ISystemConstructor[R]
    extends StObject
       with Instantiable1[/* renderer */ R, ISystem[Null, Null]]
}
