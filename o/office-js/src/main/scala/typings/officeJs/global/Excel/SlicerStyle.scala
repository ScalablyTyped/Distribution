package typings.officeJs.global.Excel

import typings.officeJs.OfficeExtension.ClientRequestContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents a Slicer Style, which defines style elements by region of the slicer.
  *
  * [Api set: ExcelApi 1.10]
  */
@JSGlobal("Excel.SlicerStyle")
@js.native
class SlicerStyle ()
  extends typings.officeJs.Excel.SlicerStyle {
  /** The request context associated with the object */
  /* CompleteClass */
  override var context: ClientRequestContext = js.native
  /**
    *  Returns a boolean value for whether the corresponding object is a null object. You must call `context.sync()` before reading the 
    * isNullObject property.
    */
  /* CompleteClass */
  override var isNullObject: Boolean = js.native
}

