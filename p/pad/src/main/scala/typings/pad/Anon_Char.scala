package typings.pad

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Char extends js.Object {
  var char: js.UndefOr[String] = js.undefined
  var colors: js.UndefOr[Boolean] = js.undefined
  var strip: js.UndefOr[Boolean] = js.undefined
}

object Anon_Char {
  @scala.inline
  def apply(
    char: String = null,
    colors: js.UndefOr[Boolean] = js.undefined,
    strip: js.UndefOr[Boolean] = js.undefined
  ): Anon_Char = {
    val __obj = js.Dynamic.literal()
    if (char != null) __obj.updateDynamic("char")(char.asInstanceOf[js.Any])
    if (!js.isUndefined(colors)) __obj.updateDynamic("colors")(colors.asInstanceOf[js.Any])
    if (!js.isUndefined(strip)) __obj.updateDynamic("strip")(strip.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Char]
  }
}

