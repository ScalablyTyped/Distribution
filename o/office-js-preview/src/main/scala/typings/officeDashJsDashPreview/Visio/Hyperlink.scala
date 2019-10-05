package typings.officeDashJsDashPreview.Visio

import typings.officeDashJsDashPreview.Anon_Expand
import typings.officeDashJsDashPreview.OfficeExtension.ClientObject
import typings.officeDashJsDashPreview.Visio.Interfaces.HyperlinkData
import typings.officeDashJsDashPreview.Visio.Interfaces.HyperlinkLoadOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents the Hyperlink.
  *
  * [Api set:  1.1]
  */
@JSGlobal("Visio.Hyperlink")
@js.native
class Hyperlink () extends ClientObject {
  /**
    *
    * Gets the address of the Hyperlink object. Read-only.
    *
    * [Api set:  1.1]
    */
  val address: String = js.native
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_Hyperlink: RequestContext = js.native
  /**
    *
    * Gets the description of a hyperlink. Read-only.
    *
    * [Api set:  1.1]
    */
  val description: String = js.native
  /**
    *
    * Gets the extra URL request information used to resolve the hyperlink's URL. Read-only.
    *
    * [Api set:  1.1]
    */
  val extraInfo: String = js.native
  /**
    *
    * Gets the sub-address of the Hyperlink object. Read-only.
    *
    * [Api set:  1.1]
    */
  val subAddress: String = js.native
  /**
    * Queues up a command to load the specified properties of the object. You must call "context.sync()" before reading the properties.
    *
    * @remarks
    *
    * In addition to this signature, this method has the following signatures:
    *
    * `load(option?: string | string[]): Visio.Hyperlink` - Where option is a comma-delimited string or an array of strings that specify the properties to load.
    *
    * `load(option?: { select?: string; expand?: string; }): Visio.Hyperlink` - Where option.select is a comma-delimited string that specifies the properties to load, and options.expand is a comma-delimited string that specifies the navigation properties to load.
    *
    * `load(option?: { select?: string; expand?: string; top?: number; skip?: number }): Visio.Hyperlink` - Only available on collection types. It is similar to the preceding signature. Option.top specifies the maximum number of collection items that can be included in the result. Option.skip specifies the number of items that are to be skipped and not included in the result. If option.top is specified, the result set will start after skipping the specified number of items.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): Hyperlink = js.native
  def load(option: String): Hyperlink = js.native
  def load(option: js.Array[String]): Hyperlink = js.native
  def load(option: Anon_Expand): Hyperlink = js.native
  def load(option: HyperlinkLoadOptions): Hyperlink = js.native
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original Visio.Hyperlink object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Visio.Interfaces.HyperlinkData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): HyperlinkData = js.native
}

