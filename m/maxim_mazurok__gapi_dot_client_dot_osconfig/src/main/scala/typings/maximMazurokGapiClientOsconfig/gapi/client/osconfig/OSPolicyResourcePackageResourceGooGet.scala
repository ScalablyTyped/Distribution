package typings.maximMazurokGapiClientOsconfig.gapi.client.osconfig

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OSPolicyResourcePackageResourceGooGet extends StObject {
  
  /** Required. Package name. */
  var name: js.UndefOr[String] = js.undefined
}
object OSPolicyResourcePackageResourceGooGet {
  
  inline def apply(): OSPolicyResourcePackageResourceGooGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OSPolicyResourcePackageResourceGooGet]
  }
  
  extension [Self <: OSPolicyResourcePackageResourceGooGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
