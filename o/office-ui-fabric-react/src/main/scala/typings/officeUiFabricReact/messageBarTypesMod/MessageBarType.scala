package typings.officeUiFabricReact.messageBarTypesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait MessageBarType extends js.Object
@JSImport("office-ui-fabric-react/lib/components/MessageBar/MessageBar.types", "MessageBarType")
@js.native
object MessageBarType extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MessageBarType with Double] = js.native
  
  /** Blocked styled MessageBar */
  @js.native
  sealed trait blocked extends MessageBarType
  /* 2 */ @js.native
  object blocked extends TopLevel[blocked with Double]
  
  /** Error styled MessageBar */
  @js.native
  sealed trait error extends MessageBarType
  /* 1 */ @js.native
  object error extends TopLevel[error with Double]
  
  /** Info styled MessageBar */
  @js.native
  sealed trait info extends MessageBarType
  /* 0 */ @js.native
  object info extends TopLevel[info with Double]
  
  /** SevereWarning styled MessageBar */
  @js.native
  sealed trait severeWarning extends MessageBarType
  /* 3 */ @js.native
  object severeWarning extends TopLevel[severeWarning with Double]
  
  /** Success styled MessageBar */
  @js.native
  sealed trait success extends MessageBarType
  /* 4 */ @js.native
  object success extends TopLevel[success with Double]
  
  /** Warning styled MessageBar */
  @js.native
  sealed trait warning extends MessageBarType
  /* 5 */ @js.native
  object warning extends TopLevel[warning with Double]
}
