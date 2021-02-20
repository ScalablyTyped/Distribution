package typings.mongodb.mod

import org.scalablytyped.runtime.StringDictionary
import typings.mongodb.mongodbStrings.invalidate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChangeEventInvalidate[TSchema /* <: StringDictionary[js.Any] */] extends ChangeEvent[TSchema] {
  
  var _id: ResumeToken = js.native
  
  var clusterTime: typings.bson.mod.Timestamp = js.native
  
  var operationType: invalidate = js.native
}
object ChangeEventInvalidate {
  
  @scala.inline
  def apply[TSchema /* <: StringDictionary[js.Any] */](_id: ResumeToken, clusterTime: typings.bson.mod.Timestamp, operationType: invalidate): ChangeEventInvalidate[TSchema] = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], clusterTime = clusterTime.asInstanceOf[js.Any], operationType = operationType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChangeEventInvalidate[TSchema]]
  }
  
  @scala.inline
  implicit class ChangeEventInvalidateMutableBuilder[Self <: ChangeEventInvalidate[_], TSchema /* <: StringDictionary[js.Any] */] (val x: Self with ChangeEventInvalidate[TSchema]) extends AnyVal {
    
    @scala.inline
    def setClusterTime(value: typings.bson.mod.Timestamp): Self = StObject.set(x, "clusterTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperationType(value: invalidate): Self = StObject.set(x, "operationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_id(value: ResumeToken): Self = StObject.set(x, "_id", value.asInstanceOf[js.Any])
  }
}
