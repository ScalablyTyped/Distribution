package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.AggregationBindingInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreElementMod.ElementSettings
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiCommonsRoadMapStepMod {
  
  @JSImport("sap/ui/commons/RoadMapStep", JSImport.Default)
  @js.native
  /**
    * Constructor for a new RoadMapStep.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends RoadMapStep {
    def this(/**
      * initial settings for the new control
      */
    mSettings: RoadMapStepSettings) = this()
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
    mSettings: RoadMapStepSettings
    ) = this()
    def this(
      /**
      * id for the new control, generated automatically if no id is given
      */
    sId: Unit,
      /**
      * initial settings for the new control
      */
    mSettings: RoadMapStepSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/commons/RoadMapStep", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.commons.RoadMapStep with name `sClassName` and enriches it with
      * the information contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.ui.core.Element.extend}.
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
    oClassInfo: ClassInfo[T, RoadMapStep]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, RoadMapStep],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.commons.RoadMapStep.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait RoadMapStep
    extends typings.openui5.sapUiCoreElementMod.default {
    
    /**
      * @deprecated (since 1.10.5) - Sub steps will not be supported in future. This feature might be removed
      * in one of the next releases.
      *
      * Adds some subStep to the aggregation {@link #getSubSteps subSteps}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addSubStep(/**
      * The subStep to add; if empty, nothing is inserted
      */
    oSubStep: RoadMapStep): this.type = js.native
    
    /**
      * @deprecated (since 1.10.5) - Sub steps will not be supported in future. This feature might be removed
      * in one of the next releases.
      *
      * Destroys all the subSteps in the aggregation {@link #getSubSteps subSteps}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroySubSteps(): this.type = js.native
    
    /**
      * Gets current value of property {@link #getEnabled enabled}.
      *
      * Specifies whether the user shall be allowed to click a step, or not
      *
      * Default value is `true`.
      *
      * @returns Value of property `enabled`
      */
    def getEnabled(): Boolean = js.native
    
    /**
      * @deprecated (since 1.10.5) - Note that sub steps will not be supported in future. This feature might
      * be removed in one of the next releases.
      *
      * Gets current value of property {@link #getExpanded expanded}.
      *
      * This property is only relevant when using sub steps.
      *
      * Default value is `false`.
      *
      * @returns Value of property `expanded`
      */
    def getExpanded(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getLabel label}.
      *
      * Label of the step
      *
      * @returns Value of property `label`
      */
    def getLabel(): String = js.native
    
    /**
      * @deprecated (since 1.10.5) - Sub steps will not be supported in future. This feature might be removed
      * in one of the next releases.
      *
      * Gets content of aggregation {@link #getSubSteps subSteps}.
      *
      * Sub steps for the current step. Will be displayed only in the case that the step is expanded. Otherwise,
      * special arrows show the availability of sub steps. One level of sub steps supported.
      */
    def getSubSteps(): js.Array[RoadMapStep] = js.native
    
    /**
      * Gets current value of property {@link #getVisible visible}.
      *
      * Step is visible
      *
      * Default value is `true`.
      *
      * @returns Value of property `visible`
      */
    def getVisible(): Boolean = js.native
    
    /**
      * @deprecated (since 1.10.5) - Sub steps will not be supported in future. This feature might be removed
      * in one of the next releases.
      *
      * Checks for the provided `sap.ui.commons.RoadMapStep` in the aggregation {@link #getSubSteps subSteps}.
      * and returns its index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfSubStep(/**
      * The subStep whose index is looked for
      */
    oSubStep: RoadMapStep): int = js.native
    
    /**
      * @deprecated (since 1.10.5) - Sub steps will not be supported in future. This feature might be removed
      * in one of the next releases.
      *
      * Inserts a subStep into the aggregation {@link #getSubSteps subSteps}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def insertSubStep(
      /**
      * The subStep to insert; if empty, nothing is inserted
      */
    oSubStep: RoadMapStep,
      /**
      * The `0`-based index the subStep should be inserted at; for a negative value of `iIndex`, the subStep
      * is inserted at position 0; for a value greater than the current size of the aggregation, the subStep
      * is inserted at the last position
      */
    iIndex: int
    ): this.type = js.native
    
    /**
      * @deprecated (since 1.10.5) - Sub steps will not be supported in future. This feature might be removed
      * in one of the next releases.
      *
      * Removes all the controls from the aggregation {@link #getSubSteps subSteps}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllSubSteps(): js.Array[RoadMapStep] = js.native
    
    def removeSubStep(/**
      * The subStep to remove or its index or id
      */
    vSubStep: String): RoadMapStep | Null = js.native
    /**
      * @deprecated (since 1.10.5) - Sub steps will not be supported in future. This feature might be removed
      * in one of the next releases.
      *
      * Removes a subStep from the aggregation {@link #getSubSteps subSteps}.
      *
      * @returns The removed subStep or `null`
      */
    def removeSubStep(/**
      * The subStep to remove or its index or id
      */
    vSubStep: int): RoadMapStep | Null = js.native
    def removeSubStep(/**
      * The subStep to remove or its index or id
      */
    vSubStep: RoadMapStep): RoadMapStep | Null = js.native
    
    /**
      * Sets a new value for property {@link #getEnabled enabled}.
      *
      * Specifies whether the user shall be allowed to click a step, or not
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setEnabled(): this.type = js.native
    def setEnabled(/**
      * New value for property `enabled`
      */
    bEnabled: Boolean): this.type = js.native
    
    /**
      * @deprecated (since 1.10.5) - Note that sub steps will not be supported in future. This feature might
      * be removed in one of the next releases.
      *
      * Sets a new value for property {@link #getExpanded expanded}.
      *
      * This property is only relevant when using sub steps.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setExpanded(): this.type = js.native
    def setExpanded(/**
      * New value for property `expanded`
      */
    bExpanded: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getLabel label}.
      *
      * Label of the step
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setLabel(): this.type = js.native
    def setLabel(/**
      * New value for property `label`
      */
    sLabel: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getVisible visible}.
      *
      * Step is visible
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setVisible(): this.type = js.native
    def setVisible(/**
      * New value for property `visible`
      */
    bVisible: Boolean): this.type = js.native
  }
  
  trait RoadMapStepSettings
    extends StObject
       with ElementSettings {
    
    /**
      * Specifies whether the user shall be allowed to click a step, or not
      */
    var enabled: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @deprecated (since 1.10.5) - Note that sub steps will not be supported in future. This feature might
      * be removed in one of the next releases.
      *
      * This property is only relevant when using sub steps.
      */
    var expanded: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Label of the step
      */
    var label: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * @deprecated (since 1.10.5) - Sub steps will not be supported in future. This feature might be removed
      * in one of the next releases.
      *
      * Sub steps for the current step. Will be displayed only in the case that the step is expanded. Otherwise,
      * special arrows show the availability of sub steps. One level of sub steps supported.
      */
    var subSteps: js.UndefOr[
        js.Array[RoadMapStep] | RoadMapStep | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Step is visible
      */
    var visible: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
  }
  object RoadMapStepSettings {
    
    inline def apply(): RoadMapStepSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RoadMapStepSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RoadMapStepSettings] (val x: Self) extends AnyVal {
      
      inline def setEnabled(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      inline def setExpanded(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "expanded", value.asInstanceOf[js.Any])
      
      inline def setExpandedUndefined: Self = StObject.set(x, "expanded", js.undefined)
      
      inline def setLabel(value: String | PropertyBindingInfo): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setSubSteps(
        value: js.Array[RoadMapStep] | RoadMapStep | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "subSteps", value.asInstanceOf[js.Any])
      
      inline def setSubStepsUndefined: Self = StObject.set(x, "subSteps", js.undefined)
      
      inline def setSubStepsVarargs(value: RoadMapStep*): Self = StObject.set(x, "subSteps", js.Array(value*))
      
      inline def setVisible(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    }
  }
}
