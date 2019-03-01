package typings
package phonegapDashPluginDashBarcodescannerLib.phonegapBarcodeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EncodingType extends js.Object {
  var EMAIL_TYPE: js.Any
  var PHONE_TYPE: js.Any
  var SMS_TYPE: js.Any
  var TEXT_TYPE: js.Any
}

object EncodingType {
  @scala.inline
  def apply(EMAIL_TYPE: js.Any, PHONE_TYPE: js.Any, SMS_TYPE: js.Any, TEXT_TYPE: js.Any): EncodingType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("EMAIL_TYPE")(EMAIL_TYPE)
    __obj.updateDynamic("PHONE_TYPE")(PHONE_TYPE)
    __obj.updateDynamic("SMS_TYPE")(SMS_TYPE)
    __obj.updateDynamic("TEXT_TYPE")(TEXT_TYPE)
    __obj.asInstanceOf[EncodingType]
  }
}

