package typings.officeDashUiDashFabricDashReact

import typings.officeDashUiDashFabricDashReact.libUtilitiesDraggableZoneDraggableZoneDotStylesMod.IDraggableZoneStyles
import typings.officeDashUiDashFabricDashReact.libUtilitiesDraggableZoneDraggableZoneDotTypesMod.IDraggableZoneProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/utilities/DraggableZone", JSImport.Namespace)
@js.native
object libUtilitiesDraggableZoneMod extends js.Object {
  @js.native
  class DraggableZone protected ()
    extends typings.officeDashUiDashFabricDashReact.libUtilitiesDraggableZoneDraggableZoneMod.DraggableZone {
    def this(props: IDraggableZoneProps) = this()
  }
  
  def getClassNames(className: String, isDragging: Boolean): IDraggableZoneStyles = js.native
}

