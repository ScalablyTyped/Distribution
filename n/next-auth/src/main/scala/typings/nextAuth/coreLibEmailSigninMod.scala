package typings.nextAuth

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object coreLibEmailSigninMod {
  
  @JSImport("next-auth/core/lib/email/signin", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(
    identifier: String,
    options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify InternalOptions<'email'> */ Any
  ): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(identifier.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
}
