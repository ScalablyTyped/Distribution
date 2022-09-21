package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CountFilter extends StObject {
  
  /** Used for pagination: the number of results to return. */
  var count: js.UndefOr[Double] = js.undefined
  
  /**
    * Filters results using the equals query parameter operator (`eq`). You can filter results that are equal to `id`, `userName`, `emails`, and `external_id`. For example, to search for an identity with the `userName` Octocat, you would use this query:
    *
    * `?filter=userName%20eq%20\"Octocat\"`.
    *
    * To filter results for the identity with the email `octocat@github.com`, you would use this query:
    *
    * `?filter=emails%20eq%20\"octocat@github.com\"`.
    */
  var filter: js.UndefOr[String] = js.undefined
  
  /** Used for pagination: the index of the first result to return. */
  var startIndex: js.UndefOr[Double] = js.undefined
}
object CountFilter {
  
  inline def apply(): CountFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CountFilter]
  }
  
  extension [Self <: CountFilter](x: Self) {
    
    inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    
    inline def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setStartIndex(value: Double): Self = StObject.set(x, "startIndex", value.asInstanceOf[js.Any])
    
    inline def setStartIndexUndefined: Self = StObject.set(x, "startIndex", js.undefined)
  }
}
