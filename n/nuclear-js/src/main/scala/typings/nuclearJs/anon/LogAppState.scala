package typings.nuclearJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LogAppState extends js.Object {
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
  implicit class LogAppStateOps[Self <: LogAppState] (val x: Self) extends AnyVal {
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
    def setLogAppState(value: Boolean): Self = this.set("logAppState", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLogAppState: Self = this.set("logAppState", js.undefined)
    @scala.inline
    def setLogDirtyStores(value: Boolean): Self = this.set("logDirtyStores", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLogDirtyStores: Self = this.set("logDirtyStores", js.undefined)
    @scala.inline
    def setLogDispatches(value: Boolean): Self = this.set("logDispatches", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLogDispatches: Self = this.set("logDispatches", js.undefined)
    @scala.inline
    def setThrowOnDispatchInDispatch(value: Boolean): Self = this.set("throwOnDispatchInDispatch", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThrowOnDispatchInDispatch: Self = this.set("throwOnDispatchInDispatch", js.undefined)
    @scala.inline
    def setThrowOnNonImmutableStore(value: Boolean): Self = this.set("throwOnNonImmutableStore", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThrowOnNonImmutableStore: Self = this.set("throwOnNonImmutableStore", js.undefined)
    @scala.inline
    def setThrowOnUndefinedActionType(value: Boolean): Self = this.set("throwOnUndefinedActionType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThrowOnUndefinedActionType: Self = this.set("throwOnUndefinedActionType", js.undefined)
    @scala.inline
    def setThrowOnUndefinedStoreReturnValue(value: Boolean): Self = this.set("throwOnUndefinedStoreReturnValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThrowOnUndefinedStoreReturnValue: Self = this.set("throwOnUndefinedStoreReturnValue", js.undefined)
  }
  
}

