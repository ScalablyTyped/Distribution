package typings.nextAuth.anon

import typings.nextAuth.adaptersMod.AdapterUser
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Account extends StObject {
  
  var account: typings.nextAuth.coreTypesMod.Account
  
  var profile: typings.nextAuth.coreTypesMod.User | AdapterUser
  
  var user: typings.nextAuth.coreTypesMod.User | AdapterUser
}
object Account {
  
  inline def apply(
    account: typings.nextAuth.coreTypesMod.Account,
    profile: typings.nextAuth.coreTypesMod.User | AdapterUser,
    user: typings.nextAuth.coreTypesMod.User | AdapterUser
  ): Account = {
    val __obj = js.Dynamic.literal(account = account.asInstanceOf[js.Any], profile = profile.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[Account]
  }
  
  extension [Self <: Account](x: Self) {
    
    inline def setAccount(value: typings.nextAuth.coreTypesMod.Account): Self = StObject.set(x, "account", value.asInstanceOf[js.Any])
    
    inline def setProfile(value: typings.nextAuth.coreTypesMod.User | AdapterUser): Self = StObject.set(x, "profile", value.asInstanceOf[js.Any])
    
    inline def setUser(value: typings.nextAuth.coreTypesMod.User | AdapterUser): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
  }
}
