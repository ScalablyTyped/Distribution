package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.AggregationBindingInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCommonsLibraryMod.enums.AreaDesign
import typings.openui5.sapUiCommonsLibraryMod.enums.BorderDesign
import typings.openui5.sapUiCoreControlMod.ControlSettings
import typings.openui5.sapUiCoreLibraryMod.CSSSize
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiCommonsPanelMod {
  
  @JSImport("sap/ui/commons/Panel", JSImport.Default)
  @js.native
  /**
    * Constructor for a new Panel.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends Panel {
    def this(/**
      * Initial settings for the new control
      */
    mSettings: PanelSettings) = this()
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
    mSettings: PanelSettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new control
      */
    mSettings: PanelSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/commons/Panel", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.commons.Panel with name `sClassName` and enriches it with the
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
    oClassInfo: ClassInfo[T, Panel]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, Panel],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.commons.Panel.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait Panel
    extends typings.openui5.sapUiCoreControlMod.default {
    
    /**
      * Adds some button to the aggregation {@link #getButtons buttons}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addButton(
      /**
      * The button to add; if empty, nothing is inserted
      */
    oButton: typings.openui5.sapUiCommonsButtonMod.default
    ): this.type = js.native
    
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
      * Destroys all the buttons in the aggregation {@link #getButtons buttons}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyButtons(): this.type = js.native
    
    /**
      * Destroys all the content in the aggregation {@link #getContent content}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyContent(): this.type = js.native
    
    /**
      * Destroys the title in the aggregation {@link #getTitle title}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyTitle(): this.type = js.native
    
    /**
      * Gets current value of property {@link #getApplyContentPadding applyContentPadding}.
      *
      * Determines whether the Panel will have padding. Padding is theme-dependent.
      *
      * Default value is `true`.
      *
      * @returns Value of property `applyContentPadding`
      */
    def getApplyContentPadding(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getAreaDesign areaDesign}.
      *
      * Determines the background color. Note that color settings are theme-dependent.
      *
      * Default value is `Fill`.
      *
      * @returns Value of property `areaDesign`
      */
    def getAreaDesign(): AreaDesign | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof enums.AreaDesign * / any */ String) = js.native
    
    /**
      * Gets current value of property {@link #getBorderDesign borderDesign}.
      *
      * Determines if the Panel can have a box as border. Note that displaying borders is theme-dependent.
      *
      * Default value is `Box`.
      *
      * @returns Value of property `borderDesign`
      */
    def getBorderDesign(): BorderDesign | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof enums.BorderDesign * / any */ String) = js.native
    
    /**
      * Gets content of aggregation {@link #getButtons buttons}.
      *
      * The buttons that shall be displayed in the Panel header
      */
    def getButtons(): js.Array[typings.openui5.sapUiCommonsButtonMod.default] = js.native
    
    /**
      * Gets current value of property {@link #getCollapsed collapsed}.
      *
      * Determines whether the Panel will be initially collapsed. When it is initially collapsed, the contents
      * are not rendered. A collapsed Panel consumes less space than an expanded one.
      *
      * Default value is `false`.
      *
      * @returns Value of property `collapsed`
      */
    def getCollapsed(): Boolean = js.native
    
    /**
      * Gets content of aggregation {@link #getContent content}.
      *
      * Aggregates the controls that are contained in the Panel. It is recommended to use a layout control as
      * single direct child. When the Panel dimensions are set, the child control may have width and height of
      * 100%. When the dimensions are not set, the child defines the size of the Panel.
      */
    def getContent(): js.Array[typings.openui5.sapUiCoreControlMod.default] = js.native
    
    /**
      * Gets current value of property {@link #getEnabled enabled}.
      *
      * Represents the state of the of the Panel (enabled or disabled)
      *
      * Default value is `true`.
      *
      * @returns Value of property `enabled`
      */
    def getEnabled(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getHeight height}.
      *
      * Determines the height of the Panel in CSS size. Per default, the height for the Panel is automatically
      * adjusted to the content. Dimension allows to explicitly specify the height.
      *
      * @returns Value of property `height`
      */
    def getHeight(): CSSSize = js.native
    
    /**
      * Returns the scroll position of the panel in pixels from the left. Returns 0 if not rendered yet. Also
      * internally updates the control property.
      *
      * @returns The scroll position.
      */
    def getScrollLeft(): int = js.native
    
    /**
      * Returns the scroll position of the panel in pixels from the top. Returns 0 if not rendered yet. Also
      * internally updates the control property.
      *
      * @returns The scroll position.
      */
    def getScrollTop(): int = js.native
    
    /**
      * Gets current value of property {@link #getShowCollapseIcon showCollapseIcon}.
      *
      * Determines whether the Panel will have an icon for collapsing/expanding, or not.
      *
      * Default value is `true`.
      *
      * @returns Value of property `showCollapseIcon`
      */
    def getShowCollapseIcon(): Boolean = js.native
    
    /**
      * Returns the text that is rendered in the Panel header. If a Title control was used it returns the text
      * of the Title control.
      *
      * @returns The text in the Panel header.
      */
    def getText(): String = js.native
    
    /**
      * Gets content of aggregation {@link #getTitle title}.
      *
      * Aggregates the title element of the Panel. For text titles only, you alternatively could use setText()
      * which also creates a title in the background.
      */
    def getTitle(): typings.openui5.sapUiCoreTitleMod.default = js.native
    
    /**
      * Gets current value of property {@link #getWidth width}.
      *
      * Determines the width of the Panel in CSS size.
      *
      * Default value is `'100%'`.
      *
      * @returns Value of property `width`
      */
    def getWidth(): CSSSize = js.native
    
    /**
      * Checks for the provided `sap.ui.commons.Button` in the aggregation {@link #getButtons buttons}. and returns
      * its index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfButton(
      /**
      * The button whose index is looked for
      */
    oButton: typings.openui5.sapUiCommonsButtonMod.default
    ): int = js.native
    
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
      * Inserts a button into the aggregation {@link #getButtons buttons}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def insertButton(
      /**
      * The button to insert; if empty, nothing is inserted
      */
    oButton: typings.openui5.sapUiCommonsButtonMod.default,
      /**
      * The `0`-based index the button should be inserted at; for a negative value of `iIndex`, the button is
      * inserted at position 0; for a value greater than the current size of the aggregation, the button is inserted
      * at the last position
      */
    iIndex: int
    ): this.type = js.native
    
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
      * Removes all the controls from the aggregation {@link #getButtons buttons}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllButtons(): js.Array[typings.openui5.sapUiCommonsButtonMod.default] = js.native
    
    /**
      * Removes all the controls from the aggregation {@link #getContent content}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllContent(): js.Array[typings.openui5.sapUiCoreControlMod.default] = js.native
    
    def removeButton(/**
      * The button to remove or its index or id
      */
    vButton: String): typings.openui5.sapUiCommonsButtonMod.default | Null = js.native
    /**
      * Removes a button from the aggregation {@link #getButtons buttons}.
      *
      * @returns The removed button or `null`
      */
    def removeButton(/**
      * The button to remove or its index or id
      */
    vButton: int): typings.openui5.sapUiCommonsButtonMod.default | Null = js.native
    def removeButton(
      /**
      * The button to remove or its index or id
      */
    vButton: typings.openui5.sapUiCommonsButtonMod.default
    ): typings.openui5.sapUiCommonsButtonMod.default | Null = js.native
    
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
      * Property setter for the padding
      *
      * @returns `this` to allow method chaining.
      */
    def setApplyContentPadding(/**
      * Whether the Panel should have padding.
      */
    bPadding: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getAreaDesign areaDesign}.
      *
      * Determines the background color. Note that color settings are theme-dependent.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `Fill`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setAreaDesign(): this.type = js.native
    def setAreaDesign(
      /**
      * New value for property `areaDesign`
      */
    sAreaDesign: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof enums.AreaDesign * / any */ String
    ): this.type = js.native
    def setAreaDesign(/**
      * New value for property `areaDesign`
      */
    sAreaDesign: AreaDesign): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getBorderDesign borderDesign}.
      *
      * Determines if the Panel can have a box as border. Note that displaying borders is theme-dependent.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `Box`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setBorderDesign(): this.type = js.native
    def setBorderDesign(
      /**
      * New value for property `borderDesign`
      */
    sBorderDesign: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof enums.BorderDesign * / any */ String
    ): this.type = js.native
    def setBorderDesign(/**
      * New value for property `borderDesign`
      */
    sBorderDesign: BorderDesign): this.type = js.native
    
    /**
      * Property setter for the "collapsed" state
      *
      * @returns `this` to allow method chaining.
      */
    def setCollapsed(/**
      * Whether the Panel should be collapsed or not.
      */
    bCollapsed: Boolean): this.type = js.native
    
    /**
      * Sets the dimensions of the panel.
      *
      * @returns `this` to allow method chaining.
      */
    def setDimensions(
      /**
      * The width of the panel as CSS size.
      */
    sWidth: CSSSize,
      /**
      * The height of the panel as CSS size.
      */
    sHeight: CSSSize
    ): this.type = js.native
    
    /**
      * Property setter for the "enabled" state
      *
      * @returns `this` to allow method chaining.
      */
    def setEnabled(/**
      * Whether the Panel should be enabled or not.
      */
    bEnabled: Boolean): this.type = js.native
    
    /**
      * Sets the height of the panel.
      *
      * @returns `this` to allow method chaining.
      */
    def setHeight(/**
      * The height of the panel as CSS size.
      */
    sHeight: CSSSize): this.type = js.native
    
    /**
      * Sets the scroll position of the panel in pixels from the left.
      *
      * @returns `this` to allow method chaining.
      */
    def setScrollLeft(/**
      * The position to scroll to.
      */
    iPosition: int): this.type = js.native
    
    /**
      * Sets the scrolls position of the panel in pixels from the top.
      *
      * @returns `this` to allow method chaining.
      */
    def setScrollTop(/**
      * The position to scroll to.
      */
    iPosition: int): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getShowCollapseIcon showCollapseIcon}.
      *
      * Determines whether the Panel will have an icon for collapsing/expanding, or not.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setShowCollapseIcon(): this.type = js.native
    def setShowCollapseIcon(/**
      * New value for property `showCollapseIcon`
      */
    bShowCollapseIcon: Boolean): this.type = js.native
    
    /**
      * Sets the text that will be rendered in the Panel header.
      *
      * @returns `this` to allow method chaining.
      */
    def setText(/**
      * The text to render in the header.
      */
    sText: String): this.type = js.native
    
    /**
      * Sets a Tille control that will be rendered in the Panel header.
      *
      * @returns `this` to allow method chaining.
      */
    def setTitle(/**
      * The Title to render in the header.
      */
    oTitle: typings.openui5.sapUiCoreTitleMod.default): this.type = js.native
    
    /**
      * Sets the width of the panel.
      *
      * @returns `this` to allow method chaining.
      */
    def setWidth(/**
      * The width of the panel as CSS size.
      */
    sWidth: CSSSize): this.type = js.native
  }
  
  trait PanelSettings
    extends StObject
       with ControlSettings {
    
    /**
      * Determines whether the Panel will have padding. Padding is theme-dependent.
      */
    var applyContentPadding: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Determines the background color. Note that color settings are theme-dependent.
      */
    var areaDesign: js.UndefOr[
        AreaDesign | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof enums.AreaDesign * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * Determines if the Panel can have a box as border. Note that displaying borders is theme-dependent.
      */
    var borderDesign: js.UndefOr[
        BorderDesign | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof enums.BorderDesign * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * The buttons that shall be displayed in the Panel header
      */
    var buttons: js.UndefOr[
        js.Array[typings.openui5.sapUiCommonsButtonMod.default] | typings.openui5.sapUiCommonsButtonMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Determines whether the Panel will be initially collapsed. When it is initially collapsed, the contents
      * are not rendered. A collapsed Panel consumes less space than an expanded one.
      */
    var collapsed: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Aggregates the controls that are contained in the Panel. It is recommended to use a layout control as
      * single direct child. When the Panel dimensions are set, the child control may have width and height of
      * 100%. When the dimensions are not set, the child defines the size of the Panel.
      */
    var content: js.UndefOr[
        js.Array[typings.openui5.sapUiCoreControlMod.default] | typings.openui5.sapUiCoreControlMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Represents the state of the of the Panel (enabled or disabled)
      */
    var enabled: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Determines the height of the Panel in CSS size. Per default, the height for the Panel is automatically
      * adjusted to the content. Dimension allows to explicitly specify the height.
      */
    var height: js.UndefOr[
        CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Determines the scroll position from left to right. Value "0" means leftmost position.
      */
    var scrollLeft: js.UndefOr[int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * Determines the scroll position from top to bottom. Value "0" means topmost position.
      */
    var scrollTop: js.UndefOr[int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * Determines whether the Panel will have an icon for collapsing/expanding, or not.
      */
    var showCollapseIcon: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Specifies the text that is rendered in the Panel header. Can be used to create a simple titles that do
      * not require an icon in the header.
      */
    var text: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Aggregates the title element of the Panel. For text titles only, you alternatively could use setText()
      * which also creates a title in the background.
      */
    var title: js.UndefOr[typings.openui5.sapUiCoreTitleMod.default] = js.undefined
    
    /**
      * Determines the width of the Panel in CSS size.
      */
    var width: js.UndefOr[
        CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
  }
  object PanelSettings {
    
    inline def apply(): PanelSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PanelSettings]
    }
    
    extension [Self <: PanelSettings](x: Self) {
      
      inline def setApplyContentPadding(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "applyContentPadding", value.asInstanceOf[js.Any])
      
      inline def setApplyContentPaddingUndefined: Self = StObject.set(x, "applyContentPadding", js.undefined)
      
      inline def setAreaDesign(
        value: AreaDesign | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof enums.AreaDesign * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "areaDesign", value.asInstanceOf[js.Any])
      
      inline def setAreaDesignUndefined: Self = StObject.set(x, "areaDesign", js.undefined)
      
      inline def setBorderDesign(
        value: BorderDesign | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof enums.BorderDesign * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "borderDesign", value.asInstanceOf[js.Any])
      
      inline def setBorderDesignUndefined: Self = StObject.set(x, "borderDesign", js.undefined)
      
      inline def setButtons(
        value: js.Array[typings.openui5.sapUiCommonsButtonMod.default] | typings.openui5.sapUiCommonsButtonMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
      
      inline def setButtonsUndefined: Self = StObject.set(x, "buttons", js.undefined)
      
      inline def setButtonsVarargs(value: typings.openui5.sapUiCommonsButtonMod.default*): Self = StObject.set(x, "buttons", js.Array(value*))
      
      inline def setCollapsed(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "collapsed", value.asInstanceOf[js.Any])
      
      inline def setCollapsedUndefined: Self = StObject.set(x, "collapsed", js.undefined)
      
      inline def setContent(
        value: js.Array[typings.openui5.sapUiCoreControlMod.default] | typings.openui5.sapUiCoreControlMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setContentVarargs(value: typings.openui5.sapUiCoreControlMod.default*): Self = StObject.set(x, "content", js.Array(value*))
      
      inline def setEnabled(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      inline def setHeight(value: CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setScrollLeft(value: int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "scrollLeft", value.asInstanceOf[js.Any])
      
      inline def setScrollLeftUndefined: Self = StObject.set(x, "scrollLeft", js.undefined)
      
      inline def setScrollTop(value: int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "scrollTop", value.asInstanceOf[js.Any])
      
      inline def setScrollTopUndefined: Self = StObject.set(x, "scrollTop", js.undefined)
      
      inline def setShowCollapseIcon(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "showCollapseIcon", value.asInstanceOf[js.Any])
      
      inline def setShowCollapseIconUndefined: Self = StObject.set(x, "showCollapseIcon", js.undefined)
      
      inline def setText(value: String | PropertyBindingInfo): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      inline def setTitle(value: typings.openui5.sapUiCoreTitleMod.default): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setWidth(value: CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
