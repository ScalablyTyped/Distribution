package typings.officeUiFabricReact

import typings.officeUiFabricReact.coachmarkTypesMod.ICoachmarkProps
import typings.officeUiFabricReact.officeUiFabricReactStrings.`data-coachmarkid`
import typings.react.mod.StatelessComponent
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/Coachmark", JSImport.Namespace)
@js.native
object libCoachmarkMod extends js.Object {
  @js.native
  class CoachmarkBase protected ()
    extends typings.officeUiFabricReact.coachmarkMod.CoachmarkBase {
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

