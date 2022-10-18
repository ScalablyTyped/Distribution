package typings.openui5

import typings.openui5.anon.Value
import typings.openui5.sap.ClassInfo
import typings.openui5.sapMInputBaseMod.InputBaseSettings
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreLibraryMod.CSSSize
import typings.openui5.sapUiCoreLibraryMod.Wrapping
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapMTextAreaMod {
  
  @JSImport("sap/m/TextArea", JSImport.Default)
  @js.native
  /**
    * Constructor for a new TextArea.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    * See:
    * 	{@link fiori:https://experience.sap.com/fiori-design-web/text-area/ Text Area}
    */
  open class default () extends TextArea {
    def this(/**
      * Initial settings for the new control
      */
    mSettings: TextAreaSettings) = this()
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
    mSettings: TextAreaSettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new control
      */
    mSettings: TextAreaSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/m/TextArea", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.m.TextArea with name `sClassName` and enriches it with the information
      * contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.m.InputBase.extend}.
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
    oClassInfo: ClassInfo[T, TextArea]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, TextArea],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.m.TextArea.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait TextArea
    extends typings.openui5.sapMInputBaseMod.default {
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:liveChange liveChange} event of this `sap.m.TextArea`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.TextArea` itself.
      *
      * Is fired whenever the user has modified the text shown on the text area.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachLiveChange(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachLiveChange(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.TextArea` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:liveChange liveChange} event of this `sap.m.TextArea`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.TextArea` itself.
      *
      * Is fired whenever the user has modified the text shown on the text area.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachLiveChange(
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
    def attachLiveChange(
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
      * Context object to call the event handler with. Defaults to this `sap.m.TextArea` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:liveChange liveChange} event of this `sap.m.TextArea`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachLiveChange(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachLiveChange(
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
      * Fires event {@link #event:liveChange liveChange} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireLiveChange(): this.type = js.native
    def fireLiveChange(/**
      * Parameters to pass along with the event
      */
    mParameters: Value): this.type = js.native
    
    /**
      * Gets current value of property {@link #getCols cols}.
      *
      * Defines the visible width of the control, in average character widths. **Note:** The `width` property
      * wins over the `cols` property, if both are set.
      *
      * Default value is `20`.
      *
      * @returns Value of property `cols`
      */
    def getCols(): int = js.native
    
    /**
      * @SINCE 1.38.0
      *
      * Gets current value of property {@link #getGrowing growing}.
      *
      * Indicates the ability of the control to automatically grow and shrink dynamically with its content. **Note:**
      * This property should not be used when the `height` property is set.
      *
      * Default value is `false`.
      *
      * @returns Value of property `growing`
      */
    def getGrowing(): Boolean = js.native
    
    /**
      * @SINCE 1.38.0
      *
      * Gets current value of property {@link #getGrowingMaxLines growingMaxLines}.
      *
      * Defines the maximum number of lines that the control can grow.
      *
      * Default value is `0`.
      *
      * @returns Value of property `growingMaxLines`
      */
    def getGrowingMaxLines(): int = js.native
    
    /**
      * Gets current value of property {@link #getHeight height}.
      *
      * Defines the height of the control.
      *
      * @returns Value of property `height`
      */
    def getHeight(): CSSSize = js.native
    
    /**
      * Gets current value of property {@link #getMaxLength maxLength}.
      *
      * Defines the maximum number of characters that the `value` can be.
      *
      * Default value is `0`.
      *
      * @returns Value of property `maxLength`
      */
    def getMaxLength(): int = js.native
    
    /**
      * Gets current value of property {@link #getRows rows}.
      *
      * Defines the number of visible text lines for the control. **Note:** The `height` property wins over the
      * `rows` property, if both are set.
      *
      * Default value is `2`.
      *
      * @returns Value of property `rows`
      */
    def getRows(): int = js.native
    
    /**
      * @SINCE 1.48
      *
      * Gets current value of property {@link #getShowExceededText showExceededText}.
      *
      * Determines whether the characters, exceeding the maximum allowed character count, are visible in the
      * input field.
      *
      * If set to `false` the user is not allowed to enter more characters than what is set in the `maxLength`
      * property. If set to `true` the characters exceeding the `maxLength` value are selected on paste and the
      * counter below the input field displays their number.
      *
      * Default value is `false`.
      *
      * @returns Value of property `showExceededText`
      */
    def getShowExceededText(): Boolean = js.native
    
    /**
      * @SINCE 1.30
      *
      * Gets current value of property {@link #getValueLiveUpdate valueLiveUpdate}.
      *
      * Indicates when the `value` property gets updated with the user changes. Setting it to `true` updates
      * the `value` property whenever the user has modified the text shown on the text area.
      *
      * Default value is `false`.
      *
      * @returns Value of property `valueLiveUpdate`
      */
    def getValueLiveUpdate(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getWrapping wrapping}.
      *
      * Indicates how the control wraps the text, e.g. `Soft`, `Hard`, `Off`.
      *
      * Default value is `None`.
      *
      * @returns Value of property `wrapping`
      */
    def getWrapping(): Wrapping | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Wrapping * / any */ String) = js.native
    
    /**
      * Sets a new value for property {@link #getCols cols}.
      *
      * Defines the visible width of the control, in average character widths. **Note:** The `width` property
      * wins over the `cols` property, if both are set.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `20`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setCols(): this.type = js.native
    def setCols(/**
      * New value for property `cols`
      */
    iCols: int): this.type = js.native
    
    /**
      * @SINCE 1.38.0
      *
      * Sets a new value for property {@link #getGrowing growing}.
      *
      * Indicates the ability of the control to automatically grow and shrink dynamically with its content. **Note:**
      * This property should not be used when the `height` property is set.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setGrowing(): this.type = js.native
    def setGrowing(/**
      * New value for property `growing`
      */
    bGrowing: Boolean): this.type = js.native
    
    /**
      * @SINCE 1.38.0
      *
      * Sets a new value for property {@link #getGrowingMaxLines growingMaxLines}.
      *
      * Defines the maximum number of lines that the control can grow.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `0`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setGrowingMaxLines(): this.type = js.native
    def setGrowingMaxLines(/**
      * New value for property `growingMaxLines`
      */
    iGrowingMaxLines: int): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getHeight height}.
      *
      * Defines the height of the control.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setHeight(): this.type = js.native
    def setHeight(/**
      * New value for property `height`
      */
    sHeight: CSSSize): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getMaxLength maxLength}.
      *
      * Defines the maximum number of characters that the `value` can be.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `0`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setMaxLength(): this.type = js.native
    def setMaxLength(/**
      * New value for property `maxLength`
      */
    iMaxLength: int): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getRows rows}.
      *
      * Defines the number of visible text lines for the control. **Note:** The `height` property wins over the
      * `rows` property, if both are set.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `2`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setRows(): this.type = js.native
    def setRows(/**
      * New value for property `rows`
      */
    iRows: int): this.type = js.native
    
    /**
      * @SINCE 1.48
      *
      * Sets a new value for property {@link #getShowExceededText showExceededText}.
      *
      * Determines whether the characters, exceeding the maximum allowed character count, are visible in the
      * input field.
      *
      * If set to `false` the user is not allowed to enter more characters than what is set in the `maxLength`
      * property. If set to `true` the characters exceeding the `maxLength` value are selected on paste and the
      * counter below the input field displays their number.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setShowExceededText(): this.type = js.native
    def setShowExceededText(/**
      * New value for property `showExceededText`
      */
    bShowExceededText: Boolean): this.type = js.native
    
    /**
      * @SINCE 1.30
      *
      * Sets a new value for property {@link #getValueLiveUpdate valueLiveUpdate}.
      *
      * Indicates when the `value` property gets updated with the user changes. Setting it to `true` updates
      * the `value` property whenever the user has modified the text shown on the text area.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setValueLiveUpdate(): this.type = js.native
    def setValueLiveUpdate(/**
      * New value for property `valueLiveUpdate`
      */
    bValueLiveUpdate: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getWrapping wrapping}.
      *
      * Indicates how the control wraps the text, e.g. `Soft`, `Hard`, `Off`.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `None`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setWrapping(): this.type = js.native
    def setWrapping(
      /**
      * New value for property `wrapping`
      */
    sWrapping: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Wrapping * / any */ String
    ): this.type = js.native
    def setWrapping(/**
      * New value for property `wrapping`
      */
    sWrapping: Wrapping): this.type = js.native
  }
  
  trait TextAreaSettings
    extends StObject
       with InputBaseSettings {
    
    /**
      * Defines the visible width of the control, in average character widths. **Note:** The `width` property
      * wins over the `cols` property, if both are set.
      */
    var cols: js.UndefOr[int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * @SINCE 1.38.0
      *
      * Indicates the ability of the control to automatically grow and shrink dynamically with its content. **Note:**
      * This property should not be used when the `height` property is set.
      */
    var growing: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @SINCE 1.38.0
      *
      * Defines the maximum number of lines that the control can grow.
      */
    var growingMaxLines: js.UndefOr[int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * Defines the height of the control.
      */
    var height: js.UndefOr[
        CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Is fired whenever the user has modified the text shown on the text area.
      */
    var liveChange: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * Defines the maximum number of characters that the `value` can be.
      */
    var maxLength: js.UndefOr[int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * Defines the number of visible text lines for the control. **Note:** The `height` property wins over the
      * `rows` property, if both are set.
      */
    var rows: js.UndefOr[int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * @SINCE 1.48
      *
      * Determines whether the characters, exceeding the maximum allowed character count, are visible in the
      * input field.
      *
      * If set to `false` the user is not allowed to enter more characters than what is set in the `maxLength`
      * property. If set to `true` the characters exceeding the `maxLength` value are selected on paste and the
      * counter below the input field displays their number.
      */
    var showExceededText: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @SINCE 1.30
      *
      * Indicates when the `value` property gets updated with the user changes. Setting it to `true` updates
      * the `value` property whenever the user has modified the text shown on the text area.
      */
    var valueLiveUpdate: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Indicates how the control wraps the text, e.g. `Soft`, `Hard`, `Off`.
      */
    var wrapping: js.UndefOr[
        Wrapping | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Wrapping * / any */ String) | PropertyBindingInfo
      ] = js.undefined
  }
  object TextAreaSettings {
    
    inline def apply(): TextAreaSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TextAreaSettings]
    }
    
    extension [Self <: TextAreaSettings](x: Self) {
      
      inline def setCols(value: int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "cols", value.asInstanceOf[js.Any])
      
      inline def setColsUndefined: Self = StObject.set(x, "cols", js.undefined)
      
      inline def setGrowing(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "growing", value.asInstanceOf[js.Any])
      
      inline def setGrowingMaxLines(value: int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "growingMaxLines", value.asInstanceOf[js.Any])
      
      inline def setGrowingMaxLinesUndefined: Self = StObject.set(x, "growingMaxLines", js.undefined)
      
      inline def setGrowingUndefined: Self = StObject.set(x, "growing", js.undefined)
      
      inline def setHeight(value: CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setLiveChange(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "liveChange", js.Any.fromFunction1(value))
      
      inline def setLiveChangeUndefined: Self = StObject.set(x, "liveChange", js.undefined)
      
      inline def setMaxLength(value: int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
      
      inline def setMaxLengthUndefined: Self = StObject.set(x, "maxLength", js.undefined)
      
      inline def setRows(value: int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
      
      inline def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
      
      inline def setShowExceededText(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "showExceededText", value.asInstanceOf[js.Any])
      
      inline def setShowExceededTextUndefined: Self = StObject.set(x, "showExceededText", js.undefined)
      
      inline def setValueLiveUpdate(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "valueLiveUpdate", value.asInstanceOf[js.Any])
      
      inline def setValueLiveUpdateUndefined: Self = StObject.set(x, "valueLiveUpdate", js.undefined)
      
      inline def setWrapping(
        value: Wrapping | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Wrapping * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "wrapping", value.asInstanceOf[js.Any])
      
      inline def setWrappingUndefined: Self = StObject.set(x, "wrapping", js.undefined)
    }
  }
}
