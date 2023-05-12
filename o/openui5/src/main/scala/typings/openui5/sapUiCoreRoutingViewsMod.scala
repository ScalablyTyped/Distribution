package typings.openui5

import typings.openui5.anon.AsyncComponent
import typings.openui5.anon.ViewNameString
import typings.openui5.sap.ClassInfo
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiCoreRoutingViewsMod {
  
  @JSImport("sap/ui/core/routing/Views", JSImport.Default)
  @js.native
  /**
    * Instantiates a view repository that creates and caches views. If it is destroyed, all the Views it created
    * are destroyed. Usually you do not have to create instances of this class, it is used by the {@link sap.ui.core.routing.Router}.
    * If you are using {@link sap.ui.core.routing.Targets} without using a {@link sap.ui.core.UIComponent}
    * you have to create an instance of this class. They will create an instance on their own, or if they are
    * used with a {@link sap.ui.core.UIComponent} they will share the same instance of Views.
    */
  open class default () extends Views {
    def this(oOptions: AsyncComponent) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/core/routing/Views", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.core.routing.Views with name `sClassName` and enriches it with
      * the information contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.ui.base.EventProvider.extend}.
      *
      * @returns Created class / constructor function
      */
    inline def extend[T /* <: Record[String, Any] */](/**
      * Name of the class being created
      */
    sClassName: String): js.Function = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any]).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: Unit,
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, Views]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, Views],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.core.routing.Views.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiBaseMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiBaseMetadataMod.default]
  }
  
  @js.native
  trait Views
    extends typings.openui5.sapUiBaseEventProviderMod.default {
    
    /**
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
      * Fires event {@link #event:created created} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireCreated(): this.type = js.native
    def fireCreated(/**
      * Parameters to pass along with the event
      */
    oParameters: js.Object): this.type = js.native
    
    /**
      * Returns a cached view, for a given name. If it does not exist yet, it will create the view with the provided
      * options. If you provide a viewId, it will be prefixed with the viewId of the component.
      *
      * @returns A promise that is resolved when the view is loaded {@link sap.ui.core.mvc.View#loaded}. The
      * view instance will be passed to the promise.
      */
    def getView(
      /**
      * see {@link sap.ui.view} for the documentation. The viewId you pass into the options will be prefixed
      * with the id of the component you pass into the constructor. So you can retrieve the view later by calling
      * the {@link sap.ui.core.UIComponent#byId} function of the UIComponent.
      */
    oOptions: ViewNameString
    ): js.Promise[Any] = js.native
    
    /**
      * Adds or overwrites a view in the cache of the Views instance. The viewName serves as a key for caching.
      *
      * If the second parameter is set to null or undefined, the previous cache view under the same name isn't
      * managed by the Views instance. The lifecycle (for example the destroy of the view) of the view instance
      * should be maintained by additional code.
      *
      * @returns this for chaining.
      */
    def setView(
      /**
      * Name of the view, may differ from the actual viewName of the oView parameter provided, since you can
      * retrieve this view per {@link #.getView}.
      */
    sViewName: String
    ): this.type = js.native
    def setView(
      /**
      * Name of the view, may differ from the actual viewName of the oView parameter provided, since you can
      * retrieve this view per {@link #.getView}.
      */
    sViewName: String,
      /**
      * the view instance
      */
    oView: typings.openui5.sapUiCoreMvcViewMod.default
    ): this.type = js.native
  }
}
