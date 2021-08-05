package typings.officeJsPreview.Excel

import typings.officeJsPreview.officeJsPreviewStrings.ShapeActivated
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Provides information about the shape that raised the Activated event.
  *
  * [Api set: ExcelApi 1.9]
  */
trait ShapeActivatedEventArgs extends StObject {
  
  /**
    *
    * Gets the id of the activated shape.
    *
    * [Api set: ExcelApi 1.9]
    */
  var shapeId: String
  
  /**
    *
    * Gets the type of the event. See Excel.EventType for details.
    *
    * [Api set: ExcelApi 1.9]
    */
  var `type`: ShapeActivated
  
  /**
    *
    * Gets the id of the worksheet in which the shape is activated.
    *
    * [Api set: ExcelApi 1.9]
    */
  var worksheetId: String
}
object ShapeActivatedEventArgs {
  
  inline def apply(shapeId: String, worksheetId: String): ShapeActivatedEventArgs = {
    val __obj = js.Dynamic.literal(shapeId = shapeId.asInstanceOf[js.Any], worksheetId = worksheetId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ShapeActivated")
    __obj.asInstanceOf[ShapeActivatedEventArgs]
  }
  
  extension [Self <: ShapeActivatedEventArgs](x: Self) {
    
    inline def setShapeId(value: String): Self = StObject.set(x, "shapeId", value.asInstanceOf[js.Any])
    
    inline def setType(value: ShapeActivated): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setWorksheetId(value: String): Self = StObject.set(x, "worksheetId", value.asInstanceOf[js.Any])
  }
}
