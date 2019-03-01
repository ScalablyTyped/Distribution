package typings
package atOracleOraclejetLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AnimationDuration extends js.Object {
  var animationDuration: scala.Double
  var hoverBehaviorDelay: scala.Double
  var linkDefaults: Anon_Arrow
  var nodeDefaults: Anon_Icon
  var promotedLink: Anon_ArrowArrowConcave
}

object Anon_AnimationDuration {
  @scala.inline
  def apply(
    animationDuration: scala.Double,
    hoverBehaviorDelay: scala.Double,
    linkDefaults: Anon_Arrow,
    nodeDefaults: Anon_Icon,
    promotedLink: Anon_ArrowArrowConcave
  ): Anon_AnimationDuration = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("animationDuration")(animationDuration)
    __obj.updateDynamic("hoverBehaviorDelay")(hoverBehaviorDelay)
    __obj.updateDynamic("linkDefaults")(linkDefaults)
    __obj.updateDynamic("nodeDefaults")(nodeDefaults)
    __obj.updateDynamic("promotedLink")(promotedLink)
    __obj.asInstanceOf[Anon_AnimationDuration]
  }
}

