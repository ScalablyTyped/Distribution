package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PerformedviagithubappProjectcard extends StObject {
  
  var actor: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['simple-user'] */ js.Any
  
  var commit_id: String | Null
  
  var commit_url: String | Null
  
  var created_at: String
  
  var event: String
  
  var id: Double
  
  var node_id: String
  
  var performed_via_github_app: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['nullable-integration'] */ js.Any
  
  var project_card: js.UndefOr[Projecturl] = js.undefined
  
  var url: String
}
object PerformedviagithubappProjectcard {
  
  inline def apply(
    actor: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['simple-user'] */ js.Any,
    created_at: String,
    event: String,
    id: Double,
    node_id: String,
    performed_via_github_app: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['nullable-integration'] */ js.Any,
    url: String
  ): PerformedviagithubappProjectcard = {
    val __obj = js.Dynamic.literal(actor = actor.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], node_id = node_id.asInstanceOf[js.Any], performed_via_github_app = performed_via_github_app.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], commit_id = null, commit_url = null)
    __obj.asInstanceOf[PerformedviagithubappProjectcard]
  }
  
  extension [Self <: PerformedviagithubappProjectcard](x: Self) {
    
    inline def setActor(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['simple-user'] */ js.Any
    ): Self = StObject.set(x, "actor", value.asInstanceOf[js.Any])
    
    inline def setCommit_id(value: String): Self = StObject.set(x, "commit_id", value.asInstanceOf[js.Any])
    
    inline def setCommit_idNull: Self = StObject.set(x, "commit_id", null)
    
    inline def setCommit_url(value: String): Self = StObject.set(x, "commit_url", value.asInstanceOf[js.Any])
    
    inline def setCommit_urlNull: Self = StObject.set(x, "commit_url", null)
    
    inline def setCreated_at(value: String): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
    
    inline def setEvent(value: String): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setNode_id(value: String): Self = StObject.set(x, "node_id", value.asInstanceOf[js.Any])
    
    inline def setPerformed_via_github_app(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['nullable-integration'] */ js.Any
    ): Self = StObject.set(x, "performed_via_github_app", value.asInstanceOf[js.Any])
    
    inline def setProject_card(value: Projecturl): Self = StObject.set(x, "project_card", value.asInstanceOf[js.Any])
    
    inline def setProject_cardUndefined: Self = StObject.set(x, "project_card", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
