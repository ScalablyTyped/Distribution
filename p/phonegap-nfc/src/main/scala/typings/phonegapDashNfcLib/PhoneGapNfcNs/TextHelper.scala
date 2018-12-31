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

