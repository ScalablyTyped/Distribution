package typings.officeUiFabricReact

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object draggableZoneStylesMod {
  
  @JSImport("office-ui-fabric-react/lib/utilities/DraggableZone/DraggableZone.styles", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getClassNames(className: String, isDragging: Boolean): IDraggableZoneStyles = (^.asInstanceOf[js.Dynamic].applyDynamic("getClassNames")(className.asInstanceOf[js.Any], isDragging.asInstanceOf[js.Any])).asInstanceOf[IDraggableZoneStyles]
  
  trait IDraggableZoneStyles extends StObject {
    
    var root: String
  }
  object IDraggableZoneStyles {
    
    @scala.inline
    def apply(root: String): IDraggableZoneStyles = {
      val __obj = js.Dynamic.literal(root = root.asInstanceOf[js.Any])
      __obj.asInstanceOf[IDraggableZoneStyles]
    }
    
    @scala.inline
    implicit class IDraggableZoneStylesMutableBuilder[Self <: IDraggableZoneStyles] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    }
  }
}
