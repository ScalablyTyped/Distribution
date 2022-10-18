package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapMLibraryMod.BackgroundDesign
import typings.openui5.sapMLibraryMod.FlexAlignSelf
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreElementMod.ElementSettings
import typings.openui5.sapUiCoreLibraryMod.CSSSize
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapMFlexItemDataMod {
  
  @JSImport("sap/m/FlexItemData", JSImport.Default)
  @js.native
  /**
    * Constructor for a new `sap.m.FlexItemData`.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends FlexItemData {
    def this(/**
      * Initial settings for the new element.
      */
    mSettings: FlexItemDataSettings) = this()
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
      * Initial settings for the new element.
      */
    mSettings: FlexItemDataSettings
    ) = this()
    def this(
      /**
      * ID for the new element, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new element.
      */
    mSettings: FlexItemDataSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/m/FlexItemData", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.m.FlexItemData with name `sClassName` and enriches it with the information
      * contained in `oClassInfo`.
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
    oClassInfo: ClassInfo[T, FlexItemData]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, FlexItemData],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.m.FlexItemData.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait FlexItemData
    extends typings.openui5.sapUiCoreLayoutDataMod.default {
    
    /**
      * Gets current value of property {@link #getAlignSelf alignSelf}.
      *
      * Determines cross-axis alignment of individual element.
      *
      * Default value is `Auto`.
      *
      * @returns Value of property `alignSelf`
      */
    def getAlignSelf(): FlexAlignSelf | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof FlexAlignSelf * / any */ String) = js.native
    
    /**
      * @SINCE 1.38.5
      *
      * Gets current value of property {@link #getBackgroundDesign backgroundDesign}.
      *
      * Defines the background style of the flex item.
      *
      * Default value is `Transparent`.
      *
      * @returns Value of property `backgroundDesign`
      */
    def getBackgroundDesign(): BackgroundDesign | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof BackgroundDesign * / any */ String) = js.native
    
    /**
      * @SINCE 1.32.0
      *
      * Gets current value of property {@link #getBaseSize baseSize}.
      *
      * The base size is the initial main size of the item for the flex algorithm. If set to "auto", this will
      * be the computed size of the item.
      *
      * Default value is `"auto"`.
      *
      * @returns Value of property `baseSize`
      */
    def getBaseSize(): CSSSize = js.native
    
    /**
      * Gets current value of property {@link #getGrowFactor growFactor}.
      *
      * Determines the flexibility of the flex item when allocatable space is remaining.
      *
      * Default value is `0`.
      *
      * @returns Value of property `growFactor`
      */
    def getGrowFactor(): float = js.native
    
    /**
      * @SINCE 1.36.0
      *
      * Gets current value of property {@link #getMaxHeight maxHeight}.
      *
      * The maximum height of the flex item.
      *
      * Default value is `empty string`.
      *
      * @returns Value of property `maxHeight`
      */
    def getMaxHeight(): CSSSize = js.native
    
    /**
      * @SINCE 1.36.0
      *
      * Gets current value of property {@link #getMaxWidth maxWidth}.
      *
      * The maximum width of the flex item.
      *
      * Default value is `empty string`.
      *
      * @returns Value of property `maxWidth`
      */
    def getMaxWidth(): CSSSize = js.native
    
    /**
      * @SINCE 1.36.0
      *
      * Gets current value of property {@link #getMinHeight minHeight}.
      *
      * The minimum height of the flex item.
      *
      * Default value is `"auto"`.
      *
      * @returns Value of property `minHeight`
      */
    def getMinHeight(): CSSSize = js.native
    
    /**
      * @SINCE 1.36.0
      *
      * Gets current value of property {@link #getMinWidth minWidth}.
      *
      * The minimum width of the flex item.
      *
      * Default value is `"auto"`.
      *
      * @returns Value of property `minWidth`
      */
    def getMinWidth(): CSSSize = js.native
    
    /**
      * Gets current value of property {@link #getOrder order}.
      *
      * Determines the display order of flex items independent of their source code order.
      *
      * Default value is `0`.
      *
      * @returns Value of property `order`
      */
    def getOrder(): int = js.native
    
    /**
      * @SINCE 1.24.0
      *
      * Gets current value of property {@link #getShrinkFactor shrinkFactor}.
      *
      * The shrink factor determines how much the flex item will shrink relative to the rest of the flex items
      * in the flex container when negative free space is distributed.
      *
      * Default value is `1`.
      *
      * @returns Value of property `shrinkFactor`
      */
    def getShrinkFactor(): float = js.native
    
    /**
      * Gets current value of property {@link #getStyleClass styleClass}.
      *
      * The style class will be applied to the flex item and can be used for CSS selectors.
      *
      * Default value is `empty string`.
      *
      * @returns Value of property `styleClass`
      */
    def getStyleClass(): String = js.native
    
    /**
      * Sets the `alignSelf` property.
      *
      * @returns `this` FlexItemData reference for chaining.
      */
    def setAlignSelf(/**
      * Align option.
      */
    sValue: String): this.type = js.native
    
    /**
      * Sets background design for flex items.
      *
      * @returns `this` FlexItemData reference for chaining.
      */
    def setBackgroundDesign(/**
      * Background design in string format.
      */
    sValue: String): this.type = js.native
    
    /**
      * Sets the base size for flex items.
      *
      * @returns `this` FlexItemData reference for chaining.
      */
    def setBaseSize(/**
      * Base size in string format.
      */
    sValue: String): this.type = js.native
    
    /**
      * Sets the `growFactor` property.
      *
      * @returns this FlexItemData reference for chaining.
      */
    def setGrowFactor(/**
      * Grow factor in string format.
      */
    sValue: String): this.type = js.native
    
    /**
      * Sets maximum height.
      *
      * @returns `this` FlexItemData reference for chaining.
      */
    def setMaxHeight(/**
      * Maximum height in string format.
      */
    sValue: String): this.type = js.native
    
    /**
      * Sets maximum width.
      *
      * @returns `this` FlexItemData reference for chaining.
      */
    def setMaxWidth(/**
      * Maximum width in string format.
      */
    sValue: String): this.type = js.native
    
    /**
      * Sets minimum height.
      *
      * @returns `this` FlexItemData reference for chaining.
      */
    def setMinHeight(/**
      * Minimum height in string format.
      */
    sValue: String): this.type = js.native
    
    /**
      * Sets minimum width.
      *
      * @returns `this` FlexItemData reference for chaining.
      */
    def setMinWidth(/**
      * Minimum width in string format.
      */
    sValue: String): this.type = js.native
    
    /**
      * Sets the order.
      *
      * @returns `this` FlexItemData reference for chaining.
      */
    def setOrder(/**
      * Order in string format.
      */
    sValue: String): this.type = js.native
    
    /**
      * Sets the `shrinkFactor` property.
      * See:
      * 	https://www.w3.org/TR/css-flexbox-1/#propdef-flex-shrink
      *
      * @returns `this` FlexItemData reference for chaining.
      */
    def setShrinkFactor(/**
      * Shrink factor in string format.
      */
    sValue: String): this.type = js.native
    
    /**
      * Sets style class.
      *
      * @returns `this` FlexItemData reference for chaining.
      */
    def setStyleClass(/**
      * Style class.
      */
    sValue: String): this.type = js.native
  }
  
  trait FlexItemDataSettings
    extends StObject
       with ElementSettings {
    
    /**
      * Determines cross-axis alignment of individual element.
      */
    var alignSelf: js.UndefOr[
        FlexAlignSelf | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof FlexAlignSelf * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * @SINCE 1.38.5
      *
      * Defines the background style of the flex item.
      */
    var backgroundDesign: js.UndefOr[
        BackgroundDesign | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof BackgroundDesign * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * @SINCE 1.32.0
      *
      * The base size is the initial main size of the item for the flex algorithm. If set to "auto", this will
      * be the computed size of the item.
      */
    var baseSize: js.UndefOr[
        CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Determines the flexibility of the flex item when allocatable space is remaining.
      */
    var growFactor: js.UndefOr[
        float | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @SINCE 1.36.0
      *
      * The maximum height of the flex item.
      */
    var maxHeight: js.UndefOr[
        CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @SINCE 1.36.0
      *
      * The maximum width of the flex item.
      */
    var maxWidth: js.UndefOr[
        CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @SINCE 1.36.0
      *
      * The minimum height of the flex item.
      */
    var minHeight: js.UndefOr[
        CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @SINCE 1.36.0
      *
      * The minimum width of the flex item.
      */
    var minWidth: js.UndefOr[
        CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Determines the display order of flex items independent of their source code order.
      */
    var order: js.UndefOr[int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * @SINCE 1.24.0
      *
      * The shrink factor determines how much the flex item will shrink relative to the rest of the flex items
      * in the flex container when negative free space is distributed.
      */
    var shrinkFactor: js.UndefOr[
        float | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * The style class will be applied to the flex item and can be used for CSS selectors.
      */
    var styleClass: js.UndefOr[String | PropertyBindingInfo] = js.undefined
  }
  object FlexItemDataSettings {
    
    inline def apply(): FlexItemDataSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FlexItemDataSettings]
    }
    
    extension [Self <: FlexItemDataSettings](x: Self) {
      
      inline def setAlignSelf(
        value: FlexAlignSelf | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof FlexAlignSelf * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "alignSelf", value.asInstanceOf[js.Any])
      
      inline def setAlignSelfUndefined: Self = StObject.set(x, "alignSelf", js.undefined)
      
      inline def setBackgroundDesign(
        value: BackgroundDesign | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof BackgroundDesign * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "backgroundDesign", value.asInstanceOf[js.Any])
      
      inline def setBackgroundDesignUndefined: Self = StObject.set(x, "backgroundDesign", js.undefined)
      
      inline def setBaseSize(value: CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "baseSize", value.asInstanceOf[js.Any])
      
      inline def setBaseSizeUndefined: Self = StObject.set(x, "baseSize", js.undefined)
      
      inline def setGrowFactor(value: float | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "growFactor", value.asInstanceOf[js.Any])
      
      inline def setGrowFactorUndefined: Self = StObject.set(x, "growFactor", js.undefined)
      
      inline def setMaxHeight(value: CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
      
      inline def setMaxHeightUndefined: Self = StObject.set(x, "maxHeight", js.undefined)
      
      inline def setMaxWidth(value: CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
      
      inline def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
      
      inline def setMinHeight(value: CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "minHeight", value.asInstanceOf[js.Any])
      
      inline def setMinHeightUndefined: Self = StObject.set(x, "minHeight", js.undefined)
      
      inline def setMinWidth(value: CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
      
      inline def setMinWidthUndefined: Self = StObject.set(x, "minWidth", js.undefined)
      
      inline def setOrder(value: int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
      
      inline def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
      
      inline def setShrinkFactor(value: float | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "shrinkFactor", value.asInstanceOf[js.Any])
      
      inline def setShrinkFactorUndefined: Self = StObject.set(x, "shrinkFactor", js.undefined)
      
      inline def setStyleClass(value: String | PropertyBindingInfo): Self = StObject.set(x, "styleClass", value.asInstanceOf[js.Any])
      
      inline def setStyleClassUndefined: Self = StObject.set(x, "styleClass", js.undefined)
    }
  }
}
