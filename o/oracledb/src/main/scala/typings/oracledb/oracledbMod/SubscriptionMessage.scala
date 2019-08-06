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
  /** Indicates whether the subscription is registerd with the database. */
  var registered: js.UndefOr[Boolean] = js.undefined
  /** Array of objects specifying the tables which were affected by the notification. */
  var tables: js.UndefOr[js.Array[SubscriptionTables]] = js.undefined
  /** Buffer containing the identifier of the transaction which spawned the notification. */
  var txId: js.UndefOr[Buffer] = js.undefined
  /** Type of notification sent. One of the Subscribe Event Type Constants. */
  var `type`: js.UndefOr[Double] = js.undefined
}

object SubscriptionMessage {
  @scala.inline
  def apply(
    dbName: String = null,
    queries: js.Array[Anon_Tables] = null,
    queueName: String = null,
    registered: js.UndefOr[Boolean] = js.undefined,
    tables: js.Array[SubscriptionTables] = null,
    txId: Buffer = null,
    `type`: Int | Double = null
  ): SubscriptionMessage = {
    val __obj = js.Dynamic.literal()
    if (dbName != null) __obj.updateDynamic("dbName")(dbName)
    if (queries != null) __obj.updateDynamic("queries")(queries)
    if (queueName != null) __obj.updateDynamic("queueName")(queueName)
    if (!js.isUndefined(registered)) __obj.updateDynamic("registered")(registered)
    if (tables != null) __obj.updateDynamic("tables")(tables)
    if (txId != null) __obj.updateDynamic("txId")(txId)
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubscriptionMessage]
  }
}

