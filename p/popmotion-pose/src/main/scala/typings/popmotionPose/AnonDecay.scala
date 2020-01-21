package typings.popmotionPose

import typings.popmotionPose.popmotionPoseStrings.decay
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDecay extends js.Object {
  var `type`: decay
}

object AnonDecay {
  @scala.inline
  def apply(`type`: decay): AnonDecay = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDecay]
  }
}

