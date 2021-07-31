package typings.officeJs.global.Excel

import typings.officeJs.OfficeExtension.ClientRequestContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Represents a collection of one or more rectangular ranges in multiple worksheets.
  *
  * [Api set: ExcelApi 1.12]
  */
@JSGlobal("Excel.WorkbookRangeAreas")
@js.native
class WorkbookRangeAreas ()
  extends StObject
     with typings.officeJs.Excel.WorkbookRangeAreas {
  
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
