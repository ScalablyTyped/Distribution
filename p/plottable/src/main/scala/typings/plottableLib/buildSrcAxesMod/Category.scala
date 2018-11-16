package typings
package plottableLib.buildSrcAxesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("plottable/build/src/axes", "Category")
@js.native
class Category protected ()
  extends plottableLib.buildSrcAxesCategoryAxisMod.Category {
  /**
       * Constructs a Category Axis.
       *
       * A Category Axis is a visual representation of a Category Scale.
       *
       * @constructor
       * @param {Scales.Category} scale
       * @param {AxisOrientation} [orientation="bottom"] Orientation of this Category Axis.
       */
  def this(scale: plottableLib.buildSrcScalesMod.Category) = this()
  /**
       * Constructs a Category Axis.
       *
       * A Category Axis is a visual representation of a Category Scale.
       *
       * @constructor
       * @param {Scales.Category} scale
       * @param {AxisOrientation} [orientation="bottom"] Orientation of this Category Axis.
       */
  def this(scale: plottableLib.buildSrcScalesMod.Category, orientation: plottableLib.buildSrcAxesAxisMod.AxisOrientation) = this()
}

@JSImport("plottable/build/src/axes", "Category")
@js.native
object Category extends js.Object {
  /**
       * How many pixels to give labels at minimum before downsampling takes effect.
       */
  var _MINIMUM_WIDTH_PER_LABEL_PX: js.Any = js.native
}

