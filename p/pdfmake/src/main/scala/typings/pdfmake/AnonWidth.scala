package typings.pdfmake

import typings.pdfmake.interfacesMod.Size
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonWidth extends js.Object {
  var width: js.UndefOr[Size] = js.undefined
}

object AnonWidth {
  @scala.inline
  def apply(width: Size = null): AnonWidth = {
    val __obj = js.Dynamic.literal()
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonWidth]
  }
}

