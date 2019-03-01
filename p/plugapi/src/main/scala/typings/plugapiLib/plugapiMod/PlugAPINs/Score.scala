package typings
package plugapiLib.plugapiMod.PlugAPINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Score extends js.Object {
  var grabs: scala.Double
  var listeners: scala.Double
  var negative: scala.Double
  var positive: scala.Double
  var skipped: scala.Double
}

object Score {
  @scala.inline
  def apply(
    grabs: scala.Double,
    listeners: scala.Double,
    negative: scala.Double,
    positive: scala.Double,
    skipped: scala.Double
  ): Score = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("grabs")(grabs)
    __obj.updateDynamic("listeners")(listeners)
    __obj.updateDynamic("negative")(negative)
    __obj.updateDynamic("positive")(positive)
    __obj.updateDynamic("skipped")(skipped)
    __obj.asInstanceOf[Score]
  }
}

