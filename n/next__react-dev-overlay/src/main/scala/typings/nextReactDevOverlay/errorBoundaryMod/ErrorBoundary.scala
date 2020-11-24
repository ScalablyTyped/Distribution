package typings.nextReactDevOverlay.errorBoundaryMod

import typings.nextReactDevOverlay.anon.ComponentStack
import typings.react.mod.Component
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@next/react-dev-overlay/lib/internal/ErrorBoundary", "ErrorBoundary")
@js.native
class ErrorBoundary ()
  extends Component[ErrorBoundaryProps, ErrorBoundaryState, js.Any] {
  
  @JSName("componentDidCatch")
  def componentDidCatch_MErrorBoundary(error: Error): Unit = js.native
  @JSName("componentDidCatch")
  def componentDidCatch_MErrorBoundary(error: Error, errorInfo: ComponentStack): Unit = js.native
  
  @JSName("state")
  var state_ErrorBoundary: typings.nextReactDevOverlay.anon.Error = js.native
}
