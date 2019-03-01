package typings
package atOracleOraclejetLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_X extends js.Object {
  var x: scala.Double | java.lang.String
  var y: scala.Double
  var y2: scala.Double
}

object Anon_X {
  @scala.inline
  def apply(x: scala.Double | java.lang.String, y: scala.Double, y2: scala.Double): Anon_X = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    __obj.updateDynamic("y")(y)
    __obj.updateDynamic("y2")(y2)
    __obj.asInstanceOf[Anon_X]
  }
}

