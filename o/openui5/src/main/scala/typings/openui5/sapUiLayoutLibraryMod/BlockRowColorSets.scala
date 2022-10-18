package typings.openui5.sapUiLayoutLibraryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait BlockRowColorSets extends StObject
@JSImport("sap/ui/layout/library", "BlockRowColorSets")
@js.native
object BlockRowColorSets extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[BlockRowColorSets & String] = js.native
  
  /**
    * sap.ui.layout.BlockBackgroundType.Default: N/A sap.ui.layout.BlockBackgroundType.Light: Color Set 1 sap.ui.layout.BlockBackgroundType.Mixed:
    * Color Set 1 sap.ui.layout.BlockBackgroundType.Accent: Color Set 1 sap.ui.layout.BlockBackgroundType.Dashboard:
    * N/A
    */
  @js.native
  sealed trait ColorSet1
    extends StObject
       with BlockRowColorSets
  /* "ColorSet1" */ val ColorSet1: typings.openui5.sapUiLayoutLibraryMod.BlockRowColorSets.ColorSet1 & String = js.native
  
  /**
    * sap.ui.layout.BlockBackgroundType.Default: N/A sap.ui.layout.BlockBackgroundType.Light: Color Set 2 sap.ui.layout.BlockBackgroundType.Mixed:
    * Color Set 2 sap.ui.layout.BlockBackgroundType.Accent: Color Set 2 sap.ui.layout.BlockBackgroundType.Dashboard:
    * N/A
    */
  @js.native
  sealed trait ColorSet2
    extends StObject
       with BlockRowColorSets
  /* "ColorSet2" */ val ColorSet2: typings.openui5.sapUiLayoutLibraryMod.BlockRowColorSets.ColorSet2 & String = js.native
  
  /**
    * sap.ui.layout.BlockBackgroundType.Default: N/A sap.ui.layout.BlockBackgroundType.Light: Color Set 1 sap.ui.layout.BlockBackgroundType.Mixed:
    * Color Set 1 sap.ui.layout.BlockBackgroundType.Accent: Color Set 3 sap.ui.layout.BlockBackgroundType.Dashboard:
    * N/A
    */
  @js.native
  sealed trait ColorSet3
    extends StObject
       with BlockRowColorSets
  /* "ColorSet3" */ val ColorSet3: typings.openui5.sapUiLayoutLibraryMod.BlockRowColorSets.ColorSet3 & String = js.native
  
  /**
    * sap.ui.layout.BlockBackgroundType.Default: N/A sap.ui.layout.BlockBackgroundType.Light: Color Set 2 sap.ui.layout.BlockBackgroundType.Mixed:
    * Color Set 2 sap.ui.layout.BlockBackgroundType.Accent: Color Set 4 sap.ui.layout.BlockBackgroundType.Dashboard:
    * N/A
    */
  @js.native
  sealed trait ColorSet4
    extends StObject
       with BlockRowColorSets
  /* "ColorSet4" */ val ColorSet4: typings.openui5.sapUiLayoutLibraryMod.BlockRowColorSets.ColorSet4 & String = js.native
}
