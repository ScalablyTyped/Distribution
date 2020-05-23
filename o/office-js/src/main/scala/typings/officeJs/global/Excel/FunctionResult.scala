package typings.officeJs.global.Excel

import typings.officeJs.OfficeExtension.ClientRequestContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * An object containing the result of a function-evaluation operation
  *
  * [Api set: ExcelApi 1.2]
  */
@JSGlobal("Excel.FunctionResult")
@js.native
class FunctionResult[T] ()
  extends typings.officeJs.Excel.FunctionResult[T] {
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

