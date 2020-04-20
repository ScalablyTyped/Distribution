package typings.momentTimezone.momentTimezoneMod.momentAugmentingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MomentZoneOffset extends js.Object {
  var name: String
  var offset: Double
}

object MomentZoneOffset {
  @scala.inline
  def apply(name: String, offset: Double): MomentZoneOffset = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any])
    __obj.asInstanceOf[MomentZoneOffset]
  }
}

