package typings.officeUiFabricReact

import typings.officeUiFabricReact.libUtilitiesSelectableOptionSelectableOptionDottypesMod.ISelectableOption
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilitiesSelectableOptionMod {
  
  @JSImport("office-ui-fabric-react/lib/utilities/selectableOption", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("office-ui-fabric-react/lib/utilities/selectableOption", "SelectableOptionMenuItemType")
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
  
  inline def getAllSelectedOptions(options: js.Array[ISelectableOption], selectedIndices: js.Array[Double]): js.Array[ISelectableOption] = (^.asInstanceOf[js.Dynamic].applyDynamic("getAllSelectedOptions")(options.asInstanceOf[js.Any], selectedIndices.asInstanceOf[js.Any])).asInstanceOf[js.Array[ISelectableOption]]
}
