package typings.mmdbLib.libReaderResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AsnResponse
  extends StObject
     with Response {
  
  val autonomous_system_number: Double
  
  val autonomous_system_organization: String
  
  var ip_address: js.UndefOr[String] = js.undefined
}
object AsnResponse {
  
  inline def apply(autonomous_system_number: Double, autonomous_system_organization: String): AsnResponse = {
    val __obj = js.Dynamic.literal(autonomous_system_number = autonomous_system_number.asInstanceOf[js.Any], autonomous_system_organization = autonomous_system_organization.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsnResponse]
  }
  
  extension [Self <: AsnResponse](x: Self) {
    
    inline def setAutonomous_system_number(value: Double): Self = StObject.set(x, "autonomous_system_number", value.asInstanceOf[js.Any])
    
    inline def setAutonomous_system_organization(value: String): Self = StObject.set(x, "autonomous_system_organization", value.asInstanceOf[js.Any])
    
    inline def setIp_address(value: String): Self = StObject.set(x, "ip_address", value.asInstanceOf[js.Any])
    
    inline def setIp_addressUndefined: Self = StObject.set(x, "ip_address", js.undefined)
  }
}
