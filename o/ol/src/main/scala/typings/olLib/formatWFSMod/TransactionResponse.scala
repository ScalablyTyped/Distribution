package typings
package olLib.formatWFSMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransactionResponse extends js.Object {
  var insertIds: js.Array[java.lang.String]
  var totalDeleted: scala.Double
  var totalInserted: scala.Double
  var totalUpdated: scala.Double
}

object TransactionResponse {
  @scala.inline
  def apply(
    insertIds: js.Array[java.lang.String],
    totalDeleted: scala.Double,
    totalInserted: scala.Double,
    totalUpdated: scala.Double
  ): TransactionResponse = {
    val __obj = js.Dynamic.literal(insertIds = insertIds, totalDeleted = totalDeleted, totalInserted = totalInserted, totalUpdated = totalUpdated)
  
    __obj.asInstanceOf[TransactionResponse]
  }
}

