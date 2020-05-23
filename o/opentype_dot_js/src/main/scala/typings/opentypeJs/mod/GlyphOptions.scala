package typings.opentypeJs.mod

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
    advanceWidth: js.UndefOr[Double] = js.undefined,
    font: Font = null,
    index: js.UndefOr[Double] = js.undefined,
    name: String = null,
    path: Path = null,
    unicode: js.UndefOr[Double] = js.undefined,
    unicodes: js.Array[Double] = null,
    xMax: js.UndefOr[Double] = js.undefined,
    xMin: js.UndefOr[Double] = js.undefined,
    yMax: js.UndefOr[Double] = js.undefined,
    yMin: js.UndefOr[Double] = js.undefined
  ): GlyphOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(advanceWidth)) __obj.updateDynamic("advanceWidth")(advanceWidth.get.asInstanceOf[js.Any])
    if (font != null) __obj.updateDynamic("font")(font.asInstanceOf[js.Any])
    if (!js.isUndefined(index)) __obj.updateDynamic("index")(index.get.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (!js.isUndefined(unicode)) __obj.updateDynamic("unicode")(unicode.get.asInstanceOf[js.Any])
    if (unicodes != null) __obj.updateDynamic("unicodes")(unicodes.asInstanceOf[js.Any])
    if (!js.isUndefined(xMax)) __obj.updateDynamic("xMax")(xMax.get.asInstanceOf[js.Any])
    if (!js.isUndefined(xMin)) __obj.updateDynamic("xMin")(xMin.get.asInstanceOf[js.Any])
    if (!js.isUndefined(yMax)) __obj.updateDynamic("yMax")(yMax.get.asInstanceOf[js.Any])
    if (!js.isUndefined(yMin)) __obj.updateDynamic("yMin")(yMin.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GlyphOptions]
  }
}

