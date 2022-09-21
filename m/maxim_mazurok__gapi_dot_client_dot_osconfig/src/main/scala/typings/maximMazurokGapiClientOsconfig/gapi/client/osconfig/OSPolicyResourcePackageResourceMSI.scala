package typings.maximMazurokGapiClientOsconfig.gapi.client.osconfig

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OSPolicyResourcePackageResourceMSI extends StObject {
  
  /** Additional properties to use during installation. This should be in the format of Property=Setting. Appended to the defaults of `ACTION=INSTALL REBOOT=ReallySuppress`. */
  var properties: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Required. The MSI package. */
  var source: js.UndefOr[OSPolicyResourceFile] = js.undefined
}
object OSPolicyResourcePackageResourceMSI {
  
  inline def apply(): OSPolicyResourcePackageResourceMSI = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OSPolicyResourcePackageResourceMSI]
  }
  
  extension [Self <: OSPolicyResourcePackageResourceMSI](x: Self) {
    
    inline def setProperties(value: js.Array[String]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
    
    inline def setPropertiesVarargs(value: String*): Self = StObject.set(x, "properties", js.Array(value*))
    
    inline def setSource(value: OSPolicyResourceFile): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
  }
}
