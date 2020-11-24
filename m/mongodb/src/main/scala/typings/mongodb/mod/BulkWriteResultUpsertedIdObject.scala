package typings.mongodb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BulkWriteResultUpsertedIdObject extends js.Object {
  
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
  implicit class BulkWriteResultUpsertedIdObjectOps[Self <: BulkWriteResultUpsertedIdObject] (val x: Self) extends AnyVal {
    
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
    def set_id(value: typings.bson.mod.ObjectId): Self = this.set("_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndex(value: scala.Double): Self = this.set("index", value.asInstanceOf[js.Any])
  }
}
