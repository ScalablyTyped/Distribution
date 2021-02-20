package typings.plottable

import typings.plottable.axisMod.Axis
import typings.plottable.formattersMod.Formatter
import typings.plottable.plottableStrings.between
import typings.plottable.plottableStrings.bottom
import typings.plottable.plottableStrings.center
import typings.plottable.plottableStrings.day
import typings.plottable.plottableStrings.hour
import typings.plottable.plottableStrings.minute
import typings.plottable.plottableStrings.month
import typings.plottable.plottableStrings.second
import typings.plottable.plottableStrings.top
import typings.plottable.plottableStrings.week
import typings.plottable.plottableStrings.year
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object timeAxisMod {
  
  /* keyof plottable.anon.Between */ /* Rewritten from type alias, can be one of: 
    - typings.plottable.plottableStrings.center
    - typings.plottable.plottableStrings.between
  */
  trait TierLabelPosition extends StObject
  object TierLabelPosition {
    
    @JSImport("plottable/build/src/axes/timeAxis", "TierLabelPosition")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("plottable/build/src/axes/timeAxis", "TierLabelPosition.between")
    @js.native
    def between: typings.plottable.plottableStrings.between = js.native
    @scala.inline
    def between_=(x: between): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("between")(x.asInstanceOf[js.Any])
    
    @JSImport("plottable/build/src/axes/timeAxis", "TierLabelPosition.center")
    @js.native
    def center: typings.plottable.plottableStrings.center = js.native
    @scala.inline
    def center_=(x: center): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("center")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("plottable/build/src/axes/timeAxis", "Time")
  @js.native
  class Time protected () extends Axis[Date] {
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
    def this(scale: typings.plottable.scalesMod.Time, orientation: TimeAxisOrientation) = this()
    def this(scale: typings.plottable.scalesMod.Time, orientation: TimeAxisOrientation, useUTC: Boolean) = this()
    
    /**
      * Check if tier configuration fits in the current width and satisfied the
      * max TimeInterval precision limit.
      */
    /* private */ def _checkTimeAxisTierConfiguration(config: js.Any): js.Any = js.native
    
    /* private */ def _cleanTiers(): js.Any = js.native
    
    /* private */ def _generateLabellessTicks(): js.Any = js.native
    
    /* private */ def _getIntervalLength(config: js.Any): js.Any = js.native
    
    /**
      * Gets the index of the most precise TimeAxisConfiguration that will fit in the current width.
      */
    /* private */ def _getMostPreciseConfigurationIndex(): js.Any = js.native
    
    /* private */ def _getTickIntervalValues(config: js.Any): js.Any = js.native
    
    /* private */ def _getTickValuesForConfiguration(config: js.Any): js.Any = js.native
    
    /* private */ def _hideOverflowingTiers(): js.Any = js.native
    
    /* private */ def _hideOverlappingAndCutOffLabels(index: js.Any): js.Any = js.native
    
    var _maxTimeIntervalPrecision: js.Any = js.native
    
    /* private */ def _maxWidthForInterval(config: js.Any): js.Any = js.native
    
    var _measurer: js.Any = js.native
    
    var _mostPreciseConfigIndex: js.Any = js.native
    
    var _numTiers: js.Any = js.native
    
    var _possibleTimeAxisConfigurations: js.Any = js.native
    
    /* private */ def _renderLabellessTickMarks(tickValues: js.Any): js.Any = js.native
    
    /* private */ def _renderTickMarks(tickValues: js.Any, index: js.Any): js.Any = js.native
    
    /* private */ def _renderTierLabels(container: js.Any, config: js.Any, index: js.Any): js.Any = js.native
    
    /* private */ def _setupDomElements(): js.Any = js.native
    
    var _tierBaselines: js.Any = js.native
    
    var _tierHeights: js.Any = js.native
    
    var _tierLabelContainers: js.Any = js.native
    
    var _tierLabelPositions: js.Any = js.native
    
    var _tierMarkContainers: js.Any = js.native
    
    var _useUTC: js.Any = js.native
    
    /**
      * Gets the possible TimeAxisConfigurations.
      */
    def axisConfigurations(): js.Array[TimeAxisConfiguration] = js.native
    /**
      * Sets the possible TimeAxisConfigurations.
      * The Time Axis will choose the most precise configuration that will display in the available space.
      *
      * @param {TimeAxisConfiguration[]} configurations
      * @returns {Axes.Time} The calling Time Axis.
      */
    def axisConfigurations(configurations: js.Array[TimeAxisConfiguration]): this.type = js.native
    
    /**
      * Returns the current `TimeAxisConfiguration` used to render the axes.
      *
      * Note that this is only valid after the axis had been rendered and the
      * most precise valid configuration is determined from the available space
      * and maximum precision constraints.
      *
      * @returns {TimeAxisConfiguration} The currently used `TimeAxisConfiguration` or `undefined`.
      */
    def currentAxisConfiguration(): TimeAxisConfiguration = js.native
    
    /**
      * Gets the maximum TimeInterval precision
      */
    def maxTimeIntervalPrecision(): TimeInterval = js.native
    /**
      * Sets the maximum TimeInterval precision. This limits the display to not
      * show time intervals above this precision. For example, if this is set to
      * `TimeInterval.day` or `"day"` then no hours or minute ticks will be
      * displayed in the axis.
      *
      * @param {TimeInterval} newPrecision The new maximum precision.
      * @returns {Axes.Time} The calling Time Axis.
      */
    def maxTimeIntervalPrecision(newPrecision: TimeInterval): this.type = js.native
    
    def orientation(orientation: TimeAxisOrientation): this.type = js.native
    
    /**
      * Gets the label positions for each tier.
      */
    def tierLabelPositions(): js.Array[TierLabelPosition] = js.native
    /**
      * Sets the label positions for each tier.
      *
      * @param {string[]} newPositions The positions for each tier. "between" and "center" are the only supported values.
      * @returns {Axes.Time} The calling Time Axis.
      */
    def tierLabelPositions(newPositions: js.Array[TierLabelPosition]): this.type = js.native
  }
  /* static members */
  object Time {
    
    @JSImport("plottable/build/src/axes/timeAxis", "Time")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * The CSS class applied to each Time Axis tier
      */
    @JSImport("plottable/build/src/axes/timeAxis", "Time.TIME_AXIS_TIER_CLASS")
    @js.native
    def TIME_AXIS_TIER_CLASS: String = js.native
    @scala.inline
    def TIME_AXIS_TIER_CLASS_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TIME_AXIS_TIER_CLASS")(x.asInstanceOf[js.Any])
    
    @JSImport("plottable/build/src/axes/timeAxis", "Time._DEFAULT_TIME_AXIS_CONFIGURATIONS")
    @js.native
    def _DEFAULT_TIME_AXIS_CONFIGURATIONS: js.Any = js.native
    @scala.inline
    def _DEFAULT_TIME_AXIS_CONFIGURATIONS_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_DEFAULT_TIME_AXIS_CONFIGURATIONS")(x.asInstanceOf[js.Any])
    
    @JSImport("plottable/build/src/axes/timeAxis", "Time._LONG_DATE")
    @js.native
    def _LONG_DATE: js.Any = js.native
    @scala.inline
    def _LONG_DATE_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_LONG_DATE")(x.asInstanceOf[js.Any])
    
    @JSImport("plottable/build/src/axes/timeAxis", "Time._SORTED_TIME_INTERVAL_INDEX")
    @js.native
    def _SORTED_TIME_INTERVAL_INDEX: js.Any = js.native
    @scala.inline
    def _SORTED_TIME_INTERVAL_INDEX_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_SORTED_TIME_INTERVAL_INDEX")(x.asInstanceOf[js.Any])
  }
  
  /* keyof plottable.anon.Top */ /* Rewritten from type alias, can be one of: 
    - typings.plottable.plottableStrings.top
    - typings.plottable.plottableStrings.bottom
  */
  trait TimeAxisOrientation extends StObject
  object TimeAxisOrientation {
    
    @JSImport("plottable/build/src/axes/timeAxis", "TimeAxisOrientation")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("plottable/build/src/axes/timeAxis", "TimeAxisOrientation.bottom")
    @js.native
    def bottom: typings.plottable.plottableStrings.bottom = js.native
    @scala.inline
    def bottom_=(x: bottom): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bottom")(x.asInstanceOf[js.Any])
    
    @JSImport("plottable/build/src/axes/timeAxis", "TimeAxisOrientation.top")
    @js.native
    def top: typings.plottable.plottableStrings.top = js.native
    @scala.inline
    def top_=(x: top): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("top")(x.asInstanceOf[js.Any])
  }
  
  /* keyof plottable.anon.Day */ /* Rewritten from type alias, can be one of: 
    - typings.plottable.plottableStrings.second
    - typings.plottable.plottableStrings.minute
    - typings.plottable.plottableStrings.hour
    - typings.plottable.plottableStrings.day
    - typings.plottable.plottableStrings.week
    - typings.plottable.plottableStrings.month
    - typings.plottable.plottableStrings.year
  */
  trait TimeInterval extends StObject
  object TimeInterval {
    
    @JSImport("plottable/build/src/axes/timeAxis", "TimeInterval")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("plottable/build/src/axes/timeAxis", "TimeInterval.day")
    @js.native
    def day: typings.plottable.plottableStrings.day = js.native
    @scala.inline
    def day_=(x: day): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("day")(x.asInstanceOf[js.Any])
    
    @JSImport("plottable/build/src/axes/timeAxis", "TimeInterval.hour")
    @js.native
    def hour: typings.plottable.plottableStrings.hour = js.native
    @scala.inline
    def hour_=(x: hour): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hour")(x.asInstanceOf[js.Any])
    
    @JSImport("plottable/build/src/axes/timeAxis", "TimeInterval.minute")
    @js.native
    def minute: typings.plottable.plottableStrings.minute = js.native
    @scala.inline
    def minute_=(x: minute): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("minute")(x.asInstanceOf[js.Any])
    
    @JSImport("plottable/build/src/axes/timeAxis", "TimeInterval.month")
    @js.native
    def month: typings.plottable.plottableStrings.month = js.native
    @scala.inline
    def month_=(x: month): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("month")(x.asInstanceOf[js.Any])
    
    @JSImport("plottable/build/src/axes/timeAxis", "TimeInterval.second")
    @js.native
    def second: typings.plottable.plottableStrings.second = js.native
    @scala.inline
    def second_=(x: second): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("second")(x.asInstanceOf[js.Any])
    
    @JSImport("plottable/build/src/axes/timeAxis", "TimeInterval.week")
    @js.native
    def week: typings.plottable.plottableStrings.week = js.native
    @scala.inline
    def week_=(x: week): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("week")(x.asInstanceOf[js.Any])
    
    @JSImport("plottable/build/src/axes/timeAxis", "TimeInterval.year")
    @js.native
    def year: typings.plottable.plottableStrings.year = js.native
    @scala.inline
    def year_=(x: year): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("year")(x.asInstanceOf[js.Any])
  }
  
  type TimeAxisConfiguration = js.Array[TimeAxisTierConfiguration]
  
  @js.native
  trait TimeAxisTierConfiguration extends StObject {
    
    /**
      * Formatter used to format tick labels. Tick values will be passed through the formatter
      * before being displayed.
      */
    def formatter(value: js.Any): String = js.native
    /**
      * Formatter used to format tick labels. Tick values will be passed through the formatter
      * before being displayed.
      */
    @JSName("formatter")
    var formatter_Original: Formatter = js.native
    
    /**
      * The time unit associated with this configuration (seconds, minutes, hours, etc).
      */
    var interval: String = js.native
    
    /**
      * Number of intervals between each tick.
      */
    var step: Double = js.native
  }
}
