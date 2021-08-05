package typings.nextReactDevOverlay

import typings.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dialogContentMod {
  
  @JSImport("@next/react-dev-overlay/lib/internal/components/Dialog/DialogContent", "DialogContent")
  @js.native
  val DialogContent: FC[DialogContentProps] = js.native
  
  trait DialogContentProps extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
  }
  object DialogContentProps {
    
    inline def apply(): DialogContentProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DialogContentProps]
    }
    
    extension [Self <: DialogContentProps](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    }
  }
}
