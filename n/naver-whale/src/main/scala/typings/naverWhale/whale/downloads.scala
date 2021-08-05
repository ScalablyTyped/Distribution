package typings.naverWhale.whale

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object downloads {
  
  trait StateType extends StObject {
    
    val COMPLETE: String
    
    val INTERRUPTED: String
    
    val IN_PROGRESS: String
  }
  object StateType {
    
    inline def apply(COMPLETE: String, INTERRUPTED: String, IN_PROGRESS: String): StateType = {
      val __obj = js.Dynamic.literal(COMPLETE = COMPLETE.asInstanceOf[js.Any], INTERRUPTED = INTERRUPTED.asInstanceOf[js.Any], IN_PROGRESS = IN_PROGRESS.asInstanceOf[js.Any])
      __obj.asInstanceOf[StateType]
    }
    
    extension [Self <: StateType](x: Self) {
      
      inline def setCOMPLETE(value: String): Self = StObject.set(x, "COMPLETE", value.asInstanceOf[js.Any])
      
      inline def setINTERRUPTED(value: String): Self = StObject.set(x, "INTERRUPTED", value.asInstanceOf[js.Any])
      
      inline def setIN_PROGRESS(value: String): Self = StObject.set(x, "IN_PROGRESS", value.asInstanceOf[js.Any])
    }
  }
}
