package typings.plottable.buildSrcAxesMod

import typings.plottable.buildSrcAxesAxisMod.AxisOrientation
import typings.plottable.buildSrcScalesQuantitativeScaleMod.QuantitativeScale
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("plottable/build/src/axes", "Numeric")
@js.native
class Numeric protected ()
  extends typings.plottable.buildSrcAxesNumericAxisMod.Numeric {
  /**
    * Constructs a Numeric Axis.
    *
    * A Numeric Axis is a visual representation of a QuantitativeScale.
    *
    * @constructor
    * @param {QuantitativeScale} scale
    * @param {AxisOrientation} orientation Orientation of this Numeric Axis.
    */
  def this(scale: QuantitativeScale[Double], orientation: AxisOrientation) = this()
}

