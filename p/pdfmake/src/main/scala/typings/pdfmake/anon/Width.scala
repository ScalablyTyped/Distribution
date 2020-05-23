package typings.pdfmake.anon

import typings.pdfmake.interfacesMod.Size
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Width extends js.Object {
  var width: js.UndefOr[Size] = js.undefined
}

object Width {
  @scala.inline
  def apply(width: Size = null): Width = {
    val __obj = js.Dynamic.literal()
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Width]
  }
}

