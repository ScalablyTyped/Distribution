package typings.plottable.buildSrcAxesMod

import typings.plottable.buildSrcAxesAxisMod.AxisOrientation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("plottable/build/src/axes", "Category")
@js.native
class Category protected ()
  extends typings.plottable.buildSrcAxesCategoryAxisMod.Category {
  /**
    * Constructs a Category Axis.
    *
    * A Category Axis is a visual representation of a Category Scale.
    *
    * @constructor
    * @param {Scales.Category} scale
    * @param {AxisOrientation} [orientation="bottom"] Orientation of this Category Axis.
    */
  def this(scale: typings.plottable.buildSrcScalesMod.Category) = this()
  def this(scale: typings.plottable.buildSrcScalesMod.Category, orientation: AxisOrientation) = this()
}

/* static members */
@JSImport("plottable/build/src/axes", "Category")
@js.native
object Category extends js.Object {
  /**
    * How many pixels to give labels at minimum before downsampling takes effect.
    */
  var _MINIMUM_WIDTH_PER_LABEL_PX: js.Any = js.native
}

