package typings.next

import typings.react.mod.ReactNode
import typings.react.mod.ReactPortal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distClientPortalMod {
  
  @JSImport("next/dist/client/portal", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def Portal(hasChildrenType: PortalProps): ReactPortal | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("Portal")(hasChildrenType.asInstanceOf[js.Any]).asInstanceOf[ReactPortal | Null]
  
  trait PortalProps extends StObject {
    
    var children: ReactNode
    
    var `type`: String
  }
  object PortalProps {
    
    inline def apply(`type`: String): PortalProps = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[PortalProps]
    }
    
    extension [Self <: PortalProps](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
