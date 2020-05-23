package typings.pendoIoBrowser.anon

import typings.pendoIoBrowser.pendo.Guide
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Auto extends js.Object {
  var auto: js.Array[Guide]
  var `override`: js.Array[Guide]
}

object Auto {
  @scala.inline
  def apply(auto: js.Array[Guide], `override`: js.Array[Guide]): Auto = {
    val __obj = js.Dynamic.literal(auto = auto.asInstanceOf[js.Any])
    __obj.updateDynamic("override")(`override`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Auto]
  }
}

