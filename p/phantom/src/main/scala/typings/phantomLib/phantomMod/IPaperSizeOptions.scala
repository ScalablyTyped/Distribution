package typings
package phantomLib.phantomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPaperSizeOptions extends js.Object {
  var footer: js.UndefOr[phantomLib.Anon_Contents] = js.undefined
  var format: js.UndefOr[
    phantomLib.phantomLibStrings.A3 | phantomLib.phantomLibStrings.A4 | phantomLib.phantomLibStrings.A5 | phantomLib.phantomLibStrings.Legal | phantomLib.phantomLibStrings.Letter | phantomLib.phantomLibStrings.Tabloid
  ] = js.undefined
  var header: js.UndefOr[phantomLib.Anon_Contents] = js.undefined
  var height: js.UndefOr[java.lang.String] = js.undefined
  var margin: js.UndefOr[java.lang.String | phantomLib.Anon_Bottom] = js.undefined
  var orientation: js.UndefOr[phantomLib.phantomLibStrings.portrait | phantomLib.phantomLibStrings.landscape] = js.undefined
  var width: js.UndefOr[java.lang.String] = js.undefined
}

object IPaperSizeOptions {
  @scala.inline
  def apply(
    footer: phantomLib.Anon_Contents = null,
    format: phantomLib.phantomLibStrings.A3 | phantomLib.phantomLibStrings.A4 | phantomLib.phantomLibStrings.A5 | phantomLib.phantomLibStrings.Legal | phantomLib.phantomLibStrings.Letter | phantomLib.phantomLibStrings.Tabloid = null,
    header: phantomLib.Anon_Contents = null,
    height: java.lang.String = null,
    margin: java.lang.String | phantomLib.Anon_Bottom = null,
    orientation: phantomLib.phantomLibStrings.portrait | phantomLib.phantomLibStrings.landscape = null,
    width: java.lang.String = null
  ): IPaperSizeOptions = {
    val __obj = js.Dynamic.literal()
    if (footer != null) __obj.updateDynamic("footer")(footer)
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (header != null) __obj.updateDynamic("header")(header)
    if (height != null) __obj.updateDynamic("height")(height)
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (orientation != null) __obj.updateDynamic("orientation")(orientation.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width)
    __obj.asInstanceOf[IPaperSizeOptions]
  }
}

