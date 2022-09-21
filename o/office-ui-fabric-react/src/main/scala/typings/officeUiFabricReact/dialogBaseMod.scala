package typings.officeUiFabricReact

import typings.officeUiFabricReact.dialogTypesMod.IDialogProps
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dialogBaseMod {
  
  @JSImport("office-ui-fabric-react/lib/components/Dialog/Dialog.base", "DialogBase")
  @js.native
  open class DialogBase protected ()
    extends Component[IDialogProps, js.Object, Any] {
    def this(props: IDialogProps) = this()
    
    /* private */ var _defaultSubTextId: Any = js.native
    
    /* private */ var _defaultTitleTextId: Any = js.native
    
    /* private */ var _getSubTextId: Any = js.native
    
    /* private */ var _getTitleTextId: Any = js.native
    
    /* private */ var _id: Any = js.native
  }
  /* static members */
  object DialogBase {
    
    @JSImport("office-ui-fabric-react/lib/components/Dialog/Dialog.base", "DialogBase")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("office-ui-fabric-react/lib/components/Dialog/Dialog.base", "DialogBase.defaultProps")
    @js.native
    def defaultProps: IDialogProps = js.native
    inline def defaultProps_=(x: IDialogProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
}
