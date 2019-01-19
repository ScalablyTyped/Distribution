package typings
package officeDashJsDashPreviewLib.VisioNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents the Page class.
  *
  * [Api set:  1.1]
  */
@JSGlobal("Visio.Page")
@js.native
class Page ()
  extends officeDashJsDashPreviewLib.OfficeExtensionNs.ClientObject {
  /**
    *
    * All shapes in the Page, including subshapes. Read-only.
    *
    * [Api set:  1.1]
    */
  val allShapes: ShapeCollection = js.native
  /**
    *
    * Returns the Comments Collection.  Read-only.
    *
    * [Api set:  1.1]
    */
  val comments: CommentCollection = js.native
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_Page: RequestContext = js.native
  /**
    *
    * Returns the height of the page. Read-only.
    *
    * [Api set:  1.1]
    */
  val height: scala.Double = js.native
  /**
    *
    * Index of the Page. Read-only.
    *
    * [Api set:  1.1]
    */
  val index: scala.Double = js.native
  /**
    *
    * Whether the page is a background page or not. Read-only.
    *
    * [Api set:  1.1]
    */
  val isBackground: scala.Boolean = js.native
  /**
    *
    * Page name. Read-only.
    *
    * [Api set:  1.1]
    */
  val name: java.lang.String = js.native
  /**
    *
    * All top-level shapes in the Page.Read-only.
    *
    * [Api set:  1.1]
    */
  val shapes: ShapeCollection = js.native
  /**
    *
    * Returns the view of the page. Read-only.
    *
    * [Api set:  1.1]
    */
  val view: PageView = js.native
  /**
    *
    * Returns the width of the page. Read-only.
    *
    * [Api set:  1.1]
    */
  val width: scala.Double = js.native
  /**
    *
    * Set the page as Active Page of the document.
    *
    * [Api set:  1.1]
    */
  def activate(): scala.Unit = js.native
  /**
    * Queues up a command to load the specified properties of the object. You must call "context.sync()" before reading the properties.
    *
    * @remarks
    *
    * In addition to this signature, this method has the following signatures:
    *
    * `load(option?: string | string[]): Visio.Page` - Where option is a comma-delimited string or an array of strings that specify the properties to load.
    *
    * `load(option?: { select?: string; expand?: string; }): Visio.Page` - Where option.select is a comma-delimited string that specifies the properties to load, and options.expand is a comma-delimited string that specifies the navigation properties to load.
    *
    * `load(option?: { select?: string; expand?: string; top?: number; skip?: number }): Visio.Page` - Only available on collection types. It is similar to the preceding signature. Option.top specifies the maximum number of collection items that can be included in the result. Option.skip specifies the number of items that are to be skipped and not included in the result. If option.top is specified, the result set will start after skipping the specified number of items.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): Page = js.native
  def load(option: java.lang.String): Page = js.native
  def load(option: js.Array[java.lang.String]): Page = js.native
  def load(option: officeDashJsDashPreviewLib.Anon_Expand): Page = js.native
  def load(option: officeDashJsDashPreviewLib.VisioNs.InterfacesNs.PageLoadOptions): Page = js.native
  /** Sets multiple properties of an object at the same time. You can pass either a plain object with the appropriate properties, or another API object of the same type.
    *
    * @remarks
    *
    * This method has the following additional signature:
    *
    * `set(properties: Visio.Page): void`
    *
    * @param properties A JavaScript object with properties that are structured isomorphically to the properties of the object on which the method is called.
    * @param options Provides an option to suppress errors if the properties object tries to set any read-only properties.
    */
  def set(properties: officeDashJsDashPreviewLib.VisioNs.InterfacesNs.PageUpdateData): scala.Unit = js.native
  def set(
    properties: officeDashJsDashPreviewLib.VisioNs.InterfacesNs.PageUpdateData,
    options: officeDashJsDashPreviewLib.OfficeExtensionNs.UpdateOptions
  ): scala.Unit = js.native
  /** Sets multiple properties on the object at the same time, based on an existing loaded object. */
  def set(properties: Page): scala.Unit = js.native
  def toJSON(): officeDashJsDashPreviewLib.VisioNs.InterfacesNs.PageData = js.native
}

