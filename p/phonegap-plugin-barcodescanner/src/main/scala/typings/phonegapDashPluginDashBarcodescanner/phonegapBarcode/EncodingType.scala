package typings.phonegapDashPluginDashBarcodescanner.phonegapBarcode

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
    val __obj = js.Dynamic.literal(EMAIL_TYPE = EMAIL_TYPE, PHONE_TYPE = PHONE_TYPE, SMS_TYPE = SMS_TYPE, TEXT_TYPE = TEXT_TYPE)
  
    __obj.asInstanceOf[EncodingType]
  }
}

