package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiMdcFieldFieldBaseMod.FieldBaseSettings
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiMdcFieldMod {
  
  @JSImport("sap/ui/mdc/Field", JSImport.Default)
  @js.native
  /**
    * Constructor for a new `Field`.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends Field {
    def this(/**
      * Initial settings for the new control
      */
    mSettings: FieldSettings) = this()
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
    mSettings: FieldSettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new control
      */
    mSettings: FieldSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/mdc/Field", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.mdc.Field with name `sClassName` and enriches it with the information
      * contained in `oClassInfo`.
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
    oClassInfo: ClassInfo[T, Field]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, Field],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.mdc.Field.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait Field
    extends typings.openui5.sapUiMdcFieldFieldBaseMod.default {
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:change change} event of this `sap.ui.mdc.Field`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.mdc.Field` itself.
      *
      * This event is fired when the `value` property of the field is changed by user interaction.
      *
      * **Note** This event is only triggered if the used content control has a change event.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachChange(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ FieldChangeEvent, Unit]
    ): this.type = js.native
    def attachChange(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ FieldChangeEvent, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.mdc.Field` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:change change} event of this `sap.ui.mdc.Field`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.mdc.Field` itself.
      *
      * This event is fired when the `value` property of the field is changed by user interaction.
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
    fnFunction: js.Function1[/* p1 */ FieldChangeEvent, Unit]
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
    fnFunction: js.Function1[/* p1 */ FieldChangeEvent, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.mdc.Field` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Binds property {@link #getAdditionalValue additionalValue} to model data.
      *
      * See {@link sap.ui.base.ManagedObject#bindProperty ManagedObject.bindProperty} for a detailed description
      * of the possible properties of `oBindingInfo`
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def bindAdditionalValue(/**
      * The binding information
      */
    oBindingInfo: PropertyBindingInfo): this.type = js.native
    
    /**
      * Binds property {@link #getValue value} to model data.
      *
      * See {@link sap.ui.base.ManagedObject#bindProperty ManagedObject.bindProperty} for a detailed description
      * of the possible properties of `oBindingInfo`
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def bindValue(/**
      * The binding information
      */
    oBindingInfo: PropertyBindingInfo): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:change change} event of this `sap.ui.mdc.Field`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachChange(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ FieldChangeEvent, Unit]
    ): this.type = js.native
    def detachChange(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ FieldChangeEvent, Unit],
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
    def fireChange(/**
      * Parameters to pass along with the event
      */
    mParameters: Field$ChangeEventParameters): this.type = js.native
    
    /**
      * Gets current value of property {@link #getAdditionalValue additionalValue}.
      *
      * The additional value of the field.
      *
      * To display the key and the description in one field, the description must be set on the `additionalValue`
      * property.
      *
      * @returns Value of property `additionalValue`
      */
    def getAdditionalValue(): Any = js.native
    
    /**
      * Gets current value of property {@link #getValue value}.
      *
      * The value of the field.
      *
      * To display the key and the description in one field, the key must be set on the `value` property.
      *
      * @returns Value of property `value`
      */
    def getValue(): Any = js.native
    
    /**
      * Sets a new value for property {@link #getAdditionalValue additionalValue}.
      *
      * The additional value of the field.
      *
      * To display the key and the description in one field, the description must be set on the `additionalValue`
      * property.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setAdditionalValue(): this.type = js.native
    def setAdditionalValue(/**
      * New value for property `additionalValue`
      */
    oAdditionalValue: Any): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getValue value}.
      *
      * The value of the field.
      *
      * To display the key and the description in one field, the key must be set on the `value` property.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setValue(): this.type = js.native
    def setValue(/**
      * New value for property `value`
      */
    oValue: Any): this.type = js.native
    
    /**
      * Unbinds property {@link #getAdditionalValue additionalValue} from model data.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def unbindAdditionalValue(): this.type = js.native
    
    /**
      * Unbinds property {@link #getValue value} from model data.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def unbindValue(): this.type = js.native
  }
  
  trait Field$ChangeEventParameters extends StObject {
    
    /**
      * Returns a `Promise` for the change. The `Promise` returns the value if it is resolved. If the `change`
      * event is synchronous, the `Promise` has already been already resolved. If it is asynchronous, it will
      * be resolved after the value has been updated.
      *
      * The `Field` should be set to busy during the parsing to prevent user input. As there might be a whole
      * group of fields that needs to be busy, this cannot be done automatically.
      */
    var promise: js.UndefOr[js.Promise[Any]] = js.undefined
    
    /**
      * Flag that indicates if the entered `value` is valid
      */
    var valid: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The new value of the `Field`.
      *
      * If a `ValueHelp` is assigned to the `Field`, the `value` is used as key for the `ValueHelp` items.
      */
    var value: js.UndefOr[String] = js.undefined
  }
  object Field$ChangeEventParameters {
    
    inline def apply(): Field$ChangeEventParameters = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Field$ChangeEventParameters]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Field$ChangeEventParameters] (val x: Self) extends AnyVal {
      
      inline def setPromise(value: js.Promise[Any]): Self = StObject.set(x, "promise", value.asInstanceOf[js.Any])
      
      inline def setPromiseUndefined: Self = StObject.set(x, "promise", js.undefined)
      
      inline def setValid(value: Boolean): Self = StObject.set(x, "valid", value.asInstanceOf[js.Any])
      
      inline def setValidUndefined: Self = StObject.set(x, "valid", js.undefined)
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  type FieldChangeEvent = typings.openui5.sapUiBaseEventMod.default[Field$ChangeEventParameters]
  
  type FieldChangeEventParameters = Field$ChangeEventParameters
  
  trait FieldSettings
    extends StObject
       with FieldBaseSettings {
    
    /**
      * The additional value of the field.
      *
      * To display the key and the description in one field, the description must be set on the `additionalValue`
      * property.
      */
    var additionalValue: js.UndefOr[Any | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * This event is fired when the `value` property of the field is changed by user interaction.
      *
      * **Note** This event is only triggered if the used content control has a change event.
      */
    var change: js.UndefOr[
        js.Function1[
          /* oEvent */ typings.openui5.sapUiBaseEventMod.default[Field$ChangeEventParameters], 
          Unit
        ]
      ] = js.undefined
    
    /**
      * The value of the field.
      *
      * To display the key and the description in one field, the key must be set on the `value` property.
      */
    var value: js.UndefOr[Any | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
  }
  object FieldSettings {
    
    inline def apply(): FieldSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FieldSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FieldSettings] (val x: Self) extends AnyVal {
      
      inline def setAdditionalValue(value: Any | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "additionalValue", value.asInstanceOf[js.Any])
      
      inline def setAdditionalValueUndefined: Self = StObject.set(x, "additionalValue", js.undefined)
      
      inline def setChange(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default[Field$ChangeEventParameters] => Unit): Self = StObject.set(x, "change", js.Any.fromFunction1(value))
      
      inline def setChangeUndefined: Self = StObject.set(x, "change", js.undefined)
      
      inline def setValue(value: Any | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
