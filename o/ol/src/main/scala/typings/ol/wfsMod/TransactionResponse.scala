package typings.ol.wfsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransactionResponse extends js.Object {
  var insertIds: js.Array[String] = js.native
  var totalDeleted: Double = js.native
  var totalInserted: Double = js.native
  var totalUpdated: Double = js.native
}

object TransactionResponse {
  @scala.inline
  def apply(insertIds: js.Array[String], totalDeleted: Double, totalInserted: Double, totalUpdated: Double): TransactionResponse = {
    val __obj = js.Dynamic.literal(insertIds = insertIds.asInstanceOf[js.Any], totalDeleted = totalDeleted.asInstanceOf[js.Any], totalInserted = totalInserted.asInstanceOf[js.Any], totalUpdated = totalUpdated.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransactionResponse]
  }
  @scala.inline
  implicit class TransactionResponseOps[Self <: TransactionResponse] (val x: Self) extends AnyVal {
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
    def setInsertIdsVarargs(value: String*): Self = this.set("insertIds", js.Array(value :_*))
    @scala.inline
    def setInsertIds(value: js.Array[String]): Self = this.set("insertIds", value.asInstanceOf[js.Any])
    @scala.inline
    def setTotalDeleted(value: Double): Self = this.set("totalDeleted", value.asInstanceOf[js.Any])
    @scala.inline
    def setTotalInserted(value: Double): Self = this.set("totalInserted", value.asInstanceOf[js.Any])
    @scala.inline
    def setTotalUpdated(value: Double): Self = this.set("totalUpdated", value.asInstanceOf[js.Any])
  }
  
}

