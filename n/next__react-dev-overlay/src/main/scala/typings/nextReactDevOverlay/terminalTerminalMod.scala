package typings.nextReactDevOverlay

import typings.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object terminalTerminalMod {
  
  @JSImport("@next/react-dev-overlay/lib/internal/components/Terminal/Terminal", "Terminal")
  @js.native
  val Terminal: FC[TerminalProps] = js.native
  
  @js.native
  trait TerminalProps extends StObject {
    
    var content: String = js.native
  }
  object TerminalProps {
    
    @scala.inline
    def apply(content: String): TerminalProps = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
      __obj.asInstanceOf[TerminalProps]
    }
    
    @scala.inline
    implicit class TerminalPropsMutableBuilder[Self <: TerminalProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    }
  }
}
