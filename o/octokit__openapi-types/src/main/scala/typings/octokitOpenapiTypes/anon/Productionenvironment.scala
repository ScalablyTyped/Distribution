package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Productionenvironment extends StObject {
  
  /**
    * Format: date-time
    * @example 2012-07-20T01:19:13Z
    */
  var created_at: String
  
  /** @example Deploy request from hubot */
  var description: String | Null
  
  /**
    * @description Name for the target deployment environment.
    * @example production
    */
  var environment: String
  
  /**
    * @description Unique identifier of the deployment
    * @example 42
    */
  var id: Double
  
  /** @example MDEwOkRlcGxveW1lbnQx */
  var node_id: String
  
  /** @example staging */
  var original_environment: js.UndefOr[String] = js.undefined
  
  var performed_via_github_app: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['nullable-integration'] */ js.Any
  ] = js.undefined
  
  /**
    * @description Specifies if the given environment is one that end-users directly interact with. Default: false.
    * @example true
    */
  var production_environment: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Format: uri
    * @example https://api.github.com/repos/octocat/example
    */
  var repository_url: String
  
  /**
    * Format: uri
    * @example https://api.github.com/repos/octocat/example/deployments/1/statuses
    */
  var statuses_url: String
  
  /**
    * @description Parameter to specify a task to execute
    * @example deploy
    */
  var task: String
  
  /**
    * @description Specifies if the given environment is will no longer exist at some point in the future. Default: false.
    * @example true
    */
  var transient_environment: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Format: date-time
    * @example 2012-07-20T01:19:13Z
    */
  var updated_at: String
  
  /**
    * Format: uri
    * @example https://api.github.com/repos/octocat/example/deployments/1
    */
  var url: String
}
object Productionenvironment {
  
  inline def apply(
    created_at: String,
    environment: String,
    id: Double,
    node_id: String,
    repository_url: String,
    statuses_url: String,
    task: String,
    updated_at: String,
    url: String
  ): Productionenvironment = {
    val __obj = js.Dynamic.literal(created_at = created_at.asInstanceOf[js.Any], environment = environment.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], node_id = node_id.asInstanceOf[js.Any], repository_url = repository_url.asInstanceOf[js.Any], statuses_url = statuses_url.asInstanceOf[js.Any], task = task.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], description = null)
    __obj.asInstanceOf[Productionenvironment]
  }
  
  extension [Self <: Productionenvironment](x: Self) {
    
    inline def setCreated_at(value: String): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setEnvironment(value: String): Self = StObject.set(x, "environment", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setNode_id(value: String): Self = StObject.set(x, "node_id", value.asInstanceOf[js.Any])
    
    inline def setOriginal_environment(value: String): Self = StObject.set(x, "original_environment", value.asInstanceOf[js.Any])
    
    inline def setOriginal_environmentUndefined: Self = StObject.set(x, "original_environment", js.undefined)
    
    inline def setPerformed_via_github_app(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['nullable-integration'] */ js.Any
    ): Self = StObject.set(x, "performed_via_github_app", value.asInstanceOf[js.Any])
    
    inline def setPerformed_via_github_appUndefined: Self = StObject.set(x, "performed_via_github_app", js.undefined)
    
    inline def setProduction_environment(value: Boolean): Self = StObject.set(x, "production_environment", value.asInstanceOf[js.Any])
    
    inline def setProduction_environmentUndefined: Self = StObject.set(x, "production_environment", js.undefined)
    
    inline def setRepository_url(value: String): Self = StObject.set(x, "repository_url", value.asInstanceOf[js.Any])
    
    inline def setStatuses_url(value: String): Self = StObject.set(x, "statuses_url", value.asInstanceOf[js.Any])
    
    inline def setTask(value: String): Self = StObject.set(x, "task", value.asInstanceOf[js.Any])
    
    inline def setTransient_environment(value: Boolean): Self = StObject.set(x, "transient_environment", value.asInstanceOf[js.Any])
    
    inline def setTransient_environmentUndefined: Self = StObject.set(x, "transient_environment", js.undefined)
    
    inline def setUpdated_at(value: String): Self = StObject.set(x, "updated_at", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
