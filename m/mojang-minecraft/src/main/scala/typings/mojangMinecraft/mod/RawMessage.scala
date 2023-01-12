package typings.mojangMinecraft.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RawMessage extends StObject {
  
  /**
    * A list of text objects used to build a message.
    */
  var rawtext: RawMessage | js.Array[String]
  
  /**
    * Contains plain text to display directly. Only valid when
    * used as a sub member in a parent _rawtext_ or _with_ member.
    */
  var text: js.UndefOr[String] = js.undefined
  
  /**
    * Contains a resource pack translation identifier that can be
    * used to translate text in the player's selected language.
    */
  var translate: js.UndefOr[String] = js.undefined
  
  /**
    * A list of text object arguments that can be used to fill
    * values in the _translate_ text. Ignored when _translate_ is
    * not present.
    */
  var `with`: RawMessage | js.Array[String]
}
object RawMessage {
  
  inline def apply(rawtext: RawMessage | js.Array[String], `with`: RawMessage | js.Array[String]): RawMessage = {
    val __obj = js.Dynamic.literal(rawtext = rawtext.asInstanceOf[js.Any])
    __obj.updateDynamic("with")(`with`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RawMessage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RawMessage] (val x: Self) extends AnyVal {
    
    inline def setRawtext(value: RawMessage | js.Array[String]): Self = StObject.set(x, "rawtext", value.asInstanceOf[js.Any])
    
    inline def setRawtextVarargs(value: String*): Self = StObject.set(x, "rawtext", js.Array(value*))
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    inline def setTranslate(value: String): Self = StObject.set(x, "translate", value.asInstanceOf[js.Any])
    
    inline def setTranslateUndefined: Self = StObject.set(x, "translate", js.undefined)
    
    inline def setWith(value: RawMessage | js.Array[String]): Self = StObject.set(x, "with", value.asInstanceOf[js.Any])
    
    inline def setWithVarargs(value: String*): Self = StObject.set(x, "with", js.Array(value*))
  }
}
