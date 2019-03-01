package typings
package meteorLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Major extends js.Object {
  var major: java.lang.String
  var minor: java.lang.String
  var name: java.lang.String
  var patch: java.lang.String
}

object Anon_Major {
  @scala.inline
  def apply(major: java.lang.String, minor: java.lang.String, name: java.lang.String, patch: java.lang.String): Anon_Major = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("major")(major)
    __obj.updateDynamic("minor")(minor)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("patch")(patch)
    __obj.asInstanceOf[Anon_Major]
  }
}

