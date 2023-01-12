package typings.parse5.distCommonTokenMod

import typings.parse5.distCommonTokenMod.TokenType.CHARACTER
import typings.parse5.distCommonTokenMod.TokenType.NULL_CHARACTER
import typings.parse5.distCommonTokenMod.TokenType.WHITESPACE_CHARACTER
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CharacterToken
  extends StObject
     with TokenBase
     with Token {
  
  var chars: String
  
  @JSName("type")
  var type_CharacterToken: CHARACTER | NULL_CHARACTER | WHITESPACE_CHARACTER
}
object CharacterToken {
  
  inline def apply(chars: String, `type`: CHARACTER | NULL_CHARACTER | WHITESPACE_CHARACTER): CharacterToken = {
    val __obj = js.Dynamic.literal(chars = chars.asInstanceOf[js.Any], location = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CharacterToken]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CharacterToken] (val x: Self) extends AnyVal {
    
    inline def setChars(value: String): Self = StObject.set(x, "chars", value.asInstanceOf[js.Any])
    
    inline def setType(value: CHARACTER | NULL_CHARACTER | WHITESPACE_CHARACTER): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
