package typings.mongodb.mod

import org.scalablytyped.runtime.StringDictionary
import typings.mongodb.AnonColl
import typings.mongodb.AnonUid
import typings.mongodb.mongodbStrings.rename
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChangeEventRename[TSchema /* <: StringDictionary[js.Any] */]
  extends ChangeEventBase[TSchema]
     with ChangeEvent[TSchema] {
  var operationType: rename
  var to: AnonColl
}

object ChangeEventRename {
  @scala.inline
  def apply[TSchema /* <: StringDictionary[js.Any] */](
    _id: ResumeToken,
    clusterTime: typings.bson.mod.Timestamp,
    ns: AnonColl,
    operationType: rename,
    to: AnonColl,
    lsid: AnonUid = null,
    txnNumber: Int | scala.Double = null
  ): ChangeEventRename[TSchema] = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], clusterTime = clusterTime.asInstanceOf[js.Any], ns = ns.asInstanceOf[js.Any], operationType = operationType.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    if (lsid != null) __obj.updateDynamic("lsid")(lsid.asInstanceOf[js.Any])
    if (txnNumber != null) __obj.updateDynamic("txnNumber")(txnNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChangeEventRename[TSchema]]
  }
}

