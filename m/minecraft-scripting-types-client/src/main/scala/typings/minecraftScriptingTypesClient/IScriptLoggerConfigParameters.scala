package typings.minecraftScriptingTypesClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This event is used to turn various levels of logging on and off for client scripts. Note that turning logging on/off is not limited to the script that broadcasted the event. It will affect ALL client scripts including those in other Behavior Packs that are applied to the world. See the Debugging section for more information on logging.
  */
trait IScriptLoggerConfigParameters extends js.Object {
  /**
    * Set to true to log any scripting errors that occur on the client
    * @default false
    */
  var log_errors: Boolean
  /**
    * Set to true to log any general scripting information that occurs on the client. This includes any logging done with client.log()
    * @default false
    */
  var log_information: Boolean
  /**
    * Set to true to log any scripting warnings that occur on the client
    * @default false
    */
  var log_warnings: Boolean
}

object IScriptLoggerConfigParameters {
  @scala.inline
  def apply(log_errors: Boolean, log_information: Boolean, log_warnings: Boolean): IScriptLoggerConfigParameters = {
    val __obj = js.Dynamic.literal(log_errors = log_errors.asInstanceOf[js.Any], log_information = log_information.asInstanceOf[js.Any], log_warnings = log_warnings.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IScriptLoggerConfigParameters]
  }
}

