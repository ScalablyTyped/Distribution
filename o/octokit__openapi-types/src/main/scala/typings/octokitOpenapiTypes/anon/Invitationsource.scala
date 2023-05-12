package typings.octokitOpenapiTypes.anon

import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.admin
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.all
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.billing_manager
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.direct_member
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.hiring_manager
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.member_
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.scim
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Invitationsource extends StObject {
  
  /** @description Filter invitations by their invitation source. */
  var invitation_source: js.UndefOr[all | member_ | scim] = js.undefined
  
  var page: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['page'] */ js.Any
  ] = js.undefined
  
  var per_page: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['per-page'] */ js.Any
  ] = js.undefined
  
  /** @description Filter invitations by their member role. */
  var role: js.UndefOr[all | admin | direct_member | billing_manager | hiring_manager] = js.undefined
}
object Invitationsource {
  
  inline def apply(): Invitationsource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Invitationsource]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Invitationsource] (val x: Self) extends AnyVal {
    
    inline def setInvitation_source(value: all | member_ | scim): Self = StObject.set(x, "invitation_source", value.asInstanceOf[js.Any])
    
    inline def setInvitation_sourceUndefined: Self = StObject.set(x, "invitation_source", js.undefined)
    
    inline def setPage(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['page'] */ js.Any
    ): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    inline def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
    
    inline def setPer_page(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['per-page'] */ js.Any
    ): Self = StObject.set(x, "per_page", value.asInstanceOf[js.Any])
    
    inline def setPer_pageUndefined: Self = StObject.set(x, "per_page", js.undefined)
    
    inline def setRole(value: all | admin | direct_member | billing_manager | hiring_manager): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
  }
}
