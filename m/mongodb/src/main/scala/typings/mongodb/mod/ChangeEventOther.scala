package typings.mongodb.mod

import org.scalablytyped.runtime.StringDictionary
import typings.mongodb.anon.Coll
import typings.mongodb.mongodbStrings.drop
import typings.mongodb.mongodbStrings.dropDatabase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChangeEventOther[TSchema /* <: StringDictionary[js.Any] */]
  extends StObject
     with ChangeEventBase[TSchema]
     with ChangeEvent[TSchema] {
  
  var operationType: drop | dropDatabase
}
object ChangeEventOther {
  
  inline def apply[TSchema /* <: StringDictionary[js.Any] */](
    _id: ResumeToken,
    clusterTime: typings.bson.mod.Timestamp,
    ns: Coll,
    operationType: drop | dropDatabase
  ): ChangeEventOther[TSchema] = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], clusterTime = clusterTime.asInstanceOf[js.Any], ns = ns.asInstanceOf[js.Any], operationType = operationType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChangeEventOther[TSchema]]
  }
  
  extension [Self <: ChangeEventOther[?], TSchema /* <: StringDictionary[js.Any] */](x: Self & ChangeEventOther[TSchema]) {
    
    inline def setOperationType(value: drop | dropDatabase): Self = StObject.set(x, "operationType", value.asInstanceOf[js.Any])
  }
}
