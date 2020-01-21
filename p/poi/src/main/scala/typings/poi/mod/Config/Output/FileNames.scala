package typings.poi.mod.Config.Output

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileNames extends js.Object {
  var css: js.UndefOr[String] = js.undefined
  var font: js.UndefOr[String] = js.undefined
  var image: js.UndefOr[String] = js.undefined
  @JSName("js")
  var js_ : js.UndefOr[String] = js.undefined
}

object FileNames {
  @scala.inline
  def apply(css: String = null, font: String = null, image: String = null, js_ : String = null): FileNames = {
    val __obj = js.Dynamic.literal()
    if (css != null) __obj.updateDynamic("css")(css.asInstanceOf[js.Any])
    if (font != null) __obj.updateDynamic("font")(font.asInstanceOf[js.Any])
    if (image != null) __obj.updateDynamic("image")(image.asInstanceOf[js.Any])
    if (js_ != null) __obj.updateDynamic("js")(js_.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileNames]
  }
}

