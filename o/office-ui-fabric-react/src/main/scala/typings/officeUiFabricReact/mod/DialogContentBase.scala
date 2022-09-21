package typings.officeUiFabricReact.mod

import typings.officeUiFabricReact.dialogContentTypesMod.IDialogContentProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("office-ui-fabric-react", "DialogContentBase")
@js.native
open class DialogContentBase protected ()
  extends typings.officeUiFabricReact.libDialogMod.DialogContentBase {
  def this(props: IDialogContentProps) = this()
}
/* static members */
object DialogContentBase {
  
  @JSImport("office-ui-fabric-react", "DialogContentBase")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("office-ui-fabric-react", "DialogContentBase.defaultProps")
  @js.native
  def defaultProps: IDialogContentProps = js.native
  inline def defaultProps_=(x: IDialogContentProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
}
