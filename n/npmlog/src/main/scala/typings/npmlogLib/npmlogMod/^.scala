package typings
package npmlogLib.npmlogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("npmlog", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var heading: java.lang.String = js.native
  var headingStyle: npmlogLib.npmlogMod.StyleObject = js.native
  var level: java.lang.String = js.native
  var maxRecordSize: scala.Double = js.native
  var prefixStyle: npmlogLib.npmlogMod.StyleObject = js.native
  var record: js.Array[npmlogLib.npmlogMod.MessageObject] = js.native
  var stream: js.Any = js.native
  def addLevel(level: java.lang.String, n: scala.Double): scala.Unit = js.native
  def addLevel(level: java.lang.String, n: scala.Double, style: npmlogLib.npmlogMod.StyleObject): scala.Unit = js.native
  def addLevel(
    level: java.lang.String,
    n: scala.Double,
    style: npmlogLib.npmlogMod.StyleObject,
    disp: java.lang.String
  ): scala.Unit = js.native
  def disableColor(): scala.Unit = js.native
  def disableProgress(): scala.Unit = js.native
  def disableUnicode(): scala.Unit = js.native
  def enableColor(): scala.Unit = js.native
  def enableProgress(): scala.Unit = js.native
  def enableUnicode(): scala.Unit = js.native
  def error(prefix: java.lang.String, message: java.lang.String, args: js.Any*): scala.Unit = js.native
  def http(prefix: java.lang.String, message: java.lang.String, args: js.Any*): scala.Unit = js.native
  def info(prefix: java.lang.String, message: java.lang.String, args: js.Any*): scala.Unit = js.native
  def log(level: java.lang.String, prefix: java.lang.String, message: java.lang.String, args: js.Any*): scala.Unit = js.native
  def log(
    level: npmlogLib.npmlogMod.LogLevels,
    prefix: java.lang.String,
    message: java.lang.String,
    args: js.Any*
  ): scala.Unit = js.native
  def pause(): scala.Unit = js.native
  def resume(): scala.Unit = js.native
  def silly(prefix: java.lang.String, message: java.lang.String, args: js.Any*): scala.Unit = js.native
  def verbose(prefix: java.lang.String, message: java.lang.String, args: js.Any*): scala.Unit = js.native
  def warn(prefix: java.lang.String, message: java.lang.String, args: js.Any*): scala.Unit = js.native
}

