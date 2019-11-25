package typings.pebblekitjs.PebbleKit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppMessageData extends js.Object {
  var transactionId: String
}

object AppMessageData {
  @scala.inline
  def apply(transactionId: String): AppMessageData = {
    val __obj = js.Dynamic.literal(transactionId = transactionId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AppMessageData]
  }
}

