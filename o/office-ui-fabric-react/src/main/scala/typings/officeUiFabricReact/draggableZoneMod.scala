package typings.officeUiFabricReact

import typings.officeUiFabricReact.draggableZoneStylesMod.IDraggableZoneStyles
import typings.officeUiFabricReact.draggableZoneTypesMod.IDraggableZoneProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("office-ui-fabric-react/lib/utilities/DraggableZone", JSImport.Namespace)
@js.native
object draggableZoneMod extends js.Object {
  
  def getClassNames(className: String, isDragging: Boolean): IDraggableZoneStyles = js.native
  
  @js.native
  class DraggableZone protected ()
    extends typings.officeUiFabricReact.draggableZoneDraggableZoneMod.DraggableZone {
    def this(props: IDraggableZoneProps) = this()
  }
}
