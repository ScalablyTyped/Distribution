package typings.phonegapNfc.PhoneGapNfc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NdefRecord extends js.Object {
  /**
    * byte array, containing zero to 255 bytes, must not be null
    */
  var id: js.Array[Double]
  /**
    * byte array, containing zero to (2 ** 32 - 1) bytes, must not be null
    */
  var payload: js.Array[Double]
  /**
    * 3-bit TNF (Type Name Format) - use one of the TNF_* constants
    */
  var tnf: Double
  /**
    * byte array, containing zero to 255 bytes, must not be null
    */
  var `type`: js.Array[Double]
}

object NdefRecord {
  @scala.inline
  def apply(id: js.Array[Double], payload: js.Array[Double], tnf: Double, `type`: js.Array[Double]): NdefRecord = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any], tnf = tnf.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NdefRecord]
  }
}

