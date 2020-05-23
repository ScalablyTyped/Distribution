package typings.mqttPacket.anon

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthenticationData extends js.Object {
  var authenticationData: js.UndefOr[Buffer] = js.undefined
  var authenticationMethod: js.UndefOr[String] = js.undefined
  var maximumPacketSize: js.UndefOr[Double] = js.undefined
  var receiveMaximum: js.UndefOr[Double] = js.undefined
  var requestProblemInformation: js.UndefOr[Boolean] = js.undefined
  var requestResponseInformation: js.UndefOr[Boolean] = js.undefined
  var sessionExpiryInterval: js.UndefOr[Double] = js.undefined
  var topicAliasMaximum: js.UndefOr[Double] = js.undefined
  var userProperties: js.UndefOr[js.Object] = js.undefined
}

object AuthenticationData {
  @scala.inline
  def apply(
    authenticationData: Buffer = null,
    authenticationMethod: String = null,
    maximumPacketSize: js.UndefOr[Double] = js.undefined,
    receiveMaximum: js.UndefOr[Double] = js.undefined,
    requestProblemInformation: js.UndefOr[Boolean] = js.undefined,
    requestResponseInformation: js.UndefOr[Boolean] = js.undefined,
    sessionExpiryInterval: js.UndefOr[Double] = js.undefined,
    topicAliasMaximum: js.UndefOr[Double] = js.undefined,
    userProperties: js.Object = null
  ): AuthenticationData = {
    val __obj = js.Dynamic.literal()
    if (authenticationData != null) __obj.updateDynamic("authenticationData")(authenticationData.asInstanceOf[js.Any])
    if (authenticationMethod != null) __obj.updateDynamic("authenticationMethod")(authenticationMethod.asInstanceOf[js.Any])
    if (!js.isUndefined(maximumPacketSize)) __obj.updateDynamic("maximumPacketSize")(maximumPacketSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(receiveMaximum)) __obj.updateDynamic("receiveMaximum")(receiveMaximum.get.asInstanceOf[js.Any])
    if (!js.isUndefined(requestProblemInformation)) __obj.updateDynamic("requestProblemInformation")(requestProblemInformation.get.asInstanceOf[js.Any])
    if (!js.isUndefined(requestResponseInformation)) __obj.updateDynamic("requestResponseInformation")(requestResponseInformation.get.asInstanceOf[js.Any])
    if (!js.isUndefined(sessionExpiryInterval)) __obj.updateDynamic("sessionExpiryInterval")(sessionExpiryInterval.get.asInstanceOf[js.Any])
    if (!js.isUndefined(topicAliasMaximum)) __obj.updateDynamic("topicAliasMaximum")(topicAliasMaximum.get.asInstanceOf[js.Any])
    if (userProperties != null) __obj.updateDynamic("userProperties")(userProperties.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthenticationData]
  }
}

