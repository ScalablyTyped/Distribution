package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.AggregationBindingInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreLibraryMod.URI
import typings.openui5.sapUiUnifiedDateTypeRangeMod.DateTypeRangeSettings
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiUnifiedCalendarAppointmentMod {
  
  @JSImport("sap/ui/unified/CalendarAppointment", JSImport.Default)
  @js.native
  /**
    * Constructor for a new `CalendarAppointment`.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends CalendarAppointment {
    def this(/**
      * Initial settings for the new control
      */
    mSettings: CalendarAppointmentSettings) = this()
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
    mSettings: CalendarAppointmentSettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new control
      */
    mSettings: CalendarAppointmentSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/unified/CalendarAppointment", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.unified.CalendarAppointment with name `sClassName` and enriches
      * it with the information contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.ui.unified.DateTypeRange.extend}.
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
    oClassInfo: ClassInfo[T, CalendarAppointment]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, CalendarAppointment],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.unified.CalendarAppointment.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait CalendarAppointment
    extends typings.openui5.sapUiUnifiedDateTypeRangeMod.default {
    
    /**
      * @SINCE 1.93.0
      * @EXPERIMENTAL (since 1.93)
      *
      * Adds some customContent to the aggregation {@link #getCustomContent customContent}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addCustomContent(
      /**
      * The customContent to add; if empty, nothing is inserted
      */
    oCustomContent: typings.openui5.sapUiCoreControlMod.default
    ): this.type = js.native
    
    /**
      * @SINCE 1.93.0
      * @EXPERIMENTAL (since 1.93)
      *
      * Destroys all the customContent in the aggregation {@link #getCustomContent customContent}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyCustomContent(): this.type = js.native
    
    /**
      * @SINCE 1.93.0
      * @EXPERIMENTAL (since 1.93)
      *
      * Gets content of aggregation {@link #getCustomContent customContent}.
      *
      * Holds the content of the appointment.
      *
      * **Note **, If the `customContent` aggregation is added then:
      *
      *
      * 	 - The `title`, `text`, `description`, and `icon` properties are ignored.
      * 	 - The application developer has to ensure, that all the accessibility requirements are met, and that
      * 			the height of the content conforms with the height provided by the appointment.
      * 	 - Do not use interactive controls as content, as they may trigger unwanted selection of the appointment
      * 			and may lead to unpredictable results.
      */
    def getCustomContent(): js.Array[typings.openui5.sapUiCoreControlMod.default] = js.native
    
    /**
      * @SINCE 1.81.0
      *
      * Gets current value of property {@link #getDescription description}.
      *
      * Description of the appointment.
      *
      * @returns Value of property `description`
      */
    def getDescription(): String = js.native
    
    /**
      * Gets current value of property {@link #getIcon icon}.
      *
      * Icon of the Appointment. (e.g. picture of the person)
      *
      * URI of an image or an icon registered in sap.ui.core.IconPool.
      *
      * @returns Value of property `icon`
      */
    def getIcon(): URI = js.native
    
    /**
      * Gets current value of property {@link #getKey key}.
      *
      * Can be used as identifier of the appointment
      *
      * @returns Value of property `key`
      */
    def getKey(): String = js.native
    
    /**
      * Gets current value of property {@link #getSelected selected}.
      *
      * Indicates if the icon is selected.
      *
      * Default value is `false`.
      *
      * @returns Value of property `selected`
      */
    def getSelected(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getTentative tentative}.
      *
      * Indicates if the icon is tentative.
      *
      * Default value is `false`.
      *
      * @returns Value of property `tentative`
      */
    def getTentative(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getText text}.
      *
      * Text of the appointment.
      *
      * @returns Value of property `text`
      */
    def getText(): String = js.native
    
    /**
      * Gets current value of property {@link #getTitle title}.
      *
      * Title of the appointment.
      *
      * @returns Value of property `title`
      */
    def getTitle(): String = js.native
    
    /**
      * @SINCE 1.93.0
      * @EXPERIMENTAL (since 1.93)
      *
      * Checks for the provided `sap.ui.core.Control` in the aggregation {@link #getCustomContent customContent}.
      * and returns its index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfCustomContent(
      /**
      * The customContent whose index is looked for
      */
    oCustomContent: typings.openui5.sapUiCoreControlMod.default
    ): int = js.native
    
    /**
      * @SINCE 1.93.0
      * @EXPERIMENTAL (since 1.93)
      *
      * Inserts a customContent into the aggregation {@link #getCustomContent customContent}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def insertCustomContent(
      /**
      * The customContent to insert; if empty, nothing is inserted
      */
    oCustomContent: typings.openui5.sapUiCoreControlMod.default,
      /**
      * The `0`-based index the customContent should be inserted at; for a negative value of `iIndex`, the customContent
      * is inserted at position 0; for a value greater than the current size of the aggregation, the customContent
      * is inserted at the last position
      */
    iIndex: int
    ): this.type = js.native
    
    /**
      * @SINCE 1.93.0
      * @EXPERIMENTAL (since 1.93)
      *
      * Removes all the controls from the aggregation {@link #getCustomContent customContent}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllCustomContent(): js.Array[typings.openui5.sapUiCoreControlMod.default] = js.native
    
    def removeCustomContent(/**
      * The customContent to remove or its index or id
      */
    vCustomContent: String): typings.openui5.sapUiCoreControlMod.default | Null = js.native
    /**
      * @SINCE 1.93.0
      * @EXPERIMENTAL (since 1.93)
      *
      * Removes a customContent from the aggregation {@link #getCustomContent customContent}.
      *
      * @returns The removed customContent or `null`
      */
    def removeCustomContent(/**
      * The customContent to remove or its index or id
      */
    vCustomContent: int): typings.openui5.sapUiCoreControlMod.default | Null = js.native
    def removeCustomContent(
      /**
      * The customContent to remove or its index or id
      */
    vCustomContent: typings.openui5.sapUiCoreControlMod.default
    ): typings.openui5.sapUiCoreControlMod.default | Null = js.native
    
    /**
      * @SINCE 1.81.0
      *
      * Sets a new value for property {@link #getDescription description}.
      *
      * Description of the appointment.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setDescription(/**
      * New value for property `description`
      */
    sDescription: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getIcon icon}.
      *
      * Icon of the Appointment. (e.g. picture of the person)
      *
      * URI of an image or an icon registered in sap.ui.core.IconPool.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setIcon(): this.type = js.native
    def setIcon(/**
      * New value for property `icon`
      */
    sIcon: URI): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getKey key}.
      *
      * Can be used as identifier of the appointment
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setKey(): this.type = js.native
    def setKey(/**
      * New value for property `key`
      */
    sKey: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getSelected selected}.
      *
      * Indicates if the icon is selected.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setSelected(): this.type = js.native
    def setSelected(/**
      * New value for property `selected`
      */
    bSelected: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getTentative tentative}.
      *
      * Indicates if the icon is tentative.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setTentative(): this.type = js.native
    def setTentative(/**
      * New value for property `tentative`
      */
    bTentative: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getText text}.
      *
      * Text of the appointment.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setText(/**
      * New value for property `text`
      */
    sText: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getTitle title}.
      *
      * Title of the appointment.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setTitle(/**
      * New value for property `title`
      */
    sTitle: String): this.type = js.native
  }
  
  trait CalendarAppointmentSettings
    extends StObject
       with DateTypeRangeSettings {
    
    /**
      * @SINCE 1.93.0
      * @EXPERIMENTAL (since 1.93)
      *
      * Holds the content of the appointment.
      *
      * **Note **, If the `customContent` aggregation is added then:
      *
      *
      * 	 - The `title`, `text`, `description`, and `icon` properties are ignored.
      * 	 - The application developer has to ensure, that all the accessibility requirements are met, and that
      * 			the height of the content conforms with the height provided by the appointment.
      * 	 - Do not use interactive controls as content, as they may trigger unwanted selection of the appointment
      * 			and may lead to unpredictable results.
      */
    var customContent: js.UndefOr[
        js.Array[typings.openui5.sapUiCoreControlMod.default] | typings.openui5.sapUiCoreControlMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @SINCE 1.81.0
      *
      * Description of the appointment.
      */
    var description: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Icon of the Appointment. (e.g. picture of the person)
      *
      * URI of an image or an icon registered in sap.ui.core.IconPool.
      */
    var icon: js.UndefOr[URI | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * Can be used as identifier of the appointment
      */
    var key: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Indicates if the icon is selected.
      */
    var selected: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Indicates if the icon is tentative.
      */
    var tentative: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Text of the appointment.
      */
    var text: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Title of the appointment.
      */
    var title: js.UndefOr[String | PropertyBindingInfo] = js.undefined
  }
  object CalendarAppointmentSettings {
    
    inline def apply(): CalendarAppointmentSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CalendarAppointmentSettings]
    }
    
    extension [Self <: CalendarAppointmentSettings](x: Self) {
      
      inline def setCustomContent(
        value: js.Array[typings.openui5.sapUiCoreControlMod.default] | typings.openui5.sapUiCoreControlMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "customContent", value.asInstanceOf[js.Any])
      
      inline def setCustomContentUndefined: Self = StObject.set(x, "customContent", js.undefined)
      
      inline def setCustomContentVarargs(value: typings.openui5.sapUiCoreControlMod.default*): Self = StObject.set(x, "customContent", js.Array(value*))
      
      inline def setDescription(value: String | PropertyBindingInfo): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setIcon(value: URI | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setKey(value: String | PropertyBindingInfo): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setSelected(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
      
      inline def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
      
      inline def setTentative(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "tentative", value.asInstanceOf[js.Any])
      
      inline def setTentativeUndefined: Self = StObject.set(x, "tentative", js.undefined)
      
      inline def setText(value: String | PropertyBindingInfo): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      inline def setTitle(value: String | PropertyBindingInfo): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
}
