package typings.mongodb.mod

import org.scalablytyped.runtime.StringDictionary
import typings.mongodb.anon.Coll
import typings.mongodb.anon.`5`
import typings.mongodb.mongodbStrings.insert
import typings.mongodb.mongodbStrings.replace
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChangeEventCR[TSchema /* <: StringDictionary[js.Any] */]
  extends StObject
     with ChangeEventBase[TSchema]
     with ChangeEvent[TSchema] {
  
  var documentKey: `5`[TSchema]
  
  var fullDocument: js.UndefOr[TSchema] = js.undefined
  
  var operationType: insert | replace
}
object ChangeEventCR {
  
  @scala.inline
  def apply[TSchema /* <: StringDictionary[js.Any] */](
    _id: ResumeToken,
    clusterTime: typings.bson.mod.Timestamp,
    documentKey: `5`[TSchema],
    ns: Coll,
    operationType: insert | replace
  ): ChangeEventCR[TSchema] = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], clusterTime = clusterTime.asInstanceOf[js.Any], documentKey = documentKey.asInstanceOf[js.Any], ns = ns.asInstanceOf[js.Any], operationType = operationType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChangeEventCR[TSchema]]
  }
  
  @scala.inline
  implicit class ChangeEventCRMutableBuilder[Self <: ChangeEventCR[?], TSchema /* <: StringDictionary[js.Any] */] (val x: Self & ChangeEventCR[TSchema]) extends AnyVal {
    
    @scala.inline
    def setDocumentKey(value: `5`[TSchema]): Self = StObject.set(x, "documentKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFullDocument(value: TSchema): Self = StObject.set(x, "fullDocument", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFullDocumentUndefined: Self = StObject.set(x, "fullDocument", js.undefined)
    
    @scala.inline
    def setOperationType(value: insert | replace): Self = StObject.set(x, "operationType", value.asInstanceOf[js.Any])
  }
}
