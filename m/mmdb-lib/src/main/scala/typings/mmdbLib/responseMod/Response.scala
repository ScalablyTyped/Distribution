package typings.mmdbLib.responseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.mmdbLib.responseMod.CountryResponse
  - typings.mmdbLib.responseMod.CityResponse
  - typings.mmdbLib.responseMod.AnonymousIPResponse
  - typings.mmdbLib.responseMod.AsnResponse
  - typings.mmdbLib.responseMod.ConnectionTypeResponse
  - typings.mmdbLib.responseMod.DomainResponse
  - typings.mmdbLib.responseMod.IspResponse
*/
trait Response extends StObject
object Response {
  
  @scala.inline
  def AnonymousIPResponse(): typings.mmdbLib.responseMod.AnonymousIPResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[typings.mmdbLib.responseMod.AnonymousIPResponse]
  }
  
  @scala.inline
  def AsnResponse(autonomous_system_number: Double, autonomous_system_organization: String): typings.mmdbLib.responseMod.AsnResponse = {
    val __obj = js.Dynamic.literal(autonomous_system_number = autonomous_system_number.asInstanceOf[js.Any], autonomous_system_organization = autonomous_system_organization.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.mmdbLib.responseMod.AsnResponse]
  }
  
  @scala.inline
  def CityResponse(): typings.mmdbLib.responseMod.CityResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[typings.mmdbLib.responseMod.CityResponse]
  }
  
  @scala.inline
  def ConnectionTypeResponse(connection_type: String): typings.mmdbLib.responseMod.ConnectionTypeResponse = {
    val __obj = js.Dynamic.literal(connection_type = connection_type.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.mmdbLib.responseMod.ConnectionTypeResponse]
  }
  
  @scala.inline
  def CountryResponse(): typings.mmdbLib.responseMod.CountryResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[typings.mmdbLib.responseMod.CountryResponse]
  }
  
  @scala.inline
  def DomainResponse(domain: String): typings.mmdbLib.responseMod.DomainResponse = {
    val __obj = js.Dynamic.literal(domain = domain.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.mmdbLib.responseMod.DomainResponse]
  }
  
  @scala.inline
  def IspResponse(
    autonomous_system_number: Double,
    autonomous_system_organization: String,
    isp: String,
    organization: String
  ): typings.mmdbLib.responseMod.IspResponse = {
    val __obj = js.Dynamic.literal(autonomous_system_number = autonomous_system_number.asInstanceOf[js.Any], autonomous_system_organization = autonomous_system_organization.asInstanceOf[js.Any], isp = isp.asInstanceOf[js.Any], organization = organization.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.mmdbLib.responseMod.IspResponse]
  }
}
