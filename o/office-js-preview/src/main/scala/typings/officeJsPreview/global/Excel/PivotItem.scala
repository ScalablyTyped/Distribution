package typings.officeJsPreview.global.Excel

import typings.officeJsPreview.OfficeExtension.ClientRequestContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Represents the Excel PivotItem.
  *
  * [Api set: ExcelApi 1.8]
  */
@JSGlobal("Excel.PivotItem")
@js.native
class PivotItem ()
  extends StObject
     with typings.officeJsPreview.Excel.PivotItem {
  
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
