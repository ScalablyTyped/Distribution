package typings.mobx.anon

import typings.mobx.mobxStrings.always
import typings.mobx.mobxStrings.never
import typings.mobx.mobxStrings.observed
import typings.mobx.mobxStrings.strict
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ComputedConfigurable extends js.Object {
  var computedConfigurable: js.UndefOr[Boolean] = js.native
  var computedRequiresReaction: js.UndefOr[Boolean] = js.native
  var disableErrorBoundaries: js.UndefOr[Boolean] = js.native
  var enforceActions: js.UndefOr[Boolean | strict | never | always | observed] = js.native
  var isolateGlobalState: js.UndefOr[Boolean] = js.native
  /**
    * (Experimental)
    * Warn if observables are accessed outside a reactive context
    */
  var observableRequiresReaction: js.UndefOr[Boolean] = js.native
  /**
    * (Experimental)
    * Warn if you try to create to derivation / reactive context without accessing any observable.
    */
  var reactionRequiresObservable: js.UndefOr[Boolean] = js.native
  var reactionScheduler: js.UndefOr[js.Function1[/* f */ js.Function0[Unit], Unit]] = js.native
}

object ComputedConfigurable {
  @scala.inline
  def apply(): ComputedConfigurable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ComputedConfigurable]
  }
  @scala.inline
  implicit class ComputedConfigurableOps[Self <: ComputedConfigurable] (val x: Self) extends AnyVal {
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
    def setComputedConfigurable(value: Boolean): Self = this.set("computedConfigurable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComputedConfigurable: Self = this.set("computedConfigurable", js.undefined)
    @scala.inline
    def setComputedRequiresReaction(value: Boolean): Self = this.set("computedRequiresReaction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComputedRequiresReaction: Self = this.set("computedRequiresReaction", js.undefined)
    @scala.inline
    def setDisableErrorBoundaries(value: Boolean): Self = this.set("disableErrorBoundaries", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableErrorBoundaries: Self = this.set("disableErrorBoundaries", js.undefined)
    @scala.inline
    def setEnforceActions(value: Boolean | strict | never | always | observed): Self = this.set("enforceActions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnforceActions: Self = this.set("enforceActions", js.undefined)
    @scala.inline
    def setIsolateGlobalState(value: Boolean): Self = this.set("isolateGlobalState", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsolateGlobalState: Self = this.set("isolateGlobalState", js.undefined)
    @scala.inline
    def setObservableRequiresReaction(value: Boolean): Self = this.set("observableRequiresReaction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteObservableRequiresReaction: Self = this.set("observableRequiresReaction", js.undefined)
    @scala.inline
    def setReactionRequiresObservable(value: Boolean): Self = this.set("reactionRequiresObservable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReactionRequiresObservable: Self = this.set("reactionRequiresObservable", js.undefined)
    @scala.inline
    def setReactionScheduler(value: /* f */ js.Function0[Unit] => Unit): Self = this.set("reactionScheduler", js.Any.fromFunction1(value))
    @scala.inline
    def deleteReactionScheduler: Self = this.set("reactionScheduler", js.undefined)
  }
  
}

