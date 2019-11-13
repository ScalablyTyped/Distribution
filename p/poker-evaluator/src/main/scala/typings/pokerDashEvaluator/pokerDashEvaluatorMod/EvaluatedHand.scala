package typings.pokerDashEvaluator.pokerDashEvaluatorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EvaluatedHand extends js.Object {
  var handName: HandName
   // Index of HANDTYPES array
  var handRank: Double
  var handType: Double
  var value: Double
}

object EvaluatedHand {
  @scala.inline
  def apply(handName: HandName, handRank: Double, handType: Double, value: Double): EvaluatedHand = {
    val __obj = js.Dynamic.literal(handName = handName, handRank = handRank, handType = handType, value = value)
  
    __obj.asInstanceOf[EvaluatedHand]
  }
}

