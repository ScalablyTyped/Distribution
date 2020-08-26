package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SamlSingleSignOnSettings extends js.Object {
  // The relative URI the service provider would redirect to after completion of the single sign-on flow.
  var relayState: js.UndefOr[String] = js.native
}

object SamlSingleSignOnSettings {
  @scala.inline
  def apply(): SamlSingleSignOnSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SamlSingleSignOnSettings]
  }
  @scala.inline
  implicit class SamlSingleSignOnSettingsOps[Self <: SamlSingleSignOnSettings] (val x: Self) extends AnyVal {
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
    def setRelayState(value: String): Self = this.set("relayState", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRelayState: Self = this.set("relayState", js.undefined)
  }
  
}

