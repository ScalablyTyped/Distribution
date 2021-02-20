package typings.mongodb.mod

import org.scalablytyped.runtime.StringDictionary
import typings.mongodb.anon.Coll
import typings.mongodb.anon.`5`
import typings.mongodb.mongodbStrings.delete
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChangeEventDelete[TSchema /* <: StringDictionary[js.Any] */]
  extends ChangeEventBase[TSchema]
     with ChangeEvent[TSchema] {
  
  var documentKey: `5`[TSchema] = js.native
  
  var operationType: delete = js.native
}
object ChangeEventDelete {
  
  @scala.inline
  def apply[TSchema /* <: StringDictionary[js.Any] */](
    _id: ResumeToken,
    clusterTime: typings.bson.mod.Timestamp,
    documentKey: `5`[TSchema],
    ns: Coll,
    operationType: delete
  ): ChangeEventDelete[TSchema] = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], clusterTime = clusterTime.asInstanceOf[js.Any], documentKey = documentKey.asInstanceOf[js.Any], ns = ns.asInstanceOf[js.Any], operationType = operationType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChangeEventDelete[TSchema]]
  }
  
  @scala.inline
  implicit class ChangeEventDeleteMutableBuilder[Self <: ChangeEventDelete[_], TSchema /* <: StringDictionary[js.Any] */] (val x: Self with ChangeEventDelete[TSchema]) extends AnyVal {
    
    @scala.inline
    def setDocumentKey(value: `5`[TSchema]): Self = StObject.set(x, "documentKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperationType(value: delete): Self = StObject.set(x, "operationType", value.asInstanceOf[js.Any])
  }
}
