package typings.next.anon

import typings.next.distLibLoadCustomRoutesMod.Header
import typings.next.distLibLoadCustomRoutesMod.RouteType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RuleType extends StObject {
  
  var restrictedRedirectPaths: js.Array[String]
  
  var rule: Header
  
  var `type`: RouteType
}
object RuleType {
  
  inline def apply(restrictedRedirectPaths: js.Array[String], rule: Header, `type`: RouteType): RuleType = {
    val __obj = js.Dynamic.literal(restrictedRedirectPaths = restrictedRedirectPaths.asInstanceOf[js.Any], rule = rule.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuleType]
  }
  
  extension [Self <: RuleType](x: Self) {
    
    inline def setRestrictedRedirectPaths(value: js.Array[String]): Self = StObject.set(x, "restrictedRedirectPaths", value.asInstanceOf[js.Any])
    
    inline def setRestrictedRedirectPathsVarargs(value: String*): Self = StObject.set(x, "restrictedRedirectPaths", js.Array(value*))
    
    inline def setRule(value: Header): Self = StObject.set(x, "rule", value.asInstanceOf[js.Any])
    
    inline def setType(value: RouteType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
