package typings.officeDashUiDashFabricDashReact

import typings.officeDashUiDashFabricDashReact.libComponentsComboBoxComboBoxDotTypesMod.IComboBoxProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/components/ComboBox", JSImport.Namespace)
@js.native
object libComponentsComboBoxMod extends js.Object {
  @js.native
  class ComboBox protected ()
    extends typings.officeDashUiDashFabricDashReact.libComponentsComboBoxComboBoxMod.ComboBox {
    def this(props: IComboBoxProps) = this()
  }
  
  @js.native
  class VirtualizedComboBox ()
    extends typings.officeDashUiDashFabricDashReact.libComponentsComboBoxVirtualizedComboBoxMod.VirtualizedComboBox
  
  /* static members */
  @js.native
  object ComboBox extends js.Object {
    var defaultProps: IComboBoxProps = js.native
  }
  
  @js.native
  object SelectableOptionMenuItemType extends js.Object {
    /* 1 */ val Divider: typings.officeDashUiDashFabricDashReact.libUtilitiesSelectableOptionSelectableOptionDotTypesMod.SelectableOptionMenuItemType.Divider with Double = js.native
    /* 2 */ val Header: typings.officeDashUiDashFabricDashReact.libUtilitiesSelectableOptionSelectableOptionDotTypesMod.SelectableOptionMenuItemType.Header with Double = js.native
    /* 0 */ val Normal: typings.officeDashUiDashFabricDashReact.libUtilitiesSelectableOptionSelectableOptionDotTypesMod.SelectableOptionMenuItemType.Normal with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.officeDashUiDashFabricDashReact.libUtilitiesSelectableOptionSelectableOptionDotTypesMod.SelectableOptionMenuItemType with Double
      ] = js.native
  }
  
}

