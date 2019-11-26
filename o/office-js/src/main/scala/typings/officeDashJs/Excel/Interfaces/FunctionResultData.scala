package typings.officeDashJs.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling `functionResult.toJSON()`. */
trait FunctionResultData[T] extends js.Object {
  /**
    *
    * Error value (such as "#DIV/0") representing the error. If the error string is not set, then the function succeeded, and its result is written to the Value field. The error is always in the English locale.
    *
    * [Api set: ExcelApi 1.2]
    */
  var error: js.UndefOr[String] = js.undefined
  /**
    *
    * The value of function evaluation. The value field will be populated only if no error has occurred (i.e., the Error property is not set).
    *
    * [Api set: ExcelApi 1.2]
    */
  var value: js.UndefOr[T] = js.undefined
}

object FunctionResultData {
  @scala.inline
  def apply[T](error: String = null, value: T = null): FunctionResultData[T] = {
    val __obj = js.Dynamic.literal()
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[FunctionResultData[T]]
  }
}

