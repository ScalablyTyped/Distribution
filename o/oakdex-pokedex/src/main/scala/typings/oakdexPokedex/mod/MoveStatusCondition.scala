package typings.oakdexPokedex.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MoveStatusCondition extends StObject {
  
  var condition: String
  
  var probability: Double
}
object MoveStatusCondition {
  
  @scala.inline
  def apply(condition: String, probability: Double): MoveStatusCondition = {
    val __obj = js.Dynamic.literal(condition = condition.asInstanceOf[js.Any], probability = probability.asInstanceOf[js.Any])
    __obj.asInstanceOf[MoveStatusCondition]
  }
  
  @scala.inline
  implicit class MoveStatusConditionMutableBuilder[Self <: MoveStatusCondition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCondition(value: String): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProbability(value: Double): Self = StObject.set(x, "probability", value.asInstanceOf[js.Any])
  }
}
