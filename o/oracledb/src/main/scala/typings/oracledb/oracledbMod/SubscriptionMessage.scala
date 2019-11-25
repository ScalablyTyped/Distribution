package typings.oracledb.oracledbMod

import typings.node.Buffer
import typings.oracledb.Anon_Tables
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Information about a subscription's notification.
  */
trait SubscriptionMessage extends js.Object {
  /** Name of the database which sent the notification. */
  var dbName: js.UndefOr[String] = js.undefined
  /** Array of objects specifying the queries which were affected by the Query Change notification. */
  var queries: js.UndefOr[js.Array[Anon_Tables]] = js.undefined
  /**
    * Name of the Advanced Queue. Undefined for CQN.
    * 
    * @since 4.0
    */
  var queueName: js.UndefOr[String] = js.undefined
  /** Indicates whether the subscription is registered with the database. */
  var registered: Boolean
  /** Array of objects specifying the tables which were affected by the notification. */
  var tables: js.UndefOr[js.Array[SubscriptionTables]] = js.undefined
  /** Buffer containing the identifier of the transaction which spawned the notification. */
  var txId: Buffer
  /** Type of notification sent. One of the Subscribe Event Type Constants. */
  var `type`: Double
}

object SubscriptionMessage {
  @scala.inline
  def apply(
    registered: Boolean,
    txId: Buffer,
    `type`: Double,
    dbName: String = null,
    queries: js.Array[Anon_Tables] = null,
    queueName: String = null,
    tables: js.Array[SubscriptionTables] = null
  ): SubscriptionMessage = {
    val __obj = js.Dynamic.literal(registered = registered.asInstanceOf[js.Any], txId = txId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (dbName != null) __obj.updateDynamic("dbName")(dbName.asInstanceOf[js.Any])
    if (queries != null) __obj.updateDynamic("queries")(queries.asInstanceOf[js.Any])
    if (queueName != null) __obj.updateDynamic("queueName")(queueName.asInstanceOf[js.Any])
    if (tables != null) __obj.updateDynamic("tables")(tables.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubscriptionMessage]
  }
}

