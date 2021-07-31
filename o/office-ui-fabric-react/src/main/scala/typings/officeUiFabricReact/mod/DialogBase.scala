package typings.officeUiFabricReact.mod

import typings.officeUiFabricReact.dialogTypesMod.IDialogProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("office-ui-fabric-react", "DialogBase")
@js.native
class DialogBase protected ()
  extends typings.officeUiFabricReact.libDialogMod.DialogBase {
  def this(props: IDialogProps) = this()
}
/* static members */
object DialogBase {
  
  @JSImport("office-ui-fabric-react", "DialogBase")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("office-ui-fabric-react", "DialogBase.defaultProps")
  @js.native
  def defaultProps: IDialogProps = js.native
  @scala.inline
  def defaultProps_=(x: IDialogProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
}
