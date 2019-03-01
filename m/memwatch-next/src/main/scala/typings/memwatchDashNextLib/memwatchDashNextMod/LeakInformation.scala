package typings
package memwatchDashNextLib.memwatchDashNextMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LeakInformation extends js.Object {
  /**
    * End date.
    * @type {Date}
    */
  var end: stdLib.Date
  /**
    * Growth.
    * @type {number}
    */
  var growth: scala.Double
  /**
    * Reason leak.
    * @type {string}
    */
  var reason: java.lang.String
  /**
    * Start date.
    * @type {Date}
    */
  var start: stdLib.Date
}

object LeakInformation {
  @scala.inline
  def apply(end: stdLib.Date, growth: scala.Double, reason: java.lang.String, start: stdLib.Date): LeakInformation = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("end")(end)
    __obj.updateDynamic("growth")(growth)
    __obj.updateDynamic("reason")(reason)
    __obj.updateDynamic("start")(start)
    __obj.asInstanceOf[LeakInformation]
  }
}

