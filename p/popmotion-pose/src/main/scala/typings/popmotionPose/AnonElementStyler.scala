package typings.popmotionPose

import typings.stylefire.typesMod.Styler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonElementStyler extends js.Object {
  var elementStyler: Styler
}

object AnonElementStyler {
  @scala.inline
  def apply(elementStyler: Styler): AnonElementStyler = {
    val __obj = js.Dynamic.literal(elementStyler = elementStyler.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonElementStyler]
  }
}

