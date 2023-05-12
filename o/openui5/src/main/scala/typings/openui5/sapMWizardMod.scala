package typings.openui5

import typings.openui5.anon.Index
import typings.openui5.anon.Step
import typings.openui5.sap.ClassInfo
import typings.openui5.sapFLibraryMod.IDynamicPageStickyContent
import typings.openui5.sapMLibraryMod.PageBackgroundDesign
import typings.openui5.sapMLibraryMod.WizardRenderMode
import typings.openui5.sapUiBaseManagedObjectMod.AggregationBindingInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreControlMod.ControlSettings
import typings.openui5.sapUiCoreLibraryMod.CSSSize
import typings.openui5.sapUiCoreLibraryMod.ID
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapMWizardMod {
  
  @JSImport("sap/m/Wizard", JSImport.Default)
  @js.native
  /**
    * Constructor for a new Wizard.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    * See:
    * 	{@link fiori:https://experience.sap.com/fiori-design-web/wizard/ Wizard}
    */
  open class default () extends Wizard {
    def this(/**
      * Initial settings for the new control
      */
    mSettings: WizardSettings) = this()
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
    mSettings: WizardSettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new control
      */
    mSettings: WizardSettings
    ) = this()
    
    /* CompleteClass */
    var __implements__sap_f_IDynamicPageStickyContent: Boolean = js.native
  }
  /* static members */
  object default {
    
    @JSImport("sap/m/Wizard", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.m.Wizard with name `sClassName` and enriches it with the information
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
    oClassInfo: ClassInfo[T, Wizard]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, Wizard],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.m.Wizard.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait Wizard
    extends typings.openui5.sapUiCoreControlMod.default
       with IDynamicPageStickyContent {
    
    /**
      * Adds a new step to the Wizard.
      *
      * @returns Pointer to the control instance for chaining.
      */
    def addStep(
      /**
      * New WizardStep to add to the Wizard.
      */
    oWizardStep: typings.openui5.sapMWizardStepMod.default
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:complete complete} event of this `sap.m.Wizard`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.Wizard` itself.
      *
      * The complete event is fired when the user clicks the finish button of the Wizard. The finish button is
      * only available on the last step of the Wizard.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachComplete(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachComplete(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.Wizard` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:complete complete} event of this `sap.m.Wizard`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.Wizard` itself.
      *
      * The complete event is fired when the user clicks the finish button of the Wizard. The finish button is
      * only available on the last step of the Wizard.
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
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
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
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.Wizard` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * @SINCE 1.101
      *
      * Attaches event handler `fnFunction` to the {@link #event:navigationChange navigationChange} event of
      * this `sap.m.Wizard`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.Wizard` itself.
      *
      * This event is fired when the the current visible step is changed by either taping on the `WizardProgressNavigator`
      * or scrolling through the steps.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachNavigationChange(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachNavigationChange(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.Wizard` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * @SINCE 1.101
      *
      * Attaches event handler `fnFunction` to the {@link #event:navigationChange navigationChange} event of
      * this `sap.m.Wizard`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.Wizard` itself.
      *
      * This event is fired when the the current visible step is changed by either taping on the `WizardProgressNavigator`
      * or scrolling through the steps.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachNavigationChange(
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
    def attachNavigationChange(
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
      * Context object to call the event handler with. Defaults to this `sap.m.Wizard` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:stepActivate stepActivate} event of this `sap.m.Wizard`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.Wizard` itself.
      *
      * The StepActivated event is fired every time a new step is activated.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachStepActivate(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachStepActivate(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.Wizard` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:stepActivate stepActivate} event of this `sap.m.Wizard`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.Wizard` itself.
      *
      * The StepActivated event is fired every time a new step is activated.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachStepActivate(
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
    def attachStepActivate(
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
      * Context object to call the event handler with. Defaults to this `sap.m.Wizard` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Destroys all aggregated steps in the Wizard.
      *
      * @returns Pointer to the control instance for chaining.
      */
    def destroySteps(): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:complete complete} event of this `sap.m.Wizard`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachComplete(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachComplete(
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
      * @SINCE 1.101
      *
      * Detaches event handler `fnFunction` from the {@link #event:navigationChange navigationChange} event of
      * this `sap.m.Wizard`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachNavigationChange(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachNavigationChange(
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
      * Detaches event handler `fnFunction` from the {@link #event:stepActivate stepActivate} event of this `sap.m.Wizard`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachStepActivate(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachStepActivate(
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
      * Discards all progress done from the given step(incl.) to the end of the wizard. The verified state of
      * the steps is returned to the initial provided.
      *
      * @returns Pointer to the control instance for chaining.
      */
    def discardProgress(
      /**
      * The step after which the progress is discarded.
      */
    oStep: typings.openui5.sapMWizardStepMod.default,
      /**
      * Indicating whether we should preserve next step
      */
    bPreserveNextStep: Boolean
    ): this.type = js.native
    
    /**
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
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
      * @SINCE 1.101
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
      * Fires event {@link #event:navigationChange navigationChange} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireNavigationChange(): this.type = js.native
    def fireNavigationChange(/**
      * Parameters to pass along with the event
      */
    mParameters: Step): this.type = js.native
    
    /**
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
      * Fires event {@link #event:stepActivate stepActivate} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireStepActivate(): this.type = js.native
    def fireStepActivate(/**
      * Parameters to pass along with the event
      */
    mParameters: Index): this.type = js.native
    
    /**
      * Gets current value of property {@link #getBackgroundDesign backgroundDesign}.
      *
      * This property is used to set the background color of a Wizard content. The `Standard` option with the
      * default background color is used, if not specified.
      *
      * Default value is `Standard`.
      *
      * @returns Value of property `backgroundDesign`
      */
    def getBackgroundDesign(): PageBackgroundDesign | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PageBackgroundDesign * / any */ String) = js.native
    
    /**
      * @SINCE 1.50
      *
      * ID of the element which is the current target of the association {@link #getCurrentStep currentStep},
      * or `null`.
      */
    def getCurrentStep(): ID = js.native
    
    /**
      * @SINCE 1.32
      *
      * Gets current value of property {@link #getEnableBranching enableBranching}.
      *
      * Enables the branching functionality of the Wizard. Branching gives the developer the ability to define
      * multiple routes a user is able to take based on the input in the current step. It is up to the developer
      * to programmatically check for what is the input in the current step and set a concrete next step amongst
      * the available subsequent steps. Note: If this property is set to false, `next` and `subSequentSteps`
      * associations of the WizardStep control are ignored.
      *
      * Default value is `false`.
      *
      * @returns Value of property `enableBranching`
      */
    def getEnableBranching(): Boolean = js.native
    
    /**
      * Returns the finish button text which will be rendered.
      *
      * @returns The text which will be rendered in the finish button.
      */
    def getFinishButtonText(): String = js.native
    
    /**
      * Gets current value of property {@link #getHeight height}.
      *
      * Determines the height of the Wizard.
      *
      * Default value is `"100%"`.
      *
      * @returns Value of property `height`
      */
    def getHeight(): CSSSize = js.native
    
    /**
      * Returns the number of the last activated step in the Wizard.
      *
      * @returns The last activated step.
      */
    def getProgress(): Double = js.native
    
    /**
      * Returns the last activated step in the Wizard.
      *
      * @returns Pointer to the control instance for chaining.
      */
    def getProgressStep(): typings.openui5.sapMWizardStepMod.default = js.native
    
    /**
      * @SINCE 1.84
      *
      * Gets current value of property {@link #getRenderMode renderMode}.
      *
      * Defines how the steps of the Wizard would be visualized.
      *
      * Default value is `Scroll`.
      *
      * @returns Value of property `renderMode`
      */
    def getRenderMode(): WizardRenderMode | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof WizardRenderMode * / any */ String) = js.native
    
    /**
      * Gets current value of property {@link #getShowNextButton showNextButton}.
      *
      * Controls the visibility of the next button. The developers can choose to control the flow of the steps
      * either through the API (with `nextStep` and `previousStep` methods) or let the user click the next button,
      * and control it with `validateStep` or `invalidateStep` methods.
      *
      * Default value is `true`.
      *
      * @returns Value of property `showNextButton`
      */
    def getShowNextButton(): Boolean = js.native
    
    /**
      * Gets content of aggregation {@link #getSteps steps}.
      *
      * The wizard steps to be included in the content of the control.
      */
    def getSteps(): js.Array[typings.openui5.sapMWizardStepMod.default] = js.native
    
    /**
      * Gets current value of property {@link #getWidth width}.
      *
      * Determines the width of the Wizard.
      *
      * Default value is `"auto"`.
      *
      * @returns Value of property `width`
      */
    def getWidth(): CSSSize = js.native
    
    /**
      * Goes to the given step. The step must already be activated and visible. You can't use this method on
      * steps that haven't been reached yet.
      *
      * @returns Pointer to the control instance for chaining.
      */
    def goToStep(
      /**
      * The step to go to.
      */
    oStep: typings.openui5.sapMWizardStepMod.default,
      /**
      * Defines whether the focus should be changed to the first element.
      */
    bFocusFirstStepElement: Boolean
    ): this.type = js.native
    
    /**
      * Checks for the provided `sap.m.WizardStep` in the aggregation {@link #getSteps steps}. and returns its
      * index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfStep(/**
      * The step whose index is looked for
      */
    oStep: typings.openui5.sapMWizardStepMod.default): int = js.native
    
    /**
      * Invalidates the given step.
      *
      * @returns Pointer to the control instance for chaining.
      */
    def invalidateStep(/**
      * The step to be invalidated.
      */
    oStep: typings.openui5.sapMWizardStepMod.default): this.type = js.native
    
    /**
      * Validates the current step, and moves one step further.
      *
      * @returns Pointer to the control instance for chaining.
      */
    def nextStep(): this.type = js.native
    
    /**
      * Discards the current step and goes one step back.
      *
      * @returns Pointer to the control instance for chaining.
      */
    def previousStep(): this.type = js.native
    
    /**
      * Removes all steps from the Wizard.
      *
      * @returns Pointer to the Steps that were removed.
      */
    def removeAllSteps(): js.Array[typings.openui5.sapMWizardStepMod.default] = js.native
    
    /**
      * Sets association currentStep to the given step.
      *
      * @returns Reference to the control instance for chaining.
      */
    def setCurrentStep(
      /**
      * The step of the wizard that will be currently activated (meaning the last step).
      */
    vStepId: typings.openui5.sapMWizardStepMod.default
    ): this.type = js.native
    def setCurrentStep(
      /**
      * The step of the wizard that will be currently activated (meaning the last step).
      */
    vStepId: ID
    ): this.type = js.native
    
    /**
      * @SINCE 1.32
      *
      * Sets a new value for property {@link #getEnableBranching enableBranching}.
      *
      * Enables the branching functionality of the Wizard. Branching gives the developer the ability to define
      * multiple routes a user is able to take based on the input in the current step. It is up to the developer
      * to programmatically check for what is the input in the current step and set a concrete next step amongst
      * the available subsequent steps. Note: If this property is set to false, `next` and `subSequentSteps`
      * associations of the WizardStep control are ignored.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setEnableBranching(): this.type = js.native
    def setEnableBranching(/**
      * New value for property `enableBranching`
      */
    bEnableBranching: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getFinishButtonText finishButtonText}.
      *
      * Changes the text of the finish button for the last step. This property can be used only if `showNextButton`
      * is set to true. By default the text of the button is "Review".
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `"Review"`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setFinishButtonText(): this.type = js.native
    def setFinishButtonText(/**
      * New value for property `finishButtonText`
      */
    sFinishButtonText: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getHeight height}.
      *
      * Determines the height of the Wizard.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `"100%"`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setHeight(): this.type = js.native
    def setHeight(/**
      * New value for property `height`
      */
    sHeight: CSSSize): this.type = js.native
    
    /**
      * @SINCE 1.84
      *
      * Sets a new value for property {@link #getRenderMode renderMode}.
      *
      * Defines how the steps of the Wizard would be visualized.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `Scroll`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setRenderMode(): this.type = js.native
    def setRenderMode(
      /**
      * New value for property `renderMode`
      */
    sRenderMode: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof WizardRenderMode * / any */ String
    ): this.type = js.native
    def setRenderMode(/**
      * New value for property `renderMode`
      */
    sRenderMode: WizardRenderMode): this.type = js.native
    
    /**
      * Sets the visibility of the next button.
      *
      * @returns Reference to the control instance for chaining.
      */
    def setShowNextButton(/**
      * True to show the button or false to hide it.
      */
    bValue: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getWidth width}.
      *
      * Determines the width of the Wizard.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `"auto"`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setWidth(): this.type = js.native
    def setWidth(/**
      * New value for property `width`
      */
    sWidth: CSSSize): this.type = js.native
    
    /**
      * Validates the given step.
      *
      * @returns Pointer to the control instance for chaining.
      */
    def validateStep(/**
      * The step to be validated.
      */
    oStep: typings.openui5.sapMWizardStepMod.default): this.type = js.native
  }
  
  trait WizardSettings
    extends StObject
       with ControlSettings {
    
    /**
      * This property is used to set the background color of a Wizard content. The `Standard` option with the
      * default background color is used, if not specified.
      */
    var backgroundDesign: js.UndefOr[
        PageBackgroundDesign | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PageBackgroundDesign * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * The complete event is fired when the user clicks the finish button of the Wizard. The finish button is
      * only available on the last step of the Wizard.
      */
    var complete: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * @SINCE 1.50
      *
      * This association controls the current activated step of the wizard (meaning the last step) For example
      * if we have A->B->C->D steps, we are on step A and we setCurrentStep(C) A,B and C are going to be activated.
      * D will still remain unvisited. The parameter needs to be a Wizard step that is part of the current Wizard
      */
    var currentStep: js.UndefOr[typings.openui5.sapMWizardStepMod.default | String] = js.undefined
    
    /**
      * @SINCE 1.32
      *
      * Enables the branching functionality of the Wizard. Branching gives the developer the ability to define
      * multiple routes a user is able to take based on the input in the current step. It is up to the developer
      * to programmatically check for what is the input in the current step and set a concrete next step amongst
      * the available subsequent steps. Note: If this property is set to false, `next` and `subSequentSteps`
      * associations of the WizardStep control are ignored.
      */
    var enableBranching: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Changes the text of the finish button for the last step. This property can be used only if `showNextButton`
      * is set to true. By default the text of the button is "Review".
      */
    var finishButtonText: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Determines the height of the Wizard.
      */
    var height: js.UndefOr[
        CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @SINCE 1.101
      *
      * This event is fired when the the current visible step is changed by either taping on the `WizardProgressNavigator`
      * or scrolling through the steps.
      */
    var navigationChange: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * @SINCE 1.84
      *
      * Defines how the steps of the Wizard would be visualized.
      */
    var renderMode: js.UndefOr[
        WizardRenderMode | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof WizardRenderMode * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * Controls the visibility of the next button. The developers can choose to control the flow of the steps
      * either through the API (with `nextStep` and `previousStep` methods) or let the user click the next button,
      * and control it with `validateStep` or `invalidateStep` methods.
      */
    var showNextButton: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * The StepActivated event is fired every time a new step is activated.
      */
    var stepActivate: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * The wizard steps to be included in the content of the control.
      */
    var steps: js.UndefOr[
        js.Array[typings.openui5.sapMWizardStepMod.default] | typings.openui5.sapMWizardStepMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Determines the width of the Wizard.
      */
    var width: js.UndefOr[
        CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
  }
  object WizardSettings {
    
    inline def apply(): WizardSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WizardSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WizardSettings] (val x: Self) extends AnyVal {
      
      inline def setBackgroundDesign(
        value: PageBackgroundDesign | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PageBackgroundDesign * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "backgroundDesign", value.asInstanceOf[js.Any])
      
      inline def setBackgroundDesignUndefined: Self = StObject.set(x, "backgroundDesign", js.undefined)
      
      inline def setComplete(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction1(value))
      
      inline def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
      
      inline def setCurrentStep(value: typings.openui5.sapMWizardStepMod.default | String): Self = StObject.set(x, "currentStep", value.asInstanceOf[js.Any])
      
      inline def setCurrentStepUndefined: Self = StObject.set(x, "currentStep", js.undefined)
      
      inline def setEnableBranching(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "enableBranching", value.asInstanceOf[js.Any])
      
      inline def setEnableBranchingUndefined: Self = StObject.set(x, "enableBranching", js.undefined)
      
      inline def setFinishButtonText(value: String | PropertyBindingInfo): Self = StObject.set(x, "finishButtonText", value.asInstanceOf[js.Any])
      
      inline def setFinishButtonTextUndefined: Self = StObject.set(x, "finishButtonText", js.undefined)
      
      inline def setHeight(value: CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setNavigationChange(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "navigationChange", js.Any.fromFunction1(value))
      
      inline def setNavigationChangeUndefined: Self = StObject.set(x, "navigationChange", js.undefined)
      
      inline def setRenderMode(
        value: WizardRenderMode | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof WizardRenderMode * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "renderMode", value.asInstanceOf[js.Any])
      
      inline def setRenderModeUndefined: Self = StObject.set(x, "renderMode", js.undefined)
      
      inline def setShowNextButton(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "showNextButton", value.asInstanceOf[js.Any])
      
      inline def setShowNextButtonUndefined: Self = StObject.set(x, "showNextButton", js.undefined)
      
      inline def setStepActivate(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "stepActivate", js.Any.fromFunction1(value))
      
      inline def setStepActivateUndefined: Self = StObject.set(x, "stepActivate", js.undefined)
      
      inline def setSteps(
        value: js.Array[typings.openui5.sapMWizardStepMod.default] | typings.openui5.sapMWizardStepMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "steps", value.asInstanceOf[js.Any])
      
      inline def setStepsUndefined: Self = StObject.set(x, "steps", js.undefined)
      
      inline def setStepsVarargs(value: typings.openui5.sapMWizardStepMod.default*): Self = StObject.set(x, "steps", js.Array(value*))
      
      inline def setWidth(value: CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
