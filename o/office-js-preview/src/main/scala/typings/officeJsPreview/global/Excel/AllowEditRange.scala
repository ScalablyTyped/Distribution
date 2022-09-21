package typings.officeJsPreview.global.Excel

import typings.officeJsPreview.OfficeExtension.ClientRequestContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents an `AllowEditRange` object found in a worksheet. This object works with worksheet protection properties.
  When worksheet protection is enabled, an `AllowEditRange` object can be used to allow editing of a specific range, while maintaining protection on the rest of the worksheet.
  *
  * @remarks
  * [Api set: ExcelApiOnline 1.1]
  */
@JSGlobal("Excel.AllowEditRange")
@js.native
open class AllowEditRange ()
  extends StObject
     with typings.officeJsPreview.Excel.AllowEditRange {
  
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
