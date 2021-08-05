package typings.mongodb.mod

import typings.mongodb.anon.IdObjectId
import typings.mongodb.anon.NModified
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateWriteOpResult extends StObject {
  
  var connection: js.Any
  
  var matchedCount: scala.Double
  
  var modifiedCount: scala.Double
  
  var result: NModified
  
  var upsertedCount: scala.Double
  
  var upsertedId: IdObjectId
}
object UpdateWriteOpResult {
  
  inline def apply(
    connection: js.Any,
    matchedCount: scala.Double,
    modifiedCount: scala.Double,
    result: NModified,
    upsertedCount: scala.Double,
    upsertedId: IdObjectId
  ): UpdateWriteOpResult = {
    val __obj = js.Dynamic.literal(connection = connection.asInstanceOf[js.Any], matchedCount = matchedCount.asInstanceOf[js.Any], modifiedCount = modifiedCount.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any], upsertedCount = upsertedCount.asInstanceOf[js.Any], upsertedId = upsertedId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateWriteOpResult]
  }
  
  extension [Self <: UpdateWriteOpResult](x: Self) {
    
    inline def setConnection(value: js.Any): Self = StObject.set(x, "connection", value.asInstanceOf[js.Any])
    
    inline def setMatchedCount(value: scala.Double): Self = StObject.set(x, "matchedCount", value.asInstanceOf[js.Any])
    
    inline def setModifiedCount(value: scala.Double): Self = StObject.set(x, "modifiedCount", value.asInstanceOf[js.Any])
    
    inline def setResult(value: NModified): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    inline def setUpsertedCount(value: scala.Double): Self = StObject.set(x, "upsertedCount", value.asInstanceOf[js.Any])
    
    inline def setUpsertedId(value: IdObjectId): Self = StObject.set(x, "upsertedId", value.asInstanceOf[js.Any])
  }
}
