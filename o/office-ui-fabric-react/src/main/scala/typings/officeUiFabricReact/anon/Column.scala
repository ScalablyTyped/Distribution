package typings.officeUiFabricReact.anon

import typings.officeUiFabricReact.detailsListTypesMod.IColumn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Column extends StObject {
  
  var column: IColumn = js.native
  
  var index: Double = js.native
  
  def onMeasureDone(measuredWidth: Double): scala.Unit = js.native
}
object Column {
  
  @scala.inline
  def apply(column: IColumn, index: Double, onMeasureDone: Double => scala.Unit): Column = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], onMeasureDone = js.Any.fromFunction1(onMeasureDone))
    __obj.asInstanceOf[Column]
  }
  
  @scala.inline
  implicit class ColumnMutableBuilder[Self <: Column] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumn(value: IColumn): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnMeasureDone(value: Double => scala.Unit): Self = StObject.set(x, "onMeasureDone", js.Any.fromFunction1(value))
  }
}
