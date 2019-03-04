package typings
package momentDashDurationDashFormatLib.momentDashDurationDashFormatMod.momentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DurationLabelTypeDef extends js.Object {
  var string: java.lang.String
  var `type`: DurationLabelType
}

object DurationLabelTypeDef {
  @scala.inline
  def apply(string: java.lang.String, `type`: DurationLabelType): DurationLabelTypeDef = {
    val __obj = js.Dynamic.literal(string = string)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[DurationLabelTypeDef]
  }
}

