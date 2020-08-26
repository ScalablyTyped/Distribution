package typings.popmotionPose.typesMod

import typings.popmotion.keyframesTypesMod.Values
import typings.popmotionPose.popmotionPoseStrings.decay
import typings.popmotionPose.popmotionPoseStrings.keyframes
import typings.popmotionPose.popmotionPoseStrings.physics
import typings.popmotionPose.popmotionPoseStrings.spring
import typings.popmotionPose.popmotionPoseStrings.tween
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.popmotionPose.typesMod.TweenDefinition
  - typings.popmotionPose.typesMod.PhysicsDefinition
  - typings.popmotionPose.typesMod.SpringDefinition
  - typings.popmotionPose.typesMod.DecayDefinition
  - typings.popmotionPose.typesMod.KeyframesDefinition
*/
trait TransitionDefinition extends js.Object

object TransitionDefinition {
  @scala.inline
  def DecayDefinition(`type`: decay): TransitionDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransitionDefinition]
  }
  @scala.inline
  def PhysicsDefinition(`type`: physics): TransitionDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransitionDefinition]
  }
  @scala.inline
  def KeyframesDefinition(`type`: keyframes, values: Values): TransitionDefinition = {
    val __obj = js.Dynamic.literal(values = values.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransitionDefinition]
  }
  @scala.inline
  def TweenDefinition(`type`: tween): TransitionDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransitionDefinition]
  }
  @scala.inline
  def SpringDefinition(`type`: spring): TransitionDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransitionDefinition]
  }
}

