package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapMLibraryMod.WrappingType
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreControlMod.ControlSettings
import typings.openui5.sapUiCoreLibraryMod.CSSSize
import typings.openui5.sapUiCoreLibraryMod.ID
import typings.openui5.sapUiCoreLibraryMod.IShrinkable
import typings.openui5.sapUiCoreLibraryMod.ITitleContent
import typings.openui5.sapUiCoreLibraryMod.TextAlign
import typings.openui5.sapUiCoreLibraryMod.TextDirection
import typings.openui5.sapUiCoreLibraryMod.TitleLevel
import typings.std.Object
import typings.std.PropertyKey
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapMTitleMod {
  
  @JSImport("sap/m/Title", JSImport.Default)
  @js.native
  /**
    * Constructor for a new Title control.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    * See:
    * 	{@link fiori:https://experience.sap.com/fiori-design-web/title/ Title}
    */
  open class default () extends Title {
    def this(/**
      * Initial settings for the new control
      */
    mSettings: TitleSettings) = this()
    def this(/**
      * Id for the new control, generated automatically if no id is given
      */
    sId: String) = this()
    def this(
      /**
      * Id for the new control, generated automatically if no id is given
      */
    sId: String,
      /**
      * Initial settings for the new control
      */
    mSettings: TitleSettings
    ) = this()
    def this(
      /**
      * Id for the new control, generated automatically if no id is given
      */
    sId: Unit,
      /**
      * Initial settings for the new control
      */
    mSettings: TitleSettings
    ) = this()
    
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
    
    @JSImport("sap/m/Title", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.m.Title with name `sClassName` and enriches it with the information
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
    oClassInfo: ClassInfo[T, Title]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, Title],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.m.Title.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait Title
    extends typings.openui5.sapUiCoreControlMod.default
       with IShrinkable
       with /* was: sap.m.IToolbarInteractiveControl */ Object {
    
    var __implements__sap_m_IToolbarInteractiveControl: Boolean = js.native
    
    /**
      * @since 1.87
      *
      * Destroys the content in the aggregation {@link #getContent content}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyContent(): this.type = js.native
    
    /**
      * @since 1.87
      *
      * Gets content of aggregation {@link #getContent content}.
      *
      * Holds a control that implements `sap.ui.core.ITitleContent` and renders this control instead of simple
      * text
      *
      * **Note:** if a control is placed in this aggregation, the following properties of `sap.m.Title` will
      * be overridden - `text`, `textAlign`, `textDirection`; the following will be ignored - `wrapping`, `wrappingType`.
      * The `title` association will be ignored too.
      */
    def getContent(): ITitleContent = js.native
    
    /**
      * Gets current value of property {@link #getLevel level}.
      *
      * Defines the semantic level of the title. This information is e.g. used by assistive technologies like
      * screenreaders to create a hierarchical site map for faster navigation. Depending on this setting either
      * an HTML h1-h6 element is used or when using level `Auto` no explicit level information is written (HTML5
      * header element). This property does not influence the style of the control. Use the property `titleStyle`
      * for this purpose instead.
      *
      * **Note:** this property will be overridden if there is title element associated and it has `level` property
      * set.
      *
      * Default value is `Auto`.
      *
      * @returns Value of property `level`
      */
    def getLevel(): TitleLevel | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TitleLevel * / any */ String) = js.native
    
    /**
      * Gets current value of property {@link #getText text}.
      *
      * Defines the text that should be displayed as a title.
      *
      * **Note:** this property is not used if there is a control added to the `content` aggregation **Note:**
      * this property will be overridden if there is title element associated and it has `text` property set.
      *
      * @returns Value of property `text`
      */
    def getText(): String = js.native
    
    /**
      * Gets current value of property {@link #getTextAlign textAlign}.
      *
      * Defines the alignment of the text within the title. **Note:** This property only has an effect if the
      * overall width of the title control is larger than the displayed text.
      *
      * **Note:** this property will be overridden if there is a control added to the `content` aggregation
      *
      * Default value is `Initial`.
      *
      * @returns Value of property `textAlign`
      */
    def getTextAlign(): TextAlign | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TextAlign * / any */ String) = js.native
    
    /**
      * Gets current value of property {@link #getTextDirection textDirection}.
      *
      * Options for the text direction are RTL and LTR. Alternatively, the control can inherit the text direction
      * from its parent container.
      *
      * **Note:** this property will be overridden if there is a control added to the `content` aggregation
      *
      * Default value is `Inherit`.
      *
      * @returns Value of property `textDirection`
      */
    def getTextDirection(): TextDirection | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TextDirection * / any */ String) = js.native
    
    /**
      * ID of the element which is the current target of the association {@link #getTitle title}, or `null`.
      */
    def getTitle(): ID = js.native
    
    /**
      * Gets current value of property {@link #getTitleStyle titleStyle}.
      *
      * Defines the style of the title. When using the `Auto` styling, the appearance of the title depends on
      * the current position of the title (e.g. inside a `Toolbar`). This default behavior can be overridden
      * by setting a different style explicitly. The actual appearance of the title and the different styles
      * always depends on the theme being used.
      *
      * Default value is `Auto`.
      *
      * @returns Value of property `titleStyle`
      */
    def getTitleStyle(): TitleLevel | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TitleLevel * / any */ String) = js.native
    
    /**
      * Gets current value of property {@link #getWidth width}.
      *
      * Defines the width of the title.
      *
      * @returns Value of property `width`
      */
    def getWidth(): CSSSize = js.native
    
    /**
      * @since 1.52
      *
      * Gets current value of property {@link #getWrapping wrapping}.
      *
      * Enables text wrapping.
      *
      * **Note:** Wrapping must only be activated if the surrounding container allows flexible heights. **Note:**
      * this property will be ignored if there is a control added to the `content` aggregation
      *
      * Default value is `false`.
      *
      * @returns Value of property `wrapping`
      */
    def getWrapping(): Boolean = js.native
    
    /**
      * @since 1.60
      *
      * Gets current value of property {@link #getWrappingType wrappingType}.
      *
      * Defines the type of text wrapping to be used (hyphenated or normal).
      *
      * **Note:** This property takes effect only when the `wrapping` property is set to `true`. **Note:** this
      * property will be ignored if there is a control added to the `content` aggregation
      *
      * Default value is `Normal`.
      *
      * @returns Value of property `wrappingType`
      */
    def getWrappingType(): WrappingType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof WrappingType * / any */ String) = js.native
    
    /**
      * @since 1.87
      *
      * Sets the aggregated {@link #getContent content}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setContent(/**
      * The content to set
      */
    oContent: ITitleContent): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getLevel level}.
      *
      * Defines the semantic level of the title. This information is e.g. used by assistive technologies like
      * screenreaders to create a hierarchical site map for faster navigation. Depending on this setting either
      * an HTML h1-h6 element is used or when using level `Auto` no explicit level information is written (HTML5
      * header element). This property does not influence the style of the control. Use the property `titleStyle`
      * for this purpose instead.
      *
      * **Note:** this property will be overridden if there is title element associated and it has `level` property
      * set.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `Auto`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setLevel(): this.type = js.native
    def setLevel(
      /**
      * New value for property `level`
      */
    sLevel: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TitleLevel * / any */ String
    ): this.type = js.native
    def setLevel(/**
      * New value for property `level`
      */
    sLevel: TitleLevel): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getText text}.
      *
      * Defines the text that should be displayed as a title.
      *
      * **Note:** this property is not used if there is a control added to the `content` aggregation **Note:**
      * this property will be overridden if there is title element associated and it has `text` property set.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
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
      * Defines the alignment of the text within the title. **Note:** This property only has an effect if the
      * overall width of the title control is larger than the displayed text.
      *
      * **Note:** this property will be overridden if there is a control added to the `content` aggregation
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `Initial`.
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
      * Options for the text direction are RTL and LTR. Alternatively, the control can inherit the text direction
      * from its parent container.
      *
      * **Note:** this property will be overridden if there is a control added to the `content` aggregation
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
      * Sets the title for a `sap.m.Title` or `sap.ui.core.Title`
      *
      * @returns this Title reference for chaining.
      */
    def setTitle(
      /**
      * Given variant of the a title which can be `sap.m.Title` or `sap.ui.core.Title`.
      */
    vTitle: Title
    ): this.type = js.native
    def setTitle(
      /**
      * Given variant of the a title which can be `sap.m.Title` or `sap.ui.core.Title`.
      */
    vTitle: typings.openui5.sapUiCoreTitleMod.default
    ): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getTitleStyle titleStyle}.
      *
      * Defines the style of the title. When using the `Auto` styling, the appearance of the title depends on
      * the current position of the title (e.g. inside a `Toolbar`). This default behavior can be overridden
      * by setting a different style explicitly. The actual appearance of the title and the different styles
      * always depends on the theme being used.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `Auto`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setTitleStyle(): this.type = js.native
    def setTitleStyle(
      /**
      * New value for property `titleStyle`
      */
    sTitleStyle: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TitleLevel * / any */ String
    ): this.type = js.native
    def setTitleStyle(/**
      * New value for property `titleStyle`
      */
    sTitleStyle: TitleLevel): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getWidth width}.
      *
      * Defines the width of the title.
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
      * @since 1.52
      *
      * Sets a new value for property {@link #getWrapping wrapping}.
      *
      * Enables text wrapping.
      *
      * **Note:** Wrapping must only be activated if the surrounding container allows flexible heights. **Note:**
      * this property will be ignored if there is a control added to the `content` aggregation
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setWrapping(): this.type = js.native
    def setWrapping(/**
      * New value for property `wrapping`
      */
    bWrapping: Boolean): this.type = js.native
    
    /**
      * @since 1.60
      *
      * Sets a new value for property {@link #getWrappingType wrappingType}.
      *
      * Defines the type of text wrapping to be used (hyphenated or normal).
      *
      * **Note:** This property takes effect only when the `wrapping` property is set to `true`. **Note:** this
      * property will be ignored if there is a control added to the `content` aggregation
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
  }
  
  trait TitleSettings
    extends StObject
       with ControlSettings {
    
    /**
      * @since 1.87
      *
      * Holds a control that implements `sap.ui.core.ITitleContent` and renders this control instead of simple
      * text
      *
      * **Note:** if a control is placed in this aggregation, the following properties of `sap.m.Title` will
      * be overridden - `text`, `textAlign`, `textDirection`; the following will be ignored - `wrapping`, `wrappingType`.
      * The `title` association will be ignored too.
      */
    var content: js.UndefOr[ITitleContent] = js.undefined
    
    /**
      * Defines the semantic level of the title. This information is e.g. used by assistive technologies like
      * screenreaders to create a hierarchical site map for faster navigation. Depending on this setting either
      * an HTML h1-h6 element is used or when using level `Auto` no explicit level information is written (HTML5
      * header element). This property does not influence the style of the control. Use the property `titleStyle`
      * for this purpose instead.
      *
      * **Note:** this property will be overridden if there is title element associated and it has `level` property
      * set.
      */
    var level: js.UndefOr[
        TitleLevel | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TitleLevel * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * Defines the text that should be displayed as a title.
      *
      * **Note:** this property is not used if there is a control added to the `content` aggregation **Note:**
      * this property will be overridden if there is title element associated and it has `text` property set.
      */
    var text: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Defines the alignment of the text within the title. **Note:** This property only has an effect if the
      * overall width of the title control is larger than the displayed text.
      *
      * **Note:** this property will be overridden if there is a control added to the `content` aggregation
      */
    var textAlign: js.UndefOr[
        TextAlign | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TextAlign * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * Options for the text direction are RTL and LTR. Alternatively, the control can inherit the text direction
      * from its parent container.
      *
      * **Note:** this property will be overridden if there is a control added to the `content` aggregation
      */
    var textDirection: js.UndefOr[
        TextDirection | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TextDirection * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * Defines a relationship to a generic title description.
      *
      * **Note:** if a control is placed in `content` aggregation, the title element associated will be ignored;
      * otherwise the properties `text`, `level` and tooltip (text only) of this element will override
      * the corresponding properties of the `Title` control.
      */
    var title: js.UndefOr[typings.openui5.sapUiCoreTitleMod.default | String] = js.undefined
    
    /**
      * Defines the style of the title. When using the `Auto` styling, the appearance of the title depends on
      * the current position of the title (e.g. inside a `Toolbar`). This default behavior can be overridden
      * by setting a different style explicitly. The actual appearance of the title and the different styles
      * always depends on the theme being used.
      */
    var titleStyle: js.UndefOr[
        TitleLevel | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TitleLevel * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * Defines the width of the title.
      */
    var width: js.UndefOr[
        CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @since 1.52
      *
      * Enables text wrapping.
      *
      * **Note:** Wrapping must only be activated if the surrounding container allows flexible heights. **Note:**
      * this property will be ignored if there is a control added to the `content` aggregation
      */
    var wrapping: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @since 1.60
      *
      * Defines the type of text wrapping to be used (hyphenated or normal).
      *
      * **Note:** This property takes effect only when the `wrapping` property is set to `true`. **Note:** this
      * property will be ignored if there is a control added to the `content` aggregation
      */
    var wrappingType: js.UndefOr[
        WrappingType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof WrappingType * / any */ String) | PropertyBindingInfo
      ] = js.undefined
  }
  object TitleSettings {
    
    inline def apply(): TitleSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TitleSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TitleSettings] (val x: Self) extends AnyVal {
      
      inline def setContent(value: ITitleContent): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setLevel(
        value: TitleLevel | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TitleLevel * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      inline def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
      
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
      
      inline def setTitle(value: typings.openui5.sapUiCoreTitleMod.default | String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleStyle(
        value: TitleLevel | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TitleLevel * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "titleStyle", value.asInstanceOf[js.Any])
      
      inline def setTitleStyleUndefined: Self = StObject.set(x, "titleStyle", js.undefined)
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
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
