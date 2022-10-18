package typings.nextAuth

import typings.nextAuth.anon.CookieValue
import typings.nextAuth.anon.Value
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object coreLibOauthStateHandlerMod {
  
  @JSImport("next-auth/core/lib/oauth/state-handler", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createState(
    options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify InternalOptions<'oauth'> */ Any
  ): js.Promise[js.UndefOr[CookieValue]] = ^.asInstanceOf[js.Dynamic].applyDynamic("createState")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.UndefOr[CookieValue]]]
  
  inline def useState(
    state: String,
    options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify InternalOptions<'oauth'> */ Any
  ): js.Promise[js.UndefOr[Value]] = (^.asInstanceOf[js.Dynamic].applyDynamic("useState")(state.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.UndefOr[Value]]]
  inline def useState(
    state: Unit,
    options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify InternalOptions<'oauth'> */ Any
  ): js.Promise[js.UndefOr[Value]] = (^.asInstanceOf[js.Dynamic].applyDynamic("useState")(state.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.UndefOr[Value]]]
}
