package typings.nextReactDevOverlay

import typings.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildErrorMod {
  
  @JSImport("@next/react-dev-overlay/lib/internal/container/BuildError", "BuildError")
  @js.native
  val BuildError: FC[BuildErrorProps] = js.native
  
  @JSImport("@next/react-dev-overlay/lib/internal/container/BuildError", "styles")
  @js.native
  val styles: String = js.native
  
  trait BuildErrorProps extends StObject {
    
    var message: String
  }
  object BuildErrorProps {
    
    @scala.inline
    def apply(message: String): BuildErrorProps = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
      __obj.asInstanceOf[BuildErrorProps]
    }
    
    @scala.inline
    implicit class BuildErrorPropsMutableBuilder[Self <: BuildErrorProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    }
  }
}
