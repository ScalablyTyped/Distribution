package typings.openfin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rvmMod {
  
  trait RVMInfo extends StObject {
    
    var action: String
    
    var appLogDirectory: String
    
    var path: String
    
    var `start-time`: String
    
    var version: String
    
    var `working-dir`: String
  }
  object RVMInfo {
    
    @scala.inline
    def apply(
      action: String,
      appLogDirectory: String,
      path: String,
      `start-time`: String,
      version: String,
      `working-dir`: String
    ): RVMInfo = {
      val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], appLogDirectory = appLogDirectory.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.updateDynamic("start-time")(`start-time`.asInstanceOf[js.Any])
      __obj.updateDynamic("working-dir")(`working-dir`.asInstanceOf[js.Any])
      __obj.asInstanceOf[RVMInfo]
    }
    
    @scala.inline
    implicit class RVMInfoMutableBuilder[Self <: RVMInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAppLogDirectory(value: String): Self = StObject.set(x, "appLogDirectory", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setStart-time`(value: String): Self = StObject.set(x, "start-time", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setWorking-dir`(value: String): Self = StObject.set(x, "working-dir", value.asInstanceOf[js.Any])
    }
  }
}
