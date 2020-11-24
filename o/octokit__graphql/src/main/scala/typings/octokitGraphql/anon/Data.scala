package typings.octokitGraphql.anon

import typings.octokitGraphql.typesMod.GraphQlQueryResponse
import typings.octokitTypes.responseHeadersMod.ResponseHeaders
import typings.std.Required
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Data[ResponseData] extends js.Object {
  
  var data: Required[GraphQlQueryResponse[ResponseData]] = js.native
  
  var headers: ResponseHeaders = js.native
}
object Data {
  
  @scala.inline
  def apply[ResponseData](data: Required[GraphQlQueryResponse[ResponseData]], headers: ResponseHeaders): Data[ResponseData] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Data[ResponseData]]
  }
  
  @scala.inline
  implicit class DataOps[Self <: Data[_], ResponseData] (val x: Self with Data[ResponseData]) extends AnyVal {
    
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
    def setData(value: Required[GraphQlQueryResponse[ResponseData]]): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaders(value: ResponseHeaders): Self = this.set("headers", value.asInstanceOf[js.Any])
  }
}
