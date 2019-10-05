package typings.phonegapDashNfc.PhoneGapNfc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UriHelper extends js.Object {
  /**
    * URI identifier codes from URI Record Type Definition NFCForum-TS-RTD_URI_1.0 2006-07-24
    * index in array matches code in the spec
    */
  var protocols: js.Array[String]
  /**
    * Decode a URI payload bytes
    * @param data
    */
  def decodePayload(data: js.Any): String
  /**
    * shorten a URI with standard prefix
    * @param uri
    */
  def encodePayload(uri: String): js.Array[Double]
}

object UriHelper {
  @scala.inline
  def apply(
    decodePayload: js.Any => String,
    encodePayload: String => js.Array[Double],
    protocols: js.Array[String]
  ): UriHelper = {
    val __obj = js.Dynamic.literal(decodePayload = js.Any.fromFunction1(decodePayload), encodePayload = js.Any.fromFunction1(encodePayload), protocols = protocols)
  
    __obj.asInstanceOf[UriHelper]
  }
}

