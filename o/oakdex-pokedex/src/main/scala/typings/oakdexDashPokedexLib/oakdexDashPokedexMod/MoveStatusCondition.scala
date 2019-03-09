package typings
package oakdexDashPokedexLib.oakdexDashPokedexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MoveStatusCondition extends js.Object {
  var condition: java.lang.String
  var probability: scala.Double
}

object MoveStatusCondition {
  @scala.inline
  def apply(condition: java.lang.String, probability: scala.Double): MoveStatusCondition = {
    val __obj = js.Dynamic.literal(condition = condition, probability = probability)
  
    __obj.asInstanceOf[MoveStatusCondition]
  }
}

