package typings.nextDashReduxDashWrapper.nextDashReduxDashWrapperMod

import typings.next.Anon_StatusCode
import typings.next.distNextDashServerLibUtilsMod.AppTreeType
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import typings.node.querystringMod.ParsedUrlQuery
import typings.redux.reduxMod.AnyAction
import typings.redux.reduxMod.Store
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MakeStoreOptions
  extends NextJSContext[js.Any, AnyAction]
     with Config

object MakeStoreOptions {
  @scala.inline
  def apply(
    AppTree: AppTreeType,
    isServer: Boolean,
    pathname: String,
    query: ParsedUrlQuery,
    store: Store[js.Any, AnyAction],
    asPath: String = null,
    debug: js.UndefOr[Boolean] = js.undefined,
    deserializeState: /* any */ js.Any => _ = null,
    err: Error with Anon_StatusCode = null,
    overrideIsServer: js.UndefOr[Boolean] = js.undefined,
    req: IncomingMessage = null,
    res: ServerResponse = null,
    serializeState: /* any */ js.Any => _ = null,
    storeKey: String = null
  ): MakeStoreOptions = {
    val __obj = js.Dynamic.literal(AppTree = AppTree.asInstanceOf[js.Any], isServer = isServer, pathname = pathname, query = query, store = store)
    if (asPath != null) __obj.updateDynamic("asPath")(asPath)
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug)
    if (deserializeState != null) __obj.updateDynamic("deserializeState")(js.Any.fromFunction1(deserializeState))
    if (err != null) __obj.updateDynamic("err")(err)
    if (!js.isUndefined(overrideIsServer)) __obj.updateDynamic("overrideIsServer")(overrideIsServer)
    if (req != null) __obj.updateDynamic("req")(req)
    if (res != null) __obj.updateDynamic("res")(res)
    if (serializeState != null) __obj.updateDynamic("serializeState")(js.Any.fromFunction1(serializeState))
    if (storeKey != null) __obj.updateDynamic("storeKey")(storeKey)
    __obj.asInstanceOf[MakeStoreOptions]
  }
}

