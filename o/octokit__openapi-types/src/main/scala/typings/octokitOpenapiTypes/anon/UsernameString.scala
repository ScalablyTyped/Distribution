package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UsernameString extends StObject {
  
  /** The handle for the GitHub user account. */
  var username: String
}
object UsernameString {
  
  inline def apply(username: String): UsernameString = {
    val __obj = js.Dynamic.literal(username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[UsernameString]
  }
  
  extension [Self <: UsernameString](x: Self) {
    
    inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
  }
}
