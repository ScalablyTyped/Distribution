package typings.popmotionPose

import typings.popmotionPose.popmotionPoseStrings.tween
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTween extends js.Object {
  var `type`: tween
}

object AnonTween {
  @scala.inline
  def apply(`type`: tween): AnonTween = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonTween]
  }
}

