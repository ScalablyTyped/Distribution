package typings.openui5

import typings.openui5.anon.RootView
import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiCoreComponentMod.ComponentSettings
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiCoreUicomponentMod {
  
  @JSImport("sap/ui/core/UIComponent", JSImport.Default)
  @js.native
  /**
    * Creates and initializes a new UIComponent with the given `sId` and settings.
    *
    * The set of allowed entries in the `mSettings` object depends on the concrete subclass and is described
    * there. See {@link sap.ui.core.Component} for a general description of this argument.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends UIComponent {
    def this(/**
      * Optional map/JSON-object with initial settings for the new component instance
      */
    mSettings: UIComponentSettings) = this()
    def this(/**
      * Optional ID for the new control; generated automatically if no non-empty ID is given; Note: this can
      * be omitted, no matter whether `mSettings` will be given or not
      */
    sId: String) = this()
    def this(
      /**
      * Optional ID for the new control; generated automatically if no non-empty ID is given; Note: this can
      * be omitted, no matter whether `mSettings` will be given or not
      */
    sId: String,
      /**
      * Optional map/JSON-object with initial settings for the new component instance
      */
    mSettings: UIComponentSettings
    ) = this()
    def this(
      /**
      * Optional ID for the new control; generated automatically if no non-empty ID is given; Note: this can
      * be omitted, no matter whether `mSettings` will be given or not
      */
    sId: Unit,
      /**
      * Optional map/JSON-object with initial settings for the new component instance
      */
    mSettings: UIComponentSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/core/UIComponent", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class `sap.ui.core.UIComponent` with name `sClassName` and enriches it with
      * the information contained in `oClassInfo`. `oClassInfo` might contain the same kind of information as
      * described in {@link sap.ui.core.Component.extend}.
      *
      * @returns The created class / constructor function
      */
    inline def extend[T /* <: Record[String, Any] */](/**
      * Qualified name of the newly created class
      */
    sClassName: String): js.Function = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any]).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Qualified name of the newly created class
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: Unit,
      /**
      * Constructor function for the metadata object. If not given, it defaults to an internal subclass of `sap.ui.core.ComponentMetadata`.
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Qualified name of the newly created class
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, UIComponent]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Qualified name of the newly created class
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, UIComponent],
      /**
      * Constructor function for the metadata object. If not given, it defaults to an internal subclass of `sap.ui.core.ComponentMetadata`.
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.core.UIComponent.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreComponentMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreComponentMetadataMod.default]
    
    inline def getRouterFor(
      /**
      * either a view or controller
      */
    oControllerOrView: typings.openui5.sapUiCoreMvcControllerMod.default
    ): typings.openui5.sapUiCoreRoutingRouterMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getRouterFor")(oControllerOrView.asInstanceOf[js.Any]).asInstanceOf[typings.openui5.sapUiCoreRoutingRouterMod.default]
    /**
      * @SINCE 1.16.1
      *
      * Returns the reference to the router instance.
      *
      * The passed controller or view has to be created in the context of a UIComponent to return the router
      * instance. Otherwise this function will return undefined. You may define the routerClass property in the
      * config section of the routing to make the Component create your router extension.
      *
      * Example:
      * ```javascript
      *
      * routing: {
      * 	config: {
      * 		routerClass : myAppNamespace.MyRouterClass
      * 		...
      * }
      * ...
      * ```
      *
      *
      * @returns the router instance
      */
    inline def getRouterFor(
      /**
      * either a view or controller
      */
    oControllerOrView: typings.openui5.sapUiCoreMvcViewMod.default
    ): typings.openui5.sapUiCoreRoutingRouterMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getRouterFor")(oControllerOrView.asInstanceOf[js.Any]).asInstanceOf[typings.openui5.sapUiCoreRoutingRouterMod.default]
  }
  
  trait RoutingMetadata extends StObject {
    
    /**
      * Since 1.16. An object containing default values used for routes and targets. See {@link sap.ui.core.routing.Router#constructor}
      * and {@link sap.ui.core.routing.Targets} for more documentation.
      */
    var config: js.UndefOr[RootView] = js.undefined
    
    /**
      * An object containing the routes that should be added to the router. See {@link sap.ui.core.routing.Route}
      * for the allowed properties.
      */
    var routes: js.UndefOr[js.Object] = js.undefined
    
    /**
      * Since 1.28.1. An object containing the targets that will be available for the router and the `Targets`
      * instance. See {@link sap.ui.core.routing.Targets} for the allowed values.
      */
    var targets: js.UndefOr[js.Object] = js.undefined
  }
  object RoutingMetadata {
    
    inline def apply(): RoutingMetadata = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RoutingMetadata]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RoutingMetadata] (val x: Self) extends AnyVal {
      
      inline def setConfig(value: RootView): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      inline def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
      
      inline def setRoutes(value: js.Object): Self = StObject.set(x, "routes", value.asInstanceOf[js.Any])
      
      inline def setRoutesUndefined: Self = StObject.set(x, "routes", js.undefined)
      
      inline def setTargets(value: js.Object): Self = StObject.set(x, "targets", value.asInstanceOf[js.Any])
      
      inline def setTargetsUndefined: Self = StObject.set(x, "targets", js.undefined)
    }
  }
  
  @js.native
  trait UIComponent
    extends typings.openui5.sapUiCoreComponentMod.default {
    
    /**
      * Returns an element by its ID in the context of the component.
      *
      * @returns element by its ID or `undefined`
      */
    def byId(/**
      * Component local ID of the element
      */
    sId: String): js.UndefOr[typings.openui5.sapUiCoreElementMod.default] = js.native
    
    /**
      * Hook method to create the content (UI Control Tree) of this component.
      *
      * The default implementation in this class reads the name (and optionally type) of a root view from the
      * descriptor for this component (path `/sap.ui5/rootView`) or, for backward compatibility, just the name
      * from static component metadata (property `rootView`). When no type is specified, it defaults to XML.
      * The method then calls the {@link sap.ui.view view factory} to instantiate the root view and returns the
      * result.
      *
      * When there is no root view configuration, `null` will be returned.
      *
      * This method can be overwritten by subclasses if the default implementation doesn't fit their needs. Subclasses
      * are not limited to views as return type but may return any control, but only a single control (can be
      * the root of a larger control tree, however).
      *
      * A `sap.ui.core.UIComponent` subclass can additionally implement the {@link sap.ui.core.IAsyncContentCreation}
      * interface. When implementing this interface the loading and processing of an asynchronous `rootView`
      * will be chained into the result Promise of the {@link sap.ui.core.Component.create Component.create}
      * factory. An additional async flag can be omitted. See Sample 1 below.
      *
      * Samples 2 and 3 show how subclasses can overwrite the `createContent` function to run asynchronously.
      * To create the root control asynchronously, the subclass has to define the `sap.ui.core.IAsyncContentCreation`
      * interface in the metadata.
      *
      * @returns Root control of the UI tree, or a promise resolving with the root control, or `null`, if none
      * is configured.
      */
    def createContent(): typings.openui5.sapUiCoreControlMod.default | (js.Promise[typings.openui5.sapUiCoreControlMod.default | Null]) | Null = js.native
    
    /**
      * Convert the given component local element ID to a globally unique ID by prefixing it with the component
      * ID.
      *
      * @returns prefixed id
      */
    def createId(/**
      * Component local ID of the element
      */
    sId: String): String = js.native
    
    /**
      * @SINCE 1.15.1
      *
      * A method to be implemented by UIComponents, returning the flag whether to prefix the IDs of controls
      * automatically or not if the controls are created inside the {@link sap.ui.core.UIComponent#createContent}
      * function. By default this feature is not activated.
      *
      * You can overwrite this function and return `true` to activate the automatic prefixing. In addition the
      * default behavior can be configured in the manifest by specifying the entry `sap.ui5/autoPrefixId`.
      *
      * @returns true, if the Controls IDs should be prefixed automatically
      */
    def getAutoPrefixId(): Boolean = js.native
    
    /**
      * @SINCE 1.39.0
      *
      * Returns the local ID of an element by removing the component ID prefix or `null` if the ID does not contain
      * a prefix.
      *
      * @returns ID without prefix or `null`
      */
    def getLocalId(/**
      * Prefixed ID
      */
    sId: String): String | Null = js.native
    
    /**
      * @SINCE 1.44.0
      *
      * Returns the content of {@link sap.ui.core.UIComponent#createContent}. If you specified a `rootView` in
      * your metadata or in the descriptor file (manifest.json), you will get the instance of the root view.
      * This getter will only return something if the {@link sap.ui.core.UIComponent#init} function was invoked.
      * If `createContent` is not implemented, and there is no root view, it will return `null`. Here is an example:
      *
      * ```javascript
      *
      *          var MyExtension = UIComponent.extend("my.Component", {
      *               metadata: {
      *                    rootView: "my.View"
      *               },
      *               init: function () {
      *                    this.getRootControl(); // returns null
      *                    UIComponent.prototype.init.apply(this, arguments);
      *                    this.getRootControl(); // returns the view "my.View"
      *               }
      *          });
      *     ```
      *
      *
      * @returns the control created by {@link sap.ui.core.UIComponent#createContent}
      */
    def getRootControl(): typings.openui5.sapUiCoreControlMod.default = js.native
    
    /**
      * @SINCE 1.16.1
      *
      * Returns the reference to the router instance which has been created by the UIComponent once the routes
      * in the routing metadata has been defined.
      *
      * @returns the router instance
      */
    def getRouter(): typings.openui5.sapUiCoreRoutingRouterMod.default = js.native
    
    /**
      * @SINCE 1.28
      *
      * Returns the reference to the Targets instance which has been created by the UIComponent once the targets
      * in the routing metadata has been defined. If routes have been defined, it will be the Targets instance
      * created and used by the router.
      *
      * @returns the targets instance
      */
    def getTargets(): typings.openui5.sapUiCoreRoutingTargetsMod.default = js.native
    
    /**
      * Returns the reference to the UIArea of the container.
      *
      * @returns reference to the UIArea of the container
      */
    def getUIArea(): typings.openui5.sapUiCoreUiareaMod.default = js.native
    
    /**
      * Function is called when the rendering of the ComponentContainer is completed.
      *
      * Applications must not call this hook method directly, it is called from ComponentContainer.
      *
      * Subclasses of UIComponent override this hook to implement any necessary actions after the rendering.
      */
    def onAfterRendering(): Unit = js.native
    
    /**
      * Function is called when the rendering of the ComponentContainer is started.
      *
      * Applications must not call this hook method directly, it is called from ComponentContainer.
      *
      * Subclasses of UIComponent override this hook to implement any necessary actions before the rendering.
      */
    def onBeforeRendering(): Unit = js.native
    
    /**
      * Renders the root control of the UIComponent.
      */
    def render(
      /**
      * a RenderManager instance
      */
    oRenderManager: typings.openui5.sapUiCoreRenderManagerMod.default
    ): Unit = js.native
    
    /**
      * @SINCE 1.90.0
      *
      * Returns a Promise representing the loading state of the root control.
      *
      * For UIComponents implementing the {@link sap.ui.core.IAsyncContentCreation} interface, there are two
      * possible cases:
      * 	 -  The `UIComponent` overwrites the {@link sap.ui.core.UIComponent#createContent} function and returns
      * 			a Promise. The `rootControlLoaded` function will then return the same Promise.
      * 	 -  The `UIComponent` defines a root view via its manifest. The root view is then automatically created
      * 			asynchronously, and the `rootControlLoaded` function returns a Promise which resolves with the fully
      * 			loaded and processed root view instance.
      *
      * For synchronous root control creation the Promise resolves immediately with the root control instance
      * or null if none was created.
      *
      * @returns resolves with the created root control or null if none was created, rejects with any thrown
      * error
      */
    def rootControlLoaded(): js.Promise[typings.openui5.sapUiCoreControlMod.default | Null] = js.native
    
    /**
      * Sets the reference to the ComponentContainer - later required for the determination of the UIArea for
      * the UIComponent.
      *
      * @returns reference to this instance to allow method chaining
      */
    def setContainer(
      /**
      * reference to a ComponentContainer
      */
    oContainer: typings.openui5.sapUiCoreComponentContainerMod.default
    ): this.type = js.native
  }
  
  type UIComponentSettings = ComponentSettings
}
