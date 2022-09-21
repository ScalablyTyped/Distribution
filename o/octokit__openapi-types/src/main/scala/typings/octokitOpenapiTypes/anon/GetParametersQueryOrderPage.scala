package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersQueryOrderPage extends StObject {
  
  /**
    * Find issues by state and keyword. This method returns up to 100 results [per page](https://docs.github.com/rest/overview/resources-in-the-rest-api#pagination).
    *
    * When searching for issues, you can get text match metadata for the issue **title**, issue **body**, and issue **comment body** fields when you pass the `text-match` media type. For more details about how to receive highlighted
    * search results, see [Text match metadata](https://docs.github.com/rest/reference/search#text-match-metadata).
    *
    * For example, if you want to find the oldest unresolved Python bugs on Windows. Your query might look something like this.
    *
    * `q=windows+label:bug+language:python+state:open&sort=created&order=asc`
    *
    * This query searches for the keyword `windows`, within any open issue that is labeled as `bug`. The search runs across repositories whose primary language is Python. The results are sorted by creation date in ascending order, which means the oldest issues appear first in the search results.
    *
    * **Note:** For [user-to-server](https://docs.github.com/developers/apps/identifying-and-authorizing-users-for-github-apps#user-to-server-requests) GitHub App requests, you can't retrieve a combination of issues and pull requests in a single query. Requests that don't include the `is:issue` or `is:pull-request` qualifier will receive an HTTP `422 Unprocessable Entity` response. To get results for both issues and pull requests, you must send separate queries for issues and pull requests. For more information about the `is` qualifier, see "[Searching only issues or pull requests](https://docs.github.com/github/searching-for-information-on-github/searching-issues-and-pull-requests#search-only-issues-or-pull-requests)."
    */
  var get: ParametersQueryOrderPage
}
object GetParametersQueryOrderPage {
  
  inline def apply(get: ParametersQueryOrderPage): GetParametersQueryOrderPage = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersQueryOrderPage]
  }
  
  extension [Self <: GetParametersQueryOrderPage](x: Self) {
    
    inline def setGet(value: ParametersQueryOrderPage): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
