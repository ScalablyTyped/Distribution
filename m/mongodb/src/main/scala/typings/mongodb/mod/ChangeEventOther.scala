package typings.mongodb.mod

import org.scalablytyped.runtime.StringDictionary
import typings.mongodb.anon.Coll
import typings.mongodb.anon.Uid
import typings.mongodb.mongodbStrings.drop
import typings.mongodb.mongodbStrings.dropDatabase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChangeEventOther[TSchema /* <: StringDictionary[js.Any] */]
  extends ChangeEventBase[TSchema]
     with ChangeEvent[TSchema] {
  var operationType: drop | dropDatabase
}

object ChangeEventOther {
  @scala.inline
  def apply[TSchema](
    _id: ResumeToken,
    clusterTime: typings.bson.mod.Timestamp,
    ns: Coll,
    operationType: drop | dropDatabase,
    lsid: Uid = null,
    txnNumber: js.UndefOr[scala.Double] = js.undefined
  ): ChangeEventOther[TSchema] = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], clusterTime = clusterTime.asInstanceOf[js.Any], ns = ns.asInstanceOf[js.Any], operationType = operationType.asInstanceOf[js.Any])
    if (lsid != null) __obj.updateDynamic("lsid")(lsid.asInstanceOf[js.Any])
    if (!js.isUndefined(txnNumber)) __obj.updateDynamic("txnNumber")(txnNumber.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChangeEventOther[TSchema]]
  }
}

