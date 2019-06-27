package typings
package npmlogLib.npmlogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// TODO: newStream, newGroup, setGaugeTemplate and setGaugeTemplateSet need to be added
@js.native
trait Logger
  extends nodeLib.eventsMod.EventEmitter
     with // Allows for custom log levels
// npmlog.addLevel("custom", level)
// npmlog.custom(prefix, message)
/* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var heading: java.lang.String = js.native
  var headingStyle: StyleObject = js.native
  var level: java.lang.String = js.native
  var maxRecordSize: scala.Double = js.native
  var prefixStyle: StyleObject = js.native
  var record: js.Array[MessageObject] = js.native
  var stream: js.Any = js.native
  def apply(): js.Any = js.native
  def addLevel(level: java.lang.String, n: scala.Double): scala.Unit = js.native
  def addLevel(level: java.lang.String, n: scala.Double, style: StyleObject): scala.Unit = js.native
  def addLevel(level: java.lang.String, n: scala.Double, style: StyleObject, disp: java.lang.String): scala.Unit = js.native
  /* InferMemberOverrides */
  override def addListener(event: java.lang.String, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def addListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  def disableColor(): scala.Unit = js.native
  def disableProgress(): scala.Unit = js.native
  def disableUnicode(): scala.Unit = js.native
  /* InferMemberOverrides */
  override def emit(event: java.lang.String, args: js.Any*): scala.Boolean = js.native
  /* InferMemberOverrides */
  override def emit(event: js.Symbol, args: js.Any*): scala.Boolean = js.native
  def enableColor(): scala.Unit = js.native
  def enableProgress(): scala.Unit = js.native
  def enableUnicode(): scala.Unit = js.native
  def error(prefix: java.lang.String, message: java.lang.String, args: js.Any*): scala.Unit = js.native
  /* InferMemberOverrides */
  override def eventNames(): js.Array[java.lang.String | js.Symbol] = js.native
  /* InferMemberOverrides */
  override def getMaxListeners(): scala.Double = js.native
  def http(prefix: java.lang.String, message: java.lang.String, args: js.Any*): scala.Unit = js.native
  def info(prefix: java.lang.String, message: java.lang.String, args: js.Any*): scala.Unit = js.native
  /* InferMemberOverrides */
  override def listenerCount(`type`: java.lang.String): scala.Double = js.native
  /* InferMemberOverrides */
  override def listenerCount(`type`: js.Symbol): scala.Double = js.native
  /* InferMemberOverrides */
  override def listeners(event: java.lang.String): js.Array[js.Function] = js.native
  /* InferMemberOverrides */
  override def listeners(event: js.Symbol): js.Array[js.Function] = js.native
  def log(level: java.lang.String, prefix: java.lang.String, message: java.lang.String, args: js.Any*): scala.Unit = js.native
   // Defaults to process.stderr
  def log(level: LogLevels, prefix: java.lang.String, message: java.lang.String, args: js.Any*): scala.Unit = js.native
  def notice(prefix: java.lang.String, message: java.lang.String, args: js.Any*): scala.Unit = js.native
  /* InferMemberOverrides */
  override def off(event: java.lang.String, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def off(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def on(event: java.lang.String, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def on(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def once(event: java.lang.String, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def once(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  def pause(): scala.Unit = js.native
  // Added in Node 6...
  /* InferMemberOverrides */
  override def prependListener(event: java.lang.String, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def prependListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def prependOnceListener(event: java.lang.String, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def prependOnceListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  def progressEnabled(): scala.Boolean = js.native
  /* InferMemberOverrides */
  override def rawListeners(event: java.lang.String): js.Array[js.Function] = js.native
  /* InferMemberOverrides */
  override def rawListeners(event: js.Symbol): js.Array[js.Function] = js.native
  /* InferMemberOverrides */
  override def removeAllListeners(): this.type = js.native
  /* InferMemberOverrides */
  override def removeAllListeners(event: java.lang.String): this.type = js.native
  /* InferMemberOverrides */
  override def removeAllListeners(event: js.Symbol): this.type = js.native
  /* InferMemberOverrides */
  override def removeListener(event: java.lang.String, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def removeListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  def resume(): scala.Unit = js.native
  /* InferMemberOverrides */
  override def setMaxListeners(n: scala.Double): this.type = js.native
  def silent(prefix: java.lang.String, message: java.lang.String, args: js.Any*): scala.Unit = js.native
  def silly(prefix: java.lang.String, message: java.lang.String, args: js.Any*): scala.Unit = js.native
  def timing(prefix: java.lang.String, message: java.lang.String, args: js.Any*): scala.Unit = js.native
  def verbose(prefix: java.lang.String, message: java.lang.String, args: js.Any*): scala.Unit = js.native
  def warn(prefix: java.lang.String, message: java.lang.String, args: js.Any*): scala.Unit = js.native
}

