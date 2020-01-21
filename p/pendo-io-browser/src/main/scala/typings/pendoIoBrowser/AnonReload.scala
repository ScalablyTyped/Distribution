package typings.pendoIoBrowser

import typings.pendoIoBrowser.pendoIoBrowserStrings.reload
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonReload extends js.Object {
  var until: reload
}

object AnonReload {
  @scala.inline
  def apply(until: reload): AnonReload = {
    val __obj = js.Dynamic.literal(until = until.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonReload]
  }
}

