package typings
package padLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Char extends js.Object {
  var char: js.UndefOr[java.lang.String] = js.undefined
  var colors: js.UndefOr[scala.Boolean] = js.undefined
  var strip: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_Char {
  @scala.inline
  def apply(
    char: java.lang.String = null,
    colors: js.UndefOr[scala.Boolean] = js.undefined,
    strip: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_Char = {
    val __obj = js.Dynamic.literal()
    if (char != null) __obj.updateDynamic("char")(char)
    if (!js.isUndefined(colors)) __obj.updateDynamic("colors")(colors)
    if (!js.isUndefined(strip)) __obj.updateDynamic("strip")(strip)
    __obj.asInstanceOf[Anon_Char]
  }
}

