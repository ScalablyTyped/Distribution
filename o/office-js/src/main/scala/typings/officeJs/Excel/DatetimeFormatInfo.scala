package typings.officeJs.Excel

import typings.officeJs.Excel.Interfaces.DatetimeFormatInfoData
import typings.officeJs.Excel.Interfaces.DatetimeFormatInfoLoadOptions
import typings.officeJs.OfficeExtension.ClientObject
import typings.officeJs.anon.Expand
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Defines the culturally appropriate format of displaying numbers. This is based on current system culture settings.
  *
  * @remarks
  * [Api set: ExcelApi 1.12]
  */
@js.native
trait DatetimeFormatInfo
  extends StObject
     with ClientObject {
  
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_DatetimeFormatInfo: RequestContext = js.native
  
  /**
    * Gets the string used as the date separator. This is based on current system settings.
    *
    * @remarks
    * [Api set: ExcelApi 1.12]
    */
  val dateSeparator: String = js.native
  
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): DatetimeFormatInfo = js.native
  def load(options: DatetimeFormatInfoLoadOptions): DatetimeFormatInfo = js.native
  def load(propertyNamesAndPaths: Expand): DatetimeFormatInfo = js.native
  def load(propertyNames: String): DatetimeFormatInfo = js.native
  def load(propertyNames: js.Array[String]): DatetimeFormatInfo = js.native
  
  /**
    * Gets the format string for a long date value. This is based on current system settings.
    *
    * @remarks
    * [Api set: ExcelApi 1.12]
    */
  val longDatePattern: String = js.native
  
  /**
    * Gets the format string for a long time value. This is based on current system settings.
    *
    * @remarks
    * [Api set: ExcelApi 1.12]
    */
  val longTimePattern: String = js.native
  
  /**
    * Gets the format string for a short date value. This is based on current system settings.
    *
    * @remarks
    * [Api set: ExcelApi 1.12]
    */
  val shortDatePattern: String = js.native
  
  /**
    * Gets the string used as the time separator. This is based on current system settings.
    *
    * @remarks
    * [Api set: ExcelApi 1.12]
    */
  val timeSeparator: String = js.native
  
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original Excel.DatetimeFormatInfo object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.DatetimeFormatInfoData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): DatetimeFormatInfoData = js.native
}
