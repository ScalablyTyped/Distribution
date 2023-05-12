package typings.octokitOpenapiTypes.anon

import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.accepted
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.declined
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.pending
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeUser extends StObject {
  
  /**
    * @description The state of the user's acceptance of the credit.
    * @enum {string}
    */
  var state: accepted | declined | pending
  
  var `type`: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['repository-advisory-credit-types'] */ js.Any
  
  var user: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['simple-user'] */ js.Any
}
object TypeUser {
  
  inline def apply(
    state: accepted | declined | pending,
    `type`: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['repository-advisory-credit-types'] */ js.Any,
    user: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['simple-user'] */ js.Any
  ): TypeUser = {
    val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeUser]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeUser] (val x: Self) extends AnyVal {
    
    inline def setState(value: accepted | declined | pending): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setType(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['repository-advisory-credit-types'] */ js.Any
    ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUser(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['simple-user'] */ js.Any
    ): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
  }
}
