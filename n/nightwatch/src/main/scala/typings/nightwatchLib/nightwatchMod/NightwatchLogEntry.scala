package typings
package nightwatchLib.nightwatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NightwatchLogEntry extends js.Object {
  /**
    * Severity level
    */
  var level: nightwatchLib.nightwatchLibStrings.SEVERE | nightwatchLib.nightwatchLibStrings.WARNING | nightwatchLib.nightwatchLibStrings.INFO | nightwatchLib.nightwatchLibStrings.DEBUG
  /**
    * The log entry message.
    */
  var message: java.lang.String
  var source: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The time stamp of log entry in seconds.
    */
  var timestamp: scala.Double
}

object NightwatchLogEntry {
  @scala.inline
  def apply(
    level: nightwatchLib.nightwatchLibStrings.SEVERE | nightwatchLib.nightwatchLibStrings.WARNING | nightwatchLib.nightwatchLibStrings.INFO | nightwatchLib.nightwatchLibStrings.DEBUG,
    message: java.lang.String,
    timestamp: scala.Double,
    source: java.lang.String = null
  ): NightwatchLogEntry = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any], message = message, timestamp = timestamp)
    if (source != null) __obj.updateDynamic("source")(source)
    __obj.asInstanceOf[NightwatchLogEntry]
  }
}

