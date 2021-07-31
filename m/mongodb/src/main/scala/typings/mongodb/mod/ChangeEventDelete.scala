package typings.mongodb.mod

import org.scalablytyped.runtime.StringDictionary
import typings.mongodb.anon.Coll
import typings.mongodb.anon.`5`
import typings.mongodb.mongodbStrings.delete
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChangeEventDelete[TSchema /* <: StringDictionary[js.Any] */]
  extends StObject
     with ChangeEventBase[TSchema]
     with ChangeEvent[TSchema] {
  
  var documentKey: `5`[TSchema]
  
  var operationType: delete
}
object ChangeEventDelete {
  
  @scala.inline
  def apply[TSchema /* <: StringDictionary[js.Any] */](_id: ResumeToken, clusterTime: typings.bson.mod.Timestamp, documentKey: `5`[TSchema], ns: Coll): ChangeEventDelete[TSchema] = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], clusterTime = clusterTime.asInstanceOf[js.Any], documentKey = documentKey.asInstanceOf[js.Any], ns = ns.asInstanceOf[js.Any], operationType = "delete")
    __obj.asInstanceOf[ChangeEventDelete[TSchema]]
  }
  
  @scala.inline
  implicit class ChangeEventDeleteMutableBuilder[Self <: ChangeEventDelete[?], TSchema /* <: StringDictionary[js.Any] */] (val x: Self & ChangeEventDelete[TSchema]) extends AnyVal {
    
    @scala.inline
    def setDocumentKey(value: `5`[TSchema]): Self = StObject.set(x, "documentKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperationType(value: delete): Self = StObject.set(x, "operationType", value.asInstanceOf[js.Any])
  }
}
