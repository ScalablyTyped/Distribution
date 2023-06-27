package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Includesparents extends StObject {
  
  /** @description Include rulesets configured at higher levels that apply to this repository */
  var includes_parents: js.UndefOr[Boolean] = js.undefined
  
  var page: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['page'] */ js.Any
  ] = js.undefined
  
  var per_page: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['per-page'] */ js.Any
  ] = js.undefined
}
object Includesparents {
  
  inline def apply(): Includesparents = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Includesparents]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Includesparents] (val x: Self) extends AnyVal {
    
    inline def setIncludes_parents(value: Boolean): Self = StObject.set(x, "includes_parents", value.asInstanceOf[js.Any])
    
    inline def setIncludes_parentsUndefined: Self = StObject.set(x, "includes_parents", js.undefined)
    
    inline def setPage(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['page'] */ js.Any
    ): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    inline def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
    
    inline def setPer_page(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['per-page'] */ js.Any
    ): Self = StObject.set(x, "per_page", value.asInstanceOf[js.Any])
    
    inline def setPer_pageUndefined: Self = StObject.set(x, "per_page", js.undefined)
  }
}
