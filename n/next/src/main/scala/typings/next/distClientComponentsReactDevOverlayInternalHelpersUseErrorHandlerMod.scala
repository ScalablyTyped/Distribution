package typings.next

import typings.std.ErrorEvent
import typings.std.PromiseRejectionEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distClientComponentsReactDevOverlayInternalHelpersUseErrorHandlerMod {
  
  @JSImport("next/dist/client/components/react-dev-overlay/internal/helpers/use-error-handler", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useErrorHandler(
    handleOnUnhandledError: js.Function1[/* event */ ErrorEvent, Unit],
    handleOnUnhandledRejection: js.Function1[/* event */ PromiseRejectionEvent, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useErrorHandler")(handleOnUnhandledError.asInstanceOf[js.Any], handleOnUnhandledRejection.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
