package typings
package physijsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Friction extends js.Object {
  var friction: scala.Double
  var id: scala.Double
  var restriction: scala.Double
}

object Anon_Friction {
  @scala.inline
  def apply(friction: scala.Double, id: scala.Double, restriction: scala.Double): Anon_Friction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("friction")(friction)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("restriction")(restriction)
    __obj.asInstanceOf[Anon_Friction]
  }
}

