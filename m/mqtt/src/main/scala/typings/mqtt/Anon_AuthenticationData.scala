package typings.mqtt

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AuthenticationData extends js.Object {
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

object Anon_AuthenticationData {
  @scala.inline
  def apply(
    authenticationData: Buffer = null,
    authenticationMethod: String = null,
    maximumPacketSize: Int | Double = null,
    receiveMaximum: Int | Double = null,
    requestProblemInformation: js.UndefOr[Boolean] = js.undefined,
    requestResponseInformation: js.UndefOr[Boolean] = js.undefined,
    sessionExpiryInterval: Int | Double = null,
    topicAliasMaximum: Int | Double = null,
    userProperties: js.Object = null
  ): Anon_AuthenticationData = {
    val __obj = js.Dynamic.literal()
    if (authenticationData != null) __obj.updateDynamic("authenticationData")(authenticationData)
    if (authenticationMethod != null) __obj.updateDynamic("authenticationMethod")(authenticationMethod)
    if (maximumPacketSize != null) __obj.updateDynamic("maximumPacketSize")(maximumPacketSize.asInstanceOf[js.Any])
    if (receiveMaximum != null) __obj.updateDynamic("receiveMaximum")(receiveMaximum.asInstanceOf[js.Any])
    if (!js.isUndefined(requestProblemInformation)) __obj.updateDynamic("requestProblemInformation")(requestProblemInformation)
    if (!js.isUndefined(requestResponseInformation)) __obj.updateDynamic("requestResponseInformation")(requestResponseInformation)
    if (sessionExpiryInterval != null) __obj.updateDynamic("sessionExpiryInterval")(sessionExpiryInterval.asInstanceOf[js.Any])
    if (topicAliasMaximum != null) __obj.updateDynamic("topicAliasMaximum")(topicAliasMaximum.asInstanceOf[js.Any])
    if (userProperties != null) __obj.updateDynamic("userProperties")(userProperties)
    __obj.asInstanceOf[Anon_AuthenticationData]
  }
}

