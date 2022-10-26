package typings.next

import typings.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distClientComponentsReactDevOverlayInternalComponentsTerminalTerminalMod {
  
  @JSImport("next/dist/client/components/react-dev-overlay/internal/components/Terminal/Terminal", "Terminal")
  @js.native
  val Terminal: FC[TerminalProps] = js.native
  
  trait TerminalProps extends StObject {
    
    var content: String
  }
  object TerminalProps {
    
    inline def apply(content: String): TerminalProps = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
      __obj.asInstanceOf[TerminalProps]
    }
    
    extension [Self <: TerminalProps](x: Self) {
      
      inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    }
  }
}
