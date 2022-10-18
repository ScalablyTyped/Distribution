package typings.nextAuth

import typings.nextAuth.anon.Value
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object coreLibOauthNonceHandlerMod {
  
  @JSImport("next-auth/core/lib/oauth/nonce-handler", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createNonce(
    options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify InternalOptions<'oauth'> */ Any
  ): js.Promise[js.UndefOr[Value]] = ^.asInstanceOf[js.Dynamic].applyDynamic("createNonce")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.UndefOr[Value]]]
  
  inline def useNonce(
    nonce: String,
    options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify InternalOptions<'oauth'> */ Any
  ): js.Promise[js.UndefOr[Value]] = (^.asInstanceOf[js.Dynamic].applyDynamic("useNonce")(nonce.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.UndefOr[Value]]]
  inline def useNonce(
    nonce: Unit,
    options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify InternalOptions<'oauth'> */ Any
  ): js.Promise[js.UndefOr[Value]] = (^.asInstanceOf[js.Dynamic].applyDynamic("useNonce")(nonce.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.UndefOr[Value]]]
}
