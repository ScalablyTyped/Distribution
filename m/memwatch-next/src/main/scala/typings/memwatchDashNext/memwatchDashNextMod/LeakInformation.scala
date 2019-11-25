package typings.memwatchDashNext.memwatchDashNextMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LeakInformation extends js.Object {
  /**
    * End date.
    * @type {Date}
    */
  var end: Date
  /**
    * Growth.
    * @type {number}
    */
  var growth: Double
  /**
    * Reason leak.
    * @type {string}
    */
  var reason: String
  /**
    * Start date.
    * @type {Date}
    */
  var start: Date
}

object LeakInformation {
  @scala.inline
  def apply(end: Date, growth: Double, reason: String, start: Date): LeakInformation = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], growth = growth.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[LeakInformation]
  }
}

