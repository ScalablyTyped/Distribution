package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IdOrg extends StObject {
  
  var actor: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['actor'] */ js.Any
  
  /** Format: date-time */
  var created_at: String | Null
  
  var id: String
  
  @JSName("org")
  var org_ : js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['actor'] */ js.Any
  ] = js.undefined
  
  var payload: Pages
  
  var public: Boolean
  
  var repo: NameUrl
  
  var `type`: String | Null
}
object IdOrg {
  
  inline def apply(
    actor: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['actor'] */ js.Any,
    id: String,
    payload: Pages,
    public: Boolean,
    repo: NameUrl
  ): IdOrg = {
    val __obj = js.Dynamic.literal(actor = actor.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any], public = public.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], created_at = null)
    __obj.updateDynamic("type")(null)
    __obj.asInstanceOf[IdOrg]
  }
  
  extension [Self <: IdOrg](x: Self) {
    
    inline def setActor(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['actor'] */ js.Any
    ): Self = StObject.set(x, "actor", value.asInstanceOf[js.Any])
    
    inline def setCreated_at(value: String): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
    
    inline def setCreated_atNull: Self = StObject.set(x, "created_at", null)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setOrg_(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['actor'] */ js.Any
    ): Self = StObject.set(x, "org", value.asInstanceOf[js.Any])
    
    inline def setOrg_Undefined: Self = StObject.set(x, "org", js.undefined)
    
    inline def setPayload(value: Pages): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    inline def setPublic(value: Boolean): Self = StObject.set(x, "public", value.asInstanceOf[js.Any])
    
    inline def setRepo(value: NameUrl): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
  }
}
