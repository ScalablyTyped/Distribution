package typings.mongodb.mod

import org.scalablytyped.runtime.StringDictionary
import typings.mongodb.anon.Coll
import typings.mongodb.anon.Uid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChangeEventBase[TSchema /* <: StringDictionary[js.Any] */] extends js.Object {
  var _id: ResumeToken = js.native
  var clusterTime: typings.bson.mod.Timestamp = js.native
  var lsid: js.UndefOr[Uid] = js.native
  /**
    * We leave this off the base type so that we can differentiate
    * by checking its value and get intelligent types on the other fields
    */
  // operationType: ChangeEventTypes;
  var ns: Coll = js.native
  var txnNumber: js.UndefOr[scala.Double] = js.native
}

object ChangeEventBase {
  @scala.inline
  def apply[/* <: org.scalablytyped.runtime.StringDictionary[js.Any] */ TSchema](_id: ResumeToken, clusterTime: typings.bson.mod.Timestamp, ns: Coll): ChangeEventBase[TSchema] = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], clusterTime = clusterTime.asInstanceOf[js.Any], ns = ns.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChangeEventBase[TSchema]]
  }
  @scala.inline
  implicit class ChangeEventBaseOps[Self <: ChangeEventBase[_], /* <: org.scalablytyped.runtime.StringDictionary[js.Any] */ TSchema] (val x: Self with ChangeEventBase[TSchema]) extends AnyVal {
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
    def set_id(value: ResumeToken): Self = this.set("_id", value.asInstanceOf[js.Any])
    @scala.inline
    def setClusterTime(value: typings.bson.mod.Timestamp): Self = this.set("clusterTime", value.asInstanceOf[js.Any])
    @scala.inline
    def setNs(value: Coll): Self = this.set("ns", value.asInstanceOf[js.Any])
    @scala.inline
    def setLsid(value: Uid): Self = this.set("lsid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLsid: Self = this.set("lsid", js.undefined)
    @scala.inline
    def setTxnNumber(value: scala.Double): Self = this.set("txnNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTxnNumber: Self = this.set("txnNumber", js.undefined)
  }
  
}

