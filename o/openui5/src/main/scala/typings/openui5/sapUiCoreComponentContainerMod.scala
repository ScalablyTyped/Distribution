package typings.openui5

import typings.openui5.anon.Component
import typings.openui5.anon.`26`
import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreControlMod.ControlSettings
import typings.openui5.sapUiCoreLibraryMod.CSSSize
import typings.openui5.sapUiCoreLibraryMod.ComponentLifecycle
import typings.openui5.sapUiCoreLibraryMod.ID
import typings.openui5.sapUiCoreLibraryMod.IPlaceholderSupport
import typings.openui5.sapUiCoreLibraryMod.URI
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiCoreComponentContainerMod {
  
  @JSImport("sap/ui/core/ComponentContainer", JSImport.Default)
  @js.native
  /**
    * Constructor for a new ComponentContainer.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends ComponentContainer {
    def this(/**
      * initial settings for the new control
      */
    mSettings: ComponentContainerSettings) = this()
    def this(/**
      * id for the new control, generated automatically if no id is given
      */
    sId: String) = this()
    def this(
      /**
      * id for the new control, generated automatically if no id is given
      */
    sId: String,
      /**
      * initial settings for the new control
      */
    mSettings: ComponentContainerSettings
    ) = this()
    def this(
      /**
      * id for the new control, generated automatically if no id is given
      */
    sId: Unit,
      /**
      * initial settings for the new control
      */
    mSettings: ComponentContainerSettings
    ) = this()
    
    /* CompleteClass */
    var __implements__sap_ui_core_IPlaceholderSupport: Boolean = js.native
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/core/ComponentContainer", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.core.ComponentContainer with name `sClassName` and enriches it
      * with the information contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.ui.core.Control.extend}.
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
    oClassInfo: ClassInfo[T, ComponentContainer]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, ComponentContainer],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.core.ComponentContainer.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait ComponentContainer
    extends typings.openui5.sapUiCoreControlMod.default
       with IPlaceholderSupport {
    
    /**
      * @SINCE 1.50
      *
      * Attaches event handler `fnFunction` to the {@link #event:componentCreated componentCreated} event of
      * this `sap.ui.core.ComponentContainer`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.core.ComponentContainer` itself.
      *
      * Fired when the component instance has been created by the ComponentContainer.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachComponentCreated(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachComponentCreated(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.core.ComponentContainer` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * @SINCE 1.50
      *
      * Attaches event handler `fnFunction` to the {@link #event:componentCreated componentCreated} event of
      * this `sap.ui.core.ComponentContainer`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.core.ComponentContainer` itself.
      *
      * Fired when the component instance has been created by the ComponentContainer.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachComponentCreated(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachComponentCreated(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.core.ComponentContainer` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * @SINCE 1.60
      *
      * Attaches event handler `fnFunction` to the {@link #event:componentFailed componentFailed} event of this
      * `sap.ui.core.ComponentContainer`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.core.ComponentContainer` itself.
      *
      * Fired when the creation of the component instance has failed.
      *
      * By default, the `ComponentContainer` also logs the error that occurred. Since 1.83, this default behavior
      * can be prevented by calling `preventDefault()` on the event object.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachComponentFailed(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachComponentFailed(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.core.ComponentContainer` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * @SINCE 1.60
      *
      * Attaches event handler `fnFunction` to the {@link #event:componentFailed componentFailed} event of this
      * `sap.ui.core.ComponentContainer`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.core.ComponentContainer` itself.
      *
      * Fired when the creation of the component instance has failed.
      *
      * By default, the `ComponentContainer` also logs the error that occurred. Since 1.83, this default behavior
      * can be prevented by calling `preventDefault()` on the event object.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachComponentFailed(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachComponentFailed(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.core.ComponentContainer` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * @SINCE 1.50
      *
      * Detaches event handler `fnFunction` from the {@link #event:componentCreated componentCreated} event of
      * this `sap.ui.core.ComponentContainer`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachComponentCreated(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachComponentCreated(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object on which the given function had to be called
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * @SINCE 1.60
      *
      * Detaches event handler `fnFunction` from the {@link #event:componentFailed componentFailed} event of
      * this `sap.ui.core.ComponentContainer`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachComponentFailed(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachComponentFailed(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object on which the given function had to be called
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * @SINCE 1.50
      *
      * Fires event {@link #event:componentCreated componentCreated} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireComponentCreated(): this.type = js.native
    def fireComponentCreated(/**
      * Parameters to pass along with the event
      */
    mParameters: Component): this.type = js.native
    
    /**
      * @SINCE 1.60
      *
      * Fires event {@link #event:componentFailed componentFailed} to attached listeners.
      *
      * Listeners may prevent the default action of this event by calling the `preventDefault` method on the
      * event object. The return value of this method indicates whether the default action should be executed.
      *
      * @returns Whether or not to prevent the default action
      */
    def fireComponentFailed(): Boolean = js.native
    def fireComponentFailed(/**
      * Parameters to pass along with the event
      */
    mParameters: `26`): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getAsync async}.
      *
      * Flag whether the component should be created sync (default) or async. The default will be async when
      * initially the property `manifest` is set to a truthy value and for the property `async` no value has
      * been specified. This property can only be applied initially.
      *
      * Default value is `false`.
      *
      * @returns Value of property `async`
      */
    def getAsync(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getAutoPrefixId autoPrefixId}.
      *
      * Flag, whether to auto-prefix the ID of the nested Component or not. If this property is set to true the
      * ID of the Component will be prefixed with the ID of the ComponentContainer followed by a single dash.
      * This property can only be applied initially.
      *
      * Default value is `false`.
      *
      * @returns Value of property `autoPrefixId`
      */
    def getAutoPrefixId(): Boolean = js.native
    
    /**
      * ID of the element which is the current target of the association {@link #getComponent component}, or
      * `null`.
      */
    def getComponent(): ID = js.native
    
    /**
      * Gets current value of property {@link #getHandleValidation handleValidation}.
      *
      * Enable/disable validation handling by MessageManager for this component. The resulting Messages will
      * be propagated to the controls. This property can only be applied initially.
      *
      * Default value is `false`.
      *
      * @returns Value of property `handleValidation`
      */
    def getHandleValidation(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getHeight height}.
      *
      * Container height in CSS size
      *
      * @returns Value of property `height`
      */
    def getHeight(): CSSSize = js.native
    
    /**
      * Gets current value of property {@link #getLifecycle lifecycle}.
      *
      * Lifecycle behavior for the Component associated by the `ComponentContainer`. The default behavior is
      * `Legacy`. This means that the `ComponentContainer` takes care that the Component is destroyed when the
      * `ComponentContainer` is destroyed, but it is **not** destroyed when a new Component is associated. If
      * you use the `usage` property to create the Component, the default behavior is `Container`. This means
      * that the Component is destroyed when the `ComponentContainer` is destroyed or a new Component is associated.
      * This property must only be applied before a component instance is created.
      *
      * Default value is `Legacy`.
      *
      * @returns Value of property `lifecycle`
      */
    def getLifecycle(): ComponentLifecycle | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ComponentLifecycle * / any */ String) = js.native
    
    /**
      * Gets current value of property {@link #getManifest manifest}.
      *
      * Controls when and from where to load the manifest for the Component. When set to any truthy value, the
      * manifest will be loaded asynchronously by default and evaluated before the Component controller, if it
      * is set to a falsy value other than `undefined`, the manifest will be loaded after the controller. A non-empty
      * string value will be interpreted as the URL location from where to load the manifest. A non-null object
      * value will be interpreted as manifest content. This property can only be applied initially.
      *
      * @returns Value of property `manifest`
      */
    def getManifest(): Any = js.native
    
    /**
      * Gets current value of property {@link #getName name}.
      *
      * Component name, the package where the component is contained. This property can only be applied initially.
      *
      * @returns Value of property `name`
      */
    def getName(): String = js.native
    
    /**
      * Gets current value of property {@link #getPropagateModel propagateModel}.
      *
      * Defines whether binding information is propagated to the component.
      *
      * Default value is `false`.
      *
      * @returns Value of property `propagateModel`
      */
    def getPropagateModel(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getSettings settings}.
      *
      * The settings object passed to the component when created. This property can only be applied initially.
      *
      * @returns Value of property `settings`
      */
    def getSettings(): js.Object = js.native
    
    /**
      * Gets current value of property {@link #getUrl url}.
      *
      * The URL of the component. This property can only be applied initially.
      *
      * @returns Value of property `url`
      */
    def getUrl(): URI = js.native
    
    /**
      * Gets current value of property {@link #getUsage usage}.
      *
      * The name of a component usage as configured in the app descriptor of the component owning this `ComponentContainer`.
      *
      * The configuration from the named usage will be used to create a component instance for this `ComponentContainer`.
      * If there's no owning component or if its app descriptor does not contain a usage with the given name,
      * an error will be logged.
      *
      * See {@link topic:346599f0890d4dfaaa11c6b4ffa96312 Using and Nesting Components} for more information
      * about component usages.
      *
      * This property can only be applied initially.
      *
      * @returns Value of property `usage`
      */
    def getUsage(): String = js.native
    
    /**
      * Gets current value of property {@link #getWidth width}.
      *
      * Container width in CSS size
      *
      * @returns Value of property `width`
      */
    def getWidth(): CSSSize = js.native
    
    /**
      * Sets a new value for property {@link #getAsync async}.
      *
      * Flag whether the component should be created sync (default) or async. The default will be async when
      * initially the property `manifest` is set to a truthy value and for the property `async` no value has
      * been specified. This property can only be applied initially.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setAsync(): this.type = js.native
    def setAsync(/**
      * New value for property `async`
      */
    bAsync: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getAutoPrefixId autoPrefixId}.
      *
      * Flag, whether to auto-prefix the ID of the nested Component or not. If this property is set to true the
      * ID of the Component will be prefixed with the ID of the ComponentContainer followed by a single dash.
      * This property can only be applied initially.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setAutoPrefixId(): this.type = js.native
    def setAutoPrefixId(/**
      * New value for property `autoPrefixId`
      */
    bAutoPrefixId: Boolean): this.type = js.native
    
    /**
      * Sets the component of the container. Depending on the ComponentContainer's lifecycle this might destroy
      * the old associated Component.
      *
      * Once the component is associated with the container the cross connection to the component will be set
      * and the models will be propagated if defined. If the `usage` property is set the ComponentLifecycle is
      * processed like a "Container" lifecycle.
      *
      * @returns the reference to `this` in order to allow method chaining
      */
    def setComponent(
      /**
      * ID of an element which becomes the new target of this component association. Alternatively, an element
      * instance may be given.
      */
    vComponent: String
    ): this.type = js.native
    def setComponent(
      /**
      * ID of an element which becomes the new target of this component association. Alternatively, an element
      * instance may be given.
      */
    vComponent: typings.openui5.sapUiCoreUicomponentMod.default
    ): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getHandleValidation handleValidation}.
      *
      * Enable/disable validation handling by MessageManager for this component. The resulting Messages will
      * be propagated to the controls. This property can only be applied initially.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setHandleValidation(): this.type = js.native
    def setHandleValidation(/**
      * New value for property `handleValidation`
      */
    bHandleValidation: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getHeight height}.
      *
      * Container height in CSS size
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setHeight(): this.type = js.native
    def setHeight(/**
      * New value for property `height`
      */
    sHeight: CSSSize): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getLifecycle lifecycle}.
      *
      * Lifecycle behavior for the Component associated by the `ComponentContainer`. The default behavior is
      * `Legacy`. This means that the `ComponentContainer` takes care that the Component is destroyed when the
      * `ComponentContainer` is destroyed, but it is **not** destroyed when a new Component is associated. If
      * you use the `usage` property to create the Component, the default behavior is `Container`. This means
      * that the Component is destroyed when the `ComponentContainer` is destroyed or a new Component is associated.
      * This property must only be applied before a component instance is created.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `Legacy`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setLifecycle(): this.type = js.native
    def setLifecycle(
      /**
      * New value for property `lifecycle`
      */
    sLifecycle: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ComponentLifecycle * / any */ String
    ): this.type = js.native
    def setLifecycle(/**
      * New value for property `lifecycle`
      */
    sLifecycle: ComponentLifecycle): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getManifest manifest}.
      *
      * Controls when and from where to load the manifest for the Component. When set to any truthy value, the
      * manifest will be loaded asynchronously by default and evaluated before the Component controller, if it
      * is set to a falsy value other than `undefined`, the manifest will be loaded after the controller. A non-empty
      * string value will be interpreted as the URL location from where to load the manifest. A non-null object
      * value will be interpreted as manifest content. This property can only be applied initially.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setManifest(): this.type = js.native
    def setManifest(/**
      * New value for property `manifest`
      */
    oManifest: Any): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getName name}.
      *
      * Component name, the package where the component is contained. This property can only be applied initially.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setName(): this.type = js.native
    def setName(/**
      * New value for property `name`
      */
    sName: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getPropagateModel propagateModel}.
      *
      * Defines whether binding information is propagated to the component.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setPropagateModel(): this.type = js.native
    def setPropagateModel(/**
      * New value for property `propagateModel`
      */
    bPropagateModel: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getSettings settings}.
      *
      * The settings object passed to the component when created. This property can only be applied initially.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setSettings(): this.type = js.native
    def setSettings(/**
      * New value for property `settings`
      */
    oSettings: js.Object): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getUrl url}.
      *
      * The URL of the component. This property can only be applied initially.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setUrl(): this.type = js.native
    def setUrl(/**
      * New value for property `url`
      */
    sUrl: URI): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getUsage usage}.
      *
      * The name of a component usage as configured in the app descriptor of the component owning this `ComponentContainer`.
      *
      * The configuration from the named usage will be used to create a component instance for this `ComponentContainer`.
      * If there's no owning component or if its app descriptor does not contain a usage with the given name,
      * an error will be logged.
      *
      * See {@link topic:346599f0890d4dfaaa11c6b4ffa96312 Using and Nesting Components} for more information
      * about component usages.
      *
      * This property can only be applied initially.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setUsage(): this.type = js.native
    def setUsage(/**
      * New value for property `usage`
      */
    sUsage: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getWidth width}.
      *
      * Container width in CSS size
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setWidth(): this.type = js.native
    def setWidth(/**
      * New value for property `width`
      */
    sWidth: CSSSize): this.type = js.native
  }
  
  trait ComponentContainerSettings
    extends StObject
       with ControlSettings {
    
    /**
      * Flag whether the component should be created sync (default) or async. The default will be async when
      * initially the property `manifest` is set to a truthy value and for the property `async` no value has
      * been specified. This property can only be applied initially.
      */
    var async: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Flag, whether to auto-prefix the ID of the nested Component or not. If this property is set to true the
      * ID of the Component will be prefixed with the ID of the ComponentContainer followed by a single dash.
      * This property can only be applied initially.
      */
    var autoPrefixId: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * The component displayed in this ComponentContainer.
      */
    var component: js.UndefOr[typings.openui5.sapUiCoreUicomponentMod.default | String] = js.undefined
    
    /**
      * @SINCE 1.50
      *
      * Fired when the component instance has been created by the ComponentContainer.
      */
    var componentCreated: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * @SINCE 1.60
      *
      * Fired when the creation of the component instance has failed.
      *
      * By default, the `ComponentContainer` also logs the error that occurred. Since 1.83, this default behavior
      * can be prevented by calling `preventDefault()` on the event object.
      */
    var componentFailed: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * Enable/disable validation handling by MessageManager for this component. The resulting Messages will
      * be propagated to the controls. This property can only be applied initially.
      */
    var handleValidation: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Container height in CSS size
      */
    var height: js.UndefOr[
        CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Lifecycle behavior for the Component associated by the `ComponentContainer`. The default behavior is
      * `Legacy`. This means that the `ComponentContainer` takes care that the Component is destroyed when the
      * `ComponentContainer` is destroyed, but it is **not** destroyed when a new Component is associated. If
      * you use the `usage` property to create the Component, the default behavior is `Container`. This means
      * that the Component is destroyed when the `ComponentContainer` is destroyed or a new Component is associated.
      * This property must only be applied before a component instance is created.
      */
    var lifecycle: js.UndefOr[
        ComponentLifecycle | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ComponentLifecycle * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * Controls when and from where to load the manifest for the Component. When set to any truthy value, the
      * manifest will be loaded asynchronously by default and evaluated before the Component controller, if it
      * is set to a falsy value other than `undefined`, the manifest will be loaded after the controller. A non-empty
      * string value will be interpreted as the URL location from where to load the manifest. A non-null object
      * value will be interpreted as manifest content. This property can only be applied initially.
      */
    var manifest: js.UndefOr[Any | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * Component name, the package where the component is contained. This property can only be applied initially.
      */
    var name: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Defines whether binding information is propagated to the component.
      */
    var propagateModel: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * The settings object passed to the component when created. This property can only be applied initially.
      */
    var settings: js.UndefOr[
        js.Object | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * The URL of the component. This property can only be applied initially.
      */
    var url: js.UndefOr[URI | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * The name of a component usage as configured in the app descriptor of the component owning this `ComponentContainer`.
      *
      * The configuration from the named usage will be used to create a component instance for this `ComponentContainer`.
      * If there's no owning component or if its app descriptor does not contain a usage with the given name,
      * an error will be logged.
      *
      * See {@link topic:346599f0890d4dfaaa11c6b4ffa96312 Using and Nesting Components} for more information
      * about component usages.
      *
      * This property can only be applied initially.
      */
    var usage: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Container width in CSS size
      */
    var width: js.UndefOr[
        CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
  }
  object ComponentContainerSettings {
    
    inline def apply(): ComponentContainerSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ComponentContainerSettings]
    }
    
    extension [Self <: ComponentContainerSettings](x: Self) {
      
      inline def setAsync(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
      
      inline def setAsyncUndefined: Self = StObject.set(x, "async", js.undefined)
      
      inline def setAutoPrefixId(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "autoPrefixId", value.asInstanceOf[js.Any])
      
      inline def setAutoPrefixIdUndefined: Self = StObject.set(x, "autoPrefixId", js.undefined)
      
      inline def setComponent(value: typings.openui5.sapUiCoreUicomponentMod.default | String): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      inline def setComponentCreated(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "componentCreated", js.Any.fromFunction1(value))
      
      inline def setComponentCreatedUndefined: Self = StObject.set(x, "componentCreated", js.undefined)
      
      inline def setComponentFailed(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "componentFailed", js.Any.fromFunction1(value))
      
      inline def setComponentFailedUndefined: Self = StObject.set(x, "componentFailed", js.undefined)
      
      inline def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
      
      inline def setHandleValidation(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "handleValidation", value.asInstanceOf[js.Any])
      
      inline def setHandleValidationUndefined: Self = StObject.set(x, "handleValidation", js.undefined)
      
      inline def setHeight(value: CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setLifecycle(
        value: ComponentLifecycle | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ComponentLifecycle * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "lifecycle", value.asInstanceOf[js.Any])
      
      inline def setLifecycleUndefined: Self = StObject.set(x, "lifecycle", js.undefined)
      
      inline def setManifest(value: Any | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "manifest", value.asInstanceOf[js.Any])
      
      inline def setManifestUndefined: Self = StObject.set(x, "manifest", js.undefined)
      
      inline def setName(value: String | PropertyBindingInfo): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setPropagateModel(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "propagateModel", value.asInstanceOf[js.Any])
      
      inline def setPropagateModelUndefined: Self = StObject.set(x, "propagateModel", js.undefined)
      
      inline def setSettings(value: js.Object | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
      
      inline def setSettingsUndefined: Self = StObject.set(x, "settings", js.undefined)
      
      inline def setUrl(value: URI | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
      
      inline def setUsage(value: String | PropertyBindingInfo): Self = StObject.set(x, "usage", value.asInstanceOf[js.Any])
      
      inline def setUsageUndefined: Self = StObject.set(x, "usage", js.undefined)
      
      inline def setWidth(value: CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
