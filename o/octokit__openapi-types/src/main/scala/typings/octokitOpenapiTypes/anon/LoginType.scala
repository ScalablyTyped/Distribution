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

trait LoginType extends StObject {
  
  /** @description The username of the user credited. */
  var login: js.UndefOr[String] = js.undefined
  
  var `type`: js.UndefOr[
    analyst | finder | reporter | coordinator | remediation_developer | remediation_reviewer | remediation_verifier | tool | sponsor | other
  ] = js.undefined
}
object LoginType {
  
  inline def apply(): LoginType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoginType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LoginType] (val x: Self) extends AnyVal {
    
    inline def setLogin(value: String): Self = StObject.set(x, "login", value.asInstanceOf[js.Any])
    
    inline def setLoginUndefined: Self = StObject.set(x, "login", js.undefined)
    
    inline def setType(
      value: analyst | finder | reporter | coordinator | remediation_developer | remediation_reviewer | remediation_verifier | tool | sponsor | other
    ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
