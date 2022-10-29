package typings.pixiCore

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSystemIsystemMod {
  
  trait ISystem[INIT_OPTIONS, DESTROY_OPTIONS] extends StObject {
    
    /** Generic destroy methods to be overridden by the subclass */
    var destroy: js.UndefOr[js.Function1[/* options */ js.UndefOr[DESTROY_OPTIONS], Unit]] = js.undefined
    
    var init: js.UndefOr[js.Function1[/* options */ js.UndefOr[INIT_OPTIONS], Unit]] = js.undefined
  }
  object ISystem {
    
    inline def apply[INIT_OPTIONS, DESTROY_OPTIONS](): ISystem[INIT_OPTIONS, DESTROY_OPTIONS] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ISystem[INIT_OPTIONS, DESTROY_OPTIONS]]
    }
    
    extension [Self <: ISystem[?, ?], INIT_OPTIONS, DESTROY_OPTIONS](x: Self & (ISystem[INIT_OPTIONS, DESTROY_OPTIONS])) {
      
      inline def setDestroy(value: /* options */ js.UndefOr[DESTROY_OPTIONS] => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction1(value))
      
      inline def setDestroyUndefined: Self = StObject.set(x, "destroy", js.undefined)
      
      inline def setInit(value: /* options */ js.UndefOr[INIT_OPTIONS] => Unit): Self = StObject.set(x, "init", js.Any.fromFunction1(value))
      
      inline def setInitUndefined: Self = StObject.set(x, "init", js.undefined)
    }
  }
  
  @js.native
  trait ISystemConstructor[R]
    extends StObject
       with Instantiable1[/* renderer */ R, ISystem[Null, Null]]
}
