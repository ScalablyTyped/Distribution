package typings.miscUtilsOfMineGeneric

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcTimeWaitForMod {
  
  @JSImport("misc-utils-of-mine-generic/dist/src/time/waitFor", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def waitForPredicate[T](p: js.Function1[/* repeated */ Any, js.UndefOr[T]]): js.Promise[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("waitForPredicate")(p.asInstanceOf[js.Any]).asInstanceOf[js.Promise[T]]
  inline def waitForPredicate[T](p: js.Function1[/* repeated */ Any, js.UndefOr[T]], options: String): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("waitForPredicate")(p.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
  inline def waitForPredicate[T](p: js.Function1[/* repeated */ Any, js.UndefOr[T]], options: WaitForPredicateOptions): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("waitForPredicate")(p.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
  
  trait WaitForPredicateOptions extends StObject {
    
    /**
      * Predicate function call interval.
      */
    var interval: js.UndefOr[Double] = js.undefined
    
    /**
      * Timeout. If more time than this passes from [[waitForPredicate]] call, it will throw an error.
      */
    var timeout: js.UndefOr[Double] = js.undefined
    
    var timeoutError: js.UndefOr[String] = js.undefined
  }
  object WaitForPredicateOptions {
    
    inline def apply(): WaitForPredicateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WaitForPredicateOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WaitForPredicateOptions] (val x: Self) extends AnyVal {
      
      inline def setInterval(value: Double): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
      
      inline def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutError(value: String): Self = StObject.set(x, "timeoutError", value.asInstanceOf[js.Any])
      
      inline def setTimeoutErrorUndefined: Self = StObject.set(x, "timeoutError", js.undefined)
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
}
