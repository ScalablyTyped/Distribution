package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.AggregationBindingInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreControlMod.ControlSettings
import typings.openui5.sapUiWebcMainLibraryMod.ITab
import typings.openui5.sapUiWebcMainLibraryMod.SemanticColor
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiWebcMainTabMod {
  
  @JSImport("sap/ui/webc/main/Tab", JSImport.Default)
  @js.native
  /**
    * Constructor for a new `Tab`.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends Tab {
    def this(/**
      * Initial settings for the new control
      */
    mSettings: TabSettings) = this()
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
    mSettings: TabSettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new control
      */
    mSettings: TabSettings
    ) = this()
    
    /* CompleteClass */
    var __implements__sap_ui_webc_main_ITab: Boolean = js.native
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/webc/main/Tab", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.webc.main.Tab with name `sClassName` and enriches it with the
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
    oClassInfo: ClassInfo[T, Tab]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, Tab],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.webc.main.Tab.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiWebcCommonWebComponentMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiWebcCommonWebComponentMetadataMod.default]
  }
  
  @js.native
  trait Tab
    extends typings.openui5.sapUiWebcCommonWebComponentMod.default
       with ITab {
    
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
      * Adds some subTab to the aggregation {@link #getSubTabs subTabs}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addSubTab(/**
      * The subTab to add; if empty, nothing is inserted
      */
    oSubTab: ITab): this.type = js.native
    
    /**
      * Destroys all the content in the aggregation {@link #getContent content}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyContent(): this.type = js.native
    
    /**
      * Destroys all the subTabs in the aggregation {@link #getSubTabs subTabs}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroySubTabs(): this.type = js.native
    
    /**
      * Gets current value of property {@link #getAdditionalText additionalText}.
      *
      * Represents the "additionalText" text, which is displayed in the tab.
      *
      * Default value is `empty string`.
      *
      * @returns Value of property `additionalText`
      */
    def getAdditionalText(): String = js.native
    
    /**
      * Gets content of aggregation {@link #getContent content}.
      *
      * Holds the content associated with this tab.
      */
    def getContent(): js.Array[typings.openui5.sapUiCoreControlMod.default] = js.native
    
    /**
      * Gets current value of property {@link #getDesign design}.
      *
      * Defines the component's design color.
      *
      *  The design is applied to:
      * 	 - the component icon
      * 	 - the `text` when the component overflows
      * 	 - the tab selection line
      *
      *
      *
      *  Available designs are: `"Default"`, `"Neutral"`, `"Positive"`, `"Critical"` and `"Negative"`.
      *
      *
      *
      *  **Note:** The design depends on the current theme.
      *
      * Default value is `Default`.
      *
      * @returns Value of property `design`
      */
    def getDesign(): SemanticColor | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SemanticColor * / any */ String) = js.native
    
    /**
      * Gets current value of property {@link #getEnabled enabled}.
      *
      * Defines whether the control is enabled. A disabled control can't be interacted with, and it is not in
      * the tab chain.
      *
      * Default value is `true`.
      *
      * @returns Value of property `enabled`
      */
    def getEnabled(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getIcon icon}.
      *
      * Defines the icon source URI to be displayed as graphical element within the component. The SAP-icons
      * font provides numerous built-in icons. See all the available icons in the {@link demo:sap/m/demokit/iconExplorer/webapp/index.html
      * Icon Explorer}.
      *
      * Default value is `empty string`.
      *
      * @returns Value of property `icon`
      */
    def getIcon(): String = js.native
    
    /**
      * Gets current value of property {@link #getSelected selected}.
      *
      * Specifies if the component is selected.
      *
      * Default value is `false`.
      *
      * @returns Value of property `selected`
      */
    def getSelected(): Boolean = js.native
    
    /**
      * Gets content of aggregation {@link #getSubTabs subTabs}.
      *
      * Defines hierarchies with nested sub tabs.
      *
      *  **Note:** Use `sap.ui.webc.main.Tab` and `sap.ui.webc.main.TabSeparator` for the intended design.
      */
    def getSubTabs(): js.Array[ITab] = js.native
    
    /**
      * Returns the DOM reference of the tab that is placed in the header. **Note:** If you need a DOM ref to
      * the tab content please use the `getDomRef` method.
      */
    def getTabInStripDomRef(): Unit = js.native
    
    /**
      * Gets current value of property {@link #getText text}.
      *
      * The text to be displayed for the item.
      *
      * Default value is `empty string`.
      *
      * @returns Value of property `text`
      */
    def getText(): String = js.native
    
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
      * Checks for the provided `sap.ui.webc.main.ITab` in the aggregation {@link #getSubTabs subTabs}. and returns
      * its index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfSubTab(/**
      * The subTab whose index is looked for
      */
    oSubTab: ITab): int = js.native
    
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
      * Inserts a subTab into the aggregation {@link #getSubTabs subTabs}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def insertSubTab(
      /**
      * The subTab to insert; if empty, nothing is inserted
      */
    oSubTab: ITab,
      /**
      * The `0`-based index the subTab should be inserted at; for a negative value of `iIndex`, the subTab is
      * inserted at position 0; for a value greater than the current size of the aggregation, the subTab is inserted
      * at the last position
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
    
    /**
      * Removes all the controls from the aggregation {@link #getSubTabs subTabs}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllSubTabs(): js.Array[ITab] = js.native
    
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
    
    def removeSubTab(/**
      * The subTab to remove or its index or id
      */
    vSubTab: String): ITab | Null = js.native
    /**
      * Removes a subTab from the aggregation {@link #getSubTabs subTabs}.
      *
      * @returns The removed subTab or `null`
      */
    def removeSubTab(/**
      * The subTab to remove or its index or id
      */
    vSubTab: int): ITab | Null = js.native
    def removeSubTab(/**
      * The subTab to remove or its index or id
      */
    vSubTab: ITab): ITab | Null = js.native
    
    /**
      * Sets a new value for property {@link #getAdditionalText additionalText}.
      *
      * Represents the "additionalText" text, which is displayed in the tab.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `empty string`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setAdditionalText(): this.type = js.native
    def setAdditionalText(/**
      * New value for property `additionalText`
      */
    sAdditionalText: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getDesign design}.
      *
      * Defines the component's design color.
      *
      *  The design is applied to:
      * 	 - the component icon
      * 	 - the `text` when the component overflows
      * 	 - the tab selection line
      *
      *
      *
      *  Available designs are: `"Default"`, `"Neutral"`, `"Positive"`, `"Critical"` and `"Negative"`.
      *
      *
      *
      *  **Note:** The design depends on the current theme.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `Default`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setDesign(): this.type = js.native
    def setDesign(
      /**
      * New value for property `design`
      */
    sDesign: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SemanticColor * / any */ String
    ): this.type = js.native
    def setDesign(/**
      * New value for property `design`
      */
    sDesign: SemanticColor): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getEnabled enabled}.
      *
      * Defines whether the control is enabled. A disabled control can't be interacted with, and it is not in
      * the tab chain.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setEnabled(): this.type = js.native
    def setEnabled(/**
      * New value for property `enabled`
      */
    bEnabled: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getIcon icon}.
      *
      * Defines the icon source URI to be displayed as graphical element within the component. The SAP-icons
      * font provides numerous built-in icons. See all the available icons in the {@link demo:sap/m/demokit/iconExplorer/webapp/index.html
      * Icon Explorer}.
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
    sIcon: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getSelected selected}.
      *
      * Specifies if the component is selected.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setSelected(): this.type = js.native
    def setSelected(/**
      * New value for property `selected`
      */
    bSelected: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getText text}.
      *
      * The text to be displayed for the item.
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
  }
  
  trait TabSettings
    extends StObject
       with ControlSettings {
    
    /**
      * Represents the "additionalText" text, which is displayed in the tab.
      */
    var additionalText: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Holds the content associated with this tab.
      */
    var content: js.UndefOr[
        js.Array[typings.openui5.sapUiCoreControlMod.default] | typings.openui5.sapUiCoreControlMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Defines the component's design color.
      *
      *  The design is applied to:
      * 	 - the component icon
      * 	 - the `text` when the component overflows
      * 	 - the tab selection line
      *
      *
      *
      *  Available designs are: `"Default"`, `"Neutral"`, `"Positive"`, `"Critical"` and `"Negative"`.
      *
      *
      *
      *  **Note:** The design depends on the current theme.
      */
    var design: js.UndefOr[
        SemanticColor | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SemanticColor * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * Defines whether the control is enabled. A disabled control can't be interacted with, and it is not in
      * the tab chain.
      */
    var enabled: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Defines the icon source URI to be displayed as graphical element within the component. The SAP-icons
      * font provides numerous built-in icons. See all the available icons in the {@link demo:sap/m/demokit/iconExplorer/webapp/index.html
      * Icon Explorer}.
      */
    var icon: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Specifies if the component is selected.
      */
    var selected: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Defines hierarchies with nested sub tabs.
      *
      *  **Note:** Use `sap.ui.webc.main.Tab` and `sap.ui.webc.main.TabSeparator` for the intended design.
      */
    var subTabs: js.UndefOr[
        js.Array[ITab] | ITab | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * The text to be displayed for the item.
      */
    var text: js.UndefOr[String | PropertyBindingInfo] = js.undefined
  }
  object TabSettings {
    
    inline def apply(): TabSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TabSettings]
    }
    
    extension [Self <: TabSettings](x: Self) {
      
      inline def setAdditionalText(value: String | PropertyBindingInfo): Self = StObject.set(x, "additionalText", value.asInstanceOf[js.Any])
      
      inline def setAdditionalTextUndefined: Self = StObject.set(x, "additionalText", js.undefined)
      
      inline def setContent(
        value: js.Array[typings.openui5.sapUiCoreControlMod.default] | typings.openui5.sapUiCoreControlMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setContentVarargs(value: typings.openui5.sapUiCoreControlMod.default*): Self = StObject.set(x, "content", js.Array(value*))
      
      inline def setDesign(
        value: SemanticColor | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SemanticColor * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "design", value.asInstanceOf[js.Any])
      
      inline def setDesignUndefined: Self = StObject.set(x, "design", js.undefined)
      
      inline def setEnabled(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      inline def setIcon(value: String | PropertyBindingInfo): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setSelected(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
      
      inline def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
      
      inline def setSubTabs(
        value: js.Array[ITab] | ITab | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "subTabs", value.asInstanceOf[js.Any])
      
      inline def setSubTabsUndefined: Self = StObject.set(x, "subTabs", js.undefined)
      
      inline def setSubTabsVarargs(value: ITab*): Self = StObject.set(x, "subTabs", js.Array(value*))
      
      inline def setText(value: String | PropertyBindingInfo): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    }
  }
}
