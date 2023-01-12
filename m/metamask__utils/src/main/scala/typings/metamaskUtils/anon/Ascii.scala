package typings.metamaskUtils.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Ascii extends StObject {
  
  var ascii: String
  
  var mixed: String
  
  var specialCharacters: String
  
  var stringWithSpecialEscapedCharacters: String
  
  var utf8: String
}
object Ascii {
  
  inline def apply(
    ascii: String,
    mixed: String,
    specialCharacters: String,
    stringWithSpecialEscapedCharacters: String,
    utf8: String
  ): Ascii = {
    val __obj = js.Dynamic.literal(ascii = ascii.asInstanceOf[js.Any], mixed = mixed.asInstanceOf[js.Any], specialCharacters = specialCharacters.asInstanceOf[js.Any], stringWithSpecialEscapedCharacters = stringWithSpecialEscapedCharacters.asInstanceOf[js.Any], utf8 = utf8.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ascii]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Ascii] (val x: Self) extends AnyVal {
    
    inline def setAscii(value: String): Self = StObject.set(x, "ascii", value.asInstanceOf[js.Any])
    
    inline def setMixed(value: String): Self = StObject.set(x, "mixed", value.asInstanceOf[js.Any])
    
    inline def setSpecialCharacters(value: String): Self = StObject.set(x, "specialCharacters", value.asInstanceOf[js.Any])
    
    inline def setStringWithSpecialEscapedCharacters(value: String): Self = StObject.set(x, "stringWithSpecialEscapedCharacters", value.asInstanceOf[js.Any])
    
    inline def setUtf8(value: String): Self = StObject.set(x, "utf8", value.asInstanceOf[js.Any])
  }
}
