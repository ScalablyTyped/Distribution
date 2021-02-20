package typings.officeUiFabricReact

import typings.officeUiFabricReact.dialogTypesMod.IDialogProps
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dialogBaseMod {
  
  @JSImport("office-ui-fabric-react/lib/components/Dialog/Dialog.base", "DialogBase")
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
  object DialogBase {
    
    @JSImport("office-ui-fabric-react/lib/components/Dialog/Dialog.base", "DialogBase")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("office-ui-fabric-react/lib/components/Dialog/Dialog.base", "DialogBase.defaultProps")
    @js.native
    def defaultProps: IDialogProps = js.native
    @scala.inline
    def defaultProps_=(x: IDialogProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
}
