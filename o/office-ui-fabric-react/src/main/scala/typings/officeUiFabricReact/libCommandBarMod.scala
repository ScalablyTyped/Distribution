package typings.officeUiFabricReact

import typings.officeUiFabricReact.commandBarTypesMod.ICommandBarProps
import typings.react.mod.FunctionComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("office-ui-fabric-react/lib/CommandBar", JSImport.Namespace)
@js.native
object libCommandBarMod extends js.Object {
  
  val CommandBar: FunctionComponent[ICommandBarProps] = js.native
  
  @js.native
  class CommandBarBase protected ()
    extends typings.officeUiFabricReact.commandBarMod.CommandBarBase {
    def this(props: ICommandBarProps) = this()
  }
  /* static members */
  @js.native
  object CommandBarBase extends js.Object {
    
    var defaultProps: ICommandBarProps = js.native
  }
}
