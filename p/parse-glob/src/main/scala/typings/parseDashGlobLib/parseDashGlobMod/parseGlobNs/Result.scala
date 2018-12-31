package typings
package parseDashGlobLib.parseDashGlobMod.parseGlobNs

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
  var is: parseDashGlobLib.Anon_Dotfile
  /**
    * A copy of the original, unmodified glob pattern.
    */
  var orig: java.lang.String
  /**
    * File path segments.
    */
  var path: parseDashGlobLib.Anon_Dirname
}

