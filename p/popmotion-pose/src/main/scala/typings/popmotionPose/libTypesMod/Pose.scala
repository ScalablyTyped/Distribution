package typings.popmotionPose.libTypesMod

import org.scalablytyped.runtime.StringDictionary
import typings.popmotionPose.popmotionPoseNumbers.`-1`
import typings.popmotionPose.popmotionPoseNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Pose[A, TD]
  extends /* key */ StringDictionary[js.Any] {
  var afterChildren: js.UndefOr[Boolean | BooleanPropFactory] = js.native
  var applyAtEnd: js.UndefOr[ApplyMap] = js.native
  var applyAtStart: js.UndefOr[ApplyMap] = js.native
  var beforeChildren: js.UndefOr[Boolean | BooleanPropFactory] = js.native
  var delay: js.UndefOr[Double | NumberPropFactory] = js.native
  var delayChildren: js.UndefOr[Double | NumberPropFactory] = js.native
  var preTransform: js.UndefOr[js.Function0[_]] = js.native
  var preTransition: js.UndefOr[js.Function1[/* props */ Props, _]] = js.native
  var staggerChildren: js.UndefOr[Double | NumberPropFactory] = js.native
  var staggerDirection: js.UndefOr[`1` | `-1` | StaggerDirectionPropFactory] = js.native
  var transition: js.UndefOr[(TransitionMap[A, TD]) | (TransitionMapFactory[A, TD])] = js.native
}

object Pose {
  @scala.inline
  def apply[A, TD](): Pose[A, TD] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Pose[A, TD]]
  }
  @scala.inline
  implicit class PoseOps[Self <: Pose[_, _], A, TD] (val x: Self with (Pose[A, TD])) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAfterChildrenFunction1(value: /* props */ Props => Boolean): Self = this.set("afterChildren", js.Any.fromFunction1(value))
    @scala.inline
    def setAfterChildren(value: Boolean | BooleanPropFactory): Self = this.set("afterChildren", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAfterChildren: Self = this.set("afterChildren", js.undefined)
    @scala.inline
    def setApplyAtEnd(value: ApplyMap): Self = this.set("applyAtEnd", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApplyAtEnd: Self = this.set("applyAtEnd", js.undefined)
    @scala.inline
    def setApplyAtStart(value: ApplyMap): Self = this.set("applyAtStart", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApplyAtStart: Self = this.set("applyAtStart", js.undefined)
    @scala.inline
    def setBeforeChildrenFunction1(value: /* props */ Props => Boolean): Self = this.set("beforeChildren", js.Any.fromFunction1(value))
    @scala.inline
    def setBeforeChildren(value: Boolean | BooleanPropFactory): Self = this.set("beforeChildren", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBeforeChildren: Self = this.set("beforeChildren", js.undefined)
    @scala.inline
    def setDelayFunction1(value: /* props */ Props => Double): Self = this.set("delay", js.Any.fromFunction1(value))
    @scala.inline
    def setDelay(value: Double | NumberPropFactory): Self = this.set("delay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDelay: Self = this.set("delay", js.undefined)
    @scala.inline
    def setDelayChildrenFunction1(value: /* props */ Props => Double): Self = this.set("delayChildren", js.Any.fromFunction1(value))
    @scala.inline
    def setDelayChildren(value: Double | NumberPropFactory): Self = this.set("delayChildren", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDelayChildren: Self = this.set("delayChildren", js.undefined)
    @scala.inline
    def setPreTransform(value: () => _): Self = this.set("preTransform", js.Any.fromFunction0(value))
    @scala.inline
    def deletePreTransform: Self = this.set("preTransform", js.undefined)
    @scala.inline
    def setPreTransition(value: /* props */ Props => _): Self = this.set("preTransition", js.Any.fromFunction1(value))
    @scala.inline
    def deletePreTransition: Self = this.set("preTransition", js.undefined)
    @scala.inline
    def setStaggerChildrenFunction1(value: /* props */ Props => Double): Self = this.set("staggerChildren", js.Any.fromFunction1(value))
    @scala.inline
    def setStaggerChildren(value: Double | NumberPropFactory): Self = this.set("staggerChildren", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStaggerChildren: Self = this.set("staggerChildren", js.undefined)
    @scala.inline
    def setStaggerDirectionFunction1(value: /* props */ Props => `1` | `-1`): Self = this.set("staggerDirection", js.Any.fromFunction1(value))
    @scala.inline
    def setStaggerDirection(value: `1` | `-1` | StaggerDirectionPropFactory): Self = this.set("staggerDirection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStaggerDirection: Self = this.set("staggerDirection", js.undefined)
    @scala.inline
    def setTransitionFunction1(value: /* props */ Props => TransitionMap[A, TD]): Self = this.set("transition", js.Any.fromFunction1(value))
    @scala.inline
    def setTransition(value: (TransitionMap[A, TD]) | (TransitionMapFactory[A, TD])): Self = this.set("transition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransition: Self = this.set("transition", js.undefined)
  }
  
}

