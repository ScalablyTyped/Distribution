package typings.paper

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Roots extends js.Object {
  var roots: js.Array[Double]
  var `type`: String
}

object Anon_Roots {
  @scala.inline
  def apply(roots: js.Array[Double], `type`: String): Anon_Roots = {
    val __obj = js.Dynamic.literal(roots = roots)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_Roots]
  }
}

