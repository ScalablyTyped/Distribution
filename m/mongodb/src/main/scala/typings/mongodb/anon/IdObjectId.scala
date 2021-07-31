package typings.mongodb.anon

import typings.bson.mod.ObjectId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IdObjectId extends StObject {
  
  var _id: ObjectId
}
object IdObjectId {
  
  @scala.inline
  def apply(_id: ObjectId): IdObjectId = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdObjectId]
  }
  
  @scala.inline
  implicit class IdObjectIdMutableBuilder[Self <: IdObjectId] (val x: Self) extends AnyVal {
    
    @scala.inline
    def set_id(value: ObjectId): Self = StObject.set(x, "_id", value.asInstanceOf[js.Any])
  }
}
