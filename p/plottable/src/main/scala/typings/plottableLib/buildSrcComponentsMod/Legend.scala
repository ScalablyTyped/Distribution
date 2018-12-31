package typings
package plottableLib.buildSrcComponentsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("plottable/build/src/components", "Legend")
@js.native
class Legend protected ()
  extends plottableLib.buildSrcComponentsLegendMod.Legend {
  /**
    * The Legend consists of a series of entries, each with a color and label taken from the Color Scale.
    *
    * @constructor
    * @param {Scale.Color} scale
    */
  def this(colorScale: plottableLib.buildSrcScalesMod.Color) = this()
}

@JSImport("plottable/build/src/components", "Legend")
@js.native
object Legend extends js.Object {
  /**
    * The css class applied to each legend entry
    */
  var LEGEND_ENTRY_CLASS: java.lang.String = js.native
  /**
    * The css class applied to each legend row
    */
  var LEGEND_ROW_CLASS: java.lang.String = js.native
  /**
    * The css class applied to each legend symbol
    */
  var LEGEND_SYMBOL_CLASS: java.lang.String = js.native
}

