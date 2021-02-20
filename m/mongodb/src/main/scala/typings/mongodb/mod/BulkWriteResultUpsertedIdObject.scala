package typings.mongodb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BulkWriteResultUpsertedIdObject extends StObject {
  
  var _id: typings.bson.mod.ObjectId = js.native
  
  var index: scala.Double = js.native
}
object BulkWriteResultUpsertedIdObject {
  
  @scala.inline
  def apply(_id: typings.bson.mod.ObjectId, index: scala.Double): BulkWriteResultUpsertedIdObject = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any])
    __obj.asInstanceOf[BulkWriteResultUpsertedIdObject]
  }
  
  @scala.inline
  implicit class BulkWriteResultUpsertedIdObjectMutableBuilder[Self <: BulkWriteResultUpsertedIdObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIndex(value: scala.Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_id(value: typings.bson.mod.ObjectId): Self = StObject.set(x, "_id", value.asInstanceOf[js.Any])
  }
}
