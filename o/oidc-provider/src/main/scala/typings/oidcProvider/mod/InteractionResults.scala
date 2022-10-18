package typings.oidcProvider.mod

import org.scalablytyped.runtime.StringDictionary
import typings.oidcProvider.anon.Amr
import typings.oidcProvider.anon.GrantId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InteractionResults
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var consent: js.UndefOr[GrantId] = js.undefined
  
  var login: js.UndefOr[Amr] = js.undefined
}
object InteractionResults {
  
  inline def apply(): InteractionResults = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InteractionResults]
  }
  
  extension [Self <: InteractionResults](x: Self) {
    
    inline def setConsent(value: GrantId): Self = StObject.set(x, "consent", value.asInstanceOf[js.Any])
    
    inline def setConsentUndefined: Self = StObject.set(x, "consent", js.undefined)
    
    inline def setLogin(value: Amr): Self = StObject.set(x, "login", value.asInstanceOf[js.Any])
    
    inline def setLoginUndefined: Self = StObject.set(x, "login", js.undefined)
  }
}
