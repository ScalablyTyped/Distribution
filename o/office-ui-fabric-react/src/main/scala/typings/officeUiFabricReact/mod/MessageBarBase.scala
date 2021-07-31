package typings.officeUiFabricReact.mod

import typings.officeUiFabricReact.messageBarTypesMod.IMessageBarProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("office-ui-fabric-react", "MessageBarBase")
@js.native
class MessageBarBase protected ()
  extends typings.officeUiFabricReact.libMessageBarMod.MessageBarBase {
  def this(props: IMessageBarProps) = this()
}
/* static members */
object MessageBarBase {
  
  @JSImport("office-ui-fabric-react", "MessageBarBase")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("office-ui-fabric-react", "MessageBarBase.defaultProps")
  @js.native
  def defaultProps: IMessageBarProps = js.native
  @scala.inline
  def defaultProps_=(x: IMessageBarProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
}
