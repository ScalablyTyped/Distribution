package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `13` extends StObject {
  
  var can_approve_pull_request_reviews: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['actions-can-approve-pull-request-reviews'] */ js.Any
  ] = js.undefined
  
  var default_workflow_permissions: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['actions-default-workflow-permissions'] */ js.Any
  ] = js.undefined
}
object `13` {
  
  inline def apply(): `13` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`13`]
  }
  
  extension [Self <: `13`](x: Self) {
    
    inline def setCan_approve_pull_request_reviews(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['actions-can-approve-pull-request-reviews'] */ js.Any
    ): Self = StObject.set(x, "can_approve_pull_request_reviews", value.asInstanceOf[js.Any])
    
    inline def setCan_approve_pull_request_reviewsUndefined: Self = StObject.set(x, "can_approve_pull_request_reviews", js.undefined)
    
    inline def setDefault_workflow_permissions(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['actions-default-workflow-permissions'] */ js.Any
    ): Self = StObject.set(x, "default_workflow_permissions", value.asInstanceOf[js.Any])
    
    inline def setDefault_workflow_permissionsUndefined: Self = StObject.set(x, "default_workflow_permissions", js.undefined)
  }
}
