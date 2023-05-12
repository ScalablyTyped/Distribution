package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapMSliderMod.SliderSettings
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapMRangeSliderMod {
  
  @JSImport("sap/m/RangeSlider", JSImport.Default)
  @js.native
  /**
    * Constructor for a new `RangeSlider`.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    * See:
    * 	{@link fiori:https://experience.sap.com/fiori-design-web/range-slider/ Range Slider}
    */
  open class default () extends RangeSlider {
    def this(/**
      * Initial settings for the new control
      */
    mSettings: RangeSliderSettings) = this()
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
    mSettings: RangeSliderSettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new control
      */
    mSettings: RangeSliderSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/m/RangeSlider", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.m.RangeSlider with name `sClassName` and enriches it with the information
      * contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.m.Slider.extend}.
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
    oClassInfo: ClassInfo[T, RangeSlider]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, RangeSlider],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.m.RangeSlider.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait RangeSlider
    extends typings.openui5.sapMSliderMod.default {
    
    /**
      * Gets current value of property {@link #getRange range}.
      *
      * Determines the currently selected range on the slider.
      *
      * If the value is lower/higher than the allowed minimum/maximum, a warning message will be output to the
      * console.
      *
      * Default value is `[0, 100]`.
      *
      * @returns Value of property `range`
      */
    def getRange(): js.Array[float] = js.native
    
    /**
      * Gets current value of property {@link #getValue2 value2}.
      *
      * Current second value of the slider. (Position of the second handle.)
      *
      * **Note:** If the value is not in the valid range (between `min` and `max`) it will be changed to be in
      * the valid range. If it is smaller than `value` it will be set to the same value.
      *
      * Default value is `100`.
      *
      * @returns Value of property `value2`
      */
    def getValue2(): float = js.native
    
    /**
      * Sets a new value for property {@link #getRange range}.
      *
      * Determines the currently selected range on the slider.
      *
      * If the value is lower/higher than the allowed minimum/maximum, a warning message will be output to the
      * console.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `[0, 100]`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setRange(): this.type = js.native
    def setRange(/**
      * New value for property `range`
      */
    sRange: js.Array[float]): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getValue2 value2}.
      *
      * Current second value of the slider. (Position of the second handle.)
      *
      * **Note:** If the value is not in the valid range (between `min` and `max`) it will be changed to be in
      * the valid range. If it is smaller than `value` it will be set to the same value.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `100`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setValue2(): this.type = js.native
    def setValue2(/**
      * New value for property `value2`
      */
    fValue2: float): this.type = js.native
    
    /**
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
      * Updates values of the advanced tooltips.
      */
    def updateAdvancedTooltipDom(): Unit = js.native
  }
  
  trait RangeSliderSettings
    extends StObject
       with SliderSettings {
    
    /**
      * Determines the currently selected range on the slider.
      *
      * If the value is lower/higher than the allowed minimum/maximum, a warning message will be output to the
      * console.
      */
    var range: js.UndefOr[
        js.Array[float] | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Current second value of the slider. (Position of the second handle.)
      *
      * **Note:** If the value is not in the valid range (between `min` and `max`) it will be changed to be in
      * the valid range. If it is smaller than `value` it will be set to the same value.
      */
    var value2: js.UndefOr[
        float | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
  }
  object RangeSliderSettings {
    
    inline def apply(): RangeSliderSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RangeSliderSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RangeSliderSettings] (val x: Self) extends AnyVal {
      
      inline def setRange(value: js.Array[float] | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
      
      inline def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
      
      inline def setRangeVarargs(value: float*): Self = StObject.set(x, "range", js.Array(value*))
      
      inline def setValue2(value: float | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "value2", value.asInstanceOf[js.Any])
      
      inline def setValue2Undefined: Self = StObject.set(x, "value2", js.undefined)
    }
  }
}
