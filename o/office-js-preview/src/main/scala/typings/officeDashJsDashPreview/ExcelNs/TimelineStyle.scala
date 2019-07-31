package typings.officeDashJsDashPreview.ExcelNs

import typings.officeDashJsDashPreview.Anon_Expand
import typings.officeDashJsDashPreview.ExcelNs.InterfacesNs.TimelineStyleData
import typings.officeDashJsDashPreview.ExcelNs.InterfacesNs.TimelineStyleLoadOptions
import typings.officeDashJsDashPreview.ExcelNs.InterfacesNs.TimelineStyleUpdateData
import typings.officeDashJsDashPreview.OfficeExtensionNs.ClientObject
import typings.officeDashJsDashPreview.OfficeExtensionNs.UpdateOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents a Timeline style, which defines style elements by region in the Timeline.
  *
  * [Api set: ExcelApi BETA (PREVIEW ONLY)]
  * @beta
  */
@JSGlobal("Excel.TimelineStyle")
@js.native
class TimelineStyle () extends ClientObject {
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_TimelineStyle: RequestContext = js.native
  /**
    *
    * Gets the name of the TimelineStyle.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var name: String = js.native
  /**
    *
    * Specifies whether this TimelineStyle object is read-only. Read-only.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  val readOnly: Boolean = js.native
  /**
    *
    * Deletes the TableStyle.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  def delete(): Unit = js.native
  /**
    *
    * Creates a duplicate of this TimelineStyle with copies of all the style elements.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    * @returns The new TimelineStyle object that has been duplicated from this TimelineStyle.
    */
  def duplicate(): TimelineStyle = js.native
  /**
    * Queues up a command to load the specified properties of the object. You must call "context.sync()" before reading the properties.
    *
    * @remarks
    *
    * In addition to this signature, this method has the following signatures:
    *
    * `load(option?: string | string[]): Excel.TimelineStyle` - Where option is a comma-delimited string or an array of strings that specify the properties to load.
    *
    * `load(option?: { select?: string; expand?: string; }): Excel.TimelineStyle` - Where option.select is a comma-delimited string that specifies the properties to load, and options.expand is a comma-delimited string that specifies the navigation properties to load.
    *
    * `load(option?: { select?: string; expand?: string; top?: number; skip?: number }): Excel.TimelineStyle` - Only available on collection types. It is similar to the preceding signature. Option.top specifies the maximum number of collection items that can be included in the result. Option.skip specifies the number of items that are to be skipped and not included in the result. If option.top is specified, the result set will start after skipping the specified number of items.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): TimelineStyle = js.native
  def load(option: String): TimelineStyle = js.native
  def load(option: js.Array[String]): TimelineStyle = js.native
  def load(option: Anon_Expand): TimelineStyle = js.native
  def load(option: TimelineStyleLoadOptions): TimelineStyle = js.native
  /** Sets multiple properties of an object at the same time. You can pass either a plain object with the appropriate properties, or another API object of the same type.
    *
    * @remarks
    *
    * This method has the following additional signature:
    *
    * `set(properties: Excel.TimelineStyle): void`
    *
    * @param properties A JavaScript object with properties that are structured isomorphically to the properties of the object on which the method is called.
    * @param options Provides an option to suppress errors if the properties object tries to set any read-only properties.
    */
  def set(properties: TimelineStyleUpdateData): Unit = js.native
  def set(properties: TimelineStyleUpdateData, options: UpdateOptions): Unit = js.native
  /** Sets multiple properties on the object at the same time, based on an existing loaded object. */
  def set(properties: TimelineStyle): Unit = js.native
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original Excel.TimelineStyle object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.TimelineStyleData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): TimelineStyleData = js.native
}

