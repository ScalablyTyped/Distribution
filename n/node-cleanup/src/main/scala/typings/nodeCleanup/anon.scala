package typings.nodeCleanup

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait CtrlC extends StObject {
    
    var ctrl_C: String
    
    var uncaughtException: String
  }
  object CtrlC {
    
    inline def apply(ctrl_C: String, uncaughtException: String): CtrlC = {
      val __obj = js.Dynamic.literal(ctrl_C = ctrl_C.asInstanceOf[js.Any], uncaughtException = uncaughtException.asInstanceOf[js.Any])
      __obj.asInstanceOf[CtrlC]
    }
    
    extension [Self <: CtrlC](x: Self) {
      
      inline def setCtrl_C(value: String): Self = StObject.set(x, "ctrl_C", value.asInstanceOf[js.Any])
      
      inline def setUncaughtException(value: String): Self = StObject.set(x, "uncaughtException", value.asInstanceOf[js.Any])
    }
  }
}
