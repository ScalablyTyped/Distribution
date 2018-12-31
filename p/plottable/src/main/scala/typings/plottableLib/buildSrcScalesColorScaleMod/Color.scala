package typings
package plottableLib.buildSrcScalesColorScaleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("plottable/build/src/scales/colorScale", "Color")
@js.native
/**
  * A Color Scale maps string values to color hex values expressed as a string.
  *
  * @constructor
  * @param {string} [scaleType] One of "Category10"/"Category20"/"Category20b"/"Category20c".
  *   (see https://github.com/mbostock/d3/wiki/Ordinal-Scales#categorical-colors)
  *   If not supplied, reads the colors defined using CSS -- see plottable.css.
  */
class Color ()
  extends plottableLib.buildSrcScalesScaleMod.Scale[java.lang.String, java.lang.String] {
  def this(scaleType: java.lang.String) = this()
  var _d3Scale: js.Any = js.native
  var _rangeLength: js.Any = js.native
  var _tracker: js.Any = js.native
}

@JSImport("plottable/build/src/scales/colorScale", "Color")
@js.native
object Color extends js.Object {
  var _LOOP_LIGHTEN_FACTOR: js.Any = js.native
  var _MAXIMUM_COLORS_FROM_CSS: js.Any = js.native
  var _plottableColorCache: js.Any = js.native
  /* private */ def _getPlottableColors(): js.Any = js.native
  def invalidateColorCache(): scala.Unit = js.native
}

