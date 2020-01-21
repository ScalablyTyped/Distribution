package typings.officeJsPreview.Excel

import typings.officeJsPreview.AnonExpand
import typings.officeJsPreview.Excel.Interfaces.NumberFormatInfoData
import typings.officeJsPreview.Excel.Interfaces.NumberFormatInfoLoadOptions
import typings.officeJsPreview.OfficeExtension.ClientObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Defines the culturally appropriate format of displaying numbers. This is based on current system culture settings.
  *
  * [Api set: ExcelApi BETA (PREVIEW ONLY)]
  * @beta
  */
@JSGlobal("Excel.NumberFormatInfo")
@js.native
class NumberFormatInfo () extends ClientObject {
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_NumberFormatInfo: RequestContext = js.native
  /**
    *
    * Gets the string used as the decimal separator for numeric values. This is based on current system settings.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  val numberDecimalSeparator: String = js.native
  /**
    *
    * Gets the string used to separate groups of digits to the left of the decimal for numeric values. This is based on current system settings.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  val numberGroupSeparator: String = js.native
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): NumberFormatInfo = js.native
  def load(options: NumberFormatInfoLoadOptions): NumberFormatInfo = js.native
  def load(propertyNamesAndPaths: AnonExpand): NumberFormatInfo = js.native
  def load(propertyNames: String): NumberFormatInfo = js.native
  def load(propertyNames: js.Array[String]): NumberFormatInfo = js.native
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original Excel.NumberFormatInfo object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.NumberFormatInfoData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): NumberFormatInfoData = js.native
}

