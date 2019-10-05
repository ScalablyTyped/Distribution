package typings.plottable.plottableMod

import typings.d3DashTime.d3DashTimeMod.CountableTimeInterval
import typings.plottable.buildSrcScalesTickGeneratorsMod.ITickGenerator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("plottable", "Scales")
@js.native
object Scales extends js.Object {
  @js.native
  /**
    * A Category Scale maps strings to numbers.
    *
    * @constructor
    */
  class Category ()
    extends typings.plottable.buildSrcScalesMod.Category
  
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
    extends typings.plottable.buildSrcScalesMod.Color {
    def this(scaleType: String) = this()
  }
  
  @js.native
  /**
    * An InterpolatedColor Scale maps numbers to color hex values, expressed as strings.
    *
    * @param {string} [scaleType="linear"] One of "linear"/"log"/"sqrt"/"pow".
    */
  class InterpolatedColor ()
    extends typings.plottable.buildSrcScalesMod.InterpolatedColor {
    def this(scaleType: String) = this()
  }
  
  @js.native
  /**
    * @constructor
    */
  class Linear ()
    extends typings.plottable.buildSrcScalesMod.Linear
  
  @js.native
  /**
    * @constructor
    */
  class Log ()
    extends typings.plottable.buildSrcScalesMod.Log {
    def this(base: Double) = this()
  }
  
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
    extends typings.plottable.buildSrcScalesMod.ModifiedLog {
    def this(base: Double) = this()
  }
  
  @js.native
  /**
    * A Time Scale maps Date objects to numbers.
    *
    * @constructor
    */
  class Time ()
    extends typings.plottable.buildSrcScalesMod.Time
  
  def isTransformable(scale: js.Any): /* is plottable.plottable/build/src/scales.ITransformableScale */ Boolean = js.native
  /* static members */
  @js.native
  object Category extends js.Object {
    /* private */ def _convertToPlottableInnerPadding(d3InnerPadding: js.Any): js.Any = js.native
    /* private */ def _convertToPlottableOuterPadding(d3OuterPadding: js.Any, d3InnerPadding: js.Any): js.Any = js.native
  }
  
  /* static members */
  @js.native
  object Color extends js.Object {
    var _LOOP_LIGHTEN_FACTOR: js.Any = js.native
    var _MAXIMUM_COLORS_FROM_CSS: js.Any = js.native
    var _plottableColorCache: js.Any = js.native
    /* private */ def _getPlottableColors(): js.Any = js.native
    def invalidateColorCache(): Unit = js.native
  }
  
  /* static members */
  @js.native
  object InterpolatedColor extends js.Object {
    var BLUES: js.Array[String] = js.native
    var POSNEG: js.Array[String] = js.native
    var REDS: js.Array[String] = js.native
  }
  
  @js.native
  object TickGenerators extends js.Object {
    def integerTickGenerator(): ITickGenerator[Double] = js.native
    def intervalTickGenerator(interval: Double): ITickGenerator[Double] = js.native
  }
  
  /* static members */
  @js.native
  object Time extends js.Object {
    /**
      * Transforms the Plottable TimeInterval string into a d3 time interval equivalent.
      * If the provided TimeInterval is incorrect, the default is d3.timeYear
      */
    def timeIntervalToD3Time(timeInterval: String, useUTC: Boolean): CountableTimeInterval = js.native
  }
  
}

