package typings.oracledb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Used with connection.subscribe() to control a subscription.
  */
@js.native
trait SubscribeOptions extends js.Object {
  /** An array (bind by position) or object (bind by name) containing the bind values to use in the sql property. */
  var binds: js.UndefOr[BindParameters] = js.native
  /**
    * Enables CQN “client initiated” connections which internally use the same approach as normal connections to the database,
    * and do not require the database to be able to connect back to the application. Since client initiated connections
    * do not need additional network configuration, they have ease-of-use and security advantages.
    * 
    * @default false
    * @since 4.2
    */
  var clientInitiated: js.UndefOr[Boolean] = js.native
  /**
    * An integer mask which currently, if set, can only contain the value SUBSCR_GROUPING_CLASS_TIME.
    * If this value is set then notifications are grouped by time into a single notification.
    */
  var groupingClass: js.UndefOr[Double] = js.native
  /**
    * Either SUBSCR_GROUPING_TYPE_SUMMARY (the default) indicating notifications should be
    * grouped in a summary, or SUBSCR_GROUPING_TYPE_LAST indicating the last notification in the
    * group should be sent.
    */
  var groupingType: js.UndefOr[Double] = js.native
  /**
    * If groupingClass contains SUBSCR_GROUPING_CLASS_TIME then groupingValue can be used to
    * set the number of seconds over which notifications will be grouped together, invoking callback once.
    * If groupingClass is not set, then groupingValue is ignored.
    */
  var groupingValue: js.UndefOr[Double] = js.native
  /**
    * A string containing an IPv4 or IPv6 address on which the subscription should listen to receive notifications.
    * If not specified, then the Oracle Client library will select an IP address.
    */
  var ipAddress: js.UndefOr[String] = js.native
  /** One of the Subscribe Namespace Constants. */
  var namespace: js.UndefOr[Double] = js.native
  /**
    * An integer mask containing one or more of the operation type CQN_OPCODE_* constants to
    * indicate what types of database change should generation notifications.
    */
  var operations: js.UndefOr[Double] = js.native
  /**
    * The port number on which the subscription should listen to receive notifications.
    * If not specified, then the Oracle Client library will select a port number.
    */
  var port: js.UndefOr[Double] = js.native
  /** An integer mask containing one or more of the quality of service SUBSCR_QOS_* constants. */
  var qos: js.UndefOr[Double] = js.native
  /** The SQL query string to use for notifications. */
  var sql: String = js.native
  /**
    * The number of seconds the subscription should remain active. Once this length of time has been reached,
    * the subscription is automatically unregistered and a deregistration notification is sent.
    */
  var timeout: js.UndefOr[Double] = js.native
  /** The notification callback that will be called whenever notifications are sent by the database. */
  def callback(message: SubscriptionMessage): Unit = js.native
}

object SubscribeOptions {
  @scala.inline
  def apply(callback: SubscriptionMessage => Unit, sql: String): SubscribeOptions = {
    val __obj = js.Dynamic.literal(callback = js.Any.fromFunction1(callback), sql = sql.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubscribeOptions]
  }
  @scala.inline
  implicit class SubscribeOptionsOps[Self <: SubscribeOptions] (val x: Self) extends AnyVal {
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
    def setCallback(value: SubscriptionMessage => Unit): Self = this.set("callback", js.Any.fromFunction1(value))
    @scala.inline
    def setSql(value: String): Self = this.set("sql", value.asInstanceOf[js.Any])
    @scala.inline
    def setBindsVarargs(value: (js.Any | BindParameter)*): Self = this.set("binds", js.Array(value :_*))
    @scala.inline
    def setBinds(value: BindParameters): Self = this.set("binds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBinds: Self = this.set("binds", js.undefined)
    @scala.inline
    def setClientInitiated(value: Boolean): Self = this.set("clientInitiated", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClientInitiated: Self = this.set("clientInitiated", js.undefined)
    @scala.inline
    def setGroupingClass(value: Double): Self = this.set("groupingClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroupingClass: Self = this.set("groupingClass", js.undefined)
    @scala.inline
    def setGroupingType(value: Double): Self = this.set("groupingType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroupingType: Self = this.set("groupingType", js.undefined)
    @scala.inline
    def setGroupingValue(value: Double): Self = this.set("groupingValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroupingValue: Self = this.set("groupingValue", js.undefined)
    @scala.inline
    def setIpAddress(value: String): Self = this.set("ipAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIpAddress: Self = this.set("ipAddress", js.undefined)
    @scala.inline
    def setNamespace(value: Double): Self = this.set("namespace", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNamespace: Self = this.set("namespace", js.undefined)
    @scala.inline
    def setOperations(value: Double): Self = this.set("operations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOperations: Self = this.set("operations", js.undefined)
    @scala.inline
    def setPort(value: Double): Self = this.set("port", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePort: Self = this.set("port", js.undefined)
    @scala.inline
    def setQos(value: Double): Self = this.set("qos", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQos: Self = this.set("qos", js.undefined)
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
  }
  
}

