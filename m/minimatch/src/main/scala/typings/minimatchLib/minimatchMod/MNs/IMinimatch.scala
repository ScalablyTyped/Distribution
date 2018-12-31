package typings
package minimatchLib.minimatchMod.MNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IMinimatch extends js.Object {
  /**
    * True if the pattern is a comment.
    */
  var comment: scala.Boolean = js.native
  /**
    * True if the pattern is ""
    */
  var empty: scala.Boolean = js.native
  /**
    * True if the pattern is negated.
    */
  var negate: scala.Boolean = js.native
  /**
    * The options supplied to the constructor.
    */
  var options: IOptions = js.native
  /**
    * The original pattern the minimatch object represents.
    */
  var pattern: java.lang.String = js.native
   // (RegExp | string)[][]
  /**
    * A single regular expression expressing the entire pattern.
    * Created by the makeRe method.
    */
  var regexp: stdLib.RegExp = js.native
  /**
    * A 2-dimensional array of regexp or string expressions.
    */
  var set: js.Array[js.Array[_]] = js.native
  /**
    * Deprecated. For internal use.
    *
    * @private
    */
  def braceExpand(pattern: java.lang.String, options: IOptions): scala.Unit = js.native
  /**
    * Deprecated. For internal use.
    *
    * @private
    */
  def debug(): scala.Unit = js.native
  /**
    * Deprecated. For internal use.
    *
    * @private
    */
  def make(): scala.Unit = js.native
  /**
    * Generate the regexp member if necessary, and return it.
    * Will return false if the pattern is invalid.
    */
  def makeRe(): stdLib.RegExp = js.native
   // regexp or boolean
  /**
    * Return true if the filename matches the pattern, or false otherwise.
    */
  def `match`(fname: java.lang.String): scala.Boolean = js.native
  /**
    * Take a /-split filename, and match it against a single row in the regExpSet.
    * This method is mainly for internal use, but is exposed so that it can be used
    * by a glob-walker that needs to avoid excessive filesystem calls.
    */
  def matchOne(files: js.Array[java.lang.String], pattern: js.Array[java.lang.String], partial: scala.Boolean): scala.Boolean = js.native
  /**
    * Deprecated. For internal use.
    *
    * @private
    */
  def parse(pattern: java.lang.String): scala.Unit = js.native
  def parse(pattern: java.lang.String, isSub: scala.Boolean): scala.Unit = js.native
  /**
    * Deprecated. For internal use.
    *
    * @private
    */
  def parseNegate(): scala.Unit = js.native
}

