package typings.next

import typings.trustedTypes.mod.global.TrustedScriptURL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distClientTrustedTypesMod {
  
  @JSImport("next/dist/client/trusted-types", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def unsafeCreateTrustedScriptURL(url: String): TrustedScriptURL | String = ^.asInstanceOf[js.Dynamic].applyDynamic("__unsafeCreateTrustedScriptURL")(url.asInstanceOf[js.Any]).asInstanceOf[TrustedScriptURL | String]
}
