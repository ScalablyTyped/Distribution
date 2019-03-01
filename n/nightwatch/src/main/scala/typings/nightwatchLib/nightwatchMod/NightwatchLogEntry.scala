package typings
package nightwatchLib.nightwatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NightwatchLogEntry extends js.Object {
  /**
    * Severity level
    */
  var level: java.lang.String
  /**
    * The log entry message.
    */
  var message: java.lang.String
  /**
    * The time stamp of log entry in seconds.
    */
  var timestamp: scala.Double
}

object NightwatchLogEntry {
  @scala.inline
  def apply(level: java.lang.String, message: java.lang.String, timestamp: scala.Double): NightwatchLogEntry = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("level")(level)
    __obj.updateDynamic("message")(message)
    __obj.updateDynamic("timestamp")(timestamp)
    __obj.asInstanceOf[NightwatchLogEntry]
  }
}

