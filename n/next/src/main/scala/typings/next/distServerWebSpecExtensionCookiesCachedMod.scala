package typings.next

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distServerWebSpecExtensionCookiesCachedMod {
  
  @JSImport("next/dist/server/web/spec-extension/cookies/cached", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def cached[K, V](generate: js.Function1[/* key */ K, V]): js.Function1[/* key */ K, V] = ^.asInstanceOf[js.Dynamic].applyDynamic("cached")(generate.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* key */ K, V]]
}
