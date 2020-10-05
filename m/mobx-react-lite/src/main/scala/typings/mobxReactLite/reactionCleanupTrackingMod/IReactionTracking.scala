package typings.mobxReactLite.reactionCleanupTrackingMod

import typings.mobx.mod.Reaction_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IReactionTracking extends js.Object {
  /**
    * Whether the observables that the component is tracking changed between
    * the first render and the first useEffect.
    */
  var changedBeforeMount: js.UndefOr[Boolean] = js.native
  /**
    * The time (in ticks) at which point we should dispose of the reaction
    * if this component hasn't yet been fully mounted.
    */
  var cleanAt: Double = js.native
  /**
    * Whether the component has yet completed mounting (for us, whether
    * its useEffect has run)
    */
  var mounted: js.UndefOr[Boolean] = js.native
  /** The Reaction created during first render, which may be leaked */
  var reaction: Reaction_ = js.native
}

object IReactionTracking {
  @scala.inline
  def apply(cleanAt: Double, reaction: Reaction_): IReactionTracking = {
    val __obj = js.Dynamic.literal(cleanAt = cleanAt.asInstanceOf[js.Any], reaction = reaction.asInstanceOf[js.Any])
    __obj.asInstanceOf[IReactionTracking]
  }
  @scala.inline
  implicit class IReactionTrackingOps[Self <: IReactionTracking] (val x: Self) extends AnyVal {
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
    def setCleanAt(value: Double): Self = this.set("cleanAt", value.asInstanceOf[js.Any])
    @scala.inline
    def setReaction(value: Reaction_): Self = this.set("reaction", value.asInstanceOf[js.Any])
    @scala.inline
    def setChangedBeforeMount(value: Boolean): Self = this.set("changedBeforeMount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChangedBeforeMount: Self = this.set("changedBeforeMount", js.undefined)
    @scala.inline
    def setMounted(value: Boolean): Self = this.set("mounted", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMounted: Self = this.set("mounted", js.undefined)
  }
  
}

