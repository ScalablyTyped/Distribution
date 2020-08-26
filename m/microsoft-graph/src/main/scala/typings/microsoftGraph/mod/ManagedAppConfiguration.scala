package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ManagedAppConfiguration extends ManagedAppPolicy {
  /**
    * A set of string key and string value pairs to be sent to apps for users to whom the configuration is scoped, unalterned
    * by this service
    */
  var customSettings: js.UndefOr[js.Array[KeyValuePair]] = js.native
}

object ManagedAppConfiguration {
  @scala.inline
  def apply(): ManagedAppConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ManagedAppConfiguration]
  }
  @scala.inline
  implicit class ManagedAppConfigurationOps[Self <: ManagedAppConfiguration] (val x: Self) extends AnyVal {
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
    def setCustomSettingsVarargs(value: KeyValuePair*): Self = this.set("customSettings", js.Array(value :_*))
    @scala.inline
    def setCustomSettings(value: js.Array[KeyValuePair]): Self = this.set("customSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomSettings: Self = this.set("customSettings", js.undefined)
  }
  
}

