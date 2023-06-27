package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreControlMod.ControlSettings
import typings.openui5.sapUiUnifiedColorPickerDisplayModeMod.ColorPickerDisplayMode
import typings.openui5.sapUiUnifiedLibraryMod.ColorPickerMode
import typings.std.HTMLElement
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiUnifiedColorPickerPopoverMod {
  
  @JSImport("sap/ui/unified/ColorPickerPopover", JSImport.Default)
  @js.native
  /**
    * Constructor for a new `ColorPickerPopover`.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends ColorPickerPopover {
    def this(/**
      * Initial settings for the new control
      */
    mSettings: ColorPickerPopoverSettings) = this()
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
    mSettings: ColorPickerPopoverSettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new control
      */
    mSettings: ColorPickerPopoverSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/unified/ColorPickerPopover", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.unified.ColorPickerPopover with name `sClassName` and enriches
      * it with the information contained in `oClassInfo`.
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
    oClassInfo: ClassInfo[T, ColorPickerPopover]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, ColorPickerPopover],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.unified.ColorPickerPopover.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait ColorPickerPopover
    extends typings.openui5.sapUiCoreControlMod.default {
    
    /**
      * @since 1.60.0
      *
      * Attaches event handler `fnFunction` to the {@link #event:change change} event of this `sap.ui.unified.ColorPickerPopover`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.unified.ColorPickerPopover` itself.
      *
      * Fired when the submit button of the popover is clicked.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachChange(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ ColorPickerPopoverChangeEvent, Unit]
    ): this.type = js.native
    def attachChange(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ ColorPickerPopoverChangeEvent, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.unified.ColorPickerPopover` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * @since 1.60.0
      *
      * Attaches event handler `fnFunction` to the {@link #event:change change} event of this `sap.ui.unified.ColorPickerPopover`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.unified.ColorPickerPopover` itself.
      *
      * Fired when the submit button of the popover is clicked.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachChange(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ ColorPickerPopoverChangeEvent, Unit]
    ): this.type = js.native
    def attachChange(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ ColorPickerPopoverChangeEvent, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.unified.ColorPickerPopover` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * @since 1.85
      *
      * Attaches event handler `fnFunction` to the {@link #event:liveChange liveChange} event of this `sap.ui.unified.ColorPickerPopover`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.unified.ColorPickerPopover` itself.
      *
      * Fired when the value is changed by user interaction in the internal ColorPicker
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachLiveChange(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ ColorPickerPopoverLiveChangeEvent, Unit]
    ): this.type = js.native
    def attachLiveChange(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ ColorPickerPopoverLiveChangeEvent, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.unified.ColorPickerPopover` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * @since 1.85
      *
      * Attaches event handler `fnFunction` to the {@link #event:liveChange liveChange} event of this `sap.ui.unified.ColorPickerPopover`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.unified.ColorPickerPopover` itself.
      *
      * Fired when the value is changed by user interaction in the internal ColorPicker
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
    fnFunction: js.Function1[/* p1 */ ColorPickerPopoverLiveChangeEvent, Unit]
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
    fnFunction: js.Function1[/* p1 */ ColorPickerPopoverLiveChangeEvent, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.unified.ColorPickerPopover` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Closes the `ColorPickerPopover`.
      */
    def close(): typings.openui5.sapUiCoreControlMod.default = js.native
    
    /**
      * @since 1.60.0
      *
      * Detaches event handler `fnFunction` from the {@link #event:change change} event of this `sap.ui.unified.ColorPickerPopover`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachChange(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ ColorPickerPopoverChangeEvent, Unit]
    ): this.type = js.native
    def detachChange(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ ColorPickerPopoverChangeEvent, Unit],
      /**
      * Context object on which the given function had to be called
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * @since 1.85
      *
      * Detaches event handler `fnFunction` from the {@link #event:liveChange liveChange} event of this `sap.ui.unified.ColorPickerPopover`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachLiveChange(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ ColorPickerPopoverLiveChangeEvent, Unit]
    ): this.type = js.native
    def detachLiveChange(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ ColorPickerPopoverLiveChangeEvent, Unit],
      /**
      * Context object on which the given function had to be called
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * @since 1.60.0
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Fires event {@link #event:change change} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireChange(): this.type = js.native
    def fireChange(
      /**
      * Parameters to pass along with the event
      */
    mParameters: ColorPickerPopover$ChangeEventParameters
    ): this.type = js.native
    
    /**
      * @since 1.85
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Fires event {@link #event:liveChange liveChange} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireLiveChange(): this.type = js.native
    def fireLiveChange(
      /**
      * Parameters to pass along with the event
      */
    mParameters: ColorPickerPopover$LiveChangeEventParameters
    ): this.type = js.native
    
    /**
      * @since 1.60.0
      *
      * Gets current value of property {@link #getColorString colorString}.
      *
      * Determines the input parameter that can be a string of type HEX, RGB, HSV, or a CSS color name:
      *
      * 	 - HEX - #FFFFFF
      * 	 - RGB - rgb(255,255,255)
      * 	 - HSV - hsv(360,100,100)
      * 	 - CSS - red  **Note:** The output parameter is an RGB string of the current color.
      *
      * @returns Value of property `colorString`
      */
    def getColorString(): String = js.native
    
    /**
      * @since 1.60.0
      *
      * Gets current value of property {@link #getDisplayMode displayMode}.
      *
      * Determines the display mode of the `ColorPicker` among three types - Default, Large and Simplified
      *
      * Default value is `Default`.
      *
      * @returns Value of property `displayMode`
      */
    def getDisplayMode(): ColorPickerDisplayMode | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ColorPickerDisplayMode * / any */ String) = js.native
    
    /**
      * @since 1.60.0
      *
      * Gets current value of property {@link #getMode mode}.
      *
      * Determines the color mode of the `ColorPicker`.
      *
      * Default value is `HSV`.
      *
      * @returns Value of property `mode`
      */
    def getMode(): ColorPickerMode | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ColorPickerMode * / any */ String) = js.native
    
    /**
      * Opens the `ColorPickerPopover`. The popover is positioned relative to the control parameter on tablet
      * or desktop and is full screen on phone. Therefore the openBy parameter is only used on tablet or desktop
      * and is ignored on phone.
      *
      * @returns Reference to the opening control
      */
    def openBy(
      /**
      * When this control is displayed on tablet or desktop, the `ColorPickerPopover` is positioned relative
      * to this control
      */
    openBy: typings.openui5.sapUiCoreControlMod.default
    ): Any = js.native
    def openBy(
      /**
      * When this control is displayed on tablet or desktop, the `ColorPickerPopover` is positioned relative
      * to this control
      */
    openBy: HTMLElement
    ): Any = js.native
    
    /**
      * @since 1.60.0
      *
      * Sets a new value for property {@link #getColorString colorString}.
      *
      * Determines the input parameter that can be a string of type HEX, RGB, HSV, or a CSS color name:
      *
      * 	 - HEX - #FFFFFF
      * 	 - RGB - rgb(255,255,255)
      * 	 - HSV - hsv(360,100,100)
      * 	 - CSS - red  **Note:** The output parameter is an RGB string of the current color.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setColorString(): this.type = js.native
    def setColorString(/**
      * New value for property `colorString`
      */
    sColorString: String): this.type = js.native
    
    /**
      * @since 1.60.0
      *
      * Sets a new value for property {@link #getDisplayMode displayMode}.
      *
      * Determines the display mode of the `ColorPicker` among three types - Default, Large and Simplified
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
      * @since 1.60.0
      *
      * Sets a new value for property {@link #getMode mode}.
      *
      * Determines the color mode of the `ColorPicker`.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `HSV`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setMode(): this.type = js.native
    def setMode(
      /**
      * New value for property `mode`
      */
    sMode: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ColorPickerMode * / any */ String
    ): this.type = js.native
    def setMode(/**
      * New value for property `mode`
      */
    sMode: ColorPickerMode): this.type = js.native
  }
  
  trait ColorPickerPopover$ChangeEventParameters extends StObject {
    
    /**
      * Parameter containing the alpha value (transparency).
      */
    var alpha: js.UndefOr[String] = js.undefined
    
    /**
      * Parameter containing the BLUE value (0-255).
      */
    var b: js.UndefOr[int] = js.undefined
    
    /**
      * Parameter containing the GREEN value (0-255).
      */
    var g: js.UndefOr[int] = js.undefined
    
    /**
      * Parameter containing the HUE value (0-360).
      */
    var h: js.UndefOr[int] = js.undefined
    
    /**
      * Parameter containing the Hexadecimal string (#FFFFFF).
      */
    var hex: js.UndefOr[String] = js.undefined
    
    /**
      * Parameter containing the LIGHTNESS value (0-100).
      */
    var l: js.UndefOr[int] = js.undefined
    
    /**
      * Parameter containing the RED value (0-255).
      */
    var r: js.UndefOr[int] = js.undefined
    
    /**
      * Parameter containing the SATURATION value (0-100).
      */
    var s: js.UndefOr[int] = js.undefined
    
    /**
      * Parameter containing the VALUE value (0-100).
      */
    var v: js.UndefOr[int] = js.undefined
  }
  object ColorPickerPopover$ChangeEventParameters {
    
    inline def apply(): ColorPickerPopover$ChangeEventParameters = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ColorPickerPopover$ChangeEventParameters]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ColorPickerPopover$ChangeEventParameters] (val x: Self) extends AnyVal {
      
      inline def setAlpha(value: String): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
      
      inline def setAlphaUndefined: Self = StObject.set(x, "alpha", js.undefined)
      
      inline def setB(value: int): Self = StObject.set(x, "b", value.asInstanceOf[js.Any])
      
      inline def setBUndefined: Self = StObject.set(x, "b", js.undefined)
      
      inline def setG(value: int): Self = StObject.set(x, "g", value.asInstanceOf[js.Any])
      
      inline def setGUndefined: Self = StObject.set(x, "g", js.undefined)
      
      inline def setH(value: int): Self = StObject.set(x, "h", value.asInstanceOf[js.Any])
      
      inline def setHUndefined: Self = StObject.set(x, "h", js.undefined)
      
      inline def setHex(value: String): Self = StObject.set(x, "hex", value.asInstanceOf[js.Any])
      
      inline def setHexUndefined: Self = StObject.set(x, "hex", js.undefined)
      
      inline def setL(value: int): Self = StObject.set(x, "l", value.asInstanceOf[js.Any])
      
      inline def setLUndefined: Self = StObject.set(x, "l", js.undefined)
      
      inline def setR(value: int): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
      
      inline def setRUndefined: Self = StObject.set(x, "r", js.undefined)
      
      inline def setS(value: int): Self = StObject.set(x, "s", value.asInstanceOf[js.Any])
      
      inline def setSUndefined: Self = StObject.set(x, "s", js.undefined)
      
      inline def setV(value: int): Self = StObject.set(x, "v", value.asInstanceOf[js.Any])
      
      inline def setVUndefined: Self = StObject.set(x, "v", js.undefined)
    }
  }
  
  trait ColorPickerPopover$LiveChangeEventParameters extends StObject {
    
    /**
      * Parameter containing the alpha value (transparency).
      */
    var alpha: js.UndefOr[String] = js.undefined
    
    /**
      * Parameter containing the BLUE value (0-255).
      */
    var b: js.UndefOr[int] = js.undefined
    
    /**
      * Parameter containing the GREEN value (0-255).
      */
    var g: js.UndefOr[int] = js.undefined
    
    /**
      * Parameter containing the HUE value (0-360).
      */
    var h: js.UndefOr[int] = js.undefined
    
    /**
      * Parameter containing the Hexadecimal string (#FFFFFF).
      */
    var hex: js.UndefOr[String] = js.undefined
    
    /**
      * Parameter containing the LIGHTNESS value (0-100).
      */
    var l: js.UndefOr[int] = js.undefined
    
    /**
      * Parameter containing the RED value (0-255).
      */
    var r: js.UndefOr[int] = js.undefined
    
    /**
      * Parameter containing the SATURATION value (0-100).
      */
    var s: js.UndefOr[int] = js.undefined
    
    /**
      * Parameter containing the VALUE value (0-100).
      */
    var v: js.UndefOr[int] = js.undefined
  }
  object ColorPickerPopover$LiveChangeEventParameters {
    
    inline def apply(): ColorPickerPopover$LiveChangeEventParameters = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ColorPickerPopover$LiveChangeEventParameters]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ColorPickerPopover$LiveChangeEventParameters] (val x: Self) extends AnyVal {
      
      inline def setAlpha(value: String): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
      
      inline def setAlphaUndefined: Self = StObject.set(x, "alpha", js.undefined)
      
      inline def setB(value: int): Self = StObject.set(x, "b", value.asInstanceOf[js.Any])
      
      inline def setBUndefined: Self = StObject.set(x, "b", js.undefined)
      
      inline def setG(value: int): Self = StObject.set(x, "g", value.asInstanceOf[js.Any])
      
      inline def setGUndefined: Self = StObject.set(x, "g", js.undefined)
      
      inline def setH(value: int): Self = StObject.set(x, "h", value.asInstanceOf[js.Any])
      
      inline def setHUndefined: Self = StObject.set(x, "h", js.undefined)
      
      inline def setHex(value: String): Self = StObject.set(x, "hex", value.asInstanceOf[js.Any])
      
      inline def setHexUndefined: Self = StObject.set(x, "hex", js.undefined)
      
      inline def setL(value: int): Self = StObject.set(x, "l", value.asInstanceOf[js.Any])
      
      inline def setLUndefined: Self = StObject.set(x, "l", js.undefined)
      
      inline def setR(value: int): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
      
      inline def setRUndefined: Self = StObject.set(x, "r", js.undefined)
      
      inline def setS(value: int): Self = StObject.set(x, "s", value.asInstanceOf[js.Any])
      
      inline def setSUndefined: Self = StObject.set(x, "s", js.undefined)
      
      inline def setV(value: int): Self = StObject.set(x, "v", value.asInstanceOf[js.Any])
      
      inline def setVUndefined: Self = StObject.set(x, "v", js.undefined)
    }
  }
  
  type ColorPickerPopoverChangeEvent = typings.openui5.sapUiBaseEventMod.default[ColorPickerPopover$ChangeEventParameters]
  
  type ColorPickerPopoverChangeEventParameters = ColorPickerPopover$ChangeEventParameters
  
  type ColorPickerPopoverLiveChangeEvent = typings.openui5.sapUiBaseEventMod.default[ColorPickerPopover$LiveChangeEventParameters]
  
  type ColorPickerPopoverLiveChangeEventParameters = ColorPickerPopover$LiveChangeEventParameters
  
  trait ColorPickerPopoverSettings
    extends StObject
       with ControlSettings {
    
    /**
      * @since 1.60.0
      *
      * Fired when the submit button of the popover is clicked.
      */
    var change: js.UndefOr[
        js.Function1[
          /* oEvent */ typings.openui5.sapUiBaseEventMod.default[ColorPickerPopover$ChangeEventParameters], 
          Unit
        ]
      ] = js.undefined
    
    /**
      * @since 1.60.0
      *
      * Determines the input parameter that can be a string of type HEX, RGB, HSV, or a CSS color name:
      *
      * 	 - HEX - #FFFFFF
      * 	 - RGB - rgb(255,255,255)
      * 	 - HSV - hsv(360,100,100)
      * 	 - CSS - red  **Note:** The output parameter is an RGB string of the current color.
      */
    var colorString: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * @since 1.60.0
      *
      * Determines the display mode of the `ColorPicker` among three types - Default, Large and Simplified
      */
    var displayMode: js.UndefOr[
        ColorPickerDisplayMode | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ColorPickerDisplayMode * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * @since 1.85
      *
      * Fired when the value is changed by user interaction in the internal ColorPicker
      */
    var liveChange: js.UndefOr[
        js.Function1[
          /* oEvent */ typings.openui5.sapUiBaseEventMod.default[ColorPickerPopover$LiveChangeEventParameters], 
          Unit
        ]
      ] = js.undefined
    
    /**
      * @since 1.60.0
      *
      * Determines the color mode of the `ColorPicker`.
      */
    var mode: js.UndefOr[
        ColorPickerMode | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ColorPickerMode * / any */ String) | PropertyBindingInfo
      ] = js.undefined
  }
  object ColorPickerPopoverSettings {
    
    inline def apply(): ColorPickerPopoverSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ColorPickerPopoverSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ColorPickerPopoverSettings] (val x: Self) extends AnyVal {
      
      inline def setChange(
        value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default[ColorPickerPopover$ChangeEventParameters] => Unit
      ): Self = StObject.set(x, "change", js.Any.fromFunction1(value))
      
      inline def setChangeUndefined: Self = StObject.set(x, "change", js.undefined)
      
      inline def setColorString(value: String | PropertyBindingInfo): Self = StObject.set(x, "colorString", value.asInstanceOf[js.Any])
      
      inline def setColorStringUndefined: Self = StObject.set(x, "colorString", js.undefined)
      
      inline def setDisplayMode(
        value: ColorPickerDisplayMode | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ColorPickerDisplayMode * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "displayMode", value.asInstanceOf[js.Any])
      
      inline def setDisplayModeUndefined: Self = StObject.set(x, "displayMode", js.undefined)
      
      inline def setLiveChange(
        value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default[ColorPickerPopover$LiveChangeEventParameters] => Unit
      ): Self = StObject.set(x, "liveChange", js.Any.fromFunction1(value))
      
      inline def setLiveChangeUndefined: Self = StObject.set(x, "liveChange", js.undefined)
      
      inline def setMode(
        value: ColorPickerMode | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ColorPickerMode * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    }
  }
}
