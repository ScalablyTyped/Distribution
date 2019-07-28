package typings.phonegapDashNfc.PhoneGapNfcNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextHelper extends js.Object {
  /**
    * Decode a URI payload bytes
    * @param data
    */
  def decodePayload(data: js.Any): String
  /**
    * Encode text payload
    * @param text
    * @param lang
    * @param encoding
    */
  def encodePayload(text: String, lang: String, encoding: String): js.Array[Double]
}

object TextHelper {
  @scala.inline
  def apply(decodePayload: js.Any => String, encodePayload: (String, String, String) => js.Array[Double]): TextHelper = {
    val __obj = js.Dynamic.literal(decodePayload = js.Any.fromFunction1(decodePayload), encodePayload = js.Any.fromFunction3(encodePayload))
  
    __obj.asInstanceOf[TextHelper]
  }
}

