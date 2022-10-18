package typings.next.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RestrictedRedirectPathsRule extends StObject {
  
  var restrictedRedirectPaths: js.Array[String]
  
  var rule: typings.next.distLibLoadCustomRoutesMod.Redirect
}
object RestrictedRedirectPathsRule {
  
  inline def apply(restrictedRedirectPaths: js.Array[String], rule: typings.next.distLibLoadCustomRoutesMod.Redirect): RestrictedRedirectPathsRule = {
    val __obj = js.Dynamic.literal(restrictedRedirectPaths = restrictedRedirectPaths.asInstanceOf[js.Any], rule = rule.asInstanceOf[js.Any])
    __obj.asInstanceOf[RestrictedRedirectPathsRule]
  }
  
  extension [Self <: RestrictedRedirectPathsRule](x: Self) {
    
    inline def setRestrictedRedirectPaths(value: js.Array[String]): Self = StObject.set(x, "restrictedRedirectPaths", value.asInstanceOf[js.Any])
    
    inline def setRestrictedRedirectPathsVarargs(value: String*): Self = StObject.set(x, "restrictedRedirectPaths", js.Array(value*))
    
    inline def setRule(value: typings.next.distLibLoadCustomRoutesMod.Redirect): Self = StObject.set(x, "rule", value.asInstanceOf[js.Any])
  }
}
