package typings.octokitOpenapiTypes.anon

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Statusesurl extends StObject {
  
  var created_at: String
  
  /** User */
  var creator: Deleted | Null
  
  var description: String | Null
  
  var environment: String
  
  var id: Double
  
  var node_id: String
  
  var original_environment: String
  
  var payload: (Record[String, scala.Nothing]) | String
  
  /**
    * App
    * @description GitHub apps are a new way to extend GitHub. They can be installed directly on organizations and user accounts and granted access to specific repositories. They come with granular permissions and built-in webhooks. GitHub apps are first class actors within GitHub.
    */
  var performed_via_github_app: js.UndefOr[ExternalurlHtmlurl | Null] = js.undefined
  
  var production_environment: js.UndefOr[Boolean] = js.undefined
  
  var ref: String
  
  /** Format: uri */
  var repository_url: String
  
  var sha: String
  
  /** Format: uri */
  var statuses_url: String
  
  var task: String
  
  var transient_environment: js.UndefOr[Boolean] = js.undefined
  
  var updated_at: String
  
  /** Format: uri */
  var url: String
}
object Statusesurl {
  
  inline def apply(
    created_at: String,
    environment: String,
    id: Double,
    node_id: String,
    original_environment: String,
    payload: (Record[String, scala.Nothing]) | String,
    ref: String,
    repository_url: String,
    sha: String,
    statuses_url: String,
    task: String,
    updated_at: String,
    url: String
  ): Statusesurl = {
    val __obj = js.Dynamic.literal(created_at = created_at.asInstanceOf[js.Any], environment = environment.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], node_id = node_id.asInstanceOf[js.Any], original_environment = original_environment.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any], repository_url = repository_url.asInstanceOf[js.Any], sha = sha.asInstanceOf[js.Any], statuses_url = statuses_url.asInstanceOf[js.Any], task = task.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], creator = null, description = null)
    __obj.asInstanceOf[Statusesurl]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Statusesurl] (val x: Self) extends AnyVal {
    
    inline def setCreated_at(value: String): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: Deleted): Self = StObject.set(x, "creator", value.asInstanceOf[js.Any])
    
    inline def setCreatorNull: Self = StObject.set(x, "creator", null)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setEnvironment(value: String): Self = StObject.set(x, "environment", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setNode_id(value: String): Self = StObject.set(x, "node_id", value.asInstanceOf[js.Any])
    
    inline def setOriginal_environment(value: String): Self = StObject.set(x, "original_environment", value.asInstanceOf[js.Any])
    
    inline def setPayload(value: (Record[String, scala.Nothing]) | String): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    inline def setPerformed_via_github_app(value: ExternalurlHtmlurl): Self = StObject.set(x, "performed_via_github_app", value.asInstanceOf[js.Any])
    
    inline def setPerformed_via_github_appNull: Self = StObject.set(x, "performed_via_github_app", null)
    
    inline def setPerformed_via_github_appUndefined: Self = StObject.set(x, "performed_via_github_app", js.undefined)
    
    inline def setProduction_environment(value: Boolean): Self = StObject.set(x, "production_environment", value.asInstanceOf[js.Any])
    
    inline def setProduction_environmentUndefined: Self = StObject.set(x, "production_environment", js.undefined)
    
    inline def setRef(value: String): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    inline def setRepository_url(value: String): Self = StObject.set(x, "repository_url", value.asInstanceOf[js.Any])
    
    inline def setSha(value: String): Self = StObject.set(x, "sha", value.asInstanceOf[js.Any])
    
    inline def setStatuses_url(value: String): Self = StObject.set(x, "statuses_url", value.asInstanceOf[js.Any])
    
    inline def setTask(value: String): Self = StObject.set(x, "task", value.asInstanceOf[js.Any])
    
    inline def setTransient_environment(value: Boolean): Self = StObject.set(x, "transient_environment", value.asInstanceOf[js.Any])
    
    inline def setTransient_environmentUndefined: Self = StObject.set(x, "transient_environment", js.undefined)
    
    inline def setUpdated_at(value: String): Self = StObject.set(x, "updated_at", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
