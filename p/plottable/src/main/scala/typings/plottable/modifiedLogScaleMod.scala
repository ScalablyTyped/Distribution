package typings.plottable

import typings.plottable.quantitativeScaleMod.QuantitativeScale
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object modifiedLogScaleMod {
  
  @JSImport("plottable/build/src/scales/modifiedLogScale", "ModifiedLog")
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
  open class ModifiedLog () extends QuantitativeScale[Double] {
    def this(base: Double) = this()
    
    /**
      * Returns an adjusted log10 value for graphing purposes.  The first
      * adjustment is that negative values are changed to positive during
      * the calculations, and then the answer is negated at the end.  The
      * second is that, for values less than 10, an increasingly large
      * (0 to 1) scaling factor is added such that at 0 the value is
      * adjusted to 1, resulting in a returned result of 0.
      */
    /* private */ var _adjustedLog: Any = js.native
    
    /* private */ var _base: Any = js.native
    
    /* private */ var _d3Scale: Any = js.native
    
    /**
      * How many ticks does the range [lower, upper] deserve?
      *
      * e.g. if your domain was [10, 1000] and I asked _howManyTicks(10, 100),
      * I would get 1/2 of the ticks. The range 10, 100 takes up 1/2 of the
      * distance when plotted.
      */
    /* private */ var _howManyTicks: Any = js.native
    
    /* private */ var _invertedAdjustedLog: Any = js.native
    
    /* private */ var _logTickGenerator: Any = js.native
    
    /**
      * Return an appropriate number of ticks from lower to upper.
      *
      * This will first try to fit as many powers of this.base as it can from
      * lower to upper.
      *
      * If it still has ticks after that, it will generate ticks in "clusters",
      * e.g. [20, 30, ... 90, 100] would be a cluster, [200, 300, ... 900, 1000]
      * would be another cluster.
      *
      * This function will generate clusters as large as it can while not
      * drastically exceeding its number of ticks.
      */
    /* private */ var _logTicks: Any = js.native
    
    /* private */ var _pivot: Any = js.native
    
    /* private */ var _untransformedDomain: Any = js.native
  }
}
