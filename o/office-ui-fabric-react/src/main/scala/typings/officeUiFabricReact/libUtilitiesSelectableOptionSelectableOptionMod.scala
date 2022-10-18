package typings.officeUiFabricReact

import typings.officeUiFabricReact.libUtilitiesSelectableOptionSelectableOptionDottypesMod.ISelectableOption
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilitiesSelectableOptionSelectableOptionMod {
  
  @JSImport("office-ui-fabric-react/lib/utilities/selectableOption/SelectableOption", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getAllSelectedOptions(options: js.Array[ISelectableOption], selectedIndices: js.Array[Double]): js.Array[ISelectableOption] = (^.asInstanceOf[js.Dynamic].applyDynamic("getAllSelectedOptions")(options.asInstanceOf[js.Any], selectedIndices.asInstanceOf[js.Any])).asInstanceOf[js.Array[ISelectableOption]]
}
