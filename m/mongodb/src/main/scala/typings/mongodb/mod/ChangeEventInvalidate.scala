package typings.mongodb.mod

import org.scalablytyped.runtime.StringDictionary
import typings.mongodb.mongodbStrings.invalidate
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
  implicit class ChangeEventInvalidateOps[Self <: ChangeEventInvalidate[_], TSchema /* <: StringDictionary[js.Any] */] (val x: Self with ChangeEventInvalidate[TSchema]) extends AnyVal {
    
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
    def set_id(value: ResumeToken): Self = this.set("_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClusterTime(value: typings.bson.mod.Timestamp): Self = this.set("clusterTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperationType(value: invalidate): Self = this.set("operationType", value.asInstanceOf[js.Any])
  }
}
