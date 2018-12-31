package typings
package plottableLib.plottableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("plottable", "Scales")
@js.native
object ScalesNs extends js.Object {
  @js.native
  /**
    * A Category Scale maps strings to numbers.
    *
    * @constructor
    */
  class Category ()
    extends plottableLib.buildSrcScalesMod.Category
  
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
    extends plottableLib.buildSrcScalesMod.Color {
    def this(scaleType: java.lang.String) = this()
  }
  
  @js.native
  /**
    * An InterpolatedColor Scale maps numbers to color hex values, expressed as strings.
    *
    * @param {string} [scaleType="linear"] One of "linear"/"log"/"sqrt"/"pow".
    */
  class InterpolatedColor ()
    extends plottableLib.buildSrcScalesMod.InterpolatedColor {
    def this(scaleType: java.lang.String) = this()
  }
  
  @js.native
  /**
    * @constructor
    */
  class Linear ()
    extends plottableLib.buildSrcScalesMod.Linear
  
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
    extends plottableLib.buildSrcScalesMod.ModifiedLog {
    def this(base: scala.Double) = this()
  }
  
  @js.native
  /**
    * A Time Scale maps Date objects to numbers.
    *
    * @constructor
    */
  class Time ()
    extends plottableLib.buildSrcScalesMod.Time
  
  def isTransformable(scale: js.Any): /* is plottable.plottable/build/src/scales.ITransformableScale */ scala.Boolean = js.native
  @js.native
  object Category extends js.Object {
    /* private */ def _convertToPlottableInnerPadding(d3InnerPadding: js.Any): js.Any = js.native
    /* private */ def _convertToPlottableOuterPadding(d3OuterPadding: js.Any, d3InnerPadding: js.Any): js.Any = js.native
  }
  
  @js.native
  object Color extends js.Object {
    var _LOOP_LIGHTEN_FACTOR: js.Any = js.native
    var _MAXIMUM_COLORS_FROM_CSS: js.Any = js.native
    var _plottableColorCache: js.Any = js.native
    /* private */ def _getPlottableColors(): js.Any = js.native
    def invalidateColorCache(): scala.Unit = js.native
  }
  
  @js.native
  object InterpolatedColor extends js.Object {
    var BLUES: js.Array[java.lang.String] = js.native
    var POSNEG: js.Array[java.lang.String] = js.native
    var REDS: js.Array[java.lang.String] = js.native
  }
  
  @JSName("TickGenerators")
  @js.native
  object TickGeneratorsNs extends js.Object {
    def integerTickGenerator(): plottableLib.buildSrcScalesTickGeneratorsMod.ITickGenerator[scala.Double] = js.native
    def intervalTickGenerator(interval: scala.Double): plottableLib.buildSrcScalesTickGeneratorsMod.ITickGenerator[scala.Double] = js.native
  }
  
  @js.native
  object Time extends js.Object {
    /**
      * Transforms the Plottable TimeInterval string into a d3 time interval equivalent.
      * If the provided TimeInterval is incorrect, the default is d3.timeYear
      */
    def timeIntervalToD3Time(timeInterval: java.lang.String, useUTC: scala.Boolean): d3DashTimeLib.d3DashTimeMod.CountableTimeInterval = js.native
  }
  
}

