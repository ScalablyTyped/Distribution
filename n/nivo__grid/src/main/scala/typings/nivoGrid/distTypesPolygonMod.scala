package typings.nivoGrid

import typings.nivoGrid.anon.Call
import typings.nivoGrid.distTypesTypesMod.GridCell
import typings.nivoGrid.distTypesTypesMod.Vertex
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesPolygonMod {
  
  @JSImport("@nivo/grid/dist/types/polygon", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getCellsPolygons[C /* <: GridCell */](cells: js.Array[C]): js.Array[js.Array[Vertex]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getCellsPolygons")(cells.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Array[Vertex]]]
  
  inline def perpendicularPolygon(): Call = ^.asInstanceOf[js.Dynamic].applyDynamic("perpendicularPolygon")().asInstanceOf[Call]
}
