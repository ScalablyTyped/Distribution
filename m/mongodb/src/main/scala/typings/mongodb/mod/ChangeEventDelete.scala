package typings.mongodb.mod

import org.scalablytyped.runtime.StringDictionary
import typings.mongodb.anon.Coll
import typings.mongodb.anon.Uid
import typings.mongodb.anon.`3`
import typings.mongodb.mongodbStrings.delete
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChangeEventDelete[TSchema /* <: StringDictionary[js.Any] */]
  extends ChangeEventBase[TSchema]
     with ChangeEvent[TSchema] {
  var documentKey: `3`[TSchema]
  var operationType: delete
}

object ChangeEventDelete {
  @scala.inline
  def apply[TSchema](
    _id: ResumeToken,
    clusterTime: typings.bson.mod.Timestamp,
    documentKey: `3`[TSchema],
    ns: Coll,
    operationType: delete,
    lsid: Uid = null,
    txnNumber: js.UndefOr[scala.Double] = js.undefined
  ): ChangeEventDelete[TSchema] = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], clusterTime = clusterTime.asInstanceOf[js.Any], documentKey = documentKey.asInstanceOf[js.Any], ns = ns.asInstanceOf[js.Any], operationType = operationType.asInstanceOf[js.Any])
    if (lsid != null) __obj.updateDynamic("lsid")(lsid.asInstanceOf[js.Any])
    if (!js.isUndefined(txnNumber)) __obj.updateDynamic("txnNumber")(txnNumber.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChangeEventDelete[TSchema]]
  }
}

