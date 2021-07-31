package typings.opentypeJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Encoding extends StObject {
  
  def charToGlyphIndex(c: String): Double
  
  var charset: String
  
  var font: Font
}
object Encoding {
  
  @scala.inline
  def apply(charToGlyphIndex: String => Double, charset: String, font: Font): Encoding = {
    val __obj = js.Dynamic.literal(charToGlyphIndex = js.Any.fromFunction1(charToGlyphIndex), charset = charset.asInstanceOf[js.Any], font = font.asInstanceOf[js.Any])
    __obj.asInstanceOf[Encoding]
  }
  
  @scala.inline
  implicit class EncodingMutableBuilder[Self <: Encoding] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCharToGlyphIndex(value: String => Double): Self = StObject.set(x, "charToGlyphIndex", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCharset(value: String): Self = StObject.set(x, "charset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFont(value: Font): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
  }
}
