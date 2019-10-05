package typings.officeDashUiDashFabricDashReact

import typings.officeDashUiDashFabricDashReact.libComponentsOverflowSetOverflowSetDotTypesMod.IOverflowSetProps
import typings.officeDashUiDashFabricDashReact.officeDashUiDashFabricDashReactStrings.role
import typings.officeDashUiDashFabricDashReact.officeDashUiDashFabricDashReactStrings.vertical
import typings.react.reactMod.StatelessComponent
import typings.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/components/OverflowSet", JSImport.Namespace)
@js.native
object libComponentsOverflowSetMod extends js.Object {
  @js.native
  class OverflowSetBase protected ()
    extends typings.officeDashUiDashFabricDashReact.libComponentsOverflowSetOverflowSetDotBaseMod.OverflowSetBase {
    def this(props: IOverflowSetProps) = this()
  }
  
  val OverflowSet: StatelessComponent[IOverflowSetProps] = js.native
  /* static members */
  @js.native
  object OverflowSetBase extends js.Object {
    var defaultProps: Pick[IOverflowSetProps, vertical | role] = js.native
  }
  
}

