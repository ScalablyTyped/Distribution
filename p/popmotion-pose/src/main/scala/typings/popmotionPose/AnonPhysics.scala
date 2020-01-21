package typings.popmotionPose

import typings.popmotionPose.popmotionPoseStrings.physics
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPhysics extends js.Object {
  var `type`: physics
}

object AnonPhysics {
  @scala.inline
  def apply(`type`: physics): AnonPhysics = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPhysics]
  }
}

