package typings.overwatchApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonQuickplay extends js.Object {
  var competitive: String
  var quickplay: String
}

object AnonQuickplay {
  @scala.inline
  def apply(competitive: String, quickplay: String): AnonQuickplay = {
    val __obj = js.Dynamic.literal(competitive = competitive.asInstanceOf[js.Any], quickplay = quickplay.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonQuickplay]
  }
}

