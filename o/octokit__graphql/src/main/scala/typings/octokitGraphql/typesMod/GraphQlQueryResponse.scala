package typings.octokitGraphql.typesMod

import typings.octokitGraphql.anon.Extensions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GraphQlQueryResponse[ResponseData] extends js.Object {
  
  var data: ResponseData = js.native
  
  var errors: js.UndefOr[js.Array[Extensions]] = js.native
}
object GraphQlQueryResponse {
  
  @scala.inline
  def apply[ResponseData](data: ResponseData): GraphQlQueryResponse[ResponseData] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphQlQueryResponse[ResponseData]]
  }
  
  @scala.inline
  implicit class GraphQlQueryResponseOps[Self <: GraphQlQueryResponse[_], ResponseData] (val x: Self with GraphQlQueryResponse[ResponseData]) extends AnyVal {
    
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
    def setData(value: ResponseData): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorsVarargs(value: Extensions*): Self = this.set("errors", js.Array(value :_*))
    
    @scala.inline
    def setErrors(value: js.Array[Extensions]): Self = this.set("errors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrors: Self = this.set("errors", js.undefined)
  }
}
