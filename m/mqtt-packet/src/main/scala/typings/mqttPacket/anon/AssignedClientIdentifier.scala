package typings.mqttPacket.anon

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AssignedClientIdentifier extends js.Object {
  var assignedClientIdentifier: js.UndefOr[String] = js.undefined
  var authenticationData: js.UndefOr[Buffer] = js.undefined
  var authenticationMethod: js.UndefOr[String] = js.undefined
  var maximumPacketSize: js.UndefOr[Double] = js.undefined
  var maximumQoS: js.UndefOr[Double] = js.undefined
  var reasonString: js.UndefOr[String] = js.undefined
  var receiveMaximum: js.UndefOr[Double] = js.undefined
  var responseInformation: js.UndefOr[String] = js.undefined
  var retainAvailable: js.UndefOr[Boolean] = js.undefined
  var serverKeepAlive: js.UndefOr[Double] = js.undefined
  var serverReference: js.UndefOr[String] = js.undefined
  var sessionExpiryInterval: js.UndefOr[Double] = js.undefined
  var sharedSubscriptionAvailable: js.UndefOr[Boolean] = js.undefined
  var subscriptionIdentifiersAvailable: js.UndefOr[Boolean] = js.undefined
  var topicAliasMaximum: js.UndefOr[Double] = js.undefined
  var userProperties: js.UndefOr[js.Object] = js.undefined
  var wildcardSubscriptionAvailable: js.UndefOr[Boolean] = js.undefined
}

object AssignedClientIdentifier {
  @scala.inline
  def apply(
    assignedClientIdentifier: String = null,
    authenticationData: Buffer = null,
    authenticationMethod: String = null,
    maximumPacketSize: js.UndefOr[Double] = js.undefined,
    maximumQoS: js.UndefOr[Double] = js.undefined,
    reasonString: String = null,
    receiveMaximum: js.UndefOr[Double] = js.undefined,
    responseInformation: String = null,
    retainAvailable: js.UndefOr[Boolean] = js.undefined,
    serverKeepAlive: js.UndefOr[Double] = js.undefined,
    serverReference: String = null,
    sessionExpiryInterval: js.UndefOr[Double] = js.undefined,
    sharedSubscriptionAvailable: js.UndefOr[Boolean] = js.undefined,
    subscriptionIdentifiersAvailable: js.UndefOr[Boolean] = js.undefined,
    topicAliasMaximum: js.UndefOr[Double] = js.undefined,
    userProperties: js.Object = null,
    wildcardSubscriptionAvailable: js.UndefOr[Boolean] = js.undefined
  ): AssignedClientIdentifier = {
    val __obj = js.Dynamic.literal()
    if (assignedClientIdentifier != null) __obj.updateDynamic("assignedClientIdentifier")(assignedClientIdentifier.asInstanceOf[js.Any])
    if (authenticationData != null) __obj.updateDynamic("authenticationData")(authenticationData.asInstanceOf[js.Any])
    if (authenticationMethod != null) __obj.updateDynamic("authenticationMethod")(authenticationMethod.asInstanceOf[js.Any])
    if (!js.isUndefined(maximumPacketSize)) __obj.updateDynamic("maximumPacketSize")(maximumPacketSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maximumQoS)) __obj.updateDynamic("maximumQoS")(maximumQoS.get.asInstanceOf[js.Any])
    if (reasonString != null) __obj.updateDynamic("reasonString")(reasonString.asInstanceOf[js.Any])
    if (!js.isUndefined(receiveMaximum)) __obj.updateDynamic("receiveMaximum")(receiveMaximum.get.asInstanceOf[js.Any])
    if (responseInformation != null) __obj.updateDynamic("responseInformation")(responseInformation.asInstanceOf[js.Any])
    if (!js.isUndefined(retainAvailable)) __obj.updateDynamic("retainAvailable")(retainAvailable.get.asInstanceOf[js.Any])
    if (!js.isUndefined(serverKeepAlive)) __obj.updateDynamic("serverKeepAlive")(serverKeepAlive.get.asInstanceOf[js.Any])
    if (serverReference != null) __obj.updateDynamic("serverReference")(serverReference.asInstanceOf[js.Any])
    if (!js.isUndefined(sessionExpiryInterval)) __obj.updateDynamic("sessionExpiryInterval")(sessionExpiryInterval.get.asInstanceOf[js.Any])
    if (!js.isUndefined(sharedSubscriptionAvailable)) __obj.updateDynamic("sharedSubscriptionAvailable")(sharedSubscriptionAvailable.get.asInstanceOf[js.Any])
    if (!js.isUndefined(subscriptionIdentifiersAvailable)) __obj.updateDynamic("subscriptionIdentifiersAvailable")(subscriptionIdentifiersAvailable.get.asInstanceOf[js.Any])
    if (!js.isUndefined(topicAliasMaximum)) __obj.updateDynamic("topicAliasMaximum")(topicAliasMaximum.get.asInstanceOf[js.Any])
    if (userProperties != null) __obj.updateDynamic("userProperties")(userProperties.asInstanceOf[js.Any])
    if (!js.isUndefined(wildcardSubscriptionAvailable)) __obj.updateDynamic("wildcardSubscriptionAvailable")(wildcardSubscriptionAvailable.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssignedClientIdentifier]
  }
}

