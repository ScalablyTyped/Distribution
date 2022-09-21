package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CanapprovepullrequestreviewsDefaultworkflowpermissions extends StObject {
  
  var can_approve_pull_request_reviews: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['actions-can-approve-pull-request-reviews'] */ js.Any
  
  var default_workflow_permissions: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['actions-default-workflow-permissions'] */ js.Any
}
object CanapprovepullrequestreviewsDefaultworkflowpermissions {
  
  inline def apply(
    can_approve_pull_request_reviews: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['actions-can-approve-pull-request-reviews'] */ js.Any,
    default_workflow_permissions: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['actions-default-workflow-permissions'] */ js.Any
  ): CanapprovepullrequestreviewsDefaultworkflowpermissions = {
    val __obj = js.Dynamic.literal(can_approve_pull_request_reviews = can_approve_pull_request_reviews.asInstanceOf[js.Any], default_workflow_permissions = default_workflow_permissions.asInstanceOf[js.Any])
    __obj.asInstanceOf[CanapprovepullrequestreviewsDefaultworkflowpermissions]
  }
  
  extension [Self <: CanapprovepullrequestreviewsDefaultworkflowpermissions](x: Self) {
    
    inline def setCan_approve_pull_request_reviews(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['actions-can-approve-pull-request-reviews'] */ js.Any
    ): Self = StObject.set(x, "can_approve_pull_request_reviews", value.asInstanceOf[js.Any])
    
    inline def setDefault_workflow_permissions(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['actions-default-workflow-permissions'] */ js.Any
    ): Self = StObject.set(x, "default_workflow_permissions", value.asInstanceOf[js.Any])
  }
}
