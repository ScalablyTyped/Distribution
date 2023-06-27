package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiCoreRoutingRouteMod {
  
  @JSImport("sap/ui/core/routing/Route", JSImport.Default)
  @js.native
  open class default protected () extends Route {
    /**
      * Instantiates a route
      */
    def this(
      /**
      * Router instance to which the route will be added
      */
    oRouter: typings.openui5.sapUiCoreRoutingRouterMod.default,
      /**
      * Configuration object for the route
      */
    oConfig: RouteSettings
    ) = this()
    def this(
      /**
      * Router instance to which the route will be added
      */
    oRouter: typings.openui5.sapUiCoreRoutingRouterMod.default,
      /**
      * Configuration object for the route
      */
    oConfig: RouteSettings,
      /**
      * The parent route - if a parent route is given, the routeMatched event of this route will also trigger
      * the route matched of the parent and it will also create the view of the parent(if provided).
      */
    oParent: Route
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/core/routing/Route", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.core.routing.Route with name `sClassName` and enriches it with
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
    oClassInfo: ClassInfo[T, Route]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, Route],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.core.routing.Route.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiBaseMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiBaseMetadataMod.default]
  }
  
  @js.native
  trait Route
    extends typings.openui5.sapUiBaseEventProviderMod.default {
    
    /**
      * @since 1.46.1
      *
      * Attaches event handler `fnFunction` to the {@link #event:beforeMatched beforeMatched} event of this `sap.ui.core.routing.Route`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.core.routing.Route` itself.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachBeforeMatched(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* evt */ RouteBeforeMatchedEvent, Unit]
    ): this.type = js.native
    def attachBeforeMatched(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* evt */ RouteBeforeMatchedEvent, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `Route` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * @since 1.46.1
      *
      * Attaches event handler `fnFunction` to the {@link #event:beforeMatched beforeMatched} event of this `sap.ui.core.routing.Route`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.core.routing.Route` itself.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachBeforeMatched(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* evt */ RouteBeforeMatchedEvent, Unit]
    ): this.type = js.native
    def attachBeforeMatched(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* evt */ RouteBeforeMatchedEvent, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `Route` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * @since 1.25.1
      *
      * Attaches event handler `fnFunction` to the {@link #event:matched matched} event of this `sap.ui.core.routing.Route`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.core.routing.Route` itself.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachMatched(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* evt */ RouteMatchedEvent, Unit]
    ): this.type = js.native
    def attachMatched(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* evt */ RouteMatchedEvent, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.core.routing.Route` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * @since 1.25.1
      *
      * Attaches event handler `fnFunction` to the {@link #event:matched matched} event of this `sap.ui.core.routing.Route`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.core.routing.Route` itself.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachMatched(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* evt */ RouteMatchedEvent, Unit]
    ): this.type = js.native
    def attachMatched(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* evt */ RouteMatchedEvent, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.core.routing.Route` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * @since 1.25.1
      *
      * Attaches event handler `fnFunction` to the {@link #event:patternMatched patternMatched} event of this
      * `sap.ui.core.routing.Route`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.core.routing.Route` itself.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachPatternMatched(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* evt */ RoutePatternMatchedEvent, Unit]
    ): this.type = js.native
    def attachPatternMatched(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* evt */ RoutePatternMatchedEvent, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `Route` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * @since 1.25.1
      *
      * Attaches event handler `fnFunction` to the {@link #event:patternMatched patternMatched} event of this
      * `sap.ui.core.routing.Route`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.core.routing.Route` itself.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachPatternMatched(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* evt */ RoutePatternMatchedEvent, Unit]
    ): this.type = js.native
    def attachPatternMatched(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* evt */ RoutePatternMatchedEvent, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `Route` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * @since 1.46.1
      *
      * Detaches event handler `fnFunction` from the {@link #event:beforeMatched beforeMatched} event of this
      * `sap.ui.core.routing.Route`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachBeforeMatched(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* evt */ RouteBeforeMatchedEvent, Unit]
    ): this.type = js.native
    def detachBeforeMatched(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* evt */ RouteBeforeMatchedEvent, Unit],
      /**
      * Context object on which the given function had to be called
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * @since 1.25.1
      *
      * Detaches event handler `fnFunction` from the {@link #event:matched matched} event of this `sap.ui.core.routing.Route`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachMatched(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* evt */ RouteMatchedEvent, Unit]
    ): this.type = js.native
    def detachMatched(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* evt */ RouteMatchedEvent, Unit],
      /**
      * Context object on which the given function had to be called
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * @since 1.25.1
      *
      * Detaches event handler `fnFunction` from the {@link #event:patternMatched patternMatched} event of this
      * `sap.ui.core.routing.Route`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachPatternMatched(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* evt */ RoutePatternMatchedEvent, Unit]
    ): this.type = js.native
    def detachPatternMatched(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* evt */ RoutePatternMatchedEvent, Unit],
      /**
      * Context object on which the given function had to be called
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * @since 1.46.1
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Fires event {@link #event:beforeMatched beforeMatched} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireBeforeMatched(): typings.openui5.sapUiCoreRoutingRouterMod.default = js.native
    def fireBeforeMatched(
      /**
      * Parameters to pass along with the event
      */
    oParameters: Route$BeforeMatchedEventParameters
    ): typings.openui5.sapUiCoreRoutingRouterMod.default = js.native
    
    /**
      * Returns the pattern of the route. If there are multiple patterns, the first pattern is returned
      *
      * @returns the routes pattern
      */
    def getPattern(): String = js.native
    
    /**
      * Returns the URL for the route and replaces the placeholders with the values in oParameters
      *
      * @returns the unencoded pattern with interpolated arguments
      */
    def getURL(/**
      * Parameters for the route
      */
    oParameters: js.Object): String = js.native
    
    /**
      * @since 1.58.0
      *
      * Returns whether the given hash can be matched by the Route
      *
      * @returns whether the hash can be matched
      */
    def `match`(/**
      * which will be tested by the Route
      */
    sHash: String): Boolean = js.native
  }
  
  trait Route$BeforeMatchedEventParameters extends StObject {
    
    /**
      * A key-value pair object which contains the arguments defined in the route resolved with the corresponding
      * information from the current URL hash
      */
    var arguments: js.UndefOr[js.Object] = js.undefined
    
    /**
      * The configuration object of the route
      */
    var config: js.UndefOr[js.Object] = js.undefined
    
    /**
      * The name of the route
      */
    var name: js.UndefOr[String] = js.undefined
    
    /**
      * The nested route instance of this route. The event is fired on this route because the pattern in the
      * nested route is matched with the current URL hash. This parameter can be used to decide whether the current
      * route is matched because of its nested child route. For more information about nested child route please
      * refer to the documentation of oConfig.parent in {@link sap.ui.core.routing.Route#constructor}
      */
    var nestedRoute: js.UndefOr[Route] = js.undefined
  }
  object Route$BeforeMatchedEventParameters {
    
    inline def apply(): Route$BeforeMatchedEventParameters = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Route$BeforeMatchedEventParameters]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Route$BeforeMatchedEventParameters] (val x: Self) extends AnyVal {
      
      inline def setArguments(value: js.Object): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
      
      inline def setArgumentsUndefined: Self = StObject.set(x, "arguments", js.undefined)
      
      inline def setConfig(value: js.Object): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      inline def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setNestedRoute(value: Route): Self = StObject.set(x, "nestedRoute", value.asInstanceOf[js.Any])
      
      inline def setNestedRouteUndefined: Self = StObject.set(x, "nestedRoute", js.undefined)
    }
  }
  
  trait Route$MatchedEventParameters extends StObject {
    
    /**
      * A key-value pair object which contains the arguments defined in the route resolved with the corresponding
      * information from the current URL hash
      */
    var arguments: js.UndefOr[js.Object] = js.undefined
    
    /**
      * The configuration object of the route
      */
    var config: js.UndefOr[js.Object] = js.undefined
    
    /**
      * The name of the route
      */
    var name: js.UndefOr[String] = js.undefined
    
    /**
      * The nested route instance of this route. The event is fired on this route because the pattern in the
      * nested route is matched with the current URL hash. This parameter can be used to decide whether the current
      * route is matched because of its nested child route. For more information about nested child route please
      * refer to the documentation of oConfig.parent in {@link sap.ui.core.routing.Route#constructor}
      */
    var nestedRoute: js.UndefOr[Route] = js.undefined
    
    /**
      * The container control to which the first View or ComponentContainer is added. If multiple targets are
      * displayed, use oEvent.getParameters.targetControls to get all container controls
      */
    var targetControl: js.UndefOr[typings.openui5.sapUiCoreControlMod.default] = js.undefined
    
    /**
      * The container controls to which the View or ComponentContainer instances are added.
      */
    var targetControls: js.UndefOr[js.Array[typings.openui5.sapUiCoreControlMod.default]] = js.undefined
    
    /**
      * The first View or ComponentContainer instance which is created out of the first target. If multiple targets
      * are displayed, use oEvent.getParameters.views to get all instances
      */
    var view: js.UndefOr[
        typings.openui5.sapUiCoreMvcViewMod.default | typings.openui5.sapUiCoreComponentContainerMod.default
      ] = js.undefined
    
    /**
      * All View or ComponentContainer instances which are created out of the targets.
      */
    var views: js.UndefOr[
        js.Array[
          typings.openui5.sapUiCoreMvcViewMod.default | typings.openui5.sapUiCoreComponentContainerMod.default
        ]
      ] = js.undefined
  }
  object Route$MatchedEventParameters {
    
    inline def apply(): Route$MatchedEventParameters = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Route$MatchedEventParameters]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Route$MatchedEventParameters] (val x: Self) extends AnyVal {
      
      inline def setArguments(value: js.Object): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
      
      inline def setArgumentsUndefined: Self = StObject.set(x, "arguments", js.undefined)
      
      inline def setConfig(value: js.Object): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      inline def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setNestedRoute(value: Route): Self = StObject.set(x, "nestedRoute", value.asInstanceOf[js.Any])
      
      inline def setNestedRouteUndefined: Self = StObject.set(x, "nestedRoute", js.undefined)
      
      inline def setTargetControl(value: typings.openui5.sapUiCoreControlMod.default): Self = StObject.set(x, "targetControl", value.asInstanceOf[js.Any])
      
      inline def setTargetControlUndefined: Self = StObject.set(x, "targetControl", js.undefined)
      
      inline def setTargetControls(value: js.Array[typings.openui5.sapUiCoreControlMod.default]): Self = StObject.set(x, "targetControls", value.asInstanceOf[js.Any])
      
      inline def setTargetControlsUndefined: Self = StObject.set(x, "targetControls", js.undefined)
      
      inline def setTargetControlsVarargs(value: typings.openui5.sapUiCoreControlMod.default*): Self = StObject.set(x, "targetControls", js.Array(value*))
      
      inline def setView(
        value: typings.openui5.sapUiCoreMvcViewMod.default | typings.openui5.sapUiCoreComponentContainerMod.default
      ): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
      
      inline def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
      
      inline def setViews(
        value: js.Array[
              typings.openui5.sapUiCoreMvcViewMod.default | typings.openui5.sapUiCoreComponentContainerMod.default
            ]
      ): Self = StObject.set(x, "views", value.asInstanceOf[js.Any])
      
      inline def setViewsUndefined: Self = StObject.set(x, "views", js.undefined)
      
      inline def setViewsVarargs(
        value: (typings.openui5.sapUiCoreMvcViewMod.default | typings.openui5.sapUiCoreComponentContainerMod.default)*
      ): Self = StObject.set(x, "views", js.Array(value*))
    }
  }
  
  trait Route$PatternMatchedEventParameters extends StObject {
    
    /**
      * A key-value pair object which contains the arguments defined in the route resolved with the corresponding
      * information from the current URL hash
      */
    var arguments: js.UndefOr[js.Object] = js.undefined
    
    /**
      * The configuration object of the route
      */
    var config: js.UndefOr[js.Object] = js.undefined
    
    /**
      * The name of the route
      */
    var name: js.UndefOr[String] = js.undefined
    
    /**
      * The container control to which the first View or ComponentContainer is added. If multiple targets are
      * displayed, use oEvent.getParameters.targetControls to get all container controls
      */
    var targetControl: js.UndefOr[typings.openui5.sapUiCoreControlMod.default] = js.undefined
    
    /**
      * The container controls to which the View or ComponentContainer instances are added.
      */
    var targetControls: js.UndefOr[js.Array[typings.openui5.sapUiCoreControlMod.default]] = js.undefined
    
    /**
      * The first View or ComponentContainer instance which is created out of the first target. If multiple targets
      * are displayed, use oEvent.getParameters.views to get all instances
      */
    var view: js.UndefOr[
        typings.openui5.sapUiCoreMvcViewMod.default | typings.openui5.sapUiCoreComponentContainerMod.default
      ] = js.undefined
    
    /**
      * All View or ComponentContainer instances which are created out of the targets.
      */
    var views: js.UndefOr[
        js.Array[
          typings.openui5.sapUiCoreMvcViewMod.default | typings.openui5.sapUiCoreComponentContainerMod.default
        ]
      ] = js.undefined
  }
  object Route$PatternMatchedEventParameters {
    
    inline def apply(): Route$PatternMatchedEventParameters = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Route$PatternMatchedEventParameters]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Route$PatternMatchedEventParameters] (val x: Self) extends AnyVal {
      
      inline def setArguments(value: js.Object): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
      
      inline def setArgumentsUndefined: Self = StObject.set(x, "arguments", js.undefined)
      
      inline def setConfig(value: js.Object): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      inline def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setTargetControl(value: typings.openui5.sapUiCoreControlMod.default): Self = StObject.set(x, "targetControl", value.asInstanceOf[js.Any])
      
      inline def setTargetControlUndefined: Self = StObject.set(x, "targetControl", js.undefined)
      
      inline def setTargetControls(value: js.Array[typings.openui5.sapUiCoreControlMod.default]): Self = StObject.set(x, "targetControls", value.asInstanceOf[js.Any])
      
      inline def setTargetControlsUndefined: Self = StObject.set(x, "targetControls", js.undefined)
      
      inline def setTargetControlsVarargs(value: typings.openui5.sapUiCoreControlMod.default*): Self = StObject.set(x, "targetControls", js.Array(value*))
      
      inline def setView(
        value: typings.openui5.sapUiCoreMvcViewMod.default | typings.openui5.sapUiCoreComponentContainerMod.default
      ): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
      
      inline def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
      
      inline def setViews(
        value: js.Array[
              typings.openui5.sapUiCoreMvcViewMod.default | typings.openui5.sapUiCoreComponentContainerMod.default
            ]
      ): Self = StObject.set(x, "views", value.asInstanceOf[js.Any])
      
      inline def setViewsUndefined: Self = StObject.set(x, "views", js.undefined)
      
      inline def setViewsVarargs(
        value: (typings.openui5.sapUiCoreMvcViewMod.default | typings.openui5.sapUiCoreComponentContainerMod.default)*
      ): Self = StObject.set(x, "views", js.Array(value*))
    }
  }
  
  trait Route$SwitchedEventParameters extends StObject {
    
    /**
      * A key-value pair object which contains the arguments defined in the route resolved with the corresponding
      * information from the current URL hash
      */
    var arguments: js.UndefOr[js.Object] = js.undefined
    
    /**
      * The configuration object of the route
      */
    var config: js.UndefOr[js.Object] = js.undefined
    
    /**
      * The name of the route
      */
    var name: js.UndefOr[String] = js.undefined
  }
  object Route$SwitchedEventParameters {
    
    inline def apply(): Route$SwitchedEventParameters = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Route$SwitchedEventParameters]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Route$SwitchedEventParameters] (val x: Self) extends AnyVal {
      
      inline def setArguments(value: js.Object): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
      
      inline def setArgumentsUndefined: Self = StObject.set(x, "arguments", js.undefined)
      
      inline def setConfig(value: js.Object): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      inline def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    }
  }
  
  type RouteBeforeMatchedEvent = typings.openui5.sapUiBaseEventMod.default[Route$BeforeMatchedEventParameters]
  
  type RouteBeforeMatchedEventParameters = Route$BeforeMatchedEventParameters
  
  type RouteMatchedEvent = typings.openui5.sapUiBaseEventMod.default[Route$MatchedEventParameters]
  
  type RouteMatchedEventParameters = Route$MatchedEventParameters
  
  type RoutePatternMatchedEvent = typings.openui5.sapUiBaseEventMod.default[Route$PatternMatchedEventParameters]
  
  type RoutePatternMatchedEventParameters = Route$PatternMatchedEventParameters
  
  trait RouteSettings extends StObject {
    
    /**
      * **Deprecated since 1.28, use `target.clearControlAggregation` instead.**
      *  Defines a boolean that can be passed to specify if the aggregation should be cleared before adding the
      * View to it. When using an {@link sap.ui.ux3.Shell} this should be true. For an {@link sap.m.NavContainer }
      * it should be false
      */
    var clearTarget: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Since 1.27. By default only the first route matching the hash, will fire events. If greedy is turned
      * on for a route, its events will be fired even if another route has already matched.
      */
    var greedy: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Name of the route, it will be used to retrieve the route from the router, it needs to be unique per router
      * instance
      */
    var name: String
    
    /**
      * Since 1.32. This property contains the information about the route which nests this route in the form:
      * "[componentName:]routeName". The nesting routes pattern will be prefixed to this routes pattern and hence
      * the nesting route also matches if this one matches.
      */
    var parent: js.UndefOr[String] = js.undefined
    
    /**
      * URL pattern where it needs to match again. A pattern may consist of the following:
      * 	 -  hardcoded parts: "pattern" : "product/settings" - this pattern will only match if the hash of the
      *     browser is product/settings and no arguments will be passed to the events of the route.
      *
      * 	 -  mandatory parameters: "pattern" : "product/{id}" - {id} is a mandatory parameter, e. g. the following
      *     hashes would match: product/5, product/3. The pattenMatched event will get 5 or 3 passed as id in its
      *     arguments.The hash product/ will not match.
      *
      * 	 -  optional parameters: "pattern" : "product/{id}/detail/:detailId:" - :detailId: is an optional parameter,
      *     e. g. the following hashes would match: product/5/detail, product/3/detail/2
      *
      * 	 -  query parameters: "pattern" : "product{?query}" // {?query} allows you to pass queries with any
      *     parameters, e. g. the following hashes would match: product?first=firstValue, product?first=firstValue&second=secondValue
      *    rest as string parameters: "pattern" : ":all*:" - this pattern will define an optional variable
      * that will pass the whole hash as string to the routing events. It may be used to define a catchall route,
      * e. g. the following hashes would match: foo, product/5/3, product/5/detail/3/foo. You can also combine
      * it with the other variables but make sure a variable with a * is the last one.
      */
    var pattern: js.UndefOr[String] = js.undefined
    
    /**
      * **Deprecated since 1.28, use `targets.parent` instead.** one or multiple route configs taking all of
      * these parameters again. If a subroute is hit, it will fire the routeMatched event for all its parents.
      * The routePatternMatched event will only be fired for the subroute not the parents. The routing will also
      * display all the targets of the subroutes and its parents.
      */
    var subroutes: js.UndefOr[js.Object] = js.undefined
    
    /**
      * One or multiple name of targets {@link sap.ui.core.routing.Targets}. As soon as the route matches, the
      * target(s) will be displayed. All the deprecated parameters are ignored, if a target is used.
      */
    var target: js.UndefOr[String | js.Array[String]] = js.undefined
    
    /**
      * **Deprecated since 1.28, use `target.controlAggregation` instead.**
      *  The name of an aggregation of the targetControl, that contains views. Eg: an {@link sap.m.NavContainer }
      * has an aggregation "pages", another Example is the {@link sap.ui.ux3.Shell} it has "content".
      */
    var targetAggregation: js.UndefOr[String] = js.undefined
    
    /**
      * **Deprecated since 1.28, use `target.controlId` instead.**
      *  Views will be put into a container Control, this might be an {@link sap.ui.ux3.Shell} control or an
      * {@link sap.m.NavContainer} if working with mobile, or any other container. The ID of this control has
      * to be put in here
      */
    var targetControl: js.UndefOr[String] = js.undefined
    
    /**
      * **Deprecated since 1.28, use `config.rootView` (only available in the router config) instead.**
      *  The ID of the parent of the targetControl - This should be the ID of the view where your targetControl
      * is located in. By default, this will be the view created by a component, or if the Route is a subroute
      * the view of the parent route is taken. You only need to specify this, if you are not using a router created
      * by a component on your top level routes
      */
    var targetParent: js.UndefOr[String] = js.undefined
    
    /**
      * **Deprecated since 1.28, use `target.viewName` instead.**
      *  The name of a view that will be created, the first time this route will be matched. To place the view
      * into a Control use the targetAggregation and targetControl. Views will only be created once per Router
      */
    var view: js.UndefOr[String] = js.undefined
    
    /**
      * **Deprecated since 1.28, use `target.viewPath` instead.**
      *  A prefix that will be prepended in front of the view eg: view is set to "myView" and viewPath is set
      * to "myApp" - the created view will be "myApp.myView"
      */
    var viewPath: js.UndefOr[String] = js.undefined
    
    /**
      * **Deprecated since 1.28, use `target.viewType` instead.**
      *  The type of the view that is going to be created. eg: "XML", "JS"
      */
    var viewType: js.UndefOr[String] = js.undefined
  }
  object RouteSettings {
    
    inline def apply(name: String): RouteSettings = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[RouteSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RouteSettings] (val x: Self) extends AnyVal {
      
      inline def setClearTarget(value: Boolean): Self = StObject.set(x, "clearTarget", value.asInstanceOf[js.Any])
      
      inline def setClearTargetUndefined: Self = StObject.set(x, "clearTarget", js.undefined)
      
      inline def setGreedy(value: Boolean): Self = StObject.set(x, "greedy", value.asInstanceOf[js.Any])
      
      inline def setGreedyUndefined: Self = StObject.set(x, "greedy", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
      
      inline def setPattern(value: String): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
      
      inline def setPatternUndefined: Self = StObject.set(x, "pattern", js.undefined)
      
      inline def setSubroutes(value: js.Object): Self = StObject.set(x, "subroutes", value.asInstanceOf[js.Any])
      
      inline def setSubroutesUndefined: Self = StObject.set(x, "subroutes", js.undefined)
      
      inline def setTarget(value: String | js.Array[String]): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetAggregation(value: String): Self = StObject.set(x, "targetAggregation", value.asInstanceOf[js.Any])
      
      inline def setTargetAggregationUndefined: Self = StObject.set(x, "targetAggregation", js.undefined)
      
      inline def setTargetControl(value: String): Self = StObject.set(x, "targetControl", value.asInstanceOf[js.Any])
      
      inline def setTargetControlUndefined: Self = StObject.set(x, "targetControl", js.undefined)
      
      inline def setTargetParent(value: String): Self = StObject.set(x, "targetParent", value.asInstanceOf[js.Any])
      
      inline def setTargetParentUndefined: Self = StObject.set(x, "targetParent", js.undefined)
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      inline def setTargetVarargs(value: String*): Self = StObject.set(x, "target", js.Array(value*))
      
      inline def setView(value: String): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
      
      inline def setViewPath(value: String): Self = StObject.set(x, "viewPath", value.asInstanceOf[js.Any])
      
      inline def setViewPathUndefined: Self = StObject.set(x, "viewPath", js.undefined)
      
      inline def setViewType(value: String): Self = StObject.set(x, "viewType", value.asInstanceOf[js.Any])
      
      inline def setViewTypeUndefined: Self = StObject.set(x, "viewType", js.undefined)
      
      inline def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
    }
  }
  
  type RouteSwitchedEvent = typings.openui5.sapUiBaseEventMod.default[Route$SwitchedEventParameters]
  
  type RouteSwitchedEventParameters = Route$SwitchedEventParameters
}
