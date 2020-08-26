package typings.oracledb.mod

import typings.node.Buffer
import typings.oracledb.anon.Tables
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Information about a subscription's notification.
  */
@js.native
trait SubscriptionMessage extends js.Object {
  /** Name of the database which sent the notification. */
  var dbName: js.UndefOr[String] = js.native
  /** Array of objects specifying the queries which were affected by the Query Change notification. */
  var queries: js.UndefOr[js.Array[Tables]] = js.native
  /**
    * Name of the Advanced Queue. Undefined for CQN.
    * 
    * @since 4.0
    */
  var queueName: js.UndefOr[String] = js.native
  /** Indicates whether the subscription is registered with the database. */
  var registered: Boolean = js.native
  /** Array of objects specifying the tables which were affected by the notification. */
  var tables: js.UndefOr[js.Array[SubscriptionTables]] = js.native
  /** Buffer containing the identifier of the transaction which spawned the notification. */
  var txId: Buffer = js.native
  /** Type of notification sent. One of the Subscribe Event Type Constants. */
  var `type`: Double = js.native
}

object SubscriptionMessage {
  @scala.inline
  def apply(registered: Boolean, txId: Buffer, `type`: Double): SubscriptionMessage = {
    val __obj = js.Dynamic.literal(registered = registered.asInstanceOf[js.Any], txId = txId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubscriptionMessage]
  }
  @scala.inline
  implicit class SubscriptionMessageOps[Self <: SubscriptionMessage] (val x: Self) extends AnyVal {
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
    def setRegistered(value: Boolean): Self = this.set("registered", value.asInstanceOf[js.Any])
    @scala.inline
    def setTxId(value: Buffer): Self = this.set("txId", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: Double): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setDbName(value: String): Self = this.set("dbName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDbName: Self = this.set("dbName", js.undefined)
    @scala.inline
    def setQueriesVarargs(value: Tables*): Self = this.set("queries", js.Array(value :_*))
    @scala.inline
    def setQueries(value: js.Array[Tables]): Self = this.set("queries", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQueries: Self = this.set("queries", js.undefined)
    @scala.inline
    def setQueueName(value: String): Self = this.set("queueName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQueueName: Self = this.set("queueName", js.undefined)
    @scala.inline
    def setTablesVarargs(value: SubscriptionTables*): Self = this.set("tables", js.Array(value :_*))
    @scala.inline
    def setTables(value: js.Array[SubscriptionTables]): Self = this.set("tables", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTables: Self = this.set("tables", js.undefined)
  }
  
}

