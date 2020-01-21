package typings.officeUiFabricReact

import typings.officeUiFabricReact.commandBarTypesMod.ICommandBarProps
import typings.react.mod.StatelessComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/components/CommandBar", JSImport.Namespace)
@js.native
object commandBarMod extends js.Object {
  @js.native
  class CommandBarBase ()
    extends typings.officeUiFabricReact.commandBarBaseMod.CommandBarBase
  
  val CommandBar: StatelessComponent[ICommandBarProps] = js.native
  /* static members */
  @js.native
  object CommandBarBase extends js.Object {
    var defaultProps: ICommandBarProps = js.native
  }
  
}

