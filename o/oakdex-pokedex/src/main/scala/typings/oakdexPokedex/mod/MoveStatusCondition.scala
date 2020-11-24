package typings.oakdexPokedex.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MoveStatusCondition extends js.Object {
  
  var condition: String = js.native
  
  var probability: Double = js.native
}
object MoveStatusCondition {
  
  @scala.inline
  def apply(condition: String, probability: Double): MoveStatusCondition = {
    val __obj = js.Dynamic.literal(condition = condition.asInstanceOf[js.Any], probability = probability.asInstanceOf[js.Any])
    __obj.asInstanceOf[MoveStatusCondition]
  }
  
  @scala.inline
  implicit class MoveStatusConditionOps[Self <: MoveStatusCondition] (val x: Self) extends AnyVal {
    
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
    def setCondition(value: String): Self = this.set("condition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProbability(value: Double): Self = this.set("probability", value.asInstanceOf[js.Any])
  }
}
