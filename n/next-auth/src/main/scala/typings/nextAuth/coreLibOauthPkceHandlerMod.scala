package typings.nextAuth

import typings.nextAuth.anon.CodeVerifier
import typings.nextAuth.anon.Codechallenge
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object coreLibOauthPkceHandlerMod {
  
  @JSImport("next-auth/core/lib/oauth/pkce-handler", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createPKCE(
    options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify InternalOptions<'oauth'> */ Any
  ): js.Promise[js.UndefOr[Codechallenge]] = ^.asInstanceOf[js.Dynamic].applyDynamic("createPKCE")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.UndefOr[Codechallenge]]]
  
  inline def usePKCECodeVerifier(
    codeVerifier: String,
    options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify InternalOptions<'oauth'> */ Any
  ): js.Promise[js.UndefOr[CodeVerifier]] = (^.asInstanceOf[js.Dynamic].applyDynamic("usePKCECodeVerifier")(codeVerifier.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.UndefOr[CodeVerifier]]]
  inline def usePKCECodeVerifier(
    codeVerifier: Unit,
    options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify InternalOptions<'oauth'> */ Any
  ): js.Promise[js.UndefOr[CodeVerifier]] = (^.asInstanceOf[js.Dynamic].applyDynamic("usePKCECodeVerifier")(codeVerifier.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.UndefOr[CodeVerifier]]]
}
