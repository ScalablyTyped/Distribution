package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LicensesGetEndpoint extends StObject {
  
  var license: String
}
object LicensesGetEndpoint {
  
  inline def apply(license: String): LicensesGetEndpoint = {
    val __obj = js.Dynamic.literal(license = license.asInstanceOf[js.Any])
    __obj.asInstanceOf[LicensesGetEndpoint]
  }
  
  extension [Self <: LicensesGetEndpoint](x: Self) {
    
    inline def setLicense(value: String): Self = StObject.set(x, "license", value.asInstanceOf[js.Any])
  }
}
