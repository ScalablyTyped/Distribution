package typings.maximMazurokGapiClientSlides.gapi.client.slides

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TableCellBackgroundFill extends StObject {
  
  /**
    * The background fill property state. Updating the fill on a table cell will implicitly update this field to `RENDERED`, unless another value is specified in the same request. To have
    * no fill on a table cell, set this field to `NOT_RENDERED`. In this case, any other fill fields set in the same request will be ignored.
    */
  var propertyState: js.UndefOr[String] = js.undefined
  
  /** Solid color fill. */
  var solidFill: js.UndefOr[SolidFill] = js.undefined
}
object TableCellBackgroundFill {
  
  @scala.inline
  def apply(): TableCellBackgroundFill = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableCellBackgroundFill]
  }
  
  @scala.inline
  implicit class TableCellBackgroundFillMutableBuilder[Self <: TableCellBackgroundFill] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPropertyState(value: String): Self = StObject.set(x, "propertyState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertyStateUndefined: Self = StObject.set(x, "propertyState", js.undefined)
    
    @scala.inline
    def setSolidFill(value: SolidFill): Self = StObject.set(x, "solidFill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSolidFillUndefined: Self = StObject.set(x, "solidFill", js.undefined)
  }
}
