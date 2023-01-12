package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapMLibraryMod.LinkConversion
import typings.openui5.sapUiBaseManagedObjectMod.AggregationBindingInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreControlMod.ControlSettings
import typings.openui5.sapUiCoreLibraryMod.CSSSize
import typings.openui5.sapUiCoreLibraryMod.TextAlign
import typings.openui5.sapUiCoreLibraryMod.TextDirection
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapMFormattedTextMod {
  
  @JSImport("sap/m/FormattedText", JSImport.Default)
  @js.native
  /**
    * Constructor for a new FormattedText.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends FormattedText {
    def this(/**
      * Initial settings for the new control
      */
    mSettings: FormattedTextSettings) = this()
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
    mSettings: FormattedTextSettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new control
      */
    mSettings: FormattedTextSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/m/FormattedText", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.m.FormattedText with name `sClassName` and enriches it with the information
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
    oClassInfo: ClassInfo[T, FormattedText]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, FormattedText],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.m.FormattedText.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait FormattedText
    extends typings.openui5.sapUiCoreControlMod.default {
    
    /**
      * Adds some control to the aggregation {@link #getControls controls}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addControl(
      /**
      * The control to add; if empty, nothing is inserted
      */
    oControl: typings.openui5.sapMLinkMod.default
    ): this.type = js.native
    
    /**
      * Destroys all the controls in the aggregation {@link #getControls controls}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyControls(): this.type = js.native
    
    /**
      * Gets content of aggregation {@link #getControls controls}.
      *
      * List of `sap.m.Link` controls that will be used to replace the placeholders in the text. Placeholders
      * are replaced according to their indexes. The placeholder with index %%0 will be replaced by the first
      * link in the aggregation, etc.
      */
    def getControls(): js.Array[typings.openui5.sapMLinkMod.default] = js.native
    
    /**
      * @SINCE 1.45.5
      *
      * Gets current value of property {@link #getConvertLinksToAnchorTags convertLinksToAnchorTags}.
      *
      * Determines whether strings that appear to be links will be converted to HTML anchor tags, and what are
      * the criteria for recognizing them.
      *
      * Default value is `None`.
      *
      * @returns Value of property `convertLinksToAnchorTags`
      */
    def getConvertLinksToAnchorTags(): LinkConversion | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof LinkConversion * / any */ String) = js.native
    
    /**
      * @SINCE 1.45.5
      *
      * Gets current value of property {@link #getConvertedLinksDefaultTarget convertedLinksDefaultTarget}.
      *
      * Determines the `target` attribute of the generated HTML anchor tags.
      *
      * **Note:** Applicable only if `ConvertLinksToAnchorTags` property is used with a value other than `sap.m.LinkConversion.None`.
      * Options are the standard values for the `target` attribute of the HTML anchor tag: `_self`, `_top`, `_blank`,
      * `_parent`, `_search`.
      *
      * Default value is `"_blank"`.
      *
      * @returns Value of property `convertedLinksDefaultTarget`
      */
    def getConvertedLinksDefaultTarget(): String = js.native
    
    /**
      * Gets current value of property {@link #getHeight height}.
      *
      * Optional height of the control in CSS units.
      *
      * @returns Value of property `height`
      */
    def getHeight(): CSSSize = js.native
    
    /**
      * Gets current value of property {@link #getHtmlText htmlText}.
      *
      * Text in HTML format. The following tags are supported:
      * 	 - `a`
      * 	 - `abbr`
      * 	 - `bdi`
      * 	 - `blockquote`
      * 	 - `br`
      * 	 - `cite`
      * 	 - `code`
      * 	 - `em`
      * 	 - `h1`
      * 	 - `h2`
      * 	 - `h3`
      * 	 - `h4`
      * 	 - `h5`
      * 	 - `h6`
      * 	 - `p`
      * 	 - `pre`
      * 	 - `strong`
      * 	 - `span`
      * 	 - `u`
      * 	 - `dl`
      * 	 - `dt`
      * 	 - `dd`
      * 	 - `ul`
      * 	 - `ol`
      * 	 - `li`  `class, style, dir,` and `target` attributes are allowed. If `target` is not set, links
      * 			open in a new window by default. Only safe `href` attributes can be used. See {@link module:sap/base/security/URLListValidator
      * 			URLListValidator}.
      *
      * **Note:** Keep in mind that not supported HTML tags and the content nested inside them are both not rendered
      * by the control.
      *
      * Default value is `empty string`.
      *
      * @returns Value of property `htmlText`
      */
    def getHtmlText(): String = js.native
    
    /**
      * @SINCE 1.86.0
      *
      * Gets current value of property {@link #getTextAlign textAlign}.
      *
      * Determines the text alignment in the text elements in the `FormattedText`.
      *
      * **Note:** This functionality if set to the root element. To set explicit alignment to an element use
      * the `style` attribute.
      *
      * Default value is `Begin`.
      *
      * @returns Value of property `textAlign`
      */
    def getTextAlign(): TextAlign | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TextAlign * / any */ String) = js.native
    
    /**
      * @SINCE 1.86.0
      *
      * Gets current value of property {@link #getTextDirection textDirection}.
      *
      * Defines the directionality of the text in the `FormattedText`, e.g. right-to-left(`RTL`) or left-to-right
      * (`LTR`).
      *
      * **Note:** This functionality if set to the root element. Use the `bdi` element and the `dir` attribute
      * to set explicit direction to an element.
      *
      * Default value is `Inherit`.
      *
      * @returns Value of property `textDirection`
      */
    def getTextDirection(): TextDirection | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TextDirection * / any */ String) = js.native
    
    /**
      * Gets current value of property {@link #getWidth width}.
      *
      * Optional width of the control in CSS units.
      *
      * @returns Value of property `width`
      */
    def getWidth(): CSSSize = js.native
    
    /**
      * Checks for the provided `sap.m.Link` in the aggregation {@link #getControls controls}. and returns its
      * index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfControl(/**
      * The control whose index is looked for
      */
    oControl: typings.openui5.sapMLinkMod.default): int = js.native
    
    /**
      * Inserts a control into the aggregation {@link #getControls controls}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def insertControl(
      /**
      * The control to insert; if empty, nothing is inserted
      */
    oControl: typings.openui5.sapMLinkMod.default,
      /**
      * The `0`-based index the control should be inserted at; for a negative value of `iIndex`, the control
      * is inserted at position 0; for a value greater than the current size of the aggregation, the control
      * is inserted at the last position
      */
    iIndex: int
    ): this.type = js.native
    
    /**
      * Removes all the controls from the aggregation {@link #getControls controls}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllControls(): js.Array[typings.openui5.sapMLinkMod.default] = js.native
    
    def removeControl(/**
      * The control to remove or its index or id
      */
    vControl: String): typings.openui5.sapMLinkMod.default | Null = js.native
    /**
      * Removes a control from the aggregation {@link #getControls controls}.
      *
      * @returns The removed control or `null`
      */
    def removeControl(/**
      * The control to remove or its index or id
      */
    vControl: int): typings.openui5.sapMLinkMod.default | Null = js.native
    def removeControl(
      /**
      * The control to remove or its index or id
      */
    vControl: typings.openui5.sapMLinkMod.default
    ): typings.openui5.sapMLinkMod.default | Null = js.native
    
    /**
      * @SINCE 1.45.5
      *
      * Sets a new value for property {@link #getConvertLinksToAnchorTags convertLinksToAnchorTags}.
      *
      * Determines whether strings that appear to be links will be converted to HTML anchor tags, and what are
      * the criteria for recognizing them.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `None`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setConvertLinksToAnchorTags(): this.type = js.native
    def setConvertLinksToAnchorTags(
      /**
      * New value for property `convertLinksToAnchorTags`
      */
    sConvertLinksToAnchorTags: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof LinkConversion * / any */ String
    ): this.type = js.native
    def setConvertLinksToAnchorTags(
      /**
      * New value for property `convertLinksToAnchorTags`
      */
    sConvertLinksToAnchorTags: LinkConversion
    ): this.type = js.native
    
    /**
      * @SINCE 1.45.5
      *
      * Sets a new value for property {@link #getConvertedLinksDefaultTarget convertedLinksDefaultTarget}.
      *
      * Determines the `target` attribute of the generated HTML anchor tags.
      *
      * **Note:** Applicable only if `ConvertLinksToAnchorTags` property is used with a value other than `sap.m.LinkConversion.None`.
      * Options are the standard values for the `target` attribute of the HTML anchor tag: `_self`, `_top`, `_blank`,
      * `_parent`, `_search`.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `"_blank"`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setConvertedLinksDefaultTarget(): this.type = js.native
    def setConvertedLinksDefaultTarget(
      /**
      * New value for property `convertedLinksDefaultTarget`
      */
    sConvertedLinksDefaultTarget: String
    ): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getHeight height}.
      *
      * Optional height of the control in CSS units.
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
      * Defines the HTML text to be displayed.
      *
      * @returns this for chaining
      */
    def setHtmlText(/**
      * HTML text as a string
      */
    sText: String): this.type = js.native
    
    /**
      * @SINCE 1.86.0
      *
      * Sets a new value for property {@link #getTextAlign textAlign}.
      *
      * Determines the text alignment in the text elements in the `FormattedText`.
      *
      * **Note:** This functionality if set to the root element. To set explicit alignment to an element use
      * the `style` attribute.
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
      * @SINCE 1.86.0
      *
      * Sets a new value for property {@link #getTextDirection textDirection}.
      *
      * Defines the directionality of the text in the `FormattedText`, e.g. right-to-left(`RTL`) or left-to-right
      * (`LTR`).
      *
      * **Note:** This functionality if set to the root element. Use the `bdi` element and the `dir` attribute
      * to set explicit direction to an element.
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
      * Optional width of the control in CSS units.
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
  }
  
  trait FormattedTextSettings
    extends StObject
       with ControlSettings {
    
    /**
      * List of `sap.m.Link` controls that will be used to replace the placeholders in the text. Placeholders
      * are replaced according to their indexes. The placeholder with index %%0 will be replaced by the first
      * link in the aggregation, etc.
      */
    var controls: js.UndefOr[
        js.Array[typings.openui5.sapMLinkMod.default] | typings.openui5.sapMLinkMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @SINCE 1.45.5
      *
      * Determines whether strings that appear to be links will be converted to HTML anchor tags, and what are
      * the criteria for recognizing them.
      */
    var convertLinksToAnchorTags: js.UndefOr[
        LinkConversion | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof LinkConversion * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * @SINCE 1.45.5
      *
      * Determines the `target` attribute of the generated HTML anchor tags.
      *
      * **Note:** Applicable only if `ConvertLinksToAnchorTags` property is used with a value other than `sap.m.LinkConversion.None`.
      * Options are the standard values for the `target` attribute of the HTML anchor tag: `_self`, `_top`, `_blank`,
      * `_parent`, `_search`.
      */
    var convertedLinksDefaultTarget: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Optional height of the control in CSS units.
      */
    var height: js.UndefOr[
        CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Text in HTML format. The following tags are supported:
      * 	 - `a`
      * 	 - `abbr`
      * 	 - `bdi`
      * 	 - `blockquote`
      * 	 - `br`
      * 	 - `cite`
      * 	 - `code`
      * 	 - `em`
      * 	 - `h1`
      * 	 - `h2`
      * 	 - `h3`
      * 	 - `h4`
      * 	 - `h5`
      * 	 - `h6`
      * 	 - `p`
      * 	 - `pre`
      * 	 - `strong`
      * 	 - `span`
      * 	 - `u`
      * 	 - `dl`
      * 	 - `dt`
      * 	 - `dd`
      * 	 - `ul`
      * 	 - `ol`
      * 	 - `li`  `class, style, dir,` and `target` attributes are allowed. If `target` is not set, links
      * 			open in a new window by default. Only safe `href` attributes can be used. See {@link module:sap/base/security/URLListValidator
      * 			URLListValidator}.
      *
      * **Note:** Keep in mind that not supported HTML tags and the content nested inside them are both not rendered
      * by the control.
      */
    var htmlText: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * @SINCE 1.86.0
      *
      * Determines the text alignment in the text elements in the `FormattedText`.
      *
      * **Note:** This functionality if set to the root element. To set explicit alignment to an element use
      * the `style` attribute.
      */
    var textAlign: js.UndefOr[
        TextAlign | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TextAlign * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * @SINCE 1.86.0
      *
      * Defines the directionality of the text in the `FormattedText`, e.g. right-to-left(`RTL`) or left-to-right
      * (`LTR`).
      *
      * **Note:** This functionality if set to the root element. Use the `bdi` element and the `dir` attribute
      * to set explicit direction to an element.
      */
    var textDirection: js.UndefOr[
        TextDirection | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TextDirection * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * Optional width of the control in CSS units.
      */
    var width: js.UndefOr[
        CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
  }
  object FormattedTextSettings {
    
    inline def apply(): FormattedTextSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FormattedTextSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FormattedTextSettings] (val x: Self) extends AnyVal {
      
      inline def setControls(
        value: js.Array[typings.openui5.sapMLinkMod.default] | typings.openui5.sapMLinkMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "controls", value.asInstanceOf[js.Any])
      
      inline def setControlsUndefined: Self = StObject.set(x, "controls", js.undefined)
      
      inline def setControlsVarargs(value: typings.openui5.sapMLinkMod.default*): Self = StObject.set(x, "controls", js.Array(value*))
      
      inline def setConvertLinksToAnchorTags(
        value: LinkConversion | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof LinkConversion * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "convertLinksToAnchorTags", value.asInstanceOf[js.Any])
      
      inline def setConvertLinksToAnchorTagsUndefined: Self = StObject.set(x, "convertLinksToAnchorTags", js.undefined)
      
      inline def setConvertedLinksDefaultTarget(value: String | PropertyBindingInfo): Self = StObject.set(x, "convertedLinksDefaultTarget", value.asInstanceOf[js.Any])
      
      inline def setConvertedLinksDefaultTargetUndefined: Self = StObject.set(x, "convertedLinksDefaultTarget", js.undefined)
      
      inline def setHeight(value: CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setHtmlText(value: String | PropertyBindingInfo): Self = StObject.set(x, "htmlText", value.asInstanceOf[js.Any])
      
      inline def setHtmlTextUndefined: Self = StObject.set(x, "htmlText", js.undefined)
      
      inline def setTextAlign(
        value: TextAlign | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TextAlign * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "textAlign", value.asInstanceOf[js.Any])
      
      inline def setTextAlignUndefined: Self = StObject.set(x, "textAlign", js.undefined)
      
      inline def setTextDirection(
        value: TextDirection | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TextDirection * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "textDirection", value.asInstanceOf[js.Any])
      
      inline def setTextDirectionUndefined: Self = StObject.set(x, "textDirection", js.undefined)
      
      inline def setWidth(value: CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
