package typings.officeDashJs.ExcelNs

import typings.officeDashJs.ExcelNs.InterfacesNs.CollectionLoadOptions
import typings.officeDashJs.ExcelNs.InterfacesNs.ConditionalFormatCollectionData
import typings.officeDashJs.ExcelNs.InterfacesNs.ConditionalFormatCollectionLoadOptions
import typings.officeDashJs.OfficeExtensionNs.ClientObject
import typings.officeDashJs.OfficeExtensionNs.ClientResult
import typings.officeDashJs.OfficeExtensionNs.LoadOption
import typings.officeDashJs.officeDashJsStrings.CellValue
import typings.officeDashJs.officeDashJsStrings.ColorScale
import typings.officeDashJs.officeDashJsStrings.ContainsText
import typings.officeDashJs.officeDashJsStrings.Custom
import typings.officeDashJs.officeDashJsStrings.DataBar
import typings.officeDashJs.officeDashJsStrings.PresetCriteria
import typings.officeDashJs.officeDashJsStrings.TopBottom
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents a collection of all the conditional formats that are overlap the range.
  *
  * [Api set: ExcelApi 1.6]
  */
@JSGlobal("Excel.ConditionalFormatCollection")
@js.native
class ConditionalFormatCollection () extends ClientObject {
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_ConditionalFormatCollection: RequestContext = js.native
  /** Gets the loaded child items in this collection. */
  val items: js.Array[ConditionalFormat] = js.native
  /**
    *
    * Adds a new conditional format to the collection at the first/top priority.
    *
    * [Api set: ExcelApi 1.6]
    *
    * @param type The type of conditional format being added. See Excel.ConditionalFormatType for details.
    */
  def add(`type`: ConditionalFormatType): ConditionalFormat = js.native
  @JSName("add")
  def add_CellValue(`type`: CellValue): ConditionalFormat = js.native
  @JSName("add")
  def add_ColorScale(`type`: ColorScale): ConditionalFormat = js.native
  @JSName("add")
  def add_ContainsText(`type`: ContainsText): ConditionalFormat = js.native
  /**
    *
    * Adds a new conditional format to the collection at the first/top priority.
    *
    * [Api set: ExcelApi 1.6]
    *
    * @param type The type of conditional format being added. See Excel.ConditionalFormatType for details.
    */
  @JSName("add")
  def add_Custom(`type`: Custom): ConditionalFormat = js.native
  @JSName("add")
  def add_DataBar(`type`: DataBar): ConditionalFormat = js.native
  @JSName("add")
  def add_IconSet(`type`: typings.officeDashJs.officeDashJsStrings.IconSet): ConditionalFormat = js.native
  @JSName("add")
  def add_PresetCriteria(`type`: PresetCriteria): ConditionalFormat = js.native
  @JSName("add")
  def add_TopBottom(`type`: TopBottom): ConditionalFormat = js.native
  /**
    *
    * Clears all conditional formats active on the current specified range.
    *
    * [Api set: ExcelApi 1.6]
    */
  def clearAll(): Unit = js.native
  /**
    *
    * Returns the number of conditional formats in the workbook. Read-only.
    *
    * [Api set: ExcelApi 1.6]
    */
  def getCount(): ClientResult[Double] = js.native
  /**
    *
    * Returns a conditional format for the given ID.
    *
    * [Api set: ExcelApi 1.6]
    *
    * @param id The id of the conditional format.
    * @returns Conditional Format object.
    */
  def getItem(id: String): ConditionalFormat = js.native
  /**
    *
    * Returns a conditional format at the given index.
    *
    * [Api set: ExcelApi 1.6]
    *
    * @param index Index of the conditional formats to be retrieved.
    */
  def getItemAt(index: Double): ConditionalFormat = js.native
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): ConditionalFormatCollection = js.native
  def load(options: ConditionalFormatCollectionLoadOptions with CollectionLoadOptions): ConditionalFormatCollection = js.native
  def load(propertyNamesAndPaths: LoadOption): ConditionalFormatCollection = js.native
  def load(propertyNames: String): ConditionalFormatCollection = js.native
  def load(propertyNames: js.Array[String]): ConditionalFormatCollection = js.native
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original `Excel.ConditionalFormatCollection` object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.ConditionalFormatCollectionData`) that contains an "items" array with shallow copies of any loaded properties from the collection's items.
    */
  def toJSON(): ConditionalFormatCollectionData = js.native
}

