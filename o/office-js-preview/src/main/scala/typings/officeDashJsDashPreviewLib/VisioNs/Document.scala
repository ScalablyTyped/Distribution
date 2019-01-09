package typings
package officeDashJsDashPreviewLib.VisioNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents the Document class.
  *
  * [Api set:  1.1]
  */
@JSGlobal("Visio.Document")
@js.native
class Document ()
  extends officeDashJsDashPreviewLib.OfficeExtensionNs.ClientObject {
  /**
    *
    * Represents a Visio application instance that contains this document. Read-only.
    *
    * [Api set:  1.1]
    */
  val application: Application = js.native
  /**
    *
    * Occurs when the data is refreshed in the diagram.
    *
    * [Api set:  1.1]
    *
    * @eventproperty
    */
  val onDataRefreshComplete: officeDashJsDashPreviewLib.OfficeExtensionNs.EventHandlers[DataRefreshCompleteEventArgs] = js.native
  /**
    *
    * Occurs when the Document is loaded, refreshed, or changed.
    *
    * [Api set:  1.1]
    *
    * @eventproperty
    */
  val onDocumentLoadComplete: officeDashJsDashPreviewLib.OfficeExtensionNs.EventHandlers[DocumentLoadCompleteEventArgs] = js.native
  /**
    *
    * Occurs when the page is finished loading.
    *
    * [Api set:  1.1]
    *
    * @eventproperty
    */
  val onPageLoadComplete: officeDashJsDashPreviewLib.OfficeExtensionNs.EventHandlers[PageLoadCompleteEventArgs] = js.native
  /**
    *
    * Occurs when the current selection of shapes changes.
    *
    * [Api set:  1.1]
    *
    * @eventproperty
    */
  val onSelectionChanged: officeDashJsDashPreviewLib.OfficeExtensionNs.EventHandlers[SelectionChangedEventArgs] = js.native
  /**
    *
    * Occurs when the user moves the mouse pointer into the bounding box of a shape.
    *
    * [Api set:  1.1]
    *
    * @eventproperty
    */
  val onShapeMouseEnter: officeDashJsDashPreviewLib.OfficeExtensionNs.EventHandlers[ShapeMouseEnterEventArgs] = js.native
  /**
    *
    * Occurs when the user moves the mouse out of the bounding box of a shape.
    *
    * [Api set:  1.1]
    *
    * @eventproperty
    */
  val onShapeMouseLeave: officeDashJsDashPreviewLib.OfficeExtensionNs.EventHandlers[ShapeMouseLeaveEventArgs] = js.native
  /**
    *
    * Represents a collection of pages associated with the document. Read-only.
    *
    * [Api set:  1.1]
    */
  val pages: PageCollection = js.native
  /**
    *
    * Returns the DocumentView object. Read-only.
    *
    * [Api set:  1.1]
    */
  val view: DocumentView = js.native
  /**
    *
    * Returns the Active Page of the document.
    *
    * [Api set:  1.1]
    */
  def getActivePage(): Page = js.native
  /**
    * Queues up a command to load the specified properties of the object. You must call "context.sync()" before reading the properties.
    *
    * @remarks
    *
    * In addition to this signature, this method has the following signatures:
    *
    * `load(option?: string | string[]): Visio.Document` - Where option is a comma-delimited string or an array of strings that specify the properties to load.
    *
    * `load(option?: { select?: string; expand?: string; }): Visio.Document` - Where option.select is a comma-delimited string that specifies the properties to load, and options.expand is a comma-delimited string that specifies the navigation properties to load.
    *
    * `load(option?: { select?: string; expand?: string; top?: number; skip?: number }): Visio.Document` - Only available on collection types. It is similar to the preceding signature. Option.top specifies the maximum number of collection items that can be included in the result. Option.skip specifies the number of items that are to be skipped and not included in the result. If option.top is specified, the result set will start after skipping the specified number of items.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): Document = js.native
  def load(option: java.lang.String): Document = js.native
  def load(option: js.Array[java.lang.String]): Document = js.native
  def load(option: officeDashJsDashPreviewLib.Anon_Expand): Document = js.native
  def load(option: officeDashJsDashPreviewLib.VisioNs.InterfacesNs.DocumentLoadOptions): Document = js.native
  /** Sets multiple properties on the object at the same time, based on an existing loaded object. */
  def set(properties: Document): scala.Unit = js.native
  /** Sets multiple properties of an object at the same time. You can pass either a plain object with the appropriate properties, or another API object of the same type.
    *
    * @remarks
    *
    * This method has the following additional signature:
    *
    * `set(properties: Visio.Document): void`
    *
    * @param properties A JavaScript object with properties that are structured isomorphically to the properties of the object on which the method is called.
    * @param options Provides an option to suppress errors if the properties object tries to set any read-only properties.
    */
  def set(properties: officeDashJsDashPreviewLib.VisioNs.InterfacesNs.DocumentUpdateData): scala.Unit = js.native
  def set(
    properties: officeDashJsDashPreviewLib.VisioNs.InterfacesNs.DocumentUpdateData,
    options: officeDashJsDashPreviewLib.OfficeExtensionNs.UpdateOptions
  ): scala.Unit = js.native
  /**
    *
    * Set the Active Page of the document.
    *
    * [Api set:  1.1]
    *
    * @param PageName Name of the page
    */
  def setActivePage(PageName: java.lang.String): scala.Unit = js.native
  /**
    *
    * Triggers the refresh of the data in the Diagram, for all pages.
    *
    * [Api set:  1.1]
    */
  def startDataRefresh(): scala.Unit = js.native
  def toJSON(): officeDashJsDashPreviewLib.VisioNs.InterfacesNs.DocumentData = js.native
}

