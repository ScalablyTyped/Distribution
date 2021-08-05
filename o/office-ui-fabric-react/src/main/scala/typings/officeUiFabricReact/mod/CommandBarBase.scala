package typings.officeUiFabricReact.mod

import typings.officeUiFabricReact.commandBarTypesMod.ICommandBarProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("office-ui-fabric-react", "CommandBarBase")
@js.native
class CommandBarBase protected ()
  extends typings.officeUiFabricReact.libCommandBarMod.CommandBarBase {
  def this(props: ICommandBarProps) = this()
}
/* static members */
object CommandBarBase {
  
  @JSImport("office-ui-fabric-react", "CommandBarBase")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("office-ui-fabric-react", "CommandBarBase.defaultProps")
  @js.native
  def defaultProps: ICommandBarProps = js.native
  inline def defaultProps_=(x: ICommandBarProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
}
