package typings.pokerEvaluator.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EvaluatedHand extends js.Object {
  var handName: HandName = js.native
   // Index of HANDTYPES array
  var handRank: Double = js.native
  var handType: Double = js.native
  var value: Double = js.native
}

object EvaluatedHand {
  @scala.inline
  def apply(handName: HandName, handRank: Double, handType: Double, value: Double): EvaluatedHand = {
    val __obj = js.Dynamic.literal(handName = handName.asInstanceOf[js.Any], handRank = handRank.asInstanceOf[js.Any], handType = handType.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[EvaluatedHand]
  }
  @scala.inline
  implicit class EvaluatedHandOps[Self <: EvaluatedHand] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setHandName(value: HandName): Self = this.set("handName", value.asInstanceOf[js.Any])
    @scala.inline
    def setHandRank(value: Double): Self = this.set("handRank", value.asInstanceOf[js.Any])
    @scala.inline
    def setHandType(value: Double): Self = this.set("handType", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: Double): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}

