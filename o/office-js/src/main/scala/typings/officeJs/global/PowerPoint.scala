package typings.officeJs.global

import org.scalablytyped.runtime.StringDictionary
import typings.officeJs.OfficeExtension.ClientObject
import typings.officeJs.OfficeExtension.ClientRequestContext
import typings.officeJs.OfficeExtension.IPromise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

////////////////////////////////////////////////////////////////
//////////////////////// End Visio APIs ////////////////////////
////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////
//////////////////// Begin PowerPoint APIs /////////////////////
////////////////////////////////////////////////////////////////
object PowerPoint {
  
  @JSGlobal("PowerPoint")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * [Api set: PowerPointApi 1.0]
    */
  @JSGlobal("PowerPoint.Application")
  @js.native
  class Application ()
    extends StObject
       with typings.officeJs.PowerPoint.Application {
    
    /** The request context associated with the object */
    /* CompleteClass */
    var context: ClientRequestContext = js.native
    /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
    /* CompleteClass */
    @JSName("context")
    var context_Application: typings.officeJs.PowerPoint.RequestContext = js.native
    
    /**
      *  Returns a boolean value for whether the corresponding object is a null object. You must call `context.sync()` before reading the 
      * isNullObject property.
      */
    /* CompleteClass */
    var isNullObject: Boolean = js.native
    
    /**
      * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
      * Whereas the original PowerPoint.Application object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `PowerPoint.Interfaces.ApplicationData`) that contains shallow copies of any loaded child properties from the original object.
      */
    /* CompleteClass */
    override def toJSON(): StringDictionary[String] = js.native
  }
  object Application {
    
    @JSGlobal("PowerPoint.Application")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Create a new instance of PowerPoint.Application object
      */
    /* static member */
    @scala.inline
    def newObject(context: ClientRequestContext): typings.officeJs.PowerPoint.Application = ^.asInstanceOf[js.Dynamic].applyDynamic("newObject")(context.asInstanceOf[js.Any]).asInstanceOf[typings.officeJs.PowerPoint.Application]
  }
  
  @JSGlobal("PowerPoint.ErrorCodes")
  @js.native
  object ErrorCodes extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.officeJs.PowerPoint.ErrorCodes & String] = js.native
    
    /* "GeneralException" */ val generalException: typings.officeJs.PowerPoint.ErrorCodes.generalException & String = js.native
  }
  
  /**
    * [Api set: PowerPointApi 1.0]
    */
  @JSGlobal("PowerPoint.Presentation")
  @js.native
  class Presentation ()
    extends StObject
       with typings.officeJs.PowerPoint.Presentation {
    
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
    * The RequestContext object facilitates requests to the PowerPoint application. Since the Office add-in and the PowerPoint application run in two different processes, the request context is required to get access to the PowerPoint object model from the add-in.
    */
  @JSGlobal("PowerPoint.RequestContext")
  @js.native
  class RequestContext ()
    extends StObject
       with typings.officeJs.PowerPoint.RequestContext {
    def this(url: String) = this()
  }
  
  /**
    * Creates and opens a new presentation. Optionally, the presentation can be pre-populated with a base64-encoded .pptx file.
    *
    * [Api set: PowerPointApi 1.1]
    *
    * @param base64File Optional. The base64-encoded .pptx file. The default value is null.
    */
  @scala.inline
  def createPresentation(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("createPresentation")().asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def createPresentation(base64File: String): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("createPresentation")(base64File.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  /**
    * Executes a batch script that performs actions on the PowerPoint object model, using a new RequestContext. When the promise is resolved, any tracked objects that were automatically allocated during execution will be released.
    * @param batch - A function that takes in a RequestContext and returns a promise (typically, just the result of "context.sync()"). The context parameter facilitates requests to the PowerPoint application. Since the Office add-in and the PowerPoint application run in two different processes, the RequestContext is required to get access to the PowerPoint object model from the add-in.
    */
  @scala.inline
  def run[T](batch: js.Function1[/* context */ typings.officeJs.PowerPoint.RequestContext, IPromise[T]]): IPromise[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("run")(batch.asInstanceOf[js.Any]).asInstanceOf[IPromise[T]]
  /**
    * Executes a batch script that performs actions on the PowerPoint object model, using the RequestContext of previously-created API objects.
    * @param objects - An array of previously-created API objects. The array will be validated to make sure that all of the objects share the same context. The batch will use this shared RequestContext, which means that any changes applied to these objects will be picked up by "context.sync()".
    * @param batch - A function that takes in a RequestContext and returns a promise (typically, just the result of "context.sync()"). The context parameter facilitates requests to the PowerPoint application. Since the Office add-in and the PowerPoint application run in two different processes, the RequestContext is required to get access to the PowerPoint object model from the add-in.
    */
  @scala.inline
  def run[T](
    objects: js.Array[ClientObject],
    batch: js.Function1[/* context */ typings.officeJs.PowerPoint.RequestContext, IPromise[T]]
  ): IPromise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("run")(objects.asInstanceOf[js.Any], batch.asInstanceOf[js.Any])).asInstanceOf[IPromise[T]]
  /**
    * Executes a batch script that performs actions on the PowerPoint object model, using the RequestContext of a previously-created API object. When the promise is resolved, any tracked objects that were automatically allocated during execution will be released.
    * @param object - A previously-created API object. The batch will use the same RequestContext as the passed-in object, which means that any changes applied to the object will be picked up by "context.sync()".
    * @param batch - A function that takes in a RequestContext and returns a promise (typically, just the result of "context.sync()"). The context parameter facilitates requests to the PowerPoint application. Since the Office add-in and the PowerPoint application run in two different processes, the RequestContext is required to get access to the PowerPoint object model from the add-in.
    */
  @scala.inline
  def run[T](
    `object`: ClientObject,
    batch: js.Function1[/* context */ typings.officeJs.PowerPoint.RequestContext, IPromise[T]]
  ): IPromise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("run")(`object`.asInstanceOf[js.Any], batch.asInstanceOf[js.Any])).asInstanceOf[IPromise[T]]
}
