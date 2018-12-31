package typings
package plottableLib.plottableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("plottable", "XYPlot")
@js.native
/**
  * An XYPlot is a Plot that displays data along two primary directions, X and Y.
  *
  * @constructor
  * @param {Scale} xScale The x scale to use.
  * @param {Scale} yScale The y scale to use.
  */
class XYPlot[X, Y] ()
  extends plottableLib.buildSrcPlotsXyPlotMod.XYPlot[X, Y]

@JSImport("plottable", "XYPlot")
@js.native
object XYPlot extends js.Object {
  var _X_KEY: java.lang.String = js.native
  var _Y_KEY: java.lang.String = js.native
}

