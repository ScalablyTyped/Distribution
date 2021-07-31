package typings.normalizeJss.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FontSizeString extends StObject {
  
  var fontSize: String
}
object FontSizeString {
  
  @scala.inline
  def apply(fontSize: String): FontSizeString = {
    val __obj = js.Dynamic.literal(fontSize = fontSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[FontSizeString]
  }
  
  @scala.inline
  implicit class FontSizeStringMutableBuilder[Self <: FontSizeString] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFontSize(value: String): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
  }
}
