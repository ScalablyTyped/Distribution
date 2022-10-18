package typings.onfidoActiveVideoCapture

import typings.preact.mod.ComponentChild
import typings.preact.mod.ComponentChildren
import typings.preact.mod.FunctionComponent
import typings.std.MouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distComponentsButtonMod {
  
  @JSImport("@onfido/active-video-capture/dist/components/Button", "Button")
  @js.native
  val Button: FunctionComponent[Props] = js.native
  
  trait Props extends StObject {
    
    var children: js.UndefOr[ComponentChildren] = js.undefined
    
    def onClick(event: MouseEvent): Unit
  }
  object Props {
    
    inline def apply(onClick: MouseEvent => Unit): Props = {
      val __obj = js.Dynamic.literal(onClick = js.Any.fromFunction1(onClick))
      __obj.asInstanceOf[Props]
    }
    
    extension [Self <: Props](x: Self) {
      
      inline def setChildren(value: ComponentChildren): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: ComponentChild*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setOnClick(value: MouseEvent => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
    }
  }
}
