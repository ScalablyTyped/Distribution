package typings
package oracledbLib.oracledbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Information about a subscription's notification.
  */
trait SubscriptionMessage extends js.Object {
  /** Name of the database which sent the notification. */
  var dbName: js.UndefOr[java.lang.String] = js.undefined
  /** Array of objects specifying the queries which were affected by the Query Change notification. */
  var queries: js.UndefOr[js.Array[oracledbLib.Anon_Tables]] = js.undefined
  /** Indicates whether the subscription is registerd with the database. */
  var registered: js.UndefOr[scala.Boolean] = js.undefined
  /** Array of objects specifying the tables which were affected by the notification. */
  var tables: js.UndefOr[js.Array[SubscriptionTables]] = js.undefined
  /** Buffer containing the identifier of the transaction which spawned the notification. */
  var txId: js.UndefOr[nodeLib.Buffer] = js.undefined
  /** Type of notification sent. One of the Subscribe Event Type Constants. */
  var `type`: js.UndefOr[scala.Double] = js.undefined
}

object SubscriptionMessage {
  @scala.inline
  def apply(
    dbName: java.lang.String = null,
    queries: js.Array[oracledbLib.Anon_Tables] = null,
    registered: js.UndefOr[scala.Boolean] = js.undefined,
    tables: js.Array[SubscriptionTables] = null,
    txId: nodeLib.Buffer = null,
    `type`: scala.Int | scala.Double = null
  ): SubscriptionMessage = {
    val __obj = js.Dynamic.literal()
    if (dbName != null) __obj.updateDynamic("dbName")(dbName)
    if (queries != null) __obj.updateDynamic("queries")(queries)
    if (!js.isUndefined(registered)) __obj.updateDynamic("registered")(registered)
    if (tables != null) __obj.updateDynamic("tables")(tables)
    if (txId != null) __obj.updateDynamic("txId")(txId)
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubscriptionMessage]
  }
}

