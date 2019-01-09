package typings
package officeDashJsLib.ExcelNs

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
  extends officeDashJsLib.OfficeExtensionNs.ClientObject {
  /**
    *
    * Error value (such as "#DIV/0") representing the error. If the error string is not set, then the function succeeded, and its result is written to the Value field. The error is always in the English locale.
    *
    * [Api set: ExcelApi 1.2]
    */
  val error: java.lang.String = js.native
  /**
    *
    * The value of function evaluation. The value field will be populated only if no error has occurred (i.e., the Error property is not set).
    *
    * [Api set: ExcelApi 1.2]
    */
  val value: T = js.native
  /**
    * Queues up a command to load the specified properties of the object. You must call "context.sync()" before reading the properties.
    *
    * @remarks
    *
    * In addition to this signature, this method has the following signatures:
    *
    * `load(option?: string | string[]): FunctionResult<T>` - Where option is a comma-delimited string or an array of strings that specify the properties to load.
    *
    * `load(option?: { select?: string; expand?: string; }): FunctionResult<T>` - Where option.select is a comma-delimited string that specifies the properties to load, and options.expand is a comma-delimited string that specifies the navigation properties to load.
    *
    * `load(option?: { select?: string; expand?: string; top?: number; skip?: number }): FunctionResult<T>` - Only available on collection types. It is similar to the preceding signature. Option.top specifies the maximum number of collection items that can be included in the result. Option.skip specifies the number of items that are to be skipped and not included in the result. If option.top is specified, the result set will start after skipping the specified number of items.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): FunctionResult[T] = js.native
  def load(option: java.lang.String): FunctionResult[T] = js.native
  def load(option: js.Array[java.lang.String]): FunctionResult[T] = js.native
  def load(option: officeDashJsLib.Anon_Expand): FunctionResult[T] = js.native
  def load(option: officeDashJsLib.ExcelNs.InterfacesNs.FunctionResultLoadOptions): FunctionResult[T] = js.native
  def toJSON(): officeDashJsLib.ExcelNs.InterfacesNs.FunctionResultData[T] = js.native
}

