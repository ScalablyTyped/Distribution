package typings.plottable.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("plottable", "XYPlot")
@js.native
/**
  * An XYPlot is a Plot that displays data along two primary directions, X and Y.
  *
  * @constructor
  * @param {Scale} xScale The x scale to use.
  * @param {Scale} yScale The y scale to use.
  */
open class XYPlot[X, Y] ()
  extends typings.plottable.buildSrcPlotsXyPlotMod.XYPlot[X, Y]
/* static members */
object XYPlot {
  
  @JSImport("plottable", "XYPlot")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("plottable", "XYPlot._X_KEY")
  @js.native
  def _X_KEY: String = js.native
  inline def _X_KEY_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_X_KEY")(x.asInstanceOf[js.Any])
  
  @JSImport("plottable", "XYPlot._Y_KEY")
  @js.native
  def _Y_KEY: String = js.native
  inline def _Y_KEY_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_Y_KEY")(x.asInstanceOf[js.Any])
}
