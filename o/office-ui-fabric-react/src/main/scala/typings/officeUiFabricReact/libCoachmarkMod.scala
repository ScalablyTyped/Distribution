package typings.officeUiFabricReact

import typings.officeUiFabricReact.anon.PartialICoachmarkProps
import typings.officeUiFabricReact.coachmarkTypesMod.ICoachmarkProps
import typings.react.mod.FunctionComponent
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
  
  val COACHMARK_ATTRIBUTE_NAME: /* "data-coachmarkid" */ String = js.native
  val Coachmark: FunctionComponent[ICoachmarkProps] = js.native
  /* static members */
  @js.native
  object CoachmarkBase extends js.Object {
    var defaultProps: PartialICoachmarkProps = js.native
  }
  
}

