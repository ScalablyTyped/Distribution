package typings.officeJsPreview.Excel

import typings.officeJsPreview.Excel.Interfaces.HeaderFooterData
import typings.officeJsPreview.Excel.Interfaces.HeaderFooterLoadOptions
import typings.officeJsPreview.Excel.Interfaces.HeaderFooterUpdateData
import typings.officeJsPreview.OfficeExtension.ClientObject
import typings.officeJsPreview.OfficeExtension.UpdateOptions
import typings.officeJsPreview.anon.Expand
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * [Api set: ExcelApi 1.9]
  */
@js.native
trait HeaderFooter extends ClientObject {
  /**
    *
    * The center footer of the worksheet.
    To apply font formatting or insert a variable value, use format codes specified here: https://msdn.microsoft.com/library/bb225426.aspx.
    *
    * [Api set: ExcelApi 1.9]
    */
  var centerFooter: String = js.native
  /**
    *
    * The center header of the worksheet.
    To apply font formatting or insert a variable value, use format codes specified here: https://msdn.microsoft.com/library/bb225426.aspx.
    *
    * [Api set: ExcelApi 1.9]
    */
  var centerHeader: String = js.native
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_HeaderFooter: RequestContext = js.native
  /**
    *
    * The left footer of the worksheet.
    To apply font formatting or insert a variable value, use format codes specified here: https://msdn.microsoft.com/library/bb225426.aspx.
    *
    * [Api set: ExcelApi 1.9]
    */
  var leftFooter: String = js.native
  /**
    *
    * The left header of the worksheet.
    To apply font formatting or insert a variable value, use format codes specified here: https://msdn.microsoft.com/library/bb225426.aspx.
    *
    * [Api set: ExcelApi 1.9]
    */
  var leftHeader: String = js.native
  /**
    *
    * The right footer of the worksheet.
    To apply font formatting or insert a variable value, use format codes specified here: https://msdn.microsoft.com/library/bb225426.aspx.
    *
    * [Api set: ExcelApi 1.9]
    */
  var rightFooter: String = js.native
  /**
    *
    * The right header of the worksheet.
    To apply font formatting or insert a variable value, use format codes specified here: https://msdn.microsoft.com/library/bb225426.aspx.
    *
    * [Api set: ExcelApi 1.9]
    */
  var rightHeader: String = js.native
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): HeaderFooter = js.native
  def load(options: HeaderFooterLoadOptions): HeaderFooter = js.native
  def load(propertyNamesAndPaths: Expand): HeaderFooter = js.native
  def load(propertyNames: String): HeaderFooter = js.native
  def load(propertyNames: js.Array[String]): HeaderFooter = js.native
  /** Sets multiple properties on the object at the same time, based on an existing loaded object. */
  def set(properties: HeaderFooter): Unit = js.native
  /** Sets multiple properties of an object at the same time. You can pass either a plain object with the appropriate properties, or another API object of the same type.
    *
    * @remarks
    *
    * This method has the following additional signature:
    *
    * `set(properties: Excel.HeaderFooter): void`
    *
    * @param properties A JavaScript object with properties that are structured isomorphically to the properties of the object on which the method is called.
    * @param options Provides an option to suppress errors if the properties object tries to set any read-only properties.
    */
  def set(properties: HeaderFooterUpdateData): Unit = js.native
  def set(properties: HeaderFooterUpdateData, options: UpdateOptions): Unit = js.native
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original Excel.HeaderFooter object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.HeaderFooterData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): HeaderFooterData = js.native
}

