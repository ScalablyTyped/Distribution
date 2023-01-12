package typings.openui5

import typings.openui5.anon.Pinned
import typings.openui5.sap.ClassInfo
import typings.openui5.sapFLibraryMod.IDynamicPageStickyContent
import typings.openui5.sapMLibraryMod.IBar
import typings.openui5.sapMLibraryMod.PageBackgroundDesign
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreControlMod.ControlSettings
import typings.openui5.sapUiCoreLibraryMod.ID
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapFDynamicPageMod {
  
  @JSImport("sap/f/DynamicPage", JSImport.Default)
  @js.native
  /**
    * Constructor for a new `DynamicPage`.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    * See:
    * 	{@link fiori:https://experience.sap.com/fiori-design-web/dynamic-page-layout/ Dynamic Page}
    */
  open class default () extends DynamicPage {
    def this(/**
      * Initial settings for the new control
      */
    mSettings: DynamicPageSettings) = this()
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
    mSettings: DynamicPageSettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new control
      */
    mSettings: DynamicPageSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/f/DynamicPage", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.f.DynamicPage with name `sClassName` and enriches it with the information
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
    oClassInfo: ClassInfo[T, DynamicPage]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, DynamicPage],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.f.DynamicPage.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait DynamicPage
    extends typings.openui5.sapUiCoreControlMod.default {
    
    /**
      * @SINCE 1.93
      *
      * Attaches event handler `fnFunction` to the {@link #event:pinnedStateChange pinnedStateChange} event of
      * this `sap.f.DynamicPage`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.f.DynamicPage` itself.
      *
      * The event is fired when the `headerPinned` property is changed via user interaction.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachPinnedStateChange(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachPinnedStateChange(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.f.DynamicPage` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * @SINCE 1.93
      *
      * Attaches event handler `fnFunction` to the {@link #event:pinnedStateChange pinnedStateChange} event of
      * this `sap.f.DynamicPage`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.f.DynamicPage` itself.
      *
      * The event is fired when the `headerPinned` property is changed via user interaction.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachPinnedStateChange(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachPinnedStateChange(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.f.DynamicPage` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Destroys the content in the aggregation {@link #getContent content}.
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
      * @SINCE 1.61
      *
      * Destroys the landmarkInfo in the aggregation {@link #getLandmarkInfo landmarkInfo}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyLandmarkInfo(): this.type = js.native
    
    /**
      * Destroys the title in the aggregation {@link #getTitle title}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyTitle(): this.type = js.native
    
    /**
      * @SINCE 1.93
      *
      * Detaches event handler `fnFunction` from the {@link #event:pinnedStateChange pinnedStateChange} event
      * of this `sap.f.DynamicPage`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachPinnedStateChange(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachPinnedStateChange(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object on which the given function had to be called
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * @SINCE 1.93
      *
      * Fires event {@link #event:pinnedStateChange pinnedStateChange} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def firePinnedStateChange(): this.type = js.native
    def firePinnedStateChange(/**
      * Parameters to pass along with the event
      */
    mParameters: Pinned): this.type = js.native
    
    /**
      * @SINCE 1.68
      *
      * Gets current value of property {@link #getBackgroundDesign backgroundDesign}.
      *
      * Determines the background color of `DynamicPage`.
      *
      * Default value is `Standard`.
      *
      * @returns Value of property `backgroundDesign`
      */
    def getBackgroundDesign(): PageBackgroundDesign | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PageBackgroundDesign * / any */ String) = js.native
    
    /**
      * Gets content of aggregation {@link #getContent content}.
      *
      * `DynamicPage` content.
      *
      * **Note: ** You can change the default paddings by adding the following CSS classes:
      * 	 - `sapUiContentPadding`
      * 	 - `sapUiNoContentPadding`
      * 	 - `sapUiResponsiveContentPadding`  For more information, see {@link topic:c71f6df62dae47ca8284310a6f5fc80a
      * 			Using Container Content Padding CSS Classes}.
      *
      * **Note:** The SAP Fiori Design guidelines require that the `DynamicPageHeader`'s content and the `DynamicPage`'s
      * content are aligned vertically. When using {@link sap.ui.layout.form.Form}, {@link sap.m.Panel}, {@link
      * sap.m.Table} and {@link sap.m.List} in the content area of `DynamicPage`, if the content is not already
      * aligned, you need to adjust their left text offset to achieve the vertical alignment. To do this, apply
      * the `sapFDynamicPageAlignContent` CSS class to them and set their `width` property to `auto` (if not
      * set by default).
      *
      * Example:
      *
      *
      * ```javascript
      *
      * ` <Panel class=“sapFDynamicPageAlignContent” width=“auto”></Panel> `
      * ```
      *
      *
      * Please keep in mind that the alignment is not possible in the following cases:
      * 	 -  When the controls are placed in an {@link sap.ui.layout.Grid} or other layout controls that use
      * 			`overflow:hidden` CSS property
      * 	 -  In case any of the following CSS classes is applied to `DynamicPage`: `sapUiContentPadding`, `sapUiNoContentPadding`
      * 			or `sapUiResponsiveContentPadding`
      */
    def getContent(): typings.openui5.sapUiCoreControlMod.default = js.native
    
    /**
      * Gets current value of property {@link #getFitContent fitContent}.
      *
      * Forces the content container of the `DynamicPage` to make room for stretchable controls in the `content`
      * aggregation to fill exactly the visible space between the header and the footer.
      *
      * **Notes:**
      * 	 - Enable this property only if the control of the `content` aggregation is configured to automatically
      * 			stretch to fill the available height, which means that the content would appear squashed in height when
      * 			this property is disabled. Such stretchable controls may be {@link sap.ui.table.Table} and {@link sap.ui.table.AnalyticalTable}
      * 			depending on their settings.
      * 	 - It is not recommended to enable this property for controls that do not stretch in height (and appear
      * 			properly when this property is disabled).
      *
      * Default value is `false`.
      *
      * @returns Value of property `fitContent`
      */
    def getFitContent(): Boolean = js.native
    
    /**
      * Gets content of aggregation {@link #getFooter footer}.
      *
      * `DynamicPage` floating footer.
      */
    def getFooter(): IBar = js.native
    
    /**
      * Gets content of aggregation {@link #getHeader header}.
      *
      * `DynamicPage` header.
      */
    def getHeader(): typings.openui5.sapFDynamicPageHeaderMod.default = js.native
    
    /**
      * Gets current value of property {@link #getHeaderExpanded headerExpanded}.
      *
      * Determines whether the header is expanded.
      *
      * The header can be also expanded/collapsed by user interaction, which requires the property to be internally
      * mutated by the control to reflect the changed state.
      *
      * **Note:** As of version 1.48, you can initialize the control in collapsed header state by setting this
      * property to `false`.
      *
      * Default value is `true`.
      *
      * @returns Value of property `headerExpanded`
      */
    def getHeaderExpanded(): Boolean = js.native
    
    /**
      * @SINCE 1.93
      *
      * Gets current value of property {@link #getHeaderPinned headerPinned}.
      *
      * Determines whether the `DynamicPageHeader` is pinned.
      *
      * The property can be changed programmatically or in the occurrence of the following user interactions:
      *
      * 	 - Toggling the pin/unpin button of `DynamicPageHeader`
      * 	 - Snapping the `DynamicPageHeader` by explicitly clicking on the `DynamicPageTitle`
      *
      * **Note: ** The property will only apply if the header is effectively pinnable, i.e. if the following
      * conditions are met:
      * 	 - `DynamicPageHeader` `pinnable` property is `true`
      * 	 - `DynamicPageHeader` is expanded
      * 	 - `DynamicPage` `preserveHeaderStateOnScroll` property is effectively disabled
      *
      * Default value is `false`.
      *
      * @returns Value of property `headerPinned`
      */
    def getHeaderPinned(): Boolean = js.native
    
    /**
      * @SINCE 1.61
      *
      * Gets content of aggregation {@link #getLandmarkInfo landmarkInfo}.
      *
      * Accessible landmark settings to be applied on the containers of the `sap.f.DynamicPage` control.
      *
      * If not set, no landmarks will be written.
      */
    def getLandmarkInfo(): typings.openui5.sapFDynamicPageAccessibleLandmarkInfoMod.default = js.native
    
    /**
      * Gets current value of property {@link #getPreserveHeaderStateOnScroll preserveHeaderStateOnScroll}.
      *
      * Preserves the current header state when scrolling. For example, if the user expands the header by clicking
      * on the title and then scrolls down the page, the header will remain expanded.
      *
      * **Note:** Based on internal rules, the value of the property is not always taken into account - for example,
      * when the control`s title and header are with height larger than the given threshold.
      *
      * Default value is `false`.
      *
      * @returns Value of property `preserveHeaderStateOnScroll`
      */
    def getPreserveHeaderStateOnScroll(): Boolean = js.native
    
    /**
      * Returns the `sap.ui.core.ScrollEnablement` delegate which is used with this control.
      *
      * @returns The scroll delegate instance
      */
    def getScrollDelegate(): typings.openui5.sapUiCoreDelegateScrollEnablementMod.default = js.native
    
    /**
      * Gets current value of property {@link #getShowFooter showFooter}.
      *
      * Determines whether the footer is visible.
      *
      * Default value is `false`.
      *
      * @returns Value of property `showFooter`
      */
    def getShowFooter(): Boolean = js.native
    
    /**
      * @SINCE 1.65
      *
      * ID of the element which is the current target of the association {@link #getStickySubheaderProvider stickySubheaderProvider},
      * or `null`.
      */
    def getStickySubheaderProvider(): ID = js.native
    
    /**
      * Gets content of aggregation {@link #getTitle title}.
      *
      * `DynamicPage` title.
      */
    def getTitle(): typings.openui5.sapFDynamicPageTitleMod.default = js.native
    
    /**
      * Gets current value of property {@link #getToggleHeaderOnTitleClick toggleHeaderOnTitleClick}.
      *
      * Determines whether the user can switch between the expanded/collapsed states of the `DynamicPageHeader`
      * by clicking on the `DynamicPageTitle` or by using the expand/collapse visual indicators, positioned at
      * the bottom of the `DynamicPageTitle` and the `DynamicPageHeader`. If set to `false`, the `DynamicPageTitle`
      * is not clickable, the visual indicators are not available and the application must provide other means
      * for expanding/collapsing the `DynamicPageHeader`, if necessary.
      *
      * **Note: ** This property is taken into account only if a non-empty `header` aggregation is provided.
      *
      * Default value is `true`.
      *
      * @returns Value of property `toggleHeaderOnTitleClick`
      */
    def getToggleHeaderOnTitleClick(): Boolean = js.native
    
    /**
      * @SINCE 1.68
      *
      * Sets a new value for property {@link #getBackgroundDesign backgroundDesign}.
      *
      * Determines the background color of `DynamicPage`.
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
      * Sets the aggregated {@link #getContent content}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setContent(/**
      * The content to set
      */
    oContent: typings.openui5.sapUiCoreControlMod.default): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getFitContent fitContent}.
      *
      * Forces the content container of the `DynamicPage` to make room for stretchable controls in the `content`
      * aggregation to fill exactly the visible space between the header and the footer.
      *
      * **Notes:**
      * 	 - Enable this property only if the control of the `content` aggregation is configured to automatically
      * 			stretch to fill the available height, which means that the content would appear squashed in height when
      * 			this property is disabled. Such stretchable controls may be {@link sap.ui.table.Table} and {@link sap.ui.table.AnalyticalTable}
      * 			depending on their settings.
      * 	 - It is not recommended to enable this property for controls that do not stretch in height (and appear
      * 			properly when this property is disabled).
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setFitContent(): this.type = js.native
    def setFitContent(/**
      * New value for property `fitContent`
      */
    bFitContent: Boolean): this.type = js.native
    
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
    oHeader: typings.openui5.sapFDynamicPageHeaderMod.default): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getHeaderExpanded headerExpanded}.
      *
      * Determines whether the header is expanded.
      *
      * The header can be also expanded/collapsed by user interaction, which requires the property to be internally
      * mutated by the control to reflect the changed state.
      *
      * **Note:** As of version 1.48, you can initialize the control in collapsed header state by setting this
      * property to `false`.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setHeaderExpanded(): this.type = js.native
    def setHeaderExpanded(/**
      * New value for property `headerExpanded`
      */
    bHeaderExpanded: Boolean): this.type = js.native
    
    /**
      * @SINCE 1.93
      *
      * Sets a new value for property {@link #getHeaderPinned headerPinned}.
      *
      * Determines whether the `DynamicPageHeader` is pinned.
      *
      * The property can be changed programmatically or in the occurrence of the following user interactions:
      *
      * 	 - Toggling the pin/unpin button of `DynamicPageHeader`
      * 	 - Snapping the `DynamicPageHeader` by explicitly clicking on the `DynamicPageTitle`
      *
      * **Note: ** The property will only apply if the header is effectively pinnable, i.e. if the following
      * conditions are met:
      * 	 - `DynamicPageHeader` `pinnable` property is `true`
      * 	 - `DynamicPageHeader` is expanded
      * 	 - `DynamicPage` `preserveHeaderStateOnScroll` property is effectively disabled
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setHeaderPinned(): this.type = js.native
    def setHeaderPinned(/**
      * New value for property `headerPinned`
      */
    bHeaderPinned: Boolean): this.type = js.native
    
    /**
      * @SINCE 1.61
      *
      * Sets the aggregated {@link #getLandmarkInfo landmarkInfo}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setLandmarkInfo(
      /**
      * The landmarkInfo to set
      */
    oLandmarkInfo: typings.openui5.sapFDynamicPageAccessibleLandmarkInfoMod.default
    ): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getPreserveHeaderStateOnScroll preserveHeaderStateOnScroll}.
      *
      * Preserves the current header state when scrolling. For example, if the user expands the header by clicking
      * on the title and then scrolls down the page, the header will remain expanded.
      *
      * **Note:** Based on internal rules, the value of the property is not always taken into account - for example,
      * when the control`s title and header are with height larger than the given threshold.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setPreserveHeaderStateOnScroll(): this.type = js.native
    def setPreserveHeaderStateOnScroll(
      /**
      * New value for property `preserveHeaderStateOnScroll`
      */
    bPreserveHeaderStateOnScroll: Boolean
    ): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getShowFooter showFooter}.
      *
      * Determines whether the footer is visible.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setShowFooter(): this.type = js.native
    def setShowFooter(/**
      * New value for property `showFooter`
      */
    bShowFooter: Boolean): this.type = js.native
    
    def setStickySubheaderProvider(
      /**
      * ID of an element which becomes the new target of this stickySubheaderProvider association; alternatively,
      * an element instance may be given
      */
    oStickySubheaderProvider: IDynamicPageStickyContent
    ): this.type = js.native
    /**
      * @SINCE 1.65
      *
      * Sets the associated {@link #getStickySubheaderProvider stickySubheaderProvider}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setStickySubheaderProvider(
      /**
      * ID of an element which becomes the new target of this stickySubheaderProvider association; alternatively,
      * an element instance may be given
      */
    oStickySubheaderProvider: ID
    ): this.type = js.native
    
    /**
      * Sets the aggregated {@link #getTitle title}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setTitle(/**
      * The title to set
      */
    oTitle: typings.openui5.sapFDynamicPageTitleMod.default): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getToggleHeaderOnTitleClick toggleHeaderOnTitleClick}.
      *
      * Determines whether the user can switch between the expanded/collapsed states of the `DynamicPageHeader`
      * by clicking on the `DynamicPageTitle` or by using the expand/collapse visual indicators, positioned at
      * the bottom of the `DynamicPageTitle` and the `DynamicPageHeader`. If set to `false`, the `DynamicPageTitle`
      * is not clickable, the visual indicators are not available and the application must provide other means
      * for expanding/collapsing the `DynamicPageHeader`, if necessary.
      *
      * **Note: ** This property is taken into account only if a non-empty `header` aggregation is provided.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setToggleHeaderOnTitleClick(): this.type = js.native
    def setToggleHeaderOnTitleClick(/**
      * New value for property `toggleHeaderOnTitleClick`
      */
    bToggleHeaderOnTitleClick: Boolean): this.type = js.native
  }
  
  trait DynamicPageSettings
    extends StObject
       with ControlSettings {
    
    /**
      * @SINCE 1.68
      *
      * Determines the background color of `DynamicPage`.
      */
    var backgroundDesign: js.UndefOr[
        PageBackgroundDesign | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PageBackgroundDesign * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * `DynamicPage` content.
      *
      * **Note: ** You can change the default paddings by adding the following CSS classes:
      * 	 - `sapUiContentPadding`
      * 	 - `sapUiNoContentPadding`
      * 	 - `sapUiResponsiveContentPadding`  For more information, see {@link topic:c71f6df62dae47ca8284310a6f5fc80a
      * 			Using Container Content Padding CSS Classes}.
      *
      * **Note:** The SAP Fiori Design guidelines require that the `DynamicPageHeader`'s content and the `DynamicPage`'s
      * content are aligned vertically. When using {@link sap.ui.layout.form.Form}, {@link sap.m.Panel}, {@link
      * sap.m.Table} and {@link sap.m.List} in the content area of `DynamicPage`, if the content is not already
      * aligned, you need to adjust their left text offset to achieve the vertical alignment. To do this, apply
      * the `sapFDynamicPageAlignContent` CSS class to them and set their `width` property to `auto` (if not
      * set by default).
      *
      * Example:
      *
      *
      * ```javascript
      *
      * ` <Panel class=“sapFDynamicPageAlignContent” width=“auto”></Panel> `
      * ```
      *
      *
      * Please keep in mind that the alignment is not possible in the following cases:
      * 	 -  When the controls are placed in an {@link sap.ui.layout.Grid} or other layout controls that use
      * 			`overflow:hidden` CSS property
      * 	 -  In case any of the following CSS classes is applied to `DynamicPage`: `sapUiContentPadding`, `sapUiNoContentPadding`
      * 			or `sapUiResponsiveContentPadding`
      */
    var content: js.UndefOr[typings.openui5.sapUiCoreControlMod.default] = js.undefined
    
    /**
      * Forces the content container of the `DynamicPage` to make room for stretchable controls in the `content`
      * aggregation to fill exactly the visible space between the header and the footer.
      *
      * **Notes:**
      * 	 - Enable this property only if the control of the `content` aggregation is configured to automatically
      * 			stretch to fill the available height, which means that the content would appear squashed in height when
      * 			this property is disabled. Such stretchable controls may be {@link sap.ui.table.Table} and {@link sap.ui.table.AnalyticalTable}
      * 			depending on their settings.
      * 	 - It is not recommended to enable this property for controls that do not stretch in height (and appear
      * 			properly when this property is disabled).
      */
    var fitContent: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * `DynamicPage` floating footer.
      */
    var footer: js.UndefOr[IBar] = js.undefined
    
    /**
      * `DynamicPage` header.
      */
    var header: js.UndefOr[typings.openui5.sapFDynamicPageHeaderMod.default] = js.undefined
    
    /**
      * Determines whether the header is expanded.
      *
      * The header can be also expanded/collapsed by user interaction, which requires the property to be internally
      * mutated by the control to reflect the changed state.
      *
      * **Note:** As of version 1.48, you can initialize the control in collapsed header state by setting this
      * property to `false`.
      */
    var headerExpanded: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @SINCE 1.93
      *
      * Determines whether the `DynamicPageHeader` is pinned.
      *
      * The property can be changed programmatically or in the occurrence of the following user interactions:
      *
      * 	 - Toggling the pin/unpin button of `DynamicPageHeader`
      * 	 - Snapping the `DynamicPageHeader` by explicitly clicking on the `DynamicPageTitle`
      *
      * **Note: ** The property will only apply if the header is effectively pinnable, i.e. if the following
      * conditions are met:
      * 	 - `DynamicPageHeader` `pinnable` property is `true`
      * 	 - `DynamicPageHeader` is expanded
      * 	 - `DynamicPage` `preserveHeaderStateOnScroll` property is effectively disabled
      */
    var headerPinned: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @SINCE 1.61
      *
      * Accessible landmark settings to be applied on the containers of the `sap.f.DynamicPage` control.
      *
      * If not set, no landmarks will be written.
      */
    var landmarkInfo: js.UndefOr[typings.openui5.sapFDynamicPageAccessibleLandmarkInfoMod.default] = js.undefined
    
    /**
      * @SINCE 1.93
      *
      * The event is fired when the `headerPinned` property is changed via user interaction.
      */
    var pinnedStateChange: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * Preserves the current header state when scrolling. For example, if the user expands the header by clicking
      * on the title and then scrolls down the page, the header will remain expanded.
      *
      * **Note:** Based on internal rules, the value of the property is not always taken into account - for example,
      * when the control`s title and header are with height larger than the given threshold.
      */
    var preserveHeaderStateOnScroll: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Determines whether the footer is visible.
      */
    var showFooter: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @SINCE 1.65
      *
      * Association of Controls / IDs, that provide sticky subheader content. All controls that provide this
      * content have to implement the `sap.f.IDynamicPageStickyContent` interface.
      */
    var stickySubheaderProvider: js.UndefOr[IDynamicPageStickyContent | String] = js.undefined
    
    /**
      * `DynamicPage` title.
      */
    var title: js.UndefOr[typings.openui5.sapFDynamicPageTitleMod.default] = js.undefined
    
    /**
      * Determines whether the user can switch between the expanded/collapsed states of the `DynamicPageHeader`
      * by clicking on the `DynamicPageTitle` or by using the expand/collapse visual indicators, positioned at
      * the bottom of the `DynamicPageTitle` and the `DynamicPageHeader`. If set to `false`, the `DynamicPageTitle`
      * is not clickable, the visual indicators are not available and the application must provide other means
      * for expanding/collapsing the `DynamicPageHeader`, if necessary.
      *
      * **Note: ** This property is taken into account only if a non-empty `header` aggregation is provided.
      */
    var toggleHeaderOnTitleClick: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
  }
  object DynamicPageSettings {
    
    inline def apply(): DynamicPageSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DynamicPageSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DynamicPageSettings] (val x: Self) extends AnyVal {
      
      inline def setBackgroundDesign(
        value: PageBackgroundDesign | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PageBackgroundDesign * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "backgroundDesign", value.asInstanceOf[js.Any])
      
      inline def setBackgroundDesignUndefined: Self = StObject.set(x, "backgroundDesign", js.undefined)
      
      inline def setContent(value: typings.openui5.sapUiCoreControlMod.default): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setFitContent(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "fitContent", value.asInstanceOf[js.Any])
      
      inline def setFitContentUndefined: Self = StObject.set(x, "fitContent", js.undefined)
      
      inline def setFooter(value: IBar): Self = StObject.set(x, "footer", value.asInstanceOf[js.Any])
      
      inline def setFooterUndefined: Self = StObject.set(x, "footer", js.undefined)
      
      inline def setHeader(value: typings.openui5.sapFDynamicPageHeaderMod.default): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      inline def setHeaderExpanded(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "headerExpanded", value.asInstanceOf[js.Any])
      
      inline def setHeaderExpandedUndefined: Self = StObject.set(x, "headerExpanded", js.undefined)
      
      inline def setHeaderPinned(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "headerPinned", value.asInstanceOf[js.Any])
      
      inline def setHeaderPinnedUndefined: Self = StObject.set(x, "headerPinned", js.undefined)
      
      inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
      
      inline def setLandmarkInfo(value: typings.openui5.sapFDynamicPageAccessibleLandmarkInfoMod.default): Self = StObject.set(x, "landmarkInfo", value.asInstanceOf[js.Any])
      
      inline def setLandmarkInfoUndefined: Self = StObject.set(x, "landmarkInfo", js.undefined)
      
      inline def setPinnedStateChange(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "pinnedStateChange", js.Any.fromFunction1(value))
      
      inline def setPinnedStateChangeUndefined: Self = StObject.set(x, "pinnedStateChange", js.undefined)
      
      inline def setPreserveHeaderStateOnScroll(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "preserveHeaderStateOnScroll", value.asInstanceOf[js.Any])
      
      inline def setPreserveHeaderStateOnScrollUndefined: Self = StObject.set(x, "preserveHeaderStateOnScroll", js.undefined)
      
      inline def setShowFooter(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "showFooter", value.asInstanceOf[js.Any])
      
      inline def setShowFooterUndefined: Self = StObject.set(x, "showFooter", js.undefined)
      
      inline def setStickySubheaderProvider(value: IDynamicPageStickyContent | String): Self = StObject.set(x, "stickySubheaderProvider", value.asInstanceOf[js.Any])
      
      inline def setStickySubheaderProviderUndefined: Self = StObject.set(x, "stickySubheaderProvider", js.undefined)
      
      inline def setTitle(value: typings.openui5.sapFDynamicPageTitleMod.default): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setToggleHeaderOnTitleClick(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "toggleHeaderOnTitleClick", value.asInstanceOf[js.Any])
      
      inline def setToggleHeaderOnTitleClickUndefined: Self = StObject.set(x, "toggleHeaderOnTitleClick", js.undefined)
    }
  }
}
