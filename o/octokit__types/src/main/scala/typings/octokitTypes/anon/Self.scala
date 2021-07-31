package typings.octokitTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Self extends StObject {
  
  var html: String
  
  var self: String
}
object Self {
  
  @scala.inline
  def apply(html: String, self: String): Self = {
    val __obj = js.Dynamic.literal(html = html.asInstanceOf[js.Any], self = self.asInstanceOf[js.Any])
    __obj.asInstanceOf[Self]
  }
  
  @scala.inline
  implicit class SelfMutableBuilder[Self_ <: Self] (val x: Self_) extends AnyVal {
    
    @scala.inline
    def setHtml(value: String): Self_ = StObject.set(x, "html", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelf(value: String): Self_ = StObject.set(x, "self", value.asInstanceOf[js.Any])
  }
}
