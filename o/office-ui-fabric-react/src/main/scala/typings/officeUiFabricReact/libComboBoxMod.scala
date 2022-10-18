package typings.officeUiFabricReact

import typings.officeUiFabricReact.libComponentsComboBoxComboBoxDottypesMod.IComboBoxProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComboBoxMod {
  
  @JSImport("office-ui-fabric-react/lib/ComboBox", "ComboBox")
  @js.native
  open class ComboBox protected ()
    extends typings.officeUiFabricReact.libComponentsComboBoxMod.ComboBox {
    def this(props: IComboBoxProps) = this()
  }
  /* static members */
  object ComboBox {
    
    @JSImport("office-ui-fabric-react/lib/ComboBox", "ComboBox")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("office-ui-fabric-react/lib/ComboBox", "ComboBox.defaultProps")
    @js.native
    def defaultProps: IComboBoxProps = js.native
    inline def defaultProps_=(x: IComboBoxProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("office-ui-fabric-react/lib/ComboBox", "SelectableOptionMenuItemType")
  @js.native
  object SelectableOptionMenuItemType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.officeUiFabricReact.libUtilitiesSelectableOptionSelectableOptionDottypesMod.SelectableOptionMenuItemType & Double
      ] = js.native
    
    /* 1 */ val Divider: typings.officeUiFabricReact.libUtilitiesSelectableOptionSelectableOptionDottypesMod.SelectableOptionMenuItemType.Divider & Double = js.native
    
    /* 2 */ val Header: typings.officeUiFabricReact.libUtilitiesSelectableOptionSelectableOptionDottypesMod.SelectableOptionMenuItemType.Header & Double = js.native
    
    /* 0 */ val Normal: typings.officeUiFabricReact.libUtilitiesSelectableOptionSelectableOptionDottypesMod.SelectableOptionMenuItemType.Normal & Double = js.native
  }
  
  @JSImport("office-ui-fabric-react/lib/ComboBox", "VirtualizedComboBox")
  @js.native
  open class VirtualizedComboBox protected ()
    extends typings.officeUiFabricReact.libComponentsComboBoxMod.VirtualizedComboBox {
    def this(props: IComboBoxProps) = this()
  }
}
