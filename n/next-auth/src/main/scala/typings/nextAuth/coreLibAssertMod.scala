package typings.nextAuth

import typings.nextAuth.anon.Options
import typings.nextAuth.utilsLoggerMod.WarningCode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object coreLibAssertMod {
  
  @JSImport("next-auth/core/lib/assert", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def assertConfig(params: Options): ConfigError | js.Array[WarningCode] = ^.asInstanceOf[js.Dynamic].applyDynamic("assertConfig")(params.asInstanceOf[js.Any]).asInstanceOf[ConfigError | js.Array[WarningCode]]
  
  /* Rewritten from type alias, can be one of: 
    - typings.nextAuth.coreErrorsMod.MissingAPIRoute
    - typings.nextAuth.coreErrorsMod.MissingSecret
    - typings.nextAuth.coreErrorsMod.UnsupportedStrategy
    - typings.nextAuth.coreErrorsMod.MissingAuthorize
    - typings.nextAuth.coreErrorsMod.MissingAdapter
  */
  trait ConfigError extends StObject
}
