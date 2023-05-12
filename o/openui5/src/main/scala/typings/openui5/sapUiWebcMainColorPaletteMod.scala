package typings.openui5

import typings.openui5.anon.Color
import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.AggregationBindingInfo
import typings.openui5.sapUiCoreControlMod.ControlSettings
import typings.openui5.sapUiWebcMainLibraryMod.IColorPaletteItem
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiWebcMainColorPaletteMod {
  
  @JSImport("sap/ui/webc/main/ColorPalette", JSImport.Default)
  @js.native
  /**
    * Constructor for a new `ColorPalette`.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
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
    
    @JSImport("sap/ui/webc/main/ColorPalette", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.webc.main.ColorPalette with name `sClassName` and enriches it
      * with the information contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.ui.webc.common.WebComponent.extend}.
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
      * Returns a metadata object for class sap.ui.webc.main.ColorPalette.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiWebcCommonWebComponentMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiWebcCommonWebComponentMetadataMod.default]
  }
  
  @js.native
  trait ColorPalette
    extends typings.openui5.sapUiWebcCommonWebComponentMod.default {
    
    /**
      * Adds some color to the aggregation {@link #getColors colors}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addColor(/**
      * The color to add; if empty, nothing is inserted
      */
    oColor: IColorPaletteItem): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:itemClick itemClick} event of this `sap.ui.webc.main.ColorPalette`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.webc.main.ColorPalette` itself.
      *
      * Fired when the user selects a color.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachItemClick(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachItemClick(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.webc.main.ColorPalette` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:itemClick itemClick} event of this `sap.ui.webc.main.ColorPalette`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.webc.main.ColorPalette` itself.
      *
      * Fired when the user selects a color.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachItemClick(
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
    def attachItemClick(
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
      * Context object to call the event handler with. Defaults to this `sap.ui.webc.main.ColorPalette` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Destroys all the colors in the aggregation {@link #getColors colors}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyColors(): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:itemClick itemClick} event of this `sap.ui.webc.main.ColorPalette`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachItemClick(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachItemClick(
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
      * Fires event {@link #event:itemClick itemClick} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireItemClick(): this.type = js.native
    def fireItemClick(/**
      * Parameters to pass along with the event
      */
    mParameters: Color): this.type = js.native
    
    /**
      * Gets content of aggregation {@link #getColors colors}.
      *
      * Defines the `sap.ui.webc.main.ColorPaletteItem` elements.
      */
    def getColors(): js.Array[IColorPaletteItem] = js.native
    
    /**
      * Checks for the provided `sap.ui.webc.main.IColorPaletteItem` in the aggregation {@link #getColors colors}.
      * and returns its index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfColor(/**
      * The color whose index is looked for
      */
    oColor: IColorPaletteItem): int = js.native
    
    /**
      * Inserts a color into the aggregation {@link #getColors colors}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def insertColor(
      /**
      * The color to insert; if empty, nothing is inserted
      */
    oColor: IColorPaletteItem,
      /**
      * The `0`-based index the color should be inserted at; for a negative value of `iIndex`, the color is inserted
      * at position 0; for a value greater than the current size of the aggregation, the color is inserted at
      * the last position
      */
    iIndex: int
    ): this.type = js.native
    
    /**
      * Removes all the controls from the aggregation {@link #getColors colors}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllColors(): js.Array[IColorPaletteItem] = js.native
    
    def removeColor(/**
      * The color to remove or its index or id
      */
    vColor: String): IColorPaletteItem | Null = js.native
    /**
      * Removes a color from the aggregation {@link #getColors colors}.
      *
      * @returns The removed color or `null`
      */
    def removeColor(/**
      * The color to remove or its index or id
      */
    vColor: int): IColorPaletteItem | Null = js.native
    def removeColor(/**
      * The color to remove or its index or id
      */
    vColor: IColorPaletteItem): IColorPaletteItem | Null = js.native
  }
  
  trait ColorPaletteSettings
    extends StObject
       with ControlSettings {
    
    /**
      * Defines the `sap.ui.webc.main.ColorPaletteItem` elements.
      */
    var colors: js.UndefOr[
        js.Array[IColorPaletteItem] | IColorPaletteItem | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Fired when the user selects a color.
      */
    var itemClick: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
  }
  object ColorPaletteSettings {
    
    inline def apply(): ColorPaletteSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ColorPaletteSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ColorPaletteSettings] (val x: Self) extends AnyVal {
      
      inline def setColors(
        value: js.Array[IColorPaletteItem] | IColorPaletteItem | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
      
      inline def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
      
      inline def setColorsVarargs(value: IColorPaletteItem*): Self = StObject.set(x, "colors", js.Array(value*))
      
      inline def setItemClick(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "itemClick", js.Any.fromFunction1(value))
      
      inline def setItemClickUndefined: Self = StObject.set(x, "itemClick", js.undefined)
    }
  }
}
