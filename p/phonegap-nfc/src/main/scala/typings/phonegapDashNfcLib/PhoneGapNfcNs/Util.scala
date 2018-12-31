package typings
package phonegapDashNfcLib.PhoneGapNfcNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Util extends js.Object {
  /**
    * Convert bytes to hexadecimal string
    * @param bytes
    */
  def bytesToHexString(bytes: js.Array[scala.Double]): java.lang.String
  /**
    * Convert bytes to string
    * @param bytes
    */
  def bytesToString(bytes: js.Array[scala.Double]): java.lang.String
  /**
    * Convert string to bytes
    * @param string
    */
  def stringToBytes(string: java.lang.String): js.Array[scala.Double]
}

