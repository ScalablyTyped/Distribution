package typings.mongodb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BulkWriteResultUpsertedIdObject extends StObject {
  
  var _id: typings.bson.mod.ObjectId
  
  var index: scala.Double
}
object BulkWriteResultUpsertedIdObject {
  
  inline def apply(_id: typings.bson.mod.ObjectId, index: scala.Double): BulkWriteResultUpsertedIdObject = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any])
    __obj.asInstanceOf[BulkWriteResultUpsertedIdObject]
  }
  
  extension [Self <: BulkWriteResultUpsertedIdObject](x: Self) {
    
    inline def setIndex(value: scala.Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def set_id(value: typings.bson.mod.ObjectId): Self = StObject.set(x, "_id", value.asInstanceOf[js.Any])
  }
}
