package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreControlMod.ControlSettings
import typings.openui5.sapUiCoreLibraryMod.BarColor
import typings.openui5.sapUiCoreLibraryMod.CSSSize
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiCommonsProgressIndicatorMod {
  
  @JSImport("sap/ui/commons/ProgressIndicator", JSImport.Default)
  @js.native
  /**
    * Constructor for a new ProgressIndicator.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends ProgressIndicator {
    def this(/**
      * Initial settings for the new control
      */
    mSettings: ProgressIndicatorSettings) = this()
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
    mSettings: ProgressIndicatorSettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new control
      */
    mSettings: ProgressIndicatorSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/commons/ProgressIndicator", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.commons.ProgressIndicator with name `sClassName` and enriches
      * it with the information contained in `oClassInfo`.
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
    oClassInfo: ClassInfo[T, ProgressIndicator]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, ProgressIndicator],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.commons.ProgressIndicator.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait ProgressIndicator
    extends typings.openui5.sapUiCoreControlMod.default {
    
    /**
      * Gets current value of property {@link #getBarColor barColor}.
      *
      * Determines the color of the bar which visualizes the progress. Possible values defined in the sap.ui.core.BarColor
      * enumeration are the following: CRITICAL (yellow), NEGATIVE (red), POSITIVE (green), NEUTRAL (blue) (default
      * value).
      *
      * Default value is `NEUTRAL`.
      *
      * @returns Value of property `barColor`
      */
    def getBarColor(): BarColor | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof BarColor * / any */ String) = js.native
    
    /**
      * Gets current value of property {@link #getDisplayValue displayValue}.
      *
      * Determines the text value that will be displayed in the bar.
      *
      * Default value is `'0%'`.
      *
      * @returns Value of property `displayValue`
      */
    def getDisplayValue(): String = js.native
    
    /**
      * Gets current value of property {@link #getEnabled enabled}.
      *
      * Determines whether the control is enabled or not. Disabled controls have different colors, and can not
      * be focused.
      *
      * Default value is `true`.
      *
      * @returns Value of property `enabled`
      */
    def getEnabled(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getPercentValue percentValue}.
      *
      * Determines the numerical value for the displayed length of the progress bar.
      *
      * Default value is `0`.
      *
      * @returns Value of property `percentValue`
      */
    def getPercentValue(): int = js.native
    
    /**
      * Gets current value of property {@link #getShowValue showValue}.
      *
      * Determines whether the percent value shall be rendered inside the bar.
      *
      * Default value is `true`.
      *
      * @returns Value of property `showValue`
      */
    def getShowValue(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getWidth width}.
      *
      * Determines the width of the control.
      *
      * Default value is `'100%'`.
      *
      * @returns Value of property `width`
      */
    def getWidth(): CSSSize = js.native
    
    /**
      * Sets a new value for property {@link #getBarColor barColor}.
      *
      * Determines the color of the bar which visualizes the progress. Possible values defined in the sap.ui.core.BarColor
      * enumeration are the following: CRITICAL (yellow), NEGATIVE (red), POSITIVE (green), NEUTRAL (blue) (default
      * value).
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `NEUTRAL`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setBarColor(): this.type = js.native
    def setBarColor(
      /**
      * New value for property `barColor`
      */
    sBarColor: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof BarColor * / any */ String
    ): this.type = js.native
    def setBarColor(/**
      * New value for property `barColor`
      */
    sBarColor: BarColor): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getDisplayValue displayValue}.
      *
      * Determines the text value that will be displayed in the bar.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `'0%'`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setDisplayValue(): this.type = js.native
    def setDisplayValue(/**
      * New value for property `displayValue`
      */
    sDisplayValue: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getEnabled enabled}.
      *
      * Determines whether the control is enabled or not. Disabled controls have different colors, and can not
      * be focused.
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
      * Sets the new percent value which the ProgressIndicator should display. A new rendering is not necessary,
      * only the bar has to be moved.
      *
      * @returns `this` to allow method chaining.
      */
    def setPercentValue(/**
      * The new percent value of the ProgressIndicator.
      */
    iPercentValue: int): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getShowValue showValue}.
      *
      * Determines whether the percent value shall be rendered inside the bar.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setShowValue(): this.type = js.native
    def setShowValue(/**
      * New value for property `showValue`
      */
    bShowValue: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getWidth width}.
      *
      * Determines the width of the control.
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
  
  trait ProgressIndicatorSettings
    extends StObject
       with ControlSettings {
    
    /**
      * Determines the color of the bar which visualizes the progress. Possible values defined in the sap.ui.core.BarColor
      * enumeration are the following: CRITICAL (yellow), NEGATIVE (red), POSITIVE (green), NEUTRAL (blue) (default
      * value).
      */
    var barColor: js.UndefOr[
        BarColor | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof BarColor * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * Determines the text value that will be displayed in the bar.
      */
    var displayValue: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Determines whether the control is enabled or not. Disabled controls have different colors, and can not
      * be focused.
      */
    var enabled: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Determines the numerical value for the displayed length of the progress bar.
      */
    var percentValue: js.UndefOr[int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * Determines whether the percent value shall be rendered inside the bar.
      */
    var showValue: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Determines the width of the control.
      */
    var width: js.UndefOr[
        CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
  }
  object ProgressIndicatorSettings {
    
    inline def apply(): ProgressIndicatorSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ProgressIndicatorSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ProgressIndicatorSettings] (val x: Self) extends AnyVal {
      
      inline def setBarColor(
        value: BarColor | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof BarColor * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "barColor", value.asInstanceOf[js.Any])
      
      inline def setBarColorUndefined: Self = StObject.set(x, "barColor", js.undefined)
      
      inline def setDisplayValue(value: String | PropertyBindingInfo): Self = StObject.set(x, "displayValue", value.asInstanceOf[js.Any])
      
      inline def setDisplayValueUndefined: Self = StObject.set(x, "displayValue", js.undefined)
      
      inline def setEnabled(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      inline def setPercentValue(value: int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "percentValue", value.asInstanceOf[js.Any])
      
      inline def setPercentValueUndefined: Self = StObject.set(x, "percentValue", js.undefined)
      
      inline def setShowValue(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "showValue", value.asInstanceOf[js.Any])
      
      inline def setShowValueUndefined: Self = StObject.set(x, "showValue", js.undefined)
      
      inline def setWidth(value: CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
