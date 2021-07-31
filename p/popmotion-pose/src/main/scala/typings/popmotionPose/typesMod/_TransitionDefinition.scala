package typings.popmotionPose.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait _TransitionDefinition extends StObject
object _TransitionDefinition {
  
  @scala.inline
  def DecayDefinition(ease: Unit): typings.popmotionPose.typesMod.DecayDefinition = {
    val __obj = js.Dynamic.literal(ease = ease.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("decay")
    __obj.asInstanceOf[typings.popmotionPose.typesMod.DecayDefinition]
  }
  
  @scala.inline
  def KeyframesDefinition(): typings.popmotionPose.typesMod.KeyframesDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("keyframes")
    __obj.asInstanceOf[typings.popmotionPose.typesMod.KeyframesDefinition]
  }
  
  @scala.inline
  def PhysicsDefinition(ease: Unit): typings.popmotionPose.typesMod.PhysicsDefinition = {
    val __obj = js.Dynamic.literal(ease = ease.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("physics")
    __obj.asInstanceOf[typings.popmotionPose.typesMod.PhysicsDefinition]
  }
  
  @scala.inline
  def SpringDefinition(ease: Unit): typings.popmotionPose.typesMod.SpringDefinition = {
    val __obj = js.Dynamic.literal(ease = ease.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("spring")
    __obj.asInstanceOf[typings.popmotionPose.typesMod.SpringDefinition]
  }
}
