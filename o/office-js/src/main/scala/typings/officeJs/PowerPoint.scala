package typings.officeJs

import org.scalablytyped.runtime.StringDictionary
import typings.officeJs.OfficeExtension.ClientObject
import typings.officeJs.OfficeExtension.ClientRequestContext
import typings.officeJs.PowerPoint.Interfaces.PresentationData
import typings.officeJs.PowerPoint.Interfaces.PresentationLoadOptions
import typings.officeJs.anon.Expand
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
  
  @js.native
  sealed trait ErrorCodes extends StObject
  @JSGlobal("PowerPoint.ErrorCodes")
  @js.native
  object ErrorCodes extends StObject {
    
    @js.native
    sealed trait generalException
      extends StObject
         with ErrorCodes
  }
  
  /**
    * [Api set: PowerPointApi 1.0]
    */
  trait Application
    extends StObject
       with ClientObject {
    
    /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
    @JSName("context")
    var context_Application: RequestContext
    
    /**
      * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
      * Whereas the original PowerPoint.Application object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `PowerPoint.Interfaces.ApplicationData`) that contains shallow copies of any loaded child properties from the original object.
      */
    def toJSON(): StringDictionary[String]
  }
  object Application {
    
    inline def apply(context: RequestContext, isNullObject: Boolean, toJSON: () => StringDictionary[String]): Application = {
      val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], isNullObject = isNullObject.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON))
      __obj.asInstanceOf[Application]
    }
    
    extension [Self <: Application](x: Self) {
      
      inline def setContext(value: RequestContext): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setToJSON(value: () => StringDictionary[String]): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
    }
  }
  
  object Interfaces {
    
    /**
      * Provides ways to load properties of only a subset of members of a collection.
      */
    trait CollectionLoadOptions extends StObject {
      
      /**
        * Specify the number of items in the collection that are to be skipped and not included in the result. If top is specified, the selection of result will start after skipping the specified number of items.
        */
      @JSName("$skip")
      var $skip: js.UndefOr[Double] = js.undefined
      
      /**
        * Specify the number of items in the queried collection to be included in the result.
        */
      @JSName("$top")
      var $top: js.UndefOr[Double] = js.undefined
    }
    object CollectionLoadOptions {
      
      inline def apply(): CollectionLoadOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[CollectionLoadOptions]
      }
      
      extension [Self <: CollectionLoadOptions](x: Self) {
        
        inline def set$skip(value: Double): Self = StObject.set(x, "$skip", value.asInstanceOf[js.Any])
        
        inline def set$skipUndefined: Self = StObject.set(x, "$skip", js.undefined)
        
        inline def set$top(value: Double): Self = StObject.set(x, "$top", value.asInstanceOf[js.Any])
        
        inline def set$topUndefined: Self = StObject.set(x, "$top", js.undefined)
      }
    }
    
    /** An interface describing the data returned by calling `presentation.toJSON()`. */
    trait PresentationData extends StObject {
      
      var title: js.UndefOr[String] = js.undefined
    }
    object PresentationData {
      
      inline def apply(): PresentationData = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[PresentationData]
      }
      
      extension [Self <: PresentationData](x: Self) {
        
        inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
        
        inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      }
    }
    
    /**
      * [Api set: PowerPointApi 1.0]
      */
    trait PresentationLoadOptions extends StObject {
      
      /**
        Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
        */
      @JSName("$all")
      var $all: js.UndefOr[Boolean] = js.undefined
      
      var title: js.UndefOr[Boolean] = js.undefined
    }
    object PresentationLoadOptions {
      
      inline def apply(): PresentationLoadOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[PresentationLoadOptions]
      }
      
      extension [Self <: PresentationLoadOptions](x: Self) {
        
        inline def set$all(value: Boolean): Self = StObject.set(x, "$all", value.asInstanceOf[js.Any])
        
        inline def set$allUndefined: Self = StObject.set(x, "$all", js.undefined)
        
        inline def setTitle(value: Boolean): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
        
        inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      }
    }
  }
  
  /**
    * [Api set: PowerPointApi 1.0]
    */
  @js.native
  trait Presentation
    extends StObject
       with ClientObject {
    
    /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
    @JSName("context")
    var context_Presentation: RequestContext = js.native
    
    /**
      * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
      *
      * @param options Provides options for which properties of the object to load.
      */
    def load(): Presentation = js.native
    def load(options: PresentationLoadOptions): Presentation = js.native
    def load(propertyNamesAndPaths: Expand): Presentation = js.native
    def load(propertyNames: String): Presentation = js.native
    def load(propertyNames: js.Array[String]): Presentation = js.native
    
    val title: String = js.native
    
    /**
      * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
      * Whereas the original PowerPoint.Presentation object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `PowerPoint.Interfaces.PresentationData`) that contains shallow copies of any loaded child properties from the original object.
      */
    def toJSON(): PresentationData = js.native
  }
  
  /**
    * The RequestContext object facilitates requests to the PowerPoint application. Since the Office add-in and the PowerPoint application run in two different processes, the request context is required to get access to the PowerPoint object model from the add-in.
    */
  @js.native
  trait RequestContext
    extends StObject
       with ClientRequestContext {
    
    val application: Application = js.native
    
    val presentation: Presentation = js.native
  }
}
