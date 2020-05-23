package typings.mobxReactLite.reactionCleanupTrackingMod

import typings.mobx.mod.Reaction_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IReactionTracking extends js.Object {
  /**
    * Whether the observables that the component is tracking changed between
    * the first render and the first useEffect.
    */
  var changedBeforeMount: js.UndefOr[Boolean] = js.undefined
  /**
    * The time (in ticks) at which point we should dispose of the reaction
    * if this component hasn't yet been fully mounted.
    */
  var cleanAt: Double
  /**
    * Whether the component has yet completed mounting (for us, whether
    * its useEffect has run)
    */
  var mounted: js.UndefOr[Boolean] = js.undefined
  /** The Reaction created during first render, which may be leaked */
  var reaction: Reaction_
}

object IReactionTracking {
  @scala.inline
  def apply(
    cleanAt: Double,
    reaction: Reaction_,
    changedBeforeMount: js.UndefOr[Boolean] = js.undefined,
    mounted: js.UndefOr[Boolean] = js.undefined
  ): IReactionTracking = {
    val __obj = js.Dynamic.literal(cleanAt = cleanAt.asInstanceOf[js.Any], reaction = reaction.asInstanceOf[js.Any])
    if (!js.isUndefined(changedBeforeMount)) __obj.updateDynamic("changedBeforeMount")(changedBeforeMount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(mounted)) __obj.updateDynamic("mounted")(mounted.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IReactionTracking]
  }
}

