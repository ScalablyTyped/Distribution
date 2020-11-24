package typings.officeUiFabricReact

import typings.officeUiFabricReact.comboBoxTypesMod.IComboBoxProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("office-ui-fabric-react/lib/ComboBox", JSImport.Namespace)
@js.native
object libComboBoxMod extends js.Object {
  
  @js.native
  class ComboBox protected ()
    extends typings.officeUiFabricReact.comboBoxMod.ComboBox {
    def this(props: IComboBoxProps) = this()
  }
  /* static members */
  @js.native
  object ComboBox extends js.Object {
    
    var defaultProps: IComboBoxProps = js.native
  }
  
  @js.native
  object SelectableOptionMenuItemType extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.officeUiFabricReact.selectableOptionTypesMod.SelectableOptionMenuItemType with Double
      ] = js.native
    
    /* 1 */ val Divider: typings.officeUiFabricReact.selectableOptionTypesMod.SelectableOptionMenuItemType.Divider with Double = js.native
    
    /* 2 */ val Header: typings.officeUiFabricReact.selectableOptionTypesMod.SelectableOptionMenuItemType.Header with Double = js.native
    
    /* 0 */ val Normal: typings.officeUiFabricReact.selectableOptionTypesMod.SelectableOptionMenuItemType.Normal with Double = js.native
  }
  
  @js.native
  class VirtualizedComboBox protected ()
    extends typings.officeUiFabricReact.comboBoxMod.VirtualizedComboBox {
    def this(props: IComboBoxProps) = this()
  }
}
