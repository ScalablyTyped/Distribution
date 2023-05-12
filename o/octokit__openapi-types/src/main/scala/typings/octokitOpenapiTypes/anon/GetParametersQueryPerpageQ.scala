package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersQueryPerpageQ extends StObject {
  
  /**
    * Search labels
    * @description Find labels in a repository with names or descriptions that match search keywords. Returns up to 100 results [per page](https://docs.github.com/rest/overview/resources-in-the-rest-api#pagination).
    *
    * When searching for labels, you can get text match metadata for the label **name** and **description** fields when you pass the `text-match` media type. For more details about how to receive highlighted search results, see [Text match metadata](https://docs.github.com/rest/reference/search#text-match-metadata).
    *
    * For example, if you want to find labels in the `linguist` repository that match `bug`, `defect`, or `enhancement`. Your query might look like this:
    *
    * `q=bug+defect+enhancement&repository_id=64778136`
    *
    * The labels that best match the query appear first in the search results.
    */
  var get: ParametersQueryPerpageQ
}
object GetParametersQueryPerpageQ {
  
  inline def apply(get: ParametersQueryPerpageQ): GetParametersQueryPerpageQ = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersQueryPerpageQ]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetParametersQueryPerpageQ] (val x: Self) extends AnyVal {
    
    inline def setGet(value: ParametersQueryPerpageQ): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
