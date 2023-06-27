package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreElementMod.ElementSettings
import typings.openui5.sapUiCoreLibraryMod.CSSColor
import typings.openui5.sapUiUnifiedLibraryMod.CalendarDayType
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiUnifiedCalendarLegendItemMod {
  
  @JSImport("sap/ui/unified/CalendarLegendItem", JSImport.Default)
  @js.native
  /**
    * Constructor for a new CalendarLegendItem.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends CalendarLegendItem {
    def this(/**
      * initial settings for the new control
      */
    mSettings: CalendarLegendItemSettings) = this()
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
    mSettings: CalendarLegendItemSettings
    ) = this()
    def this(
      /**
      * id for the new control, generated automatically if no id is given
      */
    sId: Unit,
      /**
      * initial settings for the new control
      */
    mSettings: CalendarLegendItemSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/unified/CalendarLegendItem", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.unified.CalendarLegendItem with name `sClassName` and enriches
      * it with the information contained in `oClassInfo`.
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
    oClassInfo: ClassInfo[T, CalendarLegendItem]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, CalendarLegendItem],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.unified.CalendarLegendItem.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait CalendarLegendItem
    extends typings.openui5.sapUiCoreElementMod.default {
    
    /**
      * @since 1.46.0
      *
      * Gets current value of property {@link #getColor color}.
      *
      * Overrides the color derived from the `type` property.
      *
      * @returns Value of property `color`
      */
    def getColor(): CSSColor = js.native
    
    /**
      * Gets current value of property {@link #getText text}.
      *
      * Text to be displayed for the item.
      *
      * @returns Value of property `text`
      */
    def getText(): String = js.native
    
    /**
      * @since 1.28.9
      *
      * Gets current value of property {@link #getType type}.
      *
      * Type of the item. If not set the type is automatically determined from the order of the items in the
      * CalendarLegend.
      *
      * Default value is `None`.
      *
      * @returns Value of property `type`
      */
    def getType(): CalendarDayType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CalendarDayType * / any */ String) = js.native
    
    /**
      * @since 1.46.0
      *
      * Sets a new value for property {@link #getColor color}.
      *
      * Overrides the color derived from the `type` property.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setColor(): this.type = js.native
    def setColor(/**
      * New value for property `color`
      */
    sColor: CSSColor): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getText text}.
      *
      * Text to be displayed for the item.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setText(): this.type = js.native
    def setText(/**
      * New value for property `text`
      */
    sText: String): this.type = js.native
    
    /**
      * @since 1.28.9
      *
      * Sets a new value for property {@link #getType type}.
      *
      * Type of the item. If not set the type is automatically determined from the order of the items in the
      * CalendarLegend.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `None`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setType(): this.type = js.native
    def setType(
      /**
      * New value for property `type`
      */
    sType: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CalendarDayType * / any */ String
    ): this.type = js.native
    def setType(/**
      * New value for property `type`
      */
    sType: CalendarDayType): this.type = js.native
  }
  
  trait CalendarLegendItemSettings
    extends StObject
       with ElementSettings {
    
    /**
      * @since 1.46.0
      *
      * Overrides the color derived from the `type` property.
      */
    var color: js.UndefOr[
        CSSColor | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Text to be displayed for the item.
      */
    var text: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * @since 1.28.9
      *
      * Type of the item. If not set the type is automatically determined from the order of the items in the
      * CalendarLegend.
      */
    var `type`: js.UndefOr[
        CalendarDayType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CalendarDayType * / any */ String) | PropertyBindingInfo
      ] = js.undefined
  }
  object CalendarLegendItemSettings {
    
    inline def apply(): CalendarLegendItemSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CalendarLegendItemSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CalendarLegendItemSettings] (val x: Self) extends AnyVal {
      
      inline def setColor(value: CSSColor | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setText(value: String | PropertyBindingInfo): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      inline def setType(
        value: CalendarDayType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CalendarDayType * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
}
