package typings.opentypeDotJs.opentypeDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GlyphOptions extends js.Object {
  var advanceWidth: js.UndefOr[Double] = js.undefined
  var font: js.UndefOr[Font] = js.undefined
  var index: js.UndefOr[Double] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var path: js.UndefOr[Path] = js.undefined
  var unicode: js.UndefOr[Double] = js.undefined
  var unicodes: js.UndefOr[js.Array[Double]] = js.undefined
  var xMax: js.UndefOr[Double] = js.undefined
  var xMin: js.UndefOr[Double] = js.undefined
  var yMax: js.UndefOr[Double] = js.undefined
  var yMin: js.UndefOr[Double] = js.undefined
}

object GlyphOptions {
  @scala.inline
  def apply(
    advanceWidth: Int | Double = null,
    font: Font = null,
    index: Int | Double = null,
    name: String = null,
    path: Path = null,
    unicode: Int | Double = null,
    unicodes: js.Array[Double] = null,
    xMax: Int | Double = null,
    xMin: Int | Double = null,
    yMax: Int | Double = null,
    yMin: Int | Double = null
  ): GlyphOptions = {
    val __obj = js.Dynamic.literal()
    if (advanceWidth != null) __obj.updateDynamic("advanceWidth")(advanceWidth.asInstanceOf[js.Any])
    if (font != null) __obj.updateDynamic("font")(font.asInstanceOf[js.Any])
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (unicode != null) __obj.updateDynamic("unicode")(unicode.asInstanceOf[js.Any])
    if (unicodes != null) __obj.updateDynamic("unicodes")(unicodes.asInstanceOf[js.Any])
    if (xMax != null) __obj.updateDynamic("xMax")(xMax.asInstanceOf[js.Any])
    if (xMin != null) __obj.updateDynamic("xMin")(xMin.asInstanceOf[js.Any])
    if (yMax != null) __obj.updateDynamic("yMax")(yMax.asInstanceOf[js.Any])
    if (yMin != null) __obj.updateDynamic("yMin")(yMin.asInstanceOf[js.Any])
    __obj.asInstanceOf[GlyphOptions]
  }
}

