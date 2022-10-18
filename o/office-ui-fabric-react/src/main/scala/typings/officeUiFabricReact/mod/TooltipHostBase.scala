package typings.officeUiFabricReact.mod

import typings.officeUiFabricReact.anon.Delay
import typings.officeUiFabricReact.libComponentsTooltipTooltipHostDottypesMod.ITooltipHostProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("office-ui-fabric-react", "TooltipHostBase")
@js.native
open class TooltipHostBase protected ()
  extends typings.officeUiFabricReact.libTooltipMod.TooltipHostBase {
  def this(props: ITooltipHostProps) = this()
}
/* static members */
object TooltipHostBase {
  
  @JSImport("office-ui-fabric-react", "TooltipHostBase")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("office-ui-fabric-react", "TooltipHostBase._currentVisibleTooltip")
  @js.native
  def _currentVisibleTooltip: Any = js.native
  inline def _currentVisibleTooltip_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_currentVisibleTooltip")(x.asInstanceOf[js.Any])
  
  @JSImport("office-ui-fabric-react", "TooltipHostBase.defaultProps")
  @js.native
  def defaultProps: Delay = js.native
  inline def defaultProps_=(x: Delay): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
}
