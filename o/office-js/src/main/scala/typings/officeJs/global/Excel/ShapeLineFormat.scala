package typings.officeJs.global.Excel

import typings.officeJs.OfficeExtension.ClientRequestContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the line formatting for the shape object. For images and geometric shapes, line formatting represents the border of the shape.
  *
  * @remarks
  * [Api set: ExcelApi 1.9]
  */
@JSGlobal("Excel.ShapeLineFormat")
@js.native
open class ShapeLineFormat ()
  extends StObject
     with typings.officeJs.Excel.ShapeLineFormat {
  
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
