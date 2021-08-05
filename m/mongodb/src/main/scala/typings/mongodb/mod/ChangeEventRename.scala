package typings.mongodb.mod

import org.scalablytyped.runtime.StringDictionary
import typings.mongodb.anon.Coll
import typings.mongodb.mongodbStrings.rename
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChangeEventRename[TSchema /* <: StringDictionary[js.Any] */]
  extends StObject
     with ChangeEventBase[TSchema]
     with ChangeEvent[TSchema] {
  
  var operationType: rename
  
  var to: Coll
}
object ChangeEventRename {
  
  inline def apply[TSchema /* <: StringDictionary[js.Any] */](_id: ResumeToken, clusterTime: typings.bson.mod.Timestamp, ns: Coll, to: Coll): ChangeEventRename[TSchema] = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], clusterTime = clusterTime.asInstanceOf[js.Any], ns = ns.asInstanceOf[js.Any], operationType = "rename", to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChangeEventRename[TSchema]]
  }
  
  extension [Self <: ChangeEventRename[?], TSchema /* <: StringDictionary[js.Any] */](x: Self & ChangeEventRename[TSchema]) {
    
    inline def setOperationType(value: rename): Self = StObject.set(x, "operationType", value.asInstanceOf[js.Any])
    
    inline def setTo(value: Coll): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
  }
}
