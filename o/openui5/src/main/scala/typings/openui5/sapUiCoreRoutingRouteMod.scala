package typings.openui5

import typings.openui5.anon.ClearTarget
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
    oConfig: ClearTarget
    ) = this()
    def this(
      /**
      * Router instance to which the route will be added
      */
    oRouter: typings.openui5.sapUiCoreRoutingRouterMod.default,
      /**
      * Configuration object for the route
      */
    oConfig: ClearTarget,
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
      * @SINCE 1.46.1
      *
      * Attaches event handler `fnFunction` to the {@link #event:beforeMatched beforeMatched} event of this `sap.ui.core.routing.Route`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.core.routing.Route` itself.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachBeforeMatched(/**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function): this.type = js.native
    def attachBeforeMatched(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function,
      /**
      * Context object to call the event handler with. Defaults to this `Route` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * @SINCE 1.46.1
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
    fnFunction: js.Function
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
    fnFunction: js.Function,
      /**
      * Context object to call the event handler with. Defaults to this `Route` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * @SINCE 1.25.1
      *
      * Attaches event handler `fnFunction` to the {@link #event:matched matched} event of this `sap.ui.core.routing.Route`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.core.routing.Route` itself.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachMatched(/**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function): this.type = js.native
    def attachMatched(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function,
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.core.routing.Route` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * @SINCE 1.25.1
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
    fnFunction: js.Function
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
    fnFunction: js.Function,
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.core.routing.Route` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * @SINCE 1.25.1
      *
      * Attaches event handler `fnFunction` to the {@link #event:patternMatched patternMatched} event of this
      * `sap.ui.core.routing.Route`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.core.routing.Route` itself.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachPatternMatched(/**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function): this.type = js.native
    def attachPatternMatched(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function,
      /**
      * Context object to call the event handler with. Defaults to this `Route` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * @SINCE 1.25.1
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
    fnFunction: js.Function
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
    fnFunction: js.Function,
      /**
      * Context object to call the event handler with. Defaults to this `Route` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * @SINCE 1.46.1
      *
      * Detaches event handler `fnFunction` from the {@link #event:beforeMatched beforeMatched} event of this
      * `sap.ui.core.routing.Route`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachBeforeMatched(/**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function): this.type = js.native
    def detachBeforeMatched(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function,
      /**
      * Context object on which the given function had to be called
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * @SINCE 1.25.1
      *
      * Detaches event handler `fnFunction` from the {@link #event:matched matched} event of this `sap.ui.core.routing.Route`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachMatched(/**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function): this.type = js.native
    def detachMatched(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function,
      /**
      * Context object on which the given function had to be called
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * @SINCE 1.25.1
      *
      * Detaches event handler `fnFunction` from the {@link #event:patternMatched patternMatched} event of this
      * `sap.ui.core.routing.Route`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachPatternMatched(/**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function): this.type = js.native
    def detachPatternMatched(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function,
      /**
      * Context object on which the given function had to be called
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * @SINCE 1.46.1
      *
      * Fires event {@link #event:beforeMatched beforeMatched} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireBeforeMatched(): typings.openui5.sapUiCoreRoutingRouterMod.default = js.native
    def fireBeforeMatched(/**
      * Parameters to pass along with the event
      */
    oParameters: js.Object): typings.openui5.sapUiCoreRoutingRouterMod.default = js.native
    
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
      * @SINCE 1.58.0
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
}
