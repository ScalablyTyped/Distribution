package typings.officeUiFabricReact

import typings.officeUiFabricReact.dialogContentTypesMod.IDialogContentProps
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dialogContentBaseMod {
  
  @JSImport("office-ui-fabric-react/lib/components/Dialog/DialogContent.base", "DialogContentBase")
  @js.native
  open class DialogContentBase protected ()
    extends Component[IDialogContentProps, js.Object, Any] {
    def this(props: IDialogContentProps) = this()
    
    /* private */ var _groupChildren: Any = js.native
  }
  /* static members */
  object DialogContentBase {
    
    @JSImport("office-ui-fabric-react/lib/components/Dialog/DialogContent.base", "DialogContentBase")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("office-ui-fabric-react/lib/components/Dialog/DialogContent.base", "DialogContentBase.defaultProps")
    @js.native
    def defaultProps: IDialogContentProps = js.native
    inline def defaultProps_=(x: IDialogContentProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
}
