package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapTntLibraryMod.RenderMode
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreControlMod.ControlSettings
import typings.openui5.sapUiCoreLibraryMod.CSSSize
import typings.openui5.sapUiCoreLibraryMod.IFormContent
import typings.openui5.sapUiCoreLibraryMod.TextDirection
import typings.openui5.sapUiCoreLibraryMod.URI
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapTntInfoLabelMod {
  
  @JSImport("sap/tnt/InfoLabel", JSImport.Default)
  @js.native
  /**
    * Constructor for a new `InfoLabel`.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends InfoLabel {
    def this(/**
      * Initial settings for the new control
      */
    mSettings: InfoLabelSettings) = this()
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
    mSettings: InfoLabelSettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new control
      */
    mSettings: InfoLabelSettings
    ) = this()
    
    /* CompleteClass */
    var __implements__sap_ui_core_IFormContent: Boolean = js.native
  }
  /* static members */
  object default {
    
    @JSImport("sap/tnt/InfoLabel", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.tnt.InfoLabel with name `sClassName` and enriches it with the information
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
    oClassInfo: ClassInfo[T, InfoLabel]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, InfoLabel],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.tnt.InfoLabel.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait InfoLabel
    extends typings.openui5.sapUiCoreControlMod.default
       with IFormContent {
    
    /**
      * Binds property {@link #getText text} to model data.
      *
      * See {@link sap.ui.base.ManagedObject#bindProperty ManagedObject.bindProperty} for a detailed description
      * of the possible properties of `oBindingInfo`
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def bindText(/**
      * The binding information
      */
    oBindingInfo: PropertyBindingInfo): this.type = js.native
    
    /**
      * Gets current value of property {@link #getColorScheme colorScheme}.
      *
      * Specifies the fill and text color of the control. Accepts a number between 1 and 10 as a value. You can
      * choose from 10 predefined background and text color combinations. The color schemes are non-semantic,
      * you can select them according to your own preferences. **Note:** ColorScheme 10 is available only in
      * Fiori 3 theme. The default `colorScheme` is 7.
      *
      * Default value is `7`.
      *
      * @returns Value of property `colorScheme`
      */
    def getColorScheme(): int = js.native
    
    /**
      * Gets current value of property {@link #getDisplayOnly displayOnly}.
      *
      * Determines if the `InfoLabel` is in `displayOnly` mode. When set to `true` the control size adjusts to
      * fit other controls, for example non-editable `Forms`.
      *
      * Default value is `false`.
      *
      * @returns Value of property `displayOnly`
      */
    def getDisplayOnly(): Boolean = js.native
    
    /**
      * @since 1.74
      *
      * Gets current value of property {@link #getIcon icon}.
      *
      * Defines the icon to be displayed as graphical element within the `InfoLabel`. It can be an icon from
      * the icon font.
      *
      * Default value is `empty string`.
      *
      * @returns Value of property `icon`
      */
    def getIcon(): URI = js.native
    
    /**
      * Gets current value of property {@link #getRenderMode renderMode}.
      *
      * Specifies the type of the `InfoLabel` paddings - loose or narrow. **Note:** By default the padding is
      * loose. It is recommended to use narrow (smaller) paddings for numeric texts.
      *
      * Default value is `Loose`.
      *
      * @returns Value of property `renderMode`
      */
    def getRenderMode(): RenderMode | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof RenderMode * / any */ String) = js.native
    
    /**
      * Gets current value of property {@link #getText text}.
      *
      * Specifies the text inside the `InfoLabel` control.
      *
      * Default value is `empty string`.
      *
      * @returns Value of property `text`
      */
    def getText(): String = js.native
    
    /**
      * Gets current value of property {@link #getTextDirection textDirection}.
      *
      * Available options for the text direction are LTR and RTL. By default the control inherits the text direction
      * from its parent control.
      *
      * Default value is `Inherit`.
      *
      * @returns Value of property `textDirection`
      */
    def getTextDirection(): TextDirection | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TextDirection * / any */ String) = js.native
    
    /**
      * Gets current value of property {@link #getWidth width}.
      *
      * Specifies the width of the `InfoLabel` control. By default, the `InfoLabel` control has the width of
      * the content. Set this property to restrict the width to a custom value.
      *
      * @returns Value of property `width`
      */
    def getWidth(): CSSSize = js.native
    
    /**
      * Sets a new value for property {@link #getColorScheme colorScheme}.
      *
      * Specifies the fill and text color of the control. Accepts a number between 1 and 10 as a value. You can
      * choose from 10 predefined background and text color combinations. The color schemes are non-semantic,
      * you can select them according to your own preferences. **Note:** ColorScheme 10 is available only in
      * Fiori 3 theme. The default `colorScheme` is 7.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `7`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setColorScheme(): this.type = js.native
    def setColorScheme(/**
      * New value for property `colorScheme`
      */
    iColorScheme: int): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getDisplayOnly displayOnly}.
      *
      * Determines if the `InfoLabel` is in `displayOnly` mode. When set to `true` the control size adjusts to
      * fit other controls, for example non-editable `Forms`.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setDisplayOnly(): this.type = js.native
    def setDisplayOnly(/**
      * New value for property `displayOnly`
      */
    bDisplayOnly: Boolean): this.type = js.native
    
    /**
      * @since 1.74
      *
      * Sets a new value for property {@link #getIcon icon}.
      *
      * Defines the icon to be displayed as graphical element within the `InfoLabel`. It can be an icon from
      * the icon font.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `empty string`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setIcon(): this.type = js.native
    def setIcon(/**
      * New value for property `icon`
      */
    sIcon: URI): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getRenderMode renderMode}.
      *
      * Specifies the type of the `InfoLabel` paddings - loose or narrow. **Note:** By default the padding is
      * loose. It is recommended to use narrow (smaller) paddings for numeric texts.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `Loose`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setRenderMode(): this.type = js.native
    def setRenderMode(
      /**
      * New value for property `renderMode`
      */
    sRenderMode: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof RenderMode * / any */ String
    ): this.type = js.native
    def setRenderMode(/**
      * New value for property `renderMode`
      */
    sRenderMode: RenderMode): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getText text}.
      *
      * Specifies the text inside the `InfoLabel` control.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `empty string`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setText(): this.type = js.native
    def setText(/**
      * New value for property `text`
      */
    sText: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getTextDirection textDirection}.
      *
      * Available options for the text direction are LTR and RTL. By default the control inherits the text direction
      * from its parent control.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `Inherit`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setTextDirection(): this.type = js.native
    def setTextDirection(
      /**
      * New value for property `textDirection`
      */
    sTextDirection: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TextDirection * / any */ String
    ): this.type = js.native
    def setTextDirection(/**
      * New value for property `textDirection`
      */
    sTextDirection: TextDirection): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getWidth width}.
      *
      * Specifies the width of the `InfoLabel` control. By default, the `InfoLabel` control has the width of
      * the content. Set this property to restrict the width to a custom value.
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
      * Unbinds property {@link #getText text} from model data.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def unbindText(): this.type = js.native
  }
  
  trait InfoLabelSettings
    extends StObject
       with ControlSettings {
    
    /**
      * Specifies the fill and text color of the control. Accepts a number between 1 and 10 as a value. You can
      * choose from 10 predefined background and text color combinations. The color schemes are non-semantic,
      * you can select them according to your own preferences. **Note:** ColorScheme 10 is available only in
      * Fiori 3 theme. The default `colorScheme` is 7.
      */
    var colorScheme: js.UndefOr[int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * Determines if the `InfoLabel` is in `displayOnly` mode. When set to `true` the control size adjusts to
      * fit other controls, for example non-editable `Forms`.
      */
    var displayOnly: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @since 1.74
      *
      * Defines the icon to be displayed as graphical element within the `InfoLabel`. It can be an icon from
      * the icon font.
      */
    var icon: js.UndefOr[URI | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * Specifies the type of the `InfoLabel` paddings - loose or narrow. **Note:** By default the padding is
      * loose. It is recommended to use narrow (smaller) paddings for numeric texts.
      */
    var renderMode: js.UndefOr[
        RenderMode | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof RenderMode * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * Specifies the text inside the `InfoLabel` control.
      */
    var text: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Available options for the text direction are LTR and RTL. By default the control inherits the text direction
      * from its parent control.
      */
    var textDirection: js.UndefOr[
        TextDirection | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TextDirection * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * Specifies the width of the `InfoLabel` control. By default, the `InfoLabel` control has the width of
      * the content. Set this property to restrict the width to a custom value.
      */
    var width: js.UndefOr[
        CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
  }
  object InfoLabelSettings {
    
    inline def apply(): InfoLabelSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InfoLabelSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: InfoLabelSettings] (val x: Self) extends AnyVal {
      
      inline def setColorScheme(value: int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "colorScheme", value.asInstanceOf[js.Any])
      
      inline def setColorSchemeUndefined: Self = StObject.set(x, "colorScheme", js.undefined)
      
      inline def setDisplayOnly(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "displayOnly", value.asInstanceOf[js.Any])
      
      inline def setDisplayOnlyUndefined: Self = StObject.set(x, "displayOnly", js.undefined)
      
      inline def setIcon(value: URI | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setRenderMode(
        value: RenderMode | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof RenderMode * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "renderMode", value.asInstanceOf[js.Any])
      
      inline def setRenderModeUndefined: Self = StObject.set(x, "renderMode", js.undefined)
      
      inline def setText(value: String | PropertyBindingInfo): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextDirection(
        value: TextDirection | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TextDirection * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "textDirection", value.asInstanceOf[js.Any])
      
      inline def setTextDirectionUndefined: Self = StObject.set(x, "textDirection", js.undefined)
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      inline def setWidth(value: CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
