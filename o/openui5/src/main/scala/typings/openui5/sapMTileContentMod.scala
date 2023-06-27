package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapMLibraryMod.FrameType
import typings.openui5.sapMLibraryMod.LoadState
import typings.openui5.sapMLibraryMod.Priority
import typings.openui5.sapMLibraryMod.Size
import typings.openui5.sapMLibraryMod.ValueColor
import typings.openui5.sapUiBaseManagedObjectMod.AggregationBindingInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreControlMod.ControlSettings
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapMTileContentMod {
  
  @JSImport("sap/m/TileContent", JSImport.Default)
  @js.native
  /**
    * Constructor for a new sap.m.TileContent control.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends TileContent {
    def this(/**
      * initial settings for the new control
      */
    mSettings: TileContentSettings) = this()
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
    mSettings: TileContentSettings
    ) = this()
    def this(
      /**
      * id for the new control, generated automatically if no id is given
      */
    sId: Unit,
      /**
      * initial settings for the new control
      */
    mSettings: TileContentSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/m/TileContent", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.m.TileContent with name `sClassName` and enriches it with the information
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
    oClassInfo: ClassInfo[T, TileContent]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, TileContent],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.m.TileContent.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait TileContent
    extends typings.openui5.sapUiCoreControlMod.default {
    
    /**
      * Binds aggregation {@link #getContent content} to model data.
      *
      * See {@link sap.ui.base.ManagedObject#bindAggregation ManagedObject.bindAggregation} for a detailed description
      * of the possible properties of `oBindingInfo`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def bindContent(/**
      * The binding information
      */
    oBindingInfo: AggregationBindingInfo): this.type = js.native
    
    /**
      * Destroys the content in the aggregation {@link #getContent content}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyContent(): this.type = js.native
    
    /**
      * Gets content of aggregation {@link #getContent content}.
      *
      * The switchable view that depends on the tile type.
      */
    def getContent(): typings.openui5.sapUiCoreControlMod.default = js.native
    
    /**
      * Gets current value of property {@link #getDisabled disabled}.
      *
      * Disables control if true.
      *
      * Default value is `false`.
      *
      * @returns Value of property `disabled`
      */
    def getDisabled(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getFooter footer}.
      *
      * The footer text of the tile.
      *
      * @returns Value of property `footer`
      */
    def getFooter(): String = js.native
    
    /**
      * @since 1.44
      *
      * Gets current value of property {@link #getFooterColor footerColor}.
      *
      * The semantic color of the footer.
      *
      * Default value is `"Neutral"`.
      *
      * @returns Value of property `footerColor`
      */
    def getFooterColor(): ValueColor | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ValueColor * / any */ String) = js.native
    
    /**
      * Gets current value of property {@link #getFrameType frameType}.
      *
      * Frame types: 1x1, 2x1, and auto.
      *
      * Default value is `"Auto"`.
      *
      * @returns Value of property `frameType`
      */
    def getFrameType(): FrameType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof FrameType * / any */ String) = js.native
    
    /**
      * @experimental (since 1.96)
      *
      * Gets current value of property {@link #getPriority priority}.
      *
      * Adds a priority badge before the content. Works only in Generic Tile ActionMode.
      *
      * Default value is `None`.
      *
      * @returns Value of property `priority`
      */
    def getPriority(): Priority | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Priority * / any */ String) = js.native
    
    /**
      * @experimental (since 1.103)
      *
      * Gets current value of property {@link #getPriorityText priorityText}.
      *
      * Sets the Text inside the Priority badge in Generic Tile ActionMode.
      *
      * @returns Value of property `priorityText`
      */
    def getPriorityText(): String = js.native
    
    /**
      * @deprecated (since 1.38.0) - The TileContent control has now a fixed size, depending on the used media
      * (desktop, tablet or phone).
      *
      * Gets current value of property {@link #getSize size}.
      *
      * Updates the size of the tile. If it is not set, then the default size is applied based on the device
      * tile.
      *
      * Default value is `"Auto"`.
      *
      * @returns Value of property `size`
      */
    def getSize(): Size | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Size * / any */ String) = js.native
    
    /**
      * @since 1.100.0
      *
      * Gets current value of property {@link #getState state}.
      *
      * The load status.
      *
      * Default value is `Loaded`.
      *
      * @returns Value of property `state`
      */
    def getState(): LoadState | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof LoadState * / any */ String) = js.native
    
    /**
      * Gets current value of property {@link #getUnit unit}.
      *
      * The percent sign, the currency symbol, or the unit of measure.
      *
      * @returns Value of property `unit`
      */
    def getUnit(): String = js.native
    
    /**
      * Sets the aggregated {@link #getContent content}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setContent(/**
      * The content to set
      */
    oContent: typings.openui5.sapUiCoreControlMod.default): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getDisabled disabled}.
      *
      * Disables control if true.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setDisabled(): this.type = js.native
    def setDisabled(/**
      * New value for property `disabled`
      */
    bDisabled: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getFooter footer}.
      *
      * The footer text of the tile.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setFooter(): this.type = js.native
    def setFooter(/**
      * New value for property `footer`
      */
    sFooter: String): this.type = js.native
    
    /**
      * @since 1.44
      *
      * Sets a new value for property {@link #getFooterColor footerColor}.
      *
      * The semantic color of the footer.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `"Neutral"`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setFooterColor(): this.type = js.native
    def setFooterColor(
      /**
      * New value for property `footerColor`
      */
    sFooterColor: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ValueColor * / any */ String
    ): this.type = js.native
    def setFooterColor(/**
      * New value for property `footerColor`
      */
    sFooterColor: ValueColor): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getFrameType frameType}.
      *
      * Frame types: 1x1, 2x1, and auto.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `"Auto"`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setFrameType(): this.type = js.native
    def setFrameType(
      /**
      * New value for property `frameType`
      */
    sFrameType: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof FrameType * / any */ String
    ): this.type = js.native
    def setFrameType(/**
      * New value for property `frameType`
      */
    sFrameType: FrameType): this.type = js.native
    
    /**
      * @experimental (since 1.96)
      *
      * Sets a new value for property {@link #getPriority priority}.
      *
      * Adds a priority badge before the content. Works only in Generic Tile ActionMode.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `None`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setPriority(): this.type = js.native
    def setPriority(
      /**
      * New value for property `priority`
      */
    sPriority: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Priority * / any */ String
    ): this.type = js.native
    def setPriority(/**
      * New value for property `priority`
      */
    sPriority: Priority): this.type = js.native
    
    /**
      * @experimental (since 1.103)
      *
      * Sets a new value for property {@link #getPriorityText priorityText}.
      *
      * Sets the Text inside the Priority badge in Generic Tile ActionMode.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setPriorityText(): this.type = js.native
    def setPriorityText(/**
      * New value for property `priorityText`
      */
    sPriorityText: String): this.type = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Setter for protected property to enable or disable content rendering. This function does not invalidate
      * the control.
      *
      * @returns this To allow method chaining
      */
    def setRenderContent(/**
      * Determines whether the control's content is rendered or not
      */
    value: Boolean): this.type = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Setter for protected property to enable or disable footer rendering. This function does not invalidate
      * the control.
      *
      * @returns this to allow method chaining
      */
    def setRenderFooter(/**
      * Determines whether the control's footer is rendered or not
      */
    value: Boolean): this.type = js.native
    
    /**
      * @deprecated (since 1.38.0) - The TileContent control has now a fixed size, depending on the used media
      * (desktop, tablet or phone).
      *
      * Sets a new value for property {@link #getSize size}.
      *
      * Updates the size of the tile. If it is not set, then the default size is applied based on the device
      * tile.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `"Auto"`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setSize(): this.type = js.native
    def setSize(
      /**
      * New value for property `size`
      */
    sSize: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Size * / any */ String
    ): this.type = js.native
    def setSize(/**
      * New value for property `size`
      */
    sSize: Size): this.type = js.native
    
    /**
      * @since 1.100.0
      *
      * Sets a new value for property {@link #getState state}.
      *
      * The load status.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `Loaded`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setState(): this.type = js.native
    def setState(
      /**
      * New value for property `state`
      */
    sState: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof LoadState * / any */ String
    ): this.type = js.native
    def setState(/**
      * New value for property `state`
      */
    sState: LoadState): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getUnit unit}.
      *
      * The percent sign, the currency symbol, or the unit of measure.
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
      * Unbinds aggregation {@link #getContent content} from model data.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def unbindContent(): this.type = js.native
  }
  
  trait TileContentSettings
    extends StObject
       with ControlSettings {
    
    /**
      * The switchable view that depends on the tile type.
      */
    var content: js.UndefOr[typings.openui5.sapUiCoreControlMod.default] = js.undefined
    
    /**
      * Disables control if true.
      */
    var disabled: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * The footer text of the tile.
      */
    var footer: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * @since 1.44
      *
      * The semantic color of the footer.
      */
    var footerColor: js.UndefOr[
        ValueColor | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ValueColor * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * Frame types: 1x1, 2x1, and auto.
      */
    var frameType: js.UndefOr[
        FrameType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof FrameType * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * @experimental (since 1.96)
      *
      * Adds a priority badge before the content. Works only in Generic Tile ActionMode.
      */
    var priority: js.UndefOr[
        Priority | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Priority * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * @experimental (since 1.103)
      *
      * Sets the Text inside the Priority badge in Generic Tile ActionMode.
      */
    var priorityText: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * @deprecated (since 1.38.0) - The TileContent control has now a fixed size, depending on the used media
      * (desktop, tablet or phone).
      *
      * Updates the size of the tile. If it is not set, then the default size is applied based on the device
      * tile.
      */
    var size: js.UndefOr[
        Size | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Size * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * @since 1.100.0
      *
      * The load status.
      */
    var state: js.UndefOr[
        LoadState | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof LoadState * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * The percent sign, the currency symbol, or the unit of measure.
      */
    var unit: js.UndefOr[String | PropertyBindingInfo] = js.undefined
  }
  object TileContentSettings {
    
    inline def apply(): TileContentSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TileContentSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TileContentSettings] (val x: Self) extends AnyVal {
      
      inline def setContent(value: typings.openui5.sapUiCoreControlMod.default): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setDisabled(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setFooter(value: String | PropertyBindingInfo): Self = StObject.set(x, "footer", value.asInstanceOf[js.Any])
      
      inline def setFooterColor(
        value: ValueColor | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ValueColor * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "footerColor", value.asInstanceOf[js.Any])
      
      inline def setFooterColorUndefined: Self = StObject.set(x, "footerColor", js.undefined)
      
      inline def setFooterUndefined: Self = StObject.set(x, "footer", js.undefined)
      
      inline def setFrameType(
        value: FrameType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof FrameType * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "frameType", value.asInstanceOf[js.Any])
      
      inline def setFrameTypeUndefined: Self = StObject.set(x, "frameType", js.undefined)
      
      inline def setPriority(
        value: Priority | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Priority * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
      
      inline def setPriorityText(value: String | PropertyBindingInfo): Self = StObject.set(x, "priorityText", value.asInstanceOf[js.Any])
      
      inline def setPriorityTextUndefined: Self = StObject.set(x, "priorityText", js.undefined)
      
      inline def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
      
      inline def setSize(
        value: Size | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Size * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setState(
        value: LoadState | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof LoadState * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
      
      inline def setUnit(value: String | PropertyBindingInfo): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
      
      inline def setUnitUndefined: Self = StObject.set(x, "unit", js.undefined)
    }
  }
}
