package typings.oracledb.mod

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
    * Enables CQN “client initiated” connections which internally use the same approach as normal connections to the database,
    * and do not require the database to be able to connect back to the application. Since client initiated connections
    * do not need additional network configuration, they have ease-of-use and security advantages.
    * 
    * @default false
    * @since 4.2
    */
  var clientInitiated: js.UndefOr[Boolean] = js.undefined
  /**
    * An integer mask which currently, if set, can only contain the value SUBSCR_GROUPING_CLASS_TIME.
    * If this value is set then notifications are grouped by time into a single notification.
    */
  var groupingClass: js.UndefOr[Double] = js.undefined
  /**
    * Either SUBSCR_GROUPING_TYPE_SUMMARY (the default) indicating notifications should be
    * grouped in a summary, or SUBSCR_GROUPING_TYPE_LAST indicating the last notification in the
    * group should be sent.
    */
  var groupingType: js.UndefOr[Double] = js.undefined
  /**
    * If groupingClass contains SUBSCR_GROUPING_CLASS_TIME then groupingValue can be used to
    * set the number of seconds over which notifications will be grouped together, invoking callback once.
    * If groupingClass is not set, then groupingValue is ignored.
    */
  var groupingValue: js.UndefOr[Double] = js.undefined
  /**
    * A string containing an IPv4 or IPv6 address on which the subscription should listen to receive notifications.
    * If not specified, then the Oracle Client library will select an IP address.
    */
  var ipAddress: js.UndefOr[String] = js.undefined
  /** One of the Subscribe Namespace Constants. */
  var namespace: js.UndefOr[Double] = js.undefined
  /**
    * An integer mask containing one or more of the operation type CQN_OPCODE_* constants to
    * indicate what types of database change should generation notifications.
    */
  var operations: js.UndefOr[Double] = js.undefined
  /**
    * The port number on which the subscription should listen to receive notifications.
    * If not specified, then the Oracle Client library will select a port number.
    */
  var port: js.UndefOr[Double] = js.undefined
  /** An integer mask containing one or more of the quality of service SUBSCR_QOS_* constants. */
  var qos: js.UndefOr[Double] = js.undefined
  /** The SQL query string to use for notifications. */
  var sql: String
  /**
    * The number of seconds the subscription should remain active. Once this length of time has been reached,
    * the subscription is automatically unregistered and a deregistration notification is sent.
    */
  var timeout: js.UndefOr[Double] = js.undefined
  /** The notification callback that will be called whenever notifications are sent by the database. */
  def callback(message: SubscriptionMessage): Unit
}

object SubscribeOptions {
  @scala.inline
  def apply(
    callback: SubscriptionMessage => Unit,
    sql: String,
    binds: BindParameters = null,
    clientInitiated: js.UndefOr[Boolean] = js.undefined,
    groupingClass: js.UndefOr[Double] = js.undefined,
    groupingType: js.UndefOr[Double] = js.undefined,
    groupingValue: js.UndefOr[Double] = js.undefined,
    ipAddress: String = null,
    namespace: js.UndefOr[Double] = js.undefined,
    operations: js.UndefOr[Double] = js.undefined,
    port: js.UndefOr[Double] = js.undefined,
    qos: js.UndefOr[Double] = js.undefined,
    timeout: js.UndefOr[Double] = js.undefined
  ): SubscribeOptions = {
    val __obj = js.Dynamic.literal(callback = js.Any.fromFunction1(callback), sql = sql.asInstanceOf[js.Any])
    if (binds != null) __obj.updateDynamic("binds")(binds.asInstanceOf[js.Any])
    if (!js.isUndefined(clientInitiated)) __obj.updateDynamic("clientInitiated")(clientInitiated.get.asInstanceOf[js.Any])
    if (!js.isUndefined(groupingClass)) __obj.updateDynamic("groupingClass")(groupingClass.get.asInstanceOf[js.Any])
    if (!js.isUndefined(groupingType)) __obj.updateDynamic("groupingType")(groupingType.get.asInstanceOf[js.Any])
    if (!js.isUndefined(groupingValue)) __obj.updateDynamic("groupingValue")(groupingValue.get.asInstanceOf[js.Any])
    if (ipAddress != null) __obj.updateDynamic("ipAddress")(ipAddress.asInstanceOf[js.Any])
    if (!js.isUndefined(namespace)) __obj.updateDynamic("namespace")(namespace.get.asInstanceOf[js.Any])
    if (!js.isUndefined(operations)) __obj.updateDynamic("operations")(operations.get.asInstanceOf[js.Any])
    if (!js.isUndefined(port)) __obj.updateDynamic("port")(port.get.asInstanceOf[js.Any])
    if (!js.isUndefined(qos)) __obj.updateDynamic("qos")(qos.get.asInstanceOf[js.Any])
    if (!js.isUndefined(timeout)) __obj.updateDynamic("timeout")(timeout.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubscribeOptions]
  }
}

