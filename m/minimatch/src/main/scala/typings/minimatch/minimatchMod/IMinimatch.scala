package typings.minimatch.minimatchMod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IMinimatch extends js.Object {
  /**
    * True if the pattern is a comment.
    */
  var comment: Boolean = js.native
  /**
    * True if the pattern is ""
    */
  var empty: Boolean = js.native
  /**
    * True if the pattern is negated.
    */
  var negate: Boolean = js.native
  /**
    * The options supplied to the constructor.
    */
  var options: IOptions = js.native
  /**
    * The original pattern the minimatch object represents.
    */
  var pattern: String = js.native
   // (RegExp | string)[][]
  /**
    * A single regular expression expressing the entire pattern.
    * Created by the makeRe method.
    */
  var regexp: RegExp = js.native
  /**
    * A 2-dimensional array of regexp or string expressions.
    */
  var set: js.Array[js.Array[_]] = js.native
  /**
    * Deprecated. For internal use.
    *
    * @private
    */
  def braceExpand(pattern: String, options: IOptions): Unit = js.native
  /**
    * Deprecated. For internal use.
    *
    * @private
    */
  def debug(): Unit = js.native
  /**
    * Deprecated. For internal use.
    *
    * @private
    */
  def make(): Unit = js.native
  /**
    * Generate the regexp member if necessary, and return it.
    * Will return false if the pattern is invalid.
    */
  def makeRe(): RegExp = js.native
   // regexp or boolean
  /**
    * Return true if the filename matches the pattern, or false otherwise.
    */
  def `match`(fname: String): Boolean = js.native
  /**
    * Take a /-split filename, and match it against a single row in the regExpSet.
    * This method is mainly for internal use, but is exposed so that it can be used
    * by a glob-walker that needs to avoid excessive filesystem calls.
    */
  def matchOne(files: js.Array[String], pattern: js.Array[String], partial: Boolean): Boolean = js.native
  /**
    * Deprecated. For internal use.
    *
    * @private
    */
  def parse(pattern: String): Unit = js.native
  def parse(pattern: String, isSub: Boolean): Unit = js.native
  /**
    * Deprecated. For internal use.
    *
    * @private
    */
  def parseNegate(): Unit = js.native
}

