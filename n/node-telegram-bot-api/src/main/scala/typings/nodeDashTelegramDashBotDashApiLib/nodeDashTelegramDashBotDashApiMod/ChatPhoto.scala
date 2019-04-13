package typings
package nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChatPhoto extends js.Object {
  var big_file_id: java.lang.String
  var small_file_id: java.lang.String
}

object ChatPhoto {
  @scala.inline
  def apply(big_file_id: java.lang.String, small_file_id: java.lang.String): ChatPhoto = {
    val __obj = js.Dynamic.literal(big_file_id = big_file_id, small_file_id = small_file_id)
  
    __obj.asInstanceOf[ChatPhoto]
  }
}

