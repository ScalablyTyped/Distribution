package typings.maximMazurokGapiClientOsconfig.gapi.client.osconfig

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OSPolicyResourcePackageResourceAPT extends StObject {
  
  /** Required. Package name. */
  var name: js.UndefOr[String] = js.undefined
}
object OSPolicyResourcePackageResourceAPT {
  
  inline def apply(): OSPolicyResourcePackageResourceAPT = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OSPolicyResourcePackageResourceAPT]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OSPolicyResourcePackageResourceAPT] (val x: Self) extends AnyVal {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
