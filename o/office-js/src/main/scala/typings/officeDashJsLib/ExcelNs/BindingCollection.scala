package typings
package officeDashJsLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents the collection of all the binding objects that are part of the workbook.
  *
  * [Api set: ExcelApi 1.1]
  */
@JSGlobal("Excel.BindingCollection")
@js.native
class BindingCollection ()
  extends officeDashJsLib.OfficeExtensionNs.ClientObject {
  /**
    *
    * Returns the number of bindings in the collection. Read-only.
    *
    * [Api set: ExcelApi 1.1]
    */
  val count: scala.Double = js.native
  /** Gets the loaded child items in this collection. */
  val items: js.Array[Binding] = js.native
  def add(range: java.lang.String, bindingType: BindingType, id: java.lang.String): Binding = js.native
  /**
    *
    * Add a new binding to a particular Range.
    *
    * [Api set: ExcelApi 1.3]
    *
    * @param range Range to bind the binding to. May be an Excel Range object, or a string. If string, must contain the full address, including the sheet name
    * @param bindingType Type of binding. See Excel.BindingType.
    * @param id Name of binding.
    */
  def add(range: Range, bindingType: BindingType, id: java.lang.String): Binding = js.native
  /**
    *
    * Add a new binding based on a named item in the workbook.
    If the named item references to multiple areas, the "InvalidReference" error will be returned.
    *
    * [Api set: ExcelApi 1.3]
    *
    * @param name Name from which to create binding.
    * @param bindingType Type of binding. See Excel.BindingType.
    * @param id Name of binding.
    */
  def addFromNamedItem(name: java.lang.String, bindingType: BindingType, id: java.lang.String): Binding = js.native
  /**
    *
    * Add a new binding based on a named item in the workbook.
    If the named item references to multiple areas, the "InvalidReference" error will be returned.
    *
    * [Api set: ExcelApi 1.3]
    *
    * @param name Name from which to create binding.
    * @param bindingType Type of binding. See Excel.BindingType.
    * @param id Name of binding.
    */
  @JSName("addFromNamedItem")
  def addFromNamedItem_Range(
    name: java.lang.String,
    bindingType: officeDashJsLib.officeDashJsLibStrings.Range,
    id: java.lang.String
  ): Binding = js.native
  @JSName("addFromNamedItem")
  def addFromNamedItem_Table(
    name: java.lang.String,
    bindingType: officeDashJsLib.officeDashJsLibStrings.Table,
    id: java.lang.String
  ): Binding = js.native
  @JSName("addFromNamedItem")
  def addFromNamedItem_Text(
    name: java.lang.String,
    bindingType: officeDashJsLib.officeDashJsLibStrings.Text,
    id: java.lang.String
  ): Binding = js.native
  /**
    *
    * Add a new binding based on the current selection.
    If the selection has multiple areas, the "InvalidReference" error will be returned.
    *
    * [Api set: ExcelApi 1.3]
    *
    * @param bindingType Type of binding. See Excel.BindingType.
    * @param id Name of binding.
    */
  def addFromSelection(bindingType: BindingType, id: java.lang.String): Binding = js.native
  /**
    *
    * Add a new binding based on the current selection.
    If the selection has multiple areas, the "InvalidReference" error will be returned.
    *
    * [Api set: ExcelApi 1.3]
    *
    * @param bindingType Type of binding. See Excel.BindingType.
    * @param id Name of binding.
    */
  @JSName("addFromSelection")
  def addFromSelection_Range(bindingType: officeDashJsLib.officeDashJsLibStrings.Range, id: java.lang.String): Binding = js.native
  @JSName("addFromSelection")
  def addFromSelection_Table(bindingType: officeDashJsLib.officeDashJsLibStrings.Table, id: java.lang.String): Binding = js.native
  @JSName("addFromSelection")
  def addFromSelection_Text(bindingType: officeDashJsLib.officeDashJsLibStrings.Text, id: java.lang.String): Binding = js.native
  @JSName("add")
  def add_Range(
    range: java.lang.String,
    bindingType: officeDashJsLib.officeDashJsLibStrings.Range,
    id: java.lang.String
  ): Binding = js.native
  /**
    *
    * Add a new binding to a particular Range.
    *
    * [Api set: ExcelApi 1.3]
    *
    * @param range Range to bind the binding to. May be an Excel Range object, or a string. If string, must contain the full address, including the sheet name
    * @param bindingType Type of binding. See Excel.BindingType.
    * @param id Name of binding.
    */
  @JSName("add")
  def add_Range(range: Range, bindingType: officeDashJsLib.officeDashJsLibStrings.Range, id: java.lang.String): Binding = js.native
  @JSName("add")
  def add_Table(
    range: java.lang.String,
    bindingType: officeDashJsLib.officeDashJsLibStrings.Table,
    id: java.lang.String
  ): Binding = js.native
  @JSName("add")
  def add_Table(range: Range, bindingType: officeDashJsLib.officeDashJsLibStrings.Table, id: java.lang.String): Binding = js.native
  @JSName("add")
  def add_Text(
    range: java.lang.String,
    bindingType: officeDashJsLib.officeDashJsLibStrings.Text,
    id: java.lang.String
  ): Binding = js.native
  @JSName("add")
  def add_Text(range: Range, bindingType: officeDashJsLib.officeDashJsLibStrings.Text, id: java.lang.String): Binding = js.native
  /**
    *
    * Gets the number of bindings in the collection.
    *
    * [Api set: ExcelApi 1.4]
    */
  def getCount(): officeDashJsLib.OfficeExtensionNs.ClientResult[scala.Double] = js.native
  /**
    *
    * Gets a binding object by ID.
    *
    * [Api set: ExcelApi 1.1]
    *
    * @param id Id of the binding object to be retrieved.
    */
  def getItem(id: java.lang.String): Binding = js.native
  /**
    *
    * Gets a binding object based on its position in the items array.
    *
    * [Api set: ExcelApi 1.1]
    *
    * @param index Index value of the object to be retrieved. Zero-indexed.
    */
  def getItemAt(index: scala.Double): Binding = js.native
  /**
    *
    * Gets a binding object by ID. If the binding object does not exist, will return a null object.
    *
    * [Api set: ExcelApi 1.4]
    *
    * @param id Id of the binding object to be retrieved.
    */
  def getItemOrNullObject(id: java.lang.String): Binding = js.native
  /**
    * Queues up a command to load the specified properties of the object. You must call "context.sync()" before reading the properties.
    *
    * @remarks
    *
    * In addition to this signature, this method has the following signatures:
    *
    * `load(option?: string | string[]): Excel.BindingCollection` - Where option is a comma-delimited string or an array of strings that specify the properties to load.
    *
    * `load(option?: { select?: string; expand?: string; }): Excel.BindingCollection` - Where option.select is a comma-delimited string that specifies the properties to load, and options.expand is a comma-delimited string that specifies the navigation properties to load.
    *
    * `load(option?: { select?: string; expand?: string; top?: number; skip?: number }): Excel.BindingCollection` - Only available on collection types. It is similar to the preceding signature. Option.top specifies the maximum number of collection items that can be included in the result. Option.skip specifies the number of items that are to be skipped and not included in the result. If option.top is specified, the result set will start after skipping the specified number of items.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): BindingCollection = js.native
  def load(
    option: officeDashJsLib.ExcelNs.InterfacesNs.BindingCollectionLoadOptions with officeDashJsLib.ExcelNs.InterfacesNs.CollectionLoadOptions
  ): BindingCollection = js.native
  def load(option: java.lang.String): BindingCollection = js.native
  def load(option: js.Array[java.lang.String]): BindingCollection = js.native
  def load(option: officeDashJsLib.OfficeExtensionNs.LoadOption): BindingCollection = js.native
  def toJSON(): officeDashJsLib.ExcelNs.InterfacesNs.BindingCollectionData = js.native
}

