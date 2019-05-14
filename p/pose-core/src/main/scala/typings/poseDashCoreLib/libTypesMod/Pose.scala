package typings
package poseDashCoreLib.libTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Pose[A, TD]
  extends /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var afterChildren: js.UndefOr[scala.Boolean | BooleanPropFactory] = js.undefined
  var applyAtEnd: js.UndefOr[ApplyMap] = js.undefined
  var applyAtStart: js.UndefOr[ApplyMap] = js.undefined
  var beforeChildren: js.UndefOr[scala.Boolean | BooleanPropFactory] = js.undefined
  var delay: js.UndefOr[scala.Double | NumberPropFactory] = js.undefined
  var delayChildren: js.UndefOr[scala.Double | NumberPropFactory] = js.undefined
  var preTransform: js.UndefOr[js.Function0[_]] = js.undefined
  var preTransition: js.UndefOr[js.Function1[/* props */ Props, _]] = js.undefined
  var staggerChildren: js.UndefOr[scala.Double | NumberPropFactory] = js.undefined
  var staggerDirection: js.UndefOr[
    poseDashCoreLib.poseDashCoreLibNumbers.`1` | poseDashCoreLib.poseDashCoreLibNumbers.`-1` | StaggerDirectionPropFactory
  ] = js.undefined
  var transition: js.UndefOr[(TransitionMap[A, TD]) | (TransitionMapFactory[A, TD])] = js.undefined
}

object Pose {
  @scala.inline
  def apply[A, TD](
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    afterChildren: scala.Boolean | BooleanPropFactory = null,
    applyAtEnd: ApplyMap = null,
    applyAtStart: ApplyMap = null,
    beforeChildren: scala.Boolean | BooleanPropFactory = null,
    delay: scala.Double | NumberPropFactory = null,
    delayChildren: scala.Double | NumberPropFactory = null,
    preTransform: () => _ = null,
    preTransition: /* props */ Props => _ = null,
    staggerChildren: scala.Double | NumberPropFactory = null,
    staggerDirection: poseDashCoreLib.poseDashCoreLibNumbers.`1` | poseDashCoreLib.poseDashCoreLibNumbers.`-1` | StaggerDirectionPropFactory = null,
    transition: (TransitionMap[A, TD]) | (TransitionMapFactory[A, TD]) = null
  ): Pose[A, TD] = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (afterChildren != null) __obj.updateDynamic("afterChildren")(afterChildren.asInstanceOf[js.Any])
    if (applyAtEnd != null) __obj.updateDynamic("applyAtEnd")(applyAtEnd)
    if (applyAtStart != null) __obj.updateDynamic("applyAtStart")(applyAtStart)
    if (beforeChildren != null) __obj.updateDynamic("beforeChildren")(beforeChildren.asInstanceOf[js.Any])
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (delayChildren != null) __obj.updateDynamic("delayChildren")(delayChildren.asInstanceOf[js.Any])
    if (preTransform != null) __obj.updateDynamic("preTransform")(js.Any.fromFunction0(preTransform))
    if (preTransition != null) __obj.updateDynamic("preTransition")(js.Any.fromFunction1(preTransition))
    if (staggerChildren != null) __obj.updateDynamic("staggerChildren")(staggerChildren.asInstanceOf[js.Any])
    if (staggerDirection != null) __obj.updateDynamic("staggerDirection")(staggerDirection.asInstanceOf[js.Any])
    if (transition != null) __obj.updateDynamic("transition")(transition.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pose[A, TD]]
  }
}

