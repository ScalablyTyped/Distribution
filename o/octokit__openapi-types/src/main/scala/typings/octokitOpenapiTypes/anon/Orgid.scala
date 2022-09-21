package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Orgid extends StObject {
  
  /** The slug version of the enterprise name. You can also substitute this value with the enterprise id. */
  var enterprise: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['enterprise'] */ js.Any
  
  /** The unique identifier of the organization. */
  var org_id: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['org-id'] */ js.Any
}
object Orgid {
  
  inline def apply(
    enterprise: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['enterprise'] */ js.Any,
    org_id: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['org-id'] */ js.Any
  ): Orgid = {
    val __obj = js.Dynamic.literal(enterprise = enterprise.asInstanceOf[js.Any], org_id = org_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Orgid]
  }
  
  extension [Self <: Orgid](x: Self) {
    
    inline def setEnterprise(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['enterprise'] */ js.Any
    ): Self = StObject.set(x, "enterprise", value.asInstanceOf[js.Any])
    
    inline def setOrg_id(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['org-id'] */ js.Any
    ): Self = StObject.set(x, "org_id", value.asInstanceOf[js.Any])
  }
}
