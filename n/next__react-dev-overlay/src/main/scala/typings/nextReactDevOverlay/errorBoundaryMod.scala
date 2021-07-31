package typings.nextReactDevOverlay

import typings.nextReactDevOverlay.anon.ComponentStack
import typings.react.mod.PureComponent
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object errorBoundaryMod {
  
  @JSImport("@next/react-dev-overlay/lib/internal/ErrorBoundary", "ErrorBoundary")
  @js.native
  class ErrorBoundary protected ()
    extends PureComponent[ErrorBoundaryProps, ErrorBoundaryState, js.Any] {
    def this(props: ErrorBoundaryProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: ErrorBoundaryProps, context: js.Any) = this()
    
    @JSName("componentDidCatch")
    def componentDidCatch_MErrorBoundary(error: Error): Unit = js.native
    @JSName("componentDidCatch")
    def componentDidCatch_MErrorBoundary(error: Error, errorInfo: ComponentStack): Unit = js.native
    
    @JSName("state")
    var state_ErrorBoundary: typings.nextReactDevOverlay.anon.Error = js.native
  }
  
  @js.native
  trait ErrorBoundaryProps extends StObject {
    
    def onError(error: Error): Unit = js.native
    def onError(error: Error, componentStack: String): Unit = js.native
  }
  
  trait ErrorBoundaryState extends StObject {
    
    var error: Error | Null
  }
  object ErrorBoundaryState {
    
    @scala.inline
    def apply(): ErrorBoundaryState = {
      val __obj = js.Dynamic.literal(error = null)
      __obj.asInstanceOf[ErrorBoundaryState]
    }
    
    @scala.inline
    implicit class ErrorBoundaryStateMutableBuilder[Self <: ErrorBoundaryState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setError(value: Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorNull: Self = StObject.set(x, "error", null)
    }
  }
}
