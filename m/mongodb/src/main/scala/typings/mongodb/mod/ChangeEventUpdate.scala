package typings.mongodb.mod

import org.scalablytyped.runtime.StringDictionary
import typings.mongodb.anon.Coll
import typings.mongodb.anon.RemovedFields
import typings.mongodb.anon.`5`
import typings.mongodb.mongodbStrings.update
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChangeEventUpdate[TSchema /* <: StringDictionary[js.Any] */]
  extends ChangeEventBase[TSchema]
     with ChangeEvent[TSchema] {
  
  var documentKey: `5`[TSchema] = js.native
  
  var fullDocument: js.UndefOr[TSchema] = js.native
  
  var operationType: update = js.native
  
  var updateDescription: RemovedFields[TSchema] = js.native
}
object ChangeEventUpdate {
  
  @scala.inline
  def apply[TSchema /* <: StringDictionary[js.Any] */](
    _id: ResumeToken,
    clusterTime: typings.bson.mod.Timestamp,
    documentKey: `5`[TSchema],
    ns: Coll,
    operationType: update,
    updateDescription: RemovedFields[TSchema]
  ): ChangeEventUpdate[TSchema] = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], clusterTime = clusterTime.asInstanceOf[js.Any], documentKey = documentKey.asInstanceOf[js.Any], ns = ns.asInstanceOf[js.Any], operationType = operationType.asInstanceOf[js.Any], updateDescription = updateDescription.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChangeEventUpdate[TSchema]]
  }
  
  @scala.inline
  implicit class ChangeEventUpdateMutableBuilder[Self <: ChangeEventUpdate[_], TSchema /* <: StringDictionary[js.Any] */] (val x: Self with ChangeEventUpdate[TSchema]) extends AnyVal {
    
    @scala.inline
    def setDocumentKey(value: `5`[TSchema]): Self = StObject.set(x, "documentKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFullDocument(value: TSchema): Self = StObject.set(x, "fullDocument", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFullDocumentUndefined: Self = StObject.set(x, "fullDocument", js.undefined)
    
    @scala.inline
    def setOperationType(value: update): Self = StObject.set(x, "operationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateDescription(value: RemovedFields[TSchema]): Self = StObject.set(x, "updateDescription", value.asInstanceOf[js.Any])
  }
}
