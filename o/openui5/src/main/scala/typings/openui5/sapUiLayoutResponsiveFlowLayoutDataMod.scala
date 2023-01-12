package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreElementMod.ElementSettings
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiLayoutResponsiveFlowLayoutDataMod {
  
  @JSImport("sap/ui/layout/ResponsiveFlowLayoutData", JSImport.Default)
  @js.native
  /**
    * Constructor for a new ResponsiveFlowLayoutData.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends ResponsiveFlowLayoutData {
    def this(/**
      * Initial settings for the new control
      */
    mSettings: ResponsiveFlowLayoutDataSettings) = this()
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
    mSettings: ResponsiveFlowLayoutDataSettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new control
      */
    mSettings: ResponsiveFlowLayoutDataSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/layout/ResponsiveFlowLayoutData", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.layout.ResponsiveFlowLayoutData with name `sClassName` and enriches
      * it with the information contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.ui.core.LayoutData.extend}.
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
    oClassInfo: ClassInfo[T, ResponsiveFlowLayoutData]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, ResponsiveFlowLayoutData],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.layout.ResponsiveFlowLayoutData.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait ResponsiveFlowLayoutData
    extends typings.openui5.sapUiCoreLayoutDataMod.default {
    
    /**
      * Gets current value of property {@link #getLinebreak linebreak}.
      *
      * If this property is set, the control in which the LayoutData is added, will always cause a line break
      * within the ResponsiveFlowLayout.
      *
      * Default value is `false`.
      *
      * @returns Value of property `linebreak`
      */
    def getLinebreak(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getLinebreakable linebreakable}.
      *
      * Shows if an element can be wrapped into a new row. If this value is set to false, the min-width will
      * be set to 0 and the wrapping is up to the previous element.
      *
      * Default value is `true`.
      *
      * @returns Value of property `linebreakable`
      */
    def getLinebreakable(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getMargin margin}.
      *
      * Prevents any margin of the element if set to false.
      *
      * Default value is `true`.
      *
      * @returns Value of property `margin`
      */
    def getMargin(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getMinWidth minWidth}.
      *
      * Defines the minimal size in px of a ResponsiveFlowLayout element. The element will be shrunk down to
      * this value.
      *
      * Default value is `100`.
      *
      * @returns Value of property `minWidth`
      */
    def getMinWidth(): int = js.native
    
    /**
      * Gets current value of property {@link #getWeight weight}.
      *
      * Defines the weight of the element, that influences the resulting width. If there are several elements
      * within a row of the ResponsiveFlowLayout, each element could have another weight. The bigger the weight
      * of a single element, the wider it will be stretched, i.e. a bigger weight results in a larger width.
      *
      * Default value is `1`.
      *
      * @returns Value of property `weight`
      */
    def getWeight(): int = js.native
    
    /**
      * Sets a new value for property {@link #getLinebreak linebreak}.
      *
      * If this property is set, the control in which the LayoutData is added, will always cause a line break
      * within the ResponsiveFlowLayout.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setLinebreak(): this.type = js.native
    def setLinebreak(/**
      * New value for property `linebreak`
      */
    bLinebreak: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getLinebreakable linebreakable}.
      *
      * Shows if an element can be wrapped into a new row. If this value is set to false, the min-width will
      * be set to 0 and the wrapping is up to the previous element.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setLinebreakable(): this.type = js.native
    def setLinebreakable(/**
      * New value for property `linebreakable`
      */
    bLinebreakable: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getMargin margin}.
      *
      * Prevents any margin of the element if set to false.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setMargin(): this.type = js.native
    def setMargin(/**
      * New value for property `margin`
      */
    bMargin: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getMinWidth minWidth}.
      *
      * Defines the minimal size in px of a ResponsiveFlowLayout element. The element will be shrunk down to
      * this value.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `100`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setMinWidth(): this.type = js.native
    def setMinWidth(/**
      * New value for property `minWidth`
      */
    iMinWidth: int): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getWeight weight}.
      *
      * Defines the weight of the element, that influences the resulting width. If there are several elements
      * within a row of the ResponsiveFlowLayout, each element could have another weight. The bigger the weight
      * of a single element, the wider it will be stretched, i.e. a bigger weight results in a larger width.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `1`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setWeight(): this.type = js.native
    def setWeight(/**
      * New value for property `weight`
      */
    iWeight: int): this.type = js.native
  }
  
  trait ResponsiveFlowLayoutDataSettings
    extends StObject
       with ElementSettings {
    
    /**
      * If this property is set, the control in which the LayoutData is added, will always cause a line break
      * within the ResponsiveFlowLayout.
      */
    var linebreak: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Shows if an element can be wrapped into a new row. If this value is set to false, the min-width will
      * be set to 0 and the wrapping is up to the previous element.
      */
    var linebreakable: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Prevents any margin of the element if set to false.
      */
    var margin: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Defines the minimal size in px of a ResponsiveFlowLayout element. The element will be shrunk down to
      * this value.
      */
    var minWidth: js.UndefOr[int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * Defines the weight of the element, that influences the resulting width. If there are several elements
      * within a row of the ResponsiveFlowLayout, each element could have another weight. The bigger the weight
      * of a single element, the wider it will be stretched, i.e. a bigger weight results in a larger width.
      */
    var weight: js.UndefOr[int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
  }
  object ResponsiveFlowLayoutDataSettings {
    
    inline def apply(): ResponsiveFlowLayoutDataSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ResponsiveFlowLayoutDataSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ResponsiveFlowLayoutDataSettings] (val x: Self) extends AnyVal {
      
      inline def setLinebreak(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "linebreak", value.asInstanceOf[js.Any])
      
      inline def setLinebreakUndefined: Self = StObject.set(x, "linebreak", js.undefined)
      
      inline def setLinebreakable(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "linebreakable", value.asInstanceOf[js.Any])
      
      inline def setLinebreakableUndefined: Self = StObject.set(x, "linebreakable", js.undefined)
      
      inline def setMargin(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
      
      inline def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
      
      inline def setMinWidth(value: int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
      
      inline def setMinWidthUndefined: Self = StObject.set(x, "minWidth", js.undefined)
      
      inline def setWeight(value: int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
      
      inline def setWeightUndefined: Self = StObject.set(x, "weight", js.undefined)
    }
  }
}
