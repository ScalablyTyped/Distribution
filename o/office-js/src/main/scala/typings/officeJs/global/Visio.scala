package typings.officeJs.global

import typings.officeJs.OfficeExtension.ClientObject
import typings.officeJs.OfficeExtension.ClientRequestContext
import typings.officeJs.OfficeExtension.EmbeddedSession
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

////////////////////////////////////////////////////////////////
/////////////////////// End OneNote APIs ///////////////////////
////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////
/////////////////////// Begin Visio APIs ///////////////////////
////////////////////////////////////////////////////////////////
object Visio {
  
  @JSGlobal("Visio")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    *
    * Represents the Application.
    *
    * [Api set:  1.1]
    */
  @JSGlobal("Visio.Application")
  @js.native
  open class Application ()
    extends StObject
       with typings.officeJs.Visio.Application {
    
    /** The request context associated with the object */
    /* CompleteClass */
    var context: ClientRequestContext = js.native
    
    /**
      *  Returns a boolean value for whether the corresponding object is a null object. You must call `context.sync()` before reading the
      * isNullObject property.
      */
    /* CompleteClass */
    var isNullObject: Boolean = js.native
  }
  
  /**
    *
    * Represents the type of column values.
    *
    * [Api set:  1.1]
    */
  @JSGlobal("Visio.ColumnType")
  @js.native
  object ColumnType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.officeJs.Visio.ColumnType & String] = js.native
    
    /* "Currency" */ val currency: typings.officeJs.Visio.ColumnType.currency & String = js.native
    
    /* "Date" */ val date: typings.officeJs.Visio.ColumnType.date & String = js.native
    
    /* "Number" */ val number: typings.officeJs.Visio.ColumnType.number & String = js.native
    
    /* "String" */ val string: typings.officeJs.Visio.ColumnType.string & String = js.native
    
    /* "Unknown" */ val unknown: typings.officeJs.Visio.ColumnType.unknown & String = js.native
  }
  
  /**
    *
    * Represents the Comment.
    *
    * [Api set:  1.1]
    */
  @JSGlobal("Visio.Comment")
  @js.native
  open class Comment ()
    extends StObject
       with typings.officeJs.Visio.Comment {
    
    /** The request context associated with the object */
    /* CompleteClass */
    var context: ClientRequestContext = js.native
    
    /**
      *  Returns a boolean value for whether the corresponding object is a null object. You must call `context.sync()` before reading the
      * isNullObject property.
      */
    /* CompleteClass */
    var isNullObject: Boolean = js.native
  }
  
  /**
    *
    * Represents the CommentCollection for a given Shape.
    *
    * [Api set:  1.1]
    */
  @JSGlobal("Visio.CommentCollection")
  @js.native
  open class CommentCollection ()
    extends StObject
       with typings.officeJs.Visio.CommentCollection {
    
    /** The request context associated with the object */
    /* CompleteClass */
    var context: ClientRequestContext = js.native
    
    /**
      *  Returns a boolean value for whether the corresponding object is a null object. You must call `context.sync()` before reading the
      * isNullObject property.
      */
    /* CompleteClass */
    var isNullObject: Boolean = js.native
  }
  
  /**
    *
    * Direction of connector in DataVisualizer diagram.
    *
    * [Api set:  1.1]
    */
  @JSGlobal("Visio.ConnectorDirection")
  @js.native
  object ConnectorDirection extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.officeJs.Visio.ConnectorDirection & String] = js.native
    
    /* "FromTarget" */ val fromTarget: typings.officeJs.Visio.ConnectorDirection.fromTarget & String = js.native
    
    /* "ToTarget" */ val toTarget: typings.officeJs.Visio.ConnectorDirection.toTarget & String = js.native
  }
  
  /**
    *
    * Represents the orientation of the Cross Functional Flowchart diagram.
    *
    * [Api set:  1.1]
    */
  @JSGlobal("Visio.CrossFunctionalFlowchartOrientation")
  @js.native
  object CrossFunctionalFlowchartOrientation extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.officeJs.Visio.CrossFunctionalFlowchartOrientation & String] = js.native
    
    /* "Horizontal" */ val horizontal: typings.officeJs.Visio.CrossFunctionalFlowchartOrientation.horizontal & String = js.native
    
    /* "Vertical" */ val vertical: typings.officeJs.Visio.CrossFunctionalFlowchartOrientation.vertical & String = js.native
  }
  
  /**
    *
    * Represents the type of source for the data connection.
    *
    * [Api set:  1.1]
    */
  @JSGlobal("Visio.DataSourceType")
  @js.native
  object DataSourceType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.officeJs.Visio.DataSourceType & String] = js.native
    
    /* "Excel" */ val excel: typings.officeJs.Visio.DataSourceType.excel & String = js.native
    
    /* "Unknown" */ val unknown: typings.officeJs.Visio.DataSourceType.unknown & String = js.native
  }
  
  /**
    *
    * Represents the types of data validation error.
    *
    * [Api set:  1.1]
    */
  @JSGlobal("Visio.DataValidationErrorType")
  @js.native
  object DataValidationErrorType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.officeJs.Visio.DataValidationErrorType & String] = js.native
    
    /* "ColumnNotMapped" */ val columnNotMapped: typings.officeJs.Visio.DataValidationErrorType.columnNotMapped & String = js.native
    
    /* "ConnectorColumnAndConnectorLabelMappedElsewhere" */ val connectorColumnAndConnectorLabelMappedElsewhere: typings.officeJs.Visio.DataValidationErrorType.connectorColumnAndConnectorLabelMappedElsewhere & String = js.native
    
    /* "ConnectorColumnError" */ val connectorColumnError: typings.officeJs.Visio.DataValidationErrorType.connectorColumnError & String = js.native
    
    /* "ConnectorColumnMappedElsewhere" */ val connectorColumnMappedElsewhere: typings.officeJs.Visio.DataValidationErrorType.connectorColumnMappedElsewhere & String = js.native
    
    /* "ConnectorLabelColumnMappedElsewhere" */ val connectorLabelColumnMappedElsewhere: typings.officeJs.Visio.DataValidationErrorType.connectorLabelColumnMappedElsewhere & String = js.native
    
    /* "DelimiterError" */ val delimiterError: typings.officeJs.Visio.DataValidationErrorType.delimiterError & String = js.native
    
    /* "None" */ val none: typings.officeJs.Visio.DataValidationErrorType.none & String = js.native
    
    /* "SwimlaneColumnError" */ val swimlaneColumnError: typings.officeJs.Visio.DataValidationErrorType.swimlaneColumnError & String = js.native
    
    /* "UniqueIdColumnError" */ val uniqueIdColumnError: typings.officeJs.Visio.DataValidationErrorType.uniqueIdColumnError & String = js.native
  }
  
  /**
    *
    * Type of the Data Visualizer Diagram operation
    *
    * [Api set:  1.1]
    */
  @JSGlobal("Visio.DataVisualizerDiagramOperationType")
  @js.native
  object DataVisualizerDiagramOperationType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.officeJs.Visio.DataVisualizerDiagramOperationType & String] = js.native
    
    /* "Create" */ val create: typings.officeJs.Visio.DataVisualizerDiagramOperationType.create & String = js.native
    
    /* "Delete" */ val delete: typings.officeJs.Visio.DataVisualizerDiagramOperationType.delete & String = js.native
    
    /* "Unknown" */ val unknown: typings.officeJs.Visio.DataVisualizerDiagramOperationType.unknown & String = js.native
    
    /* "Update" */ val update: typings.officeJs.Visio.DataVisualizerDiagramOperationType.update & String = js.native
    
    /* "UpdateData" */ val updateData: typings.officeJs.Visio.DataVisualizerDiagramOperationType.updateData & String = js.native
    
    /* "UpdateMappings" */ val updateMappings: typings.officeJs.Visio.DataVisualizerDiagramOperationType.updateMappings & String = js.native
  }
  
  /**
    *
    * Result of Data Visualizer Diagram operations.
    *
    * [Api set:  1.1]
    */
  @JSGlobal("Visio.DataVisualizerDiagramResultType")
  @js.native
  object DataVisualizerDiagramResultType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.officeJs.Visio.DataVisualizerDiagramResultType & String] = js.native
    
    /* "ConflictError" */ val conflictError: typings.officeJs.Visio.DataVisualizerDiagramResultType.conflictError & String = js.native
    
    /* "Success" */ val success: typings.officeJs.Visio.DataVisualizerDiagramResultType.success & String = js.native
    
    /* "Unexpected" */ val unexpected: typings.officeJs.Visio.DataVisualizerDiagramResultType.unexpected & String = js.native
    
    /* "ValidationError" */ val validationError: typings.officeJs.Visio.DataVisualizerDiagramResultType.validationError & String = js.native
  }
  
  /**
    *
    * DiagramType for Data Visualizer diagrams
    *
    * [Api set:  1.1]
    */
  @JSGlobal("Visio.DataVisualizerDiagramType")
  @js.native
  object DataVisualizerDiagramType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.officeJs.Visio.DataVisualizerDiagramType & String] = js.native
    
    /* "Audit" */ val audit: typings.officeJs.Visio.DataVisualizerDiagramType.audit & String = js.native
    
    /* "BasicFlowchart" */ val basicFlowchart: typings.officeJs.Visio.DataVisualizerDiagramType.basicFlowchart & String = js.native
    
    /* "CrossFunctionalFlowchart_Horizontal" */ val crossFunctionalFlowchart_Horizontal: typings.officeJs.Visio.DataVisualizerDiagramType.crossFunctionalFlowchart_Horizontal & String = js.native
    
    /* "CrossFunctionalFlowchart_Vertical" */ val crossFunctionalFlowchart_Vertical: typings.officeJs.Visio.DataVisualizerDiagramType.crossFunctionalFlowchart_Vertical & String = js.native
    
    /* "Network" */ val network: typings.officeJs.Visio.DataVisualizerDiagramType.network & String = js.native
    
    /* "OrgChart" */ val orgChart: typings.officeJs.Visio.DataVisualizerDiagramType.orgChart & String = js.native
    
    /* "Unknown" */ val unknown: typings.officeJs.Visio.DataVisualizerDiagramType.unknown & String = js.native
  }
  
  /**
    *
    * Represents the Document class.
    *
    * [Api set:  1.1]
    */
  @JSGlobal("Visio.Document")
  @js.native
  open class Document ()
    extends StObject
       with typings.officeJs.Visio.Document {
    
    /** The request context associated with the object */
    /* CompleteClass */
    var context: ClientRequestContext = js.native
    
    /**
      *  Returns a boolean value for whether the corresponding object is a null object. You must call `context.sync()` before reading the
      * isNullObject property.
      */
    /* CompleteClass */
    var isNullObject: Boolean = js.native
  }
  
  /**
    *
    * Represents the DocumentView class.
    *
    * [Api set:  1.1]
    */
  @JSGlobal("Visio.DocumentView")
  @js.native
  open class DocumentView ()
    extends StObject
       with typings.officeJs.Visio.DocumentView {
    
    /** The request context associated with the object */
    /* CompleteClass */
    var context: ClientRequestContext = js.native
    
    /**
      *  Returns a boolean value for whether the corresponding object is a null object. You must call `context.sync()` before reading the
      * isNullObject property.
      */
    /* CompleteClass */
    var isNullObject: Boolean = js.native
  }
  
  @JSGlobal("Visio.ErrorCodes")
  @js.native
  object ErrorCodes extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.officeJs.Visio.ErrorCodes & String] = js.native
    
    /* "AccessDenied" */ val accessDenied: typings.officeJs.Visio.ErrorCodes.accessDenied & String = js.native
    
    /* "GeneralException" */ val generalException: typings.officeJs.Visio.ErrorCodes.generalException & String = js.native
    
    /* "InvalidArgument" */ val invalidArgument: typings.officeJs.Visio.ErrorCodes.invalidArgument & String = js.native
    
    /* "ItemNotFound" */ val itemNotFound: typings.officeJs.Visio.ErrorCodes.itemNotFound & String = js.native
    
    /* "NotImplemented" */ val notImplemented: typings.officeJs.Visio.ErrorCodes.notImplemented & String = js.native
    
    /* "UnsupportedOperation" */ val unsupportedOperation: typings.officeJs.Visio.ErrorCodes.unsupportedOperation & String = js.native
  }
  
  /**
    *
    * EventType represents the type of the events Host supports
    *
    * [Api set:  1.1]
    */
  @JSGlobal("Visio.EventType")
  @js.native
  object EventType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.officeJs.Visio.EventType & String] = js.native
    
    /* "DataVisualizerDiagramOperationCompleted" */ val dataVisualizerDiagramOperationCompleted: typings.officeJs.Visio.EventType.dataVisualizerDiagramOperationCompleted & String = js.native
  }
  
  /**
    *
    * Represents the Hyperlink.
    *
    * [Api set:  1.1]
    */
  @JSGlobal("Visio.Hyperlink")
  @js.native
  open class Hyperlink ()
    extends StObject
       with typings.officeJs.Visio.Hyperlink {
    
    /** The request context associated with the object */
    /* CompleteClass */
    var context: ClientRequestContext = js.native
    
    /**
      *  Returns a boolean value for whether the corresponding object is a null object. You must call `context.sync()` before reading the
      * isNullObject property.
      */
    /* CompleteClass */
    var isNullObject: Boolean = js.native
  }
  
  /**
    *
    * Represents the Hyperlink Collection.
    *
    * [Api set:  1.1]
    */
  @JSGlobal("Visio.HyperlinkCollection")
  @js.native
  open class HyperlinkCollection ()
    extends StObject
       with typings.officeJs.Visio.HyperlinkCollection {
    
    /** The request context associated with the object */
    /* CompleteClass */
    var context: ClientRequestContext = js.native
    
    /**
      *  Returns a boolean value for whether the corresponding object is a null object. You must call `context.sync()` before reading the
      * isNullObject property.
      */
    /* CompleteClass */
    var isNullObject: Boolean = js.native
  }
  
  /**
    *
    * Represents the type of layout.
    *
    * [Api set:  1.1]
    */
  @JSGlobal("Visio.LayoutVariant")
  @js.native
  object LayoutVariant extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.officeJs.Visio.LayoutVariant & String] = js.native
    
    /* "Flowchart_BottomToTop" */ val flowchart_BottomToTop: typings.officeJs.Visio.LayoutVariant.flowchart_BottomToTop & String = js.native
    
    /* "Flowchart_LeftToRight" */ val flowchart_LeftToRight: typings.officeJs.Visio.LayoutVariant.flowchart_LeftToRight & String = js.native
    
    /* "Flowchart_RightToLeft" */ val flowchart_RightToLeft: typings.officeJs.Visio.LayoutVariant.flowchart_RightToLeft & String = js.native
    
    /* "Flowchart_TopToBottom" */ val flowchart_TopToBottom: typings.officeJs.Visio.LayoutVariant.flowchart_TopToBottom & String = js.native
    
    /* "PageDefault" */ val pageDefault: typings.officeJs.Visio.LayoutVariant.pageDefault & String = js.native
    
    /* "Unknown" */ val unknown: typings.officeJs.Visio.LayoutVariant.unknown & String = js.native
    
    /* "WideTree_DownThenLeft" */ val wideTree_DownThenLeft: typings.officeJs.Visio.LayoutVariant.wideTree_DownThenLeft & String = js.native
    
    /* "WideTree_DownThenRight" */ val wideTree_DownThenRight: typings.officeJs.Visio.LayoutVariant.wideTree_DownThenRight & String = js.native
    
    /* "WideTree_LeftThenDown" */ val wideTree_LeftThenDown: typings.officeJs.Visio.LayoutVariant.wideTree_LeftThenDown & String = js.native
    
    /* "WideTree_RightThenDown" */ val wideTree_RightThenDown: typings.officeJs.Visio.LayoutVariant.wideTree_RightThenDown & String = js.native
  }
  
  /**
    *
    * Represents the Horizontal Alignment of the Overlay relative to the shape.
    *
    * [Api set:  1.1]
    */
  @JSGlobal("Visio.OverlayHorizontalAlignment")
  @js.native
  object OverlayHorizontalAlignment extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.officeJs.Visio.OverlayHorizontalAlignment & String] = js.native
    
    /* "Center" */ val center: typings.officeJs.Visio.OverlayHorizontalAlignment.center & String = js.native
    
    /* "Left" */ val left: typings.officeJs.Visio.OverlayHorizontalAlignment.left & String = js.native
    
    /* "Right" */ val right: typings.officeJs.Visio.OverlayHorizontalAlignment.right & String = js.native
  }
  
  /**
    *
    * Represents the type of the overlay.
    *
    * [Api set:  1.1]
    */
  @JSGlobal("Visio.OverlayType")
  @js.native
  object OverlayType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.officeJs.Visio.OverlayType & String] = js.native
    
    /* "Html" */ val html: typings.officeJs.Visio.OverlayType.html & String = js.native
    
    /* "Image" */ val image: typings.officeJs.Visio.OverlayType.image & String = js.native
    
    /* "Text" */ val text: typings.officeJs.Visio.OverlayType.text & String = js.native
  }
  
  /**
    *
    * Represents the Vertical Alignment of the Overlay relative to the shape.
    *
    * [Api set:  1.1]
    */
  @JSGlobal("Visio.OverlayVerticalAlignment")
  @js.native
  object OverlayVerticalAlignment extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.officeJs.Visio.OverlayVerticalAlignment & String] = js.native
    
    /* "Bottom" */ val bottom: typings.officeJs.Visio.OverlayVerticalAlignment.bottom & String = js.native
    
    /* "Middle" */ val middle: typings.officeJs.Visio.OverlayVerticalAlignment.middle & String = js.native
    
    /* "Top" */ val top: typings.officeJs.Visio.OverlayVerticalAlignment.top & String = js.native
  }
  
  /**
    *
    * Represents the Page class.
    *
    * [Api set:  1.1]
    */
  @JSGlobal("Visio.Page")
  @js.native
  open class Page ()
    extends StObject
       with typings.officeJs.Visio.Page {
    
    /** The request context associated with the object */
    /* CompleteClass */
    var context: ClientRequestContext = js.native
    
    /**
      *  Returns a boolean value for whether the corresponding object is a null object. You must call `context.sync()` before reading the
      * isNullObject property.
      */
    /* CompleteClass */
    var isNullObject: Boolean = js.native
  }
  
  /**
    *
    * Represents a collection of Page objects that are part of the document.
    *
    * [Api set:  1.1]
    */
  @JSGlobal("Visio.PageCollection")
  @js.native
  open class PageCollection ()
    extends StObject
       with typings.officeJs.Visio.PageCollection {
    
    /** The request context associated with the object */
    /* CompleteClass */
    var context: ClientRequestContext = js.native
    
    /**
      *  Returns a boolean value for whether the corresponding object is a null object. You must call `context.sync()` before reading the
      * isNullObject property.
      */
    /* CompleteClass */
    var isNullObject: Boolean = js.native
  }
  
  /**
    *
    * Represents the PageView class.
    *
    * [Api set:  1.1]
    */
  @JSGlobal("Visio.PageView")
  @js.native
  open class PageView ()
    extends StObject
       with typings.officeJs.Visio.PageView {
    
    /** The request context associated with the object */
    /* CompleteClass */
    var context: ClientRequestContext = js.native
    
    /**
      *  Returns a boolean value for whether the corresponding object is a null object. You must call `context.sync()` before reading the
      * isNullObject property.
      */
    /* CompleteClass */
    var isNullObject: Boolean = js.native
  }
  
  /**
    * The RequestContext object facilitates requests to the Visio application. Since the Office add-in and the Visio application run in two different processes, the request context is required to get access to the Visio object model from the add-in.
    */
  @JSGlobal("Visio.RequestContext")
  @js.native
  open class RequestContext ()
    extends StObject
       with typings.officeJs.Visio.RequestContext {
    def this(url: String) = this()
    def this(url: EmbeddedSession) = this()
  }
  
  /**
    *
    * Represents the Selection in the page.
    *
    * [Api set:  1.1]
    */
  @JSGlobal("Visio.Selection")
  @js.native
  open class Selection ()
    extends StObject
       with typings.officeJs.Visio.Selection {
    
    /** The request context associated with the object */
    /* CompleteClass */
    var context: ClientRequestContext = js.native
    
    /**
      *  Returns a boolean value for whether the corresponding object is a null object. You must call `context.sync()` before reading the
      * isNullObject property.
      */
    /* CompleteClass */
    var isNullObject: Boolean = js.native
  }
  
  /**
    *
    * Represents the Shape class.
    *
    * [Api set:  1.1]
    */
  @JSGlobal("Visio.Shape")
  @js.native
  open class Shape ()
    extends StObject
       with typings.officeJs.Visio.Shape {
    
    /** The request context associated with the object */
    /* CompleteClass */
    var context: ClientRequestContext = js.native
    
    /**
      *  Returns a boolean value for whether the corresponding object is a null object. You must call `context.sync()` before reading the
      * isNullObject property.
      */
    /* CompleteClass */
    var isNullObject: Boolean = js.native
  }
  
  /**
    *
    * Represents the Shape Collection.
    *
    * [Api set:  1.1]
    */
  @JSGlobal("Visio.ShapeCollection")
  @js.native
  open class ShapeCollection ()
    extends StObject
       with typings.officeJs.Visio.ShapeCollection {
    
    /** The request context associated with the object */
    /* CompleteClass */
    var context: ClientRequestContext = js.native
    
    /**
      *  Returns a boolean value for whether the corresponding object is a null object. You must call `context.sync()` before reading the
      * isNullObject property.
      */
    /* CompleteClass */
    var isNullObject: Boolean = js.native
  }
  
  /**
    *
    * Represents the ShapeDataItem.
    *
    * [Api set:  1.1]
    */
  @JSGlobal("Visio.ShapeDataItem")
  @js.native
  open class ShapeDataItem ()
    extends StObject
       with typings.officeJs.Visio.ShapeDataItem {
    
    /** The request context associated with the object */
    /* CompleteClass */
    var context: ClientRequestContext = js.native
    
    /**
      *  Returns a boolean value for whether the corresponding object is a null object. You must call `context.sync()` before reading the
      * isNullObject property.
      */
    /* CompleteClass */
    var isNullObject: Boolean = js.native
  }
  
  /**
    *
    * Represents the ShapeDataItemCollection for a given Shape.
    *
    * [Api set:  1.1]
    */
  @JSGlobal("Visio.ShapeDataItemCollection")
  @js.native
  open class ShapeDataItemCollection ()
    extends StObject
       with typings.officeJs.Visio.ShapeDataItemCollection {
    
    /** The request context associated with the object */
    /* CompleteClass */
    var context: ClientRequestContext = js.native
    
    /**
      *  Returns a boolean value for whether the corresponding object is a null object. You must call `context.sync()` before reading the
      * isNullObject property.
      */
    /* CompleteClass */
    var isNullObject: Boolean = js.native
  }
  
  /**
    *
    * Represents the ShapeView class.
    *
    * [Api set:  1.1]
    */
  @JSGlobal("Visio.ShapeView")
  @js.native
  open class ShapeView ()
    extends StObject
       with typings.officeJs.Visio.ShapeView {
    
    /** The request context associated with the object */
    /* CompleteClass */
    var context: ClientRequestContext = js.native
    
    /**
      *  Returns a boolean value for whether the corresponding object is a null object. You must call `context.sync()` before reading the
      * isNullObject property.
      */
    /* CompleteClass */
    var isNullObject: Boolean = js.native
  }
  
  /**
    *
    * TaskPaneType represents the types of the First Party TaskPanes that are supported by Host through APIs. Used in case of Show TaskPane API/ TaskPane State Changed Event etc
    *
    * [Api set:  1.1]
    */
  @JSGlobal("Visio.TaskPaneType")
  @js.native
  object TaskPaneType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.officeJs.Visio.TaskPaneType & String] = js.native
    
    /* "DataVisualizerOrgChartMappings" */ val dataVisualizerOrgChartMappings: typings.officeJs.Visio.TaskPaneType.dataVisualizerOrgChartMappings & String = js.native
    
    /* "DataVisualizerProcessMappings" */ val dataVisualizerProcessMappings: typings.officeJs.Visio.TaskPaneType.dataVisualizerProcessMappings & String = js.native
    
    /* "None" */ val none: typings.officeJs.Visio.TaskPaneType.none & String = js.native
  }
  
  /**
    *
    * Toolbar IDs of the app
    *
    * [Api set:  1.1]
    */
  @JSGlobal("Visio.ToolBarType")
  @js.native
  object ToolBarType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.officeJs.Visio.ToolBarType & String] = js.native
    
    /* "CommandBar" */ val commandBar: typings.officeJs.Visio.ToolBarType.commandBar & String = js.native
    
    /* "PageNavigationBar" */ val pageNavigationBar: typings.officeJs.Visio.ToolBarType.pageNavigationBar & String = js.native
    
    /* "StatusBar" */ val statusBar: typings.officeJs.Visio.ToolBarType.statusBar & String = js.native
  }
  
  /**
    * Executes a batch script that performs actions on the Visio object model, using a new request context. When the promise is resolved, any tracked objects that were automatically allocated during execution will be released.
    * @param batch - A function that takes in an Visio.RequestContext and returns a promise (typically, just the result of "context.sync()"). The context parameter facilitates requests to the Visio application. Since the Office add-in and the Visio application run in two different processes, the request context is required to get access to the Visio object model from the add-in.
    */
  inline def run[T](batch: js.Function1[/* context */ typings.officeJs.Visio.RequestContext, js.Promise[T]]): js.Promise[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("run")(batch.asInstanceOf[js.Any]).asInstanceOf[js.Promise[T]]
  /**
    * Executes a batch script that performs actions on the Visio object model, using the RequestContext of a previously-created object. When the promise is resolved, any tracked objects that were automatically allocated during execution will be released.
    * @param contextObject - A previously-created Visio.RequestContext. This context will get re-used by the batch function (instead of having a new context created). This means that the batch will be able to pick up changes made to existing API objects, if those objects were derived from this same context.
    * @param batch - A function that takes in a RequestContext and returns a promise (typically, just the result of "context.sync()"). The context parameter facilitates requests to the Visio application. Since the Office add-in and the Visio application run in two different processes, the RequestContext is required to get access to the Visio object model from the add-in.
    * @remarks
    * In addition to this signature, the method also has the following signatures:
    *
    * `run<T>(batch: (context: Visio.RequestContext) => Promise<T>): Promise<T>;`
    *
    * `run<T>(object: OfficeExtension.ClientObject | OfficeExtension.EmbeddedSession, batch: (context: Visio.RequestContext) => Promise<T>): Promise<T>;`
    *
    * `run<T>(objects: OfficeExtension.ClientObject[], batch: (context: Visio.RequestContext) => Promise<T>): Promise<T>;`
    */
  inline def run[T](
    contextObject: ClientRequestContext,
    batch: js.Function1[/* context */ typings.officeJs.Visio.RequestContext, js.Promise[T]]
  ): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("run")(contextObject.asInstanceOf[js.Any], batch.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
  /**
    * Executes a batch script that performs actions on the Visio object model, using the request context of previously-created API objects.
    * @param objects - An array of previously-created API objects. The array will be validated to make sure that all of the objects share the same context. The batch will use this shared request context, which means that any changes applied to these objects will be picked up by "context.sync()".
    * @param batch - A function that takes in a Visio.RequestContext and returns a promise (typically, just the result of "context.sync()"). When the promise is resolved, any tracked objects that were automatically allocated during execution will be released.
    */
  inline def run[T](
    objects: js.Array[ClientObject],
    batch: js.Function1[/* context */ typings.officeJs.Visio.RequestContext, js.Promise[T]]
  ): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("run")(objects.asInstanceOf[js.Any], batch.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
  /**
    * Executes a batch script that performs actions on the Visio object model, using the request context of a previously-created API object.
    * @param object - A previously-created API object. The batch will use the same request context as the passed-in object, which means that any changes applied to the object will be picked up by "context.sync()".
    * @param batch - A function that takes in an Visio.RequestContext and returns a promise (typically, just the result of "context.sync()"). When the promise is resolved, any tracked objects that were automatically allocated during execution will be released.
    */
  inline def run[T](
    `object`: ClientObject,
    batch: js.Function1[/* context */ typings.officeJs.Visio.RequestContext, js.Promise[T]]
  ): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("run")(`object`.asInstanceOf[js.Any], batch.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
  inline def run[T](
    `object`: EmbeddedSession,
    batch: js.Function1[/* context */ typings.officeJs.Visio.RequestContext, js.Promise[T]]
  ): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("run")(`object`.asInstanceOf[js.Any], batch.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
}
