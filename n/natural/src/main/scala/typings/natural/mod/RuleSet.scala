package typings.natural.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RuleSet extends StObject {
  
  var rules: js.Array[TransformationRule] = js.native
}
object RuleSet {
  
  @scala.inline
  def apply(rules: js.Array[TransformationRule]): RuleSet = {
    val __obj = js.Dynamic.literal(rules = rules.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuleSet]
  }
  
  @scala.inline
  implicit class RuleSetMutableBuilder[Self <: RuleSet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRules(value: js.Array[TransformationRule]): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRulesVarargs(value: TransformationRule*): Self = StObject.set(x, "rules", js.Array(value :_*))
  }
}
