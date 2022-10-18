package typings.nextAuth.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SessionStore extends StObject {
  
  var options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify InternalOptions */ Any
  
  var sessionStore: typings.nextAuth.coreLibCookieMod.SessionStore
}
object SessionStore {
  
  inline def apply(
    options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify InternalOptions */ Any,
    sessionStore: typings.nextAuth.coreLibCookieMod.SessionStore
  ): SessionStore = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any], sessionStore = sessionStore.asInstanceOf[js.Any])
    __obj.asInstanceOf[SessionStore]
  }
  
  extension [Self <: SessionStore](x: Self) {
    
    inline def setOptions(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify InternalOptions */ Any
    ): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setSessionStore(value: typings.nextAuth.coreLibCookieMod.SessionStore): Self = StObject.set(x, "sessionStore", value.asInstanceOf[js.Any])
  }
}
