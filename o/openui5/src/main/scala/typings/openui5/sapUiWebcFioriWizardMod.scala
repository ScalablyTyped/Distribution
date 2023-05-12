package typings.openui5

import typings.openui5.anon.ChangeWithClick
import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.AggregationBindingInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreControlMod.ControlSettings
import typings.openui5.sapUiCoreLibraryMod.CSSSize
import typings.openui5.sapUiWebcFioriLibraryMod.IWizardStep
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiWebcFioriWizardMod {
  
  @JSImport("sap/ui/webc/fiori/Wizard", JSImport.Default)
  @js.native
  /**
    * Constructor for a new `Wizard`.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
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
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/webc/fiori/Wizard", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.webc.fiori.Wizard with name `sClassName` and enriches it with
      * the information contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.ui.webc.common.WebComponent.extend}.
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
      * Returns a metadata object for class sap.ui.webc.fiori.Wizard.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiWebcCommonWebComponentMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiWebcCommonWebComponentMetadataMod.default]
  }
  
  @js.native
  trait Wizard
    extends typings.openui5.sapUiWebcCommonWebComponentMod.default {
    
    /**
      * Adds some step to the aggregation {@link #getSteps steps}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addStep(/**
      * The step to add; if empty, nothing is inserted
      */
    oStep: IWizardStep): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:stepChange stepChange} event of this `sap.ui.webc.fiori.Wizard`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.webc.fiori.Wizard` itself.
      *
      * Fired when the step is changed by user interaction - either with scrolling, or by clicking on the steps
      * within the component header.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachStepChange(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachStepChange(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.webc.fiori.Wizard` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:stepChange stepChange} event of this `sap.ui.webc.fiori.Wizard`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.webc.fiori.Wizard` itself.
      *
      * Fired when the step is changed by user interaction - either with scrolling, or by clicking on the steps
      * within the component header.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachStepChange(
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
    def attachStepChange(
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
      * Context object to call the event handler with. Defaults to this `sap.ui.webc.fiori.Wizard` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Destroys all the steps in the aggregation {@link #getSteps steps}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroySteps(): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:stepChange stepChange} event of this `sap.ui.webc.fiori.Wizard`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachStepChange(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachStepChange(
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
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
      * Fires event {@link #event:stepChange stepChange} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireStepChange(): this.type = js.native
    def fireStepChange(/**
      * Parameters to pass along with the event
      */
    mParameters: ChangeWithClick): this.type = js.native
    
    /**
      * Gets current value of property {@link #getHeight height}.
      *
      * Defines the height of the control
      *
      * @returns Value of property `height`
      */
    def getHeight(): CSSSize = js.native
    
    /**
      * Gets content of aggregation {@link #getSteps steps}.
      *
      * Defines the steps.
      *
      *  **Note:** Use the available `sap.ui.webc.fiori.WizardStep` component.
      */
    def getSteps(): js.Array[IWizardStep] = js.native
    
    /**
      * Checks for the provided `sap.ui.webc.fiori.IWizardStep` in the aggregation {@link #getSteps steps}. and
      * returns its index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfStep(/**
      * The step whose index is looked for
      */
    oStep: IWizardStep): int = js.native
    
    /**
      * Inserts a step into the aggregation {@link #getSteps steps}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def insertStep(
      /**
      * The step to insert; if empty, nothing is inserted
      */
    oStep: IWizardStep,
      /**
      * The `0`-based index the step should be inserted at; for a negative value of `iIndex`, the step is inserted
      * at position 0; for a value greater than the current size of the aggregation, the step is inserted at
      * the last position
      */
    iIndex: int
    ): this.type = js.native
    
    /**
      * Removes all the controls from the aggregation {@link #getSteps steps}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllSteps(): js.Array[IWizardStep] = js.native
    
    def removeStep(/**
      * The step to remove or its index or id
      */
    vStep: String): IWizardStep | Null = js.native
    /**
      * Removes a step from the aggregation {@link #getSteps steps}.
      *
      * @returns The removed step or `null`
      */
    def removeStep(/**
      * The step to remove or its index or id
      */
    vStep: int): IWizardStep | Null = js.native
    def removeStep(/**
      * The step to remove or its index or id
      */
    vStep: IWizardStep): IWizardStep | Null = js.native
    
    /**
      * Sets a new value for property {@link #getHeight height}.
      *
      * Defines the height of the control
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setHeight(/**
      * New value for property `height`
      */
    sHeight: CSSSize): this.type = js.native
  }
  
  trait WizardSettings
    extends StObject
       with ControlSettings {
    
    /**
      * Defines the height of the control
      */
    var height: js.UndefOr[
        CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Fired when the step is changed by user interaction - either with scrolling, or by clicking on the steps
      * within the component header.
      */
    var stepChange: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * Defines the steps.
      *
      *  **Note:** Use the available `sap.ui.webc.fiori.WizardStep` component.
      */
    var steps: js.UndefOr[
        js.Array[IWizardStep] | IWizardStep | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
  }
  object WizardSettings {
    
    inline def apply(): WizardSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WizardSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WizardSettings] (val x: Self) extends AnyVal {
      
      inline def setHeight(value: CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setStepChange(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "stepChange", js.Any.fromFunction1(value))
      
      inline def setStepChangeUndefined: Self = StObject.set(x, "stepChange", js.undefined)
      
      inline def setSteps(
        value: js.Array[IWizardStep] | IWizardStep | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "steps", value.asInstanceOf[js.Any])
      
      inline def setStepsUndefined: Self = StObject.set(x, "steps", js.undefined)
      
      inline def setStepsVarargs(value: IWizardStep*): Self = StObject.set(x, "steps", js.Array(value*))
    }
  }
}
