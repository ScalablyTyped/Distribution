package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Environmenturl extends StObject {
  
  var created_at: String
  
  /** User */
  var creator: Deleted | Null
  
  /** Format: uri */
  var deployment_url: String
  
  /** @description The optional human-readable description added to the status. */
  var description: String
  
  var environment: String
  
  /** Format: uri */
  var environment_url: js.UndefOr[String] = js.undefined
  
  var id: Double
  
  /** Format: uri */
  var log_url: js.UndefOr[String] = js.undefined
  
  var node_id: String
  
  /**
    * App
    * @description GitHub apps are a new way to extend GitHub. They can be installed directly on organizations and user accounts and granted access to specific repositories. They come with granular permissions and built-in webhooks. GitHub apps are first class actors within GitHub.
    */
  var performed_via_github_app: js.UndefOr[OwnerPermissions | Null] = js.undefined
  
  /** Format: uri */
  var repository_url: String
  
  /** @description The new state. Can be `pending`, `success`, `failure`, or `error`. */
  var state: String
  
  /** @description The optional link added to the status. */
  var target_url: String
  
  var updated_at: String
  
  /** Format: uri */
  var url: String
}
object Environmenturl {
  
  inline def apply(
    created_at: String,
    deployment_url: String,
    description: String,
    environment: String,
    id: Double,
    node_id: String,
    repository_url: String,
    state: String,
    target_url: String,
    updated_at: String,
    url: String
  ): Environmenturl = {
    val __obj = js.Dynamic.literal(created_at = created_at.asInstanceOf[js.Any], deployment_url = deployment_url.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], environment = environment.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], node_id = node_id.asInstanceOf[js.Any], repository_url = repository_url.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], target_url = target_url.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], creator = null)
    __obj.asInstanceOf[Environmenturl]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Environmenturl] (val x: Self) extends AnyVal {
    
    inline def setCreated_at(value: String): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: Deleted): Self = StObject.set(x, "creator", value.asInstanceOf[js.Any])
    
    inline def setCreatorNull: Self = StObject.set(x, "creator", null)
    
    inline def setDeployment_url(value: String): Self = StObject.set(x, "deployment_url", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setEnvironment(value: String): Self = StObject.set(x, "environment", value.asInstanceOf[js.Any])
    
    inline def setEnvironment_url(value: String): Self = StObject.set(x, "environment_url", value.asInstanceOf[js.Any])
    
    inline def setEnvironment_urlUndefined: Self = StObject.set(x, "environment_url", js.undefined)
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLog_url(value: String): Self = StObject.set(x, "log_url", value.asInstanceOf[js.Any])
    
    inline def setLog_urlUndefined: Self = StObject.set(x, "log_url", js.undefined)
    
    inline def setNode_id(value: String): Self = StObject.set(x, "node_id", value.asInstanceOf[js.Any])
    
    inline def setPerformed_via_github_app(value: OwnerPermissions): Self = StObject.set(x, "performed_via_github_app", value.asInstanceOf[js.Any])
    
    inline def setPerformed_via_github_appNull: Self = StObject.set(x, "performed_via_github_app", null)
    
    inline def setPerformed_via_github_appUndefined: Self = StObject.set(x, "performed_via_github_app", js.undefined)
    
    inline def setRepository_url(value: String): Self = StObject.set(x, "repository_url", value.asInstanceOf[js.Any])
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setTarget_url(value: String): Self = StObject.set(x, "target_url", value.asInstanceOf[js.Any])
    
    inline def setUpdated_at(value: String): Self = StObject.set(x, "updated_at", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
