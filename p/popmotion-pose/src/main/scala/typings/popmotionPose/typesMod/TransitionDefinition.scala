package typings.popmotionPose.typesMod

import org.scalablytyped.runtime.StringDictionary
import typings.popmotion.keyframesTypesMod.Values
import typings.popmotionEasing.mod.Easing
import typings.popmotionPose.popmotionPoseBooleans.`false`
import typings.popmotionPose.popmotionPoseStrings.anticipate
import typings.popmotionPose.popmotionPoseStrings.backIn
import typings.popmotionPose.popmotionPoseStrings.backInOut
import typings.popmotionPose.popmotionPoseStrings.backOut
import typings.popmotionPose.popmotionPoseStrings.circIn
import typings.popmotionPose.popmotionPoseStrings.circInOut
import typings.popmotionPose.popmotionPoseStrings.circOut
import typings.popmotionPose.popmotionPoseStrings.decay
import typings.popmotionPose.popmotionPoseStrings.easeIn
import typings.popmotionPose.popmotionPoseStrings.easeInOut
import typings.popmotionPose.popmotionPoseStrings.easeOut
import typings.popmotionPose.popmotionPoseStrings.keyframes
import typings.popmotionPose.popmotionPoseStrings.linear
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
    delay: js.UndefOr[Double] = js.undefined,
    from: js.UndefOr[Double] = js.undefined,
    max: js.UndefOr[Double] = js.undefined,
    min: js.UndefOr[Double] = js.undefined,
    modifyTarget: /* v */ Double => Double = null,
    power: js.UndefOr[Double] = js.undefined,
    restDelta: js.UndefOr[Double] = js.undefined,
    round: js.UndefOr[Boolean] = js.undefined,
    timeConstant: js.UndefOr[Double] = js.undefined,
    velocity: js.UndefOr[Double] = js.undefined
  ): TransitionDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(delay)) __obj.updateDynamic("delay")(delay.get.asInstanceOf[js.Any])
    if (!js.isUndefined(from)) __obj.updateDynamic("from")(from.get.asInstanceOf[js.Any])
    if (!js.isUndefined(max)) __obj.updateDynamic("max")(max.get.asInstanceOf[js.Any])
    if (!js.isUndefined(min)) __obj.updateDynamic("min")(min.get.asInstanceOf[js.Any])
    if (modifyTarget != null) __obj.updateDynamic("modifyTarget")(js.Any.fromFunction1(modifyTarget))
    if (!js.isUndefined(power)) __obj.updateDynamic("power")(power.get.asInstanceOf[js.Any])
    if (!js.isUndefined(restDelta)) __obj.updateDynamic("restDelta")(restDelta.get.asInstanceOf[js.Any])
    if (!js.isUndefined(round)) __obj.updateDynamic("round")(round.get.asInstanceOf[js.Any])
    if (!js.isUndefined(timeConstant)) __obj.updateDynamic("timeConstant")(timeConstant.get.asInstanceOf[js.Any])
    if (!js.isUndefined(velocity)) __obj.updateDynamic("velocity")(velocity.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransitionDefinition]
  }
  @scala.inline
  def PhysicsDefinition(
    `type`: physics,
    acceleration: js.UndefOr[Double] = js.undefined,
    delay: js.UndefOr[Double] = js.undefined,
    friction: js.UndefOr[Double] = js.undefined,
    from: js.UndefOr[Double] = js.undefined,
    max: js.UndefOr[Double] = js.undefined,
    min: js.UndefOr[Double] = js.undefined,
    restSpeed: Double | `false` = null,
    round: js.UndefOr[Boolean] = js.undefined,
    springStrength: js.UndefOr[Double] = js.undefined,
    to: js.UndefOr[Double] = js.undefined,
    velocity: js.UndefOr[Double] = js.undefined
  ): TransitionDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(acceleration)) __obj.updateDynamic("acceleration")(acceleration.get.asInstanceOf[js.Any])
    if (!js.isUndefined(delay)) __obj.updateDynamic("delay")(delay.get.asInstanceOf[js.Any])
    if (!js.isUndefined(friction)) __obj.updateDynamic("friction")(friction.get.asInstanceOf[js.Any])
    if (!js.isUndefined(from)) __obj.updateDynamic("from")(from.get.asInstanceOf[js.Any])
    if (!js.isUndefined(max)) __obj.updateDynamic("max")(max.get.asInstanceOf[js.Any])
    if (!js.isUndefined(min)) __obj.updateDynamic("min")(min.get.asInstanceOf[js.Any])
    if (restSpeed != null) __obj.updateDynamic("restSpeed")(restSpeed.asInstanceOf[js.Any])
    if (!js.isUndefined(round)) __obj.updateDynamic("round")(round.get.asInstanceOf[js.Any])
    if (!js.isUndefined(springStrength)) __obj.updateDynamic("springStrength")(springStrength.get.asInstanceOf[js.Any])
    if (!js.isUndefined(to)) __obj.updateDynamic("to")(to.get.asInstanceOf[js.Any])
    if (!js.isUndefined(velocity)) __obj.updateDynamic("velocity")(velocity.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransitionDefinition]
  }
  @scala.inline
  def KeyframesDefinition(
    `type`: keyframes,
    values: Values,
    delay: js.UndefOr[Double] = js.undefined,
    duration: js.UndefOr[Double] = js.undefined,
    ease: Easing | js.Array[Easing] | StringDictionary[Easing] = null,
    easings: js.Array[Easing] = null,
    elapsed: js.UndefOr[Double] = js.undefined,
    flip: js.UndefOr[Double] = js.undefined,
    loop: js.UndefOr[Double] = js.undefined,
    max: js.UndefOr[Double] = js.undefined,
    min: js.UndefOr[Double] = js.undefined,
    round: js.UndefOr[Boolean] = js.undefined,
    times: js.Array[Double] = null,
    yoyo: js.UndefOr[Double] = js.undefined
  ): TransitionDefinition = {
    val __obj = js.Dynamic.literal(values = values.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(delay)) __obj.updateDynamic("delay")(delay.get.asInstanceOf[js.Any])
    if (!js.isUndefined(duration)) __obj.updateDynamic("duration")(duration.get.asInstanceOf[js.Any])
    if (ease != null) __obj.updateDynamic("ease")(ease.asInstanceOf[js.Any])
    if (easings != null) __obj.updateDynamic("easings")(easings.asInstanceOf[js.Any])
    if (!js.isUndefined(elapsed)) __obj.updateDynamic("elapsed")(elapsed.get.asInstanceOf[js.Any])
    if (!js.isUndefined(flip)) __obj.updateDynamic("flip")(flip.get.asInstanceOf[js.Any])
    if (!js.isUndefined(loop)) __obj.updateDynamic("loop")(loop.get.asInstanceOf[js.Any])
    if (!js.isUndefined(max)) __obj.updateDynamic("max")(max.get.asInstanceOf[js.Any])
    if (!js.isUndefined(min)) __obj.updateDynamic("min")(min.get.asInstanceOf[js.Any])
    if (!js.isUndefined(round)) __obj.updateDynamic("round")(round.get.asInstanceOf[js.Any])
    if (times != null) __obj.updateDynamic("times")(times.asInstanceOf[js.Any])
    if (!js.isUndefined(yoyo)) __obj.updateDynamic("yoyo")(yoyo.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransitionDefinition]
  }
  @scala.inline
  def TweenDefinition(
    `type`: tween,
    delay: js.UndefOr[Double] = js.undefined,
    duration: js.UndefOr[Double] = js.undefined,
    ease: Easing | js.Array[Easing] | StringDictionary[Easing] | linear | easeIn | easeOut | easeInOut | circIn | circOut | circInOut | backIn | backOut | backInOut | anticipate | CubicBezierArgs = null,
    elapsed: js.UndefOr[Double] = js.undefined,
    flip: js.UndefOr[Double] = js.undefined,
    flipCount: js.UndefOr[Double] = js.undefined,
    from: typings.popmotion.valueMod.Value = null,
    loop: js.UndefOr[Double] = js.undefined,
    loopCount: js.UndefOr[Double] = js.undefined,
    max: js.UndefOr[Double] = js.undefined,
    min: js.UndefOr[Double] = js.undefined,
    playDirection: js.UndefOr[Double] = js.undefined,
    repeatDelay: js.UndefOr[Double] = js.undefined,
    round: js.UndefOr[Boolean] = js.undefined,
    to: typings.popmotion.valueMod.Value = null,
    yoyo: js.UndefOr[Double] = js.undefined,
    yoyoCount: js.UndefOr[Double] = js.undefined
  ): TransitionDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(delay)) __obj.updateDynamic("delay")(delay.get.asInstanceOf[js.Any])
    if (!js.isUndefined(duration)) __obj.updateDynamic("duration")(duration.get.asInstanceOf[js.Any])
    if (ease != null) __obj.updateDynamic("ease")(ease.asInstanceOf[js.Any])
    if (!js.isUndefined(elapsed)) __obj.updateDynamic("elapsed")(elapsed.get.asInstanceOf[js.Any])
    if (!js.isUndefined(flip)) __obj.updateDynamic("flip")(flip.get.asInstanceOf[js.Any])
    if (!js.isUndefined(flipCount)) __obj.updateDynamic("flipCount")(flipCount.get.asInstanceOf[js.Any])
    if (from != null) __obj.updateDynamic("from")(from.asInstanceOf[js.Any])
    if (!js.isUndefined(loop)) __obj.updateDynamic("loop")(loop.get.asInstanceOf[js.Any])
    if (!js.isUndefined(loopCount)) __obj.updateDynamic("loopCount")(loopCount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(max)) __obj.updateDynamic("max")(max.get.asInstanceOf[js.Any])
    if (!js.isUndefined(min)) __obj.updateDynamic("min")(min.get.asInstanceOf[js.Any])
    if (!js.isUndefined(playDirection)) __obj.updateDynamic("playDirection")(playDirection.get.asInstanceOf[js.Any])
    if (!js.isUndefined(repeatDelay)) __obj.updateDynamic("repeatDelay")(repeatDelay.get.asInstanceOf[js.Any])
    if (!js.isUndefined(round)) __obj.updateDynamic("round")(round.get.asInstanceOf[js.Any])
    if (to != null) __obj.updateDynamic("to")(to.asInstanceOf[js.Any])
    if (!js.isUndefined(yoyo)) __obj.updateDynamic("yoyo")(yoyo.get.asInstanceOf[js.Any])
    if (!js.isUndefined(yoyoCount)) __obj.updateDynamic("yoyoCount")(yoyoCount.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransitionDefinition]
  }
  @scala.inline
  def SpringDefinition(
    `type`: spring,
    damping: js.UndefOr[Double] = js.undefined,
    delay: js.UndefOr[Double] = js.undefined,
    from: js.UndefOr[Double] = js.undefined,
    mass: js.UndefOr[Double] = js.undefined,
    max: js.UndefOr[Double] = js.undefined,
    min: js.UndefOr[Double] = js.undefined,
    restDelta: js.UndefOr[Double] = js.undefined,
    restSpeed: js.UndefOr[Double] = js.undefined,
    round: js.UndefOr[Boolean] = js.undefined,
    stiffness: js.UndefOr[Double] = js.undefined,
    to: js.UndefOr[Double] = js.undefined,
    velocity: js.UndefOr[Double] = js.undefined
  ): TransitionDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(damping)) __obj.updateDynamic("damping")(damping.get.asInstanceOf[js.Any])
    if (!js.isUndefined(delay)) __obj.updateDynamic("delay")(delay.get.asInstanceOf[js.Any])
    if (!js.isUndefined(from)) __obj.updateDynamic("from")(from.get.asInstanceOf[js.Any])
    if (!js.isUndefined(mass)) __obj.updateDynamic("mass")(mass.get.asInstanceOf[js.Any])
    if (!js.isUndefined(max)) __obj.updateDynamic("max")(max.get.asInstanceOf[js.Any])
    if (!js.isUndefined(min)) __obj.updateDynamic("min")(min.get.asInstanceOf[js.Any])
    if (!js.isUndefined(restDelta)) __obj.updateDynamic("restDelta")(restDelta.get.asInstanceOf[js.Any])
    if (!js.isUndefined(restSpeed)) __obj.updateDynamic("restSpeed")(restSpeed.get.asInstanceOf[js.Any])
    if (!js.isUndefined(round)) __obj.updateDynamic("round")(round.get.asInstanceOf[js.Any])
    if (!js.isUndefined(stiffness)) __obj.updateDynamic("stiffness")(stiffness.get.asInstanceOf[js.Any])
    if (!js.isUndefined(to)) __obj.updateDynamic("to")(to.get.asInstanceOf[js.Any])
    if (!js.isUndefined(velocity)) __obj.updateDynamic("velocity")(velocity.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransitionDefinition]
  }
}

