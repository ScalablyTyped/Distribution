package typings.octokitOpenapiTypes.anon

import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.analyst
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.coordinator
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.finder
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.other
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.remediation_developer
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.remediation_reviewer
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.remediation_verifier
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.reporter
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.sponsor
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.tool
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LoginString extends StObject {
  
  /** @description The username of the user credited. */
  var login: String
  
  var `type`: analyst | finder | reporter | coordinator | remediation_developer | remediation_reviewer | remediation_verifier | tool | sponsor | other
}
object LoginString {
  
  inline def apply(
    login: String,
    `type`: analyst | finder | reporter | coordinator | remediation_developer | remediation_reviewer | remediation_verifier | tool | sponsor | other
  ): LoginString = {
    val __obj = js.Dynamic.literal(login = login.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoginString]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LoginString] (val x: Self) extends AnyVal {
    
    inline def setLogin(value: String): Self = StObject.set(x, "login", value.asInstanceOf[js.Any])
    
    inline def setType(
      value: analyst | finder | reporter | coordinator | remediation_developer | remediation_reviewer | remediation_verifier | tool | sponsor | other
    ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
