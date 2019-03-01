package typings
package opentypeDotJsLib.opentypeDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GlyphOptions extends js.Object {
  var advanceWidth: js.UndefOr[scala.Double] = js.undefined
  var font: js.UndefOr[Font] = js.undefined
  var index: js.UndefOr[scala.Double] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var path: js.UndefOr[Path] = js.undefined
  var unicode: js.UndefOr[scala.Double] = js.undefined
  var unicodes: js.UndefOr[js.Array[scala.Double]] = js.undefined
  var xMax: js.UndefOr[scala.Double] = js.undefined
  var xMin: js.UndefOr[scala.Double] = js.undefined
  var yMax: js.UndefOr[scala.Double] = js.undefined
  var yMin: js.UndefOr[scala.Double] = js.undefined
}

object GlyphOptions {
  @scala.inline
  def apply(
    advanceWidth: scala.Int | scala.Double = null,
    font: Font = null,
    index: scala.Int | scala.Double = null,
    name: java.lang.String = null,
    path: Path = null,
    unicode: scala.Int | scala.Double = null,
    unicodes: js.Array[scala.Double] = null,
    xMax: scala.Int | scala.Double = null,
    xMin: scala.Int | scala.Double = null,
    yMax: scala.Int | scala.Double = null,
    yMin: scala.Int | scala.Double = null
  ): GlyphOptions = {
    val __obj = js.Dynamic.literal()
    if (advanceWidth != null) __obj.updateDynamic("advanceWidth")(advanceWidth.asInstanceOf[js.Any])
    if (font != null) __obj.updateDynamic("font")(font)
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    if (path != null) __obj.updateDynamic("path")(path)
    if (unicode != null) __obj.updateDynamic("unicode")(unicode.asInstanceOf[js.Any])
    if (unicodes != null) __obj.updateDynamic("unicodes")(unicodes)
    if (xMax != null) __obj.updateDynamic("xMax")(xMax.asInstanceOf[js.Any])
    if (xMin != null) __obj.updateDynamic("xMin")(xMin.asInstanceOf[js.Any])
    if (yMax != null) __obj.updateDynamic("yMax")(yMax.asInstanceOf[js.Any])
    if (yMin != null) __obj.updateDynamic("yMin")(yMin.asInstanceOf[js.Any])
    __obj.asInstanceOf[GlyphOptions]
  }
}

