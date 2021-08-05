package typings.mobx.anon

import typings.mobx.mobxStrings.always
import typings.mobx.mobxStrings.never
import typings.mobx.mobxStrings.observed
import typings.mobx.mobxStrings.strict
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComputedConfigurable extends StObject {
  
  var computedConfigurable: js.UndefOr[Boolean] = js.undefined
  
  var computedRequiresReaction: js.UndefOr[Boolean] = js.undefined
  
  var disableErrorBoundaries: js.UndefOr[Boolean] = js.undefined
  
  var enforceActions: js.UndefOr[Boolean | strict | never | always | observed] = js.undefined
  
  var isolateGlobalState: js.UndefOr[Boolean] = js.undefined
  
  /**
    * (Experimental)
    * Warn if observables are accessed outside a reactive context
    */
  var observableRequiresReaction: js.UndefOr[Boolean] = js.undefined
  
  /**
    * (Experimental)
    * Warn if you try to create to derivation / reactive context without accessing any observable.
    */
  var reactionRequiresObservable: js.UndefOr[Boolean] = js.undefined
  
  var reactionScheduler: js.UndefOr[js.Function1[/* f */ js.Function0[Unit], Unit]] = js.undefined
}
object ComputedConfigurable {
  
  inline def apply(): ComputedConfigurable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ComputedConfigurable]
  }
  
  extension [Self <: ComputedConfigurable](x: Self) {
    
    inline def setComputedConfigurable(value: Boolean): Self = StObject.set(x, "computedConfigurable", value.asInstanceOf[js.Any])
    
    inline def setComputedConfigurableUndefined: Self = StObject.set(x, "computedConfigurable", js.undefined)
    
    inline def setComputedRequiresReaction(value: Boolean): Self = StObject.set(x, "computedRequiresReaction", value.asInstanceOf[js.Any])
    
    inline def setComputedRequiresReactionUndefined: Self = StObject.set(x, "computedRequiresReaction", js.undefined)
    
    inline def setDisableErrorBoundaries(value: Boolean): Self = StObject.set(x, "disableErrorBoundaries", value.asInstanceOf[js.Any])
    
    inline def setDisableErrorBoundariesUndefined: Self = StObject.set(x, "disableErrorBoundaries", js.undefined)
    
    inline def setEnforceActions(value: Boolean | strict | never | always | observed): Self = StObject.set(x, "enforceActions", value.asInstanceOf[js.Any])
    
    inline def setEnforceActionsUndefined: Self = StObject.set(x, "enforceActions", js.undefined)
    
    inline def setIsolateGlobalState(value: Boolean): Self = StObject.set(x, "isolateGlobalState", value.asInstanceOf[js.Any])
    
    inline def setIsolateGlobalStateUndefined: Self = StObject.set(x, "isolateGlobalState", js.undefined)
    
    inline def setObservableRequiresReaction(value: Boolean): Self = StObject.set(x, "observableRequiresReaction", value.asInstanceOf[js.Any])
    
    inline def setObservableRequiresReactionUndefined: Self = StObject.set(x, "observableRequiresReaction", js.undefined)
    
    inline def setReactionRequiresObservable(value: Boolean): Self = StObject.set(x, "reactionRequiresObservable", value.asInstanceOf[js.Any])
    
    inline def setReactionRequiresObservableUndefined: Self = StObject.set(x, "reactionRequiresObservable", js.undefined)
    
    inline def setReactionScheduler(value: /* f */ js.Function0[Unit] => Unit): Self = StObject.set(x, "reactionScheduler", js.Any.fromFunction1(value))
    
    inline def setReactionSchedulerUndefined: Self = StObject.set(x, "reactionScheduler", js.undefined)
  }
}
