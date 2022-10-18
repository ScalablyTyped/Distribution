package typings.plottable

import typings.plottable.buildSrcAxesAxisMod.Axis
import typings.plottable.buildSrcCoreFormattersMod.Formatter
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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcAxesTimeAxisMod {
  
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
    inline def between_=(x: between): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("between")(x.asInstanceOf[js.Any])
    
    @JSImport("plottable/build/src/axes/timeAxis", "TierLabelPosition.center")
    @js.native
    def center: typings.plottable.plottableStrings.center = js.native
    inline def center_=(x: center): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("center")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("plottable/build/src/axes/timeAxis", "Time")
  @js.native
  open class Time protected ()
    extends Axis[js.Date] {
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
    
    /**
      * Check if tier configuration fits in the current width and satisfied the
      * max TimeInterval precision limit.
      */
    /* private */ var _checkTimeAxisTierConfiguration: Any = js.native
    
    /* private */ var _cleanTiers: Any = js.native
    
    /* private */ var _generateLabellessTicks: Any = js.native
    
    /* private */ var _getIntervalLength: Any = js.native
    
    /**
      * Gets the index of the most precise TimeAxisConfiguration that will fit in the current width.
      */
    /* private */ var _getMostPreciseConfigurationIndex: Any = js.native
    
    /* private */ var _getTickIntervalValues: Any = js.native
    
    /* private */ var _getTickValuesForConfiguration: Any = js.native
    
    /* private */ var _hideOverflowingTiers: Any = js.native
    
    /* private */ var _hideOverlappingAndCutOffLabels: Any = js.native
    
    /* private */ var _maxTimeIntervalPrecision: Any = js.native
    
    /* private */ var _maxWidthForInterval: Any = js.native
    
    /* private */ var _measurer: Any = js.native
    
    /* private */ var _mostPreciseConfigIndex: Any = js.native
    
    /* private */ var _numTiers: Any = js.native
    
    /* private */ var _possibleTimeAxisConfigurations: Any = js.native
    
    /* private */ var _renderLabellessTickMarks: Any = js.native
    
    /* private */ var _renderTickMarks: Any = js.native
    
    /* private */ var _renderTierLabels: Any = js.native
    
    /* private */ var _setupDomElements: Any = js.native
    
    /* private */ var _tierBaselines: Any = js.native
    
    /* private */ var _tierHeights: Any = js.native
    
    /* private */ var _tierLabelContainers: Any = js.native
    
    /* private */ var _tierLabelPositions: Any = js.native
    
    /* private */ var _tierMarkContainers: Any = js.native
    
    /* private */ var _useUTC: Any = js.native
    
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
    inline def TIME_AXIS_TIER_CLASS_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TIME_AXIS_TIER_CLASS")(x.asInstanceOf[js.Any])
    
    @JSImport("plottable/build/src/axes/timeAxis", "Time._DEFAULT_TIME_AXIS_CONFIGURATIONS")
    @js.native
    def _DEFAULT_TIME_AXIS_CONFIGURATIONS: Any = js.native
    inline def _DEFAULT_TIME_AXIS_CONFIGURATIONS_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_DEFAULT_TIME_AXIS_CONFIGURATIONS")(x.asInstanceOf[js.Any])
    
    @JSImport("plottable/build/src/axes/timeAxis", "Time._LONG_DATE")
    @js.native
    def _LONG_DATE: Any = js.native
    inline def _LONG_DATE_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_LONG_DATE")(x.asInstanceOf[js.Any])
    
    @JSImport("plottable/build/src/axes/timeAxis", "Time._SORTED_TIME_INTERVAL_INDEX")
    @js.native
    def _SORTED_TIME_INTERVAL_INDEX: Any = js.native
    inline def _SORTED_TIME_INTERVAL_INDEX_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_SORTED_TIME_INTERVAL_INDEX")(x.asInstanceOf[js.Any])
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
    inline def bottom_=(x: bottom): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bottom")(x.asInstanceOf[js.Any])
    
    @JSImport("plottable/build/src/axes/timeAxis", "TimeAxisOrientation.top")
    @js.native
    def top: typings.plottable.plottableStrings.top = js.native
    inline def top_=(x: top): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("top")(x.asInstanceOf[js.Any])
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
    inline def day_=(x: day): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("day")(x.asInstanceOf[js.Any])
    
    @JSImport("plottable/build/src/axes/timeAxis", "TimeInterval.hour")
    @js.native
    def hour: typings.plottable.plottableStrings.hour = js.native
    inline def hour_=(x: hour): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hour")(x.asInstanceOf[js.Any])
    
    @JSImport("plottable/build/src/axes/timeAxis", "TimeInterval.minute")
    @js.native
    def minute: typings.plottable.plottableStrings.minute = js.native
    inline def minute_=(x: minute): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("minute")(x.asInstanceOf[js.Any])
    
    @JSImport("plottable/build/src/axes/timeAxis", "TimeInterval.month")
    @js.native
    def month: typings.plottable.plottableStrings.month = js.native
    inline def month_=(x: month): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("month")(x.asInstanceOf[js.Any])
    
    @JSImport("plottable/build/src/axes/timeAxis", "TimeInterval.second")
    @js.native
    def second: typings.plottable.plottableStrings.second = js.native
    inline def second_=(x: second): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("second")(x.asInstanceOf[js.Any])
    
    @JSImport("plottable/build/src/axes/timeAxis", "TimeInterval.week")
    @js.native
    def week: typings.plottable.plottableStrings.week = js.native
    inline def week_=(x: week): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("week")(x.asInstanceOf[js.Any])
    
    @JSImport("plottable/build/src/axes/timeAxis", "TimeInterval.year")
    @js.native
    def year: typings.plottable.plottableStrings.year = js.native
    inline def year_=(x: year): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("year")(x.asInstanceOf[js.Any])
  }
  
  type TimeAxisConfiguration = js.Array[TimeAxisTierConfiguration]
  
  trait TimeAxisTierConfiguration extends StObject {
    
    /**
      * Formatter used to format tick labels. Tick values will be passed through the formatter
      * before being displayed.
      */
    def formatter(value: Any): String
    /**
      * Formatter used to format tick labels. Tick values will be passed through the formatter
      * before being displayed.
      */
    @JSName("formatter")
    var formatter_Original: Formatter
    
    /**
      * The time unit associated with this configuration (seconds, minutes, hours, etc).
      */
    var interval: String
    
    /**
      * Number of intervals between each tick.
      */
    var step: Double
  }
  object TimeAxisTierConfiguration {
    
    inline def apply(formatter: /* value */ Any => String, interval: String, step: Double): TimeAxisTierConfiguration = {
      val __obj = js.Dynamic.literal(formatter = js.Any.fromFunction1(formatter), interval = interval.asInstanceOf[js.Any], step = step.asInstanceOf[js.Any])
      __obj.asInstanceOf[TimeAxisTierConfiguration]
    }
    
    extension [Self <: TimeAxisTierConfiguration](x: Self) {
      
      inline def setFormatter(value: /* value */ Any => String): Self = StObject.set(x, "formatter", js.Any.fromFunction1(value))
      
      inline def setInterval(value: String): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
      
      inline def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
    }
  }
}
