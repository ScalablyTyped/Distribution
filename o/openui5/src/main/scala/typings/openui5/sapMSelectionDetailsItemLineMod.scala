package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreElementMod.ElementSettings
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapMSelectionDetailsItemLineMod {
  
  @JSImport("sap/m/SelectionDetailsItemLine", JSImport.Default)
  @js.native
  /**
    * Protected:  Do not call from applications (only from related classes in the framework)
    *
    * Constructor for a new SelectionDetailsItemLine.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends SelectionDetailsItemLine {
    def this(/**
      * Initial settings for the new element
      */
    mSettings: SelectionDetailsItemLineSettings) = this()
    def this(/**
      * ID for the new element, generated automatically if no ID is given
      */
    sId: String) = this()
    def this(
      /**
      * ID for the new element, generated automatically if no ID is given
      */
    sId: String,
      /**
      * Initial settings for the new element
      */
    mSettings: SelectionDetailsItemLineSettings
    ) = this()
    def this(
      /**
      * ID for the new element, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new element
      */
    mSettings: SelectionDetailsItemLineSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/m/SelectionDetailsItemLine", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Creates a new subclass of class sap.m.SelectionDetailsItemLine with name `sClassName` and enriches it
      * with the information contained in `oClassInfo`.
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
    oClassInfo: ClassInfo[T, SelectionDetailsItemLine]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, SelectionDetailsItemLine],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Returns a metadata object for class sap.m.SelectionDetailsItemLine.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait SelectionDetailsItemLine
    extends typings.openui5.sapUiCoreElementMod.default {
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Gets current value of property {@link #getDisplayValue displayValue}.
      *
      * The display value of the line. If this property is set, it overrides the value property and is displayed
      * as is.
      *
      * @returns Value of property `displayValue`
      */
    def getDisplayValue(): String = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Gets current value of property {@link #getLabel label}.
      *
      * The label that is shown as the first part of the line. It may contain the name of the currently selected
      * dimension or measure.
      *
      * @returns Value of property `label`
      */
    def getLabel(): String = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Gets current value of property {@link #getLineMarker lineMarker}.
      *
      * A string to be rendered by the control as a line marker. This string must be a valid SVG definition.
      * The only valid tags are: svg, path, line.
      *
      * @returns Value of property `lineMarker`
      */
    def getLineMarker(): String = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Gets current value of property {@link #getUnit unit}.
      *
      * The unit of the given value. If this unit is given, the line is displayed bold.
      *
      * @returns Value of property `unit`
      */
    def getUnit(): String = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Gets current value of property {@link #getValue value}.
      *
      * The value of the line, for example the value of the currently selected measure. Expected type is a string,
      * number or a plain object, including date and time properties of type string.
      *
      * @returns Value of property `value`
      */
    def getValue(): Any = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Sets a new value for property {@link #getDisplayValue displayValue}.
      *
      * The display value of the line. If this property is set, it overrides the value property and is displayed
      * as is.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setDisplayValue(): this.type = js.native
    def setDisplayValue(/**
      * New value for property `displayValue`
      */
    sDisplayValue: String): this.type = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Sets a new value for property {@link #getLabel label}.
      *
      * The label that is shown as the first part of the line. It may contain the name of the currently selected
      * dimension or measure.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setLabel(/**
      * New value for property `label`
      */
    sLabel: String): this.type = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Sets a new value for property {@link #getLineMarker lineMarker}.
      *
      * A string to be rendered by the control as a line marker. This string must be a valid SVG definition.
      * The only valid tags are: svg, path, line.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setLineMarker(): this.type = js.native
    def setLineMarker(/**
      * New value for property `lineMarker`
      */
    sLineMarker: String): this.type = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Sets a new value for property {@link #getUnit unit}.
      *
      * The unit of the given value. If this unit is given, the line is displayed bold.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setUnit(): this.type = js.native
    def setUnit(/**
      * New value for property `unit`
      */
    sUnit: String): this.type = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Sets a new value for property {@link #getValue value}.
      *
      * The value of the line, for example the value of the currently selected measure. Expected type is a string,
      * number or a plain object, including date and time properties of type string.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setValue(/**
      * New value for property `value`
      */
    oValue: Any): this.type = js.native
  }
  
  trait SelectionDetailsItemLineSettings
    extends StObject
       with ElementSettings {
    
    /**
      * The display value of the line. If this property is set, it overrides the value property and is displayed
      * as is.
      */
    var displayValue: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * The label that is shown as the first part of the line. It may contain the name of the currently selected
      * dimension or measure.
      */
    var label: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * A string to be rendered by the control as a line marker. This string must be a valid SVG definition.
      * The only valid tags are: svg, path, line.
      */
    var lineMarker: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * The unit of the given value. If this unit is given, the line is displayed bold.
      */
    var unit: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * The value of the line, for example the value of the currently selected measure. Expected type is a string,
      * number or a plain object, including date and time properties of type string.
      */
    var value: js.UndefOr[Any | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
  }
  object SelectionDetailsItemLineSettings {
    
    inline def apply(): SelectionDetailsItemLineSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SelectionDetailsItemLineSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SelectionDetailsItemLineSettings] (val x: Self) extends AnyVal {
      
      inline def setDisplayValue(value: String | PropertyBindingInfo): Self = StObject.set(x, "displayValue", value.asInstanceOf[js.Any])
      
      inline def setDisplayValueUndefined: Self = StObject.set(x, "displayValue", js.undefined)
      
      inline def setLabel(value: String | PropertyBindingInfo): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setLineMarker(value: String | PropertyBindingInfo): Self = StObject.set(x, "lineMarker", value.asInstanceOf[js.Any])
      
      inline def setLineMarkerUndefined: Self = StObject.set(x, "lineMarker", js.undefined)
      
      inline def setUnit(value: String | PropertyBindingInfo): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
      
      inline def setUnitUndefined: Self = StObject.set(x, "unit", js.undefined)
      
      inline def setValue(value: Any | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
