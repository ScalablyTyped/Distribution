package typings.natural.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RuleSet extends StObject {
  
  var rules: js.Array[TransformationRule]
}
object RuleSet {
  
  inline def apply(rules: js.Array[TransformationRule]): RuleSet = {
    val __obj = js.Dynamic.literal(rules = rules.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuleSet]
  }
  
  extension [Self <: RuleSet](x: Self) {
    
    inline def setRules(value: js.Array[TransformationRule]): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
    
    inline def setRulesVarargs(value: TransformationRule*): Self = StObject.set(x, "rules", js.Array(value :_*))
  }
}
