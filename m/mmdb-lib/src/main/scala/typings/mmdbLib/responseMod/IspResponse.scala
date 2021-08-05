package typings.mmdbLib.responseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.mmdbLib.responseMod.Response because Already inherited */ trait IspResponse
  extends StObject
     with AsnResponse {
  
  val isp: String
  
  val organization: String
}
object IspResponse {
  
  inline def apply(
    autonomous_system_number: Double,
    autonomous_system_organization: String,
    isp: String,
    organization: String
  ): IspResponse = {
    val __obj = js.Dynamic.literal(autonomous_system_number = autonomous_system_number.asInstanceOf[js.Any], autonomous_system_organization = autonomous_system_organization.asInstanceOf[js.Any], isp = isp.asInstanceOf[js.Any], organization = organization.asInstanceOf[js.Any])
    __obj.asInstanceOf[IspResponse]
  }
  
  extension [Self <: IspResponse](x: Self) {
    
    inline def setIsp(value: String): Self = StObject.set(x, "isp", value.asInstanceOf[js.Any])
    
    inline def setOrganization(value: String): Self = StObject.set(x, "organization", value.asInstanceOf[js.Any])
  }
}
