package typings.officeDashUiDashFabricDashReact

import typings.officeDashUiDashFabricDashReact.libComponentsCoachmarkCoachmarkDotTypesMod.ICoachmarkProps
import typings.officeDashUiDashFabricDashReact.officeDashUiDashFabricDashReactStrings.`data-coachmarkid`
import typings.react.reactMod.StatelessComponent
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/components/Coachmark", JSImport.Namespace)
@js.native
object libComponentsCoachmarkMod extends js.Object {
  @js.native
  class CoachmarkBase protected ()
    extends typings.officeDashUiDashFabricDashReact.libComponentsCoachmarkCoachmarkDotBaseMod.CoachmarkBase {
    def this(props: ICoachmarkProps) = this()
  }
  
  val COACHMARK_ATTRIBUTE_NAME: `data-coachmarkid` = js.native
  val Coachmark: StatelessComponent[ICoachmarkProps] = js.native
  /* static members */
  @js.native
  object CoachmarkBase extends js.Object {
    var defaultProps: Partial[ICoachmarkProps] = js.native
  }
  
}

