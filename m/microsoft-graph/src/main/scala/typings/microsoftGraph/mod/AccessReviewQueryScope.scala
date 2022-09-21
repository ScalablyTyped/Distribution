package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccessReviewQueryScope
  extends StObject
     with AccessReviewScope {
  
  // The query representing what will be reviewed in an access review.
  var query: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * In the scenario where reviewers need to be specified dynamically, this property is used to indicate the relative source
    * of the query. This property is only required if a relative query is specified. For example, ./manager.
    */
  var queryRoot: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Indicates the type of query. Types include MicrosoftGraph and ARM.
  var queryType: js.UndefOr[NullableOption[String]] = js.undefined
}
object AccessReviewQueryScope {
  
  inline def apply(): AccessReviewQueryScope = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccessReviewQueryScope]
  }
  
  extension [Self <: AccessReviewQueryScope](x: Self) {
    
    inline def setQuery(value: NullableOption[String]): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryNull: Self = StObject.set(x, "query", null)
    
    inline def setQueryRoot(value: NullableOption[String]): Self = StObject.set(x, "queryRoot", value.asInstanceOf[js.Any])
    
    inline def setQueryRootNull: Self = StObject.set(x, "queryRoot", null)
    
    inline def setQueryRootUndefined: Self = StObject.set(x, "queryRoot", js.undefined)
    
    inline def setQueryType(value: NullableOption[String]): Self = StObject.set(x, "queryType", value.asInstanceOf[js.Any])
    
    inline def setQueryTypeNull: Self = StObject.set(x, "queryType", null)
    
    inline def setQueryTypeUndefined: Self = StObject.set(x, "queryType", js.undefined)
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
  }
}
