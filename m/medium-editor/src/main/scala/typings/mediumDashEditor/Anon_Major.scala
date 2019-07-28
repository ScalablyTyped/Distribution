package typings.mediumDashEditor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Major extends js.Object {
  var major: Double
  var minor: Double
  var preRelease: String
  var revision: Double
}

object Anon_Major {
  @scala.inline
  def apply(major: Double, minor: Double, preRelease: String, revision: Double, toString: () => String): Anon_Major = {
    val __obj = js.Dynamic.literal(major = major, minor = minor, preRelease = preRelease, revision = revision, toString = js.Any.fromFunction0(toString))
  
    __obj.asInstanceOf[Anon_Major]
  }
}

