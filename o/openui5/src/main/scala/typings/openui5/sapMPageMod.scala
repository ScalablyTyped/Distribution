package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapMLibraryMod.ButtonType
import typings.openui5.sapMLibraryMod.IBar
import typings.openui5.sapMLibraryMod.PageBackgroundDesign
import typings.openui5.sapMLibraryMod.TitleAlignment
import typings.openui5.sapUiBaseManagedObjectMod.AggregationBindingInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreControlMod.ControlSettings
import typings.openui5.sapUiCoreLibraryMod.TitleLevel
import typings.openui5.sapUiCoreLibraryMod.URI
import typings.std.HTMLElement
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapMPageMod {
  
  @JSImport("sap/m/Page", JSImport.Default)
  @js.native
  /**
    * Constructor for a new Page.
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
    
    @JSImport("sap/m/Page", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.m.Page with name `sClassName` and enriches it with the information
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
      * Returns a metadata object for class sap.m.Page.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait Page
    extends typings.openui5.sapUiCoreControlMod.default {
    
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
      * Adds some headerContent to the aggregation {@link #getHeaderContent headerContent}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addHeaderContent(
      /**
      * The headerContent to add; if empty, nothing is inserted
      */
    oHeaderContent: typings.openui5.sapUiCoreControlMod.default
    ): this.type = js.native
    
    /**
      * @since 1.12.2
      *
      * Attaches event handler `fnFunction` to the {@link #event:navButtonPress navButtonPress} event of this
      * `sap.m.Page`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.Page` itself.
      *
      * this event is fired when Nav Button is pressed
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachNavButtonPress(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit]
    ): this.type = js.native
    def attachNavButtonPress(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.Page` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * @since 1.12.2
      *
      * Attaches event handler `fnFunction` to the {@link #event:navButtonPress navButtonPress} event of this
      * `sap.m.Page`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.Page` itself.
      *
      * this event is fired when Nav Button is pressed
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachNavButtonPress(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit]
    ): this.type = js.native
    def attachNavButtonPress(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.Page` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * @deprecated (since 1.12.2) - the navButtonPress event is replacing this event
      *
      * Attaches event handler `fnFunction` to the {@link #event:navButtonTap navButtonTap} event of this `sap.m.Page`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.Page` itself.
      *
      * this event is fired when Nav Button is tapped
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachNavButtonTap(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit]
    ): this.type = js.native
    def attachNavButtonTap(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.Page` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * @deprecated (since 1.12.2) - the navButtonPress event is replacing this event
      *
      * Attaches event handler `fnFunction` to the {@link #event:navButtonTap navButtonTap} event of this `sap.m.Page`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.Page` itself.
      *
      * this event is fired when Nav Button is tapped
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachNavButtonTap(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit]
    ): this.type = js.native
    def attachNavButtonTap(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.Page` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Destroys all the content in the aggregation {@link #getContent content}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyContent(): this.type = js.native
    
    /**
      * Destroys the customHeader in the aggregation {@link #getCustomHeader customHeader}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyCustomHeader(): this.type = js.native
    
    /**
      * Destroys the footer in the aggregation {@link #getFooter footer}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyFooter(): this.type = js.native
    
    /**
      * Destroys all the headerContent in the aggregation {@link #getHeaderContent headerContent}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyHeaderContent(): this.type = js.native
    
    /**
      * Destroys the landmarkInfo in the aggregation {@link #getLandmarkInfo landmarkInfo}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyLandmarkInfo(): this.type = js.native
    
    /**
      * Destroys the subHeader in the aggregation {@link #getSubHeader subHeader}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroySubHeader(): this.type = js.native
    
    /**
      * @since 1.12.2
      *
      * Detaches event handler `fnFunction` from the {@link #event:navButtonPress navButtonPress} event of this
      * `sap.m.Page`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachNavButtonPress(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit]
    ): this.type = js.native
    def detachNavButtonPress(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit],
      /**
      * Context object on which the given function had to be called
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * @deprecated (since 1.12.2) - the navButtonPress event is replacing this event
      *
      * Detaches event handler `fnFunction` from the {@link #event:navButtonTap navButtonTap} event of this `sap.m.Page`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachNavButtonTap(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit]
    ): this.type = js.native
    def detachNavButtonTap(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit],
      /**
      * Context object on which the given function had to be called
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * @since 1.12.2
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Fires event {@link #event:navButtonPress navButtonPress} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireNavButtonPress(): this.type = js.native
    def fireNavButtonPress(/**
      * Parameters to pass along with the event
      */
    mParameters: js.Object): this.type = js.native
    
    /**
      * @deprecated (since 1.12.2) - the navButtonPress event is replacing this event
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Fires event {@link #event:navButtonTap navButtonTap} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireNavButtonTap(): this.type = js.native
    def fireNavButtonTap(/**
      * Parameters to pass along with the event
      */
    mParameters: js.Object): this.type = js.native
    
    /**
      * Gets current value of property {@link #getBackgroundDesign backgroundDesign}.
      *
      * This property is used to set the background color of a page. When a list is placed inside a page, the
      * value "List" should be used to display a gray background. "Standard", with the default background color,
      * is used if not specified.
      *
      * Default value is `Standard`.
      *
      * @returns Value of property `backgroundDesign`
      */
    def getBackgroundDesign(): PageBackgroundDesign | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PageBackgroundDesign * / any */ String) = js.native
    
    /**
      * Gets content of aggregation {@link #getContent content}.
      *
      * The content of this page
      */
    def getContent(): js.Array[typings.openui5.sapUiCoreControlMod.default] = js.native
    
    /**
      * @since 1.29.0
      *
      * Gets current value of property {@link #getContentOnlyBusy contentOnlyBusy}.
      *
      * Decides which area is covered by the local BusyIndicator when `page.setBusy()` is called. By default
      * the entire page is covered, including headers and footer. When this property is set to "true", only the
      * content area is covered (not header/sub header and footer), which is useful e.g. when there is a SearchField
      * in the sub header and live search continuously updates the content area while the user is still able
      * to type.
      *
      * Default value is `false`.
      *
      * @returns Value of property `contentOnlyBusy`
      */
    def getContentOnlyBusy(): Boolean = js.native
    
    /**
      * Gets content of aggregation {@link #getCustomHeader customHeader}.
      *
      * The (optional) custom header of this page. Use this aggregation only when a custom header is constructed
      * where the default header consisting of title text + nav button is not sufficient. If this aggregation
      * is set, the simple properties "title", "showNavButton", "NavButtonText" and "icon" are not used.
      */
    def getCustomHeader(): IBar = js.native
    
    /**
      * Gets current value of property {@link #getEnableScrolling enableScrolling}.
      *
      * Enable vertical scrolling of page contents. Page headers and footers are fixed and do not scroll. If
      * set to false, there will be no vertical scrolling at all.
      *
      * The Page only allows vertical scrolling because horizontal scrolling is discouraged in general for full-page
      * content. If it still needs to be achieved, disable the Page scrolling and use a ScrollContainer as full-page
      * content of the Page. This allows you to freely configure scrolling. It can also be used to create horizontally-scrolling
      * sub-areas of (vertically-scrolling) Pages.
      *
      * Default value is `true`.
      *
      * @returns Value of property `enableScrolling`
      */
    def getEnableScrolling(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getFloatingFooter floatingFooter}.
      *
      * Decides whether the footer can float. When set to true, the footer is not fixed below the content area
      * anymore, but rather floats over it with a slight offset from the bottom.
      *
      * Default value is `false`.
      *
      * @returns Value of property `floatingFooter`
      */
    def getFloatingFooter(): Boolean = js.native
    
    /**
      * Gets content of aggregation {@link #getFooter footer}.
      *
      * The (optional) footer of this page. It is always located at the bottom of the page
      */
    def getFooter(): IBar = js.native
    
    /**
      * Gets content of aggregation {@link #getHeaderContent headerContent}.
      *
      * Controls to be added to the right side of the page header. Usually an application would use Button controls
      * and limit the number to one when the application needs to run on smartphones. There is no automatic overflow
      * handling when the space is insufficient. When a customHeader is used, this aggregation will be ignored.
      */
    def getHeaderContent(): js.Array[typings.openui5.sapUiCoreControlMod.default] = js.native
    
    /**
      * @deprecated (since 1.20) - Deprecated since the MVI theme is removed now. This property only affected
      * the NavButton in that theme.
      *
      * Gets current value of property {@link #getIcon icon}.
      *
      * the icon that is rendered in the page header bar in non-iOS phone/tablet platforms. This property is
      * theme-dependent and only has an effect in the MVI theme.
      *
      * @returns Value of property `icon`
      */
    def getIcon(): URI = js.native
    
    /**
      * Gets content of aggregation {@link #getLandmarkInfo landmarkInfo}.
      *
      * Accessible landmark settings to be applied on the containers of the `sap.m.Page` control.
      *
      * If not set, no landmarks will be written.
      */
    def getLandmarkInfo(): typings.openui5.sapMPageAccessibleLandmarkInfoMod.default = js.native
    
    /**
      * @deprecated (since 1.20) - Deprecated since the MVI theme is removed now. This property only affected
      * the NavButton in that theme.
      *
      * Gets current value of property {@link #getNavButtonText navButtonText}.
      *
      * The text of the nav button when running in iOS (if shown) in case it deviates from the default, which
      * is "Back". This property is mvi-theme-dependent and will not have any effect in other themes.
      *
      * @returns Value of property `navButtonText`
      */
    def getNavButtonText(): String = js.native
    
    /**
      * Gets current value of property {@link #getNavButtonTooltip navButtonTooltip}.
      *
      * The tooltip of the nav button
      *
      * Since version 1.34
      *
      * @returns Value of property `navButtonTooltip`
      */
    def getNavButtonTooltip(): String = js.native
    
    /**
      * @since 1.12
      * @deprecated (since 1.20) - Deprecated since the MVI theme is removed now. This property is only usable
      * with a Button text in that theme.
      *
      * Gets current value of property {@link #getNavButtonType navButtonType}.
      *
      * This property is used to set the appearance of the NavButton. By default when showNavButton is set to
      * true, a back button will be shown in iOS and an up button in other platforms. In case you want to show
      * a normal button in the left header area, you can set the value to "Default".
      *
      * Default value is `Back`.
      *
      * @returns Value of property `navButtonType`
      */
    def getNavButtonType(): ButtonType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ButtonType * / any */ String) = js.native
    
    /**
      * @since 1.13.1
      *
      * Gets current value of property {@link #getShowFooter showFooter}.
      *
      * Whether this page shall have a footer
      *
      * Default value is `true`.
      *
      * @returns Value of property `showFooter`
      */
    def getShowFooter(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getShowHeader showHeader}.
      *
      * Whether this page shall have a header. If set to true, either the control under the "customHeader" aggregation
      * is used, or if there is no such control, a Header control is constructed from the properties "title",
      * "showNavButton", "navButtonText" and "icon" depending on the platform.
      *
      * Default value is `true`.
      *
      * @returns Value of property `showHeader`
      */
    def getShowHeader(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getShowNavButton showNavButton}.
      *
      * A nav button will be rendered on the left area of header bar if this property is set to true.
      *
      * Default value is `false`.
      *
      * @returns Value of property `showNavButton`
      */
    def getShowNavButton(): Boolean = js.native
    
    /**
      * @since 1.28
      *
      * Gets current value of property {@link #getShowSubHeader showSubHeader}.
      *
      * Whether this page shall show the subheader.
      *
      * Default value is `true`.
      *
      * @returns Value of property `showSubHeader`
      */
    def getShowSubHeader(): Boolean = js.native
    
    /**
      * Gets content of aggregation {@link #getSubHeader subHeader}.
      *
      * a subHeader will be rendered directly under the header
      */
    def getSubHeader(): IBar = js.native
    
    /**
      * Gets current value of property {@link #getTitle title}.
      *
      * The title text appearing in the page header bar.
      *
      * @returns Value of property `title`
      */
    def getTitle(): String = js.native
    
    /**
      * @since 1.72
      *
      * Gets current value of property {@link #getTitleAlignment titleAlignment}.
      *
      * Specifies the Title alignment (theme specific). If set to `TitleAlignment.Auto`, the Title will be aligned
      * as it is set in the theme (if not set, the default value is `center`); Other possible values are `TitleAlignment.Start`
      * (left or right depending on LTR/RTL), and `TitleAlignment.Center` (centered)
      *
      * Default value is `Auto`.
      *
      * @returns Value of property `titleAlignment`
      */
    def getTitleAlignment(): TitleAlignment | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TitleAlignment * / any */ String) = js.native
    
    /**
      * Gets current value of property {@link #getTitleLevel titleLevel}.
      *
      * Defines the semantic level of the title. Using "Auto" no explicit level information is written. Used
      * for accessibility purposes only.
      *
      * Default value is `Auto`.
      *
      * @returns Value of property `titleLevel`
      */
    def getTitleLevel(): TitleLevel | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TitleLevel * / any */ String) = js.native
    
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
      * Checks for the provided `sap.ui.core.Control` in the aggregation {@link #getHeaderContent headerContent}.
      * and returns its index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfHeaderContent(
      /**
      * The headerContent whose index is looked for
      */
    oHeaderContent: typings.openui5.sapUiCoreControlMod.default
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
      * Inserts a headerContent into the aggregation {@link #getHeaderContent headerContent}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def insertHeaderContent(
      /**
      * The headerContent to insert; if empty, nothing is inserted
      */
    oHeaderContent: typings.openui5.sapUiCoreControlMod.default,
      /**
      * The `0`-based index the headerContent should be inserted at; for a negative value of `iIndex`, the headerContent
      * is inserted at position 0; for a value greater than the current size of the aggregation, the headerContent
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
    
    /**
      * Removes all the controls from the aggregation {@link #getHeaderContent headerContent}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllHeaderContent(): js.Array[typings.openui5.sapUiCoreControlMod.default] = js.native
    
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
    
    def removeHeaderContent(/**
      * The headerContent to remove or its index or id
      */
    vHeaderContent: String): typings.openui5.sapUiCoreControlMod.default | Null = js.native
    /**
      * Removes a headerContent from the aggregation {@link #getHeaderContent headerContent}.
      *
      * @returns The removed headerContent or `null`
      */
    def removeHeaderContent(/**
      * The headerContent to remove or its index or id
      */
    vHeaderContent: int): typings.openui5.sapUiCoreControlMod.default | Null = js.native
    def removeHeaderContent(
      /**
      * The headerContent to remove or its index or id
      */
    vHeaderContent: typings.openui5.sapUiCoreControlMod.default
    ): typings.openui5.sapUiCoreControlMod.default | Null = js.native
    
    /**
      * Scrolls to the given position. Only available if enableScrolling is set to "true".
      *
      * @returns `this` to facilitate method chaining.
      */
    def scrollTo(
      /**
      * The vertical pixel position to scroll to. Scrolling down happens with positive values.
      */
    y: int
    ): this.type = js.native
    def scrollTo(
      /**
      * The vertical pixel position to scroll to. Scrolling down happens with positive values.
      */
    y: int,
      /**
      * The duration of animated scrolling in milliseconds. The value `0` results in immediate scrolling without
      * animation.
      */
    time: int
    ): this.type = js.native
    
    def scrollToElement(
      /**
      * The element to which should be scrolled.
      */
    oElement: typings.openui5.sapUiCoreElementMod.default
    ): this.type = js.native
    def scrollToElement(
      /**
      * The element to which should be scrolled.
      */
    oElement: typings.openui5.sapUiCoreElementMod.default,
      /**
      * The duration of animated scrolling in milliseconds. To scroll immediately without animation, give 0 as
      * value.
      */
    iTime: Unit,
      /**
      * Specifies an additional left and top offset of the target scroll position, relative to the upper left
      * corner of the DOM element
      */
    aOffset: js.Array[int]
    ): this.type = js.native
    def scrollToElement(
      /**
      * The element to which should be scrolled.
      */
    oElement: typings.openui5.sapUiCoreElementMod.default,
      /**
      * The duration of animated scrolling in milliseconds. To scroll immediately without animation, give 0 as
      * value.
      */
    iTime: int
    ): this.type = js.native
    def scrollToElement(
      /**
      * The element to which should be scrolled.
      */
    oElement: typings.openui5.sapUiCoreElementMod.default,
      /**
      * The duration of animated scrolling in milliseconds. To scroll immediately without animation, give 0 as
      * value.
      */
    iTime: int,
      /**
      * Specifies an additional left and top offset of the target scroll position, relative to the upper left
      * corner of the DOM element
      */
    aOffset: js.Array[int]
    ): this.type = js.native
    /**
      * @since 1.30
      *
      * Scrolls to an element (DOM or sap.ui.core.Element) within the page if the element is rendered.
      *
      * @returns `this` to facilitate method chaining.
      */
    def scrollToElement(/**
      * The element to which should be scrolled.
      */
    oElement: HTMLElement): this.type = js.native
    def scrollToElement(
      /**
      * The element to which should be scrolled.
      */
    oElement: HTMLElement,
      /**
      * The duration of animated scrolling in milliseconds. To scroll immediately without animation, give 0 as
      * value.
      */
    iTime: Unit,
      /**
      * Specifies an additional left and top offset of the target scroll position, relative to the upper left
      * corner of the DOM element
      */
    aOffset: js.Array[int]
    ): this.type = js.native
    def scrollToElement(
      /**
      * The element to which should be scrolled.
      */
    oElement: HTMLElement,
      /**
      * The duration of animated scrolling in milliseconds. To scroll immediately without animation, give 0 as
      * value.
      */
    iTime: int
    ): this.type = js.native
    def scrollToElement(
      /**
      * The element to which should be scrolled.
      */
    oElement: HTMLElement,
      /**
      * The duration of animated scrolling in milliseconds. To scroll immediately without animation, give 0 as
      * value.
      */
    iTime: int,
      /**
      * Specifies an additional left and top offset of the target scroll position, relative to the upper left
      * corner of the DOM element
      */
    aOffset: js.Array[int]
    ): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getBackgroundDesign backgroundDesign}.
      *
      * This property is used to set the background color of a page. When a list is placed inside a page, the
      * value "List" should be used to display a gray background. "Standard", with the default background color,
      * is used if not specified.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `Standard`.
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
      * @since 1.29.0
      *
      * Sets a new value for property {@link #getContentOnlyBusy contentOnlyBusy}.
      *
      * Decides which area is covered by the local BusyIndicator when `page.setBusy()` is called. By default
      * the entire page is covered, including headers and footer. When this property is set to "true", only the
      * content area is covered (not header/sub header and footer), which is useful e.g. when there is a SearchField
      * in the sub header and live search continuously updates the content area while the user is still able
      * to type.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setContentOnlyBusy(): this.type = js.native
    def setContentOnlyBusy(/**
      * New value for property `contentOnlyBusy`
      */
    bContentOnlyBusy: Boolean): this.type = js.native
    
    /**
      * Sets the aggregated {@link #getCustomHeader customHeader}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setCustomHeader(/**
      * The customHeader to set
      */
    oCustomHeader: IBar): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getEnableScrolling enableScrolling}.
      *
      * Enable vertical scrolling of page contents. Page headers and footers are fixed and do not scroll. If
      * set to false, there will be no vertical scrolling at all.
      *
      * The Page only allows vertical scrolling because horizontal scrolling is discouraged in general for full-page
      * content. If it still needs to be achieved, disable the Page scrolling and use a ScrollContainer as full-page
      * content of the Page. This allows you to freely configure scrolling. It can also be used to create horizontally-scrolling
      * sub-areas of (vertically-scrolling) Pages.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setEnableScrolling(): this.type = js.native
    def setEnableScrolling(/**
      * New value for property `enableScrolling`
      */
    bEnableScrolling: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getFloatingFooter floatingFooter}.
      *
      * Decides whether the footer can float. When set to true, the footer is not fixed below the content area
      * anymore, but rather floats over it with a slight offset from the bottom.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
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
      * @deprecated (since 1.20) - Deprecated since the MVI theme is removed now. This property only affected
      * the NavButton in that theme.
      *
      * Sets a new value for property {@link #getIcon icon}.
      *
      * the icon that is rendered in the page header bar in non-iOS phone/tablet platforms. This property is
      * theme-dependent and only has an effect in the MVI theme.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setIcon(): this.type = js.native
    def setIcon(/**
      * New value for property `icon`
      */
    sIcon: URI): this.type = js.native
    
    /**
      * Sets the aggregated {@link #getLandmarkInfo landmarkInfo}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setLandmarkInfo(
      /**
      * The landmarkInfo to set
      */
    oLandmarkInfo: typings.openui5.sapMPageAccessibleLandmarkInfoMod.default
    ): this.type = js.native
    
    /**
      * @deprecated (since 1.20) - Deprecated since the MVI theme is removed now. This property only affected
      * the NavButton in that theme.
      *
      * Sets a new value for property {@link #getNavButtonText navButtonText}.
      *
      * The text of the nav button when running in iOS (if shown) in case it deviates from the default, which
      * is "Back". This property is mvi-theme-dependent and will not have any effect in other themes.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setNavButtonText(): this.type = js.native
    def setNavButtonText(/**
      * New value for property `navButtonText`
      */
    sNavButtonText: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getNavButtonTooltip navButtonTooltip}.
      *
      * The tooltip of the nav button
      *
      * Since version 1.34
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setNavButtonTooltip(): this.type = js.native
    def setNavButtonTooltip(/**
      * New value for property `navButtonTooltip`
      */
    sNavButtonTooltip: String): this.type = js.native
    
    /**
      * @since 1.12
      * @deprecated (since 1.20) - Deprecated since the MVI theme is removed now. This property is only usable
      * with a Button text in that theme.
      *
      * Sets a new value for property {@link #getNavButtonType navButtonType}.
      *
      * This property is used to set the appearance of the NavButton. By default when showNavButton is set to
      * true, a back button will be shown in iOS and an up button in other platforms. In case you want to show
      * a normal button in the left header area, you can set the value to "Default".
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `Back`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setNavButtonType(): this.type = js.native
    def setNavButtonType(
      /**
      * New value for property `navButtonType`
      */
    sNavButtonType: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ButtonType * / any */ String
    ): this.type = js.native
    def setNavButtonType(/**
      * New value for property `navButtonType`
      */
    sNavButtonType: ButtonType): this.type = js.native
    
    /**
      * @since 1.13.1
      *
      * Sets a new value for property {@link #getShowFooter showFooter}.
      *
      * Whether this page shall have a footer
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setShowFooter(): this.type = js.native
    def setShowFooter(/**
      * New value for property `showFooter`
      */
    bShowFooter: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getShowHeader showHeader}.
      *
      * Whether this page shall have a header. If set to true, either the control under the "customHeader" aggregation
      * is used, or if there is no such control, a Header control is constructed from the properties "title",
      * "showNavButton", "navButtonText" and "icon" depending on the platform.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setShowHeader(): this.type = js.native
    def setShowHeader(/**
      * New value for property `showHeader`
      */
    bShowHeader: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getShowNavButton showNavButton}.
      *
      * A nav button will be rendered on the left area of header bar if this property is set to true.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setShowNavButton(): this.type = js.native
    def setShowNavButton(/**
      * New value for property `showNavButton`
      */
    bShowNavButton: Boolean): this.type = js.native
    
    /**
      * @since 1.28
      *
      * Sets a new value for property {@link #getShowSubHeader showSubHeader}.
      *
      * Whether this page shall show the subheader.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setShowSubHeader(): this.type = js.native
    def setShowSubHeader(/**
      * New value for property `showSubHeader`
      */
    bShowSubHeader: Boolean): this.type = js.native
    
    /**
      * Sets the aggregated {@link #getSubHeader subHeader}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setSubHeader(/**
      * The subHeader to set
      */
    oSubHeader: IBar): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getTitle title}.
      *
      * The title text appearing in the page header bar.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setTitle(): this.type = js.native
    def setTitle(/**
      * New value for property `title`
      */
    sTitle: String): this.type = js.native
    
    /**
      * @since 1.72
      *
      * Sets a new value for property {@link #getTitleAlignment titleAlignment}.
      *
      * Specifies the Title alignment (theme specific). If set to `TitleAlignment.Auto`, the Title will be aligned
      * as it is set in the theme (if not set, the default value is `center`); Other possible values are `TitleAlignment.Start`
      * (left or right depending on LTR/RTL), and `TitleAlignment.Center` (centered)
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `Auto`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setTitleAlignment(): this.type = js.native
    def setTitleAlignment(
      /**
      * New value for property `titleAlignment`
      */
    sTitleAlignment: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TitleAlignment * / any */ String
    ): this.type = js.native
    def setTitleAlignment(/**
      * New value for property `titleAlignment`
      */
    sTitleAlignment: TitleAlignment): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getTitleLevel titleLevel}.
      *
      * Defines the semantic level of the title. Using "Auto" no explicit level information is written. Used
      * for accessibility purposes only.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `Auto`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setTitleLevel(): this.type = js.native
    def setTitleLevel(
      /**
      * New value for property `titleLevel`
      */
    sTitleLevel: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TitleLevel * / any */ String
    ): this.type = js.native
    def setTitleLevel(/**
      * New value for property `titleLevel`
      */
    sTitleLevel: TitleLevel): this.type = js.native
  }
  
  trait Page$NavButtonPressEventParameters extends StObject
  
  trait Page$NavButtonTapEventParameters extends StObject
  
  type PageNavButtonPressEvent = typings.openui5.sapUiBaseEventMod.default[Page$NavButtonPressEventParameters]
  
  type PageNavButtonPressEventParameters = Page$NavButtonPressEventParameters
  
  type PageNavButtonTapEvent = typings.openui5.sapUiBaseEventMod.default[Page$NavButtonTapEventParameters]
  
  type PageNavButtonTapEventParameters = Page$NavButtonTapEventParameters
  
  trait PageSettings
    extends StObject
       with ControlSettings {
    
    /**
      * This property is used to set the background color of a page. When a list is placed inside a page, the
      * value "List" should be used to display a gray background. "Standard", with the default background color,
      * is used if not specified.
      */
    var backgroundDesign: js.UndefOr[
        PageBackgroundDesign | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PageBackgroundDesign * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * The content of this page
      */
    var content: js.UndefOr[
        js.Array[typings.openui5.sapUiCoreControlMod.default] | typings.openui5.sapUiCoreControlMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @since 1.29.0
      *
      * Decides which area is covered by the local BusyIndicator when `page.setBusy()` is called. By default
      * the entire page is covered, including headers and footer. When this property is set to "true", only the
      * content area is covered (not header/sub header and footer), which is useful e.g. when there is a SearchField
      * in the sub header and live search continuously updates the content area while the user is still able
      * to type.
      */
    var contentOnlyBusy: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * The (optional) custom header of this page. Use this aggregation only when a custom header is constructed
      * where the default header consisting of title text + nav button is not sufficient. If this aggregation
      * is set, the simple properties "title", "showNavButton", "NavButtonText" and "icon" are not used.
      */
    var customHeader: js.UndefOr[IBar] = js.undefined
    
    /**
      * Enable vertical scrolling of page contents. Page headers and footers are fixed and do not scroll. If
      * set to false, there will be no vertical scrolling at all.
      *
      * The Page only allows vertical scrolling because horizontal scrolling is discouraged in general for full-page
      * content. If it still needs to be achieved, disable the Page scrolling and use a ScrollContainer as full-page
      * content of the Page. This allows you to freely configure scrolling. It can also be used to create horizontally-scrolling
      * sub-areas of (vertically-scrolling) Pages.
      */
    var enableScrolling: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Decides whether the footer can float. When set to true, the footer is not fixed below the content area
      * anymore, but rather floats over it with a slight offset from the bottom.
      */
    var floatingFooter: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * The (optional) footer of this page. It is always located at the bottom of the page
      */
    var footer: js.UndefOr[IBar] = js.undefined
    
    /**
      * Controls to be added to the right side of the page header. Usually an application would use Button controls
      * and limit the number to one when the application needs to run on smartphones. There is no automatic overflow
      * handling when the space is insufficient. When a customHeader is used, this aggregation will be ignored.
      */
    var headerContent: js.UndefOr[
        js.Array[typings.openui5.sapUiCoreControlMod.default] | typings.openui5.sapUiCoreControlMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @deprecated (since 1.20) - Deprecated since the MVI theme is removed now. This property only affected
      * the NavButton in that theme.
      *
      * the icon that is rendered in the page header bar in non-iOS phone/tablet platforms. This property is
      * theme-dependent and only has an effect in the MVI theme.
      */
    var icon: js.UndefOr[URI | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * Accessible landmark settings to be applied on the containers of the `sap.m.Page` control.
      *
      * If not set, no landmarks will be written.
      */
    var landmarkInfo: js.UndefOr[typings.openui5.sapMPageAccessibleLandmarkInfoMod.default] = js.undefined
    
    /**
      * @since 1.12.2
      *
      * this event is fired when Nav Button is pressed
      */
    var navButtonPress: js.UndefOr[
        js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit]
      ] = js.undefined
    
    /**
      * @deprecated (since 1.12.2) - the navButtonPress event is replacing this event
      *
      * this event is fired when Nav Button is tapped
      */
    var navButtonTap: js.UndefOr[
        js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit]
      ] = js.undefined
    
    /**
      * @deprecated (since 1.20) - Deprecated since the MVI theme is removed now. This property only affected
      * the NavButton in that theme.
      *
      * The text of the nav button when running in iOS (if shown) in case it deviates from the default, which
      * is "Back". This property is mvi-theme-dependent and will not have any effect in other themes.
      */
    var navButtonText: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * The tooltip of the nav button
      *
      * Since version 1.34
      */
    var navButtonTooltip: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * @since 1.12
      * @deprecated (since 1.20) - Deprecated since the MVI theme is removed now. This property is only usable
      * with a Button text in that theme.
      *
      * This property is used to set the appearance of the NavButton. By default when showNavButton is set to
      * true, a back button will be shown in iOS and an up button in other platforms. In case you want to show
      * a normal button in the left header area, you can set the value to "Default".
      */
    var navButtonType: js.UndefOr[
        ButtonType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ButtonType * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * @since 1.13.1
      *
      * Whether this page shall have a footer
      */
    var showFooter: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Whether this page shall have a header. If set to true, either the control under the "customHeader" aggregation
      * is used, or if there is no such control, a Header control is constructed from the properties "title",
      * "showNavButton", "navButtonText" and "icon" depending on the platform.
      */
    var showHeader: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * A nav button will be rendered on the left area of header bar if this property is set to true.
      */
    var showNavButton: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @since 1.28
      *
      * Whether this page shall show the subheader.
      */
    var showSubHeader: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * a subHeader will be rendered directly under the header
      */
    var subHeader: js.UndefOr[IBar] = js.undefined
    
    /**
      * The title text appearing in the page header bar.
      */
    var title: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * @since 1.72
      *
      * Specifies the Title alignment (theme specific). If set to `TitleAlignment.Auto`, the Title will be aligned
      * as it is set in the theme (if not set, the default value is `center`); Other possible values are `TitleAlignment.Start`
      * (left or right depending on LTR/RTL), and `TitleAlignment.Center` (centered)
      */
    var titleAlignment: js.UndefOr[
        TitleAlignment | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TitleAlignment * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * Defines the semantic level of the title. Using "Auto" no explicit level information is written. Used
      * for accessibility purposes only.
      */
    var titleLevel: js.UndefOr[
        TitleLevel | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TitleLevel * / any */ String) | PropertyBindingInfo
      ] = js.undefined
  }
  object PageSettings {
    
    inline def apply(): PageSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PageSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PageSettings] (val x: Self) extends AnyVal {
      
      inline def setBackgroundDesign(
        value: PageBackgroundDesign | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PageBackgroundDesign * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "backgroundDesign", value.asInstanceOf[js.Any])
      
      inline def setBackgroundDesignUndefined: Self = StObject.set(x, "backgroundDesign", js.undefined)
      
      inline def setContent(
        value: js.Array[typings.openui5.sapUiCoreControlMod.default] | typings.openui5.sapUiCoreControlMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentOnlyBusy(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "contentOnlyBusy", value.asInstanceOf[js.Any])
      
      inline def setContentOnlyBusyUndefined: Self = StObject.set(x, "contentOnlyBusy", js.undefined)
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setContentVarargs(value: typings.openui5.sapUiCoreControlMod.default*): Self = StObject.set(x, "content", js.Array(value*))
      
      inline def setCustomHeader(value: IBar): Self = StObject.set(x, "customHeader", value.asInstanceOf[js.Any])
      
      inline def setCustomHeaderUndefined: Self = StObject.set(x, "customHeader", js.undefined)
      
      inline def setEnableScrolling(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "enableScrolling", value.asInstanceOf[js.Any])
      
      inline def setEnableScrollingUndefined: Self = StObject.set(x, "enableScrolling", js.undefined)
      
      inline def setFloatingFooter(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "floatingFooter", value.asInstanceOf[js.Any])
      
      inline def setFloatingFooterUndefined: Self = StObject.set(x, "floatingFooter", js.undefined)
      
      inline def setFooter(value: IBar): Self = StObject.set(x, "footer", value.asInstanceOf[js.Any])
      
      inline def setFooterUndefined: Self = StObject.set(x, "footer", js.undefined)
      
      inline def setHeaderContent(
        value: js.Array[typings.openui5.sapUiCoreControlMod.default] | typings.openui5.sapUiCoreControlMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "headerContent", value.asInstanceOf[js.Any])
      
      inline def setHeaderContentUndefined: Self = StObject.set(x, "headerContent", js.undefined)
      
      inline def setHeaderContentVarargs(value: typings.openui5.sapUiCoreControlMod.default*): Self = StObject.set(x, "headerContent", js.Array(value*))
      
      inline def setIcon(value: URI | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setLandmarkInfo(value: typings.openui5.sapMPageAccessibleLandmarkInfoMod.default): Self = StObject.set(x, "landmarkInfo", value.asInstanceOf[js.Any])
      
      inline def setLandmarkInfoUndefined: Self = StObject.set(x, "landmarkInfo", js.undefined)
      
      inline def setNavButtonPress(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default[js.Object] => Unit): Self = StObject.set(x, "navButtonPress", js.Any.fromFunction1(value))
      
      inline def setNavButtonPressUndefined: Self = StObject.set(x, "navButtonPress", js.undefined)
      
      inline def setNavButtonTap(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default[js.Object] => Unit): Self = StObject.set(x, "navButtonTap", js.Any.fromFunction1(value))
      
      inline def setNavButtonTapUndefined: Self = StObject.set(x, "navButtonTap", js.undefined)
      
      inline def setNavButtonText(value: String | PropertyBindingInfo): Self = StObject.set(x, "navButtonText", value.asInstanceOf[js.Any])
      
      inline def setNavButtonTextUndefined: Self = StObject.set(x, "navButtonText", js.undefined)
      
      inline def setNavButtonTooltip(value: String | PropertyBindingInfo): Self = StObject.set(x, "navButtonTooltip", value.asInstanceOf[js.Any])
      
      inline def setNavButtonTooltipUndefined: Self = StObject.set(x, "navButtonTooltip", js.undefined)
      
      inline def setNavButtonType(
        value: ButtonType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ButtonType * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "navButtonType", value.asInstanceOf[js.Any])
      
      inline def setNavButtonTypeUndefined: Self = StObject.set(x, "navButtonType", js.undefined)
      
      inline def setShowFooter(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "showFooter", value.asInstanceOf[js.Any])
      
      inline def setShowFooterUndefined: Self = StObject.set(x, "showFooter", js.undefined)
      
      inline def setShowHeader(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "showHeader", value.asInstanceOf[js.Any])
      
      inline def setShowHeaderUndefined: Self = StObject.set(x, "showHeader", js.undefined)
      
      inline def setShowNavButton(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "showNavButton", value.asInstanceOf[js.Any])
      
      inline def setShowNavButtonUndefined: Self = StObject.set(x, "showNavButton", js.undefined)
      
      inline def setShowSubHeader(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "showSubHeader", value.asInstanceOf[js.Any])
      
      inline def setShowSubHeaderUndefined: Self = StObject.set(x, "showSubHeader", js.undefined)
      
      inline def setSubHeader(value: IBar): Self = StObject.set(x, "subHeader", value.asInstanceOf[js.Any])
      
      inline def setSubHeaderUndefined: Self = StObject.set(x, "subHeader", js.undefined)
      
      inline def setTitle(value: String | PropertyBindingInfo): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleAlignment(
        value: TitleAlignment | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TitleAlignment * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "titleAlignment", value.asInstanceOf[js.Any])
      
      inline def setTitleAlignmentUndefined: Self = StObject.set(x, "titleAlignment", js.undefined)
      
      inline def setTitleLevel(
        value: TitleLevel | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TitleLevel * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "titleLevel", value.asInstanceOf[js.Any])
      
      inline def setTitleLevelUndefined: Self = StObject.set(x, "titleLevel", js.undefined)
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
}
