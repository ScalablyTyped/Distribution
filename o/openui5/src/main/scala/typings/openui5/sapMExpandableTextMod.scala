package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapMLibraryMod.EmptyIndicatorMode
import typings.openui5.sapMLibraryMod.ExpandableTextOverflowMode
import typings.openui5.sapMLibraryMod.WrappingType
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreControlMod.ControlSettings
import typings.openui5.sapUiCoreLibraryMod.IFormContent
import typings.openui5.sapUiCoreLibraryMod.TextAlign
import typings.openui5.sapUiCoreLibraryMod.TextDirection
import typings.std.HTMLElement
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapMExpandableTextMod {
  
  @JSImport("sap/m/ExpandableText", JSImport.Default)
  @js.native
  /**
    * Constructor for a new ExpandableText.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends ExpandableText {
    def this(/**
      * Initial settings for the new control
      */
    mSettings: ExpandableTextSettings) = this()
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
    mSettings: ExpandableTextSettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new control
      */
    mSettings: ExpandableTextSettings
    ) = this()
    
    /* CompleteClass */
    var __implements__sap_ui_core_IFormContent: Boolean = js.native
  }
  /* static members */
  object default {
    
    @JSImport("sap/m/ExpandableText", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.m.ExpandableText with name `sClassName` and enriches it with the
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
    oClassInfo: ClassInfo[T, ExpandableText]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, ExpandableText],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.m.ExpandableText.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait ExpandableText
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
      * @since 1.91
      *
      * Gets current value of property {@link #getEmptyIndicatorMode emptyIndicatorMode}.
      *
      * Specifies if an empty indicator should be displayed when there is no text.
      *
      * Default value is `Off`.
      *
      * @returns Value of property `emptyIndicatorMode`
      */
    def getEmptyIndicatorMode(): EmptyIndicatorMode | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof EmptyIndicatorMode * / any */ String) = js.native
    
    /**
      * Gets current value of property {@link #getMaxCharacters maxCharacters}.
      *
      * Specifies the maximum number of characters from the beginning of the text field that are shown initially.
      *
      * Default value is `100`.
      *
      * @returns Value of property `maxCharacters`
      */
    def getMaxCharacters(): int = js.native
    
    /**
      * Gets current value of property {@link #getOverflowMode overflowMode}.
      *
      * Determines how the full text will be displayed - InPlace or Popover
      *
      * Default value is `InPlace`.
      *
      * @returns Value of property `overflowMode`
      */
    def getOverflowMode(): ExpandableTextOverflowMode | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ExpandableTextOverflowMode * / any */ String) = js.native
    
    /**
      * Gets current value of property {@link #getRenderWhitespace renderWhitespace}.
      *
      * Specifies how whitespace and tabs inside the control are handled. If true, whitespace will be preserved
      * by the browser.
      *
      * Default value is `false`.
      *
      * @returns Value of property `renderWhitespace`
      */
    def getRenderWhitespace(): Boolean = js.native
    
    /**
      * Gets the text.
      *
      * @returns Text value.
      */
    def getText(/**
      * Indication for normalized text.
      */
    bNormalize: Boolean): String = js.native
    
    /**
      * Gets current value of property {@link #getTextAlign textAlign}.
      *
      * Sets the horizontal alignment of the text.
      *
      * Default value is `Begin`.
      *
      * @returns Value of property `textAlign`
      */
    def getTextAlign(): TextAlign | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TextAlign * / any */ String) = js.native
    
    /**
      * Gets current value of property {@link #getTextDirection textDirection}.
      *
      * Available options for the text direction are left-to-right (LTR) and right-to-left (RTL) By default the
      * control inherits the text direction from its parent control.
      *
      * Default value is `Inherit`.
      *
      * @returns Value of property `textDirection`
      */
    def getTextDirection(): TextDirection | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TextDirection * / any */ String) = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Returns the text node container's DOM reference. This can be different from `getDomRef` when inner wrapper
      * is needed.
      *
      * @returns DOM reference of the text.
      */
    def getTextDomRef(): HTMLElement | Null = js.native
    
    /**
      * Gets current value of property {@link #getWrappingType wrappingType}.
      *
      * Defines the type of text wrapping to be used (hyphenated or normal).
      *
      * Default value is `Normal`.
      *
      * @returns Value of property `wrappingType`
      */
    def getWrappingType(): WrappingType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof WrappingType * / any */ String) = js.native
    
    /**
      * @since 1.91
      *
      * Sets a new value for property {@link #getEmptyIndicatorMode emptyIndicatorMode}.
      *
      * Specifies if an empty indicator should be displayed when there is no text.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `Off`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setEmptyIndicatorMode(): this.type = js.native
    def setEmptyIndicatorMode(
      /**
      * New value for property `emptyIndicatorMode`
      */
    sEmptyIndicatorMode: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof EmptyIndicatorMode * / any */ String
    ): this.type = js.native
    def setEmptyIndicatorMode(/**
      * New value for property `emptyIndicatorMode`
      */
    sEmptyIndicatorMode: EmptyIndicatorMode): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getMaxCharacters maxCharacters}.
      *
      * Specifies the maximum number of characters from the beginning of the text field that are shown initially.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `100`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setMaxCharacters(): this.type = js.native
    def setMaxCharacters(/**
      * New value for property `maxCharacters`
      */
    iMaxCharacters: int): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getOverflowMode overflowMode}.
      *
      * Determines how the full text will be displayed - InPlace or Popover
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `InPlace`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setOverflowMode(): this.type = js.native
    def setOverflowMode(
      /**
      * New value for property `overflowMode`
      */
    sOverflowMode: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ExpandableTextOverflowMode * / any */ String
    ): this.type = js.native
    def setOverflowMode(/**
      * New value for property `overflowMode`
      */
    sOverflowMode: ExpandableTextOverflowMode): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getRenderWhitespace renderWhitespace}.
      *
      * Specifies how whitespace and tabs inside the control are handled. If true, whitespace will be preserved
      * by the browser.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setRenderWhitespace(): this.type = js.native
    def setRenderWhitespace(/**
      * New value for property `renderWhitespace`
      */
    bRenderWhitespace: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getText text}.
      *
      * Determines the text to be displayed.
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
      * Sets a new value for property {@link #getTextAlign textAlign}.
      *
      * Sets the horizontal alignment of the text.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `Begin`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setTextAlign(): this.type = js.native
    def setTextAlign(
      /**
      * New value for property `textAlign`
      */
    sTextAlign: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TextAlign * / any */ String
    ): this.type = js.native
    def setTextAlign(/**
      * New value for property `textAlign`
      */
    sTextAlign: TextAlign): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getTextDirection textDirection}.
      *
      * Available options for the text direction are left-to-right (LTR) and right-to-left (RTL) By default the
      * control inherits the text direction from its parent control.
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
      * Sets a new value for property {@link #getWrappingType wrappingType}.
      *
      * Defines the type of text wrapping to be used (hyphenated or normal).
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `Normal`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setWrappingType(): this.type = js.native
    def setWrappingType(
      /**
      * New value for property `wrappingType`
      */
    sWrappingType: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof WrappingType * / any */ String
    ): this.type = js.native
    def setWrappingType(/**
      * New value for property `wrappingType`
      */
    sWrappingType: WrappingType): this.type = js.native
    
    /**
      * Unbinds property {@link #getText text} from model data.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def unbindText(): this.type = js.native
  }
  
  trait ExpandableTextSettings
    extends StObject
       with ControlSettings {
    
    /**
      * @since 1.91
      *
      * Specifies if an empty indicator should be displayed when there is no text.
      */
    var emptyIndicatorMode: js.UndefOr[
        EmptyIndicatorMode | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof EmptyIndicatorMode * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * Specifies the maximum number of characters from the beginning of the text field that are shown initially.
      */
    var maxCharacters: js.UndefOr[int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * Determines how the full text will be displayed - InPlace or Popover
      */
    var overflowMode: js.UndefOr[
        ExpandableTextOverflowMode | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ExpandableTextOverflowMode * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * Specifies how whitespace and tabs inside the control are handled. If true, whitespace will be preserved
      * by the browser.
      */
    var renderWhitespace: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Determines the text to be displayed.
      */
    var text: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Sets the horizontal alignment of the text.
      */
    var textAlign: js.UndefOr[
        TextAlign | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TextAlign * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * Available options for the text direction are left-to-right (LTR) and right-to-left (RTL) By default the
      * control inherits the text direction from its parent control.
      */
    var textDirection: js.UndefOr[
        TextDirection | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TextDirection * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * Defines the type of text wrapping to be used (hyphenated or normal).
      */
    var wrappingType: js.UndefOr[
        WrappingType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof WrappingType * / any */ String) | PropertyBindingInfo
      ] = js.undefined
  }
  object ExpandableTextSettings {
    
    inline def apply(): ExpandableTextSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ExpandableTextSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ExpandableTextSettings] (val x: Self) extends AnyVal {
      
      inline def setEmptyIndicatorMode(
        value: EmptyIndicatorMode | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof EmptyIndicatorMode * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "emptyIndicatorMode", value.asInstanceOf[js.Any])
      
      inline def setEmptyIndicatorModeUndefined: Self = StObject.set(x, "emptyIndicatorMode", js.undefined)
      
      inline def setMaxCharacters(value: int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "maxCharacters", value.asInstanceOf[js.Any])
      
      inline def setMaxCharactersUndefined: Self = StObject.set(x, "maxCharacters", js.undefined)
      
      inline def setOverflowMode(
        value: ExpandableTextOverflowMode | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ExpandableTextOverflowMode * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "overflowMode", value.asInstanceOf[js.Any])
      
      inline def setOverflowModeUndefined: Self = StObject.set(x, "overflowMode", js.undefined)
      
      inline def setRenderWhitespace(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "renderWhitespace", value.asInstanceOf[js.Any])
      
      inline def setRenderWhitespaceUndefined: Self = StObject.set(x, "renderWhitespace", js.undefined)
      
      inline def setText(value: String | PropertyBindingInfo): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextAlign(
        value: TextAlign | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TextAlign * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "textAlign", value.asInstanceOf[js.Any])
      
      inline def setTextAlignUndefined: Self = StObject.set(x, "textAlign", js.undefined)
      
      inline def setTextDirection(
        value: TextDirection | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TextDirection * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "textDirection", value.asInstanceOf[js.Any])
      
      inline def setTextDirectionUndefined: Self = StObject.set(x, "textDirection", js.undefined)
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      inline def setWrappingType(
        value: WrappingType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof WrappingType * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "wrappingType", value.asInstanceOf[js.Any])
      
      inline def setWrappingTypeUndefined: Self = StObject.set(x, "wrappingType", js.undefined)
    }
  }
}
