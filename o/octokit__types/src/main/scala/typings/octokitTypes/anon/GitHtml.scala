package typings.octokitTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GitHtml extends StObject {
  
  var git: String = js.native
  
  var html: String = js.native
  
  var self: String = js.native
}
object GitHtml {
  
  @scala.inline
  def apply(git: String, html: String, self: String): GitHtml = {
    val __obj = js.Dynamic.literal(git = git.asInstanceOf[js.Any], html = html.asInstanceOf[js.Any], self = self.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitHtml]
  }
  
  @scala.inline
  implicit class GitHtmlMutableBuilder[Self <: GitHtml] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGit(value: String): Self = StObject.set(x, "git", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHtml(value: String): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelf(value: String): Self = StObject.set(x, "self", value.asInstanceOf[js.Any])
  }
}
