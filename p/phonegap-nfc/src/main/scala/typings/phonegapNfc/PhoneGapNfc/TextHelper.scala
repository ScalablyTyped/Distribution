package typings.phonegapNfc.PhoneGapNfc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextHelper extends js.Object {
  
  /**
    * Decode a URI payload bytes
    * @param data
    */
  def decodePayload(data: js.Any): String = js.native
  
  /**
    * Encode text payload
    * @param text
    * @param lang
    * @param encoding
    */
  def encodePayload(text: String, lang: String, encoding: String): js.Array[Double] = js.native
}
object TextHelper {
  
  @scala.inline
  def apply(decodePayload: js.Any => String, encodePayload: (String, String, String) => js.Array[Double]): TextHelper = {
    val __obj = js.Dynamic.literal(decodePayload = js.Any.fromFunction1(decodePayload), encodePayload = js.Any.fromFunction3(encodePayload))
    __obj.asInstanceOf[TextHelper]
  }
  
  @scala.inline
  implicit class TextHelperOps[Self <: TextHelper] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDecodePayload(value: js.Any => String): Self = this.set("decodePayload", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEncodePayload(value: (String, String, String) => js.Array[Double]): Self = this.set("encodePayload", js.Any.fromFunction3(value))
  }
}
