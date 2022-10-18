package typings.officeUiFabricReact.libIndexDotbundleMod

import typings.officeUiFabricReact.anon.PartialIPanelState
import typings.officeUiFabricReact.anon.ReadonlyIPanelProps
import typings.officeUiFabricReact.anon.ReadonlyIPanelState
import typings.officeUiFabricReact.libComponentsPanelPanelDottypesMod.IPanelProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("office-ui-fabric-react/lib/index.bundle", "PanelBase")
@js.native
open class PanelBase protected ()
  extends typings.officeUiFabricReact.mod.PanelBase {
  def this(props: IPanelProps) = this()
}
/* static members */
object PanelBase {
  
  @JSImport("office-ui-fabric-react/lib/index.bundle", "PanelBase")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("office-ui-fabric-react/lib/index.bundle", "PanelBase.defaultProps")
  @js.native
  def defaultProps: IPanelProps = js.native
  inline def defaultProps_=(x: IPanelProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  
  inline def getDerivedStateFromProps(nextProps: ReadonlyIPanelProps, prevState: ReadonlyIPanelState): PartialIPanelState | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getDerivedStateFromProps")(nextProps.asInstanceOf[js.Any], prevState.asInstanceOf[js.Any])).asInstanceOf[PartialIPanelState | Null]
}
