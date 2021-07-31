package typings.normalizeJss.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextTransform extends StObject {
  
  var textTransform: String
}
object TextTransform {
  
  @scala.inline
  def apply(textTransform: String): TextTransform = {
    val __obj = js.Dynamic.literal(textTransform = textTransform.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextTransform]
  }
  
  @scala.inline
  implicit class TextTransformMutableBuilder[Self <: TextTransform] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTextTransform(value: String): Self = StObject.set(x, "textTransform", value.asInstanceOf[js.Any])
  }
}
