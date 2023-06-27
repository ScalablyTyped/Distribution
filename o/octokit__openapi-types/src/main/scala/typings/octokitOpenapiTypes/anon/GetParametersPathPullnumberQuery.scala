package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersPathPullnumberQuery extends StObject {
  
  /**
    * List review comments on a pull request
    * @description Lists all review comments for a pull request. By default, review comments are in ascending order by ID.
    */
  var get: ParametersPathPullnumberQuery
  
  /**
    * Create a review comment for a pull request
    * @description
    * Creates a review comment in the pull request diff. To add a regular comment to a pull request timeline, see "[Create an issue comment](https://docs.github.com/rest/reference/issues#create-an-issue-comment)." We recommend creating a review comment using `line`, `side`, and optionally `start_line` and `start_side` if your comment applies to more than one line in the pull request diff.
    *
    * The `position` parameter is deprecated. If you use `position`, the `line`, `side`, `start_line`, and `start_side` parameters are not required.
    *
    * **Note:** The position value equals the number of lines down from the first "@@" hunk header in the file you want to add a comment. The line just below the "@@" line is position 1, the next line is position 2, and so on. The position in the diff continues to increase through lines of whitespace and additional hunks until the beginning of a new file.
    *
    * This endpoint triggers [notifications](https://docs.github.com/github/managing-subscriptions-and-notifications-on-github/about-notifications). Creating content too quickly using this endpoint may result in secondary rate limiting. See "[Secondary rate limits](https://docs.github.com/rest/overview/resources-in-the-rest-api#secondary-rate-limits)" and "[Dealing with secondary rate limits](https://docs.github.com/rest/guides/best-practices-for-integrators#dealing-with-secondary-rate-limits)" for details.
    */
  var post: RequestBodyContentApplicationjsonCommitid
}
object GetParametersPathPullnumberQuery {
  
  inline def apply(get: ParametersPathPullnumberQuery, post: RequestBodyContentApplicationjsonCommitid): GetParametersPathPullnumberQuery = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any], post = post.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersPathPullnumberQuery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetParametersPathPullnumberQuery] (val x: Self) extends AnyVal {
    
    inline def setGet(value: ParametersPathPullnumberQuery): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPost(value: RequestBodyContentApplicationjsonCommitid): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
  }
}
