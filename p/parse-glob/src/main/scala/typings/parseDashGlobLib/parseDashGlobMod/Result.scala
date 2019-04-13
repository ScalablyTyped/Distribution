package typings
package parseDashGlobLib.parseDashGlobMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Result extends js.Object {
  /**
    * The non-glob part of the string, if any.
    */
  var base: java.lang.String
  /**
    * The glob pattern part of the string, if any.
    */
  var glob: java.lang.String
  /**
    * An object with boolean information about the glob.
    */
  var is: parseDashGlobLib.Anon_Braces
  /**
    * A copy of the original, unmodified glob pattern.
    */
  var orig: java.lang.String
  /**
    * File path segments.
    */
  var path: parseDashGlobLib.Anon_Basename
}

object Result {
  @scala.inline
  def apply(
    base: java.lang.String,
    glob: java.lang.String,
    is: parseDashGlobLib.Anon_Braces,
    orig: java.lang.String,
    path: parseDashGlobLib.Anon_Basename
  ): Result = {
    val __obj = js.Dynamic.literal(base = base, glob = glob, is = is, orig = orig, path = path)
  
    __obj.asInstanceOf[Result]
  }
}

