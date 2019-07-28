package typings.oakdexDashPokedex.oakdexDashPokedexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MoveStatusCondition extends js.Object {
  var condition: String
  var probability: Double
}

object MoveStatusCondition {
  @scala.inline
  def apply(condition: String, probability: Double): MoveStatusCondition = {
    val __obj = js.Dynamic.literal(condition = condition, probability = probability)
  
    __obj.asInstanceOf[MoveStatusCondition]
  }
}

