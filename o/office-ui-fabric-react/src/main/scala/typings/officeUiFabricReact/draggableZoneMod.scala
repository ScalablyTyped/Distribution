package typings.officeUiFabricReact

import typings.officeUiFabricReact.draggableZoneStylesMod.IDraggableZoneStyles
import typings.officeUiFabricReact.draggableZoneTypesMod.IDraggableZoneProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/utilities/DraggableZone", JSImport.Namespace)
@js.native
object draggableZoneMod extends js.Object {
  @js.native
  class DraggableZone protected ()
    extends typings.officeUiFabricReact.draggableZoneDraggableZoneMod.DraggableZone {
    def this(props: IDraggableZoneProps) = this()
  }
  
  def getClassNames(className: String, isDragging: Boolean): IDraggableZoneStyles = js.native
}

