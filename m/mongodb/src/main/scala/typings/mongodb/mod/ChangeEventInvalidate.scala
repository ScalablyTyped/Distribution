package typings.mongodb.mod

import org.scalablytyped.runtime.StringDictionary
import typings.mongodb.mongodbStrings.invalidate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChangeEventInvalidate[TSchema /* <: StringDictionary[js.Any] */]
  extends StObject
     with ChangeEvent[TSchema] {
  
  var _id: ResumeToken
  
  var clusterTime: typings.bson.mod.Timestamp
  
  var operationType: invalidate
}
object ChangeEventInvalidate {
  
  inline def apply[TSchema /* <: StringDictionary[js.Any] */](_id: ResumeToken, clusterTime: typings.bson.mod.Timestamp): ChangeEventInvalidate[TSchema] = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], clusterTime = clusterTime.asInstanceOf[js.Any], operationType = "invalidate")
    __obj.asInstanceOf[ChangeEventInvalidate[TSchema]]
  }
  
  extension [Self <: ChangeEventInvalidate[?], TSchema /* <: StringDictionary[js.Any] */](x: Self & ChangeEventInvalidate[TSchema]) {
    
    inline def setClusterTime(value: typings.bson.mod.Timestamp): Self = StObject.set(x, "clusterTime", value.asInstanceOf[js.Any])
    
    inline def setOperationType(value: invalidate): Self = StObject.set(x, "operationType", value.asInstanceOf[js.Any])
    
    inline def set_id(value: ResumeToken): Self = StObject.set(x, "_id", value.asInstanceOf[js.Any])
  }
}
