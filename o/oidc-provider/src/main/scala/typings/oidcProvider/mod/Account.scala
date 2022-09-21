package typings.oidcProvider.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Account
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var accountId: String
  
  def claims(
    use: String,
    scope: String,
    claims: StringDictionary[Null | ClaimsParameterMember],
    rejected: js.Array[String]
  ): CanBePromise[AccountClaims]
}
object Account {
  
  inline def apply(
    accountId: String,
    claims: (String, String, StringDictionary[Null | ClaimsParameterMember], js.Array[String]) => CanBePromise[AccountClaims]
  ): Account = {
    val __obj = js.Dynamic.literal(accountId = accountId.asInstanceOf[js.Any], claims = js.Any.fromFunction4(claims))
    __obj.asInstanceOf[Account]
  }
  
  extension [Self <: Account](x: Self) {
    
    inline def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    inline def setClaims(
      value: (String, String, StringDictionary[Null | ClaimsParameterMember], js.Array[String]) => CanBePromise[AccountClaims]
    ): Self = StObject.set(x, "claims", js.Any.fromFunction4(value))
  }
}
