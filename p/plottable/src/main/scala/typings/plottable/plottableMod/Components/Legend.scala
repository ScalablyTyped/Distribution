package typings.plottable.plottableMod.Components

import typings.plottable.buildSrcScalesMod.Color
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("plottable", "Components.Legend")
@js.native
class Legend protected ()
  extends typings.plottable.buildSrcComponentsMod.Legend {
  /**
    * The Legend consists of a series of entries, each with a color and label taken from the Color Scale.
    *
    * @constructor
    * @param {Scale.Color} scale
    */
  def this(colorScale: Color) = this()
}

/* static members */
@JSImport("plottable", "Components.Legend")
@js.native
object Legend extends js.Object {
  /**
    * The css class applied to each legend entry
    */
  var LEGEND_ENTRY_CLASS: String = js.native
  /**
    * The css class applied to each legend row
    */
  var LEGEND_ROW_CLASS: String = js.native
  /**
    * The css class applied to each legend symbol
    */
  var LEGEND_SYMBOL_CLASS: String = js.native
}

