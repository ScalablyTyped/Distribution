package typings.officeUiFabricReact

import typings.officeUiFabricReact.libComponentsComboBoxComboBoxDottypesMod.IComboBox
import typings.officeUiFabricReact.libComponentsComboBoxComboBoxDottypesMod.IComboBoxProps
import typings.react.mod.Component
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsComboBoxVirtualizedComboBoxMod {
  
  @JSImport("office-ui-fabric-react/lib/components/ComboBox/VirtualizedComboBox", "VirtualizedComboBox")
  @js.native
  open class VirtualizedComboBox protected ()
    extends Component[IComboBoxProps, js.Object, Any]
       with IComboBox {
    def this(props: IComboBoxProps) = this()
    
    /** The combo box element */
    /* private */ var _comboBox: Any = js.native
    
    /** The virtualized list element */
    /* private */ var _list: Any = js.native
    
    /* protected */ def _onRenderList(props: IComboBoxProps): Element = js.native
    
    /* protected */ def _onScrollToItem(itemIndex: Double): Unit = js.native
  }
}
