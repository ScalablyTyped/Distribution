package typings.openui5

import typings.openui5.anon.StepId
import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.AggregationBindingInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreControlMod.ControlSettings
import typings.openui5.sapUiCoreLibraryMod.CSSSize
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiCommonsRoadMapMod {
  
  @JSImport("sap/ui/commons/RoadMap", JSImport.Default)
  @js.native
  /**
    * Constructor for a new RoadMap.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends RoadMap {
    def this(/**
      * Initial settings for the new control
      */
    mSettings: RoadMapSettings) = this()
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
    mSettings: RoadMapSettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new control
      */
    mSettings: RoadMapSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/commons/RoadMap", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.commons.RoadMap with name `sClassName` and enriches it with the
      * information contained in `oClassInfo`.
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
    oClassInfo: ClassInfo[T, RoadMap]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, RoadMap],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.commons.RoadMap.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait RoadMap
    extends typings.openui5.sapUiCoreControlMod.default {
    
    /**
      * Adds some step to the aggregation {@link #getSteps steps}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addStep(
      /**
      * The step to add; if empty, nothing is inserted
      */
    oStep: typings.openui5.sapUiCommonsRoadMapStepMod.default
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:stepExpanded stepExpanded} event of this `sap.ui.commons.RoadMap`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.commons.RoadMap` itself.
      *
      * Event is fired when a given step is expanded or collapsed by user.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachStepExpanded(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachStepExpanded(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.commons.RoadMap` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:stepExpanded stepExpanded} event of this `sap.ui.commons.RoadMap`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.commons.RoadMap` itself.
      *
      * Event is fired when a given step is expanded or collapsed by user.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachStepExpanded(
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
    def attachStepExpanded(
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
      * Context object to call the event handler with. Defaults to this `sap.ui.commons.RoadMap` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:stepSelected stepSelected} event of this `sap.ui.commons.RoadMap`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.commons.RoadMap` itself.
      *
      * Event is fired when the user selects a step.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachStepSelected(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachStepSelected(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.commons.RoadMap` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:stepSelected stepSelected} event of this `sap.ui.commons.RoadMap`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.commons.RoadMap` itself.
      *
      * Event is fired when the user selects a step.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachStepSelected(
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
    def attachStepSelected(
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
      * Context object to call the event handler with. Defaults to this `sap.ui.commons.RoadMap` itself
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
      * Detaches event handler `fnFunction` from the {@link #event:stepExpanded stepExpanded} event of this `sap.ui.commons.RoadMap`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachStepExpanded(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachStepExpanded(
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
      * Detaches event handler `fnFunction` from the {@link #event:stepSelected stepSelected} event of this `sap.ui.commons.RoadMap`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachStepSelected(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachStepSelected(
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
      * Fires event {@link #event:stepExpanded stepExpanded} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireStepExpanded(): this.type = js.native
    def fireStepExpanded(/**
      * Parameters to pass along with the event
      */
    mParameters: StepId): this.type = js.native
    
    /**
      * Fires event {@link #event:stepSelected stepSelected} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireStepSelected(): this.type = js.native
    def fireStepSelected(/**
      * Parameters to pass along with the event
      */
    mParameters: StepId): this.type = js.native
    
    /**
      * Gets current value of property {@link #getFirstVisibleStep firstVisibleStep}.
      *
      * ID of the first step to be displayed
      *
      * @returns Value of property `firstVisibleStep`
      */
    def getFirstVisibleStep(): String = js.native
    
    /**
      * Gets current value of property {@link #getNumberOfVisibleSteps numberOfVisibleSteps}.
      *
      * Total number of steps to be displayed at once
      *
      * @returns Value of property `numberOfVisibleSteps`
      */
    def getNumberOfVisibleSteps(): int = js.native
    
    /**
      * Gets current value of property {@link #getSelectedStep selectedStep}.
      *
      * ID of the step which is currently selected
      *
      * @returns Value of property `selectedStep`
      */
    def getSelectedStep(): String = js.native
    
    /**
      * Gets content of aggregation {@link #getSteps steps}.
      *
      * Steps that are composing the RoadMap
      */
    def getSteps(): js.Array[typings.openui5.sapUiCommonsRoadMapStepMod.default] = js.native
    
    /**
      * Gets current value of property {@link #getWidth width}.
      *
      * Determines the control width in CSS size
      *
      * Default value is `'100%'`.
      *
      * @returns Value of property `width`
      */
    def getWidth(): CSSSize = js.native
    
    /**
      * Checks for the provided `sap.ui.commons.RoadMapStep` in the aggregation {@link #getSteps steps}. and
      * returns its index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfStep(
      /**
      * The step whose index is looked for
      */
    oStep: typings.openui5.sapUiCommonsRoadMapStepMod.default
    ): int = js.native
    
    /**
      * Inserts a step into the aggregation {@link #getSteps steps}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def insertStep(
      /**
      * The step to insert; if empty, nothing is inserted
      */
    oStep: typings.openui5.sapUiCommonsRoadMapStepMod.default,
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
    def removeAllSteps(): js.Array[typings.openui5.sapUiCommonsRoadMapStepMod.default] = js.native
    
    def removeStep(/**
      * The step to remove or its index or id
      */
    vStep: String): typings.openui5.sapUiCommonsRoadMapStepMod.default | Null = js.native
    /**
      * Removes a step from the aggregation {@link #getSteps steps}.
      *
      * @returns The removed step or `null`
      */
    def removeStep(/**
      * The step to remove or its index or id
      */
    vStep: int): typings.openui5.sapUiCommonsRoadMapStepMod.default | Null = js.native
    def removeStep(
      /**
      * The step to remove or its index or id
      */
    vStep: typings.openui5.sapUiCommonsRoadMapStepMod.default
    ): typings.openui5.sapUiCommonsRoadMapStepMod.default | Null = js.native
    
    /**
      * Sets a new value for property {@link #getFirstVisibleStep firstVisibleStep}.
      *
      * ID of the first step to be displayed
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setFirstVisibleStep(): this.type = js.native
    def setFirstVisibleStep(/**
      * New value for property `firstVisibleStep`
      */
    sFirstVisibleStep: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getNumberOfVisibleSteps numberOfVisibleSteps}.
      *
      * Total number of steps to be displayed at once
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setNumberOfVisibleSteps(): this.type = js.native
    def setNumberOfVisibleSteps(/**
      * New value for property `numberOfVisibleSteps`
      */
    iNumberOfVisibleSteps: int): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getSelectedStep selectedStep}.
      *
      * ID of the step which is currently selected
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setSelectedStep(): this.type = js.native
    def setSelectedStep(/**
      * New value for property `selectedStep`
      */
    sSelectedStep: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getWidth width}.
      *
      * Determines the control width in CSS size
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `'100%'`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setWidth(): this.type = js.native
    def setWidth(/**
      * New value for property `width`
      */
    sWidth: CSSSize): this.type = js.native
  }
  
  trait RoadMapSettings
    extends StObject
       with ControlSettings {
    
    /**
      * ID of the first step to be displayed
      */
    var firstVisibleStep: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Total number of steps to be displayed at once
      */
    var numberOfVisibleSteps: js.UndefOr[int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * ID of the step which is currently selected
      */
    var selectedStep: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Event is fired when a given step is expanded or collapsed by user.
      */
    var stepExpanded: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * Event is fired when the user selects a step.
      */
    var stepSelected: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * Steps that are composing the RoadMap
      */
    var steps: js.UndefOr[
        js.Array[typings.openui5.sapUiCommonsRoadMapStepMod.default] | typings.openui5.sapUiCommonsRoadMapStepMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Determines the control width in CSS size
      */
    var width: js.UndefOr[
        CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
  }
  object RoadMapSettings {
    
    inline def apply(): RoadMapSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RoadMapSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RoadMapSettings] (val x: Self) extends AnyVal {
      
      inline def setFirstVisibleStep(value: String | PropertyBindingInfo): Self = StObject.set(x, "firstVisibleStep", value.asInstanceOf[js.Any])
      
      inline def setFirstVisibleStepUndefined: Self = StObject.set(x, "firstVisibleStep", js.undefined)
      
      inline def setNumberOfVisibleSteps(value: int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "numberOfVisibleSteps", value.asInstanceOf[js.Any])
      
      inline def setNumberOfVisibleStepsUndefined: Self = StObject.set(x, "numberOfVisibleSteps", js.undefined)
      
      inline def setSelectedStep(value: String | PropertyBindingInfo): Self = StObject.set(x, "selectedStep", value.asInstanceOf[js.Any])
      
      inline def setSelectedStepUndefined: Self = StObject.set(x, "selectedStep", js.undefined)
      
      inline def setStepExpanded(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "stepExpanded", js.Any.fromFunction1(value))
      
      inline def setStepExpandedUndefined: Self = StObject.set(x, "stepExpanded", js.undefined)
      
      inline def setStepSelected(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "stepSelected", js.Any.fromFunction1(value))
      
      inline def setStepSelectedUndefined: Self = StObject.set(x, "stepSelected", js.undefined)
      
      inline def setSteps(
        value: js.Array[typings.openui5.sapUiCommonsRoadMapStepMod.default] | typings.openui5.sapUiCommonsRoadMapStepMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "steps", value.asInstanceOf[js.Any])
      
      inline def setStepsUndefined: Self = StObject.set(x, "steps", js.undefined)
      
      inline def setStepsVarargs(value: typings.openui5.sapUiCommonsRoadMapStepMod.default*): Self = StObject.set(x, "steps", js.Array(value*))
      
      inline def setWidth(value: CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
