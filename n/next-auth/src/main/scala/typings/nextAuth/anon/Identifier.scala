package typings.nextAuth.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Identifier extends StObject {
  
  var identifier: String
  
  var token: String
}
object Identifier {
  
  inline def apply(identifier: String, token: String): Identifier = {
    val __obj = js.Dynamic.literal(identifier = identifier.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
    __obj.asInstanceOf[Identifier]
  }
  
  extension [Self <: Identifier](x: Self) {
    
    inline def setIdentifier(value: String): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
  }
}
