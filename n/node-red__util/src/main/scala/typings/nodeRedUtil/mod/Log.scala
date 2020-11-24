package typings.nodeRedUtil.mod

import typings.node.eventsMod.EventEmitter
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Log extends js.Object {
  
  /** Audit level */
  val AUDIT: Double = js.native
  
  /** Debug level */
  val DEBUG: Double = js.native
  
  /** Error level */
  val ERROR: Double = js.native
  
  /** Fatal level */
  val FATAL: Double = js.native
  
  /** Info level */
  val INFO: Double = js.native
  
  /** Metric level */
  val METRIC: Double = js.native
  
  /** Trace level */
  val TRACE: Double = js.native
  
  /** Warn level */
  val WARN: Double = js.native
  
  /**
    * Perform a message catalog lookup.
    */
  @JSName("_")
  def _underscore(id: String): String = js.native
  @JSName("_")
  def _underscore(id: String, tplStrs: Record[String, String | Double]): String = js.native
  /**
    * Perform a message catalog lookup.
    */
  @JSName("_")
  var _underscore_Original: I18nTFunction = js.native
  
  /**
    * Add a log handler
    * @param - event emitter with `(msg: LogMessageObject) => void` listener on `log` events
    */
  def addHandler(handler: EventEmitter): Unit = js.native
  
  /**
    * Log an audit event.
    */
  def audit(msg: LogMessageObject): Unit = js.native
  def audit(msg: LogMessageObject, req: js.Object): Unit = js.native
  
  /**
    * Log a message at DEBUG level
    */
  def debug(msg: LogMessage): Unit = js.native
  
  /**
    * Log a message at ERROR level
    */
  def error(msg: LogMessage): Unit = js.native
  
  /**
    * Log a message at INFO level
    */
  def info(msg: LogMessage): Unit = js.native
  
  /**
    * Log a message object
    */
  def log(msg: LogMessageObject): Unit = js.native
  
  /**
    * Check if metrics are enabled
    */
  def metric(): Boolean = js.native
  
  /**
    * Remove a log handler
    */
  def removeHandler(handler: EventEmitter): Unit = js.native
  
  /**
    * Log a message at TRACE level
    */
  def trace(msg: LogMessage): Unit = js.native
  
  /**
    * Log a message at WARN level
    */
  def warn(msg: LogMessage): Unit = js.native
}
