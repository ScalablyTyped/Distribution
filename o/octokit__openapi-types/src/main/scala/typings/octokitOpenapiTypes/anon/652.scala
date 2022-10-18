package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `652` extends StObject {
  
  /** The number of results per page (max 100). */
  var per_page: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['per-page'] */ js.Any
  ] = js.undefined
  
  /** A user ID. Only return users with an ID greater than this ID. */
  var since: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['since-user'] */ js.Any
  ] = js.undefined
}
object `652` {
  
  inline def apply(): `652` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`652`]
  }
  
  extension [Self <: `652`](x: Self) {
    
    inline def setPer_page(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['per-page'] */ js.Any
    ): Self = StObject.set(x, "per_page", value.asInstanceOf[js.Any])
    
    inline def setPer_pageUndefined: Self = StObject.set(x, "per_page", js.undefined)
    
    inline def setSince(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['since-user'] */ js.Any
    ): Self = StObject.set(x, "since", value.asInstanceOf[js.Any])
    
    inline def setSinceUndefined: Self = StObject.set(x, "since", js.undefined)
  }
}
