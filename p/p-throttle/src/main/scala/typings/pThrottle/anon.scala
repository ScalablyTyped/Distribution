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
  }
  object Abort {
    
    inline def apply(abort: () => Unit): Abort = {
      val __obj = js.Dynamic.literal(abort = js.Any.fromFunction0(abort))
      __obj.asInstanceOf[Abort]
    }
    
    extension [Self <: Abort](x: Self) {
      
      inline def setAbort(value: () => Unit): Self = StObject.set(x, "abort", js.Any.fromFunction0(value))
    }
  }
}
