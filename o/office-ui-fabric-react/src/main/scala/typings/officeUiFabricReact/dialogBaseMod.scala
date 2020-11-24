package typings.officeUiFabricReact

import typings.officeUiFabricReact.dialogTypesMod.IDialogProps
import typings.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("office-ui-fabric-react/lib/components/Dialog/Dialog.base", JSImport.Namespace)
@js.native
object dialogBaseMod extends js.Object {
  
  @js.native
  class DialogBase protected ()
    extends Component[IDialogProps, js.Object, js.Any] {
    def this(props: IDialogProps) = this()
    
    var _defaultSubTextId: js.Any = js.native
    
    var _defaultTitleTextId: js.Any = js.native
    
    var _getSubTextId: js.Any = js.native
    
    var _getTitleTextId: js.Any = js.native
    
    var _id: js.Any = js.native
  }
  /* static members */
  @js.native
  object DialogBase extends js.Object {
    
    var defaultProps: IDialogProps = js.native
  }
}
