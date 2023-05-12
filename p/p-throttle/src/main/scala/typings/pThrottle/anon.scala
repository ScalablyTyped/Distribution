package typings.pThrottle

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Abort extends StObject {
    
    /**
    	Abort pending executions. All unresolved promises are rejected with a `pThrottle.AbortError` error.
    	*/
    def abort(): Unit
    
    /**
    	Whether future function calls should be throttled or count towards throttling thresholds.
    	@default true
    	*/
    var isEnabled: Boolean
    
    /**
    	The number of queued items waiting to be executed.
    	*/
    val queueSize: Double
  }
  object Abort {
    
    inline def apply(abort: () => Unit, isEnabled: Boolean, queueSize: Double): Abort = {
      val __obj = js.Dynamic.literal(abort = js.Any.fromFunction0(abort), isEnabled = isEnabled.asInstanceOf[js.Any], queueSize = queueSize.asInstanceOf[js.Any])
      __obj.asInstanceOf[Abort]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Abort] (val x: Self) extends AnyVal {
      
      inline def setAbort(value: () => Unit): Self = StObject.set(x, "abort", js.Any.fromFunction0(value))
      
      inline def setIsEnabled(value: Boolean): Self = StObject.set(x, "isEnabled", value.asInstanceOf[js.Any])
      
      inline def setQueueSize(value: Double): Self = StObject.set(x, "queueSize", value.asInstanceOf[js.Any])
    }
  }
}
