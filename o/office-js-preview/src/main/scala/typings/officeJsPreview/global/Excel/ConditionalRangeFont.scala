package typings.officeJsPreview.global.Excel

import typings.officeJsPreview.OfficeExtension.ClientRequestContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * This object represents the font attributes (font style, color, etc.) for an object.
  *
  * [Api set: ExcelApi 1.6]
  */
@JSGlobal("Excel.ConditionalRangeFont")
@js.native
class ConditionalRangeFont ()
  extends StObject
     with typings.officeJsPreview.Excel.ConditionalRangeFont {
  
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
