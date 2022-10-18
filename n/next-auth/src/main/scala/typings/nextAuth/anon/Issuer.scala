package typings.nextAuth.anon

import typings.nextAuth.providersBattlenetMod.BattleNetIssuer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Issuer extends StObject {
  
  var issuer: BattleNetIssuer
}
object Issuer {
  
  inline def apply(issuer: BattleNetIssuer): Issuer = {
    val __obj = js.Dynamic.literal(issuer = issuer.asInstanceOf[js.Any])
    __obj.asInstanceOf[Issuer]
  }
  
  extension [Self <: Issuer](x: Self) {
    
    inline def setIssuer(value: BattleNetIssuer): Self = StObject.set(x, "issuer", value.asInstanceOf[js.Any])
  }
}
