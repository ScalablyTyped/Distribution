package typings
package officeDashJsDashPreviewLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents a collection of TableStyles.
  *
  * [Api set: ExcelApi BETA (PREVIEW ONLY)]
  * @beta
  */
@JSGlobal("Excel.TableStyleCollection")
@js.native
class TableStyleCollection ()
  extends officeDashJsDashPreviewLib.OfficeExtensionNs.ClientObject {
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_TableStyleCollection: RequestContext = js.native
  /** Gets the loaded child items in this collection. */
  val items: js.Array[TableStyle] = js.native
  /**
    *
    * Creates a blank TableStyle with the specified name.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    *
    * @param name The unique name for the new TableStyle. Will throw an invalid argument exception if the name is already in use.
    * @param makeUniqueName Optional, defaults to false. If true, will append numbers to the name in order to make it unique, if needed.
    * @returns The newly created TableStyle.
    */
  def add(name: java.lang.String): TableStyle = js.native
  def add(name: java.lang.String, makeUniqueName: scala.Boolean): TableStyle = js.native
  /**
    *
    * Gets the number of table styles in the collection.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  def getCount(): officeDashJsDashPreviewLib.OfficeExtensionNs.ClientResult[scala.Double] = js.native
  /**
    *
    * Gets the default TableStyle for the parent object's scope.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    * @returns The TableStyle object that is the current default TableStyle.
    */
  def getDefault(): TableStyle = js.native
  /**
    *
    * Gets a TableStyle by name.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    *
    * @param name Name of the TableStyle to be retrieved.
    * @returns The TableStyle object whose name matches the input.
    */
  def getItem(name: java.lang.String): TableStyle = js.native
  /**
    *
    * Gets a TableStyle by name. If the TableStyle does not exist, will return a null object.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    *
    * @param name Name of the TableStyle to be retrieved.
    * @returns The TableStyle object whose name matches the input.
    */
  def getItemOrNullObject(name: java.lang.String): TableStyle = js.native
  /**
    * Queues up a command to load the specified properties of the object. You must call "context.sync()" before reading the properties.
    *
    * @remarks
    *
    * In addition to this signature, this method has the following signatures:
    *
    * `load(option?: string | string[]): Excel.TableStyleCollection` - Where option is a comma-delimited string or an array of strings that specify the properties to load.
    *
    * `load(option?: { select?: string; expand?: string; }): Excel.TableStyleCollection` - Where option.select is a comma-delimited string that specifies the properties to load, and options.expand is a comma-delimited string that specifies the navigation properties to load.
    *
    * `load(option?: { select?: string; expand?: string; top?: number; skip?: number }): Excel.TableStyleCollection` - Only available on collection types. It is similar to the preceding signature. Option.top specifies the maximum number of collection items that can be included in the result. Option.skip specifies the number of items that are to be skipped and not included in the result. If option.top is specified, the result set will start after skipping the specified number of items.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): TableStyleCollection = js.native
  def load(
    option: officeDashJsDashPreviewLib.ExcelNs.InterfacesNs.TableStyleCollectionLoadOptions with officeDashJsDashPreviewLib.ExcelNs.InterfacesNs.CollectionLoadOptions
  ): TableStyleCollection = js.native
  def load(option: java.lang.String): TableStyleCollection = js.native
  def load(option: js.Array[java.lang.String]): TableStyleCollection = js.native
  def load(option: officeDashJsDashPreviewLib.OfficeExtensionNs.LoadOption): TableStyleCollection = js.native
  def setDefault(newDefaultStyle: java.lang.String): scala.Unit = js.native
  /**
    *
    * Sets the default TableStyle for use in the parent object's scope.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    *
    * @param newDefaultStyle The TableStyle object or name of the TableStyle object that should be the new default.
    */
  def setDefault(newDefaultStyle: TableStyle): scala.Unit = js.native
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original `Excel.TableStyleCollection` object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.TableStyleCollectionData`) that contains an "items" array with shallow copies of any loaded properties from the collection's items.
    */
  def toJSON(): officeDashJsDashPreviewLib.ExcelNs.InterfacesNs.TableStyleCollectionData = js.native
}

