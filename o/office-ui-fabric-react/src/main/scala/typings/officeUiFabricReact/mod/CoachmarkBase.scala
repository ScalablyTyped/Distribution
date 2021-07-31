package typings.officeUiFabricReact.mod

import typings.officeUiFabricReact.anon.PartialICoachmarkProps
import typings.officeUiFabricReact.coachmarkTypesMod.ICoachmarkProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("office-ui-fabric-react", "CoachmarkBase")
@js.native
class CoachmarkBase protected ()
  extends typings.officeUiFabricReact.libCoachmarkMod.CoachmarkBase {
  def this(props: ICoachmarkProps) = this()
}
/* static members */
object CoachmarkBase {
  
  @JSImport("office-ui-fabric-react", "CoachmarkBase")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("office-ui-fabric-react", "CoachmarkBase.defaultProps")
  @js.native
  def defaultProps: PartialICoachmarkProps = js.native
  @scala.inline
  def defaultProps_=(x: PartialICoachmarkProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
}
