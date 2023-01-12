package typings.nivoWaffle.distTypesTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.nivoWaffle.distTypesTypesMod.Cell because Already inherited */ trait DataCell[RawDatum /* <: Datum */]
  extends StObject
     with EmptyCell {
  
  var data: ComputedDatum[RawDatum]
}
object DataCell {
  
  inline def apply[RawDatum /* <: Datum */](
    color: String,
    column: Double,
    data: ComputedDatum[RawDatum],
    position: Double,
    row: Double,
    x: Double,
    y: Double
  ): DataCell[RawDatum] = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], column = column.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataCell[RawDatum]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DataCell[?], RawDatum /* <: Datum */] (val x: Self & DataCell[RawDatum]) extends AnyVal {
    
    inline def setData(value: ComputedDatum[RawDatum]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
  }
}
