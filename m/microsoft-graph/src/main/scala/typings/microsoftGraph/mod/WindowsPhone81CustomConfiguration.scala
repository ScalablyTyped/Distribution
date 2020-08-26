package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WindowsPhone81CustomConfiguration extends DeviceConfiguration {
  // OMA settings. This collection can contain a maximum of 1000 elements.
  var omaSettings: js.UndefOr[js.Array[OmaSetting]] = js.native
}

object WindowsPhone81CustomConfiguration {
  @scala.inline
  def apply(): WindowsPhone81CustomConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WindowsPhone81CustomConfiguration]
  }
  @scala.inline
  implicit class WindowsPhone81CustomConfigurationOps[Self <: WindowsPhone81CustomConfiguration] (val x: Self) extends AnyVal {
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
    def setOmaSettingsVarargs(value: OmaSetting*): Self = this.set("omaSettings", js.Array(value :_*))
    @scala.inline
    def setOmaSettings(value: js.Array[OmaSetting]): Self = this.set("omaSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOmaSettings: Self = this.set("omaSettings", js.undefined)
  }
  
}

