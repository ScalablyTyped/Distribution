package typings.meteor.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Includegrantedscopes extends StObject {
  
  var include_granted_scopes: Boolean
}
object Includegrantedscopes {
  
  inline def apply(include_granted_scopes: Boolean): Includegrantedscopes = {
    val __obj = js.Dynamic.literal(include_granted_scopes = include_granted_scopes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Includegrantedscopes]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Includegrantedscopes] (val x: Self) extends AnyVal {
    
    inline def setInclude_granted_scopes(value: Boolean): Self = StObject.set(x, "include_granted_scopes", value.asInstanceOf[js.Any])
  }
}
