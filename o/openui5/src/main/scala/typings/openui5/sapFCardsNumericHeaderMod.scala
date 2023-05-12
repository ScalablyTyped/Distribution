package typings.openui5

import typings.openui5.anon.Level
import typings.openui5.sap.ClassInfo
import typings.openui5.sapFCardsBaseHeaderMod.BaseHeaderSettings
import typings.openui5.sapFLibraryMod.cards.IHeader
import typings.openui5.sapFLibraryMod.cards.NumericHeaderSideIndicatorsAlignment
import typings.openui5.sapMLibraryMod.DeviationIndicator
import typings.openui5.sapMLibraryMod.ValueColor
import typings.openui5.sapUiBaseManagedObjectMod.AggregationBindingInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapFCardsNumericHeaderMod {
  
  @JSImport("sap/f/cards/NumericHeader", JSImport.Default)
  @js.native
  /**
    * Constructor for a new `NumericHeader`.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends NumericHeader {
    def this(/**
      * Initial settings for the new control
      */
    mSettings: NumericHeaderSettings) = this()
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
    mSettings: NumericHeaderSettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new control
      */
    mSettings: NumericHeaderSettings
    ) = this()
    
    /* CompleteClass */
    var __implements__sap_f_cards_IHeader: Boolean = js.native
  }
  /* static members */
  object default {
    
    @JSImport("sap/f/cards/NumericHeader", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.f.cards.NumericHeader with name `sClassName` and enriches it with
      * the information contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.f.cards.BaseHeader.extend}.
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
    oClassInfo: ClassInfo[T, NumericHeader]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, NumericHeader],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.f.cards.NumericHeader.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait NumericHeader
    extends typings.openui5.sapFCardsBaseHeaderMod.default
       with IHeader {
    
    /**
      * Adds some sideIndicator to the aggregation {@link #getSideIndicators sideIndicators}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addSideIndicator(
      /**
      * The sideIndicator to add; if empty, nothing is inserted
      */
    oSideIndicator: typings.openui5.sapFCardsNumericSideIndicatorMod.default
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:press press} event of this `sap.f.cards.NumericHeader`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.f.cards.NumericHeader` itself.
      *
      * Fires when the user presses the control.
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
      * Context object to call the event handler with. Defaults to this `sap.f.cards.NumericHeader` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:press press} event of this `sap.f.cards.NumericHeader`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.f.cards.NumericHeader` itself.
      *
      * Fires when the user presses the control.
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
      * Context object to call the event handler with. Defaults to this `sap.f.cards.NumericHeader` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Destroys all the sideIndicators in the aggregation {@link #getSideIndicators sideIndicators}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroySideIndicators(): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:press press} event of this `sap.f.cards.NumericHeader`.
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
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
      * This method is a hook for the RenderManager that gets called during the rendering of child Controls.
      * It allows to add, remove and update existing accessibility attributes (ARIA) of those controls.
      */
    def enhanceAccessibilityState(
      /**
      * The Control that gets rendered by the RenderManager
      */
    oElement: typings.openui5.sapUiCoreControlMod.default,
      /**
      * The mapping of "aria-" prefixed attributes
      */
    mAriaProps: Level
    ): Unit = js.native
    
    /**
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
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
      * Gets current value of property {@link #getDetails details}.
      *
      * Additional text which adds more details to what is shown in the numeric header.
      *
      * @returns Value of property `details`
      */
    def getDetails(): String = js.native
    
    /**
      * @EXPERIMENTAL (since 1.101)
      *
      * Gets current value of property {@link #getDetailsMaxLines detailsMaxLines}.
      *
      * Limits the number of lines for the details.
      *
      * Default value is `1`.
      *
      * @returns Value of property `detailsMaxLines`
      */
    def getDetailsMaxLines(): int = js.native
    
    /**
      * Gets current value of property {@link #getNumber number}.
      *
      * The numeric value of the main number indicator. If the value contains more than five characters, only
      * the first five are displayed. Without rounding the number.
      *
      * @returns Value of property `number`
      */
    def getNumber(): String = js.native
    
    /**
      * @SINCE 1.109
      *
      * Gets current value of property {@link #getNumberVisible numberVisible}.
      *
      * Whether the main numeric indicator is visible or not
      *
      * Default value is `true`.
      *
      * @returns Value of property `numberVisible`
      */
    def getNumberVisible(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getScale scale}.
      *
      * Defines the unit of measurement (scaling prefix) for the main indicator. Financial characters can be
      * used for currencies and counters. The International System of Units (SI) prefixes can be used. If the
      * unit contains more than three characters, only the first three characters are displayed.
      *
      * @returns Value of property `scale`
      */
    def getScale(): String = js.native
    
    /**
      * Gets content of aggregation {@link #getSideIndicators sideIndicators}.
      *
      * Additional side number indicators. For example "Deviation" and "Target". Not more than two side indicators
      * should be used.
      */
    def getSideIndicators(): js.Array[typings.openui5.sapFCardsNumericSideIndicatorMod.default] = js.native
    
    /**
      * Gets current value of property {@link #getSideIndicatorsAlignment sideIndicatorsAlignment}.
      *
      * The alignment of the side indicators.
      *
      * Default value is `"Begin"`.
      *
      * @returns Value of property `sideIndicatorsAlignment`
      */
    def getSideIndicatorsAlignment(): NumericHeaderSideIndicatorsAlignment | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof cards.NumericHeaderSideIndicatorsAlignment * / any */ String) = js.native
    
    /**
      * @EXPERIMENTAL (since 1.64) - Disclaimer: this property is in a beta state - incompatible API changes
      * may be done before its official public release. Use at your own discretion.
      *
      * Gets current value of property {@link #getState state}.
      *
      * The semantic color which represents the state of the main number indicator.
      *
      * Default value is `"Neutral"`.
      *
      * @returns Value of property `state`
      */
    def getState(): ValueColor | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ValueColor * / any */ String) = js.native
    
    /**
      * Gets current value of property {@link #getStatusText statusText}.
      *
      * Defines the status text.
      *
      * Default value is `empty string`.
      *
      * @returns Value of property `statusText`
      */
    def getStatusText(): String = js.native
    
    /**
      * Gets current value of property {@link #getSubtitle subtitle}.
      *
      * The subtitle of the card
      *
      * @returns Value of property `subtitle`
      */
    def getSubtitle(): String = js.native
    
    /**
      * @EXPERIMENTAL (since 1.101)
      *
      * Gets current value of property {@link #getSubtitleMaxLines subtitleMaxLines}.
      *
      * Limits the number of lines for the subtitle.
      *
      * Default value is `2`.
      *
      * @returns Value of property `subtitleMaxLines`
      */
    def getSubtitleMaxLines(): int = js.native
    
    /**
      * Gets current value of property {@link #getTitle title}.
      *
      * The title of the card
      *
      * @returns Value of property `title`
      */
    def getTitle(): String = js.native
    
    /**
      * @EXPERIMENTAL (since 1.101)
      *
      * Gets current value of property {@link #getTitleMaxLines titleMaxLines}.
      *
      * Limits the number of lines for the title.
      *
      * Default value is `3`.
      *
      * @returns Value of property `titleMaxLines`
      */
    def getTitleMaxLines(): int = js.native
    
    /**
      * Gets current value of property {@link #getTrend trend}.
      *
      * The direction of the trend arrow. Shows deviation for the value of the main number indicator.
      *
      * Default value is `"None"`.
      *
      * @returns Value of property `trend`
      */
    def getTrend(): DeviationIndicator | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof DeviationIndicator * / any */ String) = js.native
    
    /**
      * Gets current value of property {@link #getUnitOfMeasurement unitOfMeasurement}.
      *
      * General unit of measurement for the header. Displayed as side information to the subtitle.
      *
      * @returns Value of property `unitOfMeasurement`
      */
    def getUnitOfMeasurement(): String = js.native
    
    /**
      * Checks for the provided `sap.f.cards.NumericSideIndicator` in the aggregation {@link #getSideIndicators
      * sideIndicators}. and returns its index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfSideIndicator(
      /**
      * The sideIndicator whose index is looked for
      */
    oSideIndicator: typings.openui5.sapFCardsNumericSideIndicatorMod.default
    ): int = js.native
    
    /**
      * Inserts a sideIndicator into the aggregation {@link #getSideIndicators sideIndicators}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def insertSideIndicator(
      /**
      * The sideIndicator to insert; if empty, nothing is inserted
      */
    oSideIndicator: typings.openui5.sapFCardsNumericSideIndicatorMod.default,
      /**
      * The `0`-based index the sideIndicator should be inserted at; for a negative value of `iIndex`, the sideIndicator
      * is inserted at position 0; for a value greater than the current size of the aggregation, the sideIndicator
      * is inserted at the last position
      */
    iIndex: int
    ): this.type = js.native
    
    /**
      * Removes all the controls from the aggregation {@link #getSideIndicators sideIndicators}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllSideIndicators(): js.Array[typings.openui5.sapFCardsNumericSideIndicatorMod.default] = js.native
    
    def removeSideIndicator(/**
      * The sideIndicator to remove or its index or id
      */
    vSideIndicator: String): typings.openui5.sapFCardsNumericSideIndicatorMod.default | Null = js.native
    /**
      * Removes a sideIndicator from the aggregation {@link #getSideIndicators sideIndicators}.
      *
      * @returns The removed sideIndicator or `null`
      */
    def removeSideIndicator(/**
      * The sideIndicator to remove or its index or id
      */
    vSideIndicator: int): typings.openui5.sapFCardsNumericSideIndicatorMod.default | Null = js.native
    def removeSideIndicator(
      /**
      * The sideIndicator to remove or its index or id
      */
    vSideIndicator: typings.openui5.sapFCardsNumericSideIndicatorMod.default
    ): typings.openui5.sapFCardsNumericSideIndicatorMod.default | Null = js.native
    
    /**
      * Sets a new value for property {@link #getDetails details}.
      *
      * Additional text which adds more details to what is shown in the numeric header.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setDetails(/**
      * New value for property `details`
      */
    sDetails: String): this.type = js.native
    
    /**
      * @EXPERIMENTAL (since 1.101)
      *
      * Sets a new value for property {@link #getDetailsMaxLines detailsMaxLines}.
      *
      * Limits the number of lines for the details.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `1`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setDetailsMaxLines(): this.type = js.native
    def setDetailsMaxLines(/**
      * New value for property `detailsMaxLines`
      */
    iDetailsMaxLines: int): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getNumber number}.
      *
      * The numeric value of the main number indicator. If the value contains more than five characters, only
      * the first five are displayed. Without rounding the number.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setNumber(/**
      * New value for property `number`
      */
    sNumber: String): this.type = js.native
    
    /**
      * @SINCE 1.109
      *
      * Sets a new value for property {@link #getNumberVisible numberVisible}.
      *
      * Whether the main numeric indicator is visible or not
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setNumberVisible(): this.type = js.native
    def setNumberVisible(/**
      * New value for property `numberVisible`
      */
    bNumberVisible: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getScale scale}.
      *
      * Defines the unit of measurement (scaling prefix) for the main indicator. Financial characters can be
      * used for currencies and counters. The International System of Units (SI) prefixes can be used. If the
      * unit contains more than three characters, only the first three characters are displayed.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setScale(/**
      * New value for property `scale`
      */
    sScale: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getSideIndicatorsAlignment sideIndicatorsAlignment}.
      *
      * The alignment of the side indicators.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `"Begin"`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setSideIndicatorsAlignment(): this.type = js.native
    def setSideIndicatorsAlignment(
      /**
      * New value for property `sideIndicatorsAlignment`
      */
    sSideIndicatorsAlignment: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof cards.NumericHeaderSideIndicatorsAlignment * / any */ String
    ): this.type = js.native
    def setSideIndicatorsAlignment(
      /**
      * New value for property `sideIndicatorsAlignment`
      */
    sSideIndicatorsAlignment: NumericHeaderSideIndicatorsAlignment
    ): this.type = js.native
    
    /**
      * @EXPERIMENTAL (since 1.64) - Disclaimer: this property is in a beta state - incompatible API changes
      * may be done before its official public release. Use at your own discretion.
      *
      * Sets a new value for property {@link #getState state}.
      *
      * The semantic color which represents the state of the main number indicator.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `"Neutral"`.
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
      * Sets a new value for property {@link #getStatusText statusText}.
      *
      * Defines the status text.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `empty string`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setStatusText(): this.type = js.native
    def setStatusText(/**
      * New value for property `statusText`
      */
    sStatusText: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getSubtitle subtitle}.
      *
      * The subtitle of the card
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setSubtitle(/**
      * New value for property `subtitle`
      */
    sSubtitle: String): this.type = js.native
    
    /**
      * @EXPERIMENTAL (since 1.101)
      *
      * Sets a new value for property {@link #getSubtitleMaxLines subtitleMaxLines}.
      *
      * Limits the number of lines for the subtitle.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `2`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setSubtitleMaxLines(): this.type = js.native
    def setSubtitleMaxLines(/**
      * New value for property `subtitleMaxLines`
      */
    iSubtitleMaxLines: int): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getTitle title}.
      *
      * The title of the card
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setTitle(/**
      * New value for property `title`
      */
    sTitle: String): this.type = js.native
    
    /**
      * @EXPERIMENTAL (since 1.101)
      *
      * Sets a new value for property {@link #getTitleMaxLines titleMaxLines}.
      *
      * Limits the number of lines for the title.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `3`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setTitleMaxLines(): this.type = js.native
    def setTitleMaxLines(/**
      * New value for property `titleMaxLines`
      */
    iTitleMaxLines: int): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getTrend trend}.
      *
      * The direction of the trend arrow. Shows deviation for the value of the main number indicator.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `"None"`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setTrend(): this.type = js.native
    def setTrend(
      /**
      * New value for property `trend`
      */
    sTrend: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof DeviationIndicator * / any */ String
    ): this.type = js.native
    def setTrend(/**
      * New value for property `trend`
      */
    sTrend: DeviationIndicator): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getUnitOfMeasurement unitOfMeasurement}.
      *
      * General unit of measurement for the header. Displayed as side information to the subtitle.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setUnitOfMeasurement(/**
      * New value for property `unitOfMeasurement`
      */
    sUnitOfMeasurement: String): this.type = js.native
  }
  
  trait NumericHeaderSettings
    extends StObject
       with BaseHeaderSettings {
    
    /**
      * Additional text which adds more details to what is shown in the numeric header.
      */
    var details: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * @EXPERIMENTAL (since 1.101)
      *
      * Limits the number of lines for the details.
      */
    var detailsMaxLines: js.UndefOr[int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * The numeric value of the main number indicator. If the value contains more than five characters, only
      * the first five are displayed. Without rounding the number.
      */
    var number: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * @SINCE 1.109
      *
      * Whether the main numeric indicator is visible or not
      */
    var numberVisible: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Fires when the user presses the control.
      */
    var press: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * Defines the unit of measurement (scaling prefix) for the main indicator. Financial characters can be
      * used for currencies and counters. The International System of Units (SI) prefixes can be used. If the
      * unit contains more than three characters, only the first three characters are displayed.
      */
    var scale: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Additional side number indicators. For example "Deviation" and "Target". Not more than two side indicators
      * should be used.
      */
    var sideIndicators: js.UndefOr[
        js.Array[typings.openui5.sapFCardsNumericSideIndicatorMod.default] | typings.openui5.sapFCardsNumericSideIndicatorMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * The alignment of the side indicators.
      */
    var sideIndicatorsAlignment: js.UndefOr[
        NumericHeaderSideIndicatorsAlignment | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof cards.NumericHeaderSideIndicatorsAlignment * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * @EXPERIMENTAL (since 1.64) - Disclaimer: this property is in a beta state - incompatible API changes
      * may be done before its official public release. Use at your own discretion.
      *
      * The semantic color which represents the state of the main number indicator.
      */
    var state: js.UndefOr[
        ValueColor | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ValueColor * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * Defines the status text.
      */
    var statusText: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * The subtitle of the card
      */
    var subtitle: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * @EXPERIMENTAL (since 1.101)
      *
      * Limits the number of lines for the subtitle.
      */
    var subtitleMaxLines: js.UndefOr[int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * The title of the card
      */
    var title: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * @EXPERIMENTAL (since 1.101)
      *
      * Limits the number of lines for the title.
      */
    var titleMaxLines: js.UndefOr[int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * The direction of the trend arrow. Shows deviation for the value of the main number indicator.
      */
    var trend: js.UndefOr[
        DeviationIndicator | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof DeviationIndicator * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * General unit of measurement for the header. Displayed as side information to the subtitle.
      */
    var unitOfMeasurement: js.UndefOr[String | PropertyBindingInfo] = js.undefined
  }
  object NumericHeaderSettings {
    
    inline def apply(): NumericHeaderSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NumericHeaderSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NumericHeaderSettings] (val x: Self) extends AnyVal {
      
      inline def setDetails(value: String | PropertyBindingInfo): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
      
      inline def setDetailsMaxLines(value: int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "detailsMaxLines", value.asInstanceOf[js.Any])
      
      inline def setDetailsMaxLinesUndefined: Self = StObject.set(x, "detailsMaxLines", js.undefined)
      
      inline def setDetailsUndefined: Self = StObject.set(x, "details", js.undefined)
      
      inline def setNumber(value: String | PropertyBindingInfo): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
      
      inline def setNumberUndefined: Self = StObject.set(x, "number", js.undefined)
      
      inline def setNumberVisible(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "numberVisible", value.asInstanceOf[js.Any])
      
      inline def setNumberVisibleUndefined: Self = StObject.set(x, "numberVisible", js.undefined)
      
      inline def setPress(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "press", js.Any.fromFunction1(value))
      
      inline def setPressUndefined: Self = StObject.set(x, "press", js.undefined)
      
      inline def setScale(value: String | PropertyBindingInfo): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
      
      inline def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
      
      inline def setSideIndicators(
        value: js.Array[typings.openui5.sapFCardsNumericSideIndicatorMod.default] | typings.openui5.sapFCardsNumericSideIndicatorMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "sideIndicators", value.asInstanceOf[js.Any])
      
      inline def setSideIndicatorsAlignment(
        value: NumericHeaderSideIndicatorsAlignment | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof cards.NumericHeaderSideIndicatorsAlignment * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "sideIndicatorsAlignment", value.asInstanceOf[js.Any])
      
      inline def setSideIndicatorsAlignmentUndefined: Self = StObject.set(x, "sideIndicatorsAlignment", js.undefined)
      
      inline def setSideIndicatorsUndefined: Self = StObject.set(x, "sideIndicators", js.undefined)
      
      inline def setSideIndicatorsVarargs(value: typings.openui5.sapFCardsNumericSideIndicatorMod.default*): Self = StObject.set(x, "sideIndicators", js.Array(value*))
      
      inline def setState(
        value: ValueColor | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ValueColor * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
      
      inline def setStatusText(value: String | PropertyBindingInfo): Self = StObject.set(x, "statusText", value.asInstanceOf[js.Any])
      
      inline def setStatusTextUndefined: Self = StObject.set(x, "statusText", js.undefined)
      
      inline def setSubtitle(value: String | PropertyBindingInfo): Self = StObject.set(x, "subtitle", value.asInstanceOf[js.Any])
      
      inline def setSubtitleMaxLines(value: int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "subtitleMaxLines", value.asInstanceOf[js.Any])
      
      inline def setSubtitleMaxLinesUndefined: Self = StObject.set(x, "subtitleMaxLines", js.undefined)
      
      inline def setSubtitleUndefined: Self = StObject.set(x, "subtitle", js.undefined)
      
      inline def setTitle(value: String | PropertyBindingInfo): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleMaxLines(value: int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "titleMaxLines", value.asInstanceOf[js.Any])
      
      inline def setTitleMaxLinesUndefined: Self = StObject.set(x, "titleMaxLines", js.undefined)
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setTrend(
        value: DeviationIndicator | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof DeviationIndicator * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "trend", value.asInstanceOf[js.Any])
      
      inline def setTrendUndefined: Self = StObject.set(x, "trend", js.undefined)
      
      inline def setUnitOfMeasurement(value: String | PropertyBindingInfo): Self = StObject.set(x, "unitOfMeasurement", value.asInstanceOf[js.Any])
      
      inline def setUnitOfMeasurementUndefined: Self = StObject.set(x, "unitOfMeasurement", js.undefined)
    }
  }
}
