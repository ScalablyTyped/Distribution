package typings.officeJs.global.Excel

import typings.officeJs.OfficeExtension.ClientRequestContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a PivotTable style, which defines style elements by PivotTable region.
  *
  * @remarks
  * [Api set: ExcelApi 1.10]
  */
@JSGlobal("Excel.PivotTableStyle")
@js.native
open class PivotTableStyle ()
  extends StObject
     with typings.officeJs.Excel.PivotTableStyle {
  
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
