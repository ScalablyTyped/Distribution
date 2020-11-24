package typings.officeUiFabricReact

import typings.officeUiFabricReact.anon.PartialICoachmarkProps
import typings.officeUiFabricReact.coachmarkTypesMod.ICoachmarkProps
import typings.react.mod.FunctionComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("office-ui-fabric-react/lib/components/Coachmark", JSImport.Namespace)
@js.native
object coachmarkMod extends js.Object {
  
  val COACHMARK_ATTRIBUTE_NAME: /* "data-coachmarkid" */ String = js.native
  
  val Coachmark: FunctionComponent[ICoachmarkProps] = js.native
  
  @js.native
  class CoachmarkBase protected ()
    extends typings.officeUiFabricReact.coachmarkBaseMod.CoachmarkBase {
    def this(props: ICoachmarkProps) = this()
  }
  /* static members */
  @js.native
  object CoachmarkBase extends js.Object {
    
    var defaultProps: PartialICoachmarkProps = js.native
  }
}
