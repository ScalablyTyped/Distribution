package typings.next.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RestrictedRedirectPaths extends StObject {
  
  var restrictedRedirectPaths: js.Array[String]
}
object RestrictedRedirectPaths {
  
  inline def apply(restrictedRedirectPaths: js.Array[String]): RestrictedRedirectPaths = {
    val __obj = js.Dynamic.literal(restrictedRedirectPaths = restrictedRedirectPaths.asInstanceOf[js.Any])
    __obj.asInstanceOf[RestrictedRedirectPaths]
  }
  
  extension [Self <: RestrictedRedirectPaths](x: Self) {
    
    inline def setRestrictedRedirectPaths(value: js.Array[String]): Self = StObject.set(x, "restrictedRedirectPaths", value.asInstanceOf[js.Any])
    
    inline def setRestrictedRedirectPathsVarargs(value: String*): Self = StObject.set(x, "restrictedRedirectPaths", js.Array(value*))
  }
}
