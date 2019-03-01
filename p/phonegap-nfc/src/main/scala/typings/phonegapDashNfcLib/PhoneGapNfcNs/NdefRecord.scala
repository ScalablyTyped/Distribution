package typings
package phonegapDashNfcLib.PhoneGapNfcNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NdefRecord extends js.Object {
  /**
    * byte array, containing zero to 255 bytes, must not be null
    */
  var id: js.Array[scala.Double]
  /**
    * byte array, containing zero to (2 ** 32 - 1) bytes, must not be null
    */
  var payload: js.Array[scala.Double]
  /**
    * 3-bit TNF (Type Name Format) - use one of the TNF_* constants
    */
  var tnf: scala.Double
  /**
    * byte array, containing zero to 255 bytes, must not be null
    */
  var `type`: js.Array[scala.Double]
}

object NdefRecord {
  @scala.inline
  def apply(
    id: js.Array[scala.Double],
    payload: js.Array[scala.Double],
    tnf: scala.Double,
    `type`: js.Array[scala.Double]
  ): NdefRecord = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("payload")(payload)
    __obj.updateDynamic("tnf")(tnf)
    __obj.asInstanceOf[NdefRecord]
  }
}

