package typings.plottable

import typings.plottable.buildSrcPlotsBarPlotMod.Bar
import typings.plottable.buildSrcPlotsBarPlotMod.BarOrientation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcPlotsClusteredBarPlotMod {
  
  @JSImport("plottable/build/src/plots/clusteredBarPlot", "ClusteredBar")
  @js.native
  /**
    * A ClusteredBar Plot groups bars across Datasets based on the primary value of the bars.
    *   On a vertical ClusteredBar Plot, the bars with the same X value are grouped.
    *   On a horizontal ClusteredBar Plot, the bars with the same Y value are grouped.
    *
    * @constructor
    * @param {string} [orientation="vertical"] One of "vertical"/"horizontal".
    */
  open class ClusteredBar[X, Y] () extends Bar[X, Y] {
    def this(orientation: BarOrientation) = this()
    
    /* private */ var _clusterOffsets: Any = js.native
    
    /* private */ var _makeInnerScale: Any = js.native
    
    /* private */ var _updateClusterPosition: Any = js.native
  }
}
