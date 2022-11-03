package typings.openui5

import org.scalablytyped.runtime.Shortcut
import typings.openui5.anon.ContentHeight
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapMP13nEngineMod extends Shortcut {
  
  @JSImport("sap/m/p13n/Engine", JSImport.Default)
  @js.native
  val default: Engine = js.native
  
  /**
    * @SINCE 1.104
    * @EXPERIMENTAL (since 1.104) - Please note that the API of this control is not yet finalized!
    *
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
    * The following persistence layers can be chosen for personalization services:
    *
    *
    * 	 - {@link sap.m.p13n.modification.FlexModificationHandler FlexModificationHandler}: Used in combination
    * 			with `sap.ui.fl.variants.VariantManagement` to persist a state in variants using `sap.ui.fl` capabilities.
    *
    * 	 - {@link sap.m.p13n.modification.LocalStorageModificationHandler LocalStorageModificationHandler}:
    * 			Used to store a personalization state in the local storage
    * 	 - {@link sap.m.p13n.modification.ModificationHandler ModificationHandler}: Used by default - this handler
    * 			will not persist a state.
    */
  @js.native
  trait Engine extends StObject {
    
    /**
      * @EXPERIMENTAL (since 1.104) - Please note that the API of this control is not yet finalized!
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
    oState: js.Object,
      /**
      * Defines whether the state should be an additional delta of the current control state
      */
    bApplyAbsolute: Boolean
    ): js.Promise[Any] = js.native
    
    /**
      * @EXPERIMENTAL (since 1.104) - Please note that the API of this control is not yet finalized!
      *
      * Attaches an event handler to the `StateHandlerRegistry` class. The event handler is fired every time
      * a user triggers a personalization change for a control instance during runtime.
      *
      * @returns Returns `this` to allow method chaining
      */
    def attachStateChange(/**
      * The handler function to call when the event occurs
      */
    fnStateEventHandler: js.Function): this.type = js.native
    
    /**
      * @EXPERIMENTAL (since 1.104) - Please note that the API of this control is not yet finalized!
      *
      * Unregisters a registered control. By unregistering a control the control is removed from the `Engine`
      * registry, and all instance-specific submodules, such as the registered controllers, are destroyed.
      */
    def deregister(/**
      * The registered control instance
      */
    oControl: typings.openui5.sapUiCoreControlMod.default): Unit = js.native
    
    /**
      * @EXPERIMENTAL (since 1.104) - Please note that the API of this control is not yet finalized!
      *
      * Removes a previously attached state change event handler from the `StateHandlerRegistry` class. The passed
      * parameters must match those used for registration with {@link sap.m.p13n.Engine#attachStateChange} beforehand.
      *
      * @returns Returns `this` to allow method chaining
      */
    def detachStateChange(/**
      * The handler function to detach from the event
      */
    fnStateEventHandler: js.Function): this.type = js.native
    
    /**
      * Creates a new subclass of class sap.m.p13n.Engine with name `sClassName` and enriches it with the information
      * contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.m.p13n.AdaptationProvider.extend}.
      *
      * @returns Created class / constructor function
      */
    def extend(/**
      * Name of the class being created
      */
    sClassName: String): js.Function = js.native
    def extend(
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: js.Object
    ): js.Function = js.native
    def extend(
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: js.Object,
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = js.native
    def extend(
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
    ): js.Function = js.native
    
    /**
      * Returns a metadata object for class sap.m.p13n.Engine.
      *
      * @returns Metadata object describing this class
      */
    def getMetadata(): typings.openui5.sapUiBaseMetadataMod.default = js.native
    
    /**
      * @EXPERIMENTAL (since 1.104) - Please note that the API of this control is not yet finalized!
      *
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
    ): js.Promise[Any] = js.native
    
    /**
      * @EXPERIMENTAL (since 1.104) - Please note that the API of this control is not yet finalized!
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
    oControl: js.Object
    ): js.Promise[Any] = js.native
    
    /**
      * @EXPERIMENTAL (since 1.104) - Please note that the API of this control is not yet finalized!
      *
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
    ): js.Promise[Any] = js.native
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
    ): js.Promise[Any] = js.native
  }
  
  @js.native
  trait EngineRegistrationConfig extends StObject {
    
    def apply(oControl: typings.openui5.sapUiCoreControlMod.default, oConfig: EngineRegistrationConfig): js.Object = js.native
  }
  
  type _To = Engine
  
  /* This means you don't have to write `default`, but can instead just say `sapMP13nEngineMod.foo` */
  override def _to: Engine = default
}
