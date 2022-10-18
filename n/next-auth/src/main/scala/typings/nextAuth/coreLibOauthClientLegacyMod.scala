package typings.nextAuth

import typings.oauth.mod.OAuth
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object coreLibOauthClientLegacyMod {
  
  @JSImport("next-auth/core/lib/oauth/client-legacy", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def oAuth1Client(
    options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify InternalOptions<'oauth'> */ Any
  ): OAuth = ^.asInstanceOf[js.Dynamic].applyDynamic("oAuth1Client")(options.asInstanceOf[js.Any]).asInstanceOf[OAuth]
}
