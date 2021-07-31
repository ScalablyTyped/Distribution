package typings.octokitTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Git extends StObject {
  
  var git: String
  
  var html: String
  
  var self: String
}
object Git {
  
  @scala.inline
  def apply(git: String, html: String, self: String): Git = {
    val __obj = js.Dynamic.literal(git = git.asInstanceOf[js.Any], html = html.asInstanceOf[js.Any], self = self.asInstanceOf[js.Any])
    __obj.asInstanceOf[Git]
  }
  
  @scala.inline
  implicit class GitMutableBuilder[Self <: Git] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGit(value: String): Self = StObject.set(x, "git", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHtml(value: String): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelf(value: String): Self = StObject.set(x, "self", value.asInstanceOf[js.Any])
  }
}
