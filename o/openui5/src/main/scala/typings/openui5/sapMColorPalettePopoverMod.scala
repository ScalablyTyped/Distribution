package typings.openui5

import typings.openui5.anon.Alpha
import typings.openui5.anon.DefaultAction
import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreControlMod.ControlSettings
import typings.openui5.sapUiCoreLibraryMod.CSSColor
import typings.openui5.sapUiUnifiedColorPickerDisplayModeMod.ColorPickerDisplayMode
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapMColorPalettePopoverMod {
  
  @JSImport("sap/m/ColorPalettePopover", JSImport.Default)
  @js.native
  /**
    * Constructor for a new `ColorPalettePopover`.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends ColorPalettePopover {
    def this(/**
      * Initial settings for the new control
      */
    mSettings: ColorPalettePopoverSettings) = this()
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
    mSettings: ColorPalettePopoverSettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new control
      */
    mSettings: ColorPalettePopoverSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/m/ColorPalettePopover", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.m.ColorPalettePopover with name `sClassName` and enriches it with
      * the information contained in `oClassInfo`.
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
    oClassInfo: ClassInfo[T, ColorPalettePopover]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, ColorPalettePopover],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.m.ColorPalettePopover.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait ColorPalettePopover
    extends typings.openui5.sapUiCoreControlMod.default {
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:colorSelect colorSelect} event of this `sap.m.ColorPalettePopover`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.ColorPalettePopover` itself.
      *
      * Fired when the user selects a color.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachColorSelect(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachColorSelect(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.ColorPalettePopover` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:colorSelect colorSelect} event of this `sap.m.ColorPalettePopover`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.ColorPalettePopover` itself.
      *
      * Fired when the user selects a color.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachColorSelect(
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
    def attachColorSelect(
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
      * Context object to call the event handler with. Defaults to this `sap.m.ColorPalettePopover` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * @SINCE 1.85
      *
      * Attaches event handler `fnFunction` to the {@link #event:liveChange liveChange} event of this `sap.m.ColorPalettePopover`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.ColorPalettePopover` itself.
      *
      * Fired when the value is changed by user interaction in the internal ColorPicker of the ColorPalette
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
      * Context object to call the event handler with. Defaults to this `sap.m.ColorPalettePopover` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * @SINCE 1.85
      *
      * Attaches event handler `fnFunction` to the {@link #event:liveChange liveChange} event of this `sap.m.ColorPalettePopover`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.ColorPalettePopover` itself.
      *
      * Fired when the value is changed by user interaction in the internal ColorPicker of the ColorPalette
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
      * Context object to call the event handler with. Defaults to this `sap.m.ColorPalettePopover` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Closes the `ColorPalettePopover`.
      *
      * @returns Reference to the closed control
      */
    def close(): typings.openui5.sapUiCoreControlMod.default = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:colorSelect colorSelect} event of this `sap.m.ColorPalettePopover`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachColorSelect(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachColorSelect(
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
      * @SINCE 1.85
      *
      * Detaches event handler `fnFunction` from the {@link #event:liveChange liveChange} event of this `sap.m.ColorPalettePopover`.
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
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
      * Fires event {@link #event:colorSelect colorSelect} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireColorSelect(): this.type = js.native
    def fireColorSelect(/**
      * Parameters to pass along with the event
      */
    mParameters: DefaultAction): this.type = js.native
    
    /**
      * @SINCE 1.85
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
      * Fires event {@link #event:liveChange liveChange} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireLiveChange(): this.type = js.native
    def fireLiveChange(/**
      * Parameters to pass along with the event
      */
    mParameters: Alpha): this.type = js.native
    
    /**
      * Gets current value of property {@link #getColors colors}.
      *
      * Defines the list of colors displayed in the palette. Minimum is 2 colors, maximum is 15 colors.
      *
      * Default value is `["gold", "darkorange", "indianred", "darkmagenta", "cornflowerblue", "deepskyblue",
      * "darkcyan", "olivedrab", "darkslategray", "azure", "white", "lightgray", "darkgray", "dimgray", "black"]`.
      *
      * @returns Value of property `colors`
      */
    def getColors(): js.Array[CSSColor] = js.native
    
    /**
      * Gets current value of property {@link #getDefaultColor defaultColor}.
      *
      * The color, which the app developer will receive when end-user chooses the "Default color" button. See
      * event {@link #event:colorSelect colorSelect}.
      *
      * @returns Value of property `defaultColor`
      */
    def getDefaultColor(): CSSColor = js.native
    
    /**
      * @SINCE 1.70
      *
      * Gets current value of property {@link #getDisplayMode displayMode}.
      *
      * Determines the `displayMode` of the `ColorPicker` among three types - Default, Large and Simplified
      *
      * Default value is `Default`.
      *
      * @returns Value of property `displayMode`
      */
    def getDisplayMode(): ColorPickerDisplayMode | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ColorPickerDisplayMode * / any */ String) = js.native
    
    /**
      * Gets current value of property {@link #getShowDefaultColorButton showDefaultColorButton}.
      *
      * Indicates if the button for default color selection is available.
      *
      * Default value is `true`.
      *
      * @returns Value of property `showDefaultColorButton`
      */
    def getShowDefaultColorButton(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getShowMoreColorsButton showMoreColorsButton}.
      *
      * Whether the popover shows a "More colors..." button that opens an additional color picker for the user
      * to choose specific colors, not present in the predefined range.
      *
      * Default value is `true`.
      *
      * @returns Value of property `showMoreColorsButton`
      */
    def getShowMoreColorsButton(): Boolean = js.native
    
    /**
      * @SINCE 1.74
      *
      * Gets current value of property {@link #getShowRecentColorsSection showRecentColorsSection}.
      *
      * Indicates if the Recent Colors section is available
      *
      * Default value is `true`.
      *
      * @returns Value of property `showRecentColorsSection`
      */
    def getShowRecentColorsSection(): Boolean = js.native
    
    /**
      * Opens the `ColorPalettePopover`.
      *
      * On table or desktop devices, the popover is positioned relative to the given `oControl` parameter. On
      * phones, it is shown full screen, the `oControl` parameter is ignored.
      *
      * @returns Reference to the opened control
      */
    def openBy(
      /**
      * When displayed on a tablet or desktop device, the `ColorPalettePopover` is positioned relative to this
      * control
      */
    oCpntrol: typings.openui5.sapUiCoreControlMod.default
    ): typings.openui5.sapUiCoreControlMod.default = js.native
    
    /**
      * Sets a selected color for the ColorPicker control.
      *
      * @returns `this` for method chaining
      */
    def setColorPickerSelectedColor(/**
      * the selected color
      */
    color: CSSColor): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getColors colors}.
      *
      * Defines the list of colors displayed in the palette. Minimum is 2 colors, maximum is 15 colors.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `["gold", "darkorange", "indianred", "darkmagenta", "cornflowerblue", "deepskyblue",
      * "darkcyan", "olivedrab", "darkslategray", "azure", "white", "lightgray", "darkgray", "dimgray", "black"]`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setColors(): this.type = js.native
    def setColors(/**
      * New value for property `colors`
      */
    sColors: js.Array[CSSColor]): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getDefaultColor defaultColor}.
      *
      * The color, which the app developer will receive when end-user chooses the "Default color" button. See
      * event {@link #event:colorSelect colorSelect}.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setDefaultColor(): this.type = js.native
    def setDefaultColor(/**
      * New value for property `defaultColor`
      */
    sDefaultColor: CSSColor): this.type = js.native
    
    /**
      * @SINCE 1.70
      *
      * Sets a new value for property {@link #getDisplayMode displayMode}.
      *
      * Determines the `displayMode` of the `ColorPicker` among three types - Default, Large and Simplified
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `Default`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setDisplayMode(): this.type = js.native
    def setDisplayMode(
      /**
      * New value for property `displayMode`
      */
    sDisplayMode: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ColorPickerDisplayMode * / any */ String
    ): this.type = js.native
    def setDisplayMode(/**
      * New value for property `displayMode`
      */
    sDisplayMode: ColorPickerDisplayMode): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getShowDefaultColorButton showDefaultColorButton}.
      *
      * Indicates if the button for default color selection is available.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setShowDefaultColorButton(): this.type = js.native
    def setShowDefaultColorButton(/**
      * New value for property `showDefaultColorButton`
      */
    bShowDefaultColorButton: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getShowMoreColorsButton showMoreColorsButton}.
      *
      * Whether the popover shows a "More colors..." button that opens an additional color picker for the user
      * to choose specific colors, not present in the predefined range.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setShowMoreColorsButton(): this.type = js.native
    def setShowMoreColorsButton(/**
      * New value for property `showMoreColorsButton`
      */
    bShowMoreColorsButton: Boolean): this.type = js.native
    
    /**
      * @SINCE 1.74
      *
      * Sets a new value for property {@link #getShowRecentColorsSection showRecentColorsSection}.
      *
      * Indicates if the Recent Colors section is available
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setShowRecentColorsSection(): this.type = js.native
    def setShowRecentColorsSection(/**
      * New value for property `showRecentColorsSection`
      */
    bShowRecentColorsSection: Boolean): this.type = js.native
  }
  
  trait ColorPalettePopoverSettings
    extends StObject
       with ControlSettings {
    
    /**
      * Fired when the user selects a color.
      */
    var colorSelect: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * Defines the list of colors displayed in the palette. Minimum is 2 colors, maximum is 15 colors.
      */
    var colors: js.UndefOr[
        js.Array[CSSColor] | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * The color, which the app developer will receive when end-user chooses the "Default color" button. See
      * event {@link #event:colorSelect colorSelect}.
      */
    var defaultColor: js.UndefOr[
        CSSColor | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @SINCE 1.70
      *
      * Determines the `displayMode` of the `ColorPicker` among three types - Default, Large and Simplified
      */
    var displayMode: js.UndefOr[
        ColorPickerDisplayMode | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ColorPickerDisplayMode * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * @SINCE 1.85
      *
      * Fired when the value is changed by user interaction in the internal ColorPicker of the ColorPalette
      */
    var liveChange: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * Indicates if the button for default color selection is available.
      */
    var showDefaultColorButton: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Whether the popover shows a "More colors..." button that opens an additional color picker for the user
      * to choose specific colors, not present in the predefined range.
      */
    var showMoreColorsButton: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @SINCE 1.74
      *
      * Indicates if the Recent Colors section is available
      */
    var showRecentColorsSection: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
  }
  object ColorPalettePopoverSettings {
    
    inline def apply(): ColorPalettePopoverSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ColorPalettePopoverSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ColorPalettePopoverSettings] (val x: Self) extends AnyVal {
      
      inline def setColorSelect(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "colorSelect", js.Any.fromFunction1(value))
      
      inline def setColorSelectUndefined: Self = StObject.set(x, "colorSelect", js.undefined)
      
      inline def setColors(
        value: js.Array[CSSColor] | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
      
      inline def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
      
      inline def setColorsVarargs(value: CSSColor*): Self = StObject.set(x, "colors", js.Array(value*))
      
      inline def setDefaultColor(value: CSSColor | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "defaultColor", value.asInstanceOf[js.Any])
      
      inline def setDefaultColorUndefined: Self = StObject.set(x, "defaultColor", js.undefined)
      
      inline def setDisplayMode(
        value: ColorPickerDisplayMode | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ColorPickerDisplayMode * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "displayMode", value.asInstanceOf[js.Any])
      
      inline def setDisplayModeUndefined: Self = StObject.set(x, "displayMode", js.undefined)
      
      inline def setLiveChange(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "liveChange", js.Any.fromFunction1(value))
      
      inline def setLiveChangeUndefined: Self = StObject.set(x, "liveChange", js.undefined)
      
      inline def setShowDefaultColorButton(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "showDefaultColorButton", value.asInstanceOf[js.Any])
      
      inline def setShowDefaultColorButtonUndefined: Self = StObject.set(x, "showDefaultColorButton", js.undefined)
      
      inline def setShowMoreColorsButton(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "showMoreColorsButton", value.asInstanceOf[js.Any])
      
      inline def setShowMoreColorsButtonUndefined: Self = StObject.set(x, "showMoreColorsButton", js.undefined)
      
      inline def setShowRecentColorsSection(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "showRecentColorsSection", value.asInstanceOf[js.Any])
      
      inline def setShowRecentColorsSectionUndefined: Self = StObject.set(x, "showRecentColorsSection", js.undefined)
    }
  }
}
