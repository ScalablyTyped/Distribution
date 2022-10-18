package typings.nextAuth

import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object providersFoursquareMod {
  
  @JSImport("next-auth/providers/foursquare", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(
    options: Partial[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_providers.OAuthConfig<any> */ Any
    ]
  ): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any]).asInstanceOf[Any]
}
