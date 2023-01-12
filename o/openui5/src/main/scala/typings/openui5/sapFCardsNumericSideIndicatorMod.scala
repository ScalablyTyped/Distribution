package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapMLibraryMod.ValueColor
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreControlMod.ControlSettings
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapFCardsNumericSideIndicatorMod {
  
  @JSImport("sap/f/cards/NumericSideIndicator", JSImport.Default)
  @js.native
  /**
    * Constructor for a new `NumericSideIndicator`.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends NumericSideIndicator {
    def this(/**
      * Initial settings for the new control
      */
    mSettings: NumericSideIndicatorSettings) = this()
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
    mSettings: NumericSideIndicatorSettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new control
      */
    mSettings: NumericSideIndicatorSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/f/cards/NumericSideIndicator", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.f.cards.NumericSideIndicator with name `sClassName` and enriches
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
    oClassInfo: ClassInfo[T, NumericSideIndicator]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, NumericSideIndicator],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.f.cards.NumericSideIndicator.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait NumericSideIndicator
    extends typings.openui5.sapUiCoreControlMod.default {
    
    /**
      * Gets current value of property {@link #getNumber number}.
      *
      * The numeric value
      *
      * @returns Value of property `number`
      */
    def getNumber(): String = js.native
    
    /**
      * @EXPERIMENTAL (since 1.95) - Disclaimer: this property is in a beta state - incompatible API changes
      * may be done before its official public release. Use at your own discretion.
      *
      * Gets current value of property {@link #getState state}.
      *
      * The semantic color which represents the state of the side indicator.
      *
      * Default value is `"None"`.
      *
      * @returns Value of property `state`
      */
    def getState(): ValueColor | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ValueColor * / any */ String) = js.native
    
    /**
      * Gets current value of property {@link #getTitle title}.
      *
      * The title of the indicator
      *
      * @returns Value of property `title`
      */
    def getTitle(): String = js.native
    
    /**
      * Gets current value of property {@link #getUnit unit}.
      *
      * Defines the unit of measurement (scaling prefix) for the numeric value
      *
      * @returns Value of property `unit`
      */
    def getUnit(): String = js.native
    
    /**
      * Sets the numeric value.
      *
      * @returns this pointer for chaining
      */
    def setNumber(/**
      * The text of the title
      */
    sValue: String): this.type = js.native
    
    /**
      * @EXPERIMENTAL (since 1.95) - Disclaimer: this property is in a beta state - incompatible API changes
      * may be done before its official public release. Use at your own discretion.
      *
      * Sets a new value for property {@link #getState state}.
      *
      * The semantic color which represents the state of the side indicator.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `"None"`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setState(): this.type = js.native
    def setState(
      /**
      * New value for property `state`
      */
    sState: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ValueColor * / any */ String
    ): this.type = js.native
    def setState(/**
      * New value for property `state`
      */
    sState: ValueColor): this.type = js.native
    
    /**
      * Sets the title.
      *
      * @returns this pointer for chaining
      */
    def setTitle(/**
      * The text of the title
      */
    sValue: String): this.type = js.native
    
    /**
      * Sets the unit of measurement.
      *
      * @returns this pointer for chaining
      */
    def setUnit(/**
      * The text of the title
      */
    sValue: String): this.type = js.native
  }
  
  trait NumericSideIndicatorSettings
    extends StObject
       with ControlSettings {
    
    /**
      * The numeric value
      */
    var number: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * @EXPERIMENTAL (since 1.95) - Disclaimer: this property is in a beta state - incompatible API changes
      * may be done before its official public release. Use at your own discretion.
      *
      * The semantic color which represents the state of the side indicator.
      */
    var state: js.UndefOr[
        ValueColor | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ValueColor * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * The title of the indicator
      */
    var title: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Defines the unit of measurement (scaling prefix) for the numeric value
      */
    var unit: js.UndefOr[String | PropertyBindingInfo] = js.undefined
  }
  object NumericSideIndicatorSettings {
    
    inline def apply(): NumericSideIndicatorSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NumericSideIndicatorSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NumericSideIndicatorSettings] (val x: Self) extends AnyVal {
      
      inline def setNumber(value: String | PropertyBindingInfo): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
      
      inline def setNumberUndefined: Self = StObject.set(x, "number", js.undefined)
      
      inline def setState(
        value: ValueColor | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ValueColor * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
      
      inline def setTitle(value: String | PropertyBindingInfo): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setUnit(value: String | PropertyBindingInfo): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
      
      inline def setUnitUndefined: Self = StObject.set(x, "unit", js.undefined)
    }
  }
}
