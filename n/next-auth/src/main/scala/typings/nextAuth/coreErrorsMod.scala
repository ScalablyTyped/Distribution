package typings.nextAuth

import typings.nextAuth.anon.Message
import typings.nextAuth.anon.PartialEventCallbacks
import typings.nextAuth.coreLibAssertMod.ConfigError
import typings.nextAuth.utilsLoggerMod.LoggerInstance
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object coreErrorsMod {
  
  @JSImport("next-auth/core/errors", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("next-auth/core/errors", "AccountNotLinkedError")
  @js.native
  open class AccountNotLinkedError protected () extends UnknownError {
    def this(error: String) = this()
    def this(error: js.Error) = this()
  }
  
  @JSImport("next-auth/core/errors", "InvalidCallbackUrl")
  @js.native
  open class InvalidCallbackUrl protected () extends UnknownError {
    def this(error: String) = this()
    def this(error: js.Error) = this()
  }
  
  @JSImport("next-auth/core/errors", "MissingAPIRoute")
  @js.native
  open class MissingAPIRoute protected ()
    extends UnknownError
       with ConfigError {
    def this(error: String) = this()
    def this(error: js.Error) = this()
  }
  
  @JSImport("next-auth/core/errors", "MissingAdapter")
  @js.native
  open class MissingAdapter protected ()
    extends UnknownError
       with ConfigError {
    def this(error: String) = this()
    def this(error: js.Error) = this()
  }
  
  @JSImport("next-auth/core/errors", "MissingAdapterMethods")
  @js.native
  open class MissingAdapterMethods protected () extends UnknownError {
    def this(error: String) = this()
    def this(error: js.Error) = this()
  }
  
  @JSImport("next-auth/core/errors", "MissingAuthorize")
  @js.native
  open class MissingAuthorize protected ()
    extends UnknownError
       with ConfigError {
    def this(error: String) = this()
    def this(error: js.Error) = this()
  }
  
  @JSImport("next-auth/core/errors", "MissingSecret")
  @js.native
  open class MissingSecret protected ()
    extends UnknownError
       with ConfigError {
    def this(error: String) = this()
    def this(error: js.Error) = this()
  }
  
  @JSImport("next-auth/core/errors", "OAuthCallbackError")
  @js.native
  open class OAuthCallbackError protected () extends UnknownError {
    def this(error: String) = this()
    def this(error: js.Error) = this()
  }
  
  @JSImport("next-auth/core/errors", "UnknownError")
  @js.native
  open class UnknownError protected ()
    extends StObject
       with Error {
    def this(error: String) = this()
    def this(error: js.Error) = this()
    
    var code: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
    
    def toJSON(): Message = js.native
  }
  
  @JSImport("next-auth/core/errors", "UnsupportedStrategy")
  @js.native
  open class UnsupportedStrategy protected ()
    extends UnknownError
       with ConfigError {
    def this(error: String) = this()
    def this(error: js.Error) = this()
  }
  
  inline def adapterErrorHandler[TAdapter](adapter: TAdapter, logger: LoggerInstance): js.UndefOr[TAdapter] = (^.asInstanceOf[js.Dynamic].applyDynamic("adapterErrorHandler")(adapter.asInstanceOf[js.Any], logger.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[TAdapter]]
  inline def adapterErrorHandler[TAdapter](adapter: Unit, logger: LoggerInstance): js.UndefOr[TAdapter] = (^.asInstanceOf[js.Dynamic].applyDynamic("adapterErrorHandler")(adapter.asInstanceOf[js.Any], logger.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[TAdapter]]
  
  inline def capitalize(s: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("capitalize")(s.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def eventsErrorHandler(methods: PartialEventCallbacks, logger: LoggerInstance): PartialEventCallbacks = (^.asInstanceOf[js.Dynamic].applyDynamic("eventsErrorHandler")(methods.asInstanceOf[js.Any], logger.asInstanceOf[js.Any])).asInstanceOf[PartialEventCallbacks]
  
  inline def upperSnake(s: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("upperSnake")(s.asInstanceOf[js.Any]).asInstanceOf[String]
}
