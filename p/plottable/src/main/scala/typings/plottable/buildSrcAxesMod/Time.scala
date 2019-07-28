package typings.plottable.buildSrcAxesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("plottable/build/src/axes", "Time")
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
  def this(
    scale: typings.plottable.buildSrcScalesMod.Time,
    orientation: typings.plottable.buildSrcAxesTimeAxisMod.TimeAxisOrientation
  ) = this()
  def this(
    scale: typings.plottable.buildSrcScalesMod.Time,
    orientation: typings.plottable.buildSrcAxesTimeAxisMod.TimeAxisOrientation,
    useUTC: Boolean
  ) = this()
}

/* static members */
@JSImport("plottable/build/src/axes", "Time")
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

