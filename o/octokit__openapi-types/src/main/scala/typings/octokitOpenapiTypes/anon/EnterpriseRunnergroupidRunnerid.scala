package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnterpriseRunnergroupidRunnerid extends StObject {
  
  /** The slug version of the enterprise name. You can also substitute this value with the enterprise id. */
  var enterprise: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['enterprise'] */ js.Any
  
  /** Unique identifier of the self-hosted runner group. */
  var runner_group_id: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['runner-group-id'] */ js.Any
  
  /** Unique identifier of the self-hosted runner. */
  var runner_id: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['runner-id'] */ js.Any
}
object EnterpriseRunnergroupidRunnerid {
  
  inline def apply(
    enterprise: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['enterprise'] */ js.Any,
    runner_group_id: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['runner-group-id'] */ js.Any,
    runner_id: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['runner-id'] */ js.Any
  ): EnterpriseRunnergroupidRunnerid = {
    val __obj = js.Dynamic.literal(enterprise = enterprise.asInstanceOf[js.Any], runner_group_id = runner_group_id.asInstanceOf[js.Any], runner_id = runner_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnterpriseRunnergroupidRunnerid]
  }
  
  extension [Self <: EnterpriseRunnergroupidRunnerid](x: Self) {
    
    inline def setEnterprise(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['enterprise'] */ js.Any
    ): Self = StObject.set(x, "enterprise", value.asInstanceOf[js.Any])
    
    inline def setRunner_group_id(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['runner-group-id'] */ js.Any
    ): Self = StObject.set(x, "runner_group_id", value.asInstanceOf[js.Any])
    
    inline def setRunner_id(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['runner-id'] */ js.Any
    ): Self = StObject.set(x, "runner_id", value.asInstanceOf[js.Any])
  }
}
