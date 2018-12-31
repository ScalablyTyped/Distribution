package typings
package plottableLib.buildSrcScalesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("plottable/build/src/scales", "ModifiedLog")
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
  extends plottableLib.buildSrcScalesModifiedLogScaleMod.ModifiedLog {
  def this(base: scala.Double) = this()
}

