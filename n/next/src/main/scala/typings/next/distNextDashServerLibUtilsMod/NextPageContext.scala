package typings.next.distNextDashServerLibUtilsMod

import typings.next.Anon_StatusCode
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
  var AppTree: AppTreeType
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
    AppTree: AppTreeType,
    pathname: String,
    query: ParsedUrlQuery,
    asPath: String = null,
    err: Error with Anon_StatusCode = null,
    req: IncomingMessage = null,
    res: ServerResponse = null
  ): NextPageContext = {
    val __obj = js.Dynamic.literal(AppTree = AppTree.asInstanceOf[js.Any], pathname = pathname, query = query)
    if (asPath != null) __obj.updateDynamic("asPath")(asPath)
    if (err != null) __obj.updateDynamic("err")(err)
    if (req != null) __obj.updateDynamic("req")(req)
    if (res != null) __obj.updateDynamic("res")(res)
    __obj.asInstanceOf[NextPageContext]
  }
}

