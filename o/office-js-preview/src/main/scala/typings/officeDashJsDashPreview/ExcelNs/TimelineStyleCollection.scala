package typings.officeDashJsDashPreview.ExcelNs

import typings.officeDashJsDashPreview.ExcelNs.InterfacesNs.CollectionLoadOptions
import typings.officeDashJsDashPreview.ExcelNs.InterfacesNs.TimelineStyleCollectionData
import typings.officeDashJsDashPreview.ExcelNs.InterfacesNs.TimelineStyleCollectionLoadOptions
import typings.officeDashJsDashPreview.OfficeExtensionNs.ClientObject
import typings.officeDashJsDashPreview.OfficeExtensionNs.ClientResult
import typings.officeDashJsDashPreview.OfficeExtensionNs.LoadOption
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents a collection of TimelineStyles.
  *
  * [Api set: ExcelApi BETA (PREVIEW ONLY)]
  * @beta
  */
@JSGlobal("Excel.TimelineStyleCollection")
@js.native
class TimelineStyleCollection () extends ClientObject {
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_TimelineStyleCollection: RequestContext = js.native
  /** Gets the loaded child items in this collection. */
  val items: js.Array[TimelineStyle] = js.native
  /**
    *
    * Creates a blank TimelineStyle with the specified name.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    *
    * @param name The unique name for the new TimelineStyle. Will throw an invalid argument exception if the name is already in use.
    * @param makeUniqueName Optional, defaults to false. If true, will append numbers to the name in order to make it unique, if needed.
    * @returns The newly created TimelineStyle.
    */
  def add(name: String): TimelineStyle = js.native
  def add(name: String, makeUniqueName: Boolean): TimelineStyle = js.native
  /**
    *
    * Gets the number of timeline styles in the collection.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  def getCount(): ClientResult[Double] = js.native
  /**
    *
    * Gets the default TimelineStyle for the parent object's scope.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    * @returns The TimelineStyle object that is the current default TimelineStyle.
    */
  def getDefault(): TimelineStyle = js.native
  /**
    *
    * Gets a TimelineStyle by name.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    *
    * @param name Name of the TimelineStyle to be retrieved.
    * @returns The TimelineStyle object whose name matches the input.
    */
  def getItem(name: String): TimelineStyle = js.native
  /**
    *
    * Gets a TimelineStyle by name. If the TimelineStyle does not exist, will return a null object.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    *
    * @param name Name of the TimelineStyle to be retrieved.
    * @returns The TimelineStyle object whose name matches the input.
    */
  def getItemOrNullObject(name: String): TimelineStyle = js.native
  /**
    * Queues up a command to load the specified properties of the object. You must call "context.sync()" before reading the properties.
    *
    * @remarks
    *
    * In addition to this signature, this method has the following signatures:
    *
    * `load(option?: string | string[]): Excel.TimelineStyleCollection` - Where option is a comma-delimited string or an array of strings that specify the properties to load.
    *
    * `load(option?: { select?: string; expand?: string; }): Excel.TimelineStyleCollection` - Where option.select is a comma-delimited string that specifies the properties to load, and options.expand is a comma-delimited string that specifies the navigation properties to load.
    *
    * `load(option?: { select?: string; expand?: string; top?: number; skip?: number }): Excel.TimelineStyleCollection` - Only available on collection types. It is similar to the preceding signature. Option.top specifies the maximum number of collection items that can be included in the result. Option.skip specifies the number of items that are to be skipped and not included in the result. If option.top is specified, the result set will start after skipping the specified number of items.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): TimelineStyleCollection = js.native
  def load(option: TimelineStyleCollectionLoadOptions with CollectionLoadOptions): TimelineStyleCollection = js.native
  def load(option: String): TimelineStyleCollection = js.native
  def load(option: js.Array[String]): TimelineStyleCollection = js.native
  def load(option: LoadOption): TimelineStyleCollection = js.native
  def setDefault(newDefaultStyle: String): Unit = js.native
  /**
    *
    * Sets the default TimelineStyle for use in the parent object's scope.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    *
    * @param newDefaultStyle The TimelineStyle object or name of the TimelineStyle object that should be the new default.
    */
  def setDefault(newDefaultStyle: TimelineStyle): Unit = js.native
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original `Excel.TimelineStyleCollection` object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.TimelineStyleCollectionData`) that contains an "items" array with shallow copies of any loaded properties from the collection's items.
    */
  def toJSON(): TimelineStyleCollectionData = js.native
}

