package typings.nextReactDevOverlay.errorBoundaryMod

import typings.nextReactDevOverlay.anon.ComponentStack
import typings.nextReactDevOverlay.anon.Error
import typings.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@next/react-dev-overlay/lib/internal/ErrorBoundary", "ErrorBoundary")
@js.native
class ErrorBoundary ()
  extends Component[ErrorBoundaryProps, ErrorBoundaryState, js.Any] {
  @JSName("state")
  var state_ErrorBoundary: Error = js.native
  @JSName("componentDidCatch")
  def componentDidCatch_MErrorBoundary(error: typings.std.Error): Unit = js.native
  @JSName("componentDidCatch")
  def componentDidCatch_MErrorBoundary(error: typings.std.Error, errorInfo: ComponentStack): Unit = js.native
}

