package typings.atNivoCore.atNivoCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColorProps[T] extends js.Object {
  var colorBy: js.UndefOr[String | GetColor[T]] = js.undefined
  var colors: js.UndefOr[Colors] = js.undefined
}

object ColorProps {
  @scala.inline
  def apply[T](colorBy: String | GetColor[T] = null, colors: Colors = null): ColorProps[T] = {
    val __obj = js.Dynamic.literal()
    if (colorBy != null) __obj.updateDynamic("colorBy")(colorBy.asInstanceOf[js.Any])
    if (colors != null) __obj.updateDynamic("colors")(colors.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColorProps[T]]
  }
}

