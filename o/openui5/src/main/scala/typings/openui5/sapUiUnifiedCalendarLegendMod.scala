package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.AggregationBindingInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreControlMod.ControlSettings
import typings.openui5.sapUiCoreLibraryMod.CSSSize
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiUnifiedCalendarLegendMod {
  
  @JSImport("sap/ui/unified/CalendarLegend", JSImport.Default)
  @js.native
  /**
    * Constructor for a new CalendarLegend.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends CalendarLegend {
    def this(/**
      * initial settings for the new control
      */
    mSettings: CalendarLegendSettings) = this()
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
    mSettings: CalendarLegendSettings
    ) = this()
    def this(
      /**
      * id for the new control, generated automatically if no id is given
      */
    sId: Unit,
      /**
      * initial settings for the new control
      */
    mSettings: CalendarLegendSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/unified/CalendarLegend", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.unified.CalendarLegend with name `sClassName` and enriches it
      * with the information contained in `oClassInfo`.
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
    oClassInfo: ClassInfo[T, CalendarLegend]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, CalendarLegend],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.unified.CalendarLegend.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait CalendarLegend
    extends typings.openui5.sapUiCoreControlMod.default {
    
    /**
      * Adds some item to the aggregation {@link #getItems items}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addItem(
      /**
      * The item to add; if empty, nothing is inserted
      */
    oItem: typings.openui5.sapUiUnifiedCalendarLegendItemMod.default
    ): this.type = js.native
    
    /**
      * Destroys all the items in the aggregation {@link #getItems items}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyItems(): this.type = js.native
    
    /**
      * Gets current value of property {@link #getColumnWidth columnWidth}.
      *
      * Defines the width of the created columns in which the items are arranged.
      *
      * Default value is `'120px'`.
      *
      * @returns Value of property `columnWidth`
      */
    def getColumnWidth(): CSSSize = js.native
    
    /**
      * Gets content of aggregation {@link #getItems items}.
      *
      * Items to be displayed.
      */
    def getItems(): js.Array[typings.openui5.sapUiUnifiedCalendarLegendItemMod.default] = js.native
    
    /**
      * @SINCE 1.54
      *
      * Gets current value of property {@link #getStandardItems standardItems}.
      *
      * Determines the standard items related to the calendar days, such as, today, selected, working and non-working.
      * Values must be one of `sap.ui.unified.StandardCalendarLegendItem`. Note: for versions 1.50 and 1.52,
      * this property was defined in the subclass `sap.m.PlanningCalendarLegend`
      *
      * Default value is `['Today', 'Selected', 'WorkingDay', 'NonWorkingDay']`.
      *
      * @returns Value of property `standardItems`
      */
    def getStandardItems(): js.Array[String] = js.native
    
    /**
      * Checks for the provided `sap.ui.unified.CalendarLegendItem` in the aggregation {@link #getItems items}.
      * and returns its index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfItem(
      /**
      * The item whose index is looked for
      */
    oItem: typings.openui5.sapUiUnifiedCalendarLegendItemMod.default
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
    oItem: typings.openui5.sapUiUnifiedCalendarLegendItemMod.default,
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
    def removeAllItems(): js.Array[typings.openui5.sapUiUnifiedCalendarLegendItemMod.default] = js.native
    
    def removeItem(/**
      * The item to remove or its index or id
      */
    vItem: String): typings.openui5.sapUiUnifiedCalendarLegendItemMod.default | Null = js.native
    /**
      * Removes a item from the aggregation {@link #getItems items}.
      *
      * @returns The removed item or `null`
      */
    def removeItem(/**
      * The item to remove or its index or id
      */
    vItem: int): typings.openui5.sapUiUnifiedCalendarLegendItemMod.default | Null = js.native
    def removeItem(
      /**
      * The item to remove or its index or id
      */
    vItem: typings.openui5.sapUiUnifiedCalendarLegendItemMod.default
    ): typings.openui5.sapUiUnifiedCalendarLegendItemMod.default | Null = js.native
    
    /**
      * Sets a new value for property {@link #getColumnWidth columnWidth}.
      *
      * Defines the width of the created columns in which the items are arranged.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `'120px'`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setColumnWidth(): this.type = js.native
    def setColumnWidth(/**
      * New value for property `columnWidth`
      */
    sColumnWidth: CSSSize): this.type = js.native
    
    /**
      * @SINCE 1.54
      *
      * Sets a new value for property {@link #getStandardItems standardItems}.
      *
      * Determines the standard items related to the calendar days, such as, today, selected, working and non-working.
      * Values must be one of `sap.ui.unified.StandardCalendarLegendItem`. Note: for versions 1.50 and 1.52,
      * this property was defined in the subclass `sap.m.PlanningCalendarLegend`
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `['Today', 'Selected', 'WorkingDay', 'NonWorkingDay']`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setStandardItems(): this.type = js.native
    def setStandardItems(/**
      * New value for property `standardItems`
      */
    sStandardItems: js.Array[String]): this.type = js.native
  }
  
  trait CalendarLegendSettings
    extends StObject
       with ControlSettings {
    
    /**
      * Defines the width of the created columns in which the items are arranged.
      */
    var columnWidth: js.UndefOr[
        CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Items to be displayed.
      */
    var items: js.UndefOr[
        js.Array[typings.openui5.sapUiUnifiedCalendarLegendItemMod.default] | typings.openui5.sapUiUnifiedCalendarLegendItemMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @SINCE 1.54
      *
      * Determines the standard items related to the calendar days, such as, today, selected, working and non-working.
      * Values must be one of `sap.ui.unified.StandardCalendarLegendItem`. Note: for versions 1.50 and 1.52,
      * this property was defined in the subclass `sap.m.PlanningCalendarLegend`
      */
    var standardItems: js.UndefOr[
        js.Array[String] | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
  }
  object CalendarLegendSettings {
    
    inline def apply(): CalendarLegendSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CalendarLegendSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CalendarLegendSettings] (val x: Self) extends AnyVal {
      
      inline def setColumnWidth(value: CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "columnWidth", value.asInstanceOf[js.Any])
      
      inline def setColumnWidthUndefined: Self = StObject.set(x, "columnWidth", js.undefined)
      
      inline def setItems(
        value: js.Array[typings.openui5.sapUiUnifiedCalendarLegendItemMod.default] | typings.openui5.sapUiUnifiedCalendarLegendItemMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
      
      inline def setItemsVarargs(value: typings.openui5.sapUiUnifiedCalendarLegendItemMod.default*): Self = StObject.set(x, "items", js.Array(value*))
      
      inline def setStandardItems(
        value: js.Array[String] | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "standardItems", value.asInstanceOf[js.Any])
      
      inline def setStandardItemsUndefined: Self = StObject.set(x, "standardItems", js.undefined)
      
      inline def setStandardItemsVarargs(value: String*): Self = StObject.set(x, "standardItems", js.Array(value*))
    }
  }
}
