package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapMLibraryMod.EmptyIndicatorMode
import typings.openui5.sapMLibraryMod.WrappingType
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreControlMod.ControlSettings
import typings.openui5.sapUiCoreLibraryMod.CSSSize
import typings.openui5.sapUiCoreLibraryMod.IFormContent
import typings.openui5.sapUiCoreLibraryMod.ISemanticFormContent
import typings.openui5.sapUiCoreLibraryMod.IShrinkable
import typings.openui5.sapUiCoreLibraryMod.TextAlign
import typings.openui5.sapUiCoreLibraryMod.TextDirection
import typings.std.HTMLElement
import typings.std.Object
import typings.std.PropertyKey
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapMTextMod {
  
  @JSImport("sap/m/Text", JSImport.Default)
  @js.native
  /**
    * Constructor for a new Text.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    * See:
    * 	{@link fiori:https://experience.sap.com/fiori-design-web/text/ Text}
    * 	{@link topic:f94deb45de184a3a87850b75d610d9c0 Text}
    */
  open class default () extends Text {
    def this(/**
      * Initial settings for the new control
      */
    mSettings: TextSettings) = this()
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
    mSettings: TextSettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new control
      */
    mSettings: TextSettings
    ) = this()
    
    /* CompleteClass */
    var __implements__sap_ui_core_IFormContent: Boolean = js.native
    
    /* CompleteClass */
    var __implements__sap_ui_core_ISemanticFormContent: Boolean = js.native
    
    /* CompleteClass */
    var __implements__sap_ui_core_IShrinkable: Boolean = js.native
    
    /** The initial value of Object.prototype.constructor is the standard built-in Object constructor. */
    /* standard es5 */
    /* CompleteClass */
    var constructor: js.Function = js.native
    
    /**
      * Determines whether an object has a property with the specified name.
      * @param v A property name.
      */
    /* standard es5 */
    /* CompleteClass */
    override def hasOwnProperty(v: PropertyKey): Boolean = js.native
    
    /**
      * Determines whether a specified property is enumerable.
      * @param v A property name.
      */
    /* standard es5 */
    /* CompleteClass */
    override def propertyIsEnumerable(v: PropertyKey): Boolean = js.native
  }
  /* static members */
  object default {
    
    @JSImport("sap/m/Text", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.m.Text with name `sClassName` and enriches it with the information
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
    oClassInfo: ClassInfo[T, Text]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, Text],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.m.Text.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
    
    /**
      * @SINCE 1.13.2
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
      * Defines whether browser supports native line clamp or not
      */
    @JSImport("sap/m/Text", "default.hasNativeLineClamp")
    @js.native
    def hasNativeLineClamp: /* undefined */ Any = js.native
    inline def hasNativeLineClamp_=(x: /* undefined */ Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hasNativeLineClamp")(x.asInstanceOf[js.Any])
    
    /**
      * @SINCE 1.30.3
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
      * To prevent from the layout thrashing of the `textContent` call, this method first tries to set the `nodeValue`
      * of the first child if it exists.
      */
    inline def setNodeValue(/**
      * DOM reference of the text node container.
      */
    oDomRef: HTMLElement): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setNodeValue")(oDomRef.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def setNodeValue(
      /**
      * DOM reference of the text node container.
      */
    oDomRef: HTMLElement,
      /**
      * new Node value.
      */
    sNodeValue: String
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setNodeValue")(oDomRef.asInstanceOf[js.Any], sNodeValue.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
  
  @js.native
  trait Text
    extends typings.openui5.sapUiCoreControlMod.default
       with IShrinkable
       with IFormContent
       with ISemanticFormContent
       with /* was: sap.m.IToolbarInteractiveControl */ Object {
    
    var __implements__sap_m_IToolbarInteractiveControl: Boolean = js.native
    
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
      * @SINCE 1.22
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
      * Determines per instance whether line height should be cached or not.
      *
      * Default value is true.
      */
    var cacheLineHeight: Boolean = js.native
    
    /**
      * @SINCE 1.20
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
      * Decides whether the control can use native line clamp feature or not.
      *
      * In RTL mode native line clamp feature is not supported.
      */
    def canUseNativeLineClamp(): Boolean = js.native
    
    /**
      * @SINCE 1.22
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
      * Sets the max height to support `maxLines` property.
      *
      * @returns Calculated max height value.
      */
    def clampHeight(): int = js.native
    def clampHeight(/**
      * DOM reference of the text container.
      */
    oDomRef: HTMLElement): int = js.native
    
    /**
      * @SINCE 1.20
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
      * Clamps the wrapping text according to max lines and returns the found ellipsis position. Parameters can
      * be used for better performance.
      *
      * @returns Returns found ellipsis position or `undefined`.
      */
    def clampText(): js.UndefOr[int] = js.native
    def clampText(
      /**
      * DOM reference of the text container.
      */
    oDomRef: Unit,
      /**
      * Start point of the ellipsis search.
      */
    iStartPos: Unit,
      /**
      * End point of the ellipsis search.
      */
    iEndPos: int
    ): js.UndefOr[int] = js.native
    def clampText(
      /**
      * DOM reference of the text container.
      */
    oDomRef: Unit,
      /**
      * Start point of the ellipsis search.
      */
    iStartPos: int
    ): js.UndefOr[int] = js.native
    def clampText(
      /**
      * DOM reference of the text container.
      */
    oDomRef: Unit,
      /**
      * Start point of the ellipsis search.
      */
    iStartPos: int,
      /**
      * End point of the ellipsis search.
      */
    iEndPos: int
    ): js.UndefOr[int] = js.native
    def clampText(/**
      * DOM reference of the text container.
      */
    oDomRef: HTMLElement): js.UndefOr[int] = js.native
    def clampText(
      /**
      * DOM reference of the text container.
      */
    oDomRef: HTMLElement,
      /**
      * Start point of the ellipsis search.
      */
    iStartPos: Unit,
      /**
      * End point of the ellipsis search.
      */
    iEndPos: int
    ): js.UndefOr[int] = js.native
    def clampText(
      /**
      * DOM reference of the text container.
      */
    oDomRef: HTMLElement,
      /**
      * Start point of the ellipsis search.
      */
    iStartPos: int
    ): js.UndefOr[int] = js.native
    def clampText(
      /**
      * DOM reference of the text container.
      */
    oDomRef: HTMLElement,
      /**
      * Start point of the ellipsis search.
      */
    iStartPos: int,
      /**
      * End point of the ellipsis search.
      */
    iEndPos: int
    ): js.UndefOr[int] = js.native
    
    /**
      * @SINCE 1.13.2
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
      * Ellipsis(...) text to indicate more text when clampText function is used.
      *
      * Can be overwritten with 3dots(...) if fonts do not support this UTF-8 character.
      */
    var ellipsis: String = js.native
    
    /**
      * @SINCE 1.22
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
      * Returns the max height according to max lines and line height calculation. This is not calculated max
      * height!
      *
      * @returns The clamp height of the text.
      */
    def getClampHeight(): int = js.native
    def getClampHeight(/**
      * DOM reference of the text container.
      */
    oDomRef: HTMLElement): int = js.native
    
    /**
      * @SINCE 1.87
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
      * @SINCE 1.22
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
      * Caches and returns the computed line height of the text.
      * See:
      * 	sap.m.Text#cacheLineHeight
      *
      * @returns returns calculated line height
      */
    def getLineHeight(): int = js.native
    def getLineHeight(/**
      * DOM reference of the text container.
      */
    oDomRef: HTMLElement): int = js.native
    
    /**
      * @SINCE 1.13.2
      *
      * Gets current value of property {@link #getMaxLines maxLines}.
      *
      * Limits the number of lines for wrapping texts.
      *
      * **Note**: The multi-line overflow indicator depends on the browser line clamping support. For such browsers,
      * this will be shown as ellipsis, for the other browsers the overflow will just be hidden.
      *
      * @returns Value of property `maxLines`
      */
    def getMaxLines(): int = js.native
    
    /**
      * @SINCE 1.51
      *
      * Gets current value of property {@link #getRenderWhitespace renderWhitespace}.
      *
      * Specifies how whitespace and tabs inside the control are handled. If true, whitespace will be preserved
      * by the browser. Depending on wrapping property text will either only wrap on line breaks or wrap when
      * necessary, and on line breaks.
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
      * Available options for the text direction are LTR and RTL. By default the control inherits the text direction
      * from its parent control.
      *
      * Default value is `Inherit`.
      *
      * @returns Value of property `textDirection`
      */
    def getTextDirection(): TextDirection | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TextDirection * / any */ String) = js.native
    
    /**
      * @SINCE 1.22
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
      * Returns the text node container's DOM reference. This can be different from `getDomRef` when inner wrapper
      * is needed.
      *
      * @returns DOM reference of the text.
      */
    def getTextDomRef(): HTMLElement | Null = js.native
    
    /**
      * Gets current value of property {@link #getWidth width}.
      *
      * Sets the width of the Text control. By default, the Text control uses the full width available. Set this
      * property to restrict the width to a custom value.
      *
      * @returns Value of property `width`
      */
    def getWidth(): CSSSize = js.native
    
    /**
      * Gets current value of property {@link #getWrapping wrapping}.
      *
      * Enables text wrapping.
      *
      * Default value is `true`.
      *
      * @returns Value of property `wrapping`
      */
    def getWrapping(): Boolean = js.native
    
    /**
      * @SINCE 1.60
      *
      * Gets current value of property {@link #getWrappingType wrappingType}.
      *
      * Defines the type of text wrapping to be used (hyphenated or normal).
      *
      * **Note:** This property takes effect only when the `wrapping` property is set to `true`.
      *
      * Default value is `Normal`.
      *
      * @returns Value of property `wrappingType`
      */
    def getWrappingType(): WrappingType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof WrappingType * / any */ String) = js.native
    
    /**
      * @SINCE 1.22
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
      * Determines whether max lines should be rendered or not.
      *
      * @returns Max lines of the text.
      */
    def hasMaxLines(): HTMLElement | Null = js.native
    
    /**
      * @SINCE 1.22
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
      * Default line height value as a number when line height is normal.
      *
      * This value is required during max height calculation for the browsers that do not support line clamping.
      * It is better to define line height in CSS instead of "normal" to get consistent `maxLines` results since
      * normal line height not only varies from browser to browser but it also varies from one font face to another
      * and can also vary within a given face.
      */
    var normalLineHeight: int = js.native
    
    /**
      * Overwrites onAfterRendering
      */
    def onAfterRendering(): Unit = js.native
    
    /**
      * @SINCE 1.87
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
      * @SINCE 1.13.2
      *
      * Sets a new value for property {@link #getMaxLines maxLines}.
      *
      * Limits the number of lines for wrapping texts.
      *
      * **Note**: The multi-line overflow indicator depends on the browser line clamping support. For such browsers,
      * this will be shown as ellipsis, for the other browsers the overflow will just be hidden.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setMaxLines(): this.type = js.native
    def setMaxLines(/**
      * New value for property `maxLines`
      */
    iMaxLines: int): this.type = js.native
    
    /**
      * @SINCE 1.51
      *
      * Sets a new value for property {@link #getRenderWhitespace renderWhitespace}.
      *
      * Specifies how whitespace and tabs inside the control are handled. If true, whitespace will be preserved
      * by the browser. Depending on wrapping property text will either only wrap on line breaks or wrap when
      * necessary, and on line breaks.
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
      * Sets the width of the Text control. By default, the Text control uses the full width available. Set this
      * property to restrict the width to a custom value.
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
      * Sets a new value for property {@link #getWrapping wrapping}.
      *
      * Enables text wrapping.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setWrapping(): this.type = js.native
    def setWrapping(/**
      * New value for property `wrapping`
      */
    bWrapping: Boolean): this.type = js.native
    
    /**
      * @SINCE 1.60
      *
      * Sets a new value for property {@link #getWrappingType wrappingType}.
      *
      * Defines the type of text wrapping to be used (hyphenated or normal).
      *
      * **Note:** This property takes effect only when the `wrapping` property is set to `true`.
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
  
  trait TextSettings
    extends StObject
       with ControlSettings {
    
    /**
      * @SINCE 1.87
      *
      * Specifies if an empty indicator should be displayed when there is no text.
      */
    var emptyIndicatorMode: js.UndefOr[
        EmptyIndicatorMode | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof EmptyIndicatorMode * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * @SINCE 1.13.2
      *
      * Limits the number of lines for wrapping texts.
      *
      * **Note**: The multi-line overflow indicator depends on the browser line clamping support. For such browsers,
      * this will be shown as ellipsis, for the other browsers the overflow will just be hidden.
      */
    var maxLines: js.UndefOr[int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * @SINCE 1.51
      *
      * Specifies how whitespace and tabs inside the control are handled. If true, whitespace will be preserved
      * by the browser. Depending on wrapping property text will either only wrap on line breaks or wrap when
      * necessary, and on line breaks.
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
      * Available options for the text direction are LTR and RTL. By default the control inherits the text direction
      * from its parent control.
      */
    var textDirection: js.UndefOr[
        TextDirection | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TextDirection * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * Sets the width of the Text control. By default, the Text control uses the full width available. Set this
      * property to restrict the width to a custom value.
      */
    var width: js.UndefOr[
        CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Enables text wrapping.
      */
    var wrapping: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @SINCE 1.60
      *
      * Defines the type of text wrapping to be used (hyphenated or normal).
      *
      * **Note:** This property takes effect only when the `wrapping` property is set to `true`.
      */
    var wrappingType: js.UndefOr[
        WrappingType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof WrappingType * / any */ String) | PropertyBindingInfo
      ] = js.undefined
  }
  object TextSettings {
    
    inline def apply(): TextSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TextSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TextSettings] (val x: Self) extends AnyVal {
      
      inline def setEmptyIndicatorMode(
        value: EmptyIndicatorMode | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof EmptyIndicatorMode * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "emptyIndicatorMode", value.asInstanceOf[js.Any])
      
      inline def setEmptyIndicatorModeUndefined: Self = StObject.set(x, "emptyIndicatorMode", js.undefined)
      
      inline def setMaxLines(value: int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "maxLines", value.asInstanceOf[js.Any])
      
      inline def setMaxLinesUndefined: Self = StObject.set(x, "maxLines", js.undefined)
      
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
      
      inline def setWidth(value: CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      inline def setWrapping(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "wrapping", value.asInstanceOf[js.Any])
      
      inline def setWrappingType(
        value: WrappingType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof WrappingType * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "wrappingType", value.asInstanceOf[js.Any])
      
      inline def setWrappingTypeUndefined: Self = StObject.set(x, "wrappingType", js.undefined)
      
      inline def setWrappingUndefined: Self = StObject.set(x, "wrapping", js.undefined)
    }
  }
}
