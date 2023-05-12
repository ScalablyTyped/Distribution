package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathRulesetid extends StObject {
  
  var path: Rulesetid
}
object PathRulesetid {
  
  inline def apply(path: Rulesetid): PathRulesetid = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathRulesetid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathRulesetid] (val x: Self) extends AnyVal {
    
    inline def setPath(value: Rulesetid): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
