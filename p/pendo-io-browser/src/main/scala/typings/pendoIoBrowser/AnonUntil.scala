package typings.pendoIoBrowser

import typings.pendoIoBrowser.pendoIoBrowserStrings.reload
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonUntil extends js.Object {
  var until: reload
}

object AnonUntil {
  @scala.inline
  def apply(until: reload): AnonUntil = {
    val __obj = js.Dynamic.literal(until = until.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonUntil]
  }
}

