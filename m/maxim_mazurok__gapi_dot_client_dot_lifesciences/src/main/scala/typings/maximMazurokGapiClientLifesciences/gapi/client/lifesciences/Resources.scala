package typings.maximMazurokGapiClientLifesciences.gapi.client.lifesciences

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Resources extends js.Object {
  
  /** The list of regions allowed for VM allocation. If set, the `zones` field must not be set. */
  var regions: js.UndefOr[js.Array[String]] = js.native
  
  /** The virtual machine specification. */
  var virtualMachine: js.UndefOr[VirtualMachine] = js.native
  
  /** The list of zones allowed for VM allocation. If set, the `regions` field must not be set. */
  var zones: js.UndefOr[js.Array[String]] = js.native
}
object Resources {
  
  @scala.inline
  def apply(): Resources = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Resources]
  }
  
  @scala.inline
  implicit class ResourcesOps[Self <: Resources] (val x: Self) extends AnyVal {
    
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
    def setRegionsVarargs(value: String*): Self = this.set("regions", js.Array(value :_*))
    
    @scala.inline
    def setRegions(value: js.Array[String]): Self = this.set("regions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegions: Self = this.set("regions", js.undefined)
    
    @scala.inline
    def setVirtualMachine(value: VirtualMachine): Self = this.set("virtualMachine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVirtualMachine: Self = this.set("virtualMachine", js.undefined)
    
    @scala.inline
    def setZonesVarargs(value: String*): Self = this.set("zones", js.Array(value :_*))
    
    @scala.inline
    def setZones(value: js.Array[String]): Self = this.set("zones", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZones: Self = this.set("zones", js.undefined)
  }
}
