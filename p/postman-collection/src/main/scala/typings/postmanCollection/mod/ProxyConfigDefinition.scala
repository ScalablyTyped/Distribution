package typings.postmanCollection.mod

import typings.postmanCollection.anon.Pattern
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProxyConfigDefinition extends PropertyDefinition {
  var host: js.UndefOr[String] = js.native
  var `match`: js.UndefOr[String | Pattern | UrlMatchPattern] = js.native
  var port: js.UndefOr[Double] = js.native
  var tunnel: js.UndefOr[Boolean] = js.native
}

object ProxyConfigDefinition {
  @scala.inline
  def apply(): ProxyConfigDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProxyConfigDefinition]
  }
  @scala.inline
  implicit class ProxyConfigDefinitionOps[Self <: ProxyConfigDefinition] (val x: Self) extends AnyVal {
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
    def setHost(value: String): Self = this.set("host", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHost: Self = this.set("host", js.undefined)
    @scala.inline
    def setMatch(value: String | Pattern | UrlMatchPattern): Self = this.set("match", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMatch: Self = this.set("match", js.undefined)
    @scala.inline
    def setPort(value: Double): Self = this.set("port", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePort: Self = this.set("port", js.undefined)
    @scala.inline
    def setTunnel(value: Boolean): Self = this.set("tunnel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTunnel: Self = this.set("tunnel", js.undefined)
  }
  
}

