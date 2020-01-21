package typings.parseGlob.mod

import typings.parseGlob.AnonBasename
import typings.parseGlob.AnonBraces
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
  var is: AnonBraces
  /**
    * A copy of the original, unmodified glob pattern.
    */
  var orig: String
  /**
    * File path segments.
    */
  var path: AnonBasename
}

object Result {
  @scala.inline
  def apply(base: String, glob: String, is: AnonBraces, orig: String, path: AnonBasename): Result = {
    val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any], glob = glob.asInstanceOf[js.Any], is = is.asInstanceOf[js.Any], orig = orig.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Result]
  }
}

