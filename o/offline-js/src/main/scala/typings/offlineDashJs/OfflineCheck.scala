package typings.offlineDashJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OfflineCheck extends js.Object {
  var url: String
}

object OfflineCheck {
  @scala.inline
  def apply(url: String): OfflineCheck = {
    val __obj = js.Dynamic.literal(url = url)
  
    __obj.asInstanceOf[OfflineCheck]
  }
}

