package typings.maximMazurokGapiClientTpu.gapi.client.tpu

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListTensorFlowVersionsResponse extends js.Object {
  
  /** The next page token or empty if none. */
  var nextPageToken: js.UndefOr[String] = js.native
  
  /** The listed nodes. */
  var tensorflowVersions: js.UndefOr[js.Array[TensorFlowVersion]] = js.native
  
  /** Locations that could not be reached. */
  var unreachable: js.UndefOr[js.Array[String]] = js.native
}
object ListTensorFlowVersionsResponse {
  
  @scala.inline
  def apply(): ListTensorFlowVersionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTensorFlowVersionsResponse]
  }
  
  @scala.inline
  implicit class ListTensorFlowVersionsResponseOps[Self <: ListTensorFlowVersionsResponse] (val x: Self) extends AnyVal {
    
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
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
    
    @scala.inline
    def setTensorflowVersionsVarargs(value: TensorFlowVersion*): Self = this.set("tensorflowVersions", js.Array(value :_*))
    
    @scala.inline
    def setTensorflowVersions(value: js.Array[TensorFlowVersion]): Self = this.set("tensorflowVersions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTensorflowVersions: Self = this.set("tensorflowVersions", js.undefined)
    
    @scala.inline
    def setUnreachableVarargs(value: String*): Self = this.set("unreachable", js.Array(value :_*))
    
    @scala.inline
    def setUnreachable(value: js.Array[String]): Self = this.set("unreachable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnreachable: Self = this.set("unreachable", js.undefined)
  }
}
