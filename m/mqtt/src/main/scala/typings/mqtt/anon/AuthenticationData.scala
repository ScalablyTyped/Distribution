package typings.mqtt.anon

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AuthenticationData extends js.Object {
  var authenticationData: js.UndefOr[Buffer] = js.native
  var authenticationMethod: js.UndefOr[String] = js.native
  var maximumPacketSize: js.UndefOr[Double] = js.native
  var receiveMaximum: js.UndefOr[Double] = js.native
  var requestProblemInformation: js.UndefOr[Boolean] = js.native
  var requestResponseInformation: js.UndefOr[Boolean] = js.native
  var sessionExpiryInterval: js.UndefOr[Double] = js.native
  var topicAliasMaximum: js.UndefOr[Double] = js.native
  var userProperties: js.UndefOr[js.Object] = js.native
}

object AuthenticationData {
  @scala.inline
  def apply(): AuthenticationData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuthenticationData]
  }
  @scala.inline
  implicit class AuthenticationDataOps[Self <: AuthenticationData] (val x: Self) extends AnyVal {
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
    def setAuthenticationData(value: Buffer): Self = this.set("authenticationData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuthenticationData: Self = this.set("authenticationData", js.undefined)
    @scala.inline
    def setAuthenticationMethod(value: String): Self = this.set("authenticationMethod", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuthenticationMethod: Self = this.set("authenticationMethod", js.undefined)
    @scala.inline
    def setMaximumPacketSize(value: Double): Self = this.set("maximumPacketSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaximumPacketSize: Self = this.set("maximumPacketSize", js.undefined)
    @scala.inline
    def setReceiveMaximum(value: Double): Self = this.set("receiveMaximum", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReceiveMaximum: Self = this.set("receiveMaximum", js.undefined)
    @scala.inline
    def setRequestProblemInformation(value: Boolean): Self = this.set("requestProblemInformation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequestProblemInformation: Self = this.set("requestProblemInformation", js.undefined)
    @scala.inline
    def setRequestResponseInformation(value: Boolean): Self = this.set("requestResponseInformation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequestResponseInformation: Self = this.set("requestResponseInformation", js.undefined)
    @scala.inline
    def setSessionExpiryInterval(value: Double): Self = this.set("sessionExpiryInterval", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSessionExpiryInterval: Self = this.set("sessionExpiryInterval", js.undefined)
    @scala.inline
    def setTopicAliasMaximum(value: Double): Self = this.set("topicAliasMaximum", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTopicAliasMaximum: Self = this.set("topicAliasMaximum", js.undefined)
    @scala.inline
    def setUserProperties(value: js.Object): Self = this.set("userProperties", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserProperties: Self = this.set("userProperties", js.undefined)
  }
  
}

