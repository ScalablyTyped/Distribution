package typings.maximMazurokGapiClientOsconfig.gapi.client.osconfig

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InventoryOsInfo extends js.Object {
  
  /** The system architecture of the operating system. */
  var architecture: js.UndefOr[String] = js.native
  
  /** The VM hostname. */
  var hostname: js.UndefOr[String] = js.native
  
  /** The kernel release of the operating system. */
  var kernelRelease: js.UndefOr[String] = js.native
  
  /** The kernel version of the operating system. */
  var kernelVersion: js.UndefOr[String] = js.native
  
  /** The operating system long name. For example 'Debian GNU/Linux 9' or 'Microsoft Window Server 2019 Datacenter'. */
  var longName: js.UndefOr[String] = js.native
  
  /** The current version of the OS Config agent running on the VM. */
  var osconfigAgentVersion: js.UndefOr[String] = js.native
  
  /** The operating system short name. For example, 'windows' or 'debian'. */
  var shortName: js.UndefOr[String] = js.native
  
  /** The version of the operating system. */
  var version: js.UndefOr[String] = js.native
}
object InventoryOsInfo {
  
  @scala.inline
  def apply(): InventoryOsInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InventoryOsInfo]
  }
  
  @scala.inline
  implicit class InventoryOsInfoOps[Self <: InventoryOsInfo] (val x: Self) extends AnyVal {
    
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
    def setArchitecture(value: String): Self = this.set("architecture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArchitecture: Self = this.set("architecture", js.undefined)
    
    @scala.inline
    def setHostname(value: String): Self = this.set("hostname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHostname: Self = this.set("hostname", js.undefined)
    
    @scala.inline
    def setKernelRelease(value: String): Self = this.set("kernelRelease", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKernelRelease: Self = this.set("kernelRelease", js.undefined)
    
    @scala.inline
    def setKernelVersion(value: String): Self = this.set("kernelVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKernelVersion: Self = this.set("kernelVersion", js.undefined)
    
    @scala.inline
    def setLongName(value: String): Self = this.set("longName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLongName: Self = this.set("longName", js.undefined)
    
    @scala.inline
    def setOsconfigAgentVersion(value: String): Self = this.set("osconfigAgentVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOsconfigAgentVersion: Self = this.set("osconfigAgentVersion", js.undefined)
    
    @scala.inline
    def setShortName(value: String): Self = this.set("shortName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShortName: Self = this.set("shortName", js.undefined)
    
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
}
