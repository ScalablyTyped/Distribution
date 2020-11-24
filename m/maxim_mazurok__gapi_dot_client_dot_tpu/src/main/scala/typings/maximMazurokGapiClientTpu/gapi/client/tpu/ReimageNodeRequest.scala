package typings.maximMazurokGapiClientTpu.gapi.client.tpu

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReimageNodeRequest extends js.Object {
  
  /** The version for reimage to create. */
  var tensorflowVersion: js.UndefOr[String] = js.native
}
object ReimageNodeRequest {
  
  @scala.inline
  def apply(): ReimageNodeRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReimageNodeRequest]
  }
  
  @scala.inline
  implicit class ReimageNodeRequestOps[Self <: ReimageNodeRequest] (val x: Self) extends AnyVal {
    
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
    def setTensorflowVersion(value: String): Self = this.set("tensorflowVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTensorflowVersion: Self = this.set("tensorflowVersion", js.undefined)
  }
}
