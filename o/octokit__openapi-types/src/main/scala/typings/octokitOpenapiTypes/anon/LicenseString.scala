package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LicenseString extends StObject {
  
  var license: String
}
object LicenseString {
  
  inline def apply(license: String): LicenseString = {
    val __obj = js.Dynamic.literal(license = license.asInstanceOf[js.Any])
    __obj.asInstanceOf[LicenseString]
  }
  
  extension [Self <: LicenseString](x: Self) {
    
    inline def setLicense(value: String): Self = StObject.set(x, "license", value.asInstanceOf[js.Any])
  }
}
