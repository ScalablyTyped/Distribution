package typings.next.anon

import typings.next.distLibLoadCustomRoutesMod.Rewrite
import typings.next.distLibLoadCustomRoutesMod.RouteType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RestrictedRedirectPathsRuleType extends StObject {
  
  var restrictedRedirectPaths: js.Array[String]
  
  var rule: Rewrite
  
  var `type`: RouteType
}
object RestrictedRedirectPathsRuleType {
  
  inline def apply(restrictedRedirectPaths: js.Array[String], rule: Rewrite, `type`: RouteType): RestrictedRedirectPathsRuleType = {
    val __obj = js.Dynamic.literal(restrictedRedirectPaths = restrictedRedirectPaths.asInstanceOf[js.Any], rule = rule.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RestrictedRedirectPathsRuleType]
  }
  
  extension [Self <: RestrictedRedirectPathsRuleType](x: Self) {
    
    inline def setRestrictedRedirectPaths(value: js.Array[String]): Self = StObject.set(x, "restrictedRedirectPaths", value.asInstanceOf[js.Any])
    
    inline def setRestrictedRedirectPathsVarargs(value: String*): Self = StObject.set(x, "restrictedRedirectPaths", js.Array(value*))
    
    inline def setRule(value: Rewrite): Self = StObject.set(x, "rule", value.asInstanceOf[js.Any])
    
    inline def setType(value: RouteType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
