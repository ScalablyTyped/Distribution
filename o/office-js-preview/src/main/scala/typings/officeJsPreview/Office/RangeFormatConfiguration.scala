package typings.officeJsPreview.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Specifies a range and its formatting.
  */
trait RangeFormatConfiguration extends StObject {
  
  /**
    * Specifies the range. Example of using Office.Table enum: Office.Table.All. Example of using RangeCoordinates: `{row: 3, column: 4}` specifies
    * the cell in the 3rd (zero-based) row in the 4th (zero-based) column.
    */
  var cells: Table | RangeCoordinates
  
  /**
    * Specifies the formatting as key-value pairs. Example: `{borderColor: "white", fontStyle: "bold"}`
    */
  var format: js.Object
}
object RangeFormatConfiguration {
  
  @scala.inline
  def apply(cells: Table | RangeCoordinates, format: js.Object): RangeFormatConfiguration = {
    val __obj = js.Dynamic.literal(cells = cells.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any])
    __obj.asInstanceOf[RangeFormatConfiguration]
  }
  
  @scala.inline
  implicit class RangeFormatConfigurationMutableBuilder[Self <: RangeFormatConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCells(value: Table | RangeCoordinates): Self = StObject.set(x, "cells", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormat(value: js.Object): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
  }
}
