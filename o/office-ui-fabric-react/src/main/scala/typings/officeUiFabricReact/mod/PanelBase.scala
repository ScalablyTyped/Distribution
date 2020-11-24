package typings.officeUiFabricReact.mod

import typings.officeUiFabricReact.anon.PartialIPanelState
import typings.officeUiFabricReact.anon.ReadonlyIPanelProps
import typings.officeUiFabricReact.anon.ReadonlyIPanelState
import typings.officeUiFabricReact.panelTypesMod.IPanelProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("office-ui-fabric-react", "PanelBase")
@js.native
class PanelBase protected ()
  extends typings.officeUiFabricReact.libPanelMod.PanelBase {
  def this(props: IPanelProps) = this()
}
/* static members */
@JSImport("office-ui-fabric-react", "PanelBase")
@js.native
object PanelBase extends js.Object {
  
  var defaultProps: IPanelProps = js.native
  
  def getDerivedStateFromProps(nextProps: ReadonlyIPanelProps, prevState: ReadonlyIPanelState): PartialIPanelState | Null = js.native
}
