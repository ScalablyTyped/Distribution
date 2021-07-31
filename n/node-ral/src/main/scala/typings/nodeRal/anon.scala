package typings.nodeRal

import typings.nodeRal.mod.RalLogger
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait App extends StObject {
    
    var app: String
    
    var format_wf: String
    
    var logInstance: RalLogger
    
    var log_path: String
  }
  object App {
    
    @scala.inline
    def apply(app: String, format_wf: String, logInstance: RalLogger, log_path: String): App = {
      val __obj = js.Dynamic.literal(app = app.asInstanceOf[js.Any], format_wf = format_wf.asInstanceOf[js.Any], logInstance = logInstance.asInstanceOf[js.Any], log_path = log_path.asInstanceOf[js.Any])
      __obj.asInstanceOf[App]
    }
    
    @scala.inline
    implicit class AppMutableBuilder[Self <: App] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApp(value: String): Self = StObject.set(x, "app", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormat_wf(value: String): Self = StObject.set(x, "format_wf", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLogInstance(value: RalLogger): Self = StObject.set(x, "logInstance", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLog_path(value: String): Self = StObject.set(x, "log_path", value.asInstanceOf[js.Any])
    }
  }
}
