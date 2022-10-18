package typings.nextAuth

import typings.nextAuth.coreLibCookieMod.SessionStore
import typings.nextAuth.coreMod.OutgoingResponse
import typings.nextAuth.coreTypesMod.Session
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object coreRoutesSessionMod {
  
  @JSImport("next-auth/core/routes/session", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(params: SessionParams): js.Promise[OutgoingResponse[Session | js.Object]] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[OutgoingResponse[Session | js.Object]]]
  
  trait SessionParams extends StObject {
    
    var options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify InternalOptions */ Any
    
    var sessionStore: SessionStore
  }
  object SessionParams {
    
    inline def apply(
      options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify InternalOptions */ Any,
      sessionStore: SessionStore
    ): SessionParams = {
      val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any], sessionStore = sessionStore.asInstanceOf[js.Any])
      __obj.asInstanceOf[SessionParams]
    }
    
    extension [Self <: SessionParams](x: Self) {
      
      inline def setOptions(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify InternalOptions */ Any
      ): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setSessionStore(value: SessionStore): Self = StObject.set(x, "sessionStore", value.asInstanceOf[js.Any])
    }
  }
}
