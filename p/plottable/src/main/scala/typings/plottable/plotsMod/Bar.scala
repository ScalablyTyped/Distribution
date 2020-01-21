package typings.plottable.plotsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("plottable/build/src/plots", "Bar")
@js.native
/**
  * A Bar Plot draws bars growing out from a baseline to some value
  *
  * @constructor
  * @param {string} [orientation="vertical"] One of "vertical"/"horizontal".
  */
class Bar[X, Y] ()
  extends typings.plottable.barPlotMod.Bar[X, Y] {
  def this(orientation: typings.plottable.barPlotMod.BarOrientation) = this()
}

/* static members */
@JSImport("plottable/build/src/plots", "Bar")
@js.native
object Bar extends js.Object {
  var _BAR_AREA_CLASS: js.Any = js.native
  var _BAR_END_KEY: js.Any = js.native
  var _BAR_GAPLESS_THRESHOLD_PX: Double = js.native
  var _BAR_THICKNESS_KEY: String = js.native
  var _BAR_THICKNESS_RATIO: Double = js.native
  var _LABEL_AREA_CLASS: String = js.native
  /**
    * In the case of "start" or "end" LabelPositions, put the label this many px away
    * from the bar's length distance edge
    */
  var _LABEL_MARGIN_INSIDE_BAR: Double = js.native
  var _SINGLE_BAR_DIMENSION_RATIO: Double = js.native
}

