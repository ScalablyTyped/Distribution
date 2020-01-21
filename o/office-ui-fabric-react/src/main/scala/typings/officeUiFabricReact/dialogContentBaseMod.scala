package typings.officeUiFabricReact

import typings.officeUiFabricReact.dialogContentTypesMod.IDialogContentProps
import typings.officeUiFabricReact.utilitiesMod.BaseComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/components/Dialog/DialogContent.base", JSImport.Namespace)
@js.native
object dialogContentBaseMod extends js.Object {
  @js.native
  class DialogContentBase protected ()
    extends BaseComponent[IDialogContentProps, js.Object] {
    def this(props: IDialogContentProps) = this()
    var _groupChildren: js.Any = js.native
  }
  
  /* static members */
  @js.native
  object DialogContentBase extends js.Object {
    var defaultProps: IDialogContentProps = js.native
  }
  
}

