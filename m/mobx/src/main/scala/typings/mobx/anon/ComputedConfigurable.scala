package typings.mobx.anon

import typings.mobx.mobxStrings.always
import typings.mobx.mobxStrings.never
import typings.mobx.mobxStrings.observed
import typings.mobx.mobxStrings.strict
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ComputedConfigurable extends StObject {
  
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
  implicit class ComputedConfigurableMutableBuilder[Self <: ComputedConfigurable] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComputedConfigurable(value: Boolean): Self = StObject.set(x, "computedConfigurable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComputedConfigurableUndefined: Self = StObject.set(x, "computedConfigurable", js.undefined)
    
    @scala.inline
    def setComputedRequiresReaction(value: Boolean): Self = StObject.set(x, "computedRequiresReaction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComputedRequiresReactionUndefined: Self = StObject.set(x, "computedRequiresReaction", js.undefined)
    
    @scala.inline
    def setDisableErrorBoundaries(value: Boolean): Self = StObject.set(x, "disableErrorBoundaries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableErrorBoundariesUndefined: Self = StObject.set(x, "disableErrorBoundaries", js.undefined)
    
    @scala.inline
    def setEnforceActions(value: Boolean | strict | never | always | observed): Self = StObject.set(x, "enforceActions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnforceActionsUndefined: Self = StObject.set(x, "enforceActions", js.undefined)
    
    @scala.inline
    def setIsolateGlobalState(value: Boolean): Self = StObject.set(x, "isolateGlobalState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsolateGlobalStateUndefined: Self = StObject.set(x, "isolateGlobalState", js.undefined)
    
    @scala.inline
    def setObservableRequiresReaction(value: Boolean): Self = StObject.set(x, "observableRequiresReaction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObservableRequiresReactionUndefined: Self = StObject.set(x, "observableRequiresReaction", js.undefined)
    
    @scala.inline
    def setReactionRequiresObservable(value: Boolean): Self = StObject.set(x, "reactionRequiresObservable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReactionRequiresObservableUndefined: Self = StObject.set(x, "reactionRequiresObservable", js.undefined)
    
    @scala.inline
    def setReactionScheduler(value: /* f */ js.Function0[Unit] => Unit): Self = StObject.set(x, "reactionScheduler", js.Any.fromFunction1(value))
    
    @scala.inline
    def setReactionSchedulerUndefined: Self = StObject.set(x, "reactionScheduler", js.undefined)
  }
}
