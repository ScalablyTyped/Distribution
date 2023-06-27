package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.AggregationBindingInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreControlMod.ControlSettings
import typings.openui5.sapUiCoreLibraryMod.ID
import typings.openui5.sapUiCoreLibraryMod.URI
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapMWizardStepMod {
  
  @JSImport("sap/m/WizardStep", JSImport.Default)
  @js.native
  /**
    * Constructor for a new WizardStep.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends WizardStep {
    def this(/**
      * Initial settings for the new control
      */
    mSettings: WizardStepSettings) = this()
    def this(/**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: String) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: String,
      /**
      * Initial settings for the new control
      */
    mSettings: WizardStepSettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new control
      */
    mSettings: WizardStepSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/m/WizardStep", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.m.WizardStep with name `sClassName` and enriches it with the information
      * contained in `oClassInfo`.
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
    oClassInfo: ClassInfo[T, WizardStep]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, WizardStep],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.m.WizardStep.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait WizardStep
    extends typings.openui5.sapUiCoreControlMod.default {
    
    /**
      * Adds some content to the aggregation {@link #getContent content}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addContent(
      /**
      * The content to add; if empty, nothing is inserted
      */
    oContent: typings.openui5.sapUiCoreControlMod.default
    ): this.type = js.native
    
    def addSubsequentStep(/**
      * The subsequentSteps to add; if empty, nothing is inserted
      */
    vSubsequentStep: WizardStep): this.type = js.native
    /**
      * @since 1.32
      *
      * Adds some subsequentStep into the association {@link #getSubsequentSteps subsequentSteps}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addSubsequentStep(/**
      * The subsequentSteps to add; if empty, nothing is inserted
      */
    vSubsequentStep: ID): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:activate activate} event of this `sap.m.WizardStep`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.WizardStep` itself.
      *
      * This event is fired on next step activation from the Wizard.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachActivate(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit]
    ): this.type = js.native
    def attachActivate(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.WizardStep` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:activate activate} event of this `sap.m.WizardStep`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.WizardStep` itself.
      *
      * This event is fired on next step activation from the Wizard.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachActivate(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit]
    ): this.type = js.native
    def attachActivate(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.WizardStep` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:complete complete} event of this `sap.m.WizardStep`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.WizardStep` itself.
      *
      * This event is fired after the user presses the Next button in the Wizard, or on `nextStep` method call
      * from the app developer.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachComplete(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit]
    ): this.type = js.native
    def attachComplete(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.WizardStep` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:complete complete} event of this `sap.m.WizardStep`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.WizardStep` itself.
      *
      * This event is fired after the user presses the Next button in the Wizard, or on `nextStep` method call
      * from the app developer.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachComplete(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit]
    ): this.type = js.native
    def attachComplete(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.WizardStep` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Destroys all the content in the aggregation {@link #getContent content}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyContent(): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:activate activate} event of this `sap.m.WizardStep`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachActivate(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit]
    ): this.type = js.native
    def detachActivate(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit],
      /**
      * Context object on which the given function had to be called
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:complete complete} event of this `sap.m.WizardStep`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachComplete(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit]
    ): this.type = js.native
    def detachComplete(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit],
      /**
      * Context object on which the given function had to be called
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Fires event {@link #event:activate activate} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireActivate(): this.type = js.native
    def fireActivate(/**
      * Parameters to pass along with the event
      */
    mParameters: js.Object): this.type = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Fires event {@link #event:complete complete} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireComplete(): this.type = js.native
    def fireComplete(/**
      * Parameters to pass along with the event
      */
    mParameters: js.Object): this.type = js.native
    
    /**
      * Gets content of aggregation {@link #getContent content}.
      *
      * The content of the Wizard Step.
      */
    def getContent(): js.Array[typings.openui5.sapUiCoreControlMod.default] = js.native
    
    /**
      * Gets current value of property {@link #getIcon icon}.
      *
      * Determines the icon that is displayed for this step. The icon is visualized in the progress navigation
      * part of the Wizard control. **Note:** In order for the icon to be displayed, each step in the Wizard
      * should have this property defined, otherwise the default numbering will be displayed.
      *
      * Default value is `empty string`.
      *
      * @returns Value of property `icon`
      */
    def getIcon(): URI = js.native
    
    /**
      * @since 1.32
      *
      * ID of the element which is the current target of the association {@link #getNextStep nextStep}, or `null`.
      */
    def getNextStep(): ID = js.native
    
    /**
      * @since 1.54
      *
      * Gets current value of property {@link #getOptional optional}.
      *
      * Indicates whether or not the step is optional. When a step is optional an "(Optional)" label is displayed
      * under the step's title.
      *
      * Default value is `false`.
      *
      * @returns Value of property `optional`
      */
    def getOptional(): Boolean = js.native
    
    /**
      * @since 1.32
      *
      * Returns array of IDs of the elements which are the current targets of the association {@link #getSubsequentSteps subsequentSteps}.
      */
    def getSubsequentSteps(): js.Array[ID] = js.native
    
    /**
      * Gets current value of property {@link #getTitle title}.
      *
      * Determines the title of the step. The title is visualized in the Wizard control.
      *
      * Default value is `empty string`.
      *
      * @returns Value of property `title`
      */
    def getTitle(): String = js.native
    
    /**
      * @since 1.32
      *
      * Gets current value of property {@link #getValidated validated}.
      *
      * Indicates whether or not the step is validated. When a step is validated a Next button is visualized
      * in the Wizard control.
      *
      * Default value is `true`.
      *
      * @returns Value of property `validated`
      */
    def getValidated(): Boolean = js.native
    
    /**
      * Checks for the provided `sap.ui.core.Control` in the aggregation {@link #getContent content}. and returns
      * its index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfContent(
      /**
      * The content whose index is looked for
      */
    oContent: typings.openui5.sapUiCoreControlMod.default
    ): int = js.native
    
    /**
      * Inserts a content into the aggregation {@link #getContent content}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def insertContent(
      /**
      * The content to insert; if empty, nothing is inserted
      */
    oContent: typings.openui5.sapUiCoreControlMod.default,
      /**
      * The `0`-based index the content should be inserted at; for a negative value of `iIndex`, the content
      * is inserted at position 0; for a value greater than the current size of the aggregation, the content
      * is inserted at the last position
      */
    iIndex: int
    ): this.type = js.native
    
    /**
      * Removes all the controls from the aggregation {@link #getContent content}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllContent(): js.Array[typings.openui5.sapUiCoreControlMod.default] = js.native
    
    /**
      * @since 1.32
      *
      * Removes all the controls in the association named {@link #getSubsequentSteps subsequentSteps}.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllSubsequentSteps(): js.Array[ID] = js.native
    
    def removeContent(/**
      * The content to remove or its index or id
      */
    vContent: String): typings.openui5.sapUiCoreControlMod.default | Null = js.native
    /**
      * Removes a content from the aggregation {@link #getContent content}.
      *
      * @returns The removed content or `null`
      */
    def removeContent(/**
      * The content to remove or its index or id
      */
    vContent: int): typings.openui5.sapUiCoreControlMod.default | Null = js.native
    def removeContent(
      /**
      * The content to remove or its index or id
      */
    vContent: typings.openui5.sapUiCoreControlMod.default
    ): typings.openui5.sapUiCoreControlMod.default | Null = js.native
    
    /**
      * @since 1.32
      *
      * Removes an subsequentStep from the association named {@link #getSubsequentSteps subsequentSteps}.
      *
      * @returns The removed subsequentStep or `null`
      */
    def removeSubsequentStep(/**
      * The subsequentStep to be removed or its index or ID
      */
    vSubsequentStep: int): ID | Null = js.native
    def removeSubsequentStep(/**
      * The subsequentStep to be removed or its index or ID
      */
    vSubsequentStep: WizardStep): ID | Null = js.native
    def removeSubsequentStep(/**
      * The subsequentStep to be removed or its index or ID
      */
    vSubsequentStep: ID): ID | Null = js.native
    
    /**
      * Sets a new value for property {@link #getIcon icon}.
      *
      * Determines the icon that is displayed for this step. The icon is visualized in the progress navigation
      * part of the Wizard control. **Note:** In order for the icon to be displayed, each step in the Wizard
      * should have this property defined, otherwise the default numbering will be displayed.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `empty string`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setIcon(): this.type = js.native
    def setIcon(/**
      * New value for property `icon`
      */
    sIcon: URI): this.type = js.native
    
    def setNextStep(
      /**
      * ID of an element which becomes the new target of this nextStep association; alternatively, an element
      * instance may be given
      */
    oNextStep: WizardStep
    ): this.type = js.native
    /**
      * @since 1.32
      *
      * Sets the associated {@link #getNextStep nextStep}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setNextStep(
      /**
      * ID of an element which becomes the new target of this nextStep association; alternatively, an element
      * instance may be given
      */
    oNextStep: ID
    ): this.type = js.native
    
    /**
      * @since 1.54
      *
      * Sets a new value for property {@link #getOptional optional}.
      *
      * Indicates whether or not the step is optional. When a step is optional an "(Optional)" label is displayed
      * under the step's title.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setOptional(): this.type = js.native
    def setOptional(/**
      * New value for property `optional`
      */
    bOptional: Boolean): this.type = js.native
    
    /**
      * Sets the title property of the WizardStep.
      *
      * @returns this instance for method chaining.
      */
    def setTitle(/**
      * The new WizardStep title.
      */
    sNewTitle: String): WizardStep = js.native
    
    /**
      * @since 1.32
      *
      * Sets a new value for property {@link #getValidated validated}.
      *
      * Indicates whether or not the step is validated. When a step is validated a Next button is visualized
      * in the Wizard control.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setValidated(): this.type = js.native
    def setValidated(/**
      * New value for property `validated`
      */
    bValidated: Boolean): this.type = js.native
  }
  
  trait WizardStep$CompleteEventParameters extends StObject
  
  type WizardStepActivateEvent = typings.openui5.sapUiBaseEventMod.default[WizardStepActivateEventParameters]
  
  trait WizardStepActivateEventParameters extends StObject
  
  type WizardStepCompleteEvent = typings.openui5.sapUiBaseEventMod.default[WizardStep$CompleteEventParameters]
  
  type WizardStepCompleteEventParameters = WizardStep$CompleteEventParameters
  
  trait WizardStepSettings
    extends StObject
       with ControlSettings {
    
    /**
      * This event is fired on next step activation from the Wizard.
      */
    var activate: js.UndefOr[
        js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit]
      ] = js.undefined
    
    /**
      * This event is fired after the user presses the Next button in the Wizard, or on `nextStep` method call
      * from the app developer.
      */
    var complete: js.UndefOr[
        js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit]
      ] = js.undefined
    
    /**
      * The content of the Wizard Step.
      */
    var content: js.UndefOr[
        js.Array[typings.openui5.sapUiCoreControlMod.default] | typings.openui5.sapUiCoreControlMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Determines the icon that is displayed for this step. The icon is visualized in the progress navigation
      * part of the Wizard control. **Note:** In order for the icon to be displayed, each step in the Wizard
      * should have this property defined, otherwise the default numbering will be displayed.
      */
    var icon: js.UndefOr[URI | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * @since 1.32
      *
      * The next step to be taken. It must be defined in order for the previous step to be completed.
      */
    var nextStep: js.UndefOr[WizardStep | String] = js.undefined
    
    /**
      * @since 1.54
      *
      * Indicates whether or not the step is optional. When a step is optional an "(Optional)" label is displayed
      * under the step's title.
      */
    var optional: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @since 1.32
      *
      * This association is used only when the `enableBranching` property of the Wizard is set to true. Use the
      * association to store the next steps that are about to come after the current. If this is going to be
      * a final step - leave this association empty. **NOTE:** The association needs to be set prior the step
      * is shown. Dynamical addition of subsequent steps is not supported use case especially when the current
      * step is final (the association was empty before the step was displayed).
      */
    var subsequentSteps: js.UndefOr[js.Array[WizardStep | String]] = js.undefined
    
    /**
      * Determines the title of the step. The title is visualized in the Wizard control.
      */
    var title: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * @since 1.32
      *
      * Indicates whether or not the step is validated. When a step is validated a Next button is visualized
      * in the Wizard control.
      */
    var validated: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
  }
  object WizardStepSettings {
    
    inline def apply(): WizardStepSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WizardStepSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WizardStepSettings] (val x: Self) extends AnyVal {
      
      inline def setActivate(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default[js.Object] => Unit): Self = StObject.set(x, "activate", js.Any.fromFunction1(value))
      
      inline def setActivateUndefined: Self = StObject.set(x, "activate", js.undefined)
      
      inline def setComplete(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default[js.Object] => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction1(value))
      
      inline def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
      
      inline def setContent(
        value: js.Array[typings.openui5.sapUiCoreControlMod.default] | typings.openui5.sapUiCoreControlMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setContentVarargs(value: typings.openui5.sapUiCoreControlMod.default*): Self = StObject.set(x, "content", js.Array(value*))
      
      inline def setIcon(value: URI | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setNextStep(value: WizardStep | String): Self = StObject.set(x, "nextStep", value.asInstanceOf[js.Any])
      
      inline def setNextStepUndefined: Self = StObject.set(x, "nextStep", js.undefined)
      
      inline def setOptional(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "optional", value.asInstanceOf[js.Any])
      
      inline def setOptionalUndefined: Self = StObject.set(x, "optional", js.undefined)
      
      inline def setSubsequentSteps(value: js.Array[WizardStep | String]): Self = StObject.set(x, "subsequentSteps", value.asInstanceOf[js.Any])
      
      inline def setSubsequentStepsUndefined: Self = StObject.set(x, "subsequentSteps", js.undefined)
      
      inline def setSubsequentStepsVarargs(value: (WizardStep | String)*): Self = StObject.set(x, "subsequentSteps", js.Array(value*))
      
      inline def setTitle(value: String | PropertyBindingInfo): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setValidated(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "validated", value.asInstanceOf[js.Any])
      
      inline def setValidatedUndefined: Self = StObject.set(x, "validated", js.undefined)
    }
  }
}
