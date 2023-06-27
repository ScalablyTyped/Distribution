package typings.openui5

import typings.openui5.anon.ContentHeight
import typings.openui5.sap.ClassInfo
import typings.std.Object
import typings.std.PropertyKey
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapMP13nEngineMod {
  
  @JSImport("sap/m/p13n/Engine", JSImport.Default)
  @js.native
  /**
    * The `Engine` entity offers personalization capabilities by registering a control instance for modification,
    * such as:
    *
    *
    * 	 - `sap.m.p13n.Popup` initialization
    * 	 - Storing personalization states by choosing the desired persistence layer
    * 	 - State appliance considering the persistence layer
    *
    * The Engine must be used whenever personalization should be enabled by taking a certain persistence layer
    * into account. Available controller implementations for the registration process are:
    *
    *
    * 	 - {@link sap.m.p13n.SelectionController SelectionController}: Used to define a list of selectable entries
    *
    * 	 - {@link sap.m.p13n.SortController SortController}: Used to define a list of sortable properties
    * 	 - {@link sap.m.p13n.GroupController GroupController}: Used to define a list of groupable properties
    *
    *
    * Can be used in combination with `sap.ui.fl.variants.VariantManagement` to persist a state in variants
    * using `sap.ui.fl` capabilities.
    */
  open class default ()
    extends StObject
       with Engine {
    
    /** The initial value of Object.prototype.constructor is the standard built-in Object constructor. */
    /* standard es5 */
    /* CompleteClass */
    var constructor: js.Function = js.native
    
    /**
      * Determines whether an object has a property with the specified name.
      * @param v A property name.
      */
    /* standard es5 */
    /* CompleteClass */
    override def hasOwnProperty(v: PropertyKey): Boolean = js.native
    
    /**
      * Determines whether a specified property is enumerable.
      * @param v A property name.
      */
    /* standard es5 */
    /* CompleteClass */
    override def propertyIsEnumerable(v: PropertyKey): Boolean = js.native
  }
  /* static members */
  object default {
    
    @JSImport("sap/m/p13n/Engine", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.m.p13n.Engine with name `sClassName` and enriches it with the information
      * contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.m.p13n.modules.AdaptationProvider.extend}.
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
    oClassInfo: ClassInfo[T, Engine]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, Engine],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.m.p13n.Engine.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiBaseMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiBaseMetadataMod.default]
  }
  
  @js.native
  trait Engine
    extends StObject
       with Object {
    
    /**
      * @experimental (since 1.104) - Please note that the API of this control is not yet finalized!
      *
      * Applies a state to a control by passing an object that contains the registered controller key and an
      * object matching the inner subcontroller logic.
      *
      * @returns A Promise resolving after the state has been applied
      */
    def applyState(
      /**
      * The registered control instance
      */
    oControl: typings.openui5.sapUiCoreControlMod.default,
      /**
      * The state object
      */
    oState: State
    ): js.Promise[State] = js.native
    
    /**
      * Attaches an event handler to the `StateHandlerRegistry` class. The event handler is fired every time
      * a user triggers a personalization change for a control instance during runtime.
      *
      * @returns Returns `this` to allow method chaining
      */
    def attachStateChange(
      /**
      * The handler function to call when the event occurs
      */
    fnStateEventHandler: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit]
    ): this.type = js.native
    
    /**
      * Unregisters a registered control. By unregistering a control the control is removed from the `Engine`
      * registry, and all instance-specific submodules, such as the registered controllers, are destroyed.
      */
    def deregister(/**
      * The registered control instance
      */
    oControl: typings.openui5.sapUiCoreControlMod.default): Unit = js.native
    
    /**
      * Removes a previously attached state change event handler from the `StateHandlerRegistry` class. The passed
      * parameters must match those used for registration with {@link sap.m.p13n.Engine#attachStateChange} beforehand.
      *
      * @returns Returns `this` to allow method chaining
      */
    def detachStateChange(
      /**
      * The handler function to detach from the event
      */
    fnStateEventHandler: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit]
    ): this.type = js.native
    
    def register(
      /**
      * The control instance to be registered for adaptation
      */
    oControl: typings.openui5.sapUiCoreControlMod.default,
      /**
      * The Engine registration configuration
      */
    oConfig: EngineRegistrationConfig
    ): Unit = js.native
    
    /**
      * This method can be used to trigger a reset to the provided control instance.
      *
      * @returns A Promise resolving once the reset is completed
      */
    def reset(
      /**
      * The related control instance
      */
    oControl: typings.openui5.sapUiCoreControlMod.default,
      /**
      * The key for the affected configuration
      */
    aKeys: String
    ): js.Promise[Null] = js.native
    
    /**
      * @experimental (since 1.104) - Please note that the API of this control is not yet finalized!
      *
      * Retrieves the state for a given control instance after all necessary changes have been applied (e.g.
      * modification handler appliance). After the returned `Promise` has been resolved, the returned state is
      * in sync with the related state object of the control.
      *
      * @returns A Promise resolving in the current control state
      */
    def retrieveState(
      /**
      * The control instance implementing IxState to retrieve the externalized state
      */
    oControl: typings.openui5.sapUiCoreControlMod.default
    ): js.Promise[State] = js.native
    
    /**
      * Opens the personalization dialog.
      *
      * @returns Promise resolving in the `sap.m.p13n.Popup` instance
      */
    def show(
      /**
      * The control instance that is personalized
      */
    oControl: typings.openui5.sapUiCoreControlMod.default,
      /**
      * The affected panels that are added to the `sap.m.p13n.Popup`
      */
    vPanelKeys: String,
      /**
      * The settings object for the personalization
      */
    mSettings: ContentHeight
    ): js.Promise[typings.openui5.sapMP13nPopupMod.default] = js.native
    def show(
      /**
      * The control instance that is personalized
      */
    oControl: typings.openui5.sapUiCoreControlMod.default,
      /**
      * The affected panels that are added to the `sap.m.p13n.Popup`
      */
    vPanelKeys: js.Array[String],
      /**
      * The settings object for the personalization
      */
    mSettings: ContentHeight
    ): js.Promise[typings.openui5.sapMP13nPopupMod.default] = js.native
  }
  
  trait EngineRegistrationConfig extends StObject {
    
    /**
      * A map of arbitrary keys that contain a controller instance as value. The key must be unique and needs
      * to be provided for later access when using `Engine` functionality specific for one controller type.
      */
    var controller: Record[String, typings.openui5.sapMP13nSelectionControllerMod.default]
    
    /**
      * The `{@link sap.m.p13n.modification.MetadataHelper MetadataHelper}` to provide metadata-specific information.
      */
    var helper: typings.openui5.sapMP13nMetadataHelperMod.default
  }
  object EngineRegistrationConfig {
    
    inline def apply(
      controller: Record[String, typings.openui5.sapMP13nSelectionControllerMod.default],
      helper: typings.openui5.sapMP13nMetadataHelperMod.default
    ): EngineRegistrationConfig = {
      val __obj = js.Dynamic.literal(controller = controller.asInstanceOf[js.Any], helper = helper.asInstanceOf[js.Any])
      __obj.asInstanceOf[EngineRegistrationConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EngineRegistrationConfig] (val x: Self) extends AnyVal {
      
      inline def setController(value: Record[String, typings.openui5.sapMP13nSelectionControllerMod.default]): Self = StObject.set(x, "controller", value.asInstanceOf[js.Any])
      
      inline def setHelper(value: typings.openui5.sapMP13nMetadataHelperMod.default): Self = StObject.set(x, "helper", value.asInstanceOf[js.Any])
    }
  }
  
  trait State extends StObject {
    
    /**
      * A map of arbitrary keys that contain a controller instance as value. The key must be unique and needs
      * to be provided for later access when using `Engine` functionality specific for one controller type.
      */
    var controller: Record[String, js.Array[js.Object]]
  }
  object State {
    
    inline def apply(controller: Record[String, js.Array[js.Object]]): State = {
      val __obj = js.Dynamic.literal(controller = controller.asInstanceOf[js.Any])
      __obj.asInstanceOf[State]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: State] (val x: Self) extends AnyVal {
      
      inline def setController(value: Record[String, js.Array[js.Object]]): Self = StObject.set(x, "controller", value.asInstanceOf[js.Any])
    }
  }
}
