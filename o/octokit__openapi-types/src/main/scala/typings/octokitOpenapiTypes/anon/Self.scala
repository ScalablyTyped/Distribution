package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Self extends StObject {
  
  var git: js.UndefOr[String] = js.undefined
  
  var html: js.UndefOr[String] = js.undefined
  
  var self: js.UndefOr[String] = js.undefined
}
object Self {
  
  inline def apply(): Self = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Self]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self_ <: Self] (val x: Self_) extends AnyVal {
    
    inline def setGit(value: String): Self_ = StObject.set(x, "git", value.asInstanceOf[js.Any])
    
    inline def setGitUndefined: Self_ = StObject.set(x, "git", js.undefined)
    
    inline def setHtml(value: String): Self_ = StObject.set(x, "html", value.asInstanceOf[js.Any])
    
    inline def setHtmlUndefined: Self_ = StObject.set(x, "html", js.undefined)
    
    inline def setSelf(value: String): Self_ = StObject.set(x, "self", value.asInstanceOf[js.Any])
    
    inline def setSelfUndefined: Self_ = StObject.set(x, "self", js.undefined)
  }
}
