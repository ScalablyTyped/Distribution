package typings.phonegapPluginBarcodescanner.phonegapBarcode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EncodingType extends js.Object {
  var EMAIL_TYPE: js.Any = js.native
  var PHONE_TYPE: js.Any = js.native
  var SMS_TYPE: js.Any = js.native
  var TEXT_TYPE: js.Any = js.native
}

object EncodingType {
  @scala.inline
  def apply(EMAIL_TYPE: js.Any, PHONE_TYPE: js.Any, SMS_TYPE: js.Any, TEXT_TYPE: js.Any): EncodingType = {
    val __obj = js.Dynamic.literal(EMAIL_TYPE = EMAIL_TYPE.asInstanceOf[js.Any], PHONE_TYPE = PHONE_TYPE.asInstanceOf[js.Any], SMS_TYPE = SMS_TYPE.asInstanceOf[js.Any], TEXT_TYPE = TEXT_TYPE.asInstanceOf[js.Any])
    __obj.asInstanceOf[EncodingType]
  }
  @scala.inline
  implicit class EncodingTypeOps[Self <: EncodingType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setEMAIL_TYPE(value: js.Any): Self = this.set("EMAIL_TYPE", value.asInstanceOf[js.Any])
    @scala.inline
    def setPHONE_TYPE(value: js.Any): Self = this.set("PHONE_TYPE", value.asInstanceOf[js.Any])
    @scala.inline
    def setSMS_TYPE(value: js.Any): Self = this.set("SMS_TYPE", value.asInstanceOf[js.Any])
    @scala.inline
    def setTEXT_TYPE(value: js.Any): Self = this.set("TEXT_TYPE", value.asInstanceOf[js.Any])
  }
  
}

