package typings.nextAuth

import typings.nextAuth.anon.Provider
import typings.nextAuth.anon.ProviderId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object coreLibProvidersMod {
  
  @JSImport("next-auth/core/lib/providers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(params: ProviderId): Provider = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any]).asInstanceOf[Provider]
}
