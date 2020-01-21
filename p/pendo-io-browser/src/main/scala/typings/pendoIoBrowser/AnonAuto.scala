package typings.pendoIoBrowser

import typings.pendoIoBrowser.pendo.Guide
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAuto extends js.Object {
  var auto: js.Array[Guide]
  var `override`: js.Array[Guide]
}

object AnonAuto {
  @scala.inline
  def apply(auto: js.Array[Guide], `override`: js.Array[Guide]): AnonAuto = {
    val __obj = js.Dynamic.literal(auto = auto.asInstanceOf[js.Any])
    __obj.updateDynamic("override")(`override`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAuto]
  }
}

