package typings.nextAuth.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IssuerString extends StObject {
  
  var issuer: String
}
object IssuerString {
  
  inline def apply(issuer: String): IssuerString = {
    val __obj = js.Dynamic.literal(issuer = issuer.asInstanceOf[js.Any])
    __obj.asInstanceOf[IssuerString]
  }
  
  extension [Self <: IssuerString](x: Self) {
    
    inline def setIssuer(value: String): Self = StObject.set(x, "issuer", value.asInstanceOf[js.Any])
  }
}
