package typings.officeUiFabricReact

import typings.officeUiFabricReact.libUtilitiesDraggableZoneDraggableZoneDotstylesMod.IDraggableZoneStyles
import typings.officeUiFabricReact.libUtilitiesDraggableZoneDraggableZoneDottypesMod.IDraggableZoneProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilitiesDraggableZoneMod {
  
  @JSImport("office-ui-fabric-react/lib/utilities/DraggableZone", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("office-ui-fabric-react/lib/utilities/DraggableZone", "DraggableZone")
  @js.native
  open class DraggableZone protected ()
    extends typings.officeUiFabricReact.libUtilitiesDraggableZoneDraggableZoneMod.DraggableZone {
    def this(props: IDraggableZoneProps) = this()
  }
  
  inline def getClassNames(className: String, isDragging: Boolean): IDraggableZoneStyles = (^.asInstanceOf[js.Dynamic].applyDynamic("getClassNames")(className.asInstanceOf[js.Any], isDragging.asInstanceOf[js.Any])).asInstanceOf[IDraggableZoneStyles]
}
