package typings.officeJs.global.Excel

import typings.officeJs.OfficeExtension.ClientRequestContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the font attributes, such as font name, font size, and color, for a shape's `TextRange` object.
  *
  * @remarks
  * [Api set: ExcelApi 1.9]
  */
@JSGlobal("Excel.ShapeFont")
@js.native
open class ShapeFont ()
  extends StObject
     with typings.officeJs.Excel.ShapeFont {
  
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
