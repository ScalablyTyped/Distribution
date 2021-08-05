package typings.officeUiFabricReact

import typings.officeUiFabricReact.selectableOptionTypesMod.ISelectableOption
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object selectableOptionMod {
  
  @JSImport("office-ui-fabric-react/lib/utilities/selectableOption", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("office-ui-fabric-react/lib/utilities/selectableOption", "SelectableOptionMenuItemType")
  @js.native
  object SelectableOptionMenuItemType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.officeUiFabricReact.selectableOptionTypesMod.SelectableOptionMenuItemType & Double
      ] = js.native
    
    /* 1 */ val Divider: typings.officeUiFabricReact.selectableOptionTypesMod.SelectableOptionMenuItemType.Divider & Double = js.native
    
    /* 2 */ val Header: typings.officeUiFabricReact.selectableOptionTypesMod.SelectableOptionMenuItemType.Header & Double = js.native
    
    /* 0 */ val Normal: typings.officeUiFabricReact.selectableOptionTypesMod.SelectableOptionMenuItemType.Normal & Double = js.native
  }
  
  inline def getAllSelectedOptions(options: js.Array[ISelectableOption], selectedIndices: js.Array[Double]): js.Array[ISelectableOption] = (^.asInstanceOf[js.Dynamic].applyDynamic("getAllSelectedOptions")(options.asInstanceOf[js.Any], selectedIndices.asInstanceOf[js.Any])).asInstanceOf[js.Array[ISelectableOption]]
}
