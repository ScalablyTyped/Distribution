package typings.officeJsPreview.global.Excel

import typings.officeJsPreview.OfficeExtension.ClientRequestContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Represents the results from the removeDuplicates method on range
  *
  * [Api set: ExcelApi 1.9]
  */
@JSGlobal("Excel.RemoveDuplicatesResult")
@js.native
class RemoveDuplicatesResult ()
  extends StObject
     with typings.officeJsPreview.Excel.RemoveDuplicatesResult {
  
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
