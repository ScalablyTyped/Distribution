package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersQueryOrderPagePerpageQ extends StObject {
  
  /**
    * Find commits via various criteria on the default branch (usually `master`). This method returns up to 100 results [per page](https://docs.github.com/rest/overview/resources-in-the-rest-api#pagination).
    *
    * When searching for commits, you can get text match metadata for the **message** field when you provide the `text-match` media type. For more details about how to receive highlighted search results, see [Text match
    * metadata](https://docs.github.com/rest/reference/search#text-match-metadata).
    *
    * For example, if you want to find commits related to CSS in the [octocat/Spoon-Knife](https://github.com/octocat/Spoon-Knife) repository. Your query would look something like this:
    *
    * `q=repo:octocat/Spoon-Knife+css`
    */
  var get: ParametersQueryOrderPagePerpageQ
}
object GetParametersQueryOrderPagePerpageQ {
  
  inline def apply(get: ParametersQueryOrderPagePerpageQ): GetParametersQueryOrderPagePerpageQ = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersQueryOrderPagePerpageQ]
  }
  
  extension [Self <: GetParametersQueryOrderPagePerpageQ](x: Self) {
    
    inline def setGet(value: ParametersQueryOrderPagePerpageQ): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
