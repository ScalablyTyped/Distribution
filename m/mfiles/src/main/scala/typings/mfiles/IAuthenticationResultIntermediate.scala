package typings.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IAuthenticationResultIntermediate extends StObject {
  
  val AttemptIdentifier: String
  
  val AuthenticationData: INamedValues
}
object IAuthenticationResultIntermediate {
  
  inline def apply(AttemptIdentifier: String, AuthenticationData: INamedValues): IAuthenticationResultIntermediate = {
    val __obj = js.Dynamic.literal(AttemptIdentifier = AttemptIdentifier.asInstanceOf[js.Any], AuthenticationData = AuthenticationData.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAuthenticationResultIntermediate]
  }
  
  extension [Self <: IAuthenticationResultIntermediate](x: Self) {
    
    inline def setAttemptIdentifier(value: String): Self = StObject.set(x, "AttemptIdentifier", value.asInstanceOf[js.Any])
    
    inline def setAuthenticationData(value: INamedValues): Self = StObject.set(x, "AuthenticationData", value.asInstanceOf[js.Any])
  }
}
