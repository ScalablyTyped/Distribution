package typings.mongodb.mod

import org.scalablytyped.runtime.StringDictionary
import typings.mongodb.anon.Coll
import typings.mongodb.anon.`5`
import typings.mongodb.mongodbStrings.insert
import typings.mongodb.mongodbStrings.replace
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChangeEventCR[TSchema /* <: StringDictionary[js.Any] */]
  extends ChangeEventBase[TSchema]
     with ChangeEvent[TSchema] {
  var documentKey: `5`[TSchema] = js.native
  var fullDocument: js.UndefOr[TSchema] = js.native
  var operationType: insert | replace = js.native
}

object ChangeEventCR {
  @scala.inline
  def apply[/* <: org.scalablytyped.runtime.StringDictionary[js.Any] */ TSchema](
    _id: ResumeToken,
    clusterTime: typings.bson.mod.Timestamp,
    documentKey: `5`[TSchema],
    ns: Coll,
    operationType: insert | replace
  ): ChangeEventCR[TSchema] = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], clusterTime = clusterTime.asInstanceOf[js.Any], documentKey = documentKey.asInstanceOf[js.Any], ns = ns.asInstanceOf[js.Any], operationType = operationType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChangeEventCR[TSchema]]
  }
  @scala.inline
  implicit class ChangeEventCROps[Self <: ChangeEventCR[_], /* <: org.scalablytyped.runtime.StringDictionary[js.Any] */ TSchema] (val x: Self with ChangeEventCR[TSchema]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDocumentKey(value: `5`[TSchema]): Self = this.set("documentKey", value.asInstanceOf[js.Any])
    @scala.inline
    def setOperationType(value: insert | replace): Self = this.set("operationType", value.asInstanceOf[js.Any])
    @scala.inline
    def setFullDocument(value: TSchema): Self = this.set("fullDocument", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFullDocument: Self = this.set("fullDocument", js.undefined)
  }
  
}

