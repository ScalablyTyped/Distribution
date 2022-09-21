package typings.pMinDelay

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("p-min-delay", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[T](promise: js.Thenable[T], minimumDelay: Double): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(promise.asInstanceOf[js.Any], minimumDelay.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
  inline def default[T](promise: js.Thenable[T], minimumDelay: Double, options: Options): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(promise.asInstanceOf[js.Any], minimumDelay.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
  
  trait Options extends StObject {
    
    /**
    	Delay the rejection.
    	Turn this off if you want a rejected promise to fail fast.
    	@default true
    	*/
    val delayRejection: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setDelayRejection(value: Boolean): Self = StObject.set(x, "delayRejection", value.asInstanceOf[js.Any])
      
      inline def setDelayRejectionUndefined: Self = StObject.set(x, "delayRejection", js.undefined)
    }
  }
}
