package typings.nextReactDevOverlay

import typings.react.mod.FC
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object shadowPortalMod {
  
  @JSImport("@next/react-dev-overlay/lib/internal/components/ShadowPortal", "ShadowPortal")
  @js.native
  val ShadowPortal: FC[ShadowPortalProps] = js.native
  
  trait ShadowPortalProps extends StObject {
    
    var children: ReactNode
  }
  object ShadowPortalProps {
    
    inline def apply(): ShadowPortalProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ShadowPortalProps]
    }
    
    extension [Self <: ShadowPortalProps](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    }
  }
}
