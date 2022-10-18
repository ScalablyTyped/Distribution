package typings.nivoWaffle.distTypesTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.nivoWaffle.distTypesTypesMod.EmptyCell
  - typings.nivoWaffle.distTypesTypesMod.DataCell[RawDatum]
*/
trait Cell[RawDatum /* <: Datum */] extends StObject
object Cell {
  
  inline def DataCell[RawDatum /* <: Datum */](
    color: String,
    column: Double,
    data: ComputedDatum[RawDatum],
    position: Double,
    row: Double,
    x: Double,
    y: Double
  ): typings.nivoWaffle.distTypesTypesMod.DataCell[RawDatum] = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], column = column.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.nivoWaffle.distTypesTypesMod.DataCell[RawDatum]]
  }
  
  inline def EmptyCell(color: String, column: Double, position: Double, row: Double, x: Double, y: Double): typings.nivoWaffle.distTypesTypesMod.EmptyCell = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], column = column.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.nivoWaffle.distTypesTypesMod.EmptyCell]
  }
}
