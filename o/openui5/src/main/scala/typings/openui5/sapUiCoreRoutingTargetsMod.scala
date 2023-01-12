package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiCoreRoutingTargetsMod {
  
  @JSImport("sap/ui/core/routing/Targets", JSImport.Default)
  @js.native
  open class default protected () extends Targets {
    /**
      * Constructor for a new Targets class.
      */
    def this(oOptions: typings.openui5.anon.Targets) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/core/routing/Targets", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.core.routing.Targets with name `sClassName` and enriches it with
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
    oClassInfo: ClassInfo[T, Targets]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, Targets],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.core.routing.Targets.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiBaseMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiBaseMetadataMod.default]
  }
  
  trait TargetInfo extends StObject {
    
    /**
      * Since 1.90. Whether the router of the "Component" target ignores the browser hash when it's re-initialized.
      * This parameter only has effect when the target is of type "Component" and its router is currently stopped.
      * It has no effect on the first call of {link sap.ui.core.routing.Router#initialize}, because this is done
      * by the application and not by the UI5 routing.
      */
    var ignoreInitialHash: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Defines the name of the target that is going to be displayed
      */
    var name: String
    
    /**
      * A prefix that is used for reserving a dedicated section in the browser hash for the router of this target.
      * This needs to be set only for target that has type "Component"
      */
    var prefix: js.UndefOr[String] = js.undefined
    
    /**
      * Whether the titleChanged event from this target should be propagated to the parent or not
      */
    var propagateTitle: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether the target is relevant to the current matched route or not. If 'true', then the dynamic target
      * is linked to the route's life cycle. When switching to a different route, then the dynamic target will
      * be suspended.
      */
    var routeRelevant: js.UndefOr[Boolean] = js.undefined
  }
  object TargetInfo {
    
    inline def apply(name: String): TargetInfo = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[TargetInfo]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TargetInfo] (val x: Self) extends AnyVal {
      
      inline def setIgnoreInitialHash(value: Boolean): Self = StObject.set(x, "ignoreInitialHash", value.asInstanceOf[js.Any])
      
      inline def setIgnoreInitialHashUndefined: Self = StObject.set(x, "ignoreInitialHash", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
      
      inline def setPropagateTitle(value: Boolean): Self = StObject.set(x, "propagateTitle", value.asInstanceOf[js.Any])
      
      inline def setPropagateTitleUndefined: Self = StObject.set(x, "propagateTitle", js.undefined)
      
      inline def setRouteRelevant(value: Boolean): Self = StObject.set(x, "routeRelevant", value.asInstanceOf[js.Any])
      
      inline def setRouteRelevantUndefined: Self = StObject.set(x, "routeRelevant", js.undefined)
    }
  }
  
  @js.native
  trait Targets
    extends typings.openui5.sapUiBaseEventProviderMod.default {
    
    /**
      * Creates a target by using the given name and options.
      *
      * If there's already a target with the same name, the existing target is not overwritten and an error log
      * will be written to the console.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addTarget(
      /**
      * Name of a target
      */
    sName: String,
      /**
      * Options of a target. The option names are the same as the ones in "oOptions.targets.anyName" of {@link
      * #constructor}.
      */
    oTargetOptions: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:display display} event of this `sap.ui.core.routing.Targets`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.core.routing.Targets` itself.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachDisplay(/**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function): this.type = js.native
    def attachDisplay(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function,
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.core.routing.Targets` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:display display} event of this `sap.ui.core.routing.Targets`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.core.routing.Targets` itself.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachDisplay(
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
    def attachDisplay(
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
      * Context object to call the event handler with. Defaults to this `sap.ui.core.routing.Targets` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:titleChanged titleChanged} event of this `sap.ui.core.routing.Targets`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.core.routing.Targets` itself.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachTitleChanged(/**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function): this.type = js.native
    def attachTitleChanged(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function,
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.core.routing.Targets` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:titleChanged titleChanged} event of this `sap.ui.core.routing.Targets`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.core.routing.Targets` itself.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachTitleChanged(
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
    def attachTitleChanged(
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
      * Context object to call the event handler with. Defaults to this `sap.ui.core.routing.Targets` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:display display} event of this `sap.ui.core.routing.Targets`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachDisplay(/**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function): this.type = js.native
    def detachDisplay(
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
      * Detaches event handler `fnFunction` from the {@link #event:titleChanged titleChanged} event of this `sap.ui.core.routing.Targets`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachTitleChanged(/**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function): this.type = js.native
    def detachTitleChanged(
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
      * Creates a view and puts it in an aggregation of the specified control.
      *
      * @returns this pointer for chaining or a Promise
      */
    def display(
      /**
      * Either the target name or a target info object. To display multiple targets you may also pass an array
      * of target names or target info objects.
      */
    vTargets: String
    ): Targets | js.Promise[Any] = js.native
    def display(
      /**
      * Either the target name or a target info object. To display multiple targets you may also pass an array
      * of target names or target info objects.
      */
    vTargets: String,
      /**
      * an object that will be passed to the display event in the data property. If the target has parents, the
      * data will also be passed to them.
      */
    oData: js.Object
    ): Targets | js.Promise[Any] = js.native
    def display(
      /**
      * Either the target name or a target info object. To display multiple targets you may also pass an array
      * of target names or target info objects.
      */
    vTargets: String,
      /**
      * an object that will be passed to the display event in the data property. If the target has parents, the
      * data will also be passed to them.
      */
    oData: js.Object,
      /**
      * the name of the target from which the title option is taken for firing the {@link sap.ui.core.routing.Targets#event:titleChanged
      * titleChanged} event
      */
    sTitleTarget: String
    ): Targets | js.Promise[Any] = js.native
    def display(
      /**
      * Either the target name or a target info object. To display multiple targets you may also pass an array
      * of target names or target info objects.
      */
    vTargets: String,
      /**
      * an object that will be passed to the display event in the data property. If the target has parents, the
      * data will also be passed to them.
      */
    oData: Unit,
      /**
      * the name of the target from which the title option is taken for firing the {@link sap.ui.core.routing.Targets#event:titleChanged
      * titleChanged} event
      */
    sTitleTarget: String
    ): Targets | js.Promise[Any] = js.native
    def display(
      /**
      * Either the target name or a target info object. To display multiple targets you may also pass an array
      * of target names or target info objects.
      */
    vTargets: js.Array[String | TargetInfo]
    ): Targets | js.Promise[Any] = js.native
    def display(
      /**
      * Either the target name or a target info object. To display multiple targets you may also pass an array
      * of target names or target info objects.
      */
    vTargets: js.Array[String | TargetInfo],
      /**
      * an object that will be passed to the display event in the data property. If the target has parents, the
      * data will also be passed to them.
      */
    oData: js.Object
    ): Targets | js.Promise[Any] = js.native
    def display(
      /**
      * Either the target name or a target info object. To display multiple targets you may also pass an array
      * of target names or target info objects.
      */
    vTargets: js.Array[String | TargetInfo],
      /**
      * an object that will be passed to the display event in the data property. If the target has parents, the
      * data will also be passed to them.
      */
    oData: js.Object,
      /**
      * the name of the target from which the title option is taken for firing the {@link sap.ui.core.routing.Targets#event:titleChanged
      * titleChanged} event
      */
    sTitleTarget: String
    ): Targets | js.Promise[Any] = js.native
    def display(
      /**
      * Either the target name or a target info object. To display multiple targets you may also pass an array
      * of target names or target info objects.
      */
    vTargets: js.Array[String | TargetInfo],
      /**
      * an object that will be passed to the display event in the data property. If the target has parents, the
      * data will also be passed to them.
      */
    oData: Unit,
      /**
      * the name of the target from which the title option is taken for firing the {@link sap.ui.core.routing.Targets#event:titleChanged
      * titleChanged} event
      */
    sTitleTarget: String
    ): Targets | js.Promise[Any] = js.native
    def display(
      /**
      * Either the target name or a target info object. To display multiple targets you may also pass an array
      * of target names or target info objects.
      */
    vTargets: TargetInfo
    ): Targets | js.Promise[Any] = js.native
    def display(
      /**
      * Either the target name or a target info object. To display multiple targets you may also pass an array
      * of target names or target info objects.
      */
    vTargets: TargetInfo,
      /**
      * an object that will be passed to the display event in the data property. If the target has parents, the
      * data will also be passed to them.
      */
    oData: js.Object
    ): Targets | js.Promise[Any] = js.native
    def display(
      /**
      * Either the target name or a target info object. To display multiple targets you may also pass an array
      * of target names or target info objects.
      */
    vTargets: TargetInfo,
      /**
      * an object that will be passed to the display event in the data property. If the target has parents, the
      * data will also be passed to them.
      */
    oData: js.Object,
      /**
      * the name of the target from which the title option is taken for firing the {@link sap.ui.core.routing.Targets#event:titleChanged
      * titleChanged} event
      */
    sTitleTarget: String
    ): Targets | js.Promise[Any] = js.native
    def display(
      /**
      * Either the target name or a target info object. To display multiple targets you may also pass an array
      * of target names or target info objects.
      */
    vTargets: TargetInfo,
      /**
      * an object that will be passed to the display event in the data property. If the target has parents, the
      * data will also be passed to them.
      */
    oData: Unit,
      /**
      * the name of the target from which the title option is taken for firing the {@link sap.ui.core.routing.Targets#event:titleChanged
      * titleChanged} event
      */
    sTitleTarget: String
    ): Targets | js.Promise[Any] = js.native
    
    /**
      * Fires event {@link #event:created created} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireDisplay(): this.type = js.native
    def fireDisplay(/**
      * Parameters to pass along with the event
      */
    oParameters: js.Object): this.type = js.native
    
    /**
      * Returns a target by its name (if you pass myTarget: { view: "myView" }) in the config myTarget is the
      * name.
      *
      * @returns The target with the coresponding name or undefined. If an array was passed as name, this will
      * return an array with all found targets. Non existing targets will not be returned and an error is logged
      * when `bSuppressNotFoundError` param isn't set to `true`.
      */
    def getTarget(/**
      * the name of a single target or the name of multiple targets
      */
    vName: String): js.UndefOr[
        typings.openui5.sapUiCoreRoutingTargetMod.default | js.Array[typings.openui5.sapUiCoreRoutingTargetMod.default]
      ] = js.native
    def getTarget(
      /**
      * the name of a single target or the name of multiple targets
      */
    vName: String,
      /**
      * In case no target is found for the given name, the not found error is supressed when this is set with
      * true
      */
    bSuppressNotFoundError: Boolean
    ): js.UndefOr[
        typings.openui5.sapUiCoreRoutingTargetMod.default | js.Array[typings.openui5.sapUiCoreRoutingTargetMod.default]
      ] = js.native
    def getTarget(/**
      * the name of a single target or the name of multiple targets
      */
    vName: js.Array[String]): js.UndefOr[
        typings.openui5.sapUiCoreRoutingTargetMod.default | js.Array[typings.openui5.sapUiCoreRoutingTargetMod.default]
      ] = js.native
    def getTarget(
      /**
      * the name of a single target or the name of multiple targets
      */
    vName: js.Array[String],
      /**
      * In case no target is found for the given name, the not found error is supressed when this is set with
      * true
      */
    bSuppressNotFoundError: Boolean
    ): js.UndefOr[
        typings.openui5.sapUiCoreRoutingTargetMod.default | js.Array[typings.openui5.sapUiCoreRoutingTargetMod.default]
      ] = js.native
    
    /**
      * Returns the views instance passed to the constructor
      *
      * @returns the views instance
      */
    def getViews(): typings.openui5.sapUiCoreRoutingViewsMod.default = js.native
  }
}
