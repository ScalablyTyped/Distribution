package typings.plottable.mod.Plots

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("plottable", "Plots.StackedBar")
@js.native
/**
  * A StackedBar Plot stacks bars across Datasets based on the primary value of the bars.
  *   On a vertical StackedBar Plot, the bars with the same X value are stacked.
  *   On a horizontal StackedBar Plot, the bars with the same Y value are stacked.
  *
  * @constructor
  * @param {Scale} xScale
  * @param {Scale} yScale
  * @param {string} [orientation="vertical"] One of "vertical"/"horizontal".
  */
class StackedBar[X, Y] ()
  extends typings.plottable.plotsMod.StackedBar[X, Y] {
  def this(orientation: typings.plottable.barPlotMod.BarOrientation) = this()
}
/* static members */
@JSImport("plottable", "Plots.StackedBar")
@js.native
object StackedBar extends js.Object {
  
  var _EXTREMA_LABEL_MARGIN_FROM_BAR: Double = js.native
}
