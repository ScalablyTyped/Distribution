package typings.officeJsPreview.global.Excel

import typings.officeJsPreview.OfficeExtension.ClientRequestContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * This object represents the font attributes (font name, font size, color, etc.) for a chart object.
  *
  * [Api set: ExcelApi 1.1]
  */
@JSGlobal("Excel.ChartFont")
@js.native
class ChartFont ()
  extends StObject
     with typings.officeJsPreview.Excel.ChartFont {
  
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
