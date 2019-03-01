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
    toString: js.Function0[java.lang.String]
  ): Anon_Major = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("major")(major)
    __obj.updateDynamic("minor")(minor)
    __obj.updateDynamic("preRelease")(preRelease)
    __obj.updateDynamic("revision")(revision)
    __obj.updateDynamic("toString")(toString)
    __obj.asInstanceOf[Anon_Major]
  }
}

