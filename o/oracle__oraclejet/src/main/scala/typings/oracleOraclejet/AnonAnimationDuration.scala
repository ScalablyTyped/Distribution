package typings.oracleOraclejet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAnimationDuration extends js.Object {
  var animationDuration: Double
  var hoverBehaviorDelay: Double
  var linkDefaults: AnonEndConnectorType
  var nodeDefaults: AnonIcon
  var promotedLink: AnonStartConnectorType
}

object AnonAnimationDuration {
  @scala.inline
  def apply(
    animationDuration: Double,
    hoverBehaviorDelay: Double,
    linkDefaults: AnonEndConnectorType,
    nodeDefaults: AnonIcon,
    promotedLink: AnonStartConnectorType
  ): AnonAnimationDuration = {
    val __obj = js.Dynamic.literal(animationDuration = animationDuration.asInstanceOf[js.Any], hoverBehaviorDelay = hoverBehaviorDelay.asInstanceOf[js.Any], linkDefaults = linkDefaults.asInstanceOf[js.Any], nodeDefaults = nodeDefaults.asInstanceOf[js.Any], promotedLink = promotedLink.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAnimationDuration]
  }
}

