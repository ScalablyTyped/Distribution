package typings
package mediumDashEditorLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Major extends js.Object {
  var major: scala.Double
  var minor: scala.Double
  var preRelease: java.lang.String
  var revision: scala.Double
}

object Anon_Major {
  @scala.inline
  def apply(
    major: scala.Double,
    minor: scala.Double,
    preRelease: java.lang.String,
    revision: scala.Double,
    toString: () => java.lang.String
  ): Anon_Major = {
    val __obj = js.Dynamic.literal(major = major, minor = minor, preRelease = preRelease, revision = revision, toString = js.Any.fromFunction0(toString))
  
    __obj.asInstanceOf[Anon_Major]
  }
}

