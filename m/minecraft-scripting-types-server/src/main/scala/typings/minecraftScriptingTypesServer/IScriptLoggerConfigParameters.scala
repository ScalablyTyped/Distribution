package typings.minecraftScriptingTypesServer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This event is used to turn various levels of logging on and off for server scripts. Note that turning logging on/off is not limited to the script that broadcasted the event. It will affect ALL server scripts including those in other Behavior Packs that are applied to the world. See the Debugging section for more information on logging.
  */
@js.native
trait IScriptLoggerConfigParameters extends js.Object {
  /**
    * Set to true to log any scripting errors that occur on the server
    * @default false
    */
  var log_errors: Boolean = js.native
  /**
    * Set to true to log any general scripting information that occurs on the server. This includes any logging done with server.log()
    * @default false
    */
  var log_information: Boolean = js.native
  /**
    * Set to true to log any scripting warnings that occur on the server
    * @default false
    */
  var log_warnings: Boolean = js.native
}

object IScriptLoggerConfigParameters {
  @scala.inline
  def apply(log_errors: Boolean, log_information: Boolean, log_warnings: Boolean): IScriptLoggerConfigParameters = {
    val __obj = js.Dynamic.literal(log_errors = log_errors.asInstanceOf[js.Any], log_information = log_information.asInstanceOf[js.Any], log_warnings = log_warnings.asInstanceOf[js.Any])
    __obj.asInstanceOf[IScriptLoggerConfigParameters]
  }
  @scala.inline
  implicit class IScriptLoggerConfigParametersOps[Self <: IScriptLoggerConfigParameters] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setLog_errors(value: Boolean): Self = this.set("log_errors", value.asInstanceOf[js.Any])
    @scala.inline
    def setLog_information(value: Boolean): Self = this.set("log_information", value.asInstanceOf[js.Any])
    @scala.inline
    def setLog_warnings(value: Boolean): Self = this.set("log_warnings", value.asInstanceOf[js.Any])
  }
  
}

