package typings.next.mod

import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import typings.node.querystringMod.ParsedUrlQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetServerSidePropsContext[Q /* <: ParsedUrlQuery */] extends js.Object {
  var params: js.UndefOr[Q] = js.undefined
  var preview: js.UndefOr[Boolean] = js.undefined
  var previewData: js.UndefOr[js.Any] = js.undefined
  var query: ParsedUrlQuery
  var req: IncomingMessage
  var res: ServerResponse
}

object GetServerSidePropsContext {
  @scala.inline
  def apply[Q](
    query: ParsedUrlQuery,
    req: IncomingMessage,
    res: ServerResponse,
    params: Q = null,
    preview: js.UndefOr[Boolean] = js.undefined,
    previewData: js.Any = null
  ): GetServerSidePropsContext[Q] = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any], req = req.asInstanceOf[js.Any], res = res.asInstanceOf[js.Any])
    if (params != null) __obj.updateDynamic("params")(params.asInstanceOf[js.Any])
    if (!js.isUndefined(preview)) __obj.updateDynamic("preview")(preview.get.asInstanceOf[js.Any])
    if (previewData != null) __obj.updateDynamic("previewData")(previewData.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetServerSidePropsContext[Q]]
  }
}

