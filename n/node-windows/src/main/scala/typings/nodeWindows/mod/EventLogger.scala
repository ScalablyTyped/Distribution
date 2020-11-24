package typings.nodeWindows.mod

import typings.node.Buffer
import typings.node.childProcessMod.ExecException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("node-windows", "EventLogger")
@js.native
class EventLogger () extends js.Object {
  def this(config: EventLogConfig) = this()
  
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
  def auditFailure(message: String): Unit = js.native
  def auditFailure(
    message: String,
    code: js.UndefOr[scala.Nothing],
    callback: js.Function3[/* error */ ExecException, /* stdout */ Buffer, /* stderr */ Buffer, Unit]
  ): Unit = js.native
  def auditFailure(message: String, code: Double): Unit = js.native
  def auditFailure(
    message: String,
    code: Double,
    callback: js.Function3[/* error */ ExecException, /* stdout */ Buffer, /* stderr */ Buffer, Unit]
  ): Unit = js.native
  
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
  def auditSuccess(message: String): Unit = js.native
  def auditSuccess(
    message: String,
    code: js.UndefOr[scala.Nothing],
    callback: js.Function3[/* error */ ExecException, /* stdout */ Buffer, /* stderr */ Buffer, Unit]
  ): Unit = js.native
  def auditSuccess(message: String, code: Double): Unit = js.native
  def auditSuccess(
    message: String,
    code: Double,
    callback: js.Function3[/* error */ ExecException, /* stdout */ Buffer, /* stderr */ Buffer, Unit]
  ): Unit = js.native
  
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
  def error(message: String): Unit = js.native
  def error(
    message: String,
    code: js.UndefOr[scala.Nothing],
    callback: js.Function3[/* error */ ExecException, /* stdout */ Buffer, /* stderr */ Buffer, Unit]
  ): Unit = js.native
  def error(message: String, code: Double): Unit = js.native
  def error(
    message: String,
    code: Double,
    callback: js.Function3[/* error */ ExecException, /* stdout */ Buffer, /* stderr */ Buffer, Unit]
  ): Unit = js.native
  
  /**
    * @cfg {String} [eventLog=APPLICATION]
    * The event log where messages should be written. This is either `APPLICATION` or `SYSTEM`.
    */
  var eventLog: String = js.native
  
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
  def info(message: String): Unit = js.native
  def info(
    message: String,
    code: js.UndefOr[scala.Nothing],
    callback: js.Function3[/* error */ ExecException, /* stdout */ Buffer, /* stderr */ Buffer, Unit]
  ): Unit = js.native
  def info(message: String, code: Double): Unit = js.native
  def info(
    message: String,
    code: Double,
    callback: js.Function3[/* error */ ExecException, /* stdout */ Buffer, /* stderr */ Buffer, Unit]
  ): Unit = js.native
  
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
  def information(message: String): Unit = js.native
  def information(
    message: String,
    code: js.UndefOr[scala.Nothing],
    callback: js.Function3[/* error */ ExecException, /* stdout */ Buffer, /* stderr */ Buffer, Unit]
  ): Unit = js.native
  def information(message: String, code: Double): Unit = js.native
  def information(
    message: String,
    code: Double,
    callback: js.Function3[/* error */ ExecException, /* stdout */ Buffer, /* stderr */ Buffer, Unit]
  ): Unit = js.native
  
  /**
    * @cfg {String} [name=Node.js]
    * The source of the log information. This is commonly the title of an application
    * or the Node.js script name (i.e. MyApp).
    */
  var source: String = js.native
  
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
  def warn(message: String): Unit = js.native
  def warn(
    message: String,
    code: js.UndefOr[scala.Nothing],
    callback: js.Function3[/* error */ ExecException, /* stdout */ Buffer, /* stderr */ Buffer, Unit]
  ): Unit = js.native
  def warn(message: String, code: Double): Unit = js.native
  def warn(
    message: String,
    code: Double,
    callback: js.Function3[/* error */ ExecException, /* stdout */ Buffer, /* stderr */ Buffer, Unit]
  ): Unit = js.native
  
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
  def warning(message: String): Unit = js.native
  def warning(
    message: String,
    code: js.UndefOr[scala.Nothing],
    callback: js.Function3[/* error */ ExecException, /* stdout */ Buffer, /* stderr */ Buffer, Unit]
  ): Unit = js.native
  def warning(message: String, code: Double): Unit = js.native
  def warning(
    message: String,
    code: Double,
    callback: js.Function3[/* error */ ExecException, /* stdout */ Buffer, /* stderr */ Buffer, Unit]
  ): Unit = js.native
}
