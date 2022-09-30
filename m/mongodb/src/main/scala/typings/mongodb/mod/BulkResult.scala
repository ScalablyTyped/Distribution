package typings.mongodb.mod

import typings.bson.mod.Document
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BulkResult extends StObject {
  
  var insertedIds: js.Array[Document]
  
  var nInserted: scala.Double
  
  var nMatched: scala.Double
  
  var nModified: scala.Double
  
  var nRemoved: scala.Double
  
  var nUpserted: scala.Double
  
  var ok: scala.Double
  
  var opTime: js.UndefOr[Document] = js.undefined
  
  var upserted: js.Array[Document]
  
  var writeConcernErrors: js.Array[WriteConcernError]
  
  var writeErrors: js.Array[WriteError]
}
object BulkResult {
  
  inline def apply(
    insertedIds: js.Array[Document],
    nInserted: scala.Double,
    nMatched: scala.Double,
    nModified: scala.Double,
    nRemoved: scala.Double,
    nUpserted: scala.Double,
    ok: scala.Double,
    upserted: js.Array[Document],
    writeConcernErrors: js.Array[WriteConcernError],
    writeErrors: js.Array[WriteError]
  ): BulkResult = {
    val __obj = js.Dynamic.literal(insertedIds = insertedIds.asInstanceOf[js.Any], nInserted = nInserted.asInstanceOf[js.Any], nMatched = nMatched.asInstanceOf[js.Any], nModified = nModified.asInstanceOf[js.Any], nRemoved = nRemoved.asInstanceOf[js.Any], nUpserted = nUpserted.asInstanceOf[js.Any], ok = ok.asInstanceOf[js.Any], upserted = upserted.asInstanceOf[js.Any], writeConcernErrors = writeConcernErrors.asInstanceOf[js.Any], writeErrors = writeErrors.asInstanceOf[js.Any])
    __obj.asInstanceOf[BulkResult]
  }
  
  extension [Self <: BulkResult](x: Self) {
    
    inline def setInsertedIds(value: js.Array[Document]): Self = StObject.set(x, "insertedIds", value.asInstanceOf[js.Any])
    
    inline def setInsertedIdsVarargs(value: Document*): Self = StObject.set(x, "insertedIds", js.Array(value*))
    
    inline def setNInserted(value: scala.Double): Self = StObject.set(x, "nInserted", value.asInstanceOf[js.Any])
    
    inline def setNMatched(value: scala.Double): Self = StObject.set(x, "nMatched", value.asInstanceOf[js.Any])
    
    inline def setNModified(value: scala.Double): Self = StObject.set(x, "nModified", value.asInstanceOf[js.Any])
    
    inline def setNRemoved(value: scala.Double): Self = StObject.set(x, "nRemoved", value.asInstanceOf[js.Any])
    
    inline def setNUpserted(value: scala.Double): Self = StObject.set(x, "nUpserted", value.asInstanceOf[js.Any])
    
    inline def setOk(value: scala.Double): Self = StObject.set(x, "ok", value.asInstanceOf[js.Any])
    
    inline def setOpTime(value: Document): Self = StObject.set(x, "opTime", value.asInstanceOf[js.Any])
    
    inline def setOpTimeUndefined: Self = StObject.set(x, "opTime", js.undefined)
    
    inline def setUpserted(value: js.Array[Document]): Self = StObject.set(x, "upserted", value.asInstanceOf[js.Any])
    
    inline def setUpsertedVarargs(value: Document*): Self = StObject.set(x, "upserted", js.Array(value*))
    
    inline def setWriteConcernErrors(value: js.Array[WriteConcernError]): Self = StObject.set(x, "writeConcernErrors", value.asInstanceOf[js.Any])
    
    inline def setWriteConcernErrorsVarargs(value: WriteConcernError*): Self = StObject.set(x, "writeConcernErrors", js.Array(value*))
    
    inline def setWriteErrors(value: js.Array[WriteError]): Self = StObject.set(x, "writeErrors", value.asInstanceOf[js.Any])
    
    inline def setWriteErrorsVarargs(value: WriteError*): Self = StObject.set(x, "writeErrors", js.Array(value*))
  }
}
