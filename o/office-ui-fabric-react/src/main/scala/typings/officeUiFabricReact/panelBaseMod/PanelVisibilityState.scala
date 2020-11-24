package typings.officeUiFabricReact.panelBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PanelVisibilityState extends js.Object
@JSImport("office-ui-fabric-react/lib/components/Panel/Panel.base", "PanelVisibilityState")
@js.native
object PanelVisibilityState extends js.Object {
  
  @js.native
  sealed trait animatingClosed extends PanelVisibilityState
  
  @js.native
  sealed trait animatingOpen extends PanelVisibilityState
  
  @js.native
  sealed trait closed extends PanelVisibilityState
  
  @js.native
  sealed trait open extends PanelVisibilityState
}
