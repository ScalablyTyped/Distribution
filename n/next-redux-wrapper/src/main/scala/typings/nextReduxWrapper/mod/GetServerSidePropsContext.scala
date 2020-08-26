package typings.nextReduxWrapper.mod

import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import typings.node.querystringMod.ParsedUrlQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetServerSidePropsContext extends _Context {
  var params: js.UndefOr[ParsedUrlQuery] = js.native
  var preview: js.UndefOr[Boolean] = js.native
  var previewData: js.UndefOr[js.Any] = js.native
  var query: ParsedUrlQuery = js.native
  var req: IncomingMessage = js.native
  var res: ServerResponse = js.native
}

object GetServerSidePropsContext {
  @scala.inline
  def apply(query: ParsedUrlQuery, req: IncomingMessage, res: ServerResponse): GetServerSidePropsContext = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any], req = req.asInstanceOf[js.Any], res = res.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetServerSidePropsContext]
  }
  @scala.inline
  implicit class GetServerSidePropsContextOps[Self <: GetServerSidePropsContext] (val x: Self) extends AnyVal {
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
    def setQuery(value: ParsedUrlQuery): Self = this.set("query", value.asInstanceOf[js.Any])
    @scala.inline
    def setReq(value: IncomingMessage): Self = this.set("req", value.asInstanceOf[js.Any])
    @scala.inline
    def setRes(value: ServerResponse): Self = this.set("res", value.asInstanceOf[js.Any])
    @scala.inline
    def setParams(value: ParsedUrlQuery): Self = this.set("params", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParams: Self = this.set("params", js.undefined)
    @scala.inline
    def setPreview(value: Boolean): Self = this.set("preview", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreview: Self = this.set("preview", js.undefined)
    @scala.inline
    def setPreviewData(value: js.Any): Self = this.set("previewData", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreviewData: Self = this.set("previewData", js.undefined)
  }
  
}

