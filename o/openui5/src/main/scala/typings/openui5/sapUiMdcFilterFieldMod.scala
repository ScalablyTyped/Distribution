package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiMdcFieldFieldBaseMod.FieldBaseSettings
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiMdcFilterFieldMod {
  
  @JSImport("sap/ui/mdc/FilterField", JSImport.Default)
  @js.native
  /**
    * Constructor for a new `FilterField`.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends FilterField {
    def this(/**
      * Initial settings for the new control
      */
    mSettings: FilterFieldSettings) = this()
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
    mSettings: FilterFieldSettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new control
      */
    mSettings: FilterFieldSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/mdc/FilterField", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.mdc.FilterField with name `sClassName` and enriches it with the
      * information contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.ui.mdc.field.FieldBase.extend}.
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
    oClassInfo: ClassInfo[T, FilterField]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, FilterField],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.mdc.FilterField.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait FilterField
    extends typings.openui5.sapUiMdcFieldFieldBaseMod.default {
    
    def addOperator(/**
      * The operator instance or operator name
      */
    vOperator: String): this.type = js.native
    /**
      * Adds an operator to the list of known operators.
      *
      * **Note**: If no operator is set, the used `datatType` of the `FilterField` defines the set of default
      * operators.
      *
      * @returns Reference to `this` to allow method chaining
      */
    def addOperator(
      /**
      * The operator instance or operator name
      */
    vOperator: typings.openui5.sapUiMdcConditionOperatorMod.default
    ): this.type = js.native
    
    /**
      * Adds an array of operators to the list of known operators.
      *
      * **Note**: `aOperators` can be the name of an {@link sap.ui.mdc.condition.Operator Operator}, the instance
      * itself, or multiple operators inside an array.
      *
      * @returns Reference to `this` to allow method chaining
      */
    def addOperators(
      /**
      * Array of operators
      */
    aOperators: js.Array[typings.openui5.sapUiMdcConditionOperatorMod.default]
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:change change} event of this `sap.ui.mdc.FilterField`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.mdc.FilterField` itself.
      *
      * This event is fired when the `value` property of the field is changed.
      *
      * **Note** This event is only triggered if the used content control has a change event.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachChange(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ FilterFieldChangeEvent, Unit]
    ): this.type = js.native
    def attachChange(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ FilterFieldChangeEvent, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.mdc.FilterField` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:change change} event of this `sap.ui.mdc.FilterField`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.mdc.FilterField` itself.
      *
      * This event is fired when the `value` property of the field is changed.
      *
      * **Note** This event is only triggered if the used content control has a change event.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachChange(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ FilterFieldChangeEvent, Unit]
    ): this.type = js.native
    def attachChange(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ FilterFieldChangeEvent, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.mdc.FilterField` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:change change} event of this `sap.ui.mdc.FilterField`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachChange(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ FilterFieldChangeEvent, Unit]
    ): this.type = js.native
    def detachChange(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ FilterFieldChangeEvent, Unit],
      /**
      * Context object on which the given function had to be called
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Fires event {@link #event:change change} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireChange(): this.type = js.native
    def fireChange(
      /**
      * Parameters to pass along with the event
      */
    mParameters: FilterField$ChangeEventParameters
    ): this.type = js.native
    
    /**
      * @since 1.88.0
      *
      * Gets current value of property {@link #getDefaultOperator defaultOperator}.
      *
      * Default operator name for conditions. If empty, the relevant default operator depending on the data type
      * used is taken.
      *
      * **Note**: `defaultOperator` can be the name of an {@link sap.ui.mdc.condition.Operator Operator} or the
      * instance itself.
      *
      * @returns Value of property `defaultOperator`
      */
    def getDefaultOperator(): String = js.native
    
    /**
      * @since 1.73.0
      *
      * Gets current value of property {@link #getOperators operators}.
      *
      * Supported operator names for conditions.
      *
      * If empty, default operators depending on used data type are used.
      *
      * Default value is `[]`.
      *
      * @returns Value of property `operators`
      */
    def getOperators(): js.Array[String] = js.native
    
    /**
      * @since 1.115.0
      *
      * Gets current value of property {@link #getPropertyKey propertyKey}.
      *
      * Key of the property the `FilterField` represents.
      *
      * Default value is `empty string`.
      *
      * @returns Value of property `propertyKey`
      */
    def getPropertyKey(): String = js.native
    
    /**
      * Removes all operators from the list of known operators.
      */
    def removeAllOperators(): Unit = js.native
    
    def removeOperator(/**
      * The operator instance or operator name
      */
    vOperator: String): Unit = js.native
    /**
      * Removes an operator from the list of known operators.
      */
    def removeOperator(
      /**
      * The operator instance or operator name
      */
    vOperator: typings.openui5.sapUiMdcConditionOperatorMod.default
    ): Unit = js.native
    
    /**
      * Removes all given operators from the list of known operators.
      *
      * **Note**: `aOperators` can be the name of an {@link sap.ui.mdc.condition.Operator Operator}, the instance
      * itself, or multiple operators inside an array.
      */
    def removeOperators(
      /**
      * Array of operators
      */
    aOperators: js.Array[typings.openui5.sapUiMdcConditionOperatorMod.default]
    ): Unit = js.native
    
    /**
      * @since 1.88.0
      *
      * Sets a new value for property {@link #getDefaultOperator defaultOperator}.
      *
      * Default operator name for conditions. If empty, the relevant default operator depending on the data type
      * used is taken.
      *
      * **Note**: `defaultOperator` can be the name of an {@link sap.ui.mdc.condition.Operator Operator} or the
      * instance itself.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setDefaultOperator(): this.type = js.native
    def setDefaultOperator(/**
      * New value for property `defaultOperator`
      */
    sDefaultOperator: String): this.type = js.native
    
    /**
      * @since 1.73.0
      *
      * Sets a new value for property {@link #getOperators operators}.
      *
      * Supported operator names for conditions.
      *
      * If empty, default operators depending on used data type are used.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `[]`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setOperators(): this.type = js.native
    def setOperators(/**
      * New value for property `operators`
      */
    sOperators: js.Array[String]): this.type = js.native
    
    /**
      * @since 1.115.0
      *
      * Sets a new value for property {@link #getPropertyKey propertyKey}.
      *
      * Key of the property the `FilterField` represents.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `empty string`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setPropertyKey(): this.type = js.native
    def setPropertyKey(/**
      * New value for property `propertyKey`
      */
    sPropertyKey: String): this.type = js.native
  }
  
  trait FilterField$ChangeEventParameters extends StObject {
    
    /**
      * Conditions of the field. This includes all conditions, not only the changed ones.
      *
      * **Note:** A condition must have the structure of {@link sap.ui.mdc.condition.ConditionObject ConditionObject}.
      */
    var conditions: js.UndefOr[js.Array[js.Object]] = js.undefined
    
    /**
      * Returns a `Promise` for the change. The `Promise` returns the value if it is resolved. If the `change`
      * event is synchronous, the promise has already been already resolved. If it is asynchronous, it will be
      * resolved after the value has been updated.
      *
      * The `FilterField` should be set to busy during the parsing to prevent user input. As there might be a
      * whole group of fields that needs to be busy, this cannot be done automatically.
      */
    var promise: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Flag that indicates if the entered `value` is valid
      */
    var valid: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The new value of the `control`
      */
    var value: js.UndefOr[String] = js.undefined
  }
  object FilterField$ChangeEventParameters {
    
    inline def apply(): FilterField$ChangeEventParameters = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FilterField$ChangeEventParameters]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FilterField$ChangeEventParameters] (val x: Self) extends AnyVal {
      
      inline def setConditions(value: js.Array[js.Object]): Self = StObject.set(x, "conditions", value.asInstanceOf[js.Any])
      
      inline def setConditionsUndefined: Self = StObject.set(x, "conditions", js.undefined)
      
      inline def setConditionsVarargs(value: js.Object*): Self = StObject.set(x, "conditions", js.Array(value*))
      
      inline def setPromise(value: Boolean): Self = StObject.set(x, "promise", value.asInstanceOf[js.Any])
      
      inline def setPromiseUndefined: Self = StObject.set(x, "promise", js.undefined)
      
      inline def setValid(value: Boolean): Self = StObject.set(x, "valid", value.asInstanceOf[js.Any])
      
      inline def setValidUndefined: Self = StObject.set(x, "valid", js.undefined)
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  type FilterFieldChangeEvent = typings.openui5.sapUiBaseEventMod.default[FilterField$ChangeEventParameters]
  
  type FilterFieldChangeEventParameters = FilterField$ChangeEventParameters
  
  trait FilterFieldSettings
    extends StObject
       with FieldBaseSettings {
    
    /**
      * This event is fired when the `value` property of the field is changed.
      *
      * **Note** This event is only triggered if the used content control has a change event.
      */
    var change: js.UndefOr[
        js.Function1[
          /* oEvent */ typings.openui5.sapUiBaseEventMod.default[FilterField$ChangeEventParameters], 
          Unit
        ]
      ] = js.undefined
    
    /**
      * @since 1.88.0
      *
      * Default operator name for conditions. If empty, the relevant default operator depending on the data type
      * used is taken.
      *
      * **Note**: `defaultOperator` can be the name of an {@link sap.ui.mdc.condition.Operator Operator} or the
      * instance itself.
      */
    var defaultOperator: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * @since 1.73.0
      *
      * Supported operator names for conditions.
      *
      * If empty, default operators depending on used data type are used.
      */
    var operators: js.UndefOr[
        js.Array[String] | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @since 1.115.0
      *
      * Key of the property the `FilterField` represents.
      */
    var propertyKey: js.UndefOr[String | PropertyBindingInfo] = js.undefined
  }
  object FilterFieldSettings {
    
    inline def apply(): FilterFieldSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FilterFieldSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FilterFieldSettings] (val x: Self) extends AnyVal {
      
      inline def setChange(
        value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default[FilterField$ChangeEventParameters] => Unit
      ): Self = StObject.set(x, "change", js.Any.fromFunction1(value))
      
      inline def setChangeUndefined: Self = StObject.set(x, "change", js.undefined)
      
      inline def setDefaultOperator(value: String | PropertyBindingInfo): Self = StObject.set(x, "defaultOperator", value.asInstanceOf[js.Any])
      
      inline def setDefaultOperatorUndefined: Self = StObject.set(x, "defaultOperator", js.undefined)
      
      inline def setOperators(
        value: js.Array[String] | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "operators", value.asInstanceOf[js.Any])
      
      inline def setOperatorsUndefined: Self = StObject.set(x, "operators", js.undefined)
      
      inline def setOperatorsVarargs(value: String*): Self = StObject.set(x, "operators", js.Array(value*))
      
      inline def setPropertyKey(value: String | PropertyBindingInfo): Self = StObject.set(x, "propertyKey", value.asInstanceOf[js.Any])
      
      inline def setPropertyKeyUndefined: Self = StObject.set(x, "propertyKey", js.undefined)
    }
  }
}
