package typings.openui5.anon

import typings.openui5.sapMTokenMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeyCode extends StObject {
  
  /**
    * Keycode of the key pressed for deletion (backspace or delete).
    */
  var keyCode: js.UndefOr[Double] = js.undefined
  
  /**
    * The array of tokens that are removed.
    */
  var tokens: js.UndefOr[js.Array[default]] = js.undefined
}
object KeyCode {
  
  inline def apply(): KeyCode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KeyCode]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: KeyCode] (val x: Self) extends AnyVal {
    
    inline def setKeyCode(value: Double): Self = StObject.set(x, "keyCode", value.asInstanceOf[js.Any])
    
    inline def setKeyCodeUndefined: Self = StObject.set(x, "keyCode", js.undefined)
    
    inline def setTokens(value: js.Array[default]): Self = StObject.set(x, "tokens", value.asInstanceOf[js.Any])
    
    inline def setTokensUndefined: Self = StObject.set(x, "tokens", js.undefined)
    
    inline def setTokensVarargs(value: default*): Self = StObject.set(x, "tokens", js.Array(value*))
  }
}
