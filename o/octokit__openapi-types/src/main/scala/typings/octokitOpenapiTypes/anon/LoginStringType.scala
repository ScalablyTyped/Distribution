package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LoginStringType extends StObject {
  
  /** @description The username of the user credited. */
  var login: String
  
  var `type`: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['security-advisory-credit-types'] */ js.Any
}
object LoginStringType {
  
  inline def apply(
    login: String,
    `type`: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['security-advisory-credit-types'] */ js.Any
  ): LoginStringType = {
    val __obj = js.Dynamic.literal(login = login.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoginStringType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LoginStringType] (val x: Self) extends AnyVal {
    
    inline def setLogin(value: String): Self = StObject.set(x, "login", value.asInstanceOf[js.Any])
    
    inline def setType(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['security-advisory-credit-types'] */ js.Any
    ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
