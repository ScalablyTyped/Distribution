package typings.maximMazurokGapiClientOsconfig.gapi.client.osconfig

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OSPolicyResourcePackageResourceRPM extends StObject {
  
  /**
    * Whether dependencies should also be installed. - install when false: `rpm --upgrade --replacepkgs package.rpm` - install when true: `yum -y install package.rpm` or `zypper -y
    * install package.rpm`
    */
  var pullDeps: js.UndefOr[Boolean] = js.undefined
  
  /** Required. An rpm package. */
  var source: js.UndefOr[OSPolicyResourceFile] = js.undefined
}
object OSPolicyResourcePackageResourceRPM {
  
  inline def apply(): OSPolicyResourcePackageResourceRPM = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OSPolicyResourcePackageResourceRPM]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OSPolicyResourcePackageResourceRPM] (val x: Self) extends AnyVal {
    
    inline def setPullDeps(value: Boolean): Self = StObject.set(x, "pullDeps", value.asInstanceOf[js.Any])
    
    inline def setPullDepsUndefined: Self = StObject.set(x, "pullDeps", js.undefined)
    
    inline def setSource(value: OSPolicyResourceFile): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
  }
}
