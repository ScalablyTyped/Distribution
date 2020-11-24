package typings.pathParser.pathMod

import typings.pathParser.encodingMod.URLParamsEncodingType
import typings.searchParams.encodeMod.IOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InternalPathOptions extends js.Object {
  
  var queryParams: js.UndefOr[IOptions] = js.native
  
  var urlParamsEncoding: URLParamsEncodingType = js.native
}
object InternalPathOptions {
  
  @scala.inline
  def apply(urlParamsEncoding: URLParamsEncodingType): InternalPathOptions = {
    val __obj = js.Dynamic.literal(urlParamsEncoding = urlParamsEncoding.asInstanceOf[js.Any])
    __obj.asInstanceOf[InternalPathOptions]
  }
  
  @scala.inline
  implicit class InternalPathOptionsOps[Self <: InternalPathOptions] (val x: Self) extends AnyVal {
    
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
    def setUrlParamsEncoding(value: URLParamsEncodingType): Self = this.set("urlParamsEncoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryParams(value: IOptions): Self = this.set("queryParams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQueryParams: Self = this.set("queryParams", js.undefined)
  }
}
