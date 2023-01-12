package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersQueryPagePerpageQ extends StObject {
  
  /**
    * Find topics via various criteria. Results are sorted by best match. This method returns up to 100 results [per page](https://docs.github.com/rest/overview/resources-in-the-rest-api#pagination). See "[Searching topics](https://docs.github.com/articles/searching-topics/)" for a detailed list of qualifiers.
    *
    * When searching for topics, you can get text match metadata for the topic's **short\_description**, **description**, **name**, or **display\_name** field when you pass the `text-match` media type. For more details about how to receive highlighted search results, see [Text match metadata](https://docs.github.com/rest/reference/search#text-match-metadata).
    *
    * For example, if you want to search for topics related to Ruby that are featured on https://github.com/topics. Your query might look like this:
    *
    * `q=ruby+is:featured`
    *
    * This query searches for topics with the keyword `ruby` and limits the results to find only topics that are featured. The topics that are the best match for the query appear first in the search results.
    */
  var get: ParametersQueryPagePerpageQ
}
object GetParametersQueryPagePerpageQ {
  
  inline def apply(get: ParametersQueryPagePerpageQ): GetParametersQueryPagePerpageQ = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersQueryPagePerpageQ]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetParametersQueryPagePerpageQ] (val x: Self) extends AnyVal {
    
    inline def setGet(value: ParametersQueryPagePerpageQ): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
