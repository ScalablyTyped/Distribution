package typings.maximMazurokGapiClientOsconfig.gapi.client.osconfig

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InventorySoftwarePackage extends StObject {
  
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
  implicit class InventorySoftwarePackageMutableBuilder[Self <: InventorySoftwarePackage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAptPackage(value: InventoryVersionedPackage): Self = StObject.set(x, "aptPackage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAptPackageUndefined: Self = StObject.set(x, "aptPackage", js.undefined)
    
    @scala.inline
    def setCosPackage(value: InventoryVersionedPackage): Self = StObject.set(x, "cosPackage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCosPackageUndefined: Self = StObject.set(x, "cosPackage", js.undefined)
    
    @scala.inline
    def setGoogetPackage(value: InventoryVersionedPackage): Self = StObject.set(x, "googetPackage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGoogetPackageUndefined: Self = StObject.set(x, "googetPackage", js.undefined)
    
    @scala.inline
    def setQfePackage(value: InventoryWindowsQuickFixEngineeringPackage): Self = StObject.set(x, "qfePackage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQfePackageUndefined: Self = StObject.set(x, "qfePackage", js.undefined)
    
    @scala.inline
    def setWuaPackage(value: InventoryWindowsUpdatePackage): Self = StObject.set(x, "wuaPackage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWuaPackageUndefined: Self = StObject.set(x, "wuaPackage", js.undefined)
    
    @scala.inline
    def setYumPackage(value: InventoryVersionedPackage): Self = StObject.set(x, "yumPackage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYumPackageUndefined: Self = StObject.set(x, "yumPackage", js.undefined)
    
    @scala.inline
    def setZypperPackage(value: InventoryVersionedPackage): Self = StObject.set(x, "zypperPackage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZypperPackageUndefined: Self = StObject.set(x, "zypperPackage", js.undefined)
    
    @scala.inline
    def setZypperPatch(value: InventoryZypperPatch): Self = StObject.set(x, "zypperPatch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZypperPatchUndefined: Self = StObject.set(x, "zypperPatch", js.undefined)
  }
}
