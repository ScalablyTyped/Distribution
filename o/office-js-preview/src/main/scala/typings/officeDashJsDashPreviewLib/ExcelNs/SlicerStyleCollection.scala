package typings
package officeDashJsDashPreviewLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents a collection of SlicerStyle objects.
  *
  * [Api set: ExcelApi BETA (PREVIEW ONLY)]
  * @beta
  */
@JSGlobal("Excel.SlicerStyleCollection")
@js.native
class SlicerStyleCollection ()
  extends officeDashJsDashPreviewLib.OfficeExtensionNs.ClientObject {
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_SlicerStyleCollection: RequestContext = js.native
  /** Gets the loaded child items in this collection. */
  val items: js.Array[SlicerStyle] = js.native
  /**
    *
    * Creates a blank SlicerStyle with the specified name.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    *
    * @param name The unique name for the new SlicerStyle. Will throw an invalid argument exception if the name is already in use.
    * @param makeUniqueName Optional, defaults to false. If true, will append numbers to the name in order to make it unique, if needed.
    * @returns The newly created SlicerStyle.
    */
  def add(name: java.lang.String): SlicerStyle = js.native
  def add(name: java.lang.String, makeUniqueName: scala.Boolean): SlicerStyle = js.native
  /**
    *
    * Gets the number of slicer styles in the collection.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  def getCount(): officeDashJsDashPreviewLib.OfficeExtensionNs.ClientResult[scala.Double] = js.native
  /**
    *
    * Gets the default SlicerStyle for the parent object's scope.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    * @returns The SlicerStyle object that is the current default SlicerStyle.
    */
  def getDefault(): SlicerStyle = js.native
  /**
    *
    * Gets a SlicerStyle by name.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    *
    * @param name Name of the SlicerStyle to be retrieved.
    * @returns The SlicerStyle object whose name matches the input.
    */
  def getItem(name: java.lang.String): SlicerStyle = js.native
  /**
    *
    * Gets a SlicerStyle by name. If the SlicerStyle does not exist, will return a null object.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    *
    * @param name Name of the SlicerStyle to be retrieved.
    * @returns The SlicerStyle object whose name matches the input.
    */
  def getItemOrNullObject(name: java.lang.String): SlicerStyle = js.native
  /**
    * Queues up a command to load the specified properties of the object. You must call "context.sync()" before reading the properties.
    *
    * @remarks
    *
    * In addition to this signature, this method has the following signatures:
    *
    * `load(option?: string | string[]): Excel.SlicerStyleCollection` - Where option is a comma-delimited string or an array of strings that specify the properties to load.
    *
    * `load(option?: { select?: string; expand?: string; }): Excel.SlicerStyleCollection` - Where option.select is a comma-delimited string that specifies the properties to load, and options.expand is a comma-delimited string that specifies the navigation properties to load.
    *
    * `load(option?: { select?: string; expand?: string; top?: number; skip?: number }): Excel.SlicerStyleCollection` - Only available on collection types. It is similar to the preceding signature. Option.top specifies the maximum number of collection items that can be included in the result. Option.skip specifies the number of items that are to be skipped and not included in the result. If option.top is specified, the result set will start after skipping the specified number of items.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): SlicerStyleCollection = js.native
  def load(
    option: officeDashJsDashPreviewLib.ExcelNs.InterfacesNs.SlicerStyleCollectionLoadOptions with officeDashJsDashPreviewLib.ExcelNs.InterfacesNs.CollectionLoadOptions
  ): SlicerStyleCollection = js.native
  def load(option: java.lang.String): SlicerStyleCollection = js.native
  def load(option: js.Array[java.lang.String]): SlicerStyleCollection = js.native
  def load(option: officeDashJsDashPreviewLib.OfficeExtensionNs.LoadOption): SlicerStyleCollection = js.native
  def setDefault(newDefaultStyle: java.lang.String): scala.Unit = js.native
  /**
    *
    * Sets the default SlicerStyle for use in the parent object's scope.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    *
    * @param newDefaultStyle The SlicerStyle object or name of the SlicerStyle object that should be the new default.
    */
  def setDefault(newDefaultStyle: SlicerStyle): scala.Unit = js.native
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original `Excel.SlicerStyleCollection` object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.SlicerStyleCollectionData`) that contains an "items" array with shallow copies of any loaded properties from the collection's items.
    */
  def toJSON(): officeDashJsDashPreviewLib.ExcelNs.InterfacesNs.SlicerStyleCollectionData = js.native
}

