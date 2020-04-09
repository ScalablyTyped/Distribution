package typings.mongodb.mod

import typings.mongodb.AnonColl
import typings.mongodb.AnonIdExtractIdType
import typings.mongodb.AnonRemovedFields
import typings.mongodb.AnonUid
import typings.mongodb.mongodbStrings.delete
import typings.mongodb.mongodbStrings.drop
import typings.mongodb.mongodbStrings.dropDatabase
import typings.mongodb.mongodbStrings.insert
import typings.mongodb.mongodbStrings.invalidate
import typings.mongodb.mongodbStrings.rename
import typings.mongodb.mongodbStrings.replace
import typings.mongodb.mongodbStrings.update
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.mongodb.mod.ChangeEventCR[TSchema]
  - typings.mongodb.mod.ChangeEventUpdate[TSchema]
  - typings.mongodb.mod.ChangeEventDelete[TSchema]
  - typings.mongodb.mod.ChangeEventRename[TSchema]
  - typings.mongodb.mod.ChangeEventOther[TSchema]
  - typings.mongodb.mod.ChangeEventInvalidate[TSchema]
*/
trait ChangeEvent[TSchema /* <: js.Object */] extends js.Object

object ChangeEvent {
  @scala.inline
  def ChangeEventOther[TSchema /* <: js.Object */](
    _id: ResumeToken,
    clusterTime: typings.bson.mod.Timestamp,
    ns: AnonColl,
    operationType: drop | dropDatabase,
    lsid: AnonUid = null,
    txnNumber: Int | scala.Double = null
  ): ChangeEvent[TSchema] = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], clusterTime = clusterTime.asInstanceOf[js.Any], ns = ns.asInstanceOf[js.Any], operationType = operationType.asInstanceOf[js.Any])
    if (lsid != null) __obj.updateDynamic("lsid")(lsid.asInstanceOf[js.Any])
    if (txnNumber != null) __obj.updateDynamic("txnNumber")(txnNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChangeEvent[TSchema]]
  }
  @scala.inline
  def ChangeEventRename[TSchema /* <: js.Object */](
    _id: ResumeToken,
    clusterTime: typings.bson.mod.Timestamp,
    ns: AnonColl,
    operationType: rename,
    to: AnonColl,
    lsid: AnonUid = null,
    txnNumber: Int | scala.Double = null
  ): ChangeEvent[TSchema] = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], clusterTime = clusterTime.asInstanceOf[js.Any], ns = ns.asInstanceOf[js.Any], operationType = operationType.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    if (lsid != null) __obj.updateDynamic("lsid")(lsid.asInstanceOf[js.Any])
    if (txnNumber != null) __obj.updateDynamic("txnNumber")(txnNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChangeEvent[TSchema]]
  }
  @scala.inline
  def ChangeEventInvalidate[TSchema /* <: js.Object */](_id: ResumeToken, clusterTime: typings.bson.mod.Timestamp, operationType: invalidate): ChangeEvent[TSchema] = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], clusterTime = clusterTime.asInstanceOf[js.Any], operationType = operationType.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ChangeEvent[TSchema]]
  }
  @scala.inline
  def ChangeEventUpdate[TSchema /* <: js.Object */](
    _id: ResumeToken,
    clusterTime: typings.bson.mod.Timestamp,
    documentKey: AnonIdExtractIdType[TSchema],
    ns: AnonColl,
    operationType: update,
    updateDescription: AnonRemovedFields[TSchema],
    fullDocument: TSchema = null,
    lsid: AnonUid = null,
    txnNumber: Int | scala.Double = null
  ): ChangeEvent[TSchema] = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], clusterTime = clusterTime.asInstanceOf[js.Any], documentKey = documentKey.asInstanceOf[js.Any], ns = ns.asInstanceOf[js.Any], operationType = operationType.asInstanceOf[js.Any], updateDescription = updateDescription.asInstanceOf[js.Any])
    if (fullDocument != null) __obj.updateDynamic("fullDocument")(fullDocument.asInstanceOf[js.Any])
    if (lsid != null) __obj.updateDynamic("lsid")(lsid.asInstanceOf[js.Any])
    if (txnNumber != null) __obj.updateDynamic("txnNumber")(txnNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChangeEvent[TSchema]]
  }
  @scala.inline
  def ChangeEventCR[TSchema /* <: js.Object */](
    _id: ResumeToken,
    clusterTime: typings.bson.mod.Timestamp,
    documentKey: AnonIdExtractIdType[TSchema],
    ns: AnonColl,
    operationType: insert | replace,
    fullDocument: TSchema = null,
    lsid: AnonUid = null,
    txnNumber: Int | scala.Double = null
  ): ChangeEvent[TSchema] = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], clusterTime = clusterTime.asInstanceOf[js.Any], documentKey = documentKey.asInstanceOf[js.Any], ns = ns.asInstanceOf[js.Any], operationType = operationType.asInstanceOf[js.Any])
    if (fullDocument != null) __obj.updateDynamic("fullDocument")(fullDocument.asInstanceOf[js.Any])
    if (lsid != null) __obj.updateDynamic("lsid")(lsid.asInstanceOf[js.Any])
    if (txnNumber != null) __obj.updateDynamic("txnNumber")(txnNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChangeEvent[TSchema]]
  }
  @scala.inline
  def ChangeEventDelete[TSchema /* <: js.Object */](
    _id: ResumeToken,
    clusterTime: typings.bson.mod.Timestamp,
    documentKey: AnonIdExtractIdType[TSchema],
    ns: AnonColl,
    operationType: delete,
    lsid: AnonUid = null,
    txnNumber: Int | scala.Double = null
  ): ChangeEvent[TSchema] = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], clusterTime = clusterTime.asInstanceOf[js.Any], documentKey = documentKey.asInstanceOf[js.Any], ns = ns.asInstanceOf[js.Any], operationType = operationType.asInstanceOf[js.Any])
    if (lsid != null) __obj.updateDynamic("lsid")(lsid.asInstanceOf[js.Any])
    if (txnNumber != null) __obj.updateDynamic("txnNumber")(txnNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChangeEvent[TSchema]]
  }
}

