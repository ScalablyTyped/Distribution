package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Requiredconversationresolution extends StObject {
  
  var allow_deletions: js.UndefOr[EnabledBoolean] = js.undefined
  
  var allow_force_pushes: js.UndefOr[EnabledBoolean] = js.undefined
  
  var block_creations: js.UndefOr[EnabledBoolean] = js.undefined
  
  var enforce_admins: js.UndefOr[EnabledUrl] = js.undefined
  
  var required_conversation_resolution: js.UndefOr[`408`] = js.undefined
  
  var required_linear_history: js.UndefOr[EnabledBoolean] = js.undefined
  
  var required_pull_request_reviews: js.UndefOr[Requiredapprovingreviewcount] = js.undefined
  
  var required_signatures: js.UndefOr[EnabledUrl] = js.undefined
  
  var required_status_checks: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['status-check-policy'] */ js.Any
  ] = js.undefined
  
  var restrictions: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['branch-restriction-policy'] */ js.Any
  ] = js.undefined
  
  /** Format: uri */
  var url: String
}
object Requiredconversationresolution {
  
  inline def apply(url: String): Requiredconversationresolution = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Requiredconversationresolution]
  }
  
  extension [Self <: Requiredconversationresolution](x: Self) {
    
    inline def setAllow_deletions(value: EnabledBoolean): Self = StObject.set(x, "allow_deletions", value.asInstanceOf[js.Any])
    
    inline def setAllow_deletionsUndefined: Self = StObject.set(x, "allow_deletions", js.undefined)
    
    inline def setAllow_force_pushes(value: EnabledBoolean): Self = StObject.set(x, "allow_force_pushes", value.asInstanceOf[js.Any])
    
    inline def setAllow_force_pushesUndefined: Self = StObject.set(x, "allow_force_pushes", js.undefined)
    
    inline def setBlock_creations(value: EnabledBoolean): Self = StObject.set(x, "block_creations", value.asInstanceOf[js.Any])
    
    inline def setBlock_creationsUndefined: Self = StObject.set(x, "block_creations", js.undefined)
    
    inline def setEnforce_admins(value: EnabledUrl): Self = StObject.set(x, "enforce_admins", value.asInstanceOf[js.Any])
    
    inline def setEnforce_adminsUndefined: Self = StObject.set(x, "enforce_admins", js.undefined)
    
    inline def setRequired_conversation_resolution(value: `408`): Self = StObject.set(x, "required_conversation_resolution", value.asInstanceOf[js.Any])
    
    inline def setRequired_conversation_resolutionUndefined: Self = StObject.set(x, "required_conversation_resolution", js.undefined)
    
    inline def setRequired_linear_history(value: EnabledBoolean): Self = StObject.set(x, "required_linear_history", value.asInstanceOf[js.Any])
    
    inline def setRequired_linear_historyUndefined: Self = StObject.set(x, "required_linear_history", js.undefined)
    
    inline def setRequired_pull_request_reviews(value: Requiredapprovingreviewcount): Self = StObject.set(x, "required_pull_request_reviews", value.asInstanceOf[js.Any])
    
    inline def setRequired_pull_request_reviewsUndefined: Self = StObject.set(x, "required_pull_request_reviews", js.undefined)
    
    inline def setRequired_signatures(value: EnabledUrl): Self = StObject.set(x, "required_signatures", value.asInstanceOf[js.Any])
    
    inline def setRequired_signaturesUndefined: Self = StObject.set(x, "required_signatures", js.undefined)
    
    inline def setRequired_status_checks(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['status-check-policy'] */ js.Any
    ): Self = StObject.set(x, "required_status_checks", value.asInstanceOf[js.Any])
    
    inline def setRequired_status_checksUndefined: Self = StObject.set(x, "required_status_checks", js.undefined)
    
    inline def setRestrictions(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['branch-restriction-policy'] */ js.Any
    ): Self = StObject.set(x, "restrictions", value.asInstanceOf[js.Any])
    
    inline def setRestrictionsUndefined: Self = StObject.set(x, "restrictions", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
