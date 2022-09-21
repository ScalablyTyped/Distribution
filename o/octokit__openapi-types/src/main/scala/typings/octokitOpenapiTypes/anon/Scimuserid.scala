package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Scimuserid extends StObject {
  
  /** The slug version of the enterprise name. You can also substitute this value with the enterprise id. */
  var enterprise: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['enterprise'] */ js.Any
  
  /** The unique identifier of the SCIM user. */
  var scim_user_id: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['scim-user-id'] */ js.Any
}
object Scimuserid {
  
  inline def apply(
    enterprise: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['enterprise'] */ js.Any,
    scim_user_id: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['scim-user-id'] */ js.Any
  ): Scimuserid = {
    val __obj = js.Dynamic.literal(enterprise = enterprise.asInstanceOf[js.Any], scim_user_id = scim_user_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Scimuserid]
  }
  
  extension [Self <: Scimuserid](x: Self) {
    
    inline def setEnterprise(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['enterprise'] */ js.Any
    ): Self = StObject.set(x, "enterprise", value.asInstanceOf[js.Any])
    
    inline def setScim_user_id(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['scim-user-id'] */ js.Any
    ): Self = StObject.set(x, "scim_user_id", value.asInstanceOf[js.Any])
  }
}
