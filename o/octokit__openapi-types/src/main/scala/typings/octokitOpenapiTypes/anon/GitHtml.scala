package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GitHtml extends StObject {
  
  var git: js.UndefOr[String] = js.undefined
  
  var html: js.UndefOr[String] = js.undefined
  
  var self: js.UndefOr[String] = js.undefined
}
object GitHtml {
  
  inline def apply(): GitHtml = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GitHtml]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GitHtml] (val x: Self) extends AnyVal {
    
    inline def setGit(value: String): Self = StObject.set(x, "git", value.asInstanceOf[js.Any])
    
    inline def setGitUndefined: Self = StObject.set(x, "git", js.undefined)
    
    inline def setHtml(value: String): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
    
    inline def setHtmlUndefined: Self = StObject.set(x, "html", js.undefined)
    
    inline def setSelf(value: String): Self = StObject.set(x, "self", value.asInstanceOf[js.Any])
    
    inline def setSelfUndefined: Self = StObject.set(x, "self", js.undefined)
  }
}
