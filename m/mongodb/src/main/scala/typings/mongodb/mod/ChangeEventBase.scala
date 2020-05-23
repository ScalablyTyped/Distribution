package typings.mongodb.mod

import org.scalablytyped.runtime.StringDictionary
import typings.mongodb.anon.Coll
import typings.mongodb.anon.Uid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChangeEventBase[TSchema /* <: StringDictionary[js.Any] */] extends js.Object {
  var _id: ResumeToken
  var clusterTime: typings.bson.mod.Timestamp
  var lsid: js.UndefOr[Uid] = js.undefined
  /**
    * We leave this off the base type so that we can differentiate
    * by checking its value and get intelligent types on the other fields
    */
  // operationType: ChangeEventTypes;
  var ns: Coll
  var txnNumber: js.UndefOr[scala.Double] = js.undefined
}

object ChangeEventBase {
  @scala.inline
  def apply[TSchema](
    _id: ResumeToken,
    clusterTime: typings.bson.mod.Timestamp,
    ns: Coll,
    lsid: Uid = null,
    txnNumber: js.UndefOr[scala.Double] = js.undefined
  ): ChangeEventBase[TSchema] = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], clusterTime = clusterTime.asInstanceOf[js.Any], ns = ns.asInstanceOf[js.Any])
    if (lsid != null) __obj.updateDynamic("lsid")(lsid.asInstanceOf[js.Any])
    if (!js.isUndefined(txnNumber)) __obj.updateDynamic("txnNumber")(txnNumber.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChangeEventBase[TSchema]]
  }
}

