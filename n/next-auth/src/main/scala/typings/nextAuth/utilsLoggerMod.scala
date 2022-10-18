package typings.nextAuth

import typings.nextAuth.anon.Dictkey
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsLoggerMod {
  
  @JSImport("next-auth/utils/logger", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("next-auth/utils/logger", JSImport.Default)
  @js.native
  val default: LoggerInstance = js.native
  
  inline def proxyLogger(): LoggerInstance = ^.asInstanceOf[js.Dynamic].applyDynamic("proxyLogger")().asInstanceOf[LoggerInstance]
  inline def proxyLogger(logger: Unit, basePath: String): LoggerInstance = (^.asInstanceOf[js.Dynamic].applyDynamic("proxyLogger")(logger.asInstanceOf[js.Any], basePath.asInstanceOf[js.Any])).asInstanceOf[LoggerInstance]
  inline def proxyLogger(logger: LoggerInstance): LoggerInstance = ^.asInstanceOf[js.Dynamic].applyDynamic("proxyLogger")(logger.asInstanceOf[js.Any]).asInstanceOf[LoggerInstance]
  inline def proxyLogger(logger: LoggerInstance, basePath: String): LoggerInstance = (^.asInstanceOf[js.Dynamic].applyDynamic("proxyLogger")(logger.asInstanceOf[js.Any], basePath.asInstanceOf[js.Any])).asInstanceOf[LoggerInstance]
  
  inline def setLogger(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setLogger")().asInstanceOf[Unit]
  inline def setLogger(newLogger: Unit, debug: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setLogger")(newLogger.asInstanceOf[js.Any], debug.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def setLogger(newLogger: Partial[LoggerInstance]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setLogger")(newLogger.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def setLogger(newLogger: Partial[LoggerInstance], debug: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setLogger")(newLogger.asInstanceOf[js.Any], debug.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in string ]: std.Function} */ @js.native
  trait LoggerInstance extends StObject {
    
    def debug(code: String, metadata: Any): Unit = js.native
    
    def error(
      code: String,
      /**
      * Either an instance of (JSON serializable) Error
      * or an object that contains some debug information.
      * (Error is still available through `metadata.error`)
      */
    metadata: js.Error
    ): Unit = js.native
    def error(
      code: String,
      /**
      * Either an instance of (JSON serializable) Error
      * or an object that contains some debug information.
      * (Error is still available through `metadata.error`)
      */
    metadata: Dictkey
    ): Unit = js.native
    
    def warn(code: WarningCode): Unit = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.nextAuth.nextAuthStrings.NEXTAUTH_URL
    - typings.nextAuth.nextAuthStrings.NO_SECRET
    - typings.nextAuth.nextAuthStrings.TWITTER_OAUTH_2_BETA
    - typings.nextAuth.nextAuthStrings.DEBUG_ENABLED
  */
  trait WarningCode extends StObject
  object WarningCode {
    
    inline def DEBUG_ENABLED: typings.nextAuth.nextAuthStrings.DEBUG_ENABLED = "DEBUG_ENABLED".asInstanceOf[typings.nextAuth.nextAuthStrings.DEBUG_ENABLED]
    
    inline def NEXTAUTH_URL: typings.nextAuth.nextAuthStrings.NEXTAUTH_URL = "NEXTAUTH_URL".asInstanceOf[typings.nextAuth.nextAuthStrings.NEXTAUTH_URL]
    
    inline def NO_SECRET: typings.nextAuth.nextAuthStrings.NO_SECRET = "NO_SECRET".asInstanceOf[typings.nextAuth.nextAuthStrings.NO_SECRET]
    
    inline def TWITTER_OAUTH_2_BETA: typings.nextAuth.nextAuthStrings.TWITTER_OAUTH_2_BETA = "TWITTER_OAUTH_2_BETA".asInstanceOf[typings.nextAuth.nextAuthStrings.TWITTER_OAUTH_2_BETA]
  }
}
