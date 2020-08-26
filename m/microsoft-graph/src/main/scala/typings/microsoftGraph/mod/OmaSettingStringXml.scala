package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OmaSettingStringXml extends OmaSetting {
  // File name associated with the Value property (.xml).
  var fileName: js.UndefOr[String] = js.native
  // Value. (UTF8 encoded byte array)
  var value: js.UndefOr[Double] = js.native
}

object OmaSettingStringXml {
  @scala.inline
  def apply(): OmaSettingStringXml = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OmaSettingStringXml]
  }
  @scala.inline
  implicit class OmaSettingStringXmlOps[Self <: OmaSettingStringXml] (val x: Self) extends AnyVal {
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
    def setValue(value: Double): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

