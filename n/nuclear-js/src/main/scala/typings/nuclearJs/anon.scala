package typings.nuclearJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait LogAppState extends StObject {
    
    /** log the entire app state after each dispatch. */
    var logAppState: js.UndefOr[Boolean] = js.undefined
    
    /** Log what stores changed after a dispatch. */
    var logDirtyStores: js.UndefOr[Boolean] = js.undefined
    
    /** Log information for each dispatch. */
    var logDispatches: js.UndefOr[Boolean] = js.undefined
    
    /** Throw when dispatching in dispatch. */
    var throwOnDispatchInDispatch: js.UndefOr[Boolean] = js.undefined
    
    /** Throw an error if a store.getInitialState() returns a non immutable value. */
    var throwOnNonImmutableStore: js.UndefOr[Boolean] = js.undefined
    
    /** Throw an error when dispatching an `undefined` actionType. */
    var throwOnUndefinedActionType: js.UndefOr[Boolean] = js.undefined
    
    /** Throw an error if a store returns undefined. */
    var throwOnUndefinedStoreReturnValue: js.UndefOr[Boolean] = js.undefined
  }
  object LogAppState {
    
    inline def apply(): LogAppState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LogAppState]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LogAppState] (val x: Self) extends AnyVal {
      
      inline def setLogAppState(value: Boolean): Self = StObject.set(x, "logAppState", value.asInstanceOf[js.Any])
      
      inline def setLogAppStateUndefined: Self = StObject.set(x, "logAppState", js.undefined)
      
      inline def setLogDirtyStores(value: Boolean): Self = StObject.set(x, "logDirtyStores", value.asInstanceOf[js.Any])
      
      inline def setLogDirtyStoresUndefined: Self = StObject.set(x, "logDirtyStores", js.undefined)
      
      inline def setLogDispatches(value: Boolean): Self = StObject.set(x, "logDispatches", value.asInstanceOf[js.Any])
      
      inline def setLogDispatchesUndefined: Self = StObject.set(x, "logDispatches", js.undefined)
      
      inline def setThrowOnDispatchInDispatch(value: Boolean): Self = StObject.set(x, "throwOnDispatchInDispatch", value.asInstanceOf[js.Any])
      
      inline def setThrowOnDispatchInDispatchUndefined: Self = StObject.set(x, "throwOnDispatchInDispatch", js.undefined)
      
      inline def setThrowOnNonImmutableStore(value: Boolean): Self = StObject.set(x, "throwOnNonImmutableStore", value.asInstanceOf[js.Any])
      
      inline def setThrowOnNonImmutableStoreUndefined: Self = StObject.set(x, "throwOnNonImmutableStore", js.undefined)
      
      inline def setThrowOnUndefinedActionType(value: Boolean): Self = StObject.set(x, "throwOnUndefinedActionType", value.asInstanceOf[js.Any])
      
      inline def setThrowOnUndefinedActionTypeUndefined: Self = StObject.set(x, "throwOnUndefinedActionType", js.undefined)
      
      inline def setThrowOnUndefinedStoreReturnValue(value: Boolean): Self = StObject.set(x, "throwOnUndefinedStoreReturnValue", value.asInstanceOf[js.Any])
      
      inline def setThrowOnUndefinedStoreReturnValueUndefined: Self = StObject.set(x, "throwOnUndefinedStoreReturnValue", js.undefined)
    }
  }
}
