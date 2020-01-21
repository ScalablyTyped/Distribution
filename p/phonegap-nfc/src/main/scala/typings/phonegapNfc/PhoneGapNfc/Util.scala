package typings.phonegapNfc.PhoneGapNfc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Util extends js.Object {
  /**
    * Convert bytes to hexadecimal string
    * @param bytes
    */
  def bytesToHexString(bytes: js.Array[Double]): String
  /**
    * Convert bytes to string
    * @param bytes
    */
  def bytesToString(bytes: js.Array[Double]): String
  /**
    * Convert string to bytes
    * @param string
    */
  def stringToBytes(string: String): js.Array[Double]
}

object Util {
  @scala.inline
  def apply(
    bytesToHexString: js.Array[Double] => String,
    bytesToString: js.Array[Double] => String,
    stringToBytes: String => js.Array[Double]
  ): Util = {
    val __obj = js.Dynamic.literal(bytesToHexString = js.Any.fromFunction1(bytesToHexString), bytesToString = js.Any.fromFunction1(bytesToString), stringToBytes = js.Any.fromFunction1(stringToBytes))
  
    __obj.asInstanceOf[Util]
  }
}

