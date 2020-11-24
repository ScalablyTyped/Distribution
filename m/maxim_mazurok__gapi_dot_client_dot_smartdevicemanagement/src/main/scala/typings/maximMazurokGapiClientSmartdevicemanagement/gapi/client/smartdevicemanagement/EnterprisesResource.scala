package typings.maximMazurokGapiClientSmartdevicemanagement.gapi.client.smartdevicemanagement

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnterprisesResource extends js.Object {
  
  var devices: DevicesResource = js.native
  
  var structures: StructuresResource = js.native
}
object EnterprisesResource {
  
  @scala.inline
  def apply(devices: DevicesResource, structures: StructuresResource): EnterprisesResource = {
    val __obj = js.Dynamic.literal(devices = devices.asInstanceOf[js.Any], structures = structures.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnterprisesResource]
  }
  
  @scala.inline
  implicit class EnterprisesResourceOps[Self <: EnterprisesResource] (val x: Self) extends AnyVal {
    
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
    def setDevices(value: DevicesResource): Self = this.set("devices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStructures(value: StructuresResource): Self = this.set("structures", value.asInstanceOf[js.Any])
  }
}
