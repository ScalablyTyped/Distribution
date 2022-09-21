package typings.officeJsPreview.Visio

import typings.officeJsPreview.OfficeExtension.ClientObject
import typings.officeJsPreview.OfficeExtension.EventHandlers
import typings.officeJsPreview.OfficeExtension.UpdateOptions
import typings.officeJsPreview.Visio.Interfaces.DocumentData
import typings.officeJsPreview.Visio.Interfaces.DocumentLoadOptions
import typings.officeJsPreview.Visio.Interfaces.DocumentUpdateData
import typings.officeJsPreview.anon.Expand
import typings.officeJsPreview.officeJsPreviewStrings.DataVisualizerOrgChartMappings
import typings.officeJsPreview.officeJsPreviewStrings.DataVisualizerProcessMappings
import typings.officeJsPreview.officeJsPreviewStrings.None
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Represents the Document class.
  *
  * [Api set:  1.1]
  */
@js.native
trait Document
  extends StObject
     with ClientObject {
  
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
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): Document = js.native
  def load(options: DocumentLoadOptions): Document = js.native
  def load(propertyNamesAndPaths: Expand): Document = js.native
  def load(propertyNames: String): Document = js.native
  def load(propertyNames: js.Array[String]): Document = js.native
  
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
    * Occurs when there is an expected or unexpected error occured in the session.
    *
    * [Api set:  1.1]
    *
    * @eventproperty
    */
  val onDocumentError: EventHandlers[DocumentErrorEventArgs] = js.native
  
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
    * Occurs whenever a task pane state is changed
    *
    * [Api set:  1.1]
    *
    * @eventproperty
    */
  val onTaskPaneStateChanged: EventHandlers[TaskPaneStateChangedEventArgs] = js.native
  
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
    * Set mock data
    */
  def setMockData(data: DocumentData): Unit = js.native
  
  /**
    *
    * Show or Hide a TaskPane.
    This will be consumed by the DV Excel Add-In/Other third-party apps who embed the visio drawing to show/hide the task pane.
    *
    * [Api set:  1.1]
    *
    * @param taskPaneType Type of the 1st Party TaskPane. It can take values from enum TaskPaneType
    * @param initialProps Optional Parameter. This is a generic data structure which would be filled with initial data required to initialize the content of the Taskpane
    * @param show Optional Parameter. If it is set to false, it will hide the specified taskpane
    */
  def showTaskPane(taskPaneType: None | DataVisualizerProcessMappings | DataVisualizerOrgChartMappings): Unit = js.native
  def showTaskPane(
    taskPaneType: None | DataVisualizerProcessMappings | DataVisualizerOrgChartMappings,
    initialProps: Any
  ): Unit = js.native
  def showTaskPane(
    taskPaneType: None | DataVisualizerProcessMappings | DataVisualizerOrgChartMappings,
    initialProps: Any,
    show: Boolean
  ): Unit = js.native
  def showTaskPane(
    taskPaneType: None | DataVisualizerProcessMappings | DataVisualizerOrgChartMappings,
    initialProps: Unit,
    show: Boolean
  ): Unit = js.native
  /**
    *
    * Show or Hide a TaskPane.
    This will be consumed by the DV Excel Add-In/Other third-party apps who embed the visio drawing to show/hide the task pane.
    *
    * [Api set:  1.1]
    *
    * @param taskPaneType Type of the 1st Party TaskPane. It can take values from enum TaskPaneType
    * @param initialProps Optional Parameter. This is a generic data structure which would be filled with initial data required to initialize the content of the Taskpane
    * @param show Optional Parameter. If it is set to false, it will hide the specified taskpane
    */
  def showTaskPane(taskPaneType: TaskPaneType): Unit = js.native
  def showTaskPane(taskPaneType: TaskPaneType, initialProps: Any): Unit = js.native
  def showTaskPane(taskPaneType: TaskPaneType, initialProps: Any, show: Boolean): Unit = js.native
  def showTaskPane(taskPaneType: TaskPaneType, initialProps: Unit, show: Boolean): Unit = js.native
  
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
