package typings.officeJsPreview.global.Excel

import typings.officeJsPreview.OfficeExtension.ClientRequestContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Represents a conditional format DataBar Format for the negative side of the data bar.
  *
  * [Api set: ExcelApi 1.6]
  */
@JSGlobal("Excel.ConditionalDataBarNegativeFormat")
@js.native
class ConditionalDataBarNegativeFormat ()
  extends StObject
     with typings.officeJsPreview.Excel.ConditionalDataBarNegativeFormat {
  
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
