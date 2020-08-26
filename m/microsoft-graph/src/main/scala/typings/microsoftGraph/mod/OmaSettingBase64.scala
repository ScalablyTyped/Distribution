package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OmaSettingBase64 extends OmaSetting {
  // File name associated with the Value property (.cer
  var fileName: js.UndefOr[String] = js.native
  // Value. (Base64 encoded string)
  var value: js.UndefOr[String] = js.native
}

object OmaSettingBase64 {
  @scala.inline
  def apply(): OmaSettingBase64 = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OmaSettingBase64]
  }
  @scala.inline
  implicit class OmaSettingBase64Ops[Self <: OmaSettingBase64] (val x: Self) extends AnyVal {
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
    def setFileName(value: String): Self = this.set("fileName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFileName: Self = this.set("fileName", js.undefined)
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

