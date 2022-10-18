package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapMLibraryMod.BackgroundDesign
import typings.openui5.sapMLibraryMod.FlexAlignContent
import typings.openui5.sapMLibraryMod.FlexAlignItems
import typings.openui5.sapMLibraryMod.FlexDirection
import typings.openui5.sapMLibraryMod.FlexJustifyContent
import typings.openui5.sapMLibraryMod.FlexRendertype
import typings.openui5.sapMLibraryMod.FlexWrap
import typings.openui5.sapUiBaseManagedObjectMod.AggregationBindingInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreControlMod.ControlSettings
import typings.openui5.sapUiCoreLibraryMod.CSSSize
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapMFlexBoxMod {
  
  @JSImport("sap/m/FlexBox", JSImport.Default)
  @js.native
  /**
    * Constructor for a new `sap.m.FlexBox`.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    * See:
    * 	https://www.w3.org/TR/css-flexbox-1/
    * 	https://www.w3schools.com/css/css3_flexbox.asp
    * 	{@link topic:674890e6d8534eaba2eaf63242e077eb Flex Box}
    */
  open class default () extends FlexBox {
    def this(/**
      * initial settings for the new control
      */
    mSettings: FlexBoxSettings) = this()
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
    mSettings: FlexBoxSettings
    ) = this()
    def this(
      /**
      * id for the new control, generated automatically if no id is given
      */
    sId: Unit,
      /**
      * initial settings for the new control
      */
    mSettings: FlexBoxSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/m/FlexBox", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.m.FlexBox with name `sClassName` and enriches it with the information
      * contained in `oClassInfo`.
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
    oClassInfo: ClassInfo[T, FlexBox]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, FlexBox],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.m.FlexBox.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait FlexBox
    extends typings.openui5.sapUiCoreControlMod.default {
    
    /**
      * Adds some item to the aggregation {@link #getItems items}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addItem(
      /**
      * The item to add; if empty, nothing is inserted
      */
    oItem: typings.openui5.sapUiCoreControlMod.default
    ): this.type = js.native
    
    /**
      * Destroys all the items in the aggregation {@link #getItems items}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyItems(): this.type = js.native
    
    /**
      * @SINCE 1.36.0
      *
      * Gets current value of property {@link #getAlignContent alignContent}.
      *
      * Determines the layout behavior of container lines when there's extra space along the cross-axis.
      *
      * Default value is `Stretch`.
      *
      * @returns Value of property `alignContent`
      */
    def getAlignContent(): FlexAlignContent | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof FlexAlignContent * / any */ String) = js.native
    
    /**
      * Gets current value of property {@link #getAlignItems alignItems}.
      *
      * Determines the layout behavior of items along the cross-axis.
      *
      * Default value is `Stretch`.
      *
      * @returns Value of property `alignItems`
      */
    def getAlignItems(): FlexAlignItems | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof FlexAlignItems * / any */ String) = js.native
    
    /**
      * @SINCE 1.38.5
      *
      * Gets current value of property {@link #getBackgroundDesign backgroundDesign}.
      *
      * Defines the background style of the `sap.m.FlexBox`.
      *
      * Default value is `Transparent`.
      *
      * @returns Value of property `backgroundDesign`
      */
    def getBackgroundDesign(): BackgroundDesign | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof BackgroundDesign * / any */ String) = js.native
    
    /**
      * Gets current value of property {@link #getDirection direction}.
      *
      * Determines the direction of the layout of child elements.
      *
      * Default value is `Row`.
      *
      * @returns Value of property `direction`
      */
    def getDirection(): FlexDirection | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof FlexDirection * / any */ String) = js.native
    
    /**
      * Gets current value of property {@link #getDisplayInline displayInline}.
      *
      * Determines whether the `sap.m.FlexBox` is in block or inline mode.
      *
      * Default value is `false`.
      *
      * @returns Value of property `displayInline`
      */
    def getDisplayInline(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getFitContainer fitContainer}.
      *
      * Determines whether the `sap.m.FlexBox` will be sized to completely fill its container. If the `sap.m.FlexBox`
      * is inserted into a Page, the property 'enableScrolling' of the Page needs to be set to 'false' for the
      * FlexBox to fit the entire viewport.
      *
      * Default value is `false`.
      *
      * @returns Value of property `fitContainer`
      */
    def getFitContainer(): Boolean = js.native
    
    /**
      * @SINCE 1.9.1
      *
      * Gets current value of property {@link #getHeight height}.
      *
      * The height of the `sap.m.FlexBox`. Note that when a percentage is given, for the height to work as expected,
      * the height of the surrounding container must be defined.
      *
      * Default value is `empty string`.
      *
      * @returns Value of property `height`
      */
    def getHeight(): CSSSize = js.native
    
    /**
      * Gets content of aggregation {@link #getItems items}.
      *
      * Flex items within the flexible box layout
      */
    def getItems(): js.Array[typings.openui5.sapUiCoreControlMod.default] = js.native
    
    /**
      * Gets current value of property {@link #getJustifyContent justifyContent}.
      *
      * Determines the layout behavior along the main axis.
      *
      * Default value is `Start`.
      *
      * @returns Value of property `justifyContent`
      */
    def getJustifyContent(): FlexJustifyContent | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof FlexJustifyContent * / any */ String) = js.native
    
    /**
      * Gets current value of property {@link #getRenderType renderType}.
      *
      * Determines whether the layout is rendered as a series of divs or as an unordered list (ul).
      *
      *  We recommend to use `Bare` in most cases to avoid layout issues due to browser inconsistencies.
      *
      * Default value is `Div`.
      *
      * @returns Value of property `renderType`
      */
    def getRenderType(): FlexRendertype | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof FlexRendertype * / any */ String) = js.native
    
    /**
      * @SINCE 1.9.1
      *
      * Gets current value of property {@link #getWidth width}.
      *
      * The width of the `sap.m.FlexBox`. Note that when a percentage is given, for the width to work as expected,
      * the width of the surrounding container must be defined.
      *
      * Default value is `empty string`.
      *
      * @returns Value of property `width`
      */
    def getWidth(): CSSSize = js.native
    
    /**
      * @SINCE 1.36.0
      *
      * Gets current value of property {@link #getWrap wrap}.
      *
      * Determines the wrapping behavior of the flex container. This property has no effect in older browsers,
      * e.g. Android Native 4.3 and below.
      *
      * Default value is `NoWrap`.
      *
      * @returns Value of property `wrap`
      */
    def getWrap(): FlexWrap | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof FlexWrap * / any */ String) = js.native
    
    /**
      * Checks for the provided `sap.ui.core.Control` in the aggregation {@link #getItems items}. and returns
      * its index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfItem(/**
      * The item whose index is looked for
      */
    oItem: typings.openui5.sapUiCoreControlMod.default): int = js.native
    
    /**
      * Inserts a item into the aggregation {@link #getItems items}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def insertItem(
      /**
      * The item to insert; if empty, nothing is inserted
      */
    oItem: typings.openui5.sapUiCoreControlMod.default,
      /**
      * The `0`-based index the item should be inserted at; for a negative value of `iIndex`, the item is inserted
      * at position 0; for a value greater than the current size of the aggregation, the item is inserted at
      * the last position
      */
    iIndex: int
    ): this.type = js.native
    
    /**
      * Removes all the controls from the aggregation {@link #getItems items}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllItems(): js.Array[typings.openui5.sapUiCoreControlMod.default] = js.native
    
    def removeItem(/**
      * The item to remove or its index or id
      */
    vItem: String): typings.openui5.sapUiCoreControlMod.default | Null = js.native
    /**
      * Removes a item from the aggregation {@link #getItems items}.
      *
      * @returns The removed item or `null`
      */
    def removeItem(/**
      * The item to remove or its index or id
      */
    vItem: int): typings.openui5.sapUiCoreControlMod.default | Null = js.native
    def removeItem(
      /**
      * The item to remove or its index or id
      */
    vItem: typings.openui5.sapUiCoreControlMod.default
    ): typings.openui5.sapUiCoreControlMod.default | Null = js.native
    
    /**
      * @SINCE 1.36.0
      *
      * Sets a new value for property {@link #getAlignContent alignContent}.
      *
      * Determines the layout behavior of container lines when there's extra space along the cross-axis.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `Stretch`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setAlignContent(): this.type = js.native
    def setAlignContent(
      /**
      * New value for property `alignContent`
      */
    sAlignContent: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof FlexAlignContent * / any */ String
    ): this.type = js.native
    def setAlignContent(/**
      * New value for property `alignContent`
      */
    sAlignContent: FlexAlignContent): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getAlignItems alignItems}.
      *
      * Determines the layout behavior of items along the cross-axis.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `Stretch`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setAlignItems(): this.type = js.native
    def setAlignItems(
      /**
      * New value for property `alignItems`
      */
    sAlignItems: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof FlexAlignItems * / any */ String
    ): this.type = js.native
    def setAlignItems(/**
      * New value for property `alignItems`
      */
    sAlignItems: FlexAlignItems): this.type = js.native
    
    /**
      * @SINCE 1.38.5
      *
      * Sets a new value for property {@link #getBackgroundDesign backgroundDesign}.
      *
      * Defines the background style of the `sap.m.FlexBox`.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `Transparent`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setBackgroundDesign(): this.type = js.native
    def setBackgroundDesign(
      /**
      * New value for property `backgroundDesign`
      */
    sBackgroundDesign: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof BackgroundDesign * / any */ String
    ): this.type = js.native
    def setBackgroundDesign(/**
      * New value for property `backgroundDesign`
      */
    sBackgroundDesign: BackgroundDesign): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getDirection direction}.
      *
      * Determines the direction of the layout of child elements.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `Row`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setDirection(): this.type = js.native
    def setDirection(
      /**
      * New value for property `direction`
      */
    sDirection: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof FlexDirection * / any */ String
    ): this.type = js.native
    def setDirection(/**
      * New value for property `direction`
      */
    sDirection: FlexDirection): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getDisplayInline displayInline}.
      *
      * Determines whether the `sap.m.FlexBox` is in block or inline mode.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setDisplayInline(): this.type = js.native
    def setDisplayInline(/**
      * New value for property `displayInline`
      */
    bDisplayInline: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getFitContainer fitContainer}.
      *
      * Determines whether the `sap.m.FlexBox` will be sized to completely fill its container. If the `sap.m.FlexBox`
      * is inserted into a Page, the property 'enableScrolling' of the Page needs to be set to 'false' for the
      * FlexBox to fit the entire viewport.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setFitContainer(): this.type = js.native
    def setFitContainer(/**
      * New value for property `fitContainer`
      */
    bFitContainer: Boolean): this.type = js.native
    
    /**
      * @SINCE 1.9.1
      *
      * Sets a new value for property {@link #getHeight height}.
      *
      * The height of the `sap.m.FlexBox`. Note that when a percentage is given, for the height to work as expected,
      * the height of the surrounding container must be defined.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `empty string`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setHeight(): this.type = js.native
    def setHeight(/**
      * New value for property `height`
      */
    sHeight: CSSSize): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getJustifyContent justifyContent}.
      *
      * Determines the layout behavior along the main axis.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `Start`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setJustifyContent(): this.type = js.native
    def setJustifyContent(
      /**
      * New value for property `justifyContent`
      */
    sJustifyContent: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof FlexJustifyContent * / any */ String
    ): this.type = js.native
    def setJustifyContent(/**
      * New value for property `justifyContent`
      */
    sJustifyContent: FlexJustifyContent): this.type = js.native
    
    /**
      * Sets the render type of the FlexBox.
      *
      * @returns `this` FlexBox reference for chaining.
      */
    def setRenderType(/**
      * Render type in string format.
      */
    sValue: String): this.type = js.native
    
    /**
      * @SINCE 1.9.1
      *
      * Sets a new value for property {@link #getWidth width}.
      *
      * The width of the `sap.m.FlexBox`. Note that when a percentage is given, for the width to work as expected,
      * the width of the surrounding container must be defined.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `empty string`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setWidth(): this.type = js.native
    def setWidth(/**
      * New value for property `width`
      */
    sWidth: CSSSize): this.type = js.native
    
    /**
      * @SINCE 1.36.0
      *
      * Sets a new value for property {@link #getWrap wrap}.
      *
      * Determines the wrapping behavior of the flex container. This property has no effect in older browsers,
      * e.g. Android Native 4.3 and below.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `NoWrap`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setWrap(): this.type = js.native
    def setWrap(
      /**
      * New value for property `wrap`
      */
    sWrap: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof FlexWrap * / any */ String
    ): this.type = js.native
    def setWrap(/**
      * New value for property `wrap`
      */
    sWrap: FlexWrap): this.type = js.native
  }
  
  trait FlexBoxSettings
    extends StObject
       with ControlSettings {
    
    /**
      * @SINCE 1.36.0
      *
      * Determines the layout behavior of container lines when there's extra space along the cross-axis.
      */
    var alignContent: js.UndefOr[
        FlexAlignContent | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof FlexAlignContent * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * Determines the layout behavior of items along the cross-axis.
      */
    var alignItems: js.UndefOr[
        FlexAlignItems | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof FlexAlignItems * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * @SINCE 1.38.5
      *
      * Defines the background style of the `sap.m.FlexBox`.
      */
    var backgroundDesign: js.UndefOr[
        BackgroundDesign | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof BackgroundDesign * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * Determines the direction of the layout of child elements.
      */
    var direction: js.UndefOr[
        FlexDirection | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof FlexDirection * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * Determines whether the `sap.m.FlexBox` is in block or inline mode.
      */
    var displayInline: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Determines whether the `sap.m.FlexBox` will be sized to completely fill its container. If the `sap.m.FlexBox`
      * is inserted into a Page, the property 'enableScrolling' of the Page needs to be set to 'false' for the
      * FlexBox to fit the entire viewport.
      */
    var fitContainer: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @SINCE 1.9.1
      *
      * The height of the `sap.m.FlexBox`. Note that when a percentage is given, for the height to work as expected,
      * the height of the surrounding container must be defined.
      */
    var height: js.UndefOr[
        CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Flex items within the flexible box layout
      */
    var items: js.UndefOr[
        js.Array[typings.openui5.sapUiCoreControlMod.default] | typings.openui5.sapUiCoreControlMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Determines the layout behavior along the main axis.
      */
    var justifyContent: js.UndefOr[
        FlexJustifyContent | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof FlexJustifyContent * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * Determines whether the layout is rendered as a series of divs or as an unordered list (ul).
      *
      *  We recommend to use `Bare` in most cases to avoid layout issues due to browser inconsistencies.
      */
    var renderType: js.UndefOr[
        FlexRendertype | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof FlexRendertype * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * @SINCE 1.9.1
      *
      * The width of the `sap.m.FlexBox`. Note that when a percentage is given, for the width to work as expected,
      * the width of the surrounding container must be defined.
      */
    var width: js.UndefOr[
        CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @SINCE 1.36.0
      *
      * Determines the wrapping behavior of the flex container. This property has no effect in older browsers,
      * e.g. Android Native 4.3 and below.
      */
    var wrap: js.UndefOr[
        FlexWrap | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof FlexWrap * / any */ String) | PropertyBindingInfo
      ] = js.undefined
  }
  object FlexBoxSettings {
    
    inline def apply(): FlexBoxSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FlexBoxSettings]
    }
    
    extension [Self <: FlexBoxSettings](x: Self) {
      
      inline def setAlignContent(
        value: FlexAlignContent | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof FlexAlignContent * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "alignContent", value.asInstanceOf[js.Any])
      
      inline def setAlignContentUndefined: Self = StObject.set(x, "alignContent", js.undefined)
      
      inline def setAlignItems(
        value: FlexAlignItems | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof FlexAlignItems * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "alignItems", value.asInstanceOf[js.Any])
      
      inline def setAlignItemsUndefined: Self = StObject.set(x, "alignItems", js.undefined)
      
      inline def setBackgroundDesign(
        value: BackgroundDesign | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof BackgroundDesign * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "backgroundDesign", value.asInstanceOf[js.Any])
      
      inline def setBackgroundDesignUndefined: Self = StObject.set(x, "backgroundDesign", js.undefined)
      
      inline def setDirection(
        value: FlexDirection | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof FlexDirection * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      inline def setDisplayInline(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "displayInline", value.asInstanceOf[js.Any])
      
      inline def setDisplayInlineUndefined: Self = StObject.set(x, "displayInline", js.undefined)
      
      inline def setFitContainer(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "fitContainer", value.asInstanceOf[js.Any])
      
      inline def setFitContainerUndefined: Self = StObject.set(x, "fitContainer", js.undefined)
      
      inline def setHeight(value: CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setItems(
        value: js.Array[typings.openui5.sapUiCoreControlMod.default] | typings.openui5.sapUiCoreControlMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
      
      inline def setItemsVarargs(value: typings.openui5.sapUiCoreControlMod.default*): Self = StObject.set(x, "items", js.Array(value*))
      
      inline def setJustifyContent(
        value: FlexJustifyContent | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof FlexJustifyContent * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "justifyContent", value.asInstanceOf[js.Any])
      
      inline def setJustifyContentUndefined: Self = StObject.set(x, "justifyContent", js.undefined)
      
      inline def setRenderType(
        value: FlexRendertype | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof FlexRendertype * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "renderType", value.asInstanceOf[js.Any])
      
      inline def setRenderTypeUndefined: Self = StObject.set(x, "renderType", js.undefined)
      
      inline def setWidth(value: CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      inline def setWrap(
        value: FlexWrap | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof FlexWrap * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "wrap", value.asInstanceOf[js.Any])
      
      inline def setWrapUndefined: Self = StObject.set(x, "wrap", js.undefined)
    }
  }
}
