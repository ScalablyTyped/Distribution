package typings.officeJs.global.Excel

import typings.officeJs.OfficeExtension.ClientRequestContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents a shape group inside a worksheet. To get the corresponding Shape object, use `ShapeGroup.shape`.
  *
  * [Api set: ExcelApi 1.9]
  */
@JSGlobal("Excel.ShapeGroup")
@js.native
class ShapeGroup ()
  extends typings.officeJs.Excel.ShapeGroup {
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

