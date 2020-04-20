package typings.ol.wfsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransactionResponse extends js.Object {
  var insertIds: js.Array[String]
  var totalDeleted: Double
  var totalInserted: Double
  var totalUpdated: Double
}

object TransactionResponse {
  @scala.inline
  def apply(insertIds: js.Array[String], totalDeleted: Double, totalInserted: Double, totalUpdated: Double): TransactionResponse = {
    val __obj = js.Dynamic.literal(insertIds = insertIds.asInstanceOf[js.Any], totalDeleted = totalDeleted.asInstanceOf[js.Any], totalInserted = totalInserted.asInstanceOf[js.Any], totalUpdated = totalUpdated.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransactionResponse]
  }
}

