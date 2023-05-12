package typings.openui5

import typings.openui5.anon.AltManifestUrl
import typings.openui5.anon.AsyncHints
import typings.openui5.anon.ComponentData
import typings.openui5.openui5Strings.json
import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.ManagedObjectSettings
import typings.openui5.sapUiCoreLibraryMod.ID
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiCoreComponentMod {
  
  @JSImport("sap/ui/core/Component", JSImport.Default)
  @js.native
  /**
    * Creates and initializes a new Component with the given `sId` and settings.
    *
    * The set of allowed entries in the `mSettings` object depends on the concrete subclass and is described
    * there. See {@link sap.ui.core.Component} for a general description of this argument.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    *
    * This class does not have its own settings, but all settings applicable to the base type {@link sap.ui.base.ManagedObject#constructor
    * sap.ui.base.ManagedObject} can be used.
    */
  open class default () extends Component {
    def this(/**
      * Optional object with initial settings for the new Component instance
      */
    mSettings: ComponentSettings) = this()
    def this(/**
      * Optional ID for the new control; generated automatically if no non-empty ID is given. Note: this can
      * be omitted, no matter whether `mSettings` are given or not!
      */
    sId: String) = this()
    def this(
      /**
      * Optional ID for the new control; generated automatically if no non-empty ID is given. Note: this can
      * be omitted, no matter whether `mSettings` are given or not!
      */
    sId: String,
      /**
      * Optional object with initial settings for the new Component instance
      */
    mSettings: ComponentSettings
    ) = this()
    def this(
      /**
      * Optional ID for the new control; generated automatically if no non-empty ID is given. Note: this can
      * be omitted, no matter whether `mSettings` are given or not!
      */
    sId: Unit,
      /**
      * Optional object with initial settings for the new Component instance
      */
    mSettings: ComponentSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/core/Component", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * @SINCE 1.56.0
      *
      * Asynchronously creates a new component instance from the given configuration.
      *
      * If the component class does not already exists, the component class is loaded and afterwards the new
      * component instance is created.
      *
      * To optimize the loading process, additional `asyncHints` can be provided. The structure of these hints
      * and how they impact the loading of components is an internal feature of this API and reserved for UI5
      * internal use only. Code that wants to be safe wrt. version updates, should not use the `asyncHints` property.
      *
      * If Components and/or libraries are listed in the `asyncHints`, all the corresponding preload files will
      * be requested in parallel, loading errors (404s) will be ignored. The constructor class will only be required
      * after all preloads have been rejected or resolved. Only then, the new instance will be created.
      *
      * A component can implement the {@link sap.ui.core.IAsyncContentCreation} interface. Please see the respective
      * documentation for more information.
      *
      * @returns A Promise that resolves with the newly created component instance
      */
    inline def create(/**
      * Configuration options
      */
    mOptions: AltManifestUrl): js.Promise[Component] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(mOptions.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Component]]
    
    /**
      * Creates a new subclass of class `sap.ui.core.Component` with name `sClassName` and enriches it with the
      * information contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.ui.base.ManagedObject.extend},
      * plus the `manifest` property in the 'metadata' object literal, indicating that the component configuration
      * should be read from a manifest.json file.
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
    oClassInfo: ClassInfo[T, Component]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Qualified name of the newly created class
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, Component],
      /**
      * Constructor function for the metadata object. If not given, it defaults to an internal subclass of `sap.ui.core.ComponentMetadata`.
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * @SINCE 1.56.0
      *
      * Returns an existing component instance, identified by its ID.
      *
      * @returns Component instance or `undefined` when no component with the given ID exists.
      */
    inline def get(/**
      * ID of the component.
      */
    sId: String): js.UndefOr[Component] = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(sId.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Component]]
    
    /**
      * Returns the metadata for the Component class.
      *
      * @returns Metadata for the Component class.
      */
    inline def getMetadata(): typings.openui5.sapUiCoreComponentMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreComponentMetadataMod.default]
    
    /**
      * @SINCE 1.25.1
      *
      * Returns the Component instance in whose "context" the given ManagedObject has been created or `undefined`.
      *
      * This is a convenience wrapper around {@link sap.ui.core.Component.getOwnerIdFor Component.getOwnerIdFor}.
      * If the owner ID cannot be determined for reasons documented on `getOwnerForId` or when the Component
      * for the determined ID no longer exists, `undefined` will be returned.
      *
      * @returns the owner Component or `undefined`.
      */
    inline def getOwnerComponentFor(
      /**
      * Object to retrieve the owner Component for
      */
    oObject: typings.openui5.sapUiBaseManagedObjectMod.default
    ): js.UndefOr[Component] = ^.asInstanceOf[js.Dynamic].applyDynamic("getOwnerComponentFor")(oObject.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Component]]
    
    /**
      * @SINCE 1.15.1
      *
      * Returns the ID of the object in whose "context" the given ManagedObject has been created.
      *
      * For objects that are not ManagedObjects or for which the owner is unknown, `undefined` will be returned
      * as owner ID.
      *
      * **Note**: Ownership for objects is only checked by the framework at the time when they are created. It
      * is not checked or updated afterwards. And it can only be detected while the {@link sap.ui.core.Component#runAsOwner
      * Component.runAsOwner} function is executing. Without further action, this is only the case while the
      * content of a UIComponent is {@link sap.ui.core.UIComponent#createContent constructed} or when a {@link
      * sap.ui.core.routing.Router Router} creates a new View and its content.
      *
      * **Note**: This method does not guarantee that the returned owner ID belongs to a Component. Currently,
      * it always does. But future versions of UI5 might introduce a more fine grained ownership concept, e.g.
      * taking Views into account. Callers that want to deal only with components as owners, should use the following
      * method: {@link sap.ui.core.Component.getOwnerComponentFor Component.getOwnerComponentFor}. It guarantees
      * that the returned object (if any) will be a Component.
      *
      * **Further note** that only the ID of the owner is recorded. In rare cases, when the lifecycle of a ManagedObject
      * is not bound to the lifecycle of its owner, (e.g. by the means of aggregations), then the owner might
      * have been destroyed already whereas the ManagedObject is still alive. So even the existence of an owner
      * ID is not a guarantee for the existence of the corresponding owner.
      *
      * @returns ID of the owner or `undefined`
      */
    inline def getOwnerIdFor(
      /**
      * Object to retrieve the owner ID for
      */
    oObject: typings.openui5.sapUiBaseManagedObjectMod.default
    ): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getOwnerIdFor")(oObject.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]
    
    /**
      * @SINCE 1.56.0
      *
      * Asynchronously loads a component class without instantiating it; returns a promise on the loaded class.
      *
      * Beware: "Asynchronous component loading" doesn't necessarily mean that no more synchronous loading occurs.
      * Both the framework as well as component implementations might still execute synchronous requests. `Component.load`
      * just allows to use async calls internally.
      *
      * When a manifest is referenced in `mOptions`, this manifest is not automatically used for instances of
      * the Component class that are created after loading. The manifest or the manifest url must be provided
      * for every instance explicitly.
      *
      * To optimize the loading process, additional `asyncHints` can be provided. If components and/or libraries
      * are listed in the `asyncHints`, all the corresponding preload files will be requested in parallel, loading
      * errors (404s) will be ignored. The constructor class will only be required after all preloads have been
      * rejected or resolved. The structure of the hints and how they impact the loading of components is an
      * internal feature of this API and reserved for UI5 internal use only. Code that wants to be safe wrt.
      * version updates, should not use the `asyncHints` property.
      *
      * @returns A Promise that resolves with the loaded component class or `undefined` in case `mOptions.asyncHints.preloadOnly`
      * is set to `true`
      */
    inline def load(/**
      * Configuration options
      */
    mOptions: AsyncHints): js.Promise[js.Function] = ^.asInstanceOf[js.Dynamic].applyDynamic("load")(mOptions.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Function]]
  }
  
  @js.native
  trait registry extends StObject {
    
    /**
      * Return an object with all instances of `sap.ui.core.Component`, keyed by their ID.
      *
      * Each call creates a new snapshot object. Depending on the size of the UI, this operation therefore might
      * be expensive. Consider to use the `forEach` or `filter` method instead of executing similar operations
      * on the returned object.
      *
      * **Note**: The returned object is created by a call to `Object.create(null)`, and therefore lacks all
      * methods of `Object.prototype`, e.g. `toString` etc.
      *
      * @returns Object with all components, keyed by their ID
      */
    def all(): Record[ID, Component] = js.native
    
    /**
      * Returns an array with components for which the given `callback` returns a value that coerces to `true`.
      *
      * The expected signature of the callback is
      * ```javascript
      *
      *    function callback(oComponent, sID)
      * ```
      *  where `oComponent` is the currently visited component instance and `sID` is the ID of that instance.
      *
      * If components are created or destroyed within the `callback`, then the behavior is not specified. Newly
      * added objects might or might not be visited. When a component is destroyed during the filtering and was
      * not visited yet, it might or might not be visited. As the behavior for such concurrent modifications
      * is not specified, it may change in newer releases.
      *
      * If a `thisArg` is given, it will be provided as `this` context when calling `callback`. The `this` value
      * that the implementation of `callback` sees, depends on the usual resolution mechanism. E.g. when `callback`
      * was bound to some context object, that object wins over the given `thisArg`.
      *
      * This function returns an array with all components matching the given predicate. The order of the components
      * in the array is not specified and might change between calls (over time and across different versions
      * of UI5).
      *
      * @returns Array of components matching the predicate; order is undefined and might change in newer versions
      * of UI5
      */
    def filter(
      /**
      * predicate against which each Component is tested
      */
    callback: js.Function2[/* p1 */ Component, /* p2 */ ID, Boolean]
    ): js.Array[Component] = js.native
    def filter(
      /**
      * predicate against which each Component is tested
      */
    callback: js.Function2[/* p1 */ Component, /* p2 */ ID, Boolean],
      /**
      * context object to provide as `this` in each call of `callback`
      */
    thisArg: js.Object
    ): js.Array[Component] = js.native
    
    /**
      * Calls the given `callback` for each existing component.
      *
      * The expected signature of the callback is
      * ```javascript
      *
      *    function callback(oComponent, sID)
      * ```
      *  where `oComponent` is the currently visited component instance and `sID` is the ID of that instance.
      *
      * The order in which the callback is called for components is not specified and might change between calls
      * (over time and across different versions of UI5).
      *
      * If components are created or destroyed within the `callback`, then the behavior is not specified. Newly
      * added objects might or might not be visited. When a component is destroyed during the filtering and was
      * not visited yet, it might or might not be visited. As the behavior for such concurrent modifications
      * is not specified, it may change in newer releases.
      *
      * If a `thisArg` is given, it will be provided as `this` context when calling `callback`. The `this` value
      * that the implementation of `callback` sees, depends on the usual resolution mechanism. E.g. when `callback`
      * was bound to some context object, that object wins over the given `thisArg`.
      */
    def forEach(
      /**
      * Function to call for each Component
      */
    callback: js.Function2[/* p1 */ Component, /* p2 */ ID, Unit]
    ): Unit = js.native
    def forEach(
      /**
      * Function to call for each Component
      */
    callback: js.Function2[/* p1 */ Component, /* p2 */ ID, Unit],
      /**
      * Context object to provide as `this` in each call of `callback`
      */
    thisArg: js.Object
    ): Unit = js.native
    
    /**
      * Retrieves a Component by its ID.
      *
      * When the ID is `null` or `undefined` or when there's no Component with the given ID, then `undefined`
      * is returned.
      *
      * @returns Component with the given ID or `undefined`
      */
    def get(/**
      * ID of the Component to retrieve
      */
    id: ID): js.UndefOr[Component] = js.native
    
    /**
      * Number of existing components.
      */
    var size: int = js.native
  }
  @JSImport("sap/ui/core/Component", "registry")
  @js.native
  val registry: typings.openui5.sapUiCoreComponentMod.registry = js.native
  
  @js.native
  trait Component
    extends typings.openui5.sapUiBaseManagedObjectMod.default {
    
    /**
      * @SINCE 1.47.0
      *
      * Creates a nested component that is declared in the `sap.ui5/componentUsages` section of the descriptor
      * (manifest.json). The following snippet shows the declaration:
      * ```javascript
      *
      * {
      *   [...]
      *   "sap.ui5": {
      *     "componentUsages": {
      *       "myUsage": {
      *         "name": "my.useful.Component"
      *       }
      *     }
      *   }
      *   [...]
      * }
      * ```
      *  The syntax of the configuration object of the component usage matches the configuration object of the
      * {#link sap.ui.component} factory function.
      *
      * This is an example of how the `createComponent` function can be used for asynchronous scenarios:
      * ```javascript
      *
      * oComponent.createComponent("myUsage").then(function(oComponent) {
      *   oComponent.doSomething();
      * }).catch(function(oError) {
      *   Log.error(oError);
      * });
      * ```
      *
      *
      * The following example shows how `createComponent` can be used to create a nested component by providing
      * specific properties like `id`, `async`, `settings`, or `componentData`:
      * ```javascript
      *
      * var oComponent = oComponent.createComponent({
      *   usage: "myUsage",
      *   id: "myId",
      *   settings: { ... },
      *   componentData: { ... }
      * });
      * ```
      *  The allowed list of properties are defined in the parameter documentation of this function.
      *
      * The properties can also be defined in the descriptor. These properties can be overwritten by the local
      * properties of that function.
      *
      * @returns Component instance or Promise which will be resolved with the component instance (defaults to
      * Promise / asynchronous behavior)
      */
    def createComponent(
      /**
      * ID of the component usage or the configuration object that creates the component
      */
    vUsage: String
    ): Component | js.Promise[Any] = js.native
    def createComponent(
      /**
      * ID of the component usage or the configuration object that creates the component
      */
    vUsage: ComponentData
    ): Component | js.Promise[Any] = js.native
    
    /**
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
      * Cleans up the Component instance before destruction.
      *
      * Applications must not call this hook method directly, it is called by the framework when the element
      * is {@link #destroy destroyed}.
      *
      * Subclasses of Component should override this hook to implement any necessary cleanup.
      */
    def exit(): Unit = js.native
    
    /**
      * @SINCE 1.76
      *
      * Returns the list of active terminologies. See the {@link sap.ui.core.Component.create Component.create}
      * factory API documentation for more detail.
      *
      * @returns List of active terminologies
      */
    def getActiveTerminologies(): js.UndefOr[js.Array[String]] = js.native
    
    /**
      * @SINCE 1.15.0
      *
      * Returns user specific data object
      *
      * @returns componentData
      */
    def getComponentData(): js.Object = js.native
    
    /**
      * @SINCE 1.20.0
      *
      * Returns the event bus of this component.
      *
      * @returns the event bus
      */
    def getEventBus(): typings.openui5.sapUiCoreEventBusMod.default = js.native
    
    /**
      * @SINCE 1.33.0
      *
      * Returns the manifest defined in the metadata of the component. If not specified, the return value is
      * null.
      *
      * @returns manifest.
      */
    def getManifest(): js.Object = js.native
    
    /**
      * @SINCE 1.33.0
      *
      * Returns the configuration of a manifest section or the value for a specific path. If no section or key
      * is specified, the return value is null.
      *
      * Example: ` { "sap.ui5": { "dependencies": { "libs": { "sap.m": {} }, "components": { "my.component.a":
      * {} } } }); `
      *
      * The configuration above can be accessed in the following ways:
      * 	 - **By section/namespace**: `oComponent.getManifestEntry("sap.ui5")`
      * 	 - **By path**: `oComponent.getManifestEntry("/sap.ui5/dependencies/libs")`
      *
      * By section/namespace returns the configuration for the specified manifest section and by path allows
      * to specify a concrete path to a dedicated entry inside the manifest. The path syntax always starts with
      * a slash (/).
      *
      * @returns Value of the manifest section or the key (could be any kind of value)
      */
    def getManifestEntry(/**
      * Either the manifest section name (namespace) or a concrete path
      */
    sKey: String): Any | Null = js.native
    
    /**
      * @SINCE 1.33.0
      *
      * Returns the manifest object.
      *
      * @returns manifest.
      */
    def getManifestObject(): typings.openui5.sapUiCoreManifestMod.default = js.native
    
    /**
      * @SINCE 1.37.0
      *
      * Returns a service interface for the {@link sap.ui.core.service.Service Service} declared in the descriptor
      * for components (manifest.json). The declaration needs to be done in the `sap.ui5/services` section as
      * follows:
      * ```javascript
      *
      * {
      *   [...]
      *   "sap.ui5": {
      *     "services": {
      *       "myLocalServiceAlias": {
      *         "factoryName": "my.ServiceFactory",
      *         ["optional": true]
      *       }
      *     }
      *   }
      *   [...]
      * }
      * ```
      *  The service declaration is used to define a mapping between the local alias for the service that can
      * be used in the Component and the name of the service factory which will be used to create a service instance.
      *
      * The `getService` function will look up the service factory and will create a new instance by using the
      * service factory function {@link sap.ui.core.service.ServiceFactory#createInstance createInstance} The
      * optional property defines that the service is not mandatory and the usage will not depend on the availability
      * of this service. When requesting an optional service the `getService` function will reject but there
      * will be no error logged in the console.
      *
      * When creating a new instance of the service the Component context will be passed as `oServiceContext`
      * as follows:
      * ```javascript
      *
      * {
      *   "scopeObject": this,     // the Component instance
      *   "scopeType": "component" // the stereotype of the scopeObject
      * }
      * ```
      *
      *
      * The service will be created only once per Component and reused in future calls to the `getService` function.
      *  This function will return a `Promise` which provides the service interface when resolved. If the
      * `factoryName` could not be found in the {@link sap.ui.core.service.ServiceFactoryRegistry Service Factory
      * Registry} or the service declaration in the descriptor for components (manifest.json) is missing the
      * Promise will reject.
      *
      * This is an example of how the `getService` function can be used:
      * ```javascript
      *
      * oComponent.getService("myLocalServiceAlias").then(function(oService) {
      *   oService.doSomething();
      * }).catch(function(oError) {
      *   Log.error(oError);
      * });
      * ```
      *
      *
      * @returns Promise which will be resolved with the Service interface
      */
    def getService(/**
      * Local service alias as defined in the manifest.json
      */
    sLocalServiceAlias: String): js.Promise[Any] = js.native
    
    /**
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
      * Initializes the Component instance after creation.
      *
      * Applications must not call this hook method directly, it is called by the framework while the constructor
      * of a Component is executed.
      *
      * Subclasses of Component should override this hook to implement any necessary initialization.
      */
    def init(): Unit = js.native
    
    /**
      * @SINCE 1.88
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
      * This method is called after the component is activated
      */
    def onActivate(): Unit = js.native
    
    /**
      * @SINCE 1.15.1
      *
      * The hook which gets called when the static configuration of the component has been changed by some configuration
      * extension.
      */
    def onConfigChange(/**
      * Error message.
      */
    sConfigKey: String): Unit = js.native
    
    /**
      * @SINCE 1.88
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
      * This method is called after the component is deactivated
      */
    def onDeactivate(): Unit = js.native
    
    /**
      * @SINCE 1.15.1
      *
      * The window before unload hook. Override this method in your Component class implementation, to handle
      * cleanup before the real unload or to prompt a question to the user, if the component should be exited.
      *
      * @returns a string if a prompt should be displayed to the user confirming closing the Component (e.g.
      * when the Component is not yet saved), or `undefined` if no prompt should be shown.
      */
    def onWindowBeforeUnload(): js.UndefOr[String] = js.native
    
    /**
      * @SINCE 1.15.1
      *
      * The window error hook. Override this method in your Component class implementation to listen to unhandled
      * errors.
      */
    def onWindowError(
      /**
      * The error message.
      */
    sMessage: String,
      /**
      * File where the error occurred
      */
    sFile: String,
      /**
      * Line number of the error
      */
    iLine: int
    ): Unit = js.native
    
    /**
      * @SINCE 1.15.1
      *
      * The window unload hook. Override this method in your Component class implementation, to handle cleanup
      * of the component once the window will be unloaded (e.g. closed).
      */
    def onWindowUnload(): Unit = js.native
    
    /**
      * @SINCE 1.25.1
      *
      * Calls the function `fn` once and marks all ManagedObjects created during that call as "owned" by this
      * Component.
      *
      * Nested calls of this method are supported (e.g. inside a newly created, nested component). The currently
      * active owner Component will be remembered before executing `fn` and restored afterwards.
      *
      * @returns result of function `fn`
      */
    def runAsOwner(/**
      * Function to execute
      */
    fn: js.Function): Any = js.native
  }
  
  type ComponentSettings = ManagedObjectSettings
  
  trait MetadataOptions
    extends StObject
       with typings.openui5.sapUiBaseManagedObjectMod.MetadataOptions {
    
    /**
      * When set to the string literal "json", this property indicates that the component configuration should
      * be read from a manifest.json file which is assumed to exist next to the Component.js file.
      */
    var manifest: js.UndefOr[json] = js.undefined
  }
  object MetadataOptions {
    
    inline def apply(): MetadataOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MetadataOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MetadataOptions] (val x: Self) extends AnyVal {
      
      inline def setManifest(value: json): Self = StObject.set(x, "manifest", value.asInstanceOf[js.Any])
      
      inline def setManifestUndefined: Self = StObject.set(x, "manifest", js.undefined)
    }
  }
}
