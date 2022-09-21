package typings.oidcProvider.anon

import typings.oidcProvider.mod.Account
import typings.oidcProvider.mod.AuthorizationCode
import typings.oidcProvider.mod.BackchannelAuthenticationRequest
import typings.oidcProvider.mod.CanBePromise
import typings.oidcProvider.mod.DeviceCode
import typings.oidcProvider.mod.KoaContextWithOIDC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FindAccount extends StObject {
  
  def findAccount(ctx: KoaContextWithOIDC, sub: String): CanBePromise[js.UndefOr[Account]]
  def findAccount(ctx: KoaContextWithOIDC, sub: String, token: typings.oidcProvider.mod.AccessToken): CanBePromise[js.UndefOr[Account]]
  def findAccount(ctx: KoaContextWithOIDC, sub: String, token: AuthorizationCode): CanBePromise[js.UndefOr[Account]]
  def findAccount(ctx: KoaContextWithOIDC, sub: String, token: BackchannelAuthenticationRequest): CanBePromise[js.UndefOr[Account]]
  def findAccount(ctx: KoaContextWithOIDC, sub: String, token: DeviceCode): CanBePromise[js.UndefOr[Account]]
  @JSName("findAccount")
  var findAccount_Original: typings.oidcProvider.mod.FindAccount
}
object FindAccount {
  
  inline def apply(
    findAccount: (/* ctx */ KoaContextWithOIDC, /* sub */ String, /* token */ js.UndefOr[
      AuthorizationCode | typings.oidcProvider.mod.AccessToken | DeviceCode | BackchannelAuthenticationRequest
    ]) => CanBePromise[js.UndefOr[Account]]
  ): FindAccount = {
    val __obj = js.Dynamic.literal(findAccount = js.Any.fromFunction3(findAccount))
    __obj.asInstanceOf[FindAccount]
  }
  
  extension [Self <: FindAccount](x: Self) {
    
    inline def setFindAccount(
      value: (/* ctx */ KoaContextWithOIDC, /* sub */ String, /* token */ js.UndefOr[
          AuthorizationCode | typings.oidcProvider.mod.AccessToken | DeviceCode | BackchannelAuthenticationRequest
        ]) => CanBePromise[js.UndefOr[Account]]
    ): Self = StObject.set(x, "findAccount", js.Any.fromFunction3(value))
  }
}
