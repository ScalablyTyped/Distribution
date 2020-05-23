package typings.pad.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Char extends js.Object {
  var char: js.UndefOr[String] = js.undefined
  var colors: js.UndefOr[Boolean] = js.undefined
  var strip: js.UndefOr[Boolean] = js.undefined
}

object Char {
  @scala.inline
  def apply(
    char: String = null,
    colors: js.UndefOr[Boolean] = js.undefined,
    strip: js.UndefOr[Boolean] = js.undefined
  ): Char = {
    val __obj = js.Dynamic.literal()
    if (char != null) __obj.updateDynamic("char")(char.asInstanceOf[js.Any])
    if (!js.isUndefined(colors)) __obj.updateDynamic("colors")(colors.get.asInstanceOf[js.Any])
    if (!js.isUndefined(strip)) __obj.updateDynamic("strip")(strip.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Char]
  }
}

