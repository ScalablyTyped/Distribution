package typings.officeJs.global.Excel

import typings.officeJs.OfficeExtension.ClientRequestContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * This object represents the font attributes (font name, font size, color, etc.) for an object.
  *
  * [Api set: ExcelApi 1.1]
  */
@JSGlobal("Excel.RangeFont")
@js.native
class RangeFont ()
  extends typings.officeJs.Excel.RangeFont {
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

