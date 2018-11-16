package typings
package momentDashRangeLib.momentDashRangeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("moment-range", JSImport.Namespace)
@js.native
object momentDashRangeModMembers extends js.Object {
  def extendMoment(
    momentInstance: js.Function3[
      /* inp */ momentLib.momentMod.momentNs.MomentInput, 
      /* format */ momentLib.momentMod.momentNs.MomentFormatSpecification, 
      /* strict */ scala.Boolean, 
      momentLib.momentMod.momentNs.Moment
    ]
  ): MomentRangeExtends with momentLib.momentMod.momentNs.Moment = js.native
  def extendMoment(momentInstance: momentLib.momentMod.momentNs.Moment): MomentRangeExtends with momentLib.momentMod.momentNs.Moment = js.native
}

