package typings.officeJs.global.Excel

import typings.officeJs.OfficeExtension.ClientRequestContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Represents a generic shape object in the worksheet. A shape could be a geometric shape, a line, a group of shapes, etc.
  To learn more about the shape object model, read {@link https://docs.microsoft.com/office/dev/add-ins/excel/excel-add-ins-shapes | Work with shapes using the Excel JavaScript API}.
  *
  * [Api set: ExcelApi 1.9]
  */
@JSGlobal("Excel.Shape")
@js.native
class Shape ()
  extends StObject
     with typings.officeJs.Excel.Shape {
  
  /** The request context associated with the object */
  /* CompleteClass */
  var context: ClientRequestContext = js.native
  
  /**
    *  Returns a boolean value for whether the corresponding object is a null object. You must call `context.sync()` before reading the 
    * isNullObject property.
    */
  /* CompleteClass */
  var isNullObject: Boolean = js.native
}
