package typings
package mqttDashPacketLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AssignedClientIdentifier extends js.Object {
  var assignedClientIdentifier: js.UndefOr[java.lang.String] = js.undefined
  var authenticationData: js.UndefOr[nodeLib.Buffer] = js.undefined
  var authenticationMethod: js.UndefOr[java.lang.String] = js.undefined
  var maximumPacketSize: js.UndefOr[scala.Double] = js.undefined
  var maximumQoS: js.UndefOr[scala.Double] = js.undefined
  var reasonString: js.UndefOr[java.lang.String] = js.undefined
  var receiveMaximum: js.UndefOr[scala.Double] = js.undefined
  var responseInformation: js.UndefOr[java.lang.String] = js.undefined
  var retainAvailable: js.UndefOr[scala.Boolean] = js.undefined
  var serverKeepAlive: js.UndefOr[scala.Double] = js.undefined
  var serverReference: js.UndefOr[java.lang.String] = js.undefined
  var sessionExpiryInterval: js.UndefOr[scala.Double] = js.undefined
  var sharedSubscriptionAvailable: js.UndefOr[scala.Boolean] = js.undefined
  var subscriptionIdentifiersAvailable: js.UndefOr[scala.Boolean] = js.undefined
  var topicAliasMaximum: js.UndefOr[scala.Double] = js.undefined
  var userProperties: js.UndefOr[js.Object] = js.undefined
  var wildcardSubscriptionAvailable: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_AssignedClientIdentifier {
  @scala.inline
  def apply(
    assignedClientIdentifier: java.lang.String = null,
    authenticationData: nodeLib.Buffer = null,
    authenticationMethod: java.lang.String = null,
    maximumPacketSize: scala.Int | scala.Double = null,
    maximumQoS: scala.Int | scala.Double = null,
    reasonString: java.lang.String = null,
    receiveMaximum: scala.Int | scala.Double = null,
    responseInformation: java.lang.String = null,
    retainAvailable: js.UndefOr[scala.Boolean] = js.undefined,
    serverKeepAlive: scala.Int | scala.Double = null,
    serverReference: java.lang.String = null,
    sessionExpiryInterval: scala.Int | scala.Double = null,
    sharedSubscriptionAvailable: js.UndefOr[scala.Boolean] = js.undefined,
    subscriptionIdentifiersAvailable: js.UndefOr[scala.Boolean] = js.undefined,
    topicAliasMaximum: scala.Int | scala.Double = null,
    userProperties: js.Object = null,
    wildcardSubscriptionAvailable: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_AssignedClientIdentifier = {
    val __obj = js.Dynamic.literal()
    if (assignedClientIdentifier != null) __obj.updateDynamic("assignedClientIdentifier")(assignedClientIdentifier)
    if (authenticationData != null) __obj.updateDynamic("authenticationData")(authenticationData)
    if (authenticationMethod != null) __obj.updateDynamic("authenticationMethod")(authenticationMethod)
    if (maximumPacketSize != null) __obj.updateDynamic("maximumPacketSize")(maximumPacketSize.asInstanceOf[js.Any])
    if (maximumQoS != null) __obj.updateDynamic("maximumQoS")(maximumQoS.asInstanceOf[js.Any])
    if (reasonString != null) __obj.updateDynamic("reasonString")(reasonString)
    if (receiveMaximum != null) __obj.updateDynamic("receiveMaximum")(receiveMaximum.asInstanceOf[js.Any])
    if (responseInformation != null) __obj.updateDynamic("responseInformation")(responseInformation)
    if (!js.isUndefined(retainAvailable)) __obj.updateDynamic("retainAvailable")(retainAvailable)
    if (serverKeepAlive != null) __obj.updateDynamic("serverKeepAlive")(serverKeepAlive.asInstanceOf[js.Any])
    if (serverReference != null) __obj.updateDynamic("serverReference")(serverReference)
    if (sessionExpiryInterval != null) __obj.updateDynamic("sessionExpiryInterval")(sessionExpiryInterval.asInstanceOf[js.Any])
    if (!js.isUndefined(sharedSubscriptionAvailable)) __obj.updateDynamic("sharedSubscriptionAvailable")(sharedSubscriptionAvailable)
    if (!js.isUndefined(subscriptionIdentifiersAvailable)) __obj.updateDynamic("subscriptionIdentifiersAvailable")(subscriptionIdentifiersAvailable)
    if (topicAliasMaximum != null) __obj.updateDynamic("topicAliasMaximum")(topicAliasMaximum.asInstanceOf[js.Any])
    if (userProperties != null) __obj.updateDynamic("userProperties")(userProperties)
    if (!js.isUndefined(wildcardSubscriptionAvailable)) __obj.updateDynamic("wildcardSubscriptionAvailable")(wildcardSubscriptionAvailable)
    __obj.asInstanceOf[Anon_AssignedClientIdentifier]
  }
}

