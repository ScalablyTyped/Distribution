package typings.npmlog.npmlogMod

import org.scalablytyped.runtime.StringDictionary
import typings.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// TODO: newStream, newGroup, setGaugeTemplate and setGaugeTemplateSet need to be added
@js.native
trait Logger
  extends EventEmitter
     with // Allows for custom log levels
// npmlog.addLevel("custom", level)
// npmlog.custom(prefix, message)
/* key */ StringDictionary[js.Any] {
  var heading: String = js.native
  var headingStyle: StyleObject = js.native
  var level: String = js.native
  var maxRecordSize: Double = js.native
  var prefixStyle: StyleObject = js.native
  var record: js.Array[MessageObject] = js.native
  var stream: js.Any = js.native
  def apply(): js.Any = js.native
  def addLevel(level: String, n: Double): Unit = js.native
  def addLevel(level: String, n: Double, style: StyleObject): Unit = js.native
  def addLevel(level: String, n: Double, style: StyleObject, disp: String): Unit = js.native
  /* InferMemberOverrides */
  override def addListener(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def addListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  def disableColor(): Unit = js.native
  def disableProgress(): Unit = js.native
  def disableUnicode(): Unit = js.native
  /* InferMemberOverrides */
  override def emit(event: String, args: js.Any*): Boolean = js.native
  /* InferMemberOverrides */
  override def emit(event: js.Symbol, args: js.Any*): Boolean = js.native
  def enableColor(): Unit = js.native
  def enableProgress(): Unit = js.native
  def enableUnicode(): Unit = js.native
  def error(prefix: String, message: String, args: js.Any*): Unit = js.native
  /* InferMemberOverrides */
  override def eventNames(): js.Array[String | js.Symbol] = js.native
  /* InferMemberOverrides */
  override def getMaxListeners(): Double = js.native
  def http(prefix: String, message: String, args: js.Any*): Unit = js.native
  def info(prefix: String, message: String, args: js.Any*): Unit = js.native
  /* InferMemberOverrides */
  override def listenerCount(`type`: String): Double = js.native
  /* InferMemberOverrides */
  override def listenerCount(`type`: js.Symbol): Double = js.native
  /* InferMemberOverrides */
  override def listeners(event: String): js.Array[js.Function] = js.native
  /* InferMemberOverrides */
  override def listeners(event: js.Symbol): js.Array[js.Function] = js.native
  def log(level: String, prefix: String, message: String, args: js.Any*): Unit = js.native
   // Defaults to process.stderr
  def log(level: LogLevels, prefix: String, message: String, args: js.Any*): Unit = js.native
  def notice(prefix: String, message: String, args: js.Any*): Unit = js.native
  /* InferMemberOverrides */
  override def off(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def off(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def on(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def on(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def once(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def once(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  def pause(): Unit = js.native
  // Added in Node 6...
  /* InferMemberOverrides */
  override def prependListener(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def prependListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def prependOnceListener(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def prependOnceListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  def progressEnabled(): Boolean = js.native
  /* InferMemberOverrides */
  override def rawListeners(event: String): js.Array[js.Function] = js.native
  /* InferMemberOverrides */
  override def rawListeners(event: js.Symbol): js.Array[js.Function] = js.native
  /* InferMemberOverrides */
  override def removeAllListeners(): this.type = js.native
  /* InferMemberOverrides */
  override def removeAllListeners(event: String): this.type = js.native
  /* InferMemberOverrides */
  override def removeAllListeners(event: js.Symbol): this.type = js.native
  /* InferMemberOverrides */
  override def removeListener(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def removeListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  def resume(): Unit = js.native
  /* InferMemberOverrides */
  override def setMaxListeners(n: Double): this.type = js.native
  def silent(prefix: String, message: String, args: js.Any*): Unit = js.native
  def silly(prefix: String, message: String, args: js.Any*): Unit = js.native
  def timing(prefix: String, message: String, args: js.Any*): Unit = js.native
  def verbose(prefix: String, message: String, args: js.Any*): Unit = js.native
  def warn(prefix: String, message: String, args: js.Any*): Unit = js.native
}

