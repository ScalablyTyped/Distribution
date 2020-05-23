package typings.officeUiFabricReact

import typings.officeUiFabricReact.comboBoxTypesMod.IComboBox
import typings.officeUiFabricReact.comboBoxTypesMod.IComboBoxProps
import typings.react.mod.Component
import typings.react.mod.global.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/components/ComboBox/VirtualizedComboBox", JSImport.Namespace)
@js.native
object virtualizedComboBoxMod extends js.Object {
  @js.native
  class VirtualizedComboBox protected ()
    extends Component[IComboBoxProps, js.Object, js.Any]
       with IComboBox {
    def this(props: IComboBoxProps) = this()
    /** The combo box element */
    var _comboBox: js.Any = js.native
    /** The virtualized list element */
    var _list: js.Any = js.native
    /* protected */ def _onRenderList(props: IComboBoxProps): Element = js.native
    /* protected */ def _onScrollToItem(itemIndex: Double): Unit = js.native
  }
  
}

