package typings.officeJsPreview.global

import typings.officeJsPreview.OfficeExtension.ClientObject
import typings.officeJsPreview.OfficeExtension.ClientRequestContext
import typings.officeJsPreview.OfficeExtension.EmbeddedSession
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
  class Application ()
    extends StObject
       with typings.officeJsPreview.Visio.Application {
    
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
    * Represents the Comment.
    *
    * [Api set:  1.1]
    */
  @JSGlobal("Visio.Comment")
  @js.native
  class Comment ()
    extends StObject
       with typings.officeJsPreview.Visio.Comment {
    
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
  class CommentCollection ()
    extends StObject
       with typings.officeJsPreview.Visio.CommentCollection {
    
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
    * Represents the Document class.
    *
    * [Api set:  1.1]
    */
  @JSGlobal("Visio.Document")
  @js.native
  class Document ()
    extends StObject
       with typings.officeJsPreview.Visio.Document {
    
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
  class DocumentView ()
    extends StObject
       with typings.officeJsPreview.Visio.DocumentView {
    
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
    def apply(value: String): js.UndefOr[typings.officeJsPreview.Visio.ErrorCodes & String] = js.native
    
    /* "AccessDenied" */ val accessDenied: typings.officeJsPreview.Visio.ErrorCodes.accessDenied & String = js.native
    
    /* "GeneralException" */ val generalException: typings.officeJsPreview.Visio.ErrorCodes.generalException & String = js.native
    
    /* "InvalidArgument" */ val invalidArgument: typings.officeJsPreview.Visio.ErrorCodes.invalidArgument & String = js.native
    
    /* "ItemNotFound" */ val itemNotFound: typings.officeJsPreview.Visio.ErrorCodes.itemNotFound & String = js.native
    
    /* "NotImplemented" */ val notImplemented: typings.officeJsPreview.Visio.ErrorCodes.notImplemented & String = js.native
    
    /* "UnsupportedOperation" */ val unsupportedOperation: typings.officeJsPreview.Visio.ErrorCodes.unsupportedOperation & String = js.native
  }
  
  /**
    *
    * Represents the Hyperlink.
    *
    * [Api set:  1.1]
    */
  @JSGlobal("Visio.Hyperlink")
  @js.native
  class Hyperlink ()
    extends StObject
       with typings.officeJsPreview.Visio.Hyperlink {
    
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
  class HyperlinkCollection ()
    extends StObject
       with typings.officeJsPreview.Visio.HyperlinkCollection {
    
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
    * Represents the Horizontal Alignment of the Overlay relative to the shape.
    *
    * [Api set:  1.1]
    */
  @JSGlobal("Visio.OverlayHorizontalAlignment")
  @js.native
  object OverlayHorizontalAlignment extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.officeJsPreview.Visio.OverlayHorizontalAlignment & String] = js.native
    
    /* "Center" */ val center: typings.officeJsPreview.Visio.OverlayHorizontalAlignment.center & String = js.native
    
    /* "Left" */ val left: typings.officeJsPreview.Visio.OverlayHorizontalAlignment.left & String = js.native
    
    /* "Right" */ val right: typings.officeJsPreview.Visio.OverlayHorizontalAlignment.right & String = js.native
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
    def apply(value: String): js.UndefOr[typings.officeJsPreview.Visio.OverlayType & String] = js.native
    
    /* "Html" */ val html: typings.officeJsPreview.Visio.OverlayType.html & String = js.native
    
    /* "Image" */ val image: typings.officeJsPreview.Visio.OverlayType.image & String = js.native
    
    /* "Text" */ val text: typings.officeJsPreview.Visio.OverlayType.text & String = js.native
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
    def apply(value: String): js.UndefOr[typings.officeJsPreview.Visio.OverlayVerticalAlignment & String] = js.native
    
    /* "Bottom" */ val bottom: typings.officeJsPreview.Visio.OverlayVerticalAlignment.bottom & String = js.native
    
    /* "Middle" */ val middle: typings.officeJsPreview.Visio.OverlayVerticalAlignment.middle & String = js.native
    
    /* "Top" */ val top: typings.officeJsPreview.Visio.OverlayVerticalAlignment.top & String = js.native
  }
  
  /**
    *
    * Represents the Page class.
    *
    * [Api set:  1.1]
    */
  @JSGlobal("Visio.Page")
  @js.native
  class Page ()
    extends StObject
       with typings.officeJsPreview.Visio.Page {
    
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
  class PageCollection ()
    extends StObject
       with typings.officeJsPreview.Visio.PageCollection {
    
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
  class PageView ()
    extends StObject
       with typings.officeJsPreview.Visio.PageView {
    
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
  class RequestContext ()
    extends StObject
       with typings.officeJsPreview.Visio.RequestContext {
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
  class Selection ()
    extends StObject
       with typings.officeJsPreview.Visio.Selection {
    
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
  class Shape ()
    extends StObject
       with typings.officeJsPreview.Visio.Shape {
    
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
  class ShapeCollection ()
    extends StObject
       with typings.officeJsPreview.Visio.ShapeCollection {
    
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
  class ShapeDataItem ()
    extends StObject
       with typings.officeJsPreview.Visio.ShapeDataItem {
    
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
  class ShapeDataItemCollection ()
    extends StObject
       with typings.officeJsPreview.Visio.ShapeDataItemCollection {
    
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
  class ShapeView ()
    extends StObject
       with typings.officeJsPreview.Visio.ShapeView {
    
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
    * Toolbar IDs of the app
    *
    * [Api set:  1.1]
    */
  @JSGlobal("Visio.ToolBarType")
  @js.native
  object ToolBarType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.officeJsPreview.Visio.ToolBarType & String] = js.native
    
    /* "CommandBar" */ val commandBar: typings.officeJsPreview.Visio.ToolBarType.commandBar & String = js.native
    
    /* "PageNavigationBar" */ val pageNavigationBar: typings.officeJsPreview.Visio.ToolBarType.pageNavigationBar & String = js.native
    
    /* "StatusBar" */ val statusBar: typings.officeJsPreview.Visio.ToolBarType.statusBar & String = js.native
  }
  
  /**
    * Executes a batch script that performs actions on the Visio object model, using a new request context. When the promise is resolved, any tracked objects that were automatically allocated during execution will be released.
    * @param batch - A function that takes in an Visio.RequestContext and returns a promise (typically, just the result of "context.sync()"). The context parameter facilitates requests to the Visio application. Since the Office add-in and the Visio application run in two different processes, the request context is required to get access to the Visio object model from the add-in.
    */
  inline def run[T](batch: js.Function1[/* context */ typings.officeJsPreview.Visio.RequestContext, js.Promise[T]]): js.Promise[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("run")(batch.asInstanceOf[js.Any]).asInstanceOf[js.Promise[T]]
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
    batch: js.Function1[/* context */ typings.officeJsPreview.Visio.RequestContext, js.Promise[T]]
  ): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("run")(contextObject.asInstanceOf[js.Any], batch.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
  /**
    * Executes a batch script that performs actions on the Visio object model, using the request context of previously-created API objects.
    * @param objects - An array of previously-created API objects. The array will be validated to make sure that all of the objects share the same context. The batch will use this shared request context, which means that any changes applied to these objects will be picked up by "context.sync()".
    * @param batch - A function that takes in a Visio.RequestContext and returns a promise (typically, just the result of "context.sync()"). When the promise is resolved, any tracked objects that were automatically allocated during execution will be released.
    */
  inline def run[T](
    objects: js.Array[ClientObject],
    batch: js.Function1[/* context */ typings.officeJsPreview.Visio.RequestContext, js.Promise[T]]
  ): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("run")(objects.asInstanceOf[js.Any], batch.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
  /**
    * Executes a batch script that performs actions on the Visio object model, using the request context of a previously-created API object.
    * @param object - A previously-created API object. The batch will use the same request context as the passed-in object, which means that any changes applied to the object will be picked up by "context.sync()".
    * @param batch - A function that takes in an Visio.RequestContext and returns a promise (typically, just the result of "context.sync()"). When the promise is resolved, any tracked objects that were automatically allocated during execution will be released.
    */
  inline def run[T](
    `object`: ClientObject,
    batch: js.Function1[/* context */ typings.officeJsPreview.Visio.RequestContext, js.Promise[T]]
  ): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("run")(`object`.asInstanceOf[js.Any], batch.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
  inline def run[T](
    `object`: EmbeddedSession,
    batch: js.Function1[/* context */ typings.officeJsPreview.Visio.RequestContext, js.Promise[T]]
  ): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("run")(`object`.asInstanceOf[js.Any], batch.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
}
