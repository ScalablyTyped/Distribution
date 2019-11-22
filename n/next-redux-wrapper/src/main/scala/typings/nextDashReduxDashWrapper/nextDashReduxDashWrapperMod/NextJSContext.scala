package typings.nextDashReduxDashWrapper.nextDashReduxDashWrapperMod

import typings.next.Anon_StatusCode
import typings.next.distNextDashServerLibUtilsMod.AppTreeType
import typings.next.distNextDashServerLibUtilsMod.NextPageContext
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import typings.node.querystringMod.ParsedUrlQuery
import typings.redux.reduxMod.Action
import typings.redux.reduxMod.Store
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NextJSContext[S, A /* <: Action[_] */] extends NextPageContext {
  var isServer: Boolean
  var store: Store[S, A]
}

object NextJSContext {
  @scala.inline
  def apply[S, A /* <: Action[_] */](
    AppTree: AppTreeType,
    isServer: Boolean,
    pathname: String,
    query: ParsedUrlQuery,
    store: Store[S, A],
    asPath: String = null,
    err: Error with Anon_StatusCode = null,
    req: IncomingMessage = null,
    res: ServerResponse = null
  ): NextJSContext[S, A] = {
    val __obj = js.Dynamic.literal(AppTree = AppTree.asInstanceOf[js.Any], isServer = isServer, pathname = pathname, query = query, store = store)
    if (asPath != null) __obj.updateDynamic("asPath")(asPath)
    if (err != null) __obj.updateDynamic("err")(err)
    if (req != null) __obj.updateDynamic("req")(req)
    if (res != null) __obj.updateDynamic("res")(res)
    __obj.asInstanceOf[NextJSContext[S, A]]
  }
}

