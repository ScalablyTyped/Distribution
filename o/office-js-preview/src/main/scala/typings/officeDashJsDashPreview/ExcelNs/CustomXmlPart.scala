package typings.officeDashJsDashPreview.ExcelNs

import typings.officeDashJsDashPreview.Anon_Expand
import typings.officeDashJsDashPreview.ExcelNs.InterfacesNs.CustomXmlPartData
import typings.officeDashJsDashPreview.ExcelNs.InterfacesNs.CustomXmlPartLoadOptions
import typings.officeDashJsDashPreview.OfficeExtensionNs.ClientObject
import typings.officeDashJsDashPreview.OfficeExtensionNs.ClientResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents a custom XML part object in a workbook.
  *
  * [Api set: ExcelApi 1.5]
  */
@JSGlobal("Excel.CustomXmlPart")
@js.native
class CustomXmlPart () extends ClientObject {
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_CustomXmlPart: RequestContext = js.native
  /**
    *
    * The custom XML part's ID. Read-only.
    *
    * [Api set: ExcelApi 1.5]
    */
  val id: String = js.native
  /**
    *
    * The custom XML part's namespace URI. Read-only.
    *
    * [Api set: ExcelApi 1.5]
    */
  val namespaceUri: String = js.native
  /**
    *
    * Deletes the custom XML part.
    *
    * [Api set: ExcelApi 1.5]
    */
  def delete(): Unit = js.native
  /**
    *
    * Gets the custom XML part's full XML content.
    *
    * [Api set: ExcelApi 1.5]
    */
  def getXml(): ClientResult[String] = js.native
  /**
    * Queues up a command to load the specified properties of the object. You must call "context.sync()" before reading the properties.
    *
    * @remarks
    *
    * In addition to this signature, this method has the following signatures:
    *
    * `load(option?: string | string[]): Excel.CustomXmlPart` - Where option is a comma-delimited string or an array of strings that specify the properties to load.
    *
    * `load(option?: { select?: string; expand?: string; }): Excel.CustomXmlPart` - Where option.select is a comma-delimited string that specifies the properties to load, and options.expand is a comma-delimited string that specifies the navigation properties to load.
    *
    * `load(option?: { select?: string; expand?: string; top?: number; skip?: number }): Excel.CustomXmlPart` - Only available on collection types. It is similar to the preceding signature. Option.top specifies the maximum number of collection items that can be included in the result. Option.skip specifies the number of items that are to be skipped and not included in the result. If option.top is specified, the result set will start after skipping the specified number of items.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): CustomXmlPart = js.native
  def load(option: String): CustomXmlPart = js.native
  def load(option: js.Array[String]): CustomXmlPart = js.native
  def load(option: Anon_Expand): CustomXmlPart = js.native
  def load(option: CustomXmlPartLoadOptions): CustomXmlPart = js.native
  /**
    *
    * Sets the custom XML part's full XML content.
    *
    * [Api set: ExcelApi 1.5]
    *
    * @param xml XML content for the part.
    */
  def setXml(xml: String): Unit = js.native
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original Excel.CustomXmlPart object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.CustomXmlPartData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): CustomXmlPartData = js.native
}

