package typings.mongodb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChangeStreamDocumentCommon extends StObject {
  
  /**
    * The id functions as an opaque token for use when resuming an interrupted
    * change stream.
    */
  var _id: ResumeToken
  
  /**
    * The timestamp from the oplog entry associated with the event.
    * For events that happened as part of a multi-document transaction, the associated change stream
    * notifications will have the same clusterTime value, namely the time when the transaction was committed.
    * On a sharded cluster, events that occur on different shards can have the same clusterTime but be
    * associated with different transactions or even not be associated with any transaction.
    * To identify events for a single transaction, you can use the combination of lsid and txnNumber in the change stream event document.
    */
  var clusterTime: js.UndefOr[typings.bson.mod.Timestamp] = js.undefined
  
  /**
    * The identifier for the session associated with the transaction.
    * Only present if the operation is part of a multi-document transaction.
    */
  var lsid: js.UndefOr[ServerSessionId] = js.undefined
  
  /**
    * The transaction number.
    * Only present if the operation is part of a multi-document transaction.
    *
    * **NOTE:** txnNumber can be a Long if promoteLongs is set to false
    */
  var txnNumber: js.UndefOr[scala.Double] = js.undefined
}
object ChangeStreamDocumentCommon {
  
  inline def apply(_id: ResumeToken): ChangeStreamDocumentCommon = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChangeStreamDocumentCommon]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ChangeStreamDocumentCommon] (val x: Self) extends AnyVal {
    
    inline def setClusterTime(value: typings.bson.mod.Timestamp): Self = StObject.set(x, "clusterTime", value.asInstanceOf[js.Any])
    
    inline def setClusterTimeUndefined: Self = StObject.set(x, "clusterTime", js.undefined)
    
    inline def setLsid(value: ServerSessionId): Self = StObject.set(x, "lsid", value.asInstanceOf[js.Any])
    
    inline def setLsidUndefined: Self = StObject.set(x, "lsid", js.undefined)
    
    inline def setTxnNumber(value: scala.Double): Self = StObject.set(x, "txnNumber", value.asInstanceOf[js.Any])
    
    inline def setTxnNumberUndefined: Self = StObject.set(x, "txnNumber", js.undefined)
    
    inline def set_id(value: ResumeToken): Self = StObject.set(x, "_id", value.asInstanceOf[js.Any])
  }
}
