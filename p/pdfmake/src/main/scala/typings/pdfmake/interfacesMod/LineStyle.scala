package typings.pdfmake.interfacesMod

import typings.pdfmake.AnonLength
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LineStyle extends js.Object {
  var dash: js.UndefOr[AnonLength] = js.undefined
}

object LineStyle {
  @scala.inline
  def apply(dash: AnonLength = null): LineStyle = {
    val __obj = js.Dynamic.literal()
    if (dash != null) __obj.updateDynamic("dash")(dash.asInstanceOf[js.Any])
    __obj.asInstanceOf[LineStyle]
  }
}

