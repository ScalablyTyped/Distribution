package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapMP13nPanelMod.P13nPanelSettings
import typings.openui5.sapUiBaseManagedObjectMod.AggregationBindingInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapMP13nDimMeasurePanelMod {
  
  @JSImport("sap/m/P13nDimMeasurePanel", JSImport.Default)
  @js.native
  /**
    * Constructor for a new P13nDimMeasurePanel.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends P13nDimMeasurePanel {
    def this(/**
      * initial settings for the new control
      */
    mSettings: P13nDimMeasurePanelSettings) = this()
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
    mSettings: P13nDimMeasurePanelSettings
    ) = this()
    def this(
      /**
      * id for the new control, generated automatically if no id is given
      */
    sId: Unit,
      /**
      * initial settings for the new control
      */
    mSettings: P13nDimMeasurePanelSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/m/P13nDimMeasurePanel", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.m.P13nDimMeasurePanel with name `sClassName` and enriches it with
      * the information contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.m.P13nPanel.extend}.
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
    oClassInfo: ClassInfo[T, P13nDimMeasurePanel]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, P13nDimMeasurePanel],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.m.P13nDimMeasurePanel.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait P13nDimMeasurePanel
    extends typings.openui5.sapMP13nPanelMod.default {
    
    /**
      * Adds some availableChartType to the aggregation {@link #getAvailableChartTypes availableChartTypes}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addAvailableChartType(
      /**
      * The availableChartType to add; if empty, nothing is inserted
      */
    oAvailableChartType: typings.openui5.sapUiCoreItemMod.default
    ): this.type = js.native
    
    /**
      * Adds some dimMeasureItem to the aggregation {@link #getDimMeasureItems dimMeasureItems}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addDimMeasureItem(
      /**
      * The dimMeasureItem to add; if empty, nothing is inserted
      */
    oDimMeasureItem: typings.openui5.sapMP13nDimMeasureItemMod.default
    ): this.type = js.native
    
    /**
      * @since 1.50.0
      *
      * Attaches event handler `fnFunction` to the {@link #event:changeChartType changeChartType} event of this
      * `sap.m.P13nDimMeasurePanel`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.P13nDimMeasurePanel` itself.
      *
      * Event raised when a `ChartType` has been updated.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachChangeChartType(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit]
    ): this.type = js.native
    def attachChangeChartType(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.P13nDimMeasurePanel` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * @since 1.50.0
      *
      * Attaches event handler `fnFunction` to the {@link #event:changeChartType changeChartType} event of this
      * `sap.m.P13nDimMeasurePanel`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.P13nDimMeasurePanel` itself.
      *
      * Event raised when a `ChartType` has been updated.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachChangeChartType(
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
    def attachChangeChartType(
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
      * Context object to call the event handler with. Defaults to this `sap.m.P13nDimMeasurePanel` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * @since 1.50.0
      *
      * Attaches event handler `fnFunction` to the {@link #event:changeDimMeasureItems changeDimMeasureItems }
      * event of this `sap.m.P13nDimMeasurePanel`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.P13nDimMeasurePanel` itself.
      *
      * Event raised when one or more `DimMeasureItems` has been updated. Aggregation `DimMeasureItems` should
      * be updated outside...
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachChangeDimMeasureItems(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit]
    ): this.type = js.native
    def attachChangeDimMeasureItems(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.P13nDimMeasurePanel` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * @since 1.50.0
      *
      * Attaches event handler `fnFunction` to the {@link #event:changeDimMeasureItems changeDimMeasureItems }
      * event of this `sap.m.P13nDimMeasurePanel`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.P13nDimMeasurePanel` itself.
      *
      * Event raised when one or more `DimMeasureItems` has been updated. Aggregation `DimMeasureItems` should
      * be updated outside...
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachChangeDimMeasureItems(
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
    def attachChangeDimMeasureItems(
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
      * Context object to call the event handler with. Defaults to this `sap.m.P13nDimMeasurePanel` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Binds aggregation {@link #getDimMeasureItems dimMeasureItems} to model data.
      *
      * See {@link sap.ui.base.ManagedObject#bindAggregation ManagedObject.bindAggregation} for a detailed description
      * of the possible properties of `oBindingInfo`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def bindDimMeasureItems(/**
      * The binding information
      */
    oBindingInfo: AggregationBindingInfo): this.type = js.native
    
    /**
      * Destroys all the availableChartTypes in the aggregation {@link #getAvailableChartTypes availableChartTypes}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyAvailableChartTypes(): this.type = js.native
    
    /**
      * Destroys all the dimMeasureItems in the aggregation {@link #getDimMeasureItems dimMeasureItems}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyDimMeasureItems(): this.type = js.native
    
    /**
      * @since 1.50.0
      *
      * Detaches event handler `fnFunction` from the {@link #event:changeChartType changeChartType} event of
      * this `sap.m.P13nDimMeasurePanel`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachChangeChartType(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit]
    ): this.type = js.native
    def detachChangeChartType(
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
      * @since 1.50.0
      *
      * Detaches event handler `fnFunction` from the {@link #event:changeDimMeasureItems changeDimMeasureItems }
      * event of this `sap.m.P13nDimMeasurePanel`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachChangeDimMeasureItems(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit]
    ): this.type = js.native
    def detachChangeDimMeasureItems(
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
      * @since 1.50.0
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Fires event {@link #event:changeChartType changeChartType} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireChangeChartType(): this.type = js.native
    def fireChangeChartType(/**
      * Parameters to pass along with the event
      */
    mParameters: js.Object): this.type = js.native
    
    /**
      * @since 1.50.0
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Fires event {@link #event:changeDimMeasureItems changeDimMeasureItems} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireChangeDimMeasureItems(): this.type = js.native
    def fireChangeDimMeasureItems(/**
      * Parameters to pass along with the event
      */
    mParameters: js.Object): this.type = js.native
    
    /**
      * Gets content of aggregation {@link #getAvailableChartTypes availableChartTypes}.
      *
      * Specifies available chart types.
      */
    def getAvailableChartTypes(): js.Array[typings.openui5.sapUiCoreItemMod.default] = js.native
    
    /**
      * Gets current value of property {@link #getChartTypeKey chartTypeKey}.
      *
      * Specifies a chart type key.
      *
      * Default value is `empty string`.
      *
      * @returns Value of property `chartTypeKey`
      */
    def getChartTypeKey(): String = js.native
    
    /**
      * Gets content of aggregation {@link #getDimMeasureItems dimMeasureItems}.
      *
      * List of columns that has been changed.
      */
    def getDimMeasureItems(): js.Array[typings.openui5.sapMP13nDimMeasureItemMod.default] = js.native
    
    /**
      * Checks for the provided `sap.ui.core.Item` in the aggregation {@link #getAvailableChartTypes availableChartTypes}.
      * and returns its index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfAvailableChartType(
      /**
      * The availableChartType whose index is looked for
      */
    oAvailableChartType: typings.openui5.sapUiCoreItemMod.default
    ): int = js.native
    
    /**
      * Checks for the provided `sap.m.P13nDimMeasureItem` in the aggregation {@link #getDimMeasureItems dimMeasureItems}.
      * and returns its index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfDimMeasureItem(
      /**
      * The dimMeasureItem whose index is looked for
      */
    oDimMeasureItem: typings.openui5.sapMP13nDimMeasureItemMod.default
    ): int = js.native
    
    /**
      * Inserts a availableChartType into the aggregation {@link #getAvailableChartTypes availableChartTypes}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def insertAvailableChartType(
      /**
      * The availableChartType to insert; if empty, nothing is inserted
      */
    oAvailableChartType: typings.openui5.sapUiCoreItemMod.default,
      /**
      * The `0`-based index the availableChartType should be inserted at; for a negative value of `iIndex`, the
      * availableChartType is inserted at position 0; for a value greater than the current size of the aggregation,
      * the availableChartType is inserted at the last position
      */
    iIndex: int
    ): this.type = js.native
    
    /**
      * Inserts a dimMeasureItem into the aggregation {@link #getDimMeasureItems dimMeasureItems}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def insertDimMeasureItem(
      /**
      * The dimMeasureItem to insert; if empty, nothing is inserted
      */
    oDimMeasureItem: typings.openui5.sapMP13nDimMeasureItemMod.default,
      /**
      * The `0`-based index the dimMeasureItem should be inserted at; for a negative value of `iIndex`, the dimMeasureItem
      * is inserted at position 0; for a value greater than the current size of the aggregation, the dimMeasureItem
      * is inserted at the last position
      */
    iIndex: int
    ): this.type = js.native
    
    /**
      * Removes all the controls from the aggregation {@link #getAvailableChartTypes availableChartTypes}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllAvailableChartTypes(): js.Array[typings.openui5.sapUiCoreItemMod.default] = js.native
    
    /**
      * Removes all the controls from the aggregation {@link #getDimMeasureItems dimMeasureItems}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllDimMeasureItems(): js.Array[typings.openui5.sapMP13nDimMeasureItemMod.default] = js.native
    
    def removeAvailableChartType(/**
      * The availableChartType to remove or its index or id
      */
    vAvailableChartType: String): typings.openui5.sapUiCoreItemMod.default | Null = js.native
    /**
      * Removes a availableChartType from the aggregation {@link #getAvailableChartTypes availableChartTypes}.
      *
      * @returns The removed availableChartType or `null`
      */
    def removeAvailableChartType(/**
      * The availableChartType to remove or its index or id
      */
    vAvailableChartType: int): typings.openui5.sapUiCoreItemMod.default | Null = js.native
    def removeAvailableChartType(
      /**
      * The availableChartType to remove or its index or id
      */
    vAvailableChartType: typings.openui5.sapUiCoreItemMod.default
    ): typings.openui5.sapUiCoreItemMod.default | Null = js.native
    
    def removeDimMeasureItem(/**
      * The dimMeasureItem to remove or its index or id
      */
    vDimMeasureItem: String): typings.openui5.sapMP13nDimMeasureItemMod.default | Null = js.native
    /**
      * Removes a dimMeasureItem from the aggregation {@link #getDimMeasureItems dimMeasureItems}.
      *
      * @returns The removed dimMeasureItem or `null`
      */
    def removeDimMeasureItem(/**
      * The dimMeasureItem to remove or its index or id
      */
    vDimMeasureItem: int): typings.openui5.sapMP13nDimMeasureItemMod.default | Null = js.native
    def removeDimMeasureItem(
      /**
      * The dimMeasureItem to remove or its index or id
      */
    vDimMeasureItem: typings.openui5.sapMP13nDimMeasureItemMod.default
    ): typings.openui5.sapMP13nDimMeasureItemMod.default | Null = js.native
    
    /**
      * Sets a new value for property {@link #getChartTypeKey chartTypeKey}.
      *
      * Specifies a chart type key.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `empty string`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setChartTypeKey(): this.type = js.native
    def setChartTypeKey(/**
      * New value for property `chartTypeKey`
      */
    sChartTypeKey: String): this.type = js.native
    
    /**
      * Unbinds aggregation {@link #getDimMeasureItems dimMeasureItems} from model data.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def unbindDimMeasureItems(): this.type = js.native
  }
  
  trait P13nDimMeasurePanel$ChangeChartTypeEventParameters extends StObject
  
  trait P13nDimMeasurePanel$ChangeDimMeasureItemsEventParameters extends StObject
  
  type P13nDimMeasurePanelChangeChartTypeEvent = typings.openui5.sapUiBaseEventMod.default[P13nDimMeasurePanel$ChangeChartTypeEventParameters]
  
  type P13nDimMeasurePanelChangeChartTypeEventParameters = P13nDimMeasurePanel$ChangeChartTypeEventParameters
  
  type P13nDimMeasurePanelChangeDimMeasureItemsEvent = typings.openui5.sapUiBaseEventMod.default[P13nDimMeasurePanel$ChangeDimMeasureItemsEventParameters]
  
  type P13nDimMeasurePanelChangeDimMeasureItemsEventParameters = P13nDimMeasurePanel$ChangeDimMeasureItemsEventParameters
  
  trait P13nDimMeasurePanelSettings
    extends StObject
       with P13nPanelSettings {
    
    /**
      * Specifies available chart types.
      */
    var availableChartTypes: js.UndefOr[
        js.Array[typings.openui5.sapUiCoreItemMod.default] | typings.openui5.sapUiCoreItemMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @since 1.50.0
      *
      * Event raised when a `ChartType` has been updated.
      */
    var changeChartType: js.UndefOr[
        js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit]
      ] = js.undefined
    
    /**
      * @since 1.50.0
      *
      * Event raised when one or more `DimMeasureItems` has been updated. Aggregation `DimMeasureItems` should
      * be updated outside...
      */
    var changeDimMeasureItems: js.UndefOr[
        js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit]
      ] = js.undefined
    
    /**
      * Specifies a chart type key.
      */
    var chartTypeKey: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * List of columns that has been changed.
      */
    var dimMeasureItems: js.UndefOr[
        js.Array[typings.openui5.sapMP13nDimMeasureItemMod.default] | typings.openui5.sapMP13nDimMeasureItemMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
  }
  object P13nDimMeasurePanelSettings {
    
    inline def apply(): P13nDimMeasurePanelSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[P13nDimMeasurePanelSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: P13nDimMeasurePanelSettings] (val x: Self) extends AnyVal {
      
      inline def setAvailableChartTypes(
        value: js.Array[typings.openui5.sapUiCoreItemMod.default] | typings.openui5.sapUiCoreItemMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "availableChartTypes", value.asInstanceOf[js.Any])
      
      inline def setAvailableChartTypesUndefined: Self = StObject.set(x, "availableChartTypes", js.undefined)
      
      inline def setAvailableChartTypesVarargs(value: typings.openui5.sapUiCoreItemMod.default*): Self = StObject.set(x, "availableChartTypes", js.Array(value*))
      
      inline def setChangeChartType(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default[js.Object] => Unit): Self = StObject.set(x, "changeChartType", js.Any.fromFunction1(value))
      
      inline def setChangeChartTypeUndefined: Self = StObject.set(x, "changeChartType", js.undefined)
      
      inline def setChangeDimMeasureItems(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default[js.Object] => Unit): Self = StObject.set(x, "changeDimMeasureItems", js.Any.fromFunction1(value))
      
      inline def setChangeDimMeasureItemsUndefined: Self = StObject.set(x, "changeDimMeasureItems", js.undefined)
      
      inline def setChartTypeKey(value: String | PropertyBindingInfo): Self = StObject.set(x, "chartTypeKey", value.asInstanceOf[js.Any])
      
      inline def setChartTypeKeyUndefined: Self = StObject.set(x, "chartTypeKey", js.undefined)
      
      inline def setDimMeasureItems(
        value: js.Array[typings.openui5.sapMP13nDimMeasureItemMod.default] | typings.openui5.sapMP13nDimMeasureItemMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "dimMeasureItems", value.asInstanceOf[js.Any])
      
      inline def setDimMeasureItemsUndefined: Self = StObject.set(x, "dimMeasureItems", js.undefined)
      
      inline def setDimMeasureItemsVarargs(value: typings.openui5.sapMP13nDimMeasureItemMod.default*): Self = StObject.set(x, "dimMeasureItems", js.Array(value*))
    }
  }
}
