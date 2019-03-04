package typings
package phonegapDashNfcLib.PhoneGapNfcNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UriHelper extends js.Object {
  /**
    * URI identifier codes from URI Record Type Definition NFCForum-TS-RTD_URI_1.0 2006-07-24
    * index in array matches code in the spec
    */
  var protocols: js.Array[java.lang.String]
  /**
    * Decode a URI payload bytes
    * @param data
    */
  def decodePayload(data: js.Any): java.lang.String
  /**
    * shorten a URI with standard prefix
    * @param uri
    */
  def encodePayload(uri: java.lang.String): js.Array[scala.Double]
}

object UriHelper {
  @scala.inline
  def apply(
    decodePayload: js.Function1[js.Any, java.lang.String],
    encodePayload: js.Function1[java.lang.String, js.Array[scala.Double]],
    protocols: js.Array[java.lang.String]
  ): UriHelper = {
    val __obj = js.Dynamic.literal(decodePayload = decodePayload, encodePayload = encodePayload, protocols = protocols)
  
    __obj.asInstanceOf[UriHelper]
  }
}

