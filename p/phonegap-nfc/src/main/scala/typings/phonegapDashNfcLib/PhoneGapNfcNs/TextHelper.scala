package typings
package phonegapDashNfcLib.PhoneGapNfcNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextHelper extends js.Object {
  /**
    * Decode a URI payload bytes
    * @param data
    */
  def decodePayload(data: js.Any): java.lang.String
  /**
    * Encode text payload
    * @param text
    * @param lang
    * @param encoding
    */
  def encodePayload(text: java.lang.String, lang: java.lang.String, encoding: java.lang.String): js.Array[scala.Double]
}

object TextHelper {
  @scala.inline
  def apply(
    decodePayload: js.Function1[js.Any, java.lang.String],
    encodePayload: js.Function3[java.lang.String, java.lang.String, java.lang.String, js.Array[scala.Double]]
  ): TextHelper = {
    val __obj = js.Dynamic.literal(decodePayload = decodePayload, encodePayload = encodePayload)
  
    __obj.asInstanceOf[TextHelper]
  }
}

