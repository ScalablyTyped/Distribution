package typings.mongodb.mod

import org.scalablytyped.runtime.StringDictionary
import typings.mongodb.AnonColl
import typings.mongodb.AnonIdExtractIdType
import typings.mongodb.AnonUid
import typings.mongodb.mongodbStrings.insert
import typings.mongodb.mongodbStrings.replace
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChangeEventCR[TSchema /* <: StringDictionary[js.Any] */]
  extends ChangeEventBase[TSchema]
     with ChangeEvent[TSchema] {
  var documentKey: AnonIdExtractIdType[TSchema]
  var fullDocument: js.UndefOr[TSchema] = js.undefined
  var operationType: insert | replace
}

object ChangeEventCR {
  @scala.inline
  def apply[TSchema /* <: StringDictionary[js.Any] */](
    _id: ResumeToken,
    clusterTime: typings.bson.mod.Timestamp,
    documentKey: AnonIdExtractIdType[TSchema],
    ns: AnonColl,
    operationType: insert | replace,
    fullDocument: TSchema = null,
    lsid: AnonUid = null,
    txnNumber: Int | scala.Double = null
  ): ChangeEventCR[TSchema] = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], clusterTime = clusterTime.asInstanceOf[js.Any], documentKey = documentKey.asInstanceOf[js.Any], ns = ns.asInstanceOf[js.Any], operationType = operationType.asInstanceOf[js.Any])
    if (fullDocument != null) __obj.updateDynamic("fullDocument")(fullDocument.asInstanceOf[js.Any])
    if (lsid != null) __obj.updateDynamic("lsid")(lsid.asInstanceOf[js.Any])
    if (txnNumber != null) __obj.updateDynamic("txnNumber")(txnNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChangeEventCR[TSchema]]
  }
}

