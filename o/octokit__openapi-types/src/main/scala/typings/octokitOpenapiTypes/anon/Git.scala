package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Git extends StObject {
  
  /** Format: uri */
  var git: String | Null
  
  /** Format: uri */
  var html: String | Null
  
  /** Format: uri */
  var self: String
}
object Git {
  
  inline def apply(self: String): Git = {
    val __obj = js.Dynamic.literal(self = self.asInstanceOf[js.Any], git = null, html = null)
    __obj.asInstanceOf[Git]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Git] (val x: Self) extends AnyVal {
    
    inline def setGit(value: String): Self = StObject.set(x, "git", value.asInstanceOf[js.Any])
    
    inline def setGitNull: Self = StObject.set(x, "git", null)
    
    inline def setHtml(value: String): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
    
    inline def setHtmlNull: Self = StObject.set(x, "html", null)
    
    inline def setSelf(value: String): Self = StObject.set(x, "self", value.asInstanceOf[js.Any])
  }
}
