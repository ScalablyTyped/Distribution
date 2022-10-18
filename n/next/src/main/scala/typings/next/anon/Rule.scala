package typings.next.anon

import typings.next.distLibLoadCustomRoutesMod.Header
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Rule extends StObject {
  
  var restrictedRedirectPaths: js.Array[String]
  
  var rule: Header
}
object Rule {
  
  inline def apply(restrictedRedirectPaths: js.Array[String], rule: Header): Rule = {
    val __obj = js.Dynamic.literal(restrictedRedirectPaths = restrictedRedirectPaths.asInstanceOf[js.Any], rule = rule.asInstanceOf[js.Any])
    __obj.asInstanceOf[Rule]
  }
  
  extension [Self <: Rule](x: Self) {
    
    inline def setRestrictedRedirectPaths(value: js.Array[String]): Self = StObject.set(x, "restrictedRedirectPaths", value.asInstanceOf[js.Any])
    
    inline def setRestrictedRedirectPathsVarargs(value: String*): Self = StObject.set(x, "restrictedRedirectPaths", js.Array(value*))
    
    inline def setRule(value: Header): Self = StObject.set(x, "rule", value.asInstanceOf[js.Any])
  }
}
