package typings.openui5.sapUiLayoutLibraryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait BlockLayoutCellColorShade extends StObject
@JSImport("sap/ui/layout/library", "BlockLayoutCellColorShade")
@js.native
object BlockLayoutCellColorShade extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[BlockLayoutCellColorShade & String] = js.native
  
  /**
    * Shade A
    */
  @js.native
  sealed trait ShadeA
    extends StObject
       with BlockLayoutCellColorShade
  /* "ShadeA" */ val ShadeA: typings.openui5.sapUiLayoutLibraryMod.BlockLayoutCellColorShade.ShadeA & String = js.native
  
  /**
    * Shade B
    */
  @js.native
  sealed trait ShadeB
    extends StObject
       with BlockLayoutCellColorShade
  /* "ShadeB" */ val ShadeB: typings.openui5.sapUiLayoutLibraryMod.BlockLayoutCellColorShade.ShadeB & String = js.native
  
  /**
    * Shade C
    */
  @js.native
  sealed trait ShadeC
    extends StObject
       with BlockLayoutCellColorShade
  /* "ShadeC" */ val ShadeC: typings.openui5.sapUiLayoutLibraryMod.BlockLayoutCellColorShade.ShadeC & String = js.native
  
  /**
    * Shade D
    */
  @js.native
  sealed trait ShadeD
    extends StObject
       with BlockLayoutCellColorShade
  /* "ShadeD" */ val ShadeD: typings.openui5.sapUiLayoutLibraryMod.BlockLayoutCellColorShade.ShadeD & String = js.native
  
  /**
    * Shade E - available only for SAP Quartz and Horizon themes
    */
  @js.native
  sealed trait ShadeE
    extends StObject
       with BlockLayoutCellColorShade
  /* "ShadeE" */ val ShadeE: typings.openui5.sapUiLayoutLibraryMod.BlockLayoutCellColorShade.ShadeE & String = js.native
  
  /**
    * Shade F - available only for SAP Quartz and Horizon themes
    */
  @js.native
  sealed trait ShadeF
    extends StObject
       with BlockLayoutCellColorShade
  /* "ShadeF" */ val ShadeF: typings.openui5.sapUiLayoutLibraryMod.BlockLayoutCellColorShade.ShadeF & String = js.native
}
