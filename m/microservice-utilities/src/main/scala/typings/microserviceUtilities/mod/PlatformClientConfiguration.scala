package typings.microserviceUtilities.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlatformClientConfiguration extends js.Object {
  var client: js.Object = js.native
}

object PlatformClientConfiguration {
  @scala.inline
  def apply(client: js.Object): PlatformClientConfiguration = {
    val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlatformClientConfiguration]
  }
  @scala.inline
  implicit class PlatformClientConfigurationOps[Self <: PlatformClientConfiguration] (val x: Self) extends AnyVal {
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
    def setClient(value: js.Object): Self = this.set("client", value.asInstanceOf[js.Any])
  }
  
}

