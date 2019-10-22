package typings.officeDashUiDashFabricDashReact

import typings.officeDashUiDashFabricDashReact.libComponentsToggleToggleDotBaseMod.IToggleState
import typings.officeDashUiDashFabricDashReact.libComponentsToggleToggleDotTypesMod.IToggleProps
import typings.react.reactMod.StatelessComponent
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/components/Toggle", JSImport.Namespace)
@js.native
object libComponentsToggleMod extends js.Object {
  @js.native
  class ToggleBase protected ()
    extends typings.officeDashUiDashFabricDashReact.libComponentsToggleToggleDotBaseMod.ToggleBase {
    def this(props: IToggleProps) = this()
  }
  
  val Toggle: StatelessComponent[IToggleProps] = js.native
  /* static members */
  @js.native
  object ToggleBase extends js.Object {
    def getDerivedStateFromProps(nextProps: IToggleProps, prevState: IToggleState): Partial[IToggleState] | Null = js.native
  }
  
}

