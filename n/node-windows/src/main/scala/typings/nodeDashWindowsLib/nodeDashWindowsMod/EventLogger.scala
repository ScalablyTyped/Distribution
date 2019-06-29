package typings
package nodeDashWindowsLib.nodeDashWindowsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-windows", "EventLogger")
@js.native
class EventLogger () extends js.Object {
  def this(config: EventLogConfig) = this()
  /**
    * @cfg {String} [eventLog=APPLICATION]
    * The event log where messages should be written. This is either `APPLICATION` or `SYSTEM`.
    */
  var eventLog: java.lang.String = js.native
  /**
    * @cfg {String} [name=Node.js]
    * The source of the log information. This is commonly the title of an application
    * or the Node.js script name (i.e. MyApp).
    */
  var source: java.lang.String = js.native
  /**
    * auditFailure
    * Log an audit failure message.
    * @param message
    * The content of the log message.
    * @param [code=1000]
    * The event code to assign to the message.
    * @param [callback]
    * An optional callback to run when the message is logged.
    */
  def auditFailure(message: java.lang.String): scala.Unit = js.native
  def auditFailure(message: java.lang.String, code: scala.Double): scala.Unit = js.native
  def auditFailure(
    message: java.lang.String,
    code: scala.Double,
    callback: js.Function3[
      /* error */ nodeLib.childUnderscoreProcessMod.ExecException, 
      /* stdout */ nodeLib.Buffer, 
      /* stderr */ nodeLib.Buffer, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
    * auditSuccess
    * Log an audit success message.
    * @param message
    * The content of the log message.
    * @param [code=1000]
    * The event code to assign to the message.
    * @param [callback]
    * An optional callback to run when the message is logged.
    */
  def auditSuccess(message: java.lang.String): scala.Unit = js.native
  def auditSuccess(message: java.lang.String, code: scala.Double): scala.Unit = js.native
  def auditSuccess(
    message: java.lang.String,
    code: scala.Double,
    callback: js.Function3[
      /* error */ nodeLib.childUnderscoreProcessMod.ExecException, 
      /* stdout */ nodeLib.Buffer, 
      /* stderr */ nodeLib.Buffer, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
    * error
    * Log an error message.
    * @param message
    * The content of the log message.
    * @param [code=1000]
    * The event code to assign to the message.
    * @param [callback]
    * An optional callback to run when the message is logged.
    */
  def error(message: java.lang.String): scala.Unit = js.native
  def error(message: java.lang.String, code: scala.Double): scala.Unit = js.native
  def error(
    message: java.lang.String,
    code: scala.Double,
    callback: js.Function3[
      /* error */ nodeLib.childUnderscoreProcessMod.ExecException, 
      /* stdout */ nodeLib.Buffer, 
      /* stderr */ nodeLib.Buffer, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
    * info
    * Log an informational message.
    * @param message
    * The content of the log message.
    * @param [code=1000]
    * The event code to assign to the message.
    * @param [callback]
    * An optional callback to run when the message is logged.
    */
  def info(message: java.lang.String): scala.Unit = js.native
  def info(message: java.lang.String, code: scala.Double): scala.Unit = js.native
  def info(
    message: java.lang.String,
    code: scala.Double,
    callback: js.Function3[
      /* error */ nodeLib.childUnderscoreProcessMod.ExecException, 
      /* stdout */ nodeLib.Buffer, 
      /* stderr */ nodeLib.Buffer, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
    * info
    * Log an informational message.
    * @param message
    * The content of the log message.
    * @param [code=1000]
    * The event code to assign to the message.
    * @param [callback]
    * An optional callback to run when the message is logged.
    */
  def information(message: java.lang.String): scala.Unit = js.native
  def information(message: java.lang.String, code: scala.Double): scala.Unit = js.native
  def information(
    message: java.lang.String,
    code: scala.Double,
    callback: js.Function3[
      /* error */ nodeLib.childUnderscoreProcessMod.ExecException, 
      /* stdout */ nodeLib.Buffer, 
      /* stderr */ nodeLib.Buffer, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
    * warn
    * Log a warning message.
    * @param message
    * The content of the log message.
    * @param [code=1000]
    * The event code to assign to the message.
    * @param [callback]
    * An optional callback to run when the message is logged.
    */
  def warn(message: java.lang.String): scala.Unit = js.native
  def warn(message: java.lang.String, code: scala.Double): scala.Unit = js.native
  def warn(
    message: java.lang.String,
    code: scala.Double,
    callback: js.Function3[
      /* error */ nodeLib.childUnderscoreProcessMod.ExecException, 
      /* stdout */ nodeLib.Buffer, 
      /* stderr */ nodeLib.Buffer, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
    * warn
    * Log a warning message.
    * @param message
    * The content of the log message.
    * @param [code=1000]
    * The event code to assign to the message.
    * @param [callback]
    * An optional callback to run when the message is logged.
    */
  def warning(message: java.lang.String): scala.Unit = js.native
  def warning(message: java.lang.String, code: scala.Double): scala.Unit = js.native
  def warning(
    message: java.lang.String,
    code: scala.Double,
    callback: js.Function3[
      /* error */ nodeLib.childUnderscoreProcessMod.ExecException, 
      /* stdout */ nodeLib.Buffer, 
      /* stderr */ nodeLib.Buffer, 
      scala.Unit
    ]
  ): scala.Unit = js.native
}

