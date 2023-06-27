package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapMLibraryMod.PageBackgroundDesign
import typings.openui5.sapTntLibraryMod.IToolHeader
import typings.openui5.sapUiBaseManagedObjectMod.AggregationBindingInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreControlMod.ControlSettings
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapTntToolPageMod {
  
  @JSImport("sap/tnt/ToolPage", JSImport.Default)
  @js.native
  /**
    * Constructor for a new ToolPage.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends ToolPage {
    def this(/**
      * Initial settings for the new control
      */
    mSettings: ToolPageSettings) = this()
    def this(/**
      * ID for the new control, generated automatically if no id is given
      */
    sId: String) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no id is given
      */
    sId: String,
      /**
      * Initial settings for the new control
      */
    mSettings: ToolPageSettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no id is given
      */
    sId: Unit,
      /**
      * Initial settings for the new control
      */
    mSettings: ToolPageSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/tnt/ToolPage", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.tnt.ToolPage with name `sClassName` and enriches it with the information
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
    oClassInfo: ClassInfo[T, ToolPage]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, ToolPage],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.tnt.ToolPage.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait ToolPage
    extends typings.openui5.sapUiCoreControlMod.default {
    
    /**
      * Adds some mainContent to the aggregation {@link #getMainContents mainContents}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addMainContent(
      /**
      * The mainContent to add; if empty, nothing is inserted
      */
    oMainContent: typings.openui5.sapUiCoreControlMod.default
    ): this.type = js.native
    
    /**
      * Destroys the header in the aggregation {@link #getHeader header}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyHeader(): this.type = js.native
    
    /**
      * Destroys all the mainContents in the aggregation {@link #getMainContents mainContents}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyMainContents(): this.type = js.native
    
    /**
      * Destroys the sideContent in the aggregation {@link #getSideContent sideContent}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroySideContent(): this.type = js.native
    
    /**
      * @since 1.93
      *
      * Destroys the subHeader in the aggregation {@link #getSubHeader subHeader}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroySubHeader(): this.type = js.native
    
    /**
      * @since 1.115
      *
      * Gets current value of property {@link #getContentBackgroundDesign contentBackgroundDesign}.
      *
      * Specifies the content background design.
      *
      * Default value is `Standard`.
      *
      * @returns Value of property `contentBackgroundDesign`
      */
    def getContentBackgroundDesign(): PageBackgroundDesign | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PageBackgroundDesign * / any */ String) = js.native
    
    /**
      * Gets content of aggregation {@link #getHeader header}.
      *
      * The control to appear in the header area.
      */
    def getHeader(): IToolHeader = js.native
    
    /**
      * Gets content of aggregation {@link #getMainContents mainContents}.
      *
      * The content section.
      */
    def getMainContents(): js.Array[typings.openui5.sapUiCoreControlMod.default] = js.native
    
    /**
      * Gets content of aggregation {@link #getSideContent sideContent}.
      *
      * The side menu of the layout.
      */
    def getSideContent(): typings.openui5.sapTntSideNavigationMod.default = js.native
    
    /**
      * Gets current value of property {@link #getSideExpanded sideExpanded}.
      *
      * Indicates if the side menu is expanded. Overrides the `expanded` property of the `sideContent` aggregation.
      *
      * Default value is `true`.
      *
      * @returns Value of property `sideExpanded`
      */
    def getSideExpanded(): Boolean = js.native
    
    /**
      * @since 1.93
      *
      * Gets content of aggregation {@link #getSubHeader subHeader}.
      *
      * The control to appear in the subheader area.
      */
    def getSubHeader(): IToolHeader = js.native
    
    /**
      * Checks for the provided `sap.ui.core.Control` in the aggregation {@link #getMainContents mainContents}.
      * and returns its index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfMainContent(
      /**
      * The mainContent whose index is looked for
      */
    oMainContent: typings.openui5.sapUiCoreControlMod.default
    ): int = js.native
    
    /**
      * Inserts a mainContent into the aggregation {@link #getMainContents mainContents}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def insertMainContent(
      /**
      * The mainContent to insert; if empty, nothing is inserted
      */
    oMainContent: typings.openui5.sapUiCoreControlMod.default,
      /**
      * The `0`-based index the mainContent should be inserted at; for a negative value of `iIndex`, the mainContent
      * is inserted at position 0; for a value greater than the current size of the aggregation, the mainContent
      * is inserted at the last position
      */
    iIndex: int
    ): this.type = js.native
    
    /**
      * Removes all the controls from the aggregation {@link #getMainContents mainContents}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllMainContents(): js.Array[typings.openui5.sapUiCoreControlMod.default] = js.native
    
    def removeMainContent(/**
      * The mainContent to remove or its index or id
      */
    vMainContent: String): typings.openui5.sapUiCoreControlMod.default | Null = js.native
    /**
      * Removes a mainContent from the aggregation {@link #getMainContents mainContents}.
      *
      * @returns The removed mainContent or `null`
      */
    def removeMainContent(/**
      * The mainContent to remove or its index or id
      */
    vMainContent: int): typings.openui5.sapUiCoreControlMod.default | Null = js.native
    def removeMainContent(
      /**
      * The mainContent to remove or its index or id
      */
    vMainContent: typings.openui5.sapUiCoreControlMod.default
    ): typings.openui5.sapUiCoreControlMod.default | Null = js.native
    
    /**
      * @since 1.115
      *
      * Sets a new value for property {@link #getContentBackgroundDesign contentBackgroundDesign}.
      *
      * Specifies the content background design.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `Standard`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setContentBackgroundDesign(): this.type = js.native
    def setContentBackgroundDesign(
      /**
      * New value for property `contentBackgroundDesign`
      */
    sContentBackgroundDesign: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PageBackgroundDesign * / any */ String
    ): this.type = js.native
    def setContentBackgroundDesign(
      /**
      * New value for property `contentBackgroundDesign`
      */
    sContentBackgroundDesign: PageBackgroundDesign
    ): this.type = js.native
    
    /**
      * Sets the aggregated {@link #getHeader header}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setHeader(/**
      * The header to set
      */
    oHeader: IToolHeader): this.type = js.native
    
    /**
      * Sets the aggregated {@link #getSideContent sideContent}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setSideContent(/**
      * The sideContent to set
      */
    oSideContent: typings.openui5.sapTntSideNavigationMod.default): this.type = js.native
    
    /**
      * Sets the expand/collapse state of the SideContent.
      *
      * @returns Pointer to the control instance for chaining
      */
    def setSideExpanded(/**
      * defines whether the SideNavigation is expanded.
      */
    bSideExpanded: Boolean): this.type = js.native
    
    /**
      * @since 1.93
      *
      * Sets the aggregated {@link #getSubHeader subHeader}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setSubHeader(/**
      * The subHeader to set
      */
    oSubHeader: IToolHeader): this.type = js.native
    
    /**
      * Toggles the expand/collapse state of the SideContent.
      *
      * @returns Pointer to the control instance for chaining.
      */
    def toggleSideContentMode(): this.type = js.native
  }
  
  trait ToolPageSettings
    extends StObject
       with ControlSettings {
    
    /**
      * @since 1.115
      *
      * Specifies the content background design.
      */
    var contentBackgroundDesign: js.UndefOr[
        PageBackgroundDesign | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PageBackgroundDesign * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * The control to appear in the header area.
      */
    var header: js.UndefOr[IToolHeader] = js.undefined
    
    /**
      * The content section.
      */
    var mainContents: js.UndefOr[
        js.Array[typings.openui5.sapUiCoreControlMod.default] | typings.openui5.sapUiCoreControlMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * The side menu of the layout.
      */
    var sideContent: js.UndefOr[typings.openui5.sapTntSideNavigationMod.default] = js.undefined
    
    /**
      * Indicates if the side menu is expanded. Overrides the `expanded` property of the `sideContent` aggregation.
      */
    var sideExpanded: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @since 1.93
      *
      * The control to appear in the subheader area.
      */
    var subHeader: js.UndefOr[IToolHeader] = js.undefined
  }
  object ToolPageSettings {
    
    inline def apply(): ToolPageSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ToolPageSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ToolPageSettings] (val x: Self) extends AnyVal {
      
      inline def setContentBackgroundDesign(
        value: PageBackgroundDesign | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PageBackgroundDesign * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "contentBackgroundDesign", value.asInstanceOf[js.Any])
      
      inline def setContentBackgroundDesignUndefined: Self = StObject.set(x, "contentBackgroundDesign", js.undefined)
      
      inline def setHeader(value: IToolHeader): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
      
      inline def setMainContents(
        value: js.Array[typings.openui5.sapUiCoreControlMod.default] | typings.openui5.sapUiCoreControlMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "mainContents", value.asInstanceOf[js.Any])
      
      inline def setMainContentsUndefined: Self = StObject.set(x, "mainContents", js.undefined)
      
      inline def setMainContentsVarargs(value: typings.openui5.sapUiCoreControlMod.default*): Self = StObject.set(x, "mainContents", js.Array(value*))
      
      inline def setSideContent(value: typings.openui5.sapTntSideNavigationMod.default): Self = StObject.set(x, "sideContent", value.asInstanceOf[js.Any])
      
      inline def setSideContentUndefined: Self = StObject.set(x, "sideContent", js.undefined)
      
      inline def setSideExpanded(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "sideExpanded", value.asInstanceOf[js.Any])
      
      inline def setSideExpandedUndefined: Self = StObject.set(x, "sideExpanded", js.undefined)
      
      inline def setSubHeader(value: IToolHeader): Self = StObject.set(x, "subHeader", value.asInstanceOf[js.Any])
      
      inline def setSubHeaderUndefined: Self = StObject.set(x, "subHeader", js.undefined)
    }
  }
}
