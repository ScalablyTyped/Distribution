package typings.plottable.mod

import typings.d3Time.mod.CountableTimeInterval
import typings.plottable.tickGeneratorsMod.ITickGenerator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Scales {
  
  @JSImport("plottable", "Scales.Category")
  @js.native
  /**
    * A Category Scale maps strings to numbers.
    *
    * @constructor
    */
  class Category ()
    extends typings.plottable.scalesMod.Category
  /* static members */
  object Category {
    
    @JSImport("plottable", "Scales.Category._convertToPlottableInnerPadding")
    @js.native
    def _convertToPlottableInnerPadding(d3InnerPadding: js.Any): js.Any = js.native
    
    @JSImport("plottable", "Scales.Category._convertToPlottableOuterPadding")
    @js.native
    def _convertToPlottableOuterPadding(d3OuterPadding: js.Any, d3InnerPadding: js.Any): js.Any = js.native
  }
  
  @JSImport("plottable", "Scales.Color")
  @js.native
  /**
    * A Color Scale maps string values to color hex values expressed as a string.
    *
    * @constructor
    * @param {string} [scaleType] One of "Category10"/"Category20"/"Category20b"/"Category20c".
    *   (see https://github.com/mbostock/d3/wiki/Ordinal-Scales#categorical-colors)
    *   If not supplied, reads the colors defined using CSS -- see plottable.css.
    */
  class Color ()
    extends typings.plottable.scalesMod.Color {
    def this(scaleType: String) = this()
  }
  /* static members */
  object Color {
    
    @JSImport("plottable", "Scales.Color")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("plottable", "Scales.Color._LOOP_LIGHTEN_FACTOR")
    @js.native
    def _LOOP_LIGHTEN_FACTOR: js.Any = js.native
    @scala.inline
    def _LOOP_LIGHTEN_FACTOR_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_LOOP_LIGHTEN_FACTOR")(x.asInstanceOf[js.Any])
    
    @JSImport("plottable", "Scales.Color._MAXIMUM_COLORS_FROM_CSS")
    @js.native
    def _MAXIMUM_COLORS_FROM_CSS: js.Any = js.native
    @scala.inline
    def _MAXIMUM_COLORS_FROM_CSS_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_MAXIMUM_COLORS_FROM_CSS")(x.asInstanceOf[js.Any])
    
    @JSImport("plottable", "Scales.Color._getPlottableColors")
    @js.native
    def _getPlottableColors(): js.Any = js.native
    
    @JSImport("plottable", "Scales.Color._plottableColorCache")
    @js.native
    def _plottableColorCache: js.Any = js.native
    @scala.inline
    def _plottableColorCache_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_plottableColorCache")(x.asInstanceOf[js.Any])
    
    @JSImport("plottable", "Scales.Color.invalidateColorCache")
    @js.native
    def invalidateColorCache(): Unit = js.native
  }
  
  @JSImport("plottable", "Scales.InterpolatedColor")
  @js.native
  /**
    * An InterpolatedColor Scale maps numbers to color hex values, expressed as strings.
    *
    * @param {string} [scaleType="linear"] One of "linear"/"log"/"sqrt"/"pow".
    */
  class InterpolatedColor ()
    extends typings.plottable.scalesMod.InterpolatedColor {
    def this(scaleType: String) = this()
  }
  /* static members */
  object InterpolatedColor {
    
    @JSImport("plottable", "Scales.InterpolatedColor")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("plottable", "Scales.InterpolatedColor.BLUES")
    @js.native
    def BLUES: js.Array[String] = js.native
    @scala.inline
    def BLUES_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BLUES")(x.asInstanceOf[js.Any])
    
    @JSImport("plottable", "Scales.InterpolatedColor.POSNEG")
    @js.native
    def POSNEG: js.Array[String] = js.native
    @scala.inline
    def POSNEG_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("POSNEG")(x.asInstanceOf[js.Any])
    
    @JSImport("plottable", "Scales.InterpolatedColor.REDS")
    @js.native
    def REDS: js.Array[String] = js.native
    @scala.inline
    def REDS_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("REDS")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("plottable", "Scales.Linear")
  @js.native
  /**
    * @constructor
    */
  class Linear ()
    extends typings.plottable.scalesMod.Linear
  
  @JSImport("plottable", "Scales.Log")
  @js.native
  /**
    * @constructor
    */
  class Log ()
    extends typings.plottable.scalesMod.Log {
    def this(base: Double) = this()
  }
  
  @JSImport("plottable", "Scales.ModifiedLog")
  @js.native
  /**
    * A ModifiedLog Scale acts as a regular log scale for large numbers.
    * As it approaches 0, it gradually becomes linear.
    * Consequently, a ModifiedLog Scale can process 0 and negative numbers.
    *
    * For x >= base, scale(x) = log(x).
    *
    * For 0 < x < base, scale(x) will become more and more
    * linear as it approaches 0.
    *
    * At x == 0, scale(x) == 0.
    *
    * For negative values, scale(-x) = -scale(x).
    *
    * The range and domain for the scale should also be set, using the
    * range() and domain() accessors, respectively.
    *
    * For `range`, provide a two-element array giving the minimum and
    * maximum of values produced when scaling.
    *
    * For `domain` provide a two-element array giving the minimum and
    * maximum of the values that will be scaled.
    *
    * @constructor
    * @param {number} [base=10]
    *        The base of the log. Must be > 1.
    *
    */
  class ModifiedLog ()
    extends typings.plottable.scalesMod.ModifiedLog {
    def this(base: Double) = this()
  }
  
  object TickGenerators {
    
    @JSImport("plottable", "Scales.TickGenerators.integerTickGenerator")
    @js.native
    def integerTickGenerator(): ITickGenerator[Double] = js.native
    
    @JSImport("plottable", "Scales.TickGenerators.intervalTickGenerator")
    @js.native
    def intervalTickGenerator(interval: Double): ITickGenerator[Double] = js.native
  }
  
  @JSImport("plottable", "Scales.Time")
  @js.native
  /**
    * A Time Scale maps Date objects to numbers.
    *
    * @constructor
    */
  class Time ()
    extends typings.plottable.scalesMod.Time
  /* static members */
  object Time {
    
    /**
      * Transforms the Plottable TimeInterval string into a d3 time interval equivalent.
      * If the provided TimeInterval is incorrect, the default is d3.timeYear
      */
    @JSImport("plottable", "Scales.Time.timeIntervalToD3Time")
    @js.native
    def timeIntervalToD3Time(timeInterval: String, useUTC: Boolean): CountableTimeInterval = js.native
  }
  
  @JSImport("plottable", "Scales.isTransformable")
  @js.native
  def isTransformable(scale: js.Any): /* is plottable.plottable/build/src/scales.ITransformableScale */ Boolean = js.native
}
