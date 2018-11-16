package typings
package plottableLib.buildSrcAxesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("plottable/build/src/axes", "Time")
@js.native
class Time protected ()
  extends plottableLib.buildSrcAxesTimeAxisMod.Time {
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
  def this(scale: plottableLib.buildSrcScalesMod.Time, orientation: plottableLib.buildSrcAxesTimeAxisMod.TimeAxisOrientation, useUTC: scala.Boolean) = this()
}

@JSImport("plottable/build/src/axes", "Time")
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

