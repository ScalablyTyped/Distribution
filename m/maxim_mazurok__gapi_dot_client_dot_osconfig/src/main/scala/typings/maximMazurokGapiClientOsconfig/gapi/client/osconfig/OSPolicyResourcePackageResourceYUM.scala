package typings.maximMazurokGapiClientOsconfig.gapi.client.osconfig

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OSPolicyResourcePackageResourceYUM extends StObject {
  
  /** Required. Package name. */
  var name: js.UndefOr[String] = js.undefined
}
object OSPolicyResourcePackageResourceYUM {
  
  inline def apply(): OSPolicyResourcePackageResourceYUM = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OSPolicyResourcePackageResourceYUM]
  }
  
  extension [Self <: OSPolicyResourcePackageResourceYUM](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
