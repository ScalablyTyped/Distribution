package typings.parseDashGlob.parseDashGlobMod

import typings.parseDashGlob.Anon_Basename
import typings.parseDashGlob.Anon_Braces
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Result extends js.Object {
  /**
    * The non-glob part of the string, if any.
    */
  var base: String
  /**
    * The glob pattern part of the string, if any.
    */
  var glob: String
  /**
    * An object with boolean information about the glob.
    */
  var is: Anon_Braces
  /**
    * A copy of the original, unmodified glob pattern.
    */
  var orig: String
  /**
    * File path segments.
    */
  var path: Anon_Basename
}

object Result {
  @scala.inline
  def apply(base: String, glob: String, is: Anon_Braces, orig: String, path: Anon_Basename): Result = {
    val __obj = js.Dynamic.literal(base = base, glob = glob, is = is, orig = orig, path = path)
  
    __obj.asInstanceOf[Result]
  }
}

