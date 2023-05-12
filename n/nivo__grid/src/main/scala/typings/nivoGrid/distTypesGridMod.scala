package typings.nivoGrid

import typings.nivoGrid.anon.CellHeight
import typings.nivoGrid.anon.Columns
import typings.nivoGrid.anon.Extend
import typings.nivoGrid.distTypesTypesMod.GridCell
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesGridMod {
  
  @JSImport("@nivo/grid/dist/types/grid", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def computeCellDimensions(param0: Columns): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("computeCellDimensions")(param0.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
  
  inline def generateGrid[C /* <: GridCell */](param0: Extend[C]): CellHeight[C] = ^.asInstanceOf[js.Dynamic].applyDynamic("generateGrid")(param0.asInstanceOf[js.Any]).asInstanceOf[CellHeight[C]]
}
