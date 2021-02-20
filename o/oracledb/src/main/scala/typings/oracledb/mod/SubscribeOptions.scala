package typings.oracledb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Used with connection.subscribe() to control a subscription.
  */
@js.native
trait SubscribeOptions extends StObject {
  
  /** An array (bind by position) or object (bind by name) containing the bind values to use in the sql property. */
  var binds: js.UndefOr[BindParameters] = js.native
  
  /** The notification callback that will be called whenever notifications are sent by the database. */
  def callback(message: SubscriptionMessage): Unit = js.native
  
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
}
object SubscribeOptions {
  
  @scala.inline
  def apply(callback: SubscriptionMessage => Unit, sql: String): SubscribeOptions = {
    val __obj = js.Dynamic.literal(callback = js.Any.fromFunction1(callback), sql = sql.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubscribeOptions]
  }
  
  @scala.inline
  implicit class SubscribeOptionsMutableBuilder[Self <: SubscribeOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBinds(value: BindParameters): Self = StObject.set(x, "binds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBindsUndefined: Self = StObject.set(x, "binds", js.undefined)
    
    @scala.inline
    def setBindsVarargs(value: (js.Any | BindParameter)*): Self = StObject.set(x, "binds", js.Array(value :_*))
    
    @scala.inline
    def setCallback(value: SubscriptionMessage => Unit): Self = StObject.set(x, "callback", js.Any.fromFunction1(value))
    
    @scala.inline
    def setClientInitiated(value: Boolean): Self = StObject.set(x, "clientInitiated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientInitiatedUndefined: Self = StObject.set(x, "clientInitiated", js.undefined)
    
    @scala.inline
    def setGroupingClass(value: Double): Self = StObject.set(x, "groupingClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupingClassUndefined: Self = StObject.set(x, "groupingClass", js.undefined)
    
    @scala.inline
    def setGroupingType(value: Double): Self = StObject.set(x, "groupingType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupingTypeUndefined: Self = StObject.set(x, "groupingType", js.undefined)
    
    @scala.inline
    def setGroupingValue(value: Double): Self = StObject.set(x, "groupingValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupingValueUndefined: Self = StObject.set(x, "groupingValue", js.undefined)
    
    @scala.inline
    def setIpAddress(value: String): Self = StObject.set(x, "ipAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIpAddressUndefined: Self = StObject.set(x, "ipAddress", js.undefined)
    
    @scala.inline
    def setNamespace(value: Double): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamespaceUndefined: Self = StObject.set(x, "namespace", js.undefined)
    
    @scala.inline
    def setOperations(value: Double): Self = StObject.set(x, "operations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperationsUndefined: Self = StObject.set(x, "operations", js.undefined)
    
    @scala.inline
    def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
    
    @scala.inline
    def setQos(value: Double): Self = StObject.set(x, "qos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQosUndefined: Self = StObject.set(x, "qos", js.undefined)
    
    @scala.inline
    def setSql(value: String): Self = StObject.set(x, "sql", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
