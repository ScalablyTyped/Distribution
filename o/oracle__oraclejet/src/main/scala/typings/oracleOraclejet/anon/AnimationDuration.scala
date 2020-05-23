package typings.oracleOraclejet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnimationDuration extends js.Object {
  var animationDuration: Double
  var hoverBehaviorDelay: Double
  var linkDefaults: EndConnectorType
  var nodeDefaults: Icon
  var promotedLink: StartConnectorType
}

object AnimationDuration {
  @scala.inline
  def apply(
    animationDuration: Double,
    hoverBehaviorDelay: Double,
    linkDefaults: EndConnectorType,
    nodeDefaults: Icon,
    promotedLink: StartConnectorType
  ): AnimationDuration = {
    val __obj = js.Dynamic.literal(animationDuration = animationDuration.asInstanceOf[js.Any], hoverBehaviorDelay = hoverBehaviorDelay.asInstanceOf[js.Any], linkDefaults = linkDefaults.asInstanceOf[js.Any], nodeDefaults = nodeDefaults.asInstanceOf[js.Any], promotedLink = promotedLink.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimationDuration]
  }
}

