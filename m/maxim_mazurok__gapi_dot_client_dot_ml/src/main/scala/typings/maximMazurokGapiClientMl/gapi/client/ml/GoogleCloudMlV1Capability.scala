package typings.maximMazurokGapiClientMl.gapi.client.ml

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudMlV1Capability extends js.Object {
  
  /** Available accelerators for the capability. */
  var availableAccelerators: js.UndefOr[js.Array[String]] = js.native
  
  var `type`: js.UndefOr[String] = js.native
}
object GoogleCloudMlV1Capability {
  
  @scala.inline
  def apply(): GoogleCloudMlV1Capability = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudMlV1Capability]
  }
  
  @scala.inline
  implicit class GoogleCloudMlV1CapabilityOps[Self <: GoogleCloudMlV1Capability] (val x: Self) extends AnyVal {
    
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
    def setAvailableAcceleratorsVarargs(value: String*): Self = this.set("availableAccelerators", js.Array(value :_*))
    
    @scala.inline
    def setAvailableAccelerators(value: js.Array[String]): Self = this.set("availableAccelerators", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAvailableAccelerators: Self = this.set("availableAccelerators", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
