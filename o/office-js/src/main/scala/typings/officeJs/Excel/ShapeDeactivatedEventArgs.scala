package typings.officeJs.Excel

import typings.officeJs.officeJsStrings.ShapeDeactivated
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Provides information about the shape that raised the Deactivated event.
  *
  * [Api set: ExcelApi 1.9]
  */
@js.native
trait ShapeDeactivatedEventArgs extends StObject {
  
  /**
    *
    * Gets the id of the shape deactivated shape.
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
  var `type`: ShapeDeactivated = js.native
  
  /**
    *
    * Gets the id of the worksheet in which the shape is deactivated.
    *
    * [Api set: ExcelApi 1.9]
    */
  var worksheetId: String = js.native
}
object ShapeDeactivatedEventArgs {
  
  @scala.inline
  def apply(shapeId: String, `type`: ShapeDeactivated, worksheetId: String): ShapeDeactivatedEventArgs = {
    val __obj = js.Dynamic.literal(shapeId = shapeId.asInstanceOf[js.Any], worksheetId = worksheetId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShapeDeactivatedEventArgs]
  }
  
  @scala.inline
  implicit class ShapeDeactivatedEventArgsMutableBuilder[Self <: ShapeDeactivatedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setShapeId(value: String): Self = StObject.set(x, "shapeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: ShapeDeactivated): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorksheetId(value: String): Self = StObject.set(x, "worksheetId", value.asInstanceOf[js.Any])
  }
}
