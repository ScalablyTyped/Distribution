package typings.octokitOpenapiTypes.anon

import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.admin
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.all
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.direct
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.maintain
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.outside
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.pull
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.push
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.triage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AffiliationPage extends StObject {
  
  /** @description Filter collaborators returned by their affiliation. `outside` means all outside collaborators of an organization-owned repository. `direct` means all collaborators with permissions to an organization-owned repository, regardless of organization membership status. `all` means all collaborators the authenticated user can see. */
  var affiliation: js.UndefOr[outside | direct | all] = js.undefined
  
  var page: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['page'] */ js.Any
  ] = js.undefined
  
  var per_page: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['per-page'] */ js.Any
  ] = js.undefined
  
  /** @description Filter collaborators by the permissions they have on the repository. If not specified, all collaborators will be returned. */
  var permission: js.UndefOr[pull | triage | push | maintain | admin] = js.undefined
}
object AffiliationPage {
  
  inline def apply(): AffiliationPage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AffiliationPage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AffiliationPage] (val x: Self) extends AnyVal {
    
    inline def setAffiliation(value: outside | direct | all): Self = StObject.set(x, "affiliation", value.asInstanceOf[js.Any])
    
    inline def setAffiliationUndefined: Self = StObject.set(x, "affiliation", js.undefined)
    
    inline def setPage(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['page'] */ js.Any
    ): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    inline def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
    
    inline def setPer_page(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['per-page'] */ js.Any
    ): Self = StObject.set(x, "per_page", value.asInstanceOf[js.Any])
    
    inline def setPer_pageUndefined: Self = StObject.set(x, "per_page", js.undefined)
    
    inline def setPermission(value: pull | triage | push | maintain | admin): Self = StObject.set(x, "permission", value.asInstanceOf[js.Any])
    
    inline def setPermissionUndefined: Self = StObject.set(x, "permission", js.undefined)
  }
}
