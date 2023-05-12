package typings.openui5

import typings.openui5.anon.Alpha
import typings.openui5.anon.DefaultAction
import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreControlMod.ControlSettings
import typings.openui5.sapUiCoreLibraryMod.CSSColor
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapMColorPaletteMod {
  
  @JSImport("sap/m/ColorPalette", JSImport.Default)
  @js.native
  /**
    * Constructor for a new `ColorPalette`.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    * See:
    * 	{@link sap.m.ColorPalettePopover}
    *
    * **Note:** The application developers should add dependency to `sap.ui.unified` library
    * on application level to ensure that the library is loaded before the module dependencies will be required.
    * The {@link sap.ui.unified.ColorPicker} is used internally only if the `ColorPicker`
    * is opened (not used for the initial rendering). If the `sap.ui.unified` library is not loaded
    * before the `ColorPicker` is opened, it will be loaded upon opening. This could lead to CSP compliance
    * issues and adds an additional waiting time when the `ColorPicker` is opened for the first time.
    * To prevent this, apps using the `ColorPalette` should also load the `sap.ui.unified` library in advance.
    */
  open class default () extends ColorPalette {
    def this(/**
      * Initial settings for the new control
      */
    mSettings: ColorPaletteSettings) = this()
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
    mSettings: ColorPaletteSettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new control
      */
    mSettings: ColorPaletteSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/m/ColorPalette", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.m.ColorPalette with name `sClassName` and enriches it with the information
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
    oClassInfo: ClassInfo[T, ColorPalette]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, ColorPalette],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.m.ColorPalette.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait ColorPalette
    extends typings.openui5.sapUiCoreControlMod.default {
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:colorSelect colorSelect} event of this `sap.m.ColorPalette`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.ColorPalette` itself.
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
      * Context object to call the event handler with. Defaults to this `sap.m.ColorPalette` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:colorSelect colorSelect} event of this `sap.m.ColorPalette`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.ColorPalette` itself.
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
      * Context object to call the event handler with. Defaults to this `sap.m.ColorPalette` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * @SINCE 1.85
      *
      * Attaches event handler `fnFunction` to the {@link #event:liveChange liveChange} event of this `sap.m.ColorPalette`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.ColorPalette` itself.
      *
      * Fired when the value is changed by user interaction in the internal ColorPicker
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
      * Context object to call the event handler with. Defaults to this `sap.m.ColorPalette` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * @SINCE 1.85
      *
      * Attaches event handler `fnFunction` to the {@link #event:liveChange liveChange} event of this `sap.m.ColorPalette`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.ColorPalette` itself.
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
      * Context object to call the event handler with. Defaults to this `sap.m.ColorPalette` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:colorSelect colorSelect} event of this `sap.m.ColorPalette`.
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
      * Detaches event handler `fnFunction` from the {@link #event:liveChange liveChange} event of this `sap.m.ColorPalette`.
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
      * Defines the List of colors displayed in the palette. Minimum is 2 colors, maximum is 15 colors.
      *
      * Default value is `["gold", "darkorange", "indianred", "darkmagenta", "cornflowerblue", "deepskyblue",
      * "darkcyan", "olivedrab", "darkslategray", "azure", "white", "lightgray", "darkgray", "dimgray", "black"]`.
      *
      * @returns Value of property `colors`
      */
    def getColors(): js.Array[CSSColor] = js.native
    
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
      * Defines the List of colors displayed in the palette. Minimum is 2 colors, maximum is 15 colors.
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
  }
  
  trait ColorPaletteSettings
    extends StObject
       with ControlSettings {
    
    /**
      * Fired when the user selects a color.
      */
    var colorSelect: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * Defines the List of colors displayed in the palette. Minimum is 2 colors, maximum is 15 colors.
      */
    var colors: js.UndefOr[
        js.Array[CSSColor] | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @SINCE 1.85
      *
      * Fired when the value is changed by user interaction in the internal ColorPicker
      */
    var liveChange: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
  }
  object ColorPaletteSettings {
    
    inline def apply(): ColorPaletteSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ColorPaletteSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ColorPaletteSettings] (val x: Self) extends AnyVal {
      
      inline def setColorSelect(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "colorSelect", js.Any.fromFunction1(value))
      
      inline def setColorSelectUndefined: Self = StObject.set(x, "colorSelect", js.undefined)
      
      inline def setColors(
        value: js.Array[CSSColor] | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
      
      inline def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
      
      inline def setColorsVarargs(value: CSSColor*): Self = StObject.set(x, "colors", js.Array(value*))
      
      inline def setLiveChange(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "liveChange", js.Any.fromFunction1(value))
      
      inline def setLiveChangeUndefined: Self = StObject.set(x, "liveChange", js.undefined)
    }
  }
}
