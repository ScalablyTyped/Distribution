package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapMLibraryMod.DeviationIndicator
import typings.openui5.sapMLibraryMod.LoadState
import typings.openui5.sapMLibraryMod.Size
import typings.openui5.sapMLibraryMod.ValueColor
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreControlMod.ControlSettings
import typings.openui5.sapUiCoreLibraryMod.CSSSize
import typings.openui5.sapUiCoreLibraryMod.URI
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapMNumericContentMod {
  
  @JSImport("sap/m/NumericContent", JSImport.Default)
  @js.native
  /**
    * Constructor for a new sap.m.GenericTile control.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends NumericContent {
    def this(/**
      * initial settings for the new control
      */
    mSettings: NumericContentSettings) = this()
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
    mSettings: NumericContentSettings
    ) = this()
    def this(
      /**
      * id for the new control, generated automatically if no id is given
      */
    sId: Unit,
      /**
      * initial settings for the new control
      */
    mSettings: NumericContentSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/m/NumericContent", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.m.NumericContent with name `sClassName` and enriches it with the
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
    oClassInfo: ClassInfo[T, NumericContent]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, NumericContent],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.m.NumericContent.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait NumericContent
    extends typings.openui5.sapUiCoreControlMod.default {
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:press press} event of this `sap.m.NumericContent`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.NumericContent` itself.
      *
      * The event is fired when the user chooses the numeric content.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachPress(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachPress(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.NumericContent` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:press press} event of this `sap.m.NumericContent`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.NumericContent` itself.
      *
      * The event is fired when the user chooses the numeric content.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachPress(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachPress(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.NumericContent` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:press press} event of this `sap.m.NumericContent`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachPress(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachPress(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object on which the given function had to be called
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Fires event {@link #event:press press} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def firePress(): this.type = js.native
    def firePress(/**
      * Parameters to pass along with the event
      */
    mParameters: js.Object): this.type = js.native
    
    /**
      * @SINCE 1.73
      * @EXPERIMENTAL (since 1.73) - Disclaimer: this property is in a beta state - incompatible API changes
      * may be done before its official public release. Use at your own discretion.
      *
      * Gets current value of property {@link #getAdaptiveFontSize adaptiveFontSize}.
      *
      * If set to its default value true this property applies the appropriate font style class based on the
      * language. When set to false the font size will always be large
      *
      * Default value is `true`.
      *
      * @returns Value of property `adaptiveFontSize`
      */
    def getAdaptiveFontSize(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getAnimateTextChange animateTextChange}.
      *
      * If set to true, the change of the value will be animated.
      *
      * Default value is `true`.
      *
      * @returns Value of property `animateTextChange`
      */
    def getAnimateTextChange(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getFormatterValue formatterValue}.
      *
      * If set to true, the value parameter contains a numeric value and scale. If set to false (default), the
      * value parameter contains a numeric value only.
      *
      * Default value is `false`.
      *
      * @returns Value of property `formatterValue`
      */
    def getFormatterValue(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getIcon icon}.
      *
      * The icon to be displayed as a graphical element within the control. This can be an image or an icon from
      * the icon font.
      *
      * @returns Value of property `icon`
      */
    def getIcon(): URI = js.native
    
    /**
      * Gets current value of property {@link #getIconDescription iconDescription}.
      *
      * Description of an icon that is used in the tooltip.
      *
      * @returns Value of property `iconDescription`
      */
    def getIconDescription(): String = js.native
    
    /**
      * Gets current value of property {@link #getIndicator indicator}.
      *
      * The indicator arrow that shows value deviation.
      *
      * Default value is `"None"`.
      *
      * @returns Value of property `indicator`
      */
    def getIndicator(): DeviationIndicator | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof DeviationIndicator * / any */ String) = js.native
    
    /**
      * Gets current value of property {@link #getNullifyValue nullifyValue}.
      *
      * If set to true, the omitted value property is set to 0.
      *
      * Default value is `true`.
      *
      * @returns Value of property `nullifyValue`
      */
    def getNullifyValue(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getScale scale}.
      *
      * The scaling prefix. Financial characters can be used for currencies and counters. The SI prefixes can
      * be used for units. If the scaling prefix contains more than three characters, only the first three characters
      * are displayed.
      *
      * @returns Value of property `scale`
      */
    def getScale(): String = js.native
    
    /**
      * @deprecated (since 1.38.0) - The NumericContent control has now a fixed size, depending on the used media
      * (desktop, tablet or phone).
      *
      * Gets current value of property {@link #getSize size}.
      *
      * Updates the size of the control. If not set, then the default size is applied based on the device tile.
      *
      * Default value is `"Auto"`.
      *
      * @returns Value of property `size`
      */
    def getSize(): Size | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Size * / any */ String) = js.native
    
    /**
      * Gets current value of property {@link #getState state}.
      *
      * Indicates the load status.
      *
      * Default value is `"Loaded"`.
      *
      * @returns Value of property `state`
      */
    def getState(): LoadState | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof LoadState * / any */ String) = js.native
    
    /**
      * Gets current value of property {@link #getTruncateValueTo truncateValueTo}.
      *
      * The number of characters of the `value` property to display.
      *
      * **Note** If `adaptiveFontSize` is set to `true` the default value of this property will vary between
      * languages. If `adaptiveFontSize` is set to `false` the default value of this property is `4`.
      *
      * @returns Value of property `truncateValueTo`
      */
    def getTruncateValueTo(): int = js.native
    
    /**
      * Gets current value of property {@link #getValue value}.
      *
      * The actual value.
      *
      * @returns Value of property `value`
      */
    def getValue(): String = js.native
    
    /**
      * Gets current value of property {@link #getValueColor valueColor}.
      *
      * The semantic color of the value.
      *
      * Default value is `"Neutral"`.
      *
      * @returns Value of property `valueColor`
      */
    def getValueColor(): ValueColor | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ValueColor * / any */ String) = js.native
    
    /**
      * Gets current value of property {@link #getWidth width}.
      *
      * The width of the control. If it is not set, the size of the control is defined by the 'size' property.
      *
      * @returns Value of property `width`
      */
    def getWidth(): CSSSize = js.native
    
    /**
      * Gets current value of property {@link #getWithMargin withMargin}.
      *
      * If the value is set to false, the content is adjusted to the whole size of the control.
      *
      * Default value is `true`.
      *
      * @returns Value of property `withMargin`
      */
    def getWithMargin(): Boolean = js.native
    
    /**
      * @SINCE 1.73
      * @EXPERIMENTAL (since 1.73) - Disclaimer: this property is in a beta state - incompatible API changes
      * may be done before its official public release. Use at your own discretion.
      *
      * Sets a new value for property {@link #getAdaptiveFontSize adaptiveFontSize}.
      *
      * If set to its default value true this property applies the appropriate font style class based on the
      * language. When set to false the font size will always be large
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setAdaptiveFontSize(): this.type = js.native
    def setAdaptiveFontSize(/**
      * New value for property `adaptiveFontSize`
      */
    bAdaptiveFontSize: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getAnimateTextChange animateTextChange}.
      *
      * If set to true, the change of the value will be animated.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setAnimateTextChange(): this.type = js.native
    def setAnimateTextChange(/**
      * New value for property `animateTextChange`
      */
    bAnimateTextChange: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getFormatterValue formatterValue}.
      *
      * If set to true, the value parameter contains a numeric value and scale. If set to false (default), the
      * value parameter contains a numeric value only.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setFormatterValue(): this.type = js.native
    def setFormatterValue(/**
      * New value for property `formatterValue`
      */
    bFormatterValue: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getIcon icon}.
      *
      * The icon to be displayed as a graphical element within the control. This can be an image or an icon from
      * the icon font.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setIcon(): this.type = js.native
    def setIcon(/**
      * New value for property `icon`
      */
    sIcon: URI): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getIconDescription iconDescription}.
      *
      * Description of an icon that is used in the tooltip.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setIconDescription(): this.type = js.native
    def setIconDescription(/**
      * New value for property `iconDescription`
      */
    sIconDescription: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getIndicator indicator}.
      *
      * The indicator arrow that shows value deviation.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `"None"`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setIndicator(): this.type = js.native
    def setIndicator(
      /**
      * New value for property `indicator`
      */
    sIndicator: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof DeviationIndicator * / any */ String
    ): this.type = js.native
    def setIndicator(/**
      * New value for property `indicator`
      */
    sIndicator: DeviationIndicator): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getNullifyValue nullifyValue}.
      *
      * If set to true, the omitted value property is set to 0.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setNullifyValue(): this.type = js.native
    def setNullifyValue(/**
      * New value for property `nullifyValue`
      */
    bNullifyValue: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getScale scale}.
      *
      * The scaling prefix. Financial characters can be used for currencies and counters. The SI prefixes can
      * be used for units. If the scaling prefix contains more than three characters, only the first three characters
      * are displayed.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setScale(): this.type = js.native
    def setScale(/**
      * New value for property `scale`
      */
    sScale: String): this.type = js.native
    
    /**
      * @deprecated (since 1.38.0) - The NumericContent control has now a fixed size, depending on the used media
      * (desktop, tablet or phone).
      *
      * Sets a new value for property {@link #getSize size}.
      *
      * Updates the size of the control. If not set, then the default size is applied based on the device tile.
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
      * Sets a new value for property {@link #getState state}.
      *
      * Indicates the load status.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `"Loaded"`.
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
      * Sets a new value for property {@link #getTruncateValueTo truncateValueTo}.
      *
      * The number of characters of the `value` property to display.
      *
      * **Note** If `adaptiveFontSize` is set to `true` the default value of this property will vary between
      * languages. If `adaptiveFontSize` is set to `false` the default value of this property is `4`.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setTruncateValueTo(/**
      * New value for property `truncateValueTo`
      */
    iTruncateValueTo: int): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getValue value}.
      *
      * The actual value.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setValue(): this.type = js.native
    def setValue(/**
      * New value for property `value`
      */
    sValue: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getValueColor valueColor}.
      *
      * The semantic color of the value.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `"Neutral"`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setValueColor(): this.type = js.native
    def setValueColor(
      /**
      * New value for property `valueColor`
      */
    sValueColor: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ValueColor * / any */ String
    ): this.type = js.native
    def setValueColor(/**
      * New value for property `valueColor`
      */
    sValueColor: ValueColor): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getWidth width}.
      *
      * The width of the control. If it is not set, the size of the control is defined by the 'size' property.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setWidth(): this.type = js.native
    def setWidth(/**
      * New value for property `width`
      */
    sWidth: CSSSize): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getWithMargin withMargin}.
      *
      * If the value is set to false, the content is adjusted to the whole size of the control.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setWithMargin(): this.type = js.native
    def setWithMargin(/**
      * New value for property `withMargin`
      */
    bWithMargin: Boolean): this.type = js.native
  }
  
  trait NumericContentSettings
    extends StObject
       with ControlSettings {
    
    /**
      * @SINCE 1.73
      * @EXPERIMENTAL (since 1.73) - Disclaimer: this property is in a beta state - incompatible API changes
      * may be done before its official public release. Use at your own discretion.
      *
      * If set to its default value true this property applies the appropriate font style class based on the
      * language. When set to false the font size will always be large
      */
    var adaptiveFontSize: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * If set to true, the change of the value will be animated.
      */
    var animateTextChange: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * If set to true, the value parameter contains a numeric value and scale. If set to false (default), the
      * value parameter contains a numeric value only.
      */
    var formatterValue: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * The icon to be displayed as a graphical element within the control. This can be an image or an icon from
      * the icon font.
      */
    var icon: js.UndefOr[URI | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * Description of an icon that is used in the tooltip.
      */
    var iconDescription: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * The indicator arrow that shows value deviation.
      */
    var indicator: js.UndefOr[
        DeviationIndicator | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof DeviationIndicator * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * If set to true, the omitted value property is set to 0.
      */
    var nullifyValue: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * The event is fired when the user chooses the numeric content.
      */
    var press: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * The scaling prefix. Financial characters can be used for currencies and counters. The SI prefixes can
      * be used for units. If the scaling prefix contains more than three characters, only the first three characters
      * are displayed.
      */
    var scale: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * @deprecated (since 1.38.0) - The NumericContent control has now a fixed size, depending on the used media
      * (desktop, tablet or phone).
      *
      * Updates the size of the control. If not set, then the default size is applied based on the device tile.
      */
    var size: js.UndefOr[
        Size | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Size * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * Indicates the load status.
      */
    var state: js.UndefOr[
        LoadState | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof LoadState * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * The number of characters of the `value` property to display.
      *
      * **Note** If `adaptiveFontSize` is set to `true` the default value of this property will vary between
      * languages. If `adaptiveFontSize` is set to `false` the default value of this property is `4`.
      */
    var truncateValueTo: js.UndefOr[int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * The actual value.
      */
    var value: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * The semantic color of the value.
      */
    var valueColor: js.UndefOr[
        ValueColor | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ValueColor * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * The width of the control. If it is not set, the size of the control is defined by the 'size' property.
      */
    var width: js.UndefOr[
        CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * If the value is set to false, the content is adjusted to the whole size of the control.
      */
    var withMargin: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
  }
  object NumericContentSettings {
    
    inline def apply(): NumericContentSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NumericContentSettings]
    }
    
    extension [Self <: NumericContentSettings](x: Self) {
      
      inline def setAdaptiveFontSize(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "adaptiveFontSize", value.asInstanceOf[js.Any])
      
      inline def setAdaptiveFontSizeUndefined: Self = StObject.set(x, "adaptiveFontSize", js.undefined)
      
      inline def setAnimateTextChange(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "animateTextChange", value.asInstanceOf[js.Any])
      
      inline def setAnimateTextChangeUndefined: Self = StObject.set(x, "animateTextChange", js.undefined)
      
      inline def setFormatterValue(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "formatterValue", value.asInstanceOf[js.Any])
      
      inline def setFormatterValueUndefined: Self = StObject.set(x, "formatterValue", js.undefined)
      
      inline def setIcon(value: URI | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconDescription(value: String | PropertyBindingInfo): Self = StObject.set(x, "iconDescription", value.asInstanceOf[js.Any])
      
      inline def setIconDescriptionUndefined: Self = StObject.set(x, "iconDescription", js.undefined)
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setIndicator(
        value: DeviationIndicator | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof DeviationIndicator * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "indicator", value.asInstanceOf[js.Any])
      
      inline def setIndicatorUndefined: Self = StObject.set(x, "indicator", js.undefined)
      
      inline def setNullifyValue(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "nullifyValue", value.asInstanceOf[js.Any])
      
      inline def setNullifyValueUndefined: Self = StObject.set(x, "nullifyValue", js.undefined)
      
      inline def setPress(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "press", js.Any.fromFunction1(value))
      
      inline def setPressUndefined: Self = StObject.set(x, "press", js.undefined)
      
      inline def setScale(value: String | PropertyBindingInfo): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
      
      inline def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
      
      inline def setSize(
        value: Size | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Size * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setState(
        value: LoadState | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof LoadState * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
      
      inline def setTruncateValueTo(value: int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "truncateValueTo", value.asInstanceOf[js.Any])
      
      inline def setTruncateValueToUndefined: Self = StObject.set(x, "truncateValueTo", js.undefined)
      
      inline def setValue(value: String | PropertyBindingInfo): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueColor(
        value: ValueColor | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ValueColor * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "valueColor", value.asInstanceOf[js.Any])
      
      inline def setValueColorUndefined: Self = StObject.set(x, "valueColor", js.undefined)
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      inline def setWidth(value: CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      inline def setWithMargin(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "withMargin", value.asInstanceOf[js.Any])
      
      inline def setWithMarginUndefined: Self = StObject.set(x, "withMargin", js.undefined)
    }
  }
}
