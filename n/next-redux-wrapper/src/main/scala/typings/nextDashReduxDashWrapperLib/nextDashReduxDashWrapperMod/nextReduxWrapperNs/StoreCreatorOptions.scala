package typings
package nextDashReduxDashWrapperLib.nextDashReduxDashWrapperMod.nextReduxWrapperNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StoreCreatorOptions[TInitialState, TStateProps, TDispatchProps, TOwnProps, TMergedProps] extends Options {
  var isServer: scala.Boolean
  var query: js.UndefOr[js.Any] = js.undefined
  var req: js.UndefOr[nodeLib.httpMod.IncomingMessage] = js.undefined
  var res: js.UndefOr[nodeLib.httpMod.ServerResponse] = js.undefined
}

object StoreCreatorOptions {
  @scala.inline
  def apply[TInitialState, TStateProps, TDispatchProps, TOwnProps, TMergedProps](
    isServer: scala.Boolean,
    debug: js.UndefOr[scala.Boolean] = js.undefined,
    deserializeState: js.Any = null,
    query: js.Any = null,
    req: nodeLib.httpMod.IncomingMessage = null,
    res: nodeLib.httpMod.ServerResponse = null,
    serializeState: js.Any = null,
    storeKey: java.lang.String = null
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

