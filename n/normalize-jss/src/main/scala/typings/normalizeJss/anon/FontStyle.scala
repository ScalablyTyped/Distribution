package typings.normalizeJss.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FontStyle extends StObject {
  
  var fontStyle: String
}
object FontStyle {
  
  @scala.inline
  def apply(fontStyle: String): FontStyle = {
    val __obj = js.Dynamic.literal(fontStyle = fontStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[FontStyle]
  }
  
  @scala.inline
  implicit class FontStyleMutableBuilder[Self <: FontStyle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFontStyle(value: String): Self = StObject.set(x, "fontStyle", value.asInstanceOf[js.Any])
  }
}
