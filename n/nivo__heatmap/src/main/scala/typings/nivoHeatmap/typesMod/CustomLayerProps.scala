package typings.nivoHeatmap.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomLayerProps[Datum /* <: HeatMapDatum */] extends StObject {
  
  var activeCell: ComputedCell[Datum] | Null = js.native
  
  var cells: js.Array[ComputedCell[Datum]] = js.native
  
  def setActiveCell(): Unit = js.native
  def setActiveCell(cell: ComputedCell[Datum]): Unit = js.native
}
