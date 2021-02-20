package typings.mongodb.mod

import typings.mongodb.anon.Coll
import typings.mongodb.anon.RemovedFields
import typings.mongodb.anon.`5`
import typings.mongodb.mongodbStrings.delete
import typings.mongodb.mongodbStrings.drop
import typings.mongodb.mongodbStrings.dropDatabase
import typings.mongodb.mongodbStrings.insert
import typings.mongodb.mongodbStrings.invalidate
import typings.mongodb.mongodbStrings.rename
import typings.mongodb.mongodbStrings.replace
import typings.mongodb.mongodbStrings.update
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.mongodb.mod.ChangeEventCR[TSchema]
  - typings.mongodb.mod.ChangeEventUpdate[TSchema]
  - typings.mongodb.mod.ChangeEventDelete[TSchema]
  - typings.mongodb.mod.ChangeEventRename[TSchema]
  - typings.mongodb.mod.ChangeEventOther[TSchema]
  - typings.mongodb.mod.ChangeEventInvalidate[TSchema]
*/
trait ChangeEvent[TSchema /* <: js.Object */] extends StObject
object ChangeEvent {
  
  @scala.inline
  def ChangeEventCR[TSchema /* <: js.Object */](
    _id: ResumeToken,
    clusterTime: typings.bson.mod.Timestamp,
    documentKey: `5`[TSchema],
    ns: Coll,
    operationType: insert | replace
  ): typings.mongodb.mod.ChangeEventCR[TSchema] = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], clusterTime = clusterTime.asInstanceOf[js.Any], documentKey = documentKey.asInstanceOf[js.Any], ns = ns.asInstanceOf[js.Any], operationType = operationType.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.mongodb.mod.ChangeEventCR[TSchema]]
  }
  
  @scala.inline
  def ChangeEventDelete[TSchema /* <: js.Object */](
    _id: ResumeToken,
    clusterTime: typings.bson.mod.Timestamp,
    documentKey: `5`[TSchema],
    ns: Coll,
    operationType: delete
  ): typings.mongodb.mod.ChangeEventDelete[TSchema] = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], clusterTime = clusterTime.asInstanceOf[js.Any], documentKey = documentKey.asInstanceOf[js.Any], ns = ns.asInstanceOf[js.Any], operationType = operationType.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.mongodb.mod.ChangeEventDelete[TSchema]]
  }
  
  @scala.inline
  def ChangeEventInvalidate[TSchema /* <: js.Object */](_id: ResumeToken, clusterTime: typings.bson.mod.Timestamp, operationType: invalidate): typings.mongodb.mod.ChangeEventInvalidate[TSchema] = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], clusterTime = clusterTime.asInstanceOf[js.Any], operationType = operationType.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.mongodb.mod.ChangeEventInvalidate[TSchema]]
  }
  
  @scala.inline
  def ChangeEventOther[TSchema /* <: js.Object */](
    _id: ResumeToken,
    clusterTime: typings.bson.mod.Timestamp,
    ns: Coll,
    operationType: drop | dropDatabase
  ): typings.mongodb.mod.ChangeEventOther[TSchema] = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], clusterTime = clusterTime.asInstanceOf[js.Any], ns = ns.asInstanceOf[js.Any], operationType = operationType.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.mongodb.mod.ChangeEventOther[TSchema]]
  }
  
  @scala.inline
  def ChangeEventRename[TSchema /* <: js.Object */](
    _id: ResumeToken,
    clusterTime: typings.bson.mod.Timestamp,
    ns: Coll,
    operationType: rename,
    to: Coll
  ): typings.mongodb.mod.ChangeEventRename[TSchema] = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], clusterTime = clusterTime.asInstanceOf[js.Any], ns = ns.asInstanceOf[js.Any], operationType = operationType.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.mongodb.mod.ChangeEventRename[TSchema]]
  }
  
  @scala.inline
  def ChangeEventUpdate[TSchema /* <: js.Object */](
    _id: ResumeToken,
    clusterTime: typings.bson.mod.Timestamp,
    documentKey: `5`[TSchema],
    ns: Coll,
    operationType: update,
    updateDescription: RemovedFields[TSchema]
  ): typings.mongodb.mod.ChangeEventUpdate[TSchema] = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], clusterTime = clusterTime.asInstanceOf[js.Any], documentKey = documentKey.asInstanceOf[js.Any], ns = ns.asInstanceOf[js.Any], operationType = operationType.asInstanceOf[js.Any], updateDescription = updateDescription.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.mongodb.mod.ChangeEventUpdate[TSchema]]
  }
}
