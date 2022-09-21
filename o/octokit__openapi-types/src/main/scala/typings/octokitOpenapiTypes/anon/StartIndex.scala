package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartIndex extends StObject {
  
  /** Used for pagination: the number of results to return. */
  var count: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['count'] */ js.Any
  ] = js.undefined
  
  /** filter results */
  var filter: js.UndefOr[String] = js.undefined
  
  /** Used for pagination: the index of the first result to return. */
  var startIndex: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['start-index'] */ js.Any
  ] = js.undefined
}
object StartIndex {
  
  inline def apply(): StartIndex = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartIndex]
  }
  
  extension [Self <: StartIndex](x: Self) {
    
    inline def setCount(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['count'] */ js.Any
    ): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    
    inline def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setStartIndex(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['start-index'] */ js.Any
    ): Self = StObject.set(x, "startIndex", value.asInstanceOf[js.Any])
    
    inline def setStartIndexUndefined: Self = StObject.set(x, "startIndex", js.undefined)
  }
}
