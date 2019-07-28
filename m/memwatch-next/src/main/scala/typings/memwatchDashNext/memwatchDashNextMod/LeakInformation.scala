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
    val __obj = js.Dynamic.literal(end = end, growth = growth, reason = reason, start = start)
  
    __obj.asInstanceOf[LeakInformation]
  }
}

