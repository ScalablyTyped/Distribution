package typings
package plottableLib.plottableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("plottable", "Axes")
@js.native
object AxesNs extends js.Object {
  @js.native
  class Category protected ()
    extends plottableLib.buildSrcAxesMod.Category {
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
    def this(scale: plottableLib.buildSrcScalesMod.Category, orientation: plottableLib.buildSrcAxesAxisMod.AxisOrientation) = this()
  }
  
  @js.native
  class Numeric protected ()
    extends plottableLib.buildSrcAxesMod.Numeric {
    /**
      * Constructs a Numeric Axis.
      *
      * A Numeric Axis is a visual representation of a QuantitativeScale.
      *
      * @constructor
      * @param {QuantitativeScale} scale
      * @param {AxisOrientation} orientation Orientation of this Numeric Axis.
      */
    def this(scale: plottableLib.buildSrcScalesQuantitativeScaleMod.QuantitativeScale[scala.Double], orientation: plottableLib.buildSrcAxesAxisMod.AxisOrientation) = this()
  }
  
  @js.native
  class Time protected ()
    extends plottableLib.buildSrcAxesMod.Time {
    /**
      * Constructs a Time Axis.
      *
      * A Time Axis is a visual representation of a Time Scale.
      *
      * @constructor
      * @param {Scales.Time} scale
      * @param {AxisOrientation} orientation Orientation of this Time Axis. Time Axes can only have "top" or "bottom"
      * @param {boolean} useUTC Displays date object in UTC if true, local time if false. Defaults to false.
      * orientations.
      */
    def this(scale: plottableLib.buildSrcScalesMod.Time, orientation: plottableLib.buildSrcAxesTimeAxisMod.TimeAxisOrientation) = this()
    def this(scale: plottableLib.buildSrcScalesMod.Time, orientation: plottableLib.buildSrcAxesTimeAxisMod.TimeAxisOrientation, useUTC: scala.Boolean) = this()
  }
  
  val TierLabelPosition: plottableLib.Anon_CenterBetween = js.native
  val TimeAxisOrientation: plottableLib.Anon_BottomTop = js.native
  val TimeInterval: plottableLib.Anon_Minute = js.native
  @js.native
  object Category extends js.Object {
    /**
      * How many pixels to give labels at minimum before downsampling takes effect.
      */
    var _MINIMUM_WIDTH_PER_LABEL_PX: js.Any = js.native
  }
  
  @js.native
  object Time extends js.Object {
    /**
      * The CSS class applied to each Time Axis tier
      */
    var TIME_AXIS_TIER_CLASS: java.lang.String = js.native
    var _DEFAULT_TIME_AXIS_CONFIGURATIONS: js.Any = js.native
    var _LONG_DATE: js.Any = js.native
    var _SORTED_TIME_INTERVAL_INDEX: js.Any = js.native
  }
  
}

