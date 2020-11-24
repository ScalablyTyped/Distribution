package typings.maximMazurokGapiClientOsconfig.gapi.client.osconfig

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InventorySoftwarePackage extends js.Object {
  
  /** Details of an APT package. For details about the apt package manager, see https://wiki.debian.org/Apt. */
  var aptPackage: js.UndefOr[InventoryVersionedPackage] = js.native
  
  /** Details of a COS package. */
  var cosPackage: js.UndefOr[InventoryVersionedPackage] = js.native
  
  /** Details of a Googet package. For details about the googet package manager, see https://github.com/google/googet. */
  var googetPackage: js.UndefOr[InventoryVersionedPackage] = js.native
  
  /**
    * Details of a Windows Quick Fix engineering package. See https://docs.microsoft.com/en-us/windows/win32/cimwin32prov/win32-quickfixengineering for info in Windows Quick Fix
    * Engineering.
    */
  var qfePackage: js.UndefOr[InventoryWindowsQuickFixEngineeringPackage] = js.native
  
  /** Details of a Windows Update package. See https://docs.microsoft.com/en-us/windows/win32/api/_wua/ for information about Windows Update. */
  var wuaPackage: js.UndefOr[InventoryWindowsUpdatePackage] = js.native
  
  /** Yum package info. For details about the yum package manager, see https://access.redhat.com/documentation/en-us/red_hat_enterprise_linux/6/html/deployment_guide/ch-yum. */
  var yumPackage: js.UndefOr[InventoryVersionedPackage] = js.native
  
  /** Details of a Zypper package. For details about the Zypper package manager, see https://en.opensuse.org/SDB:Zypper_manual. */
  var zypperPackage: js.UndefOr[InventoryVersionedPackage] = js.native
  
  /** Details of a Zypper patch. For details about the Zypper package manager, see https://en.opensuse.org/SDB:Zypper_manual. */
  var zypperPatch: js.UndefOr[InventoryZypperPatch] = js.native
}
object InventorySoftwarePackage {
  
  @scala.inline
  def apply(): InventorySoftwarePackage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InventorySoftwarePackage]
  }
  
  @scala.inline
  implicit class InventorySoftwarePackageOps[Self <: InventorySoftwarePackage] (val x: Self) extends AnyVal {
    
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
    def setAptPackage(value: InventoryVersionedPackage): Self = this.set("aptPackage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAptPackage: Self = this.set("aptPackage", js.undefined)
    
    @scala.inline
    def setCosPackage(value: InventoryVersionedPackage): Self = this.set("cosPackage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCosPackage: Self = this.set("cosPackage", js.undefined)
    
    @scala.inline
    def setGoogetPackage(value: InventoryVersionedPackage): Self = this.set("googetPackage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGoogetPackage: Self = this.set("googetPackage", js.undefined)
    
    @scala.inline
    def setQfePackage(value: InventoryWindowsQuickFixEngineeringPackage): Self = this.set("qfePackage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQfePackage: Self = this.set("qfePackage", js.undefined)
    
    @scala.inline
    def setWuaPackage(value: InventoryWindowsUpdatePackage): Self = this.set("wuaPackage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWuaPackage: Self = this.set("wuaPackage", js.undefined)
    
    @scala.inline
    def setYumPackage(value: InventoryVersionedPackage): Self = this.set("yumPackage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteYumPackage: Self = this.set("yumPackage", js.undefined)
    
    @scala.inline
    def setZypperPackage(value: InventoryVersionedPackage): Self = this.set("zypperPackage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZypperPackage: Self = this.set("zypperPackage", js.undefined)
    
    @scala.inline
    def setZypperPatch(value: InventoryZypperPatch): Self = this.set("zypperPatch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZypperPatch: Self = this.set("zypperPatch", js.undefined)
  }
}
