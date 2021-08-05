package typings.nextReactDevOverlay

import typings.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dialogBodyMod {
  
  @JSImport("@next/react-dev-overlay/lib/internal/components/Dialog/DialogBody", "DialogBody")
  @js.native
  val DialogBody: FC[DialogBodyProps] = js.native
  
  trait DialogBodyProps extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
  }
  object DialogBodyProps {
    
    inline def apply(): DialogBodyProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DialogBodyProps]
    }
    
    extension [Self <: DialogBodyProps](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    }
  }
}
