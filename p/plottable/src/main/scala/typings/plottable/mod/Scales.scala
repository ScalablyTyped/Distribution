package typings.plottable.mod

import typings.d3Time.mod.CountableTimeInterval
import typings.plottable.buildSrcScalesTickGeneratorsMod.ITickGenerator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Scales {
  
  @JSImport("plottable", "Scales")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("plottable", "Scales.Category")
  @js.native
  /**
    * A Category Scale maps strings to numbers.
    *
    * @constructor
    */
  open class Category ()
    extends typings.plottable.buildSrcScalesMod.Category
  /* static members */
  object Category {
    
    @JSImport("plottable", "Scales.Category")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("plottable", "Scales.Category._convertToPlottableInnerPadding")
    @js.native
    def _convertToPlottableInnerPadding: Any = js.native
    inline def _convertToPlottableInnerPadding_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_convertToPlottableInnerPadding")(x.asInstanceOf[js.Any])
    
    @JSImport("plottable", "Scales.Category._convertToPlottableOuterPadding")
    @js.native
    def _convertToPlottableOuterPadding: Any = js.native
    inline def _convertToPlottableOuterPadding_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_convertToPlottableOuterPadding")(x.asInstanceOf[js.Any])
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
  open class Color ()
    extends typings.plottable.buildSrcScalesMod.Color {
    def this(scaleType: String) = this()
  }
  /* static members */
  object Color {
    
    @JSImport("plottable", "Scales.Color")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("plottable", "Scales.Color._LOOP_LIGHTEN_FACTOR")
    @js.native
    def _LOOP_LIGHTEN_FACTOR: Any = js.native
    inline def _LOOP_LIGHTEN_FACTOR_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_LOOP_LIGHTEN_FACTOR")(x.asInstanceOf[js.Any])
    
    @JSImport("plottable", "Scales.Color._MAXIMUM_COLORS_FROM_CSS")
    @js.native
    def _MAXIMUM_COLORS_FROM_CSS: Any = js.native
    inline def _MAXIMUM_COLORS_FROM_CSS_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_MAXIMUM_COLORS_FROM_CSS")(x.asInstanceOf[js.Any])
    
    @JSImport("plottable", "Scales.Color._getPlottableColors")
    @js.native
    def _getPlottableColors: Any = js.native
    inline def _getPlottableColors_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_getPlottableColors")(x.asInstanceOf[js.Any])
    
    @JSImport("plottable", "Scales.Color._plottableColorCache")
    @js.native
    def _plottableColorCache: Any = js.native
    inline def _plottableColorCache_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_plottableColorCache")(x.asInstanceOf[js.Any])
    
    inline def invalidateColorCache(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("invalidateColorCache")().asInstanceOf[Unit]
  }
  
  @JSImport("plottable", "Scales.InterpolatedColor")
  @js.native
  /**
    * An InterpolatedColor Scale maps numbers to color hex values, expressed as strings.
    *
    * @param {string} [scaleType="linear"] One of "linear"/"log"/"sqrt"/"pow".
    */
  open class InterpolatedColor ()
    extends typings.plottable.buildSrcScalesMod.InterpolatedColor {
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
    inline def BLUES_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BLUES")(x.asInstanceOf[js.Any])
    
    @JSImport("plottable", "Scales.InterpolatedColor.POSNEG")
    @js.native
    def POSNEG: js.Array[String] = js.native
    inline def POSNEG_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("POSNEG")(x.asInstanceOf[js.Any])
    
    @JSImport("plottable", "Scales.InterpolatedColor.REDS")
    @js.native
    def REDS: js.Array[String] = js.native
    inline def REDS_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("REDS")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("plottable", "Scales.Linear")
  @js.native
  /**
    * @constructor
    */
  open class Linear ()
    extends typings.plottable.buildSrcScalesMod.Linear
  
  @JSImport("plottable", "Scales.Log")
  @js.native
  /**
    * @constructor
    */
  open class Log ()
    extends typings.plottable.buildSrcScalesMod.Log {
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
  open class ModifiedLog ()
    extends typings.plottable.buildSrcScalesMod.ModifiedLog {
    def this(base: Double) = this()
  }
  
  object TickGenerators {
    
    @JSImport("plottable", "Scales.TickGenerators")
    @js.native
    val ^ : js.Any = js.native
    
    inline def integerTickGenerator(): ITickGenerator[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("integerTickGenerator")().asInstanceOf[ITickGenerator[Double]]
    
    inline def intervalTickGenerator(interval: Double): ITickGenerator[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("intervalTickGenerator")(interval.asInstanceOf[js.Any]).asInstanceOf[ITickGenerator[Double]]
  }
  
  @JSImport("plottable", "Scales.Time")
  @js.native
  /**
    * A Time Scale maps Date objects to numbers.
    *
    * @constructor
    */
  open class Time ()
    extends typings.plottable.buildSrcScalesMod.Time
  /* static members */
  object Time {
    
    @JSImport("plottable", "Scales.Time")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Transforms the Plottable TimeInterval string into a d3 time interval equivalent.
      * If the provided TimeInterval is incorrect, the default is d3.timeYear
      */
    inline def timeIntervalToD3Time(timeInterval: String, useUTC: Boolean): CountableTimeInterval = (^.asInstanceOf[js.Dynamic].applyDynamic("timeIntervalToD3Time")(timeInterval.asInstanceOf[js.Any], useUTC.asInstanceOf[js.Any])).asInstanceOf[CountableTimeInterval]
  }
  
  inline def isTransformable(scale: Any): /* is plottable.plottable/build/src/scales.ITransformableScale */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTransformable")(scale.asInstanceOf[js.Any]).asInstanceOf[/* is plottable.plottable/build/src/scales.ITransformableScale */ Boolean]
}
