package typings.plottable

import typings.plottable.barPlotMod.Bar
import typings.plottable.barPlotMod.BarOrientation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("plottable/build/src/plots/clusteredBarPlot", JSImport.Namespace)
@js.native
object clusteredBarPlotMod extends js.Object {
  
  @js.native
  /**
    * A ClusteredBar Plot groups bars across Datasets based on the primary value of the bars.
    *   On a vertical ClusteredBar Plot, the bars with the same X value are grouped.
    *   On a horizontal ClusteredBar Plot, the bars with the same Y value are grouped.
    *
    * @constructor
    * @param {string} [orientation="vertical"] One of "vertical"/"horizontal".
    */
  class ClusteredBar[X, Y] () extends Bar[X, Y] {
    def this(orientation: BarOrientation) = this()
    
    var _clusterOffsets: js.Any = js.native
    
    /* private */ def _makeInnerScale(): js.Any = js.native
    
    /* private */ def _updateClusterPosition(): js.Any = js.native
  }
}
