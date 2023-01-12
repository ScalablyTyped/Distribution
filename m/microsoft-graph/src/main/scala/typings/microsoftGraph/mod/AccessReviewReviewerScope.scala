package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccessReviewReviewerScope extends StObject {
  
  // The query specifying who will be the reviewer.
  var query: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * In the scenario where reviewers need to be specified dynamically, this property is used to indicate the relative source
    * of the query. This property is only required if a relative query, for example, ./manager, is specified. Possible value:
    * decisions.
    */
  var queryRoot: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The type of query. Examples include MicrosoftGraph and ARM.
  var queryType: js.UndefOr[NullableOption[String]] = js.undefined
}
object AccessReviewReviewerScope {
  
  inline def apply(): AccessReviewReviewerScope = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccessReviewReviewerScope]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AccessReviewReviewerScope] (val x: Self) extends AnyVal {
    
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
