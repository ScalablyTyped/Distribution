package typings.mmdbLib.libReaderResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.mmdbLib.libReaderResponseMod.CountryResponse
  - typings.mmdbLib.libReaderResponseMod.CityResponse
  - typings.mmdbLib.libReaderResponseMod.AnonymousIPResponse
  - typings.mmdbLib.libReaderResponseMod.AsnResponse
  - typings.mmdbLib.libReaderResponseMod.ConnectionTypeResponse
  - typings.mmdbLib.libReaderResponseMod.DomainResponse
  - typings.mmdbLib.libReaderResponseMod.IspResponse
*/
trait Response extends StObject
object Response {
  
  inline def AnonymousIPResponse(): typings.mmdbLib.libReaderResponseMod.AnonymousIPResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[typings.mmdbLib.libReaderResponseMod.AnonymousIPResponse]
  }
  
  inline def AsnResponse(autonomous_system_number: Double, autonomous_system_organization: String): typings.mmdbLib.libReaderResponseMod.AsnResponse = {
    val __obj = js.Dynamic.literal(autonomous_system_number = autonomous_system_number.asInstanceOf[js.Any], autonomous_system_organization = autonomous_system_organization.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.mmdbLib.libReaderResponseMod.AsnResponse]
  }
  
  inline def CityResponse(): typings.mmdbLib.libReaderResponseMod.CityResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[typings.mmdbLib.libReaderResponseMod.CityResponse]
  }
  
  inline def ConnectionTypeResponse(connection_type: String): typings.mmdbLib.libReaderResponseMod.ConnectionTypeResponse = {
    val __obj = js.Dynamic.literal(connection_type = connection_type.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.mmdbLib.libReaderResponseMod.ConnectionTypeResponse]
  }
  
  inline def CountryResponse(): typings.mmdbLib.libReaderResponseMod.CountryResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[typings.mmdbLib.libReaderResponseMod.CountryResponse]
  }
  
  inline def DomainResponse(domain: String): typings.mmdbLib.libReaderResponseMod.DomainResponse = {
    val __obj = js.Dynamic.literal(domain = domain.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.mmdbLib.libReaderResponseMod.DomainResponse]
  }
  
  inline def IspResponse(
    autonomous_system_number: Double,
    autonomous_system_organization: String,
    isp: String,
    organization: String
  ): typings.mmdbLib.libReaderResponseMod.IspResponse = {
    val __obj = js.Dynamic.literal(autonomous_system_number = autonomous_system_number.asInstanceOf[js.Any], autonomous_system_organization = autonomous_system_organization.asInstanceOf[js.Any], isp = isp.asInstanceOf[js.Any], organization = organization.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.mmdbLib.libReaderResponseMod.IspResponse]
  }
}
