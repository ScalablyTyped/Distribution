package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Issuetitleurl extends StObject {
  
  /**
    * Format: uri
    * @description The API URL to get the issue where the secret was detected.
    * @example https://api.github.com/repos/octocat/Hello-World/issues/1347
    */
  var issue_title_url: String
}
object Issuetitleurl {
  
  inline def apply(issue_title_url: String): Issuetitleurl = {
    val __obj = js.Dynamic.literal(issue_title_url = issue_title_url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Issuetitleurl]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Issuetitleurl] (val x: Self) extends AnyVal {
    
    inline def setIssue_title_url(value: String): Self = StObject.set(x, "issue_title_url", value.asInstanceOf[js.Any])
  }
}
