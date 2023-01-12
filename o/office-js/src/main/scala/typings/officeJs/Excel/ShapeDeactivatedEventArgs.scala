package typings.officeJs.Excel

import typings.officeJs.officeJsStrings.ShapeDeactivated
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides information about the shape that raised the deactivated event.
  *
  * @remarks
  * [Api set: ExcelApi 1.9]
  */
trait ShapeDeactivatedEventArgs extends StObject {
  
  /**
    * Gets the ID of the shape deactivated shape.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var shapeId: String
  
  /**
    * Gets the type of the event. See `Excel.EventType` for details.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var `type`: ShapeDeactivated
  
  /**
    * Gets the ID of the worksheet in which the shape is deactivated.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var worksheetId: String
}
object ShapeDeactivatedEventArgs {
  
  inline def apply(shapeId: String, worksheetId: String): ShapeDeactivatedEventArgs = {
    val __obj = js.Dynamic.literal(shapeId = shapeId.asInstanceOf[js.Any], worksheetId = worksheetId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ShapeDeactivated")
    __obj.asInstanceOf[ShapeDeactivatedEventArgs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ShapeDeactivatedEventArgs] (val x: Self) extends AnyVal {
    
    inline def setShapeId(value: String): Self = StObject.set(x, "shapeId", value.asInstanceOf[js.Any])
    
    inline def setType(value: ShapeDeactivated): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setWorksheetId(value: String): Self = StObject.set(x, "worksheetId", value.asInstanceOf[js.Any])
  }
}
