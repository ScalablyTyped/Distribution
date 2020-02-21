package typings.officeUiFabricReact

import typings.officeUiFabricReact.toggleBaseMod.IToggleState
import typings.officeUiFabricReact.toggleTypesMod.IToggleProps
import typings.react.mod.FunctionComponent
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/components/Toggle", JSImport.Namespace)
@js.native
object toggleMod extends js.Object {
  @js.native
  class ToggleBase protected ()
    extends typings.officeUiFabricReact.toggleBaseMod.ToggleBase {
    def this(props: IToggleProps) = this()
  }
  
  val Toggle: FunctionComponent[IToggleProps] = js.native
  /* static members */
  @js.native
  object ToggleBase extends js.Object {
    def getDerivedStateFromProps(nextProps: IToggleProps, prevState: IToggleState): Partial[IToggleState] | Null = js.native
  }
  
}

