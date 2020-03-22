package typings.popmotionPose.typesMod

import org.scalablytyped.runtime.StringDictionary
import typings.popmotion.keyframesTypesMod.Values
import typings.popmotionEasing.mod.Easing
import typings.popmotionPose.popmotionPoseBooleans.`false`
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
  def DecayDefinition(
    `type`: decay,
    delay: Int | Double = null,
    ease: js.UndefOr[scala.Nothing] = js.undefined,
    from: Int | Double = null,
    max: Int | Double = null,
    min: Int | Double = null,
    modifyTarget: /* v */ Double => Double = null,
    power: Int | Double = null,
    restDelta: Int | Double = null,
    round: js.UndefOr[Boolean] = js.undefined,
    timeConstant: Int | Double = null,
    velocity: Int | Double = null
  ): TransitionDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (!js.isUndefined(ease)) __obj.updateDynamic("ease")(ease.asInstanceOf[js.Any])
    if (from != null) __obj.updateDynamic("from")(from.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (modifyTarget != null) __obj.updateDynamic("modifyTarget")(js.Any.fromFunction1(modifyTarget))
    if (power != null) __obj.updateDynamic("power")(power.asInstanceOf[js.Any])
    if (restDelta != null) __obj.updateDynamic("restDelta")(restDelta.asInstanceOf[js.Any])
    if (!js.isUndefined(round)) __obj.updateDynamic("round")(round.asInstanceOf[js.Any])
    if (timeConstant != null) __obj.updateDynamic("timeConstant")(timeConstant.asInstanceOf[js.Any])
    if (velocity != null) __obj.updateDynamic("velocity")(velocity.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransitionDefinition]
  }
  @scala.inline
  def PhysicsDefinition(
    `type`: physics,
    acceleration: Int | Double = null,
    delay: Int | Double = null,
    ease: js.UndefOr[scala.Nothing] = js.undefined,
    friction: Int | Double = null,
    from: Int | Double = null,
    max: Int | Double = null,
    min: Int | Double = null,
    restSpeed: Double | `false` = null,
    round: js.UndefOr[Boolean] = js.undefined,
    springStrength: Int | Double = null,
    to: Int | Double = null,
    velocity: Int | Double = null
  ): TransitionDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (acceleration != null) __obj.updateDynamic("acceleration")(acceleration.asInstanceOf[js.Any])
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (!js.isUndefined(ease)) __obj.updateDynamic("ease")(ease.asInstanceOf[js.Any])
    if (friction != null) __obj.updateDynamic("friction")(friction.asInstanceOf[js.Any])
    if (from != null) __obj.updateDynamic("from")(from.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (restSpeed != null) __obj.updateDynamic("restSpeed")(restSpeed.asInstanceOf[js.Any])
    if (!js.isUndefined(round)) __obj.updateDynamic("round")(round.asInstanceOf[js.Any])
    if (springStrength != null) __obj.updateDynamic("springStrength")(springStrength.asInstanceOf[js.Any])
    if (to != null) __obj.updateDynamic("to")(to.asInstanceOf[js.Any])
    if (velocity != null) __obj.updateDynamic("velocity")(velocity.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransitionDefinition]
  }
  @scala.inline
  def KeyframesDefinition(
    `type`: keyframes,
    values: Values,
    delay: Int | Double = null,
    duration: Int | Double = null,
    ease: Easing | js.Array[Easing] | StringDictionary[Easing] = null,
    easings: js.Array[Easing] = null,
    elapsed: Int | Double = null,
    flip: Int | Double = null,
    loop: Int | Double = null,
    max: Int | Double = null,
    min: Int | Double = null,
    round: js.UndefOr[Boolean] = js.undefined,
    times: js.Array[Double] = null,
    yoyo: Int | Double = null
  ): TransitionDefinition = {
    val __obj = js.Dynamic.literal(values = values.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (ease != null) __obj.updateDynamic("ease")(ease.asInstanceOf[js.Any])
    if (easings != null) __obj.updateDynamic("easings")(easings.asInstanceOf[js.Any])
    if (elapsed != null) __obj.updateDynamic("elapsed")(elapsed.asInstanceOf[js.Any])
    if (flip != null) __obj.updateDynamic("flip")(flip.asInstanceOf[js.Any])
    if (loop != null) __obj.updateDynamic("loop")(loop.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (!js.isUndefined(round)) __obj.updateDynamic("round")(round.asInstanceOf[js.Any])
    if (times != null) __obj.updateDynamic("times")(times.asInstanceOf[js.Any])
    if (yoyo != null) __obj.updateDynamic("yoyo")(yoyo.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransitionDefinition]
  }
  @scala.inline
  def TweenDefinition(
    `type`: tween,
    delay: Int | Double = null,
    duration: Int | Double = null,
    ease: Easing | js.Array[Easing] | StringDictionary[Easing] | String | CubicBezierArgs = null,
    elapsed: Int | Double = null,
    flip: Int | Double = null,
    flipCount: Int | Double = null,
    from: typings.popmotion.valueMod.Value = null,
    loop: Int | Double = null,
    loopCount: Int | Double = null,
    max: Int | Double = null,
    min: Int | Double = null,
    playDirection: Int | Double = null,
    repeatDelay: Int | Double = null,
    round: js.UndefOr[Boolean] = js.undefined,
    to: typings.popmotion.valueMod.Value = null,
    yoyo: Int | Double = null,
    yoyoCount: Int | Double = null
  ): TransitionDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (ease != null) __obj.updateDynamic("ease")(ease.asInstanceOf[js.Any])
    if (elapsed != null) __obj.updateDynamic("elapsed")(elapsed.asInstanceOf[js.Any])
    if (flip != null) __obj.updateDynamic("flip")(flip.asInstanceOf[js.Any])
    if (flipCount != null) __obj.updateDynamic("flipCount")(flipCount.asInstanceOf[js.Any])
    if (from != null) __obj.updateDynamic("from")(from.asInstanceOf[js.Any])
    if (loop != null) __obj.updateDynamic("loop")(loop.asInstanceOf[js.Any])
    if (loopCount != null) __obj.updateDynamic("loopCount")(loopCount.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (playDirection != null) __obj.updateDynamic("playDirection")(playDirection.asInstanceOf[js.Any])
    if (repeatDelay != null) __obj.updateDynamic("repeatDelay")(repeatDelay.asInstanceOf[js.Any])
    if (!js.isUndefined(round)) __obj.updateDynamic("round")(round.asInstanceOf[js.Any])
    if (to != null) __obj.updateDynamic("to")(to.asInstanceOf[js.Any])
    if (yoyo != null) __obj.updateDynamic("yoyo")(yoyo.asInstanceOf[js.Any])
    if (yoyoCount != null) __obj.updateDynamic("yoyoCount")(yoyoCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransitionDefinition]
  }
  @scala.inline
  def SpringDefinition(
    `type`: spring,
    damping: Int | Double = null,
    delay: Int | Double = null,
    ease: js.UndefOr[scala.Nothing] = js.undefined,
    from: Int | Double = null,
    mass: Int | Double = null,
    max: Int | Double = null,
    min: Int | Double = null,
    restDelta: Int | Double = null,
    restSpeed: Int | Double = null,
    round: js.UndefOr[Boolean] = js.undefined,
    stiffness: Int | Double = null,
    to: Int | Double = null,
    velocity: Int | Double = null
  ): TransitionDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (damping != null) __obj.updateDynamic("damping")(damping.asInstanceOf[js.Any])
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (!js.isUndefined(ease)) __obj.updateDynamic("ease")(ease.asInstanceOf[js.Any])
    if (from != null) __obj.updateDynamic("from")(from.asInstanceOf[js.Any])
    if (mass != null) __obj.updateDynamic("mass")(mass.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (restDelta != null) __obj.updateDynamic("restDelta")(restDelta.asInstanceOf[js.Any])
    if (restSpeed != null) __obj.updateDynamic("restSpeed")(restSpeed.asInstanceOf[js.Any])
    if (!js.isUndefined(round)) __obj.updateDynamic("round")(round.asInstanceOf[js.Any])
    if (stiffness != null) __obj.updateDynamic("stiffness")(stiffness.asInstanceOf[js.Any])
    if (to != null) __obj.updateDynamic("to")(to.asInstanceOf[js.Any])
    if (velocity != null) __obj.updateDynamic("velocity")(velocity.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransitionDefinition]
  }
}

