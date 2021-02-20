package typings.officeJs.Visio

import typings.officeJs.OfficeExtension.ClientObject
import typings.officeJs.OfficeExtension.EventHandlers
import typings.officeJs.OfficeExtension.UpdateOptions
import typings.officeJs.Visio.Interfaces.DocumentData
import typings.officeJs.Visio.Interfaces.DocumentLoadOptions
import typings.officeJs.Visio.Interfaces.DocumentUpdateData
import typings.officeJs.anon.Expand
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Represents the Document class.
  *
  * [Api set:  1.1]
  */
@js.native
trait Document extends ClientObject {
  
  /**
    *
    * Represents a Visio application instance that contains this document. Read-only.
    *
    * [Api set:  1.1]
    */
  val application: Application = js.native
  
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_Document: RequestContext = js.native
  
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
  def load(option: String): Document = js.native
  def load(option: js.Array[String]): Document = js.native
  def load(option: DocumentLoadOptions): Document = js.native
  def load(option: Expand): Document = js.native
  
  /**
    *
    * Occurs when the data is refreshed in the diagram.
    *
    * [Api set:  1.1]
    *
    * @eventproperty
    */
  val onDataRefreshComplete: EventHandlers[DataRefreshCompleteEventArgs] = js.native
  
  /**
    *
    * Occurs when the Document is loaded, refreshed, or changed.
    *
    * [Api set:  1.1]
    *
    * @eventproperty
    */
  val onDocumentLoadComplete: EventHandlers[DocumentLoadCompleteEventArgs] = js.native
  
  /**
    *
    * Occurs when the page is finished loading.
    *
    * [Api set:  1.1]
    *
    * @eventproperty
    */
  val onPageLoadComplete: EventHandlers[PageLoadCompleteEventArgs] = js.native
  
  /**
    *
    * Occurs when the current selection of shapes changes.
    *
    * [Api set:  1.1]
    *
    * @eventproperty
    */
  val onSelectionChanged: EventHandlers[SelectionChangedEventArgs] = js.native
  
  /**
    *
    * Occurs when the user moves the mouse pointer into the bounding box of a shape.
    *
    * [Api set:  1.1]
    *
    * @eventproperty
    */
  val onShapeMouseEnter: EventHandlers[ShapeMouseEnterEventArgs] = js.native
  
  /**
    *
    * Occurs when the user moves the mouse out of the bounding box of a shape.
    *
    * [Api set:  1.1]
    *
    * @eventproperty
    */
  val onShapeMouseLeave: EventHandlers[ShapeMouseLeaveEventArgs] = js.native
  
  /**
    *
    * Represents a collection of pages associated with the document. Read-only.
    *
    * [Api set:  1.1]
    */
  val pages: PageCollection = js.native
  
  /** Sets multiple properties on the object at the same time, based on an existing loaded object. */
  def set(properties: Document): Unit = js.native
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
  def set(properties: DocumentUpdateData): Unit = js.native
  def set(properties: DocumentUpdateData, options: UpdateOptions): Unit = js.native
  
  /**
    *
    * Set the Active Page of the document.
    *
    * [Api set:  1.1]
    *
    * @param PageName Name of the page
    */
  def setActivePage(PageName: String): Unit = js.native
  
  /**
    *
    * Triggers the refresh of the data in the Diagram, for all pages.
    *
    * [Api set:  1.1]
    */
  def startDataRefresh(): Unit = js.native
  
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original Visio.Document object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Visio.Interfaces.DocumentData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): DocumentData = js.native
  
  /**
    *
    * Returns the DocumentView object. Read-only.
    *
    * [Api set:  1.1]
    */
  val view: DocumentView = js.native
}
