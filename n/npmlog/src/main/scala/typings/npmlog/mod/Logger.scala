package typings.npmlog.mod

import org.scalablytyped.runtime.StringDictionary
import typings.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// TODO: newStream, newGroup, setGaugeTemplate and setGaugeTemplateSet need to be added
@js.native
trait Logger
  extends EventEmitter
     with // Allows for custom log levels
// npmlog.addLevel("custom", level)
// npmlog.custom(prefix, message)
/* key */ StringDictionary[js.Any] {
  
  def apply(): js.Any = js.native
  
  def addLevel(level: String, n: Double): Unit = js.native
  def addLevel(level: String, n: Double, style: js.UndefOr[scala.Nothing], disp: String): Unit = js.native
  def addLevel(level: String, n: Double, style: StyleObject): Unit = js.native
  def addLevel(level: String, n: Double, style: StyleObject, disp: String): Unit = js.native
  
  def disableColor(): Unit = js.native
  
  def disableProgress(): Unit = js.native
  
  def disableUnicode(): Unit = js.native
  
  def enableColor(): Unit = js.native
  
  def enableProgress(): Unit = js.native
  
  def enableUnicode(): Unit = js.native
  
  def error(prefix: String, message: String, args: js.Any*): Unit = js.native
  
  var heading: String = js.native
  
  var headingStyle: StyleObject = js.native
  
  def http(prefix: String, message: String, args: js.Any*): Unit = js.native
  
  def info(prefix: String, message: String, args: js.Any*): Unit = js.native
  
  var level: String = js.native
  
  def log(level: String, prefix: String, message: String, args: js.Any*): Unit = js.native
   // Defaults to process.stderr
  def log(level: LogLevels, prefix: String, message: String, args: js.Any*): Unit = js.native
  
  var maxRecordSize: Double = js.native
  
  def notice(prefix: String, message: String, args: js.Any*): Unit = js.native
  
  def pause(): Unit = js.native
  
  var prefixStyle: StyleObject = js.native
  
  def progressEnabled(): Boolean = js.native
  
  var record: js.Array[MessageObject] = js.native
  
  def resume(): Unit = js.native
  
  def silent(prefix: String, message: String, args: js.Any*): Unit = js.native
  
  def silly(prefix: String, message: String, args: js.Any*): Unit = js.native
  
  var stream: js.Any = js.native
  
  def timing(prefix: String, message: String, args: js.Any*): Unit = js.native
  
  def verbose(prefix: String, message: String, args: js.Any*): Unit = js.native
  
  def warn(prefix: String, message: String, args: js.Any*): Unit = js.native
}
