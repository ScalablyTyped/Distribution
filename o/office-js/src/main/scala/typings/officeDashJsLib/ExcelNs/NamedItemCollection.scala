package typings
package officeDashJsLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * A collection of all the NamedItem objects that are part of the workbook or worksheet, depending on how it was reached.
  *
  * [Api set: ExcelApi 1.1]
  */
@JSGlobal("Excel.NamedItemCollection")
@js.native
class NamedItemCollection ()
  extends officeDashJsLib.OfficeExtensionNs.ClientObject {
  /** Gets the loaded child items in this collection. */
  val items: js.Array[NamedItem] = js.native
  def add(name: java.lang.String, reference: java.lang.String): NamedItem = js.native
  def add(name: java.lang.String, reference: java.lang.String, comment: java.lang.String): NamedItem = js.native
  /**
    *
    * Adds a new name to the collection of the given scope.
    *
    * [Api set: ExcelApi 1.4]
    *
    * @param name The name of the named item.
    * @param reference The formula or the range that the name will refer to.
    * @param comment Optional. The comment associated with the named item.
    * @returns
    */
  def add(name: java.lang.String, reference: Range): NamedItem = js.native
  def add(name: java.lang.String, reference: Range, comment: java.lang.String): NamedItem = js.native
  /**
    *
    * Adds a new name to the collection of the given scope using the user's locale for the formula.
    *
    * [Api set: ExcelApi 1.4]
    *
    * @param name The "name" of the named item.
    * @param formula The formula in the user's locale that the name will refer to.
    * @param comment Optional. The comment associated with the named item.
    * @returns
    */
  def addFormulaLocal(name: java.lang.String, formula: java.lang.String): NamedItem = js.native
  def addFormulaLocal(name: java.lang.String, formula: java.lang.String, comment: java.lang.String): NamedItem = js.native
  /**
    *
    * Gets the number of named items in the collection.
    *
    * [Api set: ExcelApi 1.4]
    */
  def getCount(): officeDashJsLib.OfficeExtensionNs.ClientResult[scala.Double] = js.native
  /**
    *
    * Gets a NamedItem object using its name.
    *
    * [Api set: ExcelApi 1.1]
    *
    * @param name Nameditem name.
    */
  def getItem(name: java.lang.String): NamedItem = js.native
  /**
    *
    * Gets a NamedItem object using its name. If the nameditem object does not exist, will return a null object.
    *
    * [Api set: ExcelApi 1.4]
    *
    * @param name Nameditem name.
    */
  def getItemOrNullObject(name: java.lang.String): NamedItem = js.native
  /**
    * Queues up a command to load the specified properties of the object. You must call "context.sync()" before reading the properties.
    *
    * @remarks
    *
    * In addition to this signature, this method has the following signatures:
    *
    * `load(option?: string | string[]): Excel.NamedItemCollection` - Where option is a comma-delimited string or an array of strings that specify the properties to load.
    *
    * `load(option?: { select?: string; expand?: string; }): Excel.NamedItemCollection` - Where option.select is a comma-delimited string that specifies the properties to load, and options.expand is a comma-delimited string that specifies the navigation properties to load.
    *
    * `load(option?: { select?: string; expand?: string; top?: number; skip?: number }): Excel.NamedItemCollection` - Only available on collection types. It is similar to the preceding signature. Option.top specifies the maximum number of collection items that can be included in the result. Option.skip specifies the number of items that are to be skipped and not included in the result. If option.top is specified, the result set will start after skipping the specified number of items.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): NamedItemCollection = js.native
  def load(
    option: officeDashJsLib.ExcelNs.InterfacesNs.NamedItemCollectionLoadOptions with officeDashJsLib.ExcelNs.InterfacesNs.CollectionLoadOptions
  ): NamedItemCollection = js.native
  def load(option: java.lang.String): NamedItemCollection = js.native
  def load(option: js.Array[java.lang.String]): NamedItemCollection = js.native
  def load(option: officeDashJsLib.OfficeExtensionNs.LoadOption): NamedItemCollection = js.native
  def toJSON(): officeDashJsLib.ExcelNs.InterfacesNs.NamedItemCollectionData = js.native
}

