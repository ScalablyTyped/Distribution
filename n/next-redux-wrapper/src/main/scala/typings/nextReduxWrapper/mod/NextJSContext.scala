package typings.nextReduxWrapper.mod

import typings.next.AnonStatusCode
import typings.next.utilsMod.AppTreeType
import typings.next.utilsMod.NextPageContext
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import typings.node.querystringMod.ParsedUrlQuery
import typings.redux.mod.Action
import typings.redux.mod.Store
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
    err: Error with AnonStatusCode = null,
    req: IncomingMessage = null,
    res: ServerResponse = null
  ): NextJSContext[S, A] = {
    val __obj = js.Dynamic.literal(AppTree = AppTree.asInstanceOf[js.Any], isServer = isServer.asInstanceOf[js.Any], pathname = pathname.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], store = store.asInstanceOf[js.Any])
    if (asPath != null) __obj.updateDynamic("asPath")(asPath.asInstanceOf[js.Any])
    if (err != null) __obj.updateDynamic("err")(err.asInstanceOf[js.Any])
    if (req != null) __obj.updateDynamic("req")(req.asInstanceOf[js.Any])
    if (res != null) __obj.updateDynamic("res")(res.asInstanceOf[js.Any])
    __obj.asInstanceOf[NextJSContext[S, A]]
  }
}

