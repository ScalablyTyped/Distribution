package typings.officeJsPreview.Excel

import typings.officeJsPreview.Excel.Interfaces.FunctionResultData
import typings.officeJsPreview.Excel.Interfaces.FunctionResultLoadOptions
import typings.officeJsPreview.OfficeExtension.ClientObject
import typings.officeJsPreview.anon.Expand
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * An object containing the result of a function-evaluation operation
  *
  * [Api set: ExcelApi 1.2]
  */
@js.native
trait FunctionResult[T]
  extends StObject
     with ClientObject {
  
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_FunctionResult: RequestContext = js.native
  
  /**
    *
    * Error value (such as "#DIV/0") representing the error. If the error string is not set, then the function succeeded, and its result is written to the Value field. The error is always in the English locale.
    *
    * [Api set: ExcelApi 1.2]
    */
  val error: String = js.native
  
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): FunctionResult[T] = js.native
  def load(options: FunctionResultLoadOptions): FunctionResult[T] = js.native
  def load(propertyNamesAndPaths: Expand): FunctionResult[T] = js.native
  def load(propertyNames: String): FunctionResult[T] = js.native
  def load(propertyNames: js.Array[String]): FunctionResult[T] = js.native
  
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original FunctionResult<T> object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Interfaces.FunctionResultData<T>`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): FunctionResultData[T] = js.native
  
  /**
    *
    * The value of function evaluation. The value field will be populated only if no error has occurred (i.e., the Error property is not set).
    *
    * [Api set: ExcelApi 1.2]
    */
  val value: T = js.native
}
