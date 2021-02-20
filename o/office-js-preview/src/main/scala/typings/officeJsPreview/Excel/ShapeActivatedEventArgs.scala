package typings.officeJsPreview.Excel

import typings.officeJsPreview.officeJsPreviewStrings.ShapeActivated
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Provides information about the shape that raised the Activated event.
  *
  * [Api set: ExcelApi 1.9]
  */
@js.native
trait ShapeActivatedEventArgs extends StObject {
  
  /**
    *
    * Gets the id of the activated shape.
    *
    * [Api set: ExcelApi 1.9]
    */
  var shapeId: String = js.native
  
  /**
    *
    * Gets the type of the event. See Excel.EventType for details.
    *
    * [Api set: ExcelApi 1.9]
    */
  var `type`: ShapeActivated = js.native
  
  /**
    *
    * Gets the id of the worksheet in which the shape is activated.
    *
    * [Api set: ExcelApi 1.9]
    */
  var worksheetId: String = js.native
}
object ShapeActivatedEventArgs {
  
  @scala.inline
  def apply(shapeId: String, `type`: ShapeActivated, worksheetId: String): ShapeActivatedEventArgs = {
    val __obj = js.Dynamic.literal(shapeId = shapeId.asInstanceOf[js.Any], worksheetId = worksheetId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShapeActivatedEventArgs]
  }
  
  @scala.inline
  implicit class ShapeActivatedEventArgsMutableBuilder[Self <: ShapeActivatedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setShapeId(value: String): Self = StObject.set(x, "shapeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: ShapeActivated): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorksheetId(value: String): Self = StObject.set(x, "worksheetId", value.asInstanceOf[js.Any])
  }
}
