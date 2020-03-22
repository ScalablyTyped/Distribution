package typings.momentDurationFormat.mod.momentAugmentingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {[ template in moment-duration-format.moment-duration-format.moment.DurationTemplate ]: string} */
trait DurationTimeDef extends js.Object {
  var HM: String
  var HMS: String
  var MS: String
}

object DurationTimeDef {
  @scala.inline
  def apply(HM: String, HMS: String, MS: String): DurationTimeDef = {
    val __obj = js.Dynamic.literal(HM = HM.asInstanceOf[js.Any], HMS = HMS.asInstanceOf[js.Any], MS = MS.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DurationTimeDef]
  }
}

