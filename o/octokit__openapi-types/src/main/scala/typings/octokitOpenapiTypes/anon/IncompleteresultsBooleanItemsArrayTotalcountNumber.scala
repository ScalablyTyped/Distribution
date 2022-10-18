package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IncompleteresultsBooleanItemsArrayTotalcountNumber extends StObject {
  
  var incomplete_results: Boolean
  
  var items: js.Array[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['issue-search-result-item'] */ js.Any
  ]
  
  var total_count: Double
}
object IncompleteresultsBooleanItemsArrayTotalcountNumber {
  
  inline def apply(
    incomplete_results: Boolean,
    items: js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['issue-search-result-item'] */ js.Any
    ],
    total_count: Double
  ): IncompleteresultsBooleanItemsArrayTotalcountNumber = {
    val __obj = js.Dynamic.literal(incomplete_results = incomplete_results.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], total_count = total_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[IncompleteresultsBooleanItemsArrayTotalcountNumber]
  }
  
  extension [Self <: IncompleteresultsBooleanItemsArrayTotalcountNumber](x: Self) {
    
    inline def setIncomplete_results(value: Boolean): Self = StObject.set(x, "incomplete_results", value.asInstanceOf[js.Any])
    
    inline def setItems(
      value: js.Array[
          /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['issue-search-result-item'] */ js.Any
        ]
    ): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsVarargs(
      value: (/* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['issue-search-result-item'] */ js.Any)*
    ): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setTotal_count(value: Double): Self = StObject.set(x, "total_count", value.asInstanceOf[js.Any])
  }
}
