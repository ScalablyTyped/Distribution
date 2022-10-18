package typings.nextAuth

import typings.openidClient.mod.Client
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object coreLibOauthClientMod {
  
  @JSImport("next-auth/core/lib/oauth/client", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def openidClient(
    options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify InternalOptions<'oauth'> */ Any
  ): js.Promise[Client] = ^.asInstanceOf[js.Dynamic].applyDynamic("openidClient")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Client]]
}
