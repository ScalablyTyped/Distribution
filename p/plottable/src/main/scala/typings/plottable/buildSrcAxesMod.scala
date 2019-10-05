package typings.plottable

import typings.plottable.buildSrcAxesAxisMod.AxisOrientation
import typings.plottable.buildSrcAxesTimeAxisMod.TimeAxisOrientation
import typings.plottable.buildSrcScalesQuantitativeScaleMod.QuantitativeScale
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("plottable/build/src/axes", JSImport.Namespace)
@js.native
object buildSrcAxesMod extends js.Object {
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
  
  @js.native
  class Time protected ()
    extends typings.plottable.buildSrcAxesTimeAxisMod.Time {
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
    def this(scale: typings.plottable.buildSrcScalesMod.Time, orientation: TimeAxisOrientation) = this()
    def this(scale: typings.plottable.buildSrcScalesMod.Time, orientation: TimeAxisOrientation, useUTC: Boolean) = this()
  }
  
  /* static members */
  @js.native
  object Category extends js.Object {
    /**
      * How many pixels to give labels at minimum before downsampling takes effect.
      */
    var _MINIMUM_WIDTH_PER_LABEL_PX: js.Any = js.native
  }
  
  @js.native
  object TierLabelPosition extends js.Object {
    var between: typings.plottable.plottableStrings.between = js.native
    var center: typings.plottable.plottableStrings.center = js.native
  }
  
  /* static members */
  @js.native
  object Time extends js.Object {
    /**
      * The CSS class applied to each Time Axis tier
      */
    var TIME_AXIS_TIER_CLASS: String = js.native
    var _DEFAULT_TIME_AXIS_CONFIGURATIONS: js.Any = js.native
    var _LONG_DATE: js.Any = js.native
    var _SORTED_TIME_INTERVAL_INDEX: js.Any = js.native
  }
  
  @js.native
  object TimeAxisOrientation extends js.Object {
    var bottom: typings.plottable.plottableStrings.bottom = js.native
    var top: typings.plottable.plottableStrings.top = js.native
  }
  
  @js.native
  object TimeInterval extends js.Object {
    var day: typings.plottable.plottableStrings.day = js.native
    var hour: typings.plottable.plottableStrings.hour = js.native
    var minute: typings.plottable.plottableStrings.minute = js.native
    var month: typings.plottable.plottableStrings.month = js.native
    var second: typings.plottable.plottableStrings.second = js.native
    var week: typings.plottable.plottableStrings.week = js.native
    var year: typings.plottable.plottableStrings.year = js.native
  }
  
}

