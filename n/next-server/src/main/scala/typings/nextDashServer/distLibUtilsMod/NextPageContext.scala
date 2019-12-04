package typings.nextDashServer.distLibUtilsMod

import typings.nextDashServer.Anon_StatusCode
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import typings.node.querystringMod.ParsedUrlQuery
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NextPageContext extends js.Object {
  /**
    * `Component` the tree of the App to use if needing to render separately
    */
  var AppTree: AppType
  /**
    * `String` of the actual path including query.
    */
  var asPath: js.UndefOr[String] = js.undefined
  /**
    * Error object if encountered during rendering
    */
  var err: js.UndefOr[(Error with Anon_StatusCode) | Null] = js.undefined
  /**
    * Path section of `URL`.
    */
  var pathname: String
  /**
    * Query string section of `URL` parsed as an object.
    */
  var query: ParsedUrlQuery
  /**
    * `HTTP` request object.
    */
  var req: js.UndefOr[IncomingMessage] = js.undefined
  /**
    * `HTTP` response object.
    */
  var res: js.UndefOr[ServerResponse] = js.undefined
}

object NextPageContext {
  @scala.inline
  def apply(
    AppTree: AppType,
    pathname: String,
    query: ParsedUrlQuery,
    asPath: String = null,
    err: Error with Anon_StatusCode = null,
    req: IncomingMessage = null,
    res: ServerResponse = null
  ): NextPageContext = {
    val __obj = js.Dynamic.literal(AppTree = AppTree.asInstanceOf[js.Any], pathname = pathname.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    if (asPath != null) __obj.updateDynamic("asPath")(asPath.asInstanceOf[js.Any])
    if (err != null) __obj.updateDynamic("err")(err.asInstanceOf[js.Any])
    if (req != null) __obj.updateDynamic("req")(req.asInstanceOf[js.Any])
    if (res != null) __obj.updateDynamic("res")(res.asInstanceOf[js.Any])
    __obj.asInstanceOf[NextPageContext]
  }
}

