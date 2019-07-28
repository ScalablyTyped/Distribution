package typings.plottable.buildSrcPlotsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("plottable/build/src/plots", "Rectangle")
@js.native
/**
  * A Rectangle Plot displays rectangles based on the data.
  * The left and right edges of each rectangle can be set with x() and x2().
  *   If only x() is set the Rectangle Plot will attempt to compute the correct left and right edge positions.
  * The top and bottom edges of each rectangle can be set with y() and y2().
  *   If only y() is set the Rectangle Plot will attempt to compute the correct top and bottom edge positions.
  *
  * @constructor
  * @param {Scale.Scale} xScale
  * @param {Scale.Scale} yScale
  */
class Rectangle[X, Y] ()
  extends typings.plottable.buildSrcPlotsRectanglePlotMod.Rectangle[X, Y]

/* static members */
@JSImport("plottable/build/src/plots", "Rectangle")
@js.native
object Rectangle extends js.Object {
  var _X2_KEY: js.Any = js.native
  var _Y2_KEY: js.Any = js.native
}

