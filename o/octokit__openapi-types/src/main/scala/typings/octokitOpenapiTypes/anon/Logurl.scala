package typings.octokitOpenapiTypes.anon

import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.error
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.failure
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.in_progress
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.inactive
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.pending
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.queued_
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.success
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Logurl extends StObject {
  
  /**
    * Format: date-time
    * @example 2012-07-20T01:19:13Z
    */
  var created_at: String
  
  var creator: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['nullable-simple-user'] */ js.Any
  
  /**
    * Format: uri
    * @example https://api.github.com/repos/octocat/example/deployments/42
    */
  var deployment_url: String
  
  /**
    * @description A short description of the status.
    * @default
    * @example Deployment finished successfully.
    */
  var description: String
  
  /**
    * @description The environment of the deployment that the status is for.
    * @default
    * @example production
    */
  var environment: js.UndefOr[String] = js.undefined
  
  /**
    * Format: uri
    * @description The URL for accessing your environment.
    * @default
    * @example https://staging.example.com/
    */
  var environment_url: js.UndefOr[String] = js.undefined
  
  /** @example 1 */
  var id: Double
  
  /**
    * Format: uri
    * @description The URL to associate with this status.
    * @default
    * @example https://example.com/deployment/42/output
    */
  var log_url: js.UndefOr[String] = js.undefined
  
  /** @example MDE2OkRlcGxveW1lbnRTdGF0dXMx */
  var node_id: String
  
  var performed_via_github_app: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['nullable-integration'] */ js.Any
  ] = js.undefined
  
  /**
    * Format: uri
    * @example https://api.github.com/repos/octocat/example
    */
  var repository_url: String
  
  /**
    * @description The state of the status.
    * @example success
    * @enum {string}
    */
  var state: error | failure | inactive | pending | success | queued_ | in_progress
  
  /**
    * Format: uri
    * @description Deprecated: the URL to associate with this status.
    * @default
    * @example https://example.com/deployment/42/output
    */
  var target_url: String
  
  /**
    * Format: date-time
    * @example 2012-07-20T01:19:13Z
    */
  var updated_at: String
  
  /**
    * Format: uri
    * @example https://api.github.com/repos/octocat/example/deployments/42/statuses/1
    */
  var url: String
}
object Logurl {
  
  inline def apply(
    created_at: String,
    creator: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['nullable-simple-user'] */ js.Any,
    deployment_url: String,
    description: String,
    id: Double,
    node_id: String,
    repository_url: String,
    state: error | failure | inactive | pending | success | queued_ | in_progress,
    target_url: String,
    updated_at: String,
    url: String
  ): Logurl = {
    val __obj = js.Dynamic.literal(created_at = created_at.asInstanceOf[js.Any], creator = creator.asInstanceOf[js.Any], deployment_url = deployment_url.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], node_id = node_id.asInstanceOf[js.Any], repository_url = repository_url.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], target_url = target_url.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Logurl]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Logurl] (val x: Self) extends AnyVal {
    
    inline def setCreated_at(value: String): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
    
    inline def setCreator(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['nullable-simple-user'] */ js.Any
    ): Self = StObject.set(x, "creator", value.asInstanceOf[js.Any])
    
    inline def setDeployment_url(value: String): Self = StObject.set(x, "deployment_url", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setEnvironment(value: String): Self = StObject.set(x, "environment", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentUndefined: Self = StObject.set(x, "environment", js.undefined)
    
    inline def setEnvironment_url(value: String): Self = StObject.set(x, "environment_url", value.asInstanceOf[js.Any])
    
    inline def setEnvironment_urlUndefined: Self = StObject.set(x, "environment_url", js.undefined)
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLog_url(value: String): Self = StObject.set(x, "log_url", value.asInstanceOf[js.Any])
    
    inline def setLog_urlUndefined: Self = StObject.set(x, "log_url", js.undefined)
    
    inline def setNode_id(value: String): Self = StObject.set(x, "node_id", value.asInstanceOf[js.Any])
    
    inline def setPerformed_via_github_app(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['nullable-integration'] */ js.Any
    ): Self = StObject.set(x, "performed_via_github_app", value.asInstanceOf[js.Any])
    
    inline def setPerformed_via_github_appUndefined: Self = StObject.set(x, "performed_via_github_app", js.undefined)
    
    inline def setRepository_url(value: String): Self = StObject.set(x, "repository_url", value.asInstanceOf[js.Any])
    
    inline def setState(value: error | failure | inactive | pending | success | queued_ | in_progress): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setTarget_url(value: String): Self = StObject.set(x, "target_url", value.asInstanceOf[js.Any])
    
    inline def setUpdated_at(value: String): Self = StObject.set(x, "updated_at", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
