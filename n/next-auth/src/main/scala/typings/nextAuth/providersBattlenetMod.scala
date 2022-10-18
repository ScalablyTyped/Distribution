package typings.nextAuth

import typings.nextAuth.anon.Issuer
import typings.nextAuth.nextAuthStrings.httpsColonSlashSlashwwwDotbattlenetDotcomDotcnSlashoauth
import typings.nextAuth.providersOauthMod.OAuthConfig
import typings.nextAuth.providersOauthMod.OAuthUserConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object providersBattlenetMod {
  
  @JSImport("next-auth/providers/battlenet", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[P /* <: BattleNetProfile */](options: OAuthUserConfig[P] & Issuer): OAuthConfig[P] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any]).asInstanceOf[OAuthConfig[P]]
  
  type BattleNetIssuer = httpsColonSlashSlashwwwDotbattlenetDotcomDotcnSlashoauth | (/* template literal string: https://${us|eu|kr|tw}.battle.net/oauth */ String)
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in string ]: any} */ trait BattleNetProfile extends StObject {
    
    var battle_tag: String
    
    var sub: String
  }
  object BattleNetProfile {
    
    inline def apply(battle_tag: String, sub: String): BattleNetProfile = {
      val __obj = js.Dynamic.literal(battle_tag = battle_tag.asInstanceOf[js.Any], sub = sub.asInstanceOf[js.Any])
      __obj.asInstanceOf[BattleNetProfile]
    }
    
    extension [Self <: BattleNetProfile](x: Self) {
      
      inline def setBattle_tag(value: String): Self = StObject.set(x, "battle_tag", value.asInstanceOf[js.Any])
      
      inline def setSub(value: String): Self = StObject.set(x, "sub", value.asInstanceOf[js.Any])
    }
  }
}
