package typings.next

import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import typings.node.querystringMod.ParsedUrlQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonQuery extends js.Object {
  var params: js.UndefOr[ParsedUrlQuery] = js.undefined
  var query: ParsedUrlQuery
  var req: IncomingMessage
  var res: ServerResponse
}

object AnonQuery {
  @scala.inline
  def apply(query: ParsedUrlQuery, req: IncomingMessage, res: ServerResponse, params: ParsedUrlQuery = null): AnonQuery = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any], req = req.asInstanceOf[js.Any], res = res.asInstanceOf[js.Any])
    if (params != null) __obj.updateDynamic("params")(params.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonQuery]
  }
}

