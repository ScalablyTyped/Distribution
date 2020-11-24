package typings.plottable

import typings.plottable.axisMod.Axis
import typings.plottable.formattersMod.Formatter
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("plottable/build/src/axes/timeAxis", JSImport.Namespace)
@js.native
object timeAxisMod extends js.Object {
  
  /* keyof plottable.anon.Between */ /* Rewritten from type alias, can be one of: 
    - typings.plottable.plottableStrings.center
    - typings.plottable.plottableStrings.between
  */
  trait TierLabelPosition extends js.Object
  @js.native
  object TierLabelPosition extends js.Object {
    
    var between: typings.plottable.plottableStrings.between = js.native
    
    var center: typings.plottable.plottableStrings.center = js.native
  }
  
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
  
  /* keyof plottable.anon.Top */ /* Rewritten from type alias, can be one of: 
    - typings.plottable.plottableStrings.top
    - typings.plottable.plottableStrings.bottom
  */
  trait TimeAxisOrientation extends js.Object
  @js.native
  object TimeAxisOrientation extends js.Object {
    
    var bottom: typings.plottable.plottableStrings.bottom = js.native
    
    var top: typings.plottable.plottableStrings.top = js.native
  }
  
  @js.native
  trait TimeAxisTierConfiguration extends js.Object {
    
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
  
  /* keyof plottable.anon.Day */ /* Rewritten from type alias, can be one of: 
    - typings.plottable.plottableStrings.second
    - typings.plottable.plottableStrings.minute
    - typings.plottable.plottableStrings.hour
    - typings.plottable.plottableStrings.day
    - typings.plottable.plottableStrings.week
    - typings.plottable.plottableStrings.month
    - typings.plottable.plottableStrings.year
  */
  trait TimeInterval extends js.Object
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
  
  type TimeAxisConfiguration = js.Array[TimeAxisTierConfiguration]
}
