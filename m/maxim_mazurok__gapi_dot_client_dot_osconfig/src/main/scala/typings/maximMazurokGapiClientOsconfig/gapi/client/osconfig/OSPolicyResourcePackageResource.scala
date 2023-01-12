package typings.maximMazurokGapiClientOsconfig.gapi.client.osconfig

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OSPolicyResourcePackageResource extends StObject {
  
  /** A package managed by Apt. */
  var apt: js.UndefOr[OSPolicyResourcePackageResourceAPT] = js.undefined
  
  /** A deb package file. */
  var deb: js.UndefOr[OSPolicyResourcePackageResourceDeb] = js.undefined
  
  /** Required. The desired state the agent should maintain for this package. */
  var desiredState: js.UndefOr[String] = js.undefined
  
  /** A package managed by GooGet. */
  var googet: js.UndefOr[OSPolicyResourcePackageResourceGooGet] = js.undefined
  
  /** An MSI package. */
  var msi: js.UndefOr[OSPolicyResourcePackageResourceMSI] = js.undefined
  
  /** An rpm package file. */
  var rpm: js.UndefOr[OSPolicyResourcePackageResourceRPM] = js.undefined
  
  /** A package managed by YUM. */
  var yum: js.UndefOr[OSPolicyResourcePackageResourceYUM] = js.undefined
  
  /** A package managed by Zypper. */
  var zypper: js.UndefOr[OSPolicyResourcePackageResourceZypper] = js.undefined
}
object OSPolicyResourcePackageResource {
  
  inline def apply(): OSPolicyResourcePackageResource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OSPolicyResourcePackageResource]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OSPolicyResourcePackageResource] (val x: Self) extends AnyVal {
    
    inline def setApt(value: OSPolicyResourcePackageResourceAPT): Self = StObject.set(x, "apt", value.asInstanceOf[js.Any])
    
    inline def setAptUndefined: Self = StObject.set(x, "apt", js.undefined)
    
    inline def setDeb(value: OSPolicyResourcePackageResourceDeb): Self = StObject.set(x, "deb", value.asInstanceOf[js.Any])
    
    inline def setDebUndefined: Self = StObject.set(x, "deb", js.undefined)
    
    inline def setDesiredState(value: String): Self = StObject.set(x, "desiredState", value.asInstanceOf[js.Any])
    
    inline def setDesiredStateUndefined: Self = StObject.set(x, "desiredState", js.undefined)
    
    inline def setGooget(value: OSPolicyResourcePackageResourceGooGet): Self = StObject.set(x, "googet", value.asInstanceOf[js.Any])
    
    inline def setGoogetUndefined: Self = StObject.set(x, "googet", js.undefined)
    
    inline def setMsi(value: OSPolicyResourcePackageResourceMSI): Self = StObject.set(x, "msi", value.asInstanceOf[js.Any])
    
    inline def setMsiUndefined: Self = StObject.set(x, "msi", js.undefined)
    
    inline def setRpm(value: OSPolicyResourcePackageResourceRPM): Self = StObject.set(x, "rpm", value.asInstanceOf[js.Any])
    
    inline def setRpmUndefined: Self = StObject.set(x, "rpm", js.undefined)
    
    inline def setYum(value: OSPolicyResourcePackageResourceYUM): Self = StObject.set(x, "yum", value.asInstanceOf[js.Any])
    
    inline def setYumUndefined: Self = StObject.set(x, "yum", js.undefined)
    
    inline def setZypper(value: OSPolicyResourcePackageResourceZypper): Self = StObject.set(x, "zypper", value.asInstanceOf[js.Any])
    
    inline def setZypperUndefined: Self = StObject.set(x, "zypper", js.undefined)
  }
}
