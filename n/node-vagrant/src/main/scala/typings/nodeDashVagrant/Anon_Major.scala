package typings.nodeDashVagrant

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Major extends js.Object {
  var major: Double
  var minor: Double
  var patch: Double
  var status: String
}

object Anon_Major {
  @scala.inline
  def apply(major: Double, minor: Double, patch: Double, status: String): Anon_Major = {
    val __obj = js.Dynamic.literal(major = major, minor = minor, patch = patch, status = status)
  
    __obj.asInstanceOf[Anon_Major]
  }
}

