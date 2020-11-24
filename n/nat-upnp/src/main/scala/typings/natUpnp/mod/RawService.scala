package typings.natUpnp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RawService extends js.Object {
  
  var SCPDURL: js.UndefOr[String] = js.native
  
  var controlURL: js.UndefOr[String] = js.native
  
  var eventSubURL: js.UndefOr[String] = js.native
  
  var serviceId: String = js.native
  
  var serviceType: String = js.native
}
object RawService {
  
  @scala.inline
  def apply(serviceId: String, serviceType: String): RawService = {
    val __obj = js.Dynamic.literal(serviceId = serviceId.asInstanceOf[js.Any], serviceType = serviceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[RawService]
  }
  
  @scala.inline
  implicit class RawServiceOps[Self <: RawService] (val x: Self) extends AnyVal {
    
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
    def setServiceId(value: String): Self = this.set("serviceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceType(value: String): Self = this.set("serviceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSCPDURL(value: String): Self = this.set("SCPDURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSCPDURL: Self = this.set("SCPDURL", js.undefined)
    
    @scala.inline
    def setControlURL(value: String): Self = this.set("controlURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteControlURL: Self = this.set("controlURL", js.undefined)
    
    @scala.inline
    def setEventSubURL(value: String): Self = this.set("eventSubURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEventSubURL: Self = this.set("eventSubURL", js.undefined)
  }
}
