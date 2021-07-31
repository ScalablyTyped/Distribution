package typings.officeJs.global.Excel

import typings.officeJs.OfficeExtension.ClientRequestContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Range represents a set of one or more contiguous cells such as a cell, a row, a column, block of cells, etc.
  To learn more about how ranges are used throughout the API, read {@link https://docs.microsoft.com/office/dev/add-ins/excel/excel-add-ins-ranges | Work with ranges using the Excel JavaScript API}
  and {@link https://docs.microsoft.com/office/dev/add-ins/excel/excel-add-ins-ranges-advanced | Work with ranges using the Excel JavaScript API (advanced)}.
  *
  * [Api set: ExcelApi 1.1]
  */
@JSGlobal("Excel.Range")
@js.native
class Range ()
  extends StObject
     with typings.officeJs.Excel.Range {
  
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
