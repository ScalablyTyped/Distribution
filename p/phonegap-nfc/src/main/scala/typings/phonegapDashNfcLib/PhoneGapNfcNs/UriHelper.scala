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

