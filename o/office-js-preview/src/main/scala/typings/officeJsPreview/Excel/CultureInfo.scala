package typings.officeJsPreview.Excel

import typings.officeJsPreview.AnonExpand
import typings.officeJsPreview.Excel.Interfaces.CultureInfoData
import typings.officeJsPreview.Excel.Interfaces.CultureInfoLoadOptions
import typings.officeJsPreview.OfficeExtension.ClientObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Provides information based on current system culture settings. This includes the culture names, number formatting, and other culturally dependent settings.
  *
  * [Api set: ExcelApi BETA (PREVIEW ONLY)]
  * @beta
  */
@JSGlobal("Excel.CultureInfo")
@js.native
class CultureInfo () extends ClientObject {
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_CultureInfo: RequestContext = js.native
  /**
    *
    * Defines the culturally appropriate format of displaying date and time. This is based on current system culture settings.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  val datetimeFormat: DatetimeFormatInfo = js.native
  /**
    *
    * Gets the culture name in the format languagecode2-country/regioncode2 (e.g. "zh-cn" or "en-us"). This is based on current system settings.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  val name: String = js.native
  /**
    *
    * Defines the culturally appropriate format of displaying numbers. This is based on current system culture settings.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  val numberFormat: NumberFormatInfo = js.native
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): CultureInfo = js.native
  def load(options: CultureInfoLoadOptions): CultureInfo = js.native
  def load(propertyNamesAndPaths: AnonExpand): CultureInfo = js.native
  def load(propertyNames: String): CultureInfo = js.native
  def load(propertyNames: js.Array[String]): CultureInfo = js.native
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original Excel.CultureInfo object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.CultureInfoData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): CultureInfoData = js.native
}

