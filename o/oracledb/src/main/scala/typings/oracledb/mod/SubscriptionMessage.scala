package typings.oracledb.mod

import typings.node.Buffer
import typings.oracledb.anon.Tables
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Information about a subscription's notification.
  */
@js.native
trait SubscriptionMessage extends StObject {
  
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
  implicit class SubscriptionMessageMutableBuilder[Self <: SubscriptionMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDbName(value: String): Self = StObject.set(x, "dbName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDbNameUndefined: Self = StObject.set(x, "dbName", js.undefined)
    
    @scala.inline
    def setQueries(value: js.Array[Tables]): Self = StObject.set(x, "queries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueriesUndefined: Self = StObject.set(x, "queries", js.undefined)
    
    @scala.inline
    def setQueriesVarargs(value: Tables*): Self = StObject.set(x, "queries", js.Array(value :_*))
    
    @scala.inline
    def setQueueName(value: String): Self = StObject.set(x, "queueName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueueNameUndefined: Self = StObject.set(x, "queueName", js.undefined)
    
    @scala.inline
    def setRegistered(value: Boolean): Self = StObject.set(x, "registered", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTables(value: js.Array[SubscriptionTables]): Self = StObject.set(x, "tables", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTablesUndefined: Self = StObject.set(x, "tables", js.undefined)
    
    @scala.inline
    def setTablesVarargs(value: SubscriptionTables*): Self = StObject.set(x, "tables", js.Array(value :_*))
    
    @scala.inline
    def setTxId(value: Buffer): Self = StObject.set(x, "txId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: Double): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
