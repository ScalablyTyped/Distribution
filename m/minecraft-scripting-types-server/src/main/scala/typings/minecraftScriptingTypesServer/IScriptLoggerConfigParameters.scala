package typings.minecraftScriptingTypesServer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This event is used to turn various levels of logging on and off for server scripts. Note that turning logging on/off is not limited to the script that broadcasted the event. It will affect ALL server scripts including those in other Behavior Packs that are applied to the world. See the Debugging section for more information on logging.
  */
trait IScriptLoggerConfigParameters extends StObject {
  
  /**
    * Set to true to log any scripting errors that occur on the server
    * @default false
    */
  var log_errors: Boolean
  
  /**
    * Set to true to log any general scripting information that occurs on the server. This includes any logging done with server.log()
    * @default false
    */
  var log_information: Boolean
  
  /**
    * Set to true to log any scripting warnings that occur on the server
    * @default false
    */
  var log_warnings: Boolean
}
object IScriptLoggerConfigParameters {
  
  inline def apply(log_errors: Boolean, log_information: Boolean, log_warnings: Boolean): IScriptLoggerConfigParameters = {
    val __obj = js.Dynamic.literal(log_errors = log_errors.asInstanceOf[js.Any], log_information = log_information.asInstanceOf[js.Any], log_warnings = log_warnings.asInstanceOf[js.Any])
    __obj.asInstanceOf[IScriptLoggerConfigParameters]
  }
  
  extension [Self <: IScriptLoggerConfigParameters](x: Self) {
    
    inline def setLog_errors(value: Boolean): Self = StObject.set(x, "log_errors", value.asInstanceOf[js.Any])
    
    inline def setLog_information(value: Boolean): Self = StObject.set(x, "log_information", value.asInstanceOf[js.Any])
    
    inline def setLog_warnings(value: Boolean): Self = StObject.set(x, "log_warnings", value.asInstanceOf[js.Any])
  }
}
