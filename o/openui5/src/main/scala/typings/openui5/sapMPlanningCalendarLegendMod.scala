package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.AggregationBindingInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiUnifiedCalendarLegendMod.CalendarLegendSettings
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapMPlanningCalendarLegendMod {
  
  @JSImport("sap/m/PlanningCalendarLegend", JSImport.Default)
  @js.native
  /**
    * Constructor for a new `PlanningCalendarLegend`.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends PlanningCalendarLegend {
    def this(/**
      * Initial settings for the new control
      */
    mSettings: PlanningCalendarLegendSettings) = this()
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
    mSettings: PlanningCalendarLegendSettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new control
      */
    mSettings: PlanningCalendarLegendSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/m/PlanningCalendarLegend", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.m.PlanningCalendarLegend with name `sClassName` and enriches it with
      * the information contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.ui.unified.CalendarLegend.extend}.
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
    oClassInfo: ClassInfo[T, PlanningCalendarLegend]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, PlanningCalendarLegend],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.m.PlanningCalendarLegend.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait PlanningCalendarLegend
    extends typings.openui5.sapUiUnifiedCalendarLegendMod.default {
    
    /**
      * Adds some appointmentItem to the aggregation {@link #getAppointmentItems appointmentItems}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addAppointmentItem(
      /**
      * The appointmentItem to add; if empty, nothing is inserted
      */
    oAppointmentItem: typings.openui5.sapUiUnifiedCalendarLegendItemMod.default
    ): this.type = js.native
    
    /**
      * Destroys all the appointmentItems in the aggregation {@link #getAppointmentItems appointmentItems}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyAppointmentItems(): this.type = js.native
    
    /**
      * Gets content of aggregation {@link #getAppointmentItems appointmentItems}.
      *
      * The legend items which show color and type information about the calendar appointments.
      */
    def getAppointmentItems(): js.Array[typings.openui5.sapUiUnifiedCalendarLegendItemMod.default] = js.native
    
    /**
      * Gets current value of property {@link #getAppointmentItemsHeader appointmentItemsHeader}.
      *
      * Defines the text displayed in the header of the appointment items list. It is commonly related to the
      * calendar appointments.
      *
      * @returns Value of property `appointmentItemsHeader`
      */
    def getAppointmentItemsHeader(): String = js.native
    
    /**
      * Gets current value of property {@link #getItemsHeader itemsHeader}.
      *
      * Defines the text displayed in the header of the items list. It is commonly related to the calendar days.
      *
      * @returns Value of property `itemsHeader`
      */
    def getItemsHeader(): String = js.native
    
    /**
      * Checks for the provided `sap.ui.unified.CalendarLegendItem` in the aggregation {@link #getAppointmentItems appointmentItems}.
      * and returns its index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfAppointmentItem(
      /**
      * The appointmentItem whose index is looked for
      */
    oAppointmentItem: typings.openui5.sapUiUnifiedCalendarLegendItemMod.default
    ): int = js.native
    
    /**
      * Inserts a appointmentItem into the aggregation {@link #getAppointmentItems appointmentItems}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def insertAppointmentItem(
      /**
      * The appointmentItem to insert; if empty, nothing is inserted
      */
    oAppointmentItem: typings.openui5.sapUiUnifiedCalendarLegendItemMod.default,
      /**
      * The `0`-based index the appointmentItem should be inserted at; for a negative value of `iIndex`, the
      * appointmentItem is inserted at position 0; for a value greater than the current size of the aggregation,
      * the appointmentItem is inserted at the last position
      */
    iIndex: int
    ): this.type = js.native
    
    /**
      * Removes all the controls from the aggregation {@link #getAppointmentItems appointmentItems}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllAppointmentItems(): js.Array[typings.openui5.sapUiUnifiedCalendarLegendItemMod.default] = js.native
    
    def removeAppointmentItem(/**
      * The appointmentItem to remove or its index or id
      */
    vAppointmentItem: String): typings.openui5.sapUiUnifiedCalendarLegendItemMod.default | Null = js.native
    /**
      * Removes a appointmentItem from the aggregation {@link #getAppointmentItems appointmentItems}.
      *
      * @returns The removed appointmentItem or `null`
      */
    def removeAppointmentItem(/**
      * The appointmentItem to remove or its index or id
      */
    vAppointmentItem: int): typings.openui5.sapUiUnifiedCalendarLegendItemMod.default | Null = js.native
    def removeAppointmentItem(
      /**
      * The appointmentItem to remove or its index or id
      */
    vAppointmentItem: typings.openui5.sapUiUnifiedCalendarLegendItemMod.default
    ): typings.openui5.sapUiUnifiedCalendarLegendItemMod.default | Null = js.native
    
    /**
      * Sets a new value for property {@link #getAppointmentItemsHeader appointmentItemsHeader}.
      *
      * Defines the text displayed in the header of the appointment items list. It is commonly related to the
      * calendar appointments.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setAppointmentItemsHeader(/**
      * New value for property `appointmentItemsHeader`
      */
    sAppointmentItemsHeader: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getItemsHeader itemsHeader}.
      *
      * Defines the text displayed in the header of the items list. It is commonly related to the calendar days.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setItemsHeader(/**
      * New value for property `itemsHeader`
      */
    sItemsHeader: String): this.type = js.native
  }
  
  trait PlanningCalendarLegendSettings
    extends StObject
       with CalendarLegendSettings {
    
    /**
      * The legend items which show color and type information about the calendar appointments.
      */
    var appointmentItems: js.UndefOr[
        js.Array[typings.openui5.sapUiUnifiedCalendarLegendItemMod.default] | typings.openui5.sapUiUnifiedCalendarLegendItemMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Defines the text displayed in the header of the appointment items list. It is commonly related to the
      * calendar appointments.
      */
    var appointmentItemsHeader: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Defines the text displayed in the header of the items list. It is commonly related to the calendar days.
      */
    var itemsHeader: js.UndefOr[String | PropertyBindingInfo] = js.undefined
  }
  object PlanningCalendarLegendSettings {
    
    inline def apply(): PlanningCalendarLegendSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PlanningCalendarLegendSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PlanningCalendarLegendSettings] (val x: Self) extends AnyVal {
      
      inline def setAppointmentItems(
        value: js.Array[typings.openui5.sapUiUnifiedCalendarLegendItemMod.default] | typings.openui5.sapUiUnifiedCalendarLegendItemMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "appointmentItems", value.asInstanceOf[js.Any])
      
      inline def setAppointmentItemsHeader(value: String | PropertyBindingInfo): Self = StObject.set(x, "appointmentItemsHeader", value.asInstanceOf[js.Any])
      
      inline def setAppointmentItemsHeaderUndefined: Self = StObject.set(x, "appointmentItemsHeader", js.undefined)
      
      inline def setAppointmentItemsUndefined: Self = StObject.set(x, "appointmentItems", js.undefined)
      
      inline def setAppointmentItemsVarargs(value: typings.openui5.sapUiUnifiedCalendarLegendItemMod.default*): Self = StObject.set(x, "appointmentItems", js.Array(value*))
      
      inline def setItemsHeader(value: String | PropertyBindingInfo): Self = StObject.set(x, "itemsHeader", value.asInstanceOf[js.Any])
      
      inline def setItemsHeaderUndefined: Self = StObject.set(x, "itemsHeader", js.undefined)
    }
  }
}
