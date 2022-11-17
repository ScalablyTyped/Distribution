package typings.mobx.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComputedRequiresReaction extends StObject {
  
  var computedRequiresReaction: js.UndefOr[Boolean] = js.undefined
  
  var disableErrorBoundaries: js.UndefOr[Boolean] = js.undefined
  
  var enforceActions: js.UndefOr["never" | "always" | "observed"] = js.undefined
  
  var isolateGlobalState: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Warn if observables are accessed outside a reactive context
    */
  var observableRequiresReaction: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Warn if you try to create to derivation / reactive context without accessing any observable.
    */
  var reactionRequiresObservable: js.UndefOr[Boolean] = js.undefined
  
  var reactionScheduler: js.UndefOr[js.Function1[/* f */ js.Function0[Unit], Unit]] = js.undefined
  
  var safeDescriptors: js.UndefOr[Boolean] = js.undefined
  
  var useProxies: js.UndefOr["always" | "never" | "ifavailable"] = js.undefined
}
object ComputedRequiresReaction {
  
  inline def apply(): ComputedRequiresReaction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ComputedRequiresReaction]
  }
  
  extension [Self <: ComputedRequiresReaction](x: Self) {
    
    inline def setComputedRequiresReaction(value: Boolean): Self = StObject.set(x, "computedRequiresReaction", value.asInstanceOf[js.Any])
    
    inline def setComputedRequiresReactionUndefined: Self = StObject.set(x, "computedRequiresReaction", js.undefined)
    
    inline def setDisableErrorBoundaries(value: Boolean): Self = StObject.set(x, "disableErrorBoundaries", value.asInstanceOf[js.Any])
    
    inline def setDisableErrorBoundariesUndefined: Self = StObject.set(x, "disableErrorBoundaries", js.undefined)
    
    inline def setEnforceActions(value: "never" | "always" | "observed"): Self = StObject.set(x, "enforceActions", value.asInstanceOf[js.Any])
    
    inline def setEnforceActionsUndefined: Self = StObject.set(x, "enforceActions", js.undefined)
    
    inline def setIsolateGlobalState(value: Boolean): Self = StObject.set(x, "isolateGlobalState", value.asInstanceOf[js.Any])
    
    inline def setIsolateGlobalStateUndefined: Self = StObject.set(x, "isolateGlobalState", js.undefined)
    
    inline def setObservableRequiresReaction(value: Boolean): Self = StObject.set(x, "observableRequiresReaction", value.asInstanceOf[js.Any])
    
    inline def setObservableRequiresReactionUndefined: Self = StObject.set(x, "observableRequiresReaction", js.undefined)
    
    inline def setReactionRequiresObservable(value: Boolean): Self = StObject.set(x, "reactionRequiresObservable", value.asInstanceOf[js.Any])
    
    inline def setReactionRequiresObservableUndefined: Self = StObject.set(x, "reactionRequiresObservable", js.undefined)
    
    inline def setReactionScheduler(value: /* f */ js.Function0[Unit] => Unit): Self = StObject.set(x, "reactionScheduler", js.Any.fromFunction1(value))
    
    inline def setReactionSchedulerUndefined: Self = StObject.set(x, "reactionScheduler", js.undefined)
    
    inline def setSafeDescriptors(value: Boolean): Self = StObject.set(x, "safeDescriptors", value.asInstanceOf[js.Any])
    
    inline def setSafeDescriptorsUndefined: Self = StObject.set(x, "safeDescriptors", js.undefined)
    
    inline def setUseProxies(value: "always" | "never" | "ifavailable"): Self = StObject.set(x, "useProxies", value.asInstanceOf[js.Any])
    
    inline def setUseProxiesUndefined: Self = StObject.set(x, "useProxies", js.undefined)
  }
}
