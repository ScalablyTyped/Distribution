package typings.nextDashReduxDashWrapper.nextDashReduxDashWrapperMod.nextReduxWrapperNs

import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StoreCreatorOptions[TInitialState, TStateProps, TDispatchProps, TOwnProps, TMergedProps] extends Options {
  var isServer: Boolean
  var query: js.UndefOr[js.Any] = js.undefined
  var req: js.UndefOr[IncomingMessage] = js.undefined
  var res: js.UndefOr[ServerResponse] = js.undefined
}

object StoreCreatorOptions {
  @scala.inline
  def apply[TInitialState, TStateProps, TDispatchProps, TOwnProps, TMergedProps](
    isServer: Boolean,
    debug: js.UndefOr[Boolean] = js.undefined,
    deserializeState: js.Any = null,
    query: js.Any = null,
    req: IncomingMessage = null,
    res: ServerResponse = null,
    serializeState: js.Any = null,
    storeKey: String = null
  ): StoreCreatorOptions[TInitialState, TStateProps, TDispatchProps, TOwnProps, TMergedProps] = {
    val __obj = js.Dynamic.literal(isServer = isServer)
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug)
    if (deserializeState != null) __obj.updateDynamic("deserializeState")(deserializeState)
    if (query != null) __obj.updateDynamic("query")(query)
    if (req != null) __obj.updateDynamic("req")(req)
    if (res != null) __obj.updateDynamic("res")(res)
    if (serializeState != null) __obj.updateDynamic("serializeState")(serializeState)
    if (storeKey != null) __obj.updateDynamic("storeKey")(storeKey)
    __obj.asInstanceOf[StoreCreatorOptions[TInitialState, TStateProps, TDispatchProps, TOwnProps, TMergedProps]]
  }
}

