package typings
package oracledbLib.oracledbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Used with connection.subscribe() to control a subscription.
  */
trait SubscribeOptions extends js.Object {
  /** An array (bind by position) or object (bind by name) containing the bind values to use in the sql property. */
  var binds: js.UndefOr[BindParameters] = js.undefined
  /**
    * An integer mask which currently, if set, can only contain the value SUBSCR_GROUPING_CLASS_TIME.
    * If this value is set then notifications are grouped by time into a single notification.
    */
  var groupingClass: js.UndefOr[scala.Double] = js.undefined
  /**
    * Either SUBSCR_GROUPING_TYPE_SUMMARY (the default) indicating notifications should be
    * grouped in a summary, or SUBSCR_GROUPING_TYPE_LAST indicating the last notification in the
    * group should be sent.
    */
  var groupingType: js.UndefOr[scala.Double] = js.undefined
  /**
    * If groupingClass contains SUBSCR_GROUPING_CLASS_TIME then groupingValue can be used to
    * set the number of seconds over which notifications will be grouped together, invoking callback once.
    * If groupingClass is not set, then groupingValue is ignored.
    */
  var groupingValue: js.UndefOr[scala.Double] = js.undefined
  /**
    * A string containing an IPv4 or IPv6 address on which the subscription should listen to receive notifications.
    * If not specified, then the Oracle Client library will select an IP address.
    */
  var ipAddress: js.UndefOr[java.lang.String] = js.undefined
  /** One of the Subscribe Namespace Constants. */
  var namespace: js.UndefOr[scala.Double] = js.undefined
  /**
    * An integer mask containing one or more of the operation type CQN_OPCODE_* constants to
    * indicate what types of database change should generation notifications.
    */
  var operations: js.UndefOr[scala.Double] = js.undefined
  /**
    * The port number on which the subscription should listen to receive notifications.
    * If not specified, then the Oracle Client library will select a port number.
    */
  var port: js.UndefOr[scala.Double] = js.undefined
  /** An integer mask containing one or more of the quality of service SUBSCR_QOS_* constants. */
  var qos: js.UndefOr[scala.Double] = js.undefined
  /** The SQL query string to use for notifications. */
  var sql: java.lang.String
  /**
    * The number of seconds the subscription should remain active. Once this length of time has been reached,
    * the subscription is automatically unregistered and a deregistration notification is sent.
    */
  var timeout: js.UndefOr[scala.Double] = js.undefined
  /** The notification callback that will be called whenever notifications are sent by the database. */
  def callback(message: SubscriptionMessage): scala.Unit
}

object SubscribeOptions {
  @scala.inline
  def apply(
    callback: SubscriptionMessage => scala.Unit,
    sql: java.lang.String,
    binds: BindParameters = null,
    groupingClass: scala.Int | scala.Double = null,
    groupingType: scala.Int | scala.Double = null,
    groupingValue: scala.Int | scala.Double = null,
    ipAddress: java.lang.String = null,
    namespace: scala.Int | scala.Double = null,
    operations: scala.Int | scala.Double = null,
    port: scala.Int | scala.Double = null,
    qos: scala.Int | scala.Double = null,
    timeout: scala.Int | scala.Double = null
  ): SubscribeOptions = {
    val __obj = js.Dynamic.literal(callback = js.Any.fromFunction1(callback), sql = sql)
    if (binds != null) __obj.updateDynamic("binds")(binds.asInstanceOf[js.Any])
    if (groupingClass != null) __obj.updateDynamic("groupingClass")(groupingClass.asInstanceOf[js.Any])
    if (groupingType != null) __obj.updateDynamic("groupingType")(groupingType.asInstanceOf[js.Any])
    if (groupingValue != null) __obj.updateDynamic("groupingValue")(groupingValue.asInstanceOf[js.Any])
    if (ipAddress != null) __obj.updateDynamic("ipAddress")(ipAddress)
    if (namespace != null) __obj.updateDynamic("namespace")(namespace.asInstanceOf[js.Any])
    if (operations != null) __obj.updateDynamic("operations")(operations.asInstanceOf[js.Any])
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (qos != null) __obj.updateDynamic("qos")(qos.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubscribeOptions]
  }
}

