package typings.next.mod

import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import typings.node.querystringMod.ParsedUrlQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetServerSidePropsContext[Q /* <: ParsedUrlQuery */] extends js.Object {
  
  var defaultLocale: js.UndefOr[String] = js.native
  
  var locale: js.UndefOr[String] = js.native
  
  var locales: js.UndefOr[js.Array[String]] = js.native
  
  var params: js.UndefOr[Q] = js.native
  
  var preview: js.UndefOr[Boolean] = js.native
  
  var previewData: js.UndefOr[js.Any] = js.native
  
  var query: ParsedUrlQuery = js.native
  
  var req: IncomingMessage = js.native
  
  var res: ServerResponse = js.native
  
  var resolvedUrl: String = js.native
}
object GetServerSidePropsContext {
  
  @scala.inline
  def apply[Q /* <: ParsedUrlQuery */](query: ParsedUrlQuery, req: IncomingMessage, res: ServerResponse, resolvedUrl: String): GetServerSidePropsContext[Q] = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any], req = req.asInstanceOf[js.Any], res = res.asInstanceOf[js.Any], resolvedUrl = resolvedUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetServerSidePropsContext[Q]]
  }
  
  @scala.inline
  implicit class GetServerSidePropsContextOps[Self <: GetServerSidePropsContext[_], Q /* <: ParsedUrlQuery */] (val x: Self with GetServerSidePropsContext[Q]) extends AnyVal {
    
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
    def setResolvedUrl(value: String): Self = this.set("resolvedUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultLocale(value: String): Self = this.set("defaultLocale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultLocale: Self = this.set("defaultLocale", js.undefined)
    
    @scala.inline
    def setLocale(value: String): Self = this.set("locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocale: Self = this.set("locale", js.undefined)
    
    @scala.inline
    def setLocalesVarargs(value: String*): Self = this.set("locales", js.Array(value :_*))
    
    @scala.inline
    def setLocales(value: js.Array[String]): Self = this.set("locales", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocales: Self = this.set("locales", js.undefined)
    
    @scala.inline
    def setParams(value: Q): Self = this.set("params", value.asInstanceOf[js.Any])
    
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
