package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.AggregationBindingInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreControlMod.ControlSettings
import typings.openui5.sapUiCoreLibraryMod.CSSSize
import typings.openui5.sapUiWebcFioriLibraryMod.IBar
import typings.openui5.sapUiWebcFioriLibraryMod.PageBackgroundDesign
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiWebcFioriPageMod {
  
  @JSImport("sap/ui/webc/fiori/Page", JSImport.Default)
  @js.native
  /**
    * Constructor for a new `Page`.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends Page {
    def this(/**
      * Initial settings for the new control
      */
    mSettings: PageSettings) = this()
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
    mSettings: PageSettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new control
      */
    mSettings: PageSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/webc/fiori/Page", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.webc.fiori.Page with name `sClassName` and enriches it with the
      * information contained in `oClassInfo`.
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
    oClassInfo: ClassInfo[T, Page]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, Page],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.webc.fiori.Page.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiWebcCommonWebComponentMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiWebcCommonWebComponentMetadataMod.default]
  }
  
  @js.native
  trait Page
    extends typings.openui5.sapUiWebcCommonWebComponentMod.default {
    
    /**
      * Adds some content to the aggregation {@link #getContent content}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addContent(
      /**
      * The content to add; if empty, nothing is inserted
      */
    oContent: typings.openui5.sapUiCoreControlMod.default
    ): this.type = js.native
    
    /**
      * Destroys all the content in the aggregation {@link #getContent content}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyContent(): this.type = js.native
    
    /**
      * Destroys the footer in the aggregation {@link #getFooter footer}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyFooter(): this.type = js.native
    
    /**
      * Destroys the header in the aggregation {@link #getHeader header}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyHeader(): this.type = js.native
    
    /**
      * Gets current value of property {@link #getBackgroundDesign backgroundDesign}.
      *
      * Defines the background color of the `sap.ui.webc.fiori.Page`.
      *
      *  **Note:** When a ui5-list is placed inside the page, we recommend using “List” to ensure better color
      * contrast.
      *
      *  Available options are:
      * 	 - `Solid` (default)
      * 	 - `Transparent`
      * 	 - `List`
      *
      * Default value is `Solid`.
      *
      * @returns Value of property `backgroundDesign`
      */
    def getBackgroundDesign(): PageBackgroundDesign | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PageBackgroundDesign * / any */ String) = js.native
    
    /**
      * Gets content of aggregation {@link #getContent content}.
      *
      * Defines the content HTML Element.
      */
    def getContent(): js.Array[typings.openui5.sapUiCoreControlMod.default] = js.native
    
    /**
      * Gets current value of property {@link #getDisableScrolling disableScrolling}.
      *
      * Disables vertical scrolling of page content. If set to true, there will be no vertical scrolling at all.
      *
      * Default value is `false`.
      *
      * @returns Value of property `disableScrolling`
      */
    def getDisableScrolling(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getFloatingFooter floatingFooter}.
      *
      * Defines if the footer should float over the content.
      *
      *  **Note:** When set to true the footer floats over the content with a slight offset from the bottom,
      * otherwise it is fixed at the very bottom of the page.
      *
      * Default value is `true`.
      *
      * @returns Value of property `floatingFooter`
      */
    def getFloatingFooter(): Boolean = js.native
    
    /**
      * Gets content of aggregation {@link #getFooter footer}.
      *
      * Defines the footer HTML Element.
      */
    def getFooter(): IBar = js.native
    
    /**
      * Gets content of aggregation {@link #getHeader header}.
      *
      * Defines the header HTML Element.
      */
    def getHeader(): IBar = js.native
    
    /**
      * Gets current value of property {@link #getHeight height}.
      *
      * Defines the height of the control
      *
      * @returns Value of property `height`
      */
    def getHeight(): CSSSize = js.native
    
    /**
      * Gets current value of property {@link #getHideFooter hideFooter}.
      *
      * Defines the footer visibility.
      *
      * Default value is `false`.
      *
      * @returns Value of property `hideFooter`
      */
    def getHideFooter(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getWidth width}.
      *
      * Defines the width of the control
      *
      * @returns Value of property `width`
      */
    def getWidth(): CSSSize = js.native
    
    /**
      * Checks for the provided `sap.ui.core.Control` in the aggregation {@link #getContent content}. and returns
      * its index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfContent(
      /**
      * The content whose index is looked for
      */
    oContent: typings.openui5.sapUiCoreControlMod.default
    ): int = js.native
    
    /**
      * Inserts a content into the aggregation {@link #getContent content}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def insertContent(
      /**
      * The content to insert; if empty, nothing is inserted
      */
    oContent: typings.openui5.sapUiCoreControlMod.default,
      /**
      * The `0`-based index the content should be inserted at; for a negative value of `iIndex`, the content
      * is inserted at position 0; for a value greater than the current size of the aggregation, the content
      * is inserted at the last position
      */
    iIndex: int
    ): this.type = js.native
    
    /**
      * Removes all the controls from the aggregation {@link #getContent content}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllContent(): js.Array[typings.openui5.sapUiCoreControlMod.default] = js.native
    
    def removeContent(/**
      * The content to remove or its index or id
      */
    vContent: String): typings.openui5.sapUiCoreControlMod.default | Null = js.native
    /**
      * Removes a content from the aggregation {@link #getContent content}.
      *
      * @returns The removed content or `null`
      */
    def removeContent(/**
      * The content to remove or its index or id
      */
    vContent: int): typings.openui5.sapUiCoreControlMod.default | Null = js.native
    def removeContent(
      /**
      * The content to remove or its index or id
      */
    vContent: typings.openui5.sapUiCoreControlMod.default
    ): typings.openui5.sapUiCoreControlMod.default | Null = js.native
    
    /**
      * Sets a new value for property {@link #getBackgroundDesign backgroundDesign}.
      *
      * Defines the background color of the `sap.ui.webc.fiori.Page`.
      *
      *  **Note:** When a ui5-list is placed inside the page, we recommend using “List” to ensure better color
      * contrast.
      *
      *  Available options are:
      * 	 - `Solid` (default)
      * 	 - `Transparent`
      * 	 - `List`
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `Solid`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setBackgroundDesign(): this.type = js.native
    def setBackgroundDesign(
      /**
      * New value for property `backgroundDesign`
      */
    sBackgroundDesign: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PageBackgroundDesign * / any */ String
    ): this.type = js.native
    def setBackgroundDesign(/**
      * New value for property `backgroundDesign`
      */
    sBackgroundDesign: PageBackgroundDesign): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getDisableScrolling disableScrolling}.
      *
      * Disables vertical scrolling of page content. If set to true, there will be no vertical scrolling at all.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setDisableScrolling(): this.type = js.native
    def setDisableScrolling(/**
      * New value for property `disableScrolling`
      */
    bDisableScrolling: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getFloatingFooter floatingFooter}.
      *
      * Defines if the footer should float over the content.
      *
      *  **Note:** When set to true the footer floats over the content with a slight offset from the bottom,
      * otherwise it is fixed at the very bottom of the page.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setFloatingFooter(): this.type = js.native
    def setFloatingFooter(/**
      * New value for property `floatingFooter`
      */
    bFloatingFooter: Boolean): this.type = js.native
    
    /**
      * Sets the aggregated {@link #getFooter footer}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setFooter(/**
      * The footer to set
      */
    oFooter: IBar): this.type = js.native
    
    /**
      * Sets the aggregated {@link #getHeader header}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setHeader(/**
      * The header to set
      */
    oHeader: IBar): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getHeight height}.
      *
      * Defines the height of the control
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setHeight(/**
      * New value for property `height`
      */
    sHeight: CSSSize): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getHideFooter hideFooter}.
      *
      * Defines the footer visibility.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setHideFooter(): this.type = js.native
    def setHideFooter(/**
      * New value for property `hideFooter`
      */
    bHideFooter: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getWidth width}.
      *
      * Defines the width of the control
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setWidth(/**
      * New value for property `width`
      */
    sWidth: CSSSize): this.type = js.native
  }
  
  trait PageSettings
    extends StObject
       with ControlSettings {
    
    /**
      * Defines the background color of the `sap.ui.webc.fiori.Page`.
      *
      *  **Note:** When a ui5-list is placed inside the page, we recommend using “List” to ensure better color
      * contrast.
      *
      *  Available options are:
      * 	 - `Solid` (default)
      * 	 - `Transparent`
      * 	 - `List`
      */
    var backgroundDesign: js.UndefOr[
        PageBackgroundDesign | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PageBackgroundDesign * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * Defines the content HTML Element.
      */
    var content: js.UndefOr[
        js.Array[typings.openui5.sapUiCoreControlMod.default] | typings.openui5.sapUiCoreControlMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Disables vertical scrolling of page content. If set to true, there will be no vertical scrolling at all.
      */
    var disableScrolling: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Defines if the footer should float over the content.
      *
      *  **Note:** When set to true the footer floats over the content with a slight offset from the bottom,
      * otherwise it is fixed at the very bottom of the page.
      */
    var floatingFooter: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Defines the footer HTML Element.
      */
    var footer: js.UndefOr[IBar] = js.undefined
    
    /**
      * Defines the header HTML Element.
      */
    var header: js.UndefOr[IBar] = js.undefined
    
    /**
      * Defines the height of the control
      */
    var height: js.UndefOr[
        CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Defines the footer visibility.
      */
    var hideFooter: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Defines the width of the control
      */
    var width: js.UndefOr[
        CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
  }
  object PageSettings {
    
    inline def apply(): PageSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PageSettings]
    }
    
    extension [Self <: PageSettings](x: Self) {
      
      inline def setBackgroundDesign(
        value: PageBackgroundDesign | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PageBackgroundDesign * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "backgroundDesign", value.asInstanceOf[js.Any])
      
      inline def setBackgroundDesignUndefined: Self = StObject.set(x, "backgroundDesign", js.undefined)
      
      inline def setContent(
        value: js.Array[typings.openui5.sapUiCoreControlMod.default] | typings.openui5.sapUiCoreControlMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setContentVarargs(value: typings.openui5.sapUiCoreControlMod.default*): Self = StObject.set(x, "content", js.Array(value*))
      
      inline def setDisableScrolling(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "disableScrolling", value.asInstanceOf[js.Any])
      
      inline def setDisableScrollingUndefined: Self = StObject.set(x, "disableScrolling", js.undefined)
      
      inline def setFloatingFooter(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "floatingFooter", value.asInstanceOf[js.Any])
      
      inline def setFloatingFooterUndefined: Self = StObject.set(x, "floatingFooter", js.undefined)
      
      inline def setFooter(value: IBar): Self = StObject.set(x, "footer", value.asInstanceOf[js.Any])
      
      inline def setFooterUndefined: Self = StObject.set(x, "footer", js.undefined)
      
      inline def setHeader(value: IBar): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
      
      inline def setHeight(value: CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setHideFooter(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "hideFooter", value.asInstanceOf[js.Any])
      
      inline def setHideFooterUndefined: Self = StObject.set(x, "hideFooter", js.undefined)
      
      inline def setWidth(value: CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
