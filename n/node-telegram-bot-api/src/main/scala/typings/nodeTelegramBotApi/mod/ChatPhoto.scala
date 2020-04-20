package typings.nodeTelegramBotApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChatPhoto extends js.Object {
  var big_file_id: String
  var small_file_id: String
}

object ChatPhoto {
  @scala.inline
  def apply(big_file_id: String, small_file_id: String): ChatPhoto = {
    val __obj = js.Dynamic.literal(big_file_id = big_file_id.asInstanceOf[js.Any], small_file_id = small_file_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChatPhoto]
  }
}

