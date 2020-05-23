package typings.nivoColors.anon

import typings.nivoColors.mod._InheritedColorProp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Theme
  extends _InheritedColorProp[js.Any] {
  var theme: String
}

object Theme {
  @scala.inline
  def apply(theme: String): Theme = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[Theme]
  }
}

