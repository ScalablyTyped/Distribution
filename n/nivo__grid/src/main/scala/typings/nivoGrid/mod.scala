package typings.nivoGrid

import typings.nivoGrid.anon.Call
import typings.nivoGrid.anon.CellHeight
import typings.nivoGrid.anon.Columns
import typings.nivoGrid.anon.Extend
import typings.nivoGrid.distTypesTypesMod.BoundingBox
import typings.nivoGrid.distTypesTypesMod.GridCell
import typings.nivoGrid.distTypesTypesMod.Vertex
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@nivo/grid", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def areBoundingBoxTouching(boxA: BoundingBox, boxB: BoundingBox): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("areBoundingBoxTouching")(boxA.asInstanceOf[js.Any], boxB.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def computeCellDimensions(param0: Columns): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("computeCellDimensions")(param0.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
  
  inline def generateGrid[C /* <: GridCell */](param0: Extend[C]): CellHeight[C] = ^.asInstanceOf[js.Dynamic].applyDynamic("generateGrid")(param0.asInstanceOf[js.Any]).asInstanceOf[CellHeight[C]]
  
  inline def getCellsPolygons[C /* <: GridCell */](cells: js.Array[C]): js.Array[js.Array[Vertex]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getCellsPolygons")(cells.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Array[Vertex]]]
  
  inline def perpendicularPolygon(): Call = ^.asInstanceOf[js.Dynamic].applyDynamic("perpendicularPolygon")().asInstanceOf[Call]
}
