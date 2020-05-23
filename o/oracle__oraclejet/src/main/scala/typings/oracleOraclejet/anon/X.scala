package typings.oracleOraclejet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait X extends js.Object {
  var x: Double | String
  var y: Double
  var y2: Double
}

object X {
  @scala.inline
  def apply(x: Double | String, y: Double, y2: Double): X = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], y2 = y2.asInstanceOf[js.Any])
    __obj.asInstanceOf[X]
  }
}

