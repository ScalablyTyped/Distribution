package typings.officeUiFabricReact.anon

import typings.officeUiFabricReact.detailsListTypesMod.IColumn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Column extends StObject {
  
  var column: IColumn
  
  var index: Double
  
  def onMeasureDone(measuredWidth: Double): scala.Unit
}
object Column {
  
  inline def apply(column: IColumn, index: Double, onMeasureDone: Double => scala.Unit): Column = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], onMeasureDone = js.Any.fromFunction1(onMeasureDone))
    __obj.asInstanceOf[Column]
  }
  
  extension [Self <: Column](x: Self) {
    
    inline def setColumn(value: IColumn): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setOnMeasureDone(value: Double => scala.Unit): Self = StObject.set(x, "onMeasureDone", js.Any.fromFunction1(value))
  }
}
