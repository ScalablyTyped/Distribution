package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.AggregationBindingInfo
import typings.openui5.sapUiMdcFieldFieldBaseMod.FieldBaseSettings
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiMdcMultiValueFieldMod {
  
  @JSImport("sap/ui/mdc/MultiValueField", JSImport.Default)
  @js.native
  /**
    * Constructor for a new `MultiValueField` control.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends MultiValueField {
    def this(/**
      * Initial settings for the new control
      */
    mSettings: MultiValueFieldSettings) = this()
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
    mSettings: MultiValueFieldSettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new control
      */
    mSettings: MultiValueFieldSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/mdc/MultiValueField", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.mdc.MultiValueField with name `sClassName` and enriches it with
      * the information contained in `oClassInfo`.
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
    oClassInfo: ClassInfo[T, MultiValueField]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, MultiValueField],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.mdc.MultiValueField.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait MultiValueField
    extends typings.openui5.sapUiMdcFieldFieldBaseMod.default {
    
    /**
      * Adds some item to the aggregation {@link #getItems items}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addItem(
      /**
      * The item to add; if empty, nothing is inserted
      */
    oItem: typings.openui5.sapUiMdcFieldMultiValueFieldItemMod.default
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:change change} event of this `sap.ui.mdc.MultiValueField`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.mdc.MultiValueField` itself.
      *
      * This event is fired when the `items` aggregation of the field is changed by user interaction.
      *
      * **Note** This event is only triggered if the used content control has a change event.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachChange(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ MultiValueFieldChangeEvent, Unit]
    ): this.type = js.native
    def attachChange(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ MultiValueFieldChangeEvent, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.mdc.MultiValueField` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:change change} event of this `sap.ui.mdc.MultiValueField`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.mdc.MultiValueField` itself.
      *
      * This event is fired when the `items` aggregation of the field is changed by user interaction.
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
    fnFunction: js.Function1[/* p1 */ MultiValueFieldChangeEvent, Unit]
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
    fnFunction: js.Function1[/* p1 */ MultiValueFieldChangeEvent, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.mdc.MultiValueField` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Binds aggregation {@link #getItems items} to model data.
      *
      * See {@link sap.ui.base.ManagedObject#bindAggregation ManagedObject.bindAggregation} for a detailed description
      * of the possible properties of `oBindingInfo`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def bindItems(/**
      * The binding information
      */
    oBindingInfo: AggregationBindingInfo): this.type = js.native
    
    /**
      * Destroys all the items in the aggregation {@link #getItems items}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyItems(): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:change change} event of this `sap.ui.mdc.MultiValueField`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachChange(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ MultiValueFieldChangeEvent, Unit]
    ): this.type = js.native
    def detachChange(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ MultiValueFieldChangeEvent, Unit],
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
    mParameters: MultiValueField$ChangeEventParameters
    ): this.type = js.native
    
    /**
      * Gets content of aggregation {@link #getItems items}.
      *
      * Items of the `MultiValueField` control.
      */
    def getItems(): js.Array[typings.openui5.sapUiMdcFieldMultiValueFieldItemMod.default] = js.native
    
    /**
      * Checks for the provided `sap.ui.mdc.field.MultiValueFieldItem` in the aggregation {@link #getItems items}.
      * and returns its index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfItem(
      /**
      * The item whose index is looked for
      */
    oItem: typings.openui5.sapUiMdcFieldMultiValueFieldItemMod.default
    ): int = js.native
    
    /**
      * Inserts a item into the aggregation {@link #getItems items}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def insertItem(
      /**
      * The item to insert; if empty, nothing is inserted
      */
    oItem: typings.openui5.sapUiMdcFieldMultiValueFieldItemMod.default,
      /**
      * The `0`-based index the item should be inserted at; for a negative value of `iIndex`, the item is inserted
      * at position 0; for a value greater than the current size of the aggregation, the item is inserted at
      * the last position
      */
    iIndex: int
    ): this.type = js.native
    
    /**
      * Removes all the controls from the aggregation {@link #getItems items}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllItems(): js.Array[typings.openui5.sapUiMdcFieldMultiValueFieldItemMod.default] = js.native
    
    def removeItem(/**
      * The item to remove or its index or id
      */
    vItem: String): typings.openui5.sapUiMdcFieldMultiValueFieldItemMod.default | Null = js.native
    /**
      * Removes a item from the aggregation {@link #getItems items}.
      *
      * @returns The removed item or `null`
      */
    def removeItem(/**
      * The item to remove or its index or id
      */
    vItem: int): typings.openui5.sapUiMdcFieldMultiValueFieldItemMod.default | Null = js.native
    def removeItem(
      /**
      * The item to remove or its index or id
      */
    vItem: typings.openui5.sapUiMdcFieldMultiValueFieldItemMod.default
    ): typings.openui5.sapUiMdcFieldMultiValueFieldItemMod.default | Null = js.native
    
    /**
      * Unbinds aggregation {@link #getItems items} from model data.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def unbindItems(): this.type = js.native
  }
  
  trait MultiValueField$ChangeEventParameters extends StObject {
    
    /**
      * The new items of the `MultiValueField` control.
      *
      * If a `ValueHelp` element is assigned to the `MultiValueField` control, the `key` of the items is used
      * as key for the `ValueHelp` items.
      */
    var items: js.UndefOr[js.Array[typings.openui5.sapUiMdcFieldMultiValueFieldItemMod.default]] = js.undefined
    
    /**
      * Returns a `Promise` for the change. The `Promise` returns the items when it is resolved. If the `change`
      * event is synchronous, the promise has already been resolved. If it is asynchronous, it will be resolved
      * after the items have been updated.
      *
      * The `MultiValueField` control should be set to busy during the parsing to prevent user input. As there
      * might be a whole group of fields that need to be busy, this cannot be done automatically.
      */
    var promise: js.UndefOr[js.Promise[Any]] = js.undefined
    
    /**
      * Flag that indicates if the entered user input is valid
      */
    var valid: js.UndefOr[Boolean] = js.undefined
  }
  object MultiValueField$ChangeEventParameters {
    
    inline def apply(): MultiValueField$ChangeEventParameters = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MultiValueField$ChangeEventParameters]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MultiValueField$ChangeEventParameters] (val x: Self) extends AnyVal {
      
      inline def setItems(value: js.Array[typings.openui5.sapUiMdcFieldMultiValueFieldItemMod.default]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
      
      inline def setItemsVarargs(value: typings.openui5.sapUiMdcFieldMultiValueFieldItemMod.default*): Self = StObject.set(x, "items", js.Array(value*))
      
      inline def setPromise(value: js.Promise[Any]): Self = StObject.set(x, "promise", value.asInstanceOf[js.Any])
      
      inline def setPromiseUndefined: Self = StObject.set(x, "promise", js.undefined)
      
      inline def setValid(value: Boolean): Self = StObject.set(x, "valid", value.asInstanceOf[js.Any])
      
      inline def setValidUndefined: Self = StObject.set(x, "valid", js.undefined)
    }
  }
  
  type MultiValueFieldChangeEvent = typings.openui5.sapUiBaseEventMod.default[MultiValueField$ChangeEventParameters]
  
  type MultiValueFieldChangeEventParameters = MultiValueField$ChangeEventParameters
  
  trait MultiValueFieldSettings
    extends StObject
       with FieldBaseSettings {
    
    /**
      * This event is fired when the `items` aggregation of the field is changed by user interaction.
      *
      * **Note** This event is only triggered if the used content control has a change event.
      */
    var change: js.UndefOr[
        js.Function1[
          /* oEvent */ typings.openui5.sapUiBaseEventMod.default[MultiValueField$ChangeEventParameters], 
          Unit
        ]
      ] = js.undefined
    
    /**
      * Items of the `MultiValueField` control.
      */
    var items: js.UndefOr[
        js.Array[typings.openui5.sapUiMdcFieldMultiValueFieldItemMod.default] | typings.openui5.sapUiMdcFieldMultiValueFieldItemMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
  }
  object MultiValueFieldSettings {
    
    inline def apply(): MultiValueFieldSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MultiValueFieldSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MultiValueFieldSettings] (val x: Self) extends AnyVal {
      
      inline def setChange(
        value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default[MultiValueField$ChangeEventParameters] => Unit
      ): Self = StObject.set(x, "change", js.Any.fromFunction1(value))
      
      inline def setChangeUndefined: Self = StObject.set(x, "change", js.undefined)
      
      inline def setItems(
        value: js.Array[typings.openui5.sapUiMdcFieldMultiValueFieldItemMod.default] | typings.openui5.sapUiMdcFieldMultiValueFieldItemMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
      
      inline def setItemsVarargs(value: typings.openui5.sapUiMdcFieldMultiValueFieldItemMod.default*): Self = StObject.set(x, "items", js.Array(value*))
    }
  }
}
