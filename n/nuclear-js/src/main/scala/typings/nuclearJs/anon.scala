package typings.nuclearJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait LogAppState extends StObject {
    
    /** log the entire app state after each dispatch. */
    var logAppState: js.UndefOr[Boolean] = js.native
    
    /** Log what stores changed after a dispatch. */
    var logDirtyStores: js.UndefOr[Boolean] = js.native
    
    /** Log information for each dispatch. */
    var logDispatches: js.UndefOr[Boolean] = js.native
    
    /** Throw when dispatching in dispatch. */
    var throwOnDispatchInDispatch: js.UndefOr[Boolean] = js.native
    
    /** Throw an error if a store.getInitialState() returns a non immutable value. */
    var throwOnNonImmutableStore: js.UndefOr[Boolean] = js.native
    
    /** Throw an error when dispatching an `undefined` actionType. */
    var throwOnUndefinedActionType: js.UndefOr[Boolean] = js.native
    
    /** Throw an error if a store returns undefined. */
    var throwOnUndefinedStoreReturnValue: js.UndefOr[Boolean] = js.native
  }
  object LogAppState {
    
    @scala.inline
    def apply(): LogAppState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LogAppState]
    }
    
    @scala.inline
    implicit class LogAppStateMutableBuilder[Self <: LogAppState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLogAppState(value: Boolean): Self = StObject.set(x, "logAppState", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLogAppStateUndefined: Self = StObject.set(x, "logAppState", js.undefined)
      
      @scala.inline
      def setLogDirtyStores(value: Boolean): Self = StObject.set(x, "logDirtyStores", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLogDirtyStoresUndefined: Self = StObject.set(x, "logDirtyStores", js.undefined)
      
      @scala.inline
      def setLogDispatches(value: Boolean): Self = StObject.set(x, "logDispatches", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLogDispatchesUndefined: Self = StObject.set(x, "logDispatches", js.undefined)
      
      @scala.inline
      def setThrowOnDispatchInDispatch(value: Boolean): Self = StObject.set(x, "throwOnDispatchInDispatch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThrowOnDispatchInDispatchUndefined: Self = StObject.set(x, "throwOnDispatchInDispatch", js.undefined)
      
      @scala.inline
      def setThrowOnNonImmutableStore(value: Boolean): Self = StObject.set(x, "throwOnNonImmutableStore", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThrowOnNonImmutableStoreUndefined: Self = StObject.set(x, "throwOnNonImmutableStore", js.undefined)
      
      @scala.inline
      def setThrowOnUndefinedActionType(value: Boolean): Self = StObject.set(x, "throwOnUndefinedActionType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThrowOnUndefinedActionTypeUndefined: Self = StObject.set(x, "throwOnUndefinedActionType", js.undefined)
      
      @scala.inline
      def setThrowOnUndefinedStoreReturnValue(value: Boolean): Self = StObject.set(x, "throwOnUndefinedStoreReturnValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThrowOnUndefinedStoreReturnValueUndefined: Self = StObject.set(x, "throwOnUndefinedStoreReturnValue", js.undefined)
    }
  }
}
