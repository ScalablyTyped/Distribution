package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Issuebodyurl extends StObject {
  
  /**
    * Format: uri
    * @description The API URL to get the issue where the secret was detected.
    * @example https://api.github.com/repos/octocat/Hello-World/issues/1347
    */
  var issue_body_url: String
}
object Issuebodyurl {
  
  inline def apply(issue_body_url: String): Issuebodyurl = {
    val __obj = js.Dynamic.literal(issue_body_url = issue_body_url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Issuebodyurl]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Issuebodyurl] (val x: Self) extends AnyVal {
    
    inline def setIssue_body_url(value: String): Self = StObject.set(x, "issue_body_url", value.asInstanceOf[js.Any])
  }
}
