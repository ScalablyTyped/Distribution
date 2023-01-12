package typings.oidcProvider.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccountClaims
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var sub: String
}
object AccountClaims {
  
  inline def apply(sub: String): AccountClaims = {
    val __obj = js.Dynamic.literal(sub = sub.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccountClaims]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AccountClaims] (val x: Self) extends AnyVal {
    
    inline def setSub(value: String): Self = StObject.set(x, "sub", value.asInstanceOf[js.Any])
  }
}
