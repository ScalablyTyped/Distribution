package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreControlMod.ControlSettings
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiUnifiedCurrencyMod {
  
  @JSImport("sap/ui/unified/Currency", JSImport.Default)
  @js.native
  /**
    * Constructor for a new `Currency`.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends Currency {
    def this(/**
      * Initial settings for the new control
      */
    mSettings: CurrencySettings) = this()
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
    mSettings: CurrencySettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new control
      */
    mSettings: CurrencySettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/unified/Currency", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.unified.Currency with name `sClassName` and enriches it with the
      * information contained in `oClassInfo`.
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
    oClassInfo: ClassInfo[T, Currency]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, Currency],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.unified.Currency.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait Currency
    extends typings.openui5.sapUiCoreControlMod.default {
    
    /**
      * Gets current value of property {@link #getCurrency currency}.
      *
      * Determines the displayed currency code (ISO 4217).
      *
      * **Note:** If a * character is set instead of currency code, only the character itself will be rendered,
      * ignoring the `value` property.
      *
      * @returns Value of property `currency`
      */
    def getCurrency(): String = js.native
    
    /**
      * Get symbol of the currency, if available.
      */
    def getCurrencySymbol(): String = js.native
    
    /**
      * @SINCE 1.89
      *
      * Gets current value of property {@link #getEmptyIndicatorMode emptyIndicatorMode}.
      *
      * Specifies if an empty indicator should be displayed when there is no text.
      *
      * Default value is `Off`.
      *
      * @returns Value of property `emptyIndicatorMode`
      */
    def getEmptyIndicatorMode(): Any = js.native
    
    /**
      * The formatted value.
      *
      * @returns The formatted value
      */
    def getFormattedValue(): String = js.native
    
    /**
      * Gets current value of property {@link #getMaxPrecision maxPrecision}.
      *
      * Defines the space that is available for the precision of the various currencies.
      *
      * @returns Value of property `maxPrecision`
      */
    def getMaxPrecision(): int = js.native
    
    /**
      * @SINCE 1.54
      *
      * Gets current value of property {@link #getStringValue stringValue}.
      *
      * Determines the currency value as a string.
      *
      * String value is useful if you want to store really big values. If there are more than 21 digits before
      * the decimal point or if the number starts with “0.” followed by more than five zeros, it is represented
      * in exponential form. In these cases use the `stringValue` property to keep the number in decimal format.
      *
      * **Note:** If set, it will take precedence over the `value` property.
      *
      * @returns Value of property `stringValue`
      */
    def getStringValue(): String = js.native
    
    /**
      * Gets current value of property {@link #getUseSymbol useSymbol}.
      *
      * Displays the currency symbol instead of the ISO currency code.
      *
      * Default value is `true`.
      *
      * @returns Value of property `useSymbol`
      */
    def getUseSymbol(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getValue value}.
      *
      * Determines the currency value.
      *
      * Default value is `0`.
      *
      * @returns Value of property `value`
      */
    def getValue(): float = js.native
    
    /**
      * @SINCE 1.89
      *
      * Sets a new value for property {@link #getEmptyIndicatorMode emptyIndicatorMode}.
      *
      * Specifies if an empty indicator should be displayed when there is no text.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `Off`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setEmptyIndicatorMode(): this.type = js.native
    def setEmptyIndicatorMode(
      /**
      * New value for property `emptyIndicatorMode`
      */
    sEmptyIndicatorMode: /* was: sap.m.EmptyIndicatorMode */ Any
    ): this.type = js.native
    
    /**
      * @SINCE 1.54
      *
      * Sets a new value for property {@link #getStringValue stringValue}.
      *
      * Determines the currency value as a string.
      *
      * String value is useful if you want to store really big values. If there are more than 21 digits before
      * the decimal point or if the number starts with “0.” followed by more than five zeros, it is represented
      * in exponential form. In these cases use the `stringValue` property to keep the number in decimal format.
      *
      * **Note:** If set, it will take precedence over the `value` property.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setStringValue(): this.type = js.native
    def setStringValue(/**
      * New value for property `stringValue`
      */
    sStringValue: String): this.type = js.native
  }
  
  trait CurrencySettings
    extends StObject
       with ControlSettings {
    
    /**
      * Determines the displayed currency code (ISO 4217).
      *
      * **Note:** If a * character is set instead of currency code, only the character itself will be rendered,
      * ignoring the `value` property.
      */
    var currency: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * @SINCE 1.89
      *
      * Specifies if an empty indicator should be displayed when there is no text.
      */
    var emptyIndicatorMode: js.UndefOr[Any | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * Defines the space that is available for the precision of the various currencies.
      */
    var maxPrecision: js.UndefOr[int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * @SINCE 1.54
      *
      * Determines the currency value as a string.
      *
      * String value is useful if you want to store really big values. If there are more than 21 digits before
      * the decimal point or if the number starts with “0.” followed by more than five zeros, it is represented
      * in exponential form. In these cases use the `stringValue` property to keep the number in decimal format.
      *
      * **Note:** If set, it will take precedence over the `value` property.
      */
    var stringValue: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Displays the currency symbol instead of the ISO currency code.
      */
    var useSymbol: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Determines the currency value.
      */
    var value: js.UndefOr[
        float | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
  }
  object CurrencySettings {
    
    inline def apply(): CurrencySettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CurrencySettings]
    }
    
    extension [Self <: CurrencySettings](x: Self) {
      
      inline def setCurrency(value: String | PropertyBindingInfo): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
      
      inline def setCurrencyUndefined: Self = StObject.set(x, "currency", js.undefined)
      
      inline def setEmptyIndicatorMode(value: Any | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "emptyIndicatorMode", value.asInstanceOf[js.Any])
      
      inline def setEmptyIndicatorModeUndefined: Self = StObject.set(x, "emptyIndicatorMode", js.undefined)
      
      inline def setMaxPrecision(value: int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "maxPrecision", value.asInstanceOf[js.Any])
      
      inline def setMaxPrecisionUndefined: Self = StObject.set(x, "maxPrecision", js.undefined)
      
      inline def setStringValue(value: String | PropertyBindingInfo): Self = StObject.set(x, "stringValue", value.asInstanceOf[js.Any])
      
      inline def setStringValueUndefined: Self = StObject.set(x, "stringValue", js.undefined)
      
      inline def setUseSymbol(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "useSymbol", value.asInstanceOf[js.Any])
      
      inline def setUseSymbolUndefined: Self = StObject.set(x, "useSymbol", js.undefined)
      
      inline def setValue(value: float | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
