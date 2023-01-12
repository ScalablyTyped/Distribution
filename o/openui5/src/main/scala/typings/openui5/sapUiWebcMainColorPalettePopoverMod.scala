package typings.openui5

import typings.openui5.anon.Color
import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.AggregationBindingInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreControlMod.ControlSettings
import typings.openui5.sapUiCoreLibraryMod.CSSColor
import typings.openui5.sapUiWebcMainLibraryMod.IColorPaletteItem
import typings.std.HTMLElement
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiWebcMainColorPalettePopoverMod {
  
  @JSImport("sap/ui/webc/main/ColorPalettePopover", JSImport.Default)
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
    
    @JSImport("sap/ui/webc/main/ColorPalettePopover", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.webc.main.ColorPalettePopover with name `sClassName` and enriches
      * it with the information contained in `oClassInfo`.
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
      * Returns a metadata object for class sap.ui.webc.main.ColorPalettePopover.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiWebcCommonWebComponentMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiWebcCommonWebComponentMetadataMod.default]
  }
  
  @js.native
  trait ColorPalettePopover
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
      * Attaches event handler `fnFunction` to the {@link #event:itemClick itemClick} event of this `sap.ui.webc.main.ColorPalettePopover`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.webc.main.ColorPalettePopover` itself.
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
      * Context object to call the event handler with. Defaults to this `sap.ui.webc.main.ColorPalettePopover`
      * itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:itemClick itemClick} event of this `sap.ui.webc.main.ColorPalettePopover`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.webc.main.ColorPalettePopover` itself.
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
      * Context object to call the event handler with. Defaults to this `sap.ui.webc.main.ColorPalettePopover`
      * itself
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
      * Detaches event handler `fnFunction` from the {@link #event:itemClick itemClick} event of this `sap.ui.webc.main.ColorPalettePopover`.
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
      * Defines the content of the component.
      */
    def getColors(): js.Array[IColorPaletteItem] = js.native
    
    /**
      * Gets current value of property {@link #getDefaultColor defaultColor}.
      *
      * Defines the default color of the component. **Note:** The default color should be a part of the ColorPalette
      * colors
      *
      * @returns Value of property `defaultColor`
      */
    def getDefaultColor(): CSSColor = js.native
    
    /**
      * Gets current value of property {@link #getShowDefaultColor showDefaultColor}.
      *
      * Defines whether the user can choose the default color from a button.
      *
      * Default value is `false`.
      *
      * @returns Value of property `showDefaultColor`
      */
    def getShowDefaultColor(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getShowMoreColors showMoreColors}.
      *
      * Defines whether the user can choose a custom color from a component. **Note:** In order to use this property
      * you need to import the following module: `"@ui5/webcomponents/dist/features/ColorPaletteMoreColors.js"`
      *
      * Default value is `false`.
      *
      * @returns Value of property `showMoreColors`
      */
    def getShowMoreColors(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getShowRecentColors showRecentColors}.
      *
      * Defines whether the user can see the last used colors in the bottom of the component
      *
      * Default value is `false`.
      *
      * @returns Value of property `showRecentColors`
      */
    def getShowRecentColors(): Boolean = js.native
    
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
      * Shows the ColorPalettePopover. **Note:** The method is deprecated and will be removed in future, use
      * `showAt` instead.
      */
    def openPopover(/**
      * the element that the popover is shown at
      */
    opener: HTMLElement): Unit = js.native
    
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
    
    /**
      * Sets a new value for property {@link #getDefaultColor defaultColor}.
      *
      * Defines the default color of the component. **Note:** The default color should be a part of the ColorPalette
      * colors
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setDefaultColor(/**
      * New value for property `defaultColor`
      */
    sDefaultColor: CSSColor): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getShowDefaultColor showDefaultColor}.
      *
      * Defines whether the user can choose the default color from a button.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setShowDefaultColor(): this.type = js.native
    def setShowDefaultColor(/**
      * New value for property `showDefaultColor`
      */
    bShowDefaultColor: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getShowMoreColors showMoreColors}.
      *
      * Defines whether the user can choose a custom color from a component. **Note:** In order to use this property
      * you need to import the following module: `"@ui5/webcomponents/dist/features/ColorPaletteMoreColors.js"`
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setShowMoreColors(): this.type = js.native
    def setShowMoreColors(/**
      * New value for property `showMoreColors`
      */
    bShowMoreColors: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getShowRecentColors showRecentColors}.
      *
      * Defines whether the user can see the last used colors in the bottom of the component
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setShowRecentColors(): this.type = js.native
    def setShowRecentColors(/**
      * New value for property `showRecentColors`
      */
    bShowRecentColors: Boolean): this.type = js.native
    
    /**
      * Shows the ColorPalettePopover.
      */
    def showAt(/**
      * the element that the popover is shown at
      */
    opener: HTMLElement): Unit = js.native
  }
  
  trait ColorPalettePopoverSettings
    extends StObject
       with ControlSettings {
    
    /**
      * Defines the content of the component.
      */
    var colors: js.UndefOr[
        js.Array[IColorPaletteItem] | IColorPaletteItem | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Defines the default color of the component. **Note:** The default color should be a part of the ColorPalette
      * colors
      */
    var defaultColor: js.UndefOr[
        CSSColor | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Fired when the user selects a color.
      */
    var itemClick: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * Defines whether the user can choose the default color from a button.
      */
    var showDefaultColor: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Defines whether the user can choose a custom color from a component. **Note:** In order to use this property
      * you need to import the following module: `"@ui5/webcomponents/dist/features/ColorPaletteMoreColors.js"`
      */
    var showMoreColors: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Defines whether the user can see the last used colors in the bottom of the component
      */
    var showRecentColors: js.UndefOr[
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
      
      inline def setColors(
        value: js.Array[IColorPaletteItem] | IColorPaletteItem | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
      
      inline def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
      
      inline def setColorsVarargs(value: IColorPaletteItem*): Self = StObject.set(x, "colors", js.Array(value*))
      
      inline def setDefaultColor(value: CSSColor | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "defaultColor", value.asInstanceOf[js.Any])
      
      inline def setDefaultColorUndefined: Self = StObject.set(x, "defaultColor", js.undefined)
      
      inline def setItemClick(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "itemClick", js.Any.fromFunction1(value))
      
      inline def setItemClickUndefined: Self = StObject.set(x, "itemClick", js.undefined)
      
      inline def setShowDefaultColor(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "showDefaultColor", value.asInstanceOf[js.Any])
      
      inline def setShowDefaultColorUndefined: Self = StObject.set(x, "showDefaultColor", js.undefined)
      
      inline def setShowMoreColors(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "showMoreColors", value.asInstanceOf[js.Any])
      
      inline def setShowMoreColorsUndefined: Self = StObject.set(x, "showMoreColors", js.undefined)
      
      inline def setShowRecentColors(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "showRecentColors", value.asInstanceOf[js.Any])
      
      inline def setShowRecentColorsUndefined: Self = StObject.set(x, "showRecentColors", js.undefined)
    }
  }
}
