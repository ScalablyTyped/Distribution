package typings.mongodb.mod

import typings.mongodb.anon.Coll
import typings.mongodb.anon.RemovedFields
import typings.mongodb.anon.Uid
import typings.mongodb.anon.`3`
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
  def ChangeEventOther[TSchema](
    _id: ResumeToken,
    clusterTime: typings.bson.mod.Timestamp,
    ns: Coll,
    operationType: drop | dropDatabase,
    lsid: Uid = null,
    txnNumber: js.UndefOr[scala.Double] = js.undefined
  ): ChangeEvent[TSchema] = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], clusterTime = clusterTime.asInstanceOf[js.Any], ns = ns.asInstanceOf[js.Any], operationType = operationType.asInstanceOf[js.Any])
    if (lsid != null) __obj.updateDynamic("lsid")(lsid.asInstanceOf[js.Any])
    if (!js.isUndefined(txnNumber)) __obj.updateDynamic("txnNumber")(txnNumber.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChangeEvent[TSchema]]
  }
  @scala.inline
  def ChangeEventRename[TSchema](
    _id: ResumeToken,
    clusterTime: typings.bson.mod.Timestamp,
    ns: Coll,
    operationType: rename,
    to: Coll,
    lsid: Uid = null,
    txnNumber: js.UndefOr[scala.Double] = js.undefined
  ): ChangeEvent[TSchema] = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], clusterTime = clusterTime.asInstanceOf[js.Any], ns = ns.asInstanceOf[js.Any], operationType = operationType.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    if (lsid != null) __obj.updateDynamic("lsid")(lsid.asInstanceOf[js.Any])
    if (!js.isUndefined(txnNumber)) __obj.updateDynamic("txnNumber")(txnNumber.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChangeEvent[TSchema]]
  }
  @scala.inline
  def ChangeEventInvalidate[TSchema](_id: ResumeToken, clusterTime: typings.bson.mod.Timestamp, operationType: invalidate): ChangeEvent[TSchema] = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], clusterTime = clusterTime.asInstanceOf[js.Any], operationType = operationType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChangeEvent[TSchema]]
  }
  @scala.inline
  def ChangeEventUpdate[TSchema](
    _id: ResumeToken,
    clusterTime: typings.bson.mod.Timestamp,
    documentKey: `3`[TSchema],
    ns: Coll,
    operationType: update,
    updateDescription: RemovedFields[TSchema],
    fullDocument: TSchema = null,
    lsid: Uid = null,
    txnNumber: js.UndefOr[scala.Double] = js.undefined
  ): ChangeEvent[TSchema] = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], clusterTime = clusterTime.asInstanceOf[js.Any], documentKey = documentKey.asInstanceOf[js.Any], ns = ns.asInstanceOf[js.Any], operationType = operationType.asInstanceOf[js.Any], updateDescription = updateDescription.asInstanceOf[js.Any])
    if (fullDocument != null) __obj.updateDynamic("fullDocument")(fullDocument.asInstanceOf[js.Any])
    if (lsid != null) __obj.updateDynamic("lsid")(lsid.asInstanceOf[js.Any])
    if (!js.isUndefined(txnNumber)) __obj.updateDynamic("txnNumber")(txnNumber.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChangeEvent[TSchema]]
  }
  @scala.inline
  def ChangeEventCR[TSchema](
    _id: ResumeToken,
    clusterTime: typings.bson.mod.Timestamp,
    documentKey: `3`[TSchema],
    ns: Coll,
    operationType: insert | replace,
    fullDocument: TSchema = null,
    lsid: Uid = null,
    txnNumber: js.UndefOr[scala.Double] = js.undefined
  ): ChangeEvent[TSchema] = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], clusterTime = clusterTime.asInstanceOf[js.Any], documentKey = documentKey.asInstanceOf[js.Any], ns = ns.asInstanceOf[js.Any], operationType = operationType.asInstanceOf[js.Any])
    if (fullDocument != null) __obj.updateDynamic("fullDocument")(fullDocument.asInstanceOf[js.Any])
    if (lsid != null) __obj.updateDynamic("lsid")(lsid.asInstanceOf[js.Any])
    if (!js.isUndefined(txnNumber)) __obj.updateDynamic("txnNumber")(txnNumber.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChangeEvent[TSchema]]
  }
  @scala.inline
  def ChangeEventDelete[TSchema](
    _id: ResumeToken,
    clusterTime: typings.bson.mod.Timestamp,
    documentKey: `3`[TSchema],
    ns: Coll,
    operationType: delete,
    lsid: Uid = null,
    txnNumber: js.UndefOr[scala.Double] = js.undefined
  ): ChangeEvent[TSchema] = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], clusterTime = clusterTime.asInstanceOf[js.Any], documentKey = documentKey.asInstanceOf[js.Any], ns = ns.asInstanceOf[js.Any], operationType = operationType.asInstanceOf[js.Any])
    if (lsid != null) __obj.updateDynamic("lsid")(lsid.asInstanceOf[js.Any])
    if (!js.isUndefined(txnNumber)) __obj.updateDynamic("txnNumber")(txnNumber.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChangeEvent[TSchema]]
  }
}

