package typings.mqttPacket

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAssignedClientIdentifier extends js.Object {
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

object AnonAssignedClientIdentifier {
  @scala.inline
  def apply(
    assignedClientIdentifier: String = null,
    authenticationData: Buffer = null,
    authenticationMethod: String = null,
    maximumPacketSize: Int | Double = null,
    maximumQoS: Int | Double = null,
    reasonString: String = null,
    receiveMaximum: Int | Double = null,
    responseInformation: String = null,
    retainAvailable: js.UndefOr[Boolean] = js.undefined,
    serverKeepAlive: Int | Double = null,
    serverReference: String = null,
    sessionExpiryInterval: Int | Double = null,
    sharedSubscriptionAvailable: js.UndefOr[Boolean] = js.undefined,
    subscriptionIdentifiersAvailable: js.UndefOr[Boolean] = js.undefined,
    topicAliasMaximum: Int | Double = null,
    userProperties: js.Object = null,
    wildcardSubscriptionAvailable: js.UndefOr[Boolean] = js.undefined
  ): AnonAssignedClientIdentifier = {
    val __obj = js.Dynamic.literal()
    if (assignedClientIdentifier != null) __obj.updateDynamic("assignedClientIdentifier")(assignedClientIdentifier.asInstanceOf[js.Any])
    if (authenticationData != null) __obj.updateDynamic("authenticationData")(authenticationData.asInstanceOf[js.Any])
    if (authenticationMethod != null) __obj.updateDynamic("authenticationMethod")(authenticationMethod.asInstanceOf[js.Any])
    if (maximumPacketSize != null) __obj.updateDynamic("maximumPacketSize")(maximumPacketSize.asInstanceOf[js.Any])
    if (maximumQoS != null) __obj.updateDynamic("maximumQoS")(maximumQoS.asInstanceOf[js.Any])
    if (reasonString != null) __obj.updateDynamic("reasonString")(reasonString.asInstanceOf[js.Any])
    if (receiveMaximum != null) __obj.updateDynamic("receiveMaximum")(receiveMaximum.asInstanceOf[js.Any])
    if (responseInformation != null) __obj.updateDynamic("responseInformation")(responseInformation.asInstanceOf[js.Any])
    if (!js.isUndefined(retainAvailable)) __obj.updateDynamic("retainAvailable")(retainAvailable.asInstanceOf[js.Any])
    if (serverKeepAlive != null) __obj.updateDynamic("serverKeepAlive")(serverKeepAlive.asInstanceOf[js.Any])
    if (serverReference != null) __obj.updateDynamic("serverReference")(serverReference.asInstanceOf[js.Any])
    if (sessionExpiryInterval != null) __obj.updateDynamic("sessionExpiryInterval")(sessionExpiryInterval.asInstanceOf[js.Any])
    if (!js.isUndefined(sharedSubscriptionAvailable)) __obj.updateDynamic("sharedSubscriptionAvailable")(sharedSubscriptionAvailable.asInstanceOf[js.Any])
    if (!js.isUndefined(subscriptionIdentifiersAvailable)) __obj.updateDynamic("subscriptionIdentifiersAvailable")(subscriptionIdentifiersAvailable.asInstanceOf[js.Any])
    if (topicAliasMaximum != null) __obj.updateDynamic("topicAliasMaximum")(topicAliasMaximum.asInstanceOf[js.Any])
    if (userProperties != null) __obj.updateDynamic("userProperties")(userProperties.asInstanceOf[js.Any])
    if (!js.isUndefined(wildcardSubscriptionAvailable)) __obj.updateDynamic("wildcardSubscriptionAvailable")(wildcardSubscriptionAvailable.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAssignedClientIdentifier]
  }
}

