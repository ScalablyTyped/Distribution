package typings
package plottableLib.buildSrcPlotsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("plottable/build/src/plots", "ClusteredBar")
@js.native
class ClusteredBar[X, Y] ()
  extends plottableLib.buildSrcPlotsClusteredBarPlotMod.ClusteredBar[X, Y] {
  /**
       * A ClusteredBar Plot groups bars across Datasets based on the primary value of the bars.
       *   On a vertical ClusteredBar Plot, the bars with the same X value are grouped.
       *   On a horizontal ClusteredBar Plot, the bars with the same Y value are grouped.
       *
       * @constructor
       * @param {string} [orientation="vertical"] One of "vertical"/"horizontal".
       */
  def this(orientation: plottableLib.buildSrcPlotsBarPlotMod.BarOrientation) = this()
}

