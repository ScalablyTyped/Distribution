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

object Util {
  @scala.inline
  def apply(
    bytesToHexString: js.Function1[js.Array[scala.Double], java.lang.String],
    bytesToString: js.Function1[js.Array[scala.Double], java.lang.String],
    stringToBytes: js.Function1[java.lang.String, js.Array[scala.Double]]
  ): Util = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("bytesToHexString")(bytesToHexString)
    __obj.updateDynamic("bytesToString")(bytesToString)
    __obj.updateDynamic("stringToBytes")(stringToBytes)
    __obj.asInstanceOf[Util]
  }
}

