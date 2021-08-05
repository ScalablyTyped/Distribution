package typings.postcss.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AtRuleRaws
  extends StObject
     with NodeRaws {
  
  var params: js.UndefOr[String] = js.undefined
}
object AtRuleRaws {
  
  inline def apply(): AtRuleRaws = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AtRuleRaws]
  }
  
  extension [Self <: AtRuleRaws](x: Self) {
    
    inline def setParams(value: String): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
  }
}
