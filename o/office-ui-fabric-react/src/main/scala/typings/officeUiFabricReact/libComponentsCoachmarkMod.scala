package typings.officeUiFabricReact

import typings.officeUiFabricReact.anon.PartialICoachmarkProps
import typings.officeUiFabricReact.libComponentsCoachmarkCoachmarkDottypesMod.ICoachmarkProps
import typings.react.mod.FunctionComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsCoachmarkMod {
  
  @JSImport("office-ui-fabric-react/lib/components/Coachmark", "COACHMARK_ATTRIBUTE_NAME")
  @js.native
  val COACHMARK_ATTRIBUTE_NAME: /* "data-coachmarkid" */ String = js.native
  
  @JSImport("office-ui-fabric-react/lib/components/Coachmark", "Coachmark")
  @js.native
  val Coachmark: FunctionComponent[ICoachmarkProps] = js.native
  
  @JSImport("office-ui-fabric-react/lib/components/Coachmark", "CoachmarkBase")
  @js.native
  open class CoachmarkBase protected ()
    extends typings.officeUiFabricReact.libComponentsCoachmarkCoachmarkDotbaseMod.CoachmarkBase {
    def this(props: ICoachmarkProps) = this()
  }
  /* static members */
  object CoachmarkBase {
    
    @JSImport("office-ui-fabric-react/lib/components/Coachmark", "CoachmarkBase")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("office-ui-fabric-react/lib/components/Coachmark", "CoachmarkBase.defaultProps")
    @js.native
    def defaultProps: PartialICoachmarkProps = js.native
    inline def defaultProps_=(x: PartialICoachmarkProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
}
