package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Issuecommenturl extends StObject {
  
  /**
    * Format: uri
    * @description The API URL to get the issue comment where the secret was detected.
    * @example https://api.github.com/repos/octocat/Hello-World/issues/comments/1081119451
    */
  var issue_comment_url: String
}
object Issuecommenturl {
  
  inline def apply(issue_comment_url: String): Issuecommenturl = {
    val __obj = js.Dynamic.literal(issue_comment_url = issue_comment_url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Issuecommenturl]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Issuecommenturl] (val x: Self) extends AnyVal {
    
    inline def setIssue_comment_url(value: String): Self = StObject.set(x, "issue_comment_url", value.asInstanceOf[js.Any])
  }
}
