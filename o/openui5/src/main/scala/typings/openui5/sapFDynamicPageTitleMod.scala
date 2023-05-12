package typings.openui5

import typings.openui5.anon.IsExpanded
import typings.openui5.sap.ClassInfo
import typings.openui5.sapFLibraryMod.DynamicPageTitleArea
import typings.openui5.sapFLibraryMod.DynamicPageTitleShrinkRatio
import typings.openui5.sapMLibraryMod.BackgroundDesign
import typings.openui5.sapMLibraryMod.IBreadcrumbs
import typings.openui5.sapUiBaseManagedObjectMod.AggregationBindingInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreControlMod.ControlSettings
import typings.openui5.sapUiCoreLibraryMod.ID
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapFDynamicPageTitleMod {
  
  @JSImport("sap/f/DynamicPageTitle", JSImport.Default)
  @js.native
  /**
    * Constructor for a new `DynamicPageTitle`.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends DynamicPageTitle {
    def this(/**
      * Initial settings for the new control
      */
    mSettings: DynamicPageTitleSettings) = this()
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
    mSettings: DynamicPageTitleSettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new control
      */
    mSettings: DynamicPageTitleSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/f/DynamicPageTitle", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.f.DynamicPageTitle with name `sClassName` and enriches it with the
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
    oClassInfo: ClassInfo[T, DynamicPageTitle]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, DynamicPageTitle],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.f.DynamicPageTitle.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait DynamicPageTitle
    extends typings.openui5.sapUiCoreControlMod.default {
    
    /**
      * Adds some action to the aggregation {@link #getActions actions}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addAction(
      /**
      * The action to add; if empty, nothing is inserted
      */
    oAction: typings.openui5.sapUiCoreControlMod.default
    ): this.type = js.native
    
    def addAriaDescribedBy(
      /**
      * The ariaDescribedBy to add; if empty, nothing is inserted
      */
    vAriaDescribedBy: typings.openui5.sapUiCoreControlMod.default
    ): this.type = js.native
    /**
      * @SINCE 1.78
      *
      * Adds some ariaDescribedBy into the association {@link #getAriaDescribedBy ariaDescribedBy}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addAriaDescribedBy(/**
      * The ariaDescribedBy to add; if empty, nothing is inserted
      */
    vAriaDescribedBy: ID): this.type = js.native
    
    /**
      * @SINCE 1.50
      *
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
      * Adds some expandedContent to the aggregation {@link #getExpandedContent expandedContent}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addExpandedContent(
      /**
      * The expandedContent to add; if empty, nothing is inserted
      */
    oExpandedContent: typings.openui5.sapUiCoreControlMod.default
    ): this.type = js.native
    
    /**
      * @SINCE 1.52
      *
      * Adds some navigationAction to the aggregation {@link #getNavigationActions navigationActions}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addNavigationAction(
      /**
      * The navigationAction to add; if empty, nothing is inserted
      */
    oNavigationAction: typings.openui5.sapMButtonMod.default
    ): this.type = js.native
    
    /**
      * Adds some snappedContent to the aggregation {@link #getSnappedContent snappedContent}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addSnappedContent(
      /**
      * The snappedContent to add; if empty, nothing is inserted
      */
    oSnappedContent: typings.openui5.sapUiCoreControlMod.default
    ): this.type = js.native
    
    /**
      * @SINCE 1.54
      *
      * Attaches event handler `fnFunction` to the {@link #event:stateChange stateChange} event of this `sap.f.DynamicPageTitle`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.f.DynamicPageTitle` itself.
      *
      * Fired when the title state (expanded/collapsed) is toggled by user interaction. For example, scrolling,
      * title clicking/tapping, using expand/collapse button.
      *
      * Also fired when the developer toggles the title state by programmatically changing the scroll position
      * of the scrollbar of `DynamicPage`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachStateChange(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachStateChange(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.f.DynamicPageTitle` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * @SINCE 1.54
      *
      * Attaches event handler `fnFunction` to the {@link #event:stateChange stateChange} event of this `sap.f.DynamicPageTitle`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.f.DynamicPageTitle` itself.
      *
      * Fired when the title state (expanded/collapsed) is toggled by user interaction. For example, scrolling,
      * title clicking/tapping, using expand/collapse button.
      *
      * Also fired when the developer toggles the title state by programmatically changing the scroll position
      * of the scrollbar of `DynamicPage`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachStateChange(
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
    def attachStateChange(
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
      * Context object to call the event handler with. Defaults to this `sap.f.DynamicPageTitle` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Destroys all the actions in the aggregation {@link #getActions actions}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyActions(): this.type = js.native
    
    /**
      * @SINCE 1.52
      *
      * Destroys the breadcrumbs in the aggregation {@link #getBreadcrumbs breadcrumbs}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyBreadcrumbs(): this.type = js.native
    
    /**
      * @SINCE 1.50
      *
      * Destroys all the content in the aggregation {@link #getContent content}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyContent(): this.type = js.native
    
    /**
      * Destroys all the expandedContent in the aggregation {@link #getExpandedContent expandedContent}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyExpandedContent(): this.type = js.native
    
    /**
      * @SINCE 1.52
      *
      * Destroys the expandedHeading in the aggregation {@link #getExpandedHeading expandedHeading}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyExpandedHeading(): this.type = js.native
    
    /**
      * Destroys the heading in the aggregation {@link #getHeading heading}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyHeading(): this.type = js.native
    
    /**
      * @SINCE 1.52
      *
      * Destroys all the navigationActions in the aggregation {@link #getNavigationActions navigationActions}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyNavigationActions(): this.type = js.native
    
    /**
      * Destroys all the snappedContent in the aggregation {@link #getSnappedContent snappedContent}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroySnappedContent(): this.type = js.native
    
    /**
      * @SINCE 1.52
      *
      * Destroys the snappedHeading in the aggregation {@link #getSnappedHeading snappedHeading}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroySnappedHeading(): this.type = js.native
    
    /**
      * @SINCE 1.63
      *
      * Destroys the snappedTitleOnMobile in the aggregation {@link #getSnappedTitleOnMobile snappedTitleOnMobile}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroySnappedTitleOnMobile(): this.type = js.native
    
    /**
      * @SINCE 1.54
      *
      * Detaches event handler `fnFunction` from the {@link #event:stateChange stateChange} event of this `sap.f.DynamicPageTitle`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachStateChange(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachStateChange(
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
      * @SINCE 1.54
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
      * Fires event {@link #event:stateChange stateChange} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireStateChange(): this.type = js.native
    def fireStateChange(/**
      * Parameters to pass along with the event
      */
    mParameters: IsExpanded): this.type = js.native
    
    /**
      * Gets content of aggregation {@link #getActions actions}.
      *
      * The `DynamicPageTitle` actions.
      * **Note:** The `actions` aggregation accepts any UI5 control, but it`s recommended to use controls, suitable
      * for {@link sap.m.Toolbar} and {@link sap.m.OverflowToolbar}.
      *
      * **Note:** If the `snappedTitleOnMobile` aggregation is set, its content overrides this aggregation when
      * the control is viewed on a phone mobile device and the `DynamicPageHeader` is in its collapsed (snapped)
      * state.
      */
    def getActions(): js.Array[typings.openui5.sapUiCoreControlMod.default] = js.native
    
    /**
      * @SINCE 1.54
      *
      * Gets current value of property {@link #getAreaShrinkRatio areaShrinkRatio}.
      *
      * Assigns shrinking ratio to the `DynamicPageTitle` areas (Heading, Content, Actions). The greater value
      * a section has the faster it shrinks when the screen size is being reduced.
      *
      * The value must be set in `Heading:Content:Actions` format where Title, Content and Actions are numbers
      * greater than or equal to 0. If set to 0, the respective area will not shrink.
      *
      * For example, if `2:7:1` is set, the Content area will shrink seven times faster than the Actions area.
      * So, when all three areas have width of 500px and the available space is reduced by 100px the Title area
      * will reduced by 20px, the Content area - by 70px and the Actions area - by 10px.
      *
      * If all the areas have assigned values greater than 1, the numbers are scaled so that at least one of
      * them is equal to 1. For example, value of `2:4:8` is equal to `1:2:4`.
      *
      *  When this property is set the `primaryArea` property has no effect.
      *
      * Default value is `"1:1.6:1.6"`.
      *
      * @returns Value of property `areaShrinkRatio`
      */
    def getAreaShrinkRatio(): DynamicPageTitleShrinkRatio = js.native
    
    /**
      * @SINCE 1.78
      *
      * Returns array of IDs of the elements which are the current targets of the association {@link #getAriaDescribedBy
      * ariaDescribedBy}.
      */
    def getAriaDescribedBy(): js.Array[ID] = js.native
    
    /**
      * @SINCE 1.58
      *
      * Gets current value of property {@link #getBackgroundDesign backgroundDesign}.
      *
      * Determines the background color of the `DynamicPageTitle`.
      *
      * **Note:** The default value of `backgroundDesign` property is null. If the property is not set, the color
      * of the background is `@sapUiObjectHeaderBackground`, which depends on the specific theme.
      *
      * @returns Value of property `backgroundDesign`
      */
    def getBackgroundDesign(): BackgroundDesign | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof BackgroundDesign * / any */ String) = js.native
    
    /**
      * @SINCE 1.52
      *
      * Gets content of aggregation {@link #getBreadcrumbs breadcrumbs}.
      *
      * The breadcrumbs displayed in the `DynamicPageTitle` top-left area.
      */
    def getBreadcrumbs(): IBreadcrumbs = js.native
    
    /**
      * @SINCE 1.50
      *
      * Gets content of aggregation {@link #getContent content}.
      *
      * The content is positioned in the `DynamicPageTitle` middle area and displayed in both expanded and collapsed
      * (snapped) states.
      *
      * **Note:** If the `snappedTitleOnMobile` aggregation is set, its content overrides this aggregation when
      * the control is viewed on a phone mobile device and the `DynamicPageHeader` is in its collapsed (snapped)
      * state.
      */
    def getContent(): js.Array[typings.openui5.sapUiCoreControlMod.default] = js.native
    
    /**
      * Gets content of aggregation {@link #getExpandedContent expandedContent}.
      *
      * The content that is displayed in the `DynamicPageTitle` in expanded state.
      */
    def getExpandedContent(): js.Array[typings.openui5.sapUiCoreControlMod.default] = js.native
    
    /**
      * @SINCE 1.52
      *
      * Gets content of aggregation {@link #getExpandedHeading expandedHeading}.
      *
      * The `expandedHeading` is positioned in the `DynamicPageTitle` left area and is displayed when the header
      * is in expanded state only. Use this aggregation to display a title (or any other UI5 control that serves
      * as a heading) that has to be present in expanded state only.
      *
      * **Note:** In order for `expandedHeading` to be taken into account, `heading` has to be empty. Combine
      * `expandedHeading` with `snappedHeading` to switch content when the header switches state.
      */
    def getExpandedHeading(): typings.openui5.sapUiCoreControlMod.default = js.native
    
    /**
      * Gets content of aggregation {@link #getHeading heading}.
      *
      * The `heading` is positioned in the `DynamicPageTitle` left area and is displayed in both expanded and
      * collapsed (snapped) states of the header. Use this aggregation to display a title (or any other UI5 control
      * that serves as a heading) that has to be present in both expanded and collapsed states of the header.
      *
      * **Notes:**
      * 	 - `heading` is mutually exclusive with `snappedHeading` and `expandedHeading`. If `heading` is provided,
      * 			both `snappedHeading` and `expandedHeading` are ignored. `heading` is useful when the content of `snappedHeading`
      * 			and `expandedHeading` needs to be the same as it replaces them both.
      * 	 - If the `snappedTitleOnMobile` aggregation is set, its content overrides this aggregation when the
      * 			control is viewed on a phone mobile device and the `DynamicPageHeader` is in its collapsed (snapped)
      * 			state.
      */
    def getHeading(): typings.openui5.sapUiCoreControlMod.default = js.native
    
    /**
      * @SINCE 1.52
      *
      * Gets content of aggregation {@link #getNavigationActions navigationActions}.
      *
      * The `DynamicPageTitle` navigation actions.
      *
      * **Notes:**
      * 	 - The `navigationActions` position depends on the control size. If the control size is 1280px or bigger,
      * 			they are rendered right next to the `actions`. Otherwise, they are rendered in the top-right area, above
      * 			the `actions`. If a large number of elements(buttons) are used, there could be visual degradations as
      * 			the space for the `navigationActions` is limited.
      * 	 - If the `snappedTitleOnMobile` aggregation is set, its content overrides this aggregation when the
      * 			control is viewed on a phone mobile device and the `DynamicPageHeader` is in its collapsed (snapped)
      * 			state.
      */
    def getNavigationActions(): js.Array[typings.openui5.sapMButtonMod.default] = js.native
    
    /**
      * @SINCE 1.50
      * @deprecated (since 1.54) - Please use the `areaShrinkRatio` property instead. The value of `areaShrinkRatio`
      * must be set in `Heading:Content:Actions` format where Heading, Content and Actions are numbers greater
      * than or equal to 0. The greater value a section has the faster it shrinks when the screen size is being
      * reduced.
      *
      * `primaryArea=Begin` can be achieved by setting a low number for the Heading area to `areaShrinkRatio`,
      * for example `1:1.6:1.6`.
      *
      * `primaryArea=Middle` can be achieved by setting a low number for the Content area to `areaShrinkRatio`,
      * for example `1.6:1:1.6`.
      *
      * Gets current value of property {@link #getPrimaryArea primaryArea}.
      *
      * Determines which of the `DynamicPageTitle` areas (Begin, Middle) is primary.
      *
      * **Note:** The primary area is shrinking at lower rate, remaining visible as much as it can.
      *
      * Default value is `Begin`.
      *
      * @returns Value of property `primaryArea`
      */
    def getPrimaryArea(): DynamicPageTitleArea | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof DynamicPageTitleArea * / any */ String) = js.native
    
    /**
      * Gets content of aggregation {@link #getSnappedContent snappedContent}.
      *
      * The content that is displayed in the `DynamicPageTitle` in collapsed (snapped) state.
      *
      * **Note:** If the `snappedTitleOnMobile` aggregation is set, its content overrides this aggregation when
      * the control is viewed on a phone mobile device and the `DynamicPageHeader` is in its collapsed (snapped)
      * state.
      */
    def getSnappedContent(): js.Array[typings.openui5.sapUiCoreControlMod.default] = js.native
    
    /**
      * @SINCE 1.52
      *
      * Gets content of aggregation {@link #getSnappedHeading snappedHeading}.
      *
      * The `snappedHeading` is positioned in the `DynamicPageTitle` left area and is displayed when the header
      * is in collapsed (snapped) state only. Use this aggregation to display a title (or any other UI5 control
      * that serves as a heading) that has to be present in collapsed state only.
      *
      * **Notes:**
      * 	 - In order for `snappedHeading` to be taken into account, `heading` has to be empty. Combine `snappedHeading`
      * 			with `expandedHeading` to switch content when the header switches state.
      * 	 - If the `snappedTitleOnMobile` aggregation is set, its content overrides this aggregation when the
      * 			control is viewed on a phone mobile device and the `DynamicPageHeader` is in its collapsed (snapped)
      * 			state.
      */
    def getSnappedHeading(): typings.openui5.sapUiCoreControlMod.default = js.native
    
    /**
      * @SINCE 1.63
      *
      * Gets content of aggregation {@link #getSnappedTitleOnMobile snappedTitleOnMobile}.
      *
      * The only content that is displayed in the `DynamicPageTitle` when it is viewed on a phone mobile device
      * and the `DynamicPageHeader` is in collapsed (snapped) state.
      *
      * Using this aggregation enables you to provide a simple, single-line title that takes less space on the
      * smaller phone screens when the `DynamicPageHeader` is in its collapsed (snapped) state.
      *
      * **Note:** The content set in this aggregation overrides all the other `DynamicPageTitle` aggregations
      * and is only visible on phone mobile devices in collapsed (snapped) state of the `DynamicPageHeader`.
      */
    def getSnappedTitleOnMobile(): typings.openui5.sapMTitleMod.default = js.native
    
    /**
      * Checks for the provided `sap.ui.core.Control` in the aggregation {@link #getActions actions}. and returns
      * its index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfAction(
      /**
      * The action whose index is looked for
      */
    oAction: typings.openui5.sapUiCoreControlMod.default
    ): int = js.native
    
    /**
      * @SINCE 1.50
      *
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
      * Checks for the provided `sap.ui.core.Control` in the aggregation {@link #getExpandedContent expandedContent}.
      * and returns its index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfExpandedContent(
      /**
      * The expandedContent whose index is looked for
      */
    oExpandedContent: typings.openui5.sapUiCoreControlMod.default
    ): int = js.native
    
    /**
      * @SINCE 1.52
      *
      * Checks for the provided `sap.m.Button` in the aggregation {@link #getNavigationActions navigationActions}.
      * and returns its index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfNavigationAction(
      /**
      * The navigationAction whose index is looked for
      */
    oNavigationAction: typings.openui5.sapMButtonMod.default
    ): int = js.native
    
    /**
      * Checks for the provided `sap.ui.core.Control` in the aggregation {@link #getSnappedContent snappedContent}.
      * and returns its index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfSnappedContent(
      /**
      * The snappedContent whose index is looked for
      */
    oSnappedContent: typings.openui5.sapUiCoreControlMod.default
    ): int = js.native
    
    /**
      * Inserts a action into the aggregation {@link #getActions actions}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def insertAction(
      /**
      * The action to insert; if empty, nothing is inserted
      */
    oAction: typings.openui5.sapUiCoreControlMod.default,
      /**
      * The `0`-based index the action should be inserted at; for a negative value of `iIndex`, the action is
      * inserted at position 0; for a value greater than the current size of the aggregation, the action is inserted
      * at the last position
      */
    iIndex: int
    ): this.type = js.native
    
    /**
      * @SINCE 1.50
      *
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
      * Inserts a expandedContent into the aggregation {@link #getExpandedContent expandedContent}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def insertExpandedContent(
      /**
      * The expandedContent to insert; if empty, nothing is inserted
      */
    oExpandedContent: typings.openui5.sapUiCoreControlMod.default,
      /**
      * The `0`-based index the expandedContent should be inserted at; for a negative value of `iIndex`, the
      * expandedContent is inserted at position 0; for a value greater than the current size of the aggregation,
      * the expandedContent is inserted at the last position
      */
    iIndex: int
    ): this.type = js.native
    
    /**
      * @SINCE 1.52
      *
      * Inserts a navigationAction into the aggregation {@link #getNavigationActions navigationActions}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def insertNavigationAction(
      /**
      * The navigationAction to insert; if empty, nothing is inserted
      */
    oNavigationAction: typings.openui5.sapMButtonMod.default,
      /**
      * The `0`-based index the navigationAction should be inserted at; for a negative value of `iIndex`, the
      * navigationAction is inserted at position 0; for a value greater than the current size of the aggregation,
      * the navigationAction is inserted at the last position
      */
    iIndex: int
    ): this.type = js.native
    
    /**
      * Inserts a snappedContent into the aggregation {@link #getSnappedContent snappedContent}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def insertSnappedContent(
      /**
      * The snappedContent to insert; if empty, nothing is inserted
      */
    oSnappedContent: typings.openui5.sapUiCoreControlMod.default,
      /**
      * The `0`-based index the snappedContent should be inserted at; for a negative value of `iIndex`, the snappedContent
      * is inserted at position 0; for a value greater than the current size of the aggregation, the snappedContent
      * is inserted at the last position
      */
    iIndex: int
    ): this.type = js.native
    
    def removeAction(/**
      * The action to remove or its index or id
      */
    vAction: String): typings.openui5.sapUiCoreControlMod.default | Null = js.native
    /**
      * Removes a action from the aggregation {@link #getActions actions}.
      *
      * @returns The removed action or `null`
      */
    def removeAction(/**
      * The action to remove or its index or id
      */
    vAction: int): typings.openui5.sapUiCoreControlMod.default | Null = js.native
    def removeAction(
      /**
      * The action to remove or its index or id
      */
    vAction: typings.openui5.sapUiCoreControlMod.default
    ): typings.openui5.sapUiCoreControlMod.default | Null = js.native
    
    /**
      * Removes all the controls from the aggregation {@link #getActions actions}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllActions(): js.Array[typings.openui5.sapUiCoreControlMod.default] = js.native
    
    /**
      * @SINCE 1.78
      *
      * Removes all the controls in the association named {@link #getAriaDescribedBy ariaDescribedBy}.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllAriaDescribedBy(): js.Array[ID] = js.native
    
    /**
      * @SINCE 1.50
      *
      * Removes all the controls from the aggregation {@link #getContent content}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllContent(): js.Array[typings.openui5.sapUiCoreControlMod.default] = js.native
    
    /**
      * Removes all the controls from the aggregation {@link #getExpandedContent expandedContent}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllExpandedContent(): js.Array[typings.openui5.sapUiCoreControlMod.default] = js.native
    
    /**
      * @SINCE 1.52
      *
      * Removes all the controls from the aggregation {@link #getNavigationActions navigationActions}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllNavigationActions(): js.Array[typings.openui5.sapMButtonMod.default] = js.native
    
    /**
      * Removes all the controls from the aggregation {@link #getSnappedContent snappedContent}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllSnappedContent(): js.Array[typings.openui5.sapUiCoreControlMod.default] = js.native
    
    /**
      * @SINCE 1.78
      *
      * Removes an ariaDescribedBy from the association named {@link #getAriaDescribedBy ariaDescribedBy}.
      *
      * @returns The removed ariaDescribedBy or `null`
      */
    def removeAriaDescribedBy(/**
      * The ariaDescribedBy to be removed or its index or ID
      */
    vAriaDescribedBy: int): ID | Null = js.native
    def removeAriaDescribedBy(
      /**
      * The ariaDescribedBy to be removed or its index or ID
      */
    vAriaDescribedBy: typings.openui5.sapUiCoreControlMod.default
    ): ID | Null = js.native
    def removeAriaDescribedBy(/**
      * The ariaDescribedBy to be removed or its index or ID
      */
    vAriaDescribedBy: ID): ID | Null = js.native
    
    def removeContent(/**
      * The content to remove or its index or id
      */
    vContent: String): typings.openui5.sapUiCoreControlMod.default | Null = js.native
    /**
      * @SINCE 1.50
      *
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
    
    def removeExpandedContent(/**
      * The expandedContent to remove or its index or id
      */
    vExpandedContent: String): typings.openui5.sapUiCoreControlMod.default | Null = js.native
    /**
      * Removes a expandedContent from the aggregation {@link #getExpandedContent expandedContent}.
      *
      * @returns The removed expandedContent or `null`
      */
    def removeExpandedContent(/**
      * The expandedContent to remove or its index or id
      */
    vExpandedContent: int): typings.openui5.sapUiCoreControlMod.default | Null = js.native
    def removeExpandedContent(
      /**
      * The expandedContent to remove or its index or id
      */
    vExpandedContent: typings.openui5.sapUiCoreControlMod.default
    ): typings.openui5.sapUiCoreControlMod.default | Null = js.native
    
    def removeNavigationAction(/**
      * The navigationAction to remove or its index or id
      */
    vNavigationAction: String): typings.openui5.sapMButtonMod.default | Null = js.native
    /**
      * @SINCE 1.52
      *
      * Removes a navigationAction from the aggregation {@link #getNavigationActions navigationActions}.
      *
      * @returns The removed navigationAction or `null`
      */
    def removeNavigationAction(/**
      * The navigationAction to remove or its index or id
      */
    vNavigationAction: int): typings.openui5.sapMButtonMod.default | Null = js.native
    def removeNavigationAction(
      /**
      * The navigationAction to remove or its index or id
      */
    vNavigationAction: typings.openui5.sapMButtonMod.default
    ): typings.openui5.sapMButtonMod.default | Null = js.native
    
    def removeSnappedContent(/**
      * The snappedContent to remove or its index or id
      */
    vSnappedContent: String): typings.openui5.sapUiCoreControlMod.default | Null = js.native
    /**
      * Removes a snappedContent from the aggregation {@link #getSnappedContent snappedContent}.
      *
      * @returns The removed snappedContent or `null`
      */
    def removeSnappedContent(/**
      * The snappedContent to remove or its index or id
      */
    vSnappedContent: int): typings.openui5.sapUiCoreControlMod.default | Null = js.native
    def removeSnappedContent(
      /**
      * The snappedContent to remove or its index or id
      */
    vSnappedContent: typings.openui5.sapUiCoreControlMod.default
    ): typings.openui5.sapUiCoreControlMod.default | Null = js.native
    
    /**
      * @SINCE 1.54
      *
      * Sets the value of the `areaShrinkRatio` property.
      *
      * @returns `this` to allow method chaining
      */
    def setAreaShrinkRatio(/**
      * new value of the `areaShrinkRatio`
      */
    sAreaShrinkRatio: DynamicPageTitleShrinkRatio): this.type = js.native
    
    def setBackgroundDesign(
      /**
      * New value for property `backgroundDesign`
      */
    sBackgroundDesign: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof BackgroundDesign * / any */ String
    ): this.type = js.native
    /**
      * @SINCE 1.58
      *
      * Sets a new value for property {@link #getBackgroundDesign backgroundDesign}.
      *
      * Determines the background color of the `DynamicPageTitle`.
      *
      * **Note:** The default value of `backgroundDesign` property is null. If the property is not set, the color
      * of the background is `@sapUiObjectHeaderBackground`, which depends on the specific theme.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setBackgroundDesign(/**
      * New value for property `backgroundDesign`
      */
    sBackgroundDesign: BackgroundDesign): this.type = js.native
    
    /**
      * @SINCE 1.52
      *
      * Sets the aggregated {@link #getBreadcrumbs breadcrumbs}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setBreadcrumbs(/**
      * The breadcrumbs to set
      */
    oBreadcrumbs: IBreadcrumbs): this.type = js.native
    
    /**
      * @SINCE 1.52
      *
      * Sets the aggregated {@link #getExpandedHeading expandedHeading}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setExpandedHeading(
      /**
      * The expandedHeading to set
      */
    oExpandedHeading: typings.openui5.sapUiCoreControlMod.default
    ): this.type = js.native
    
    /**
      * Sets the aggregated {@link #getHeading heading}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setHeading(/**
      * The heading to set
      */
    oHeading: typings.openui5.sapUiCoreControlMod.default): this.type = js.native
    
    /**
      * @SINCE 1.50
      * @deprecated (since 1.54) - Please use the `areaShrinkRatio` property instead. The value of `areaShrinkRatio`
      * must be set in `Heading:Content:Actions` format where Heading, Content and Actions are numbers greater
      * than or equal to 0. The greater value a section has the faster it shrinks when the screen size is being
      * reduced.
      *
      * `primaryArea=Begin` can be achieved by setting a low number for the Heading area to `areaShrinkRatio`,
      * for example `1:1.6:1.6`.
      *
      * `primaryArea=Middle` can be achieved by setting a low number for the Content area to `areaShrinkRatio`,
      * for example `1.6:1:1.6`.
      *
      * Sets a new value for property {@link #getPrimaryArea primaryArea}.
      *
      * Determines which of the `DynamicPageTitle` areas (Begin, Middle) is primary.
      *
      * **Note:** The primary area is shrinking at lower rate, remaining visible as much as it can.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `Begin`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setPrimaryArea(): this.type = js.native
    def setPrimaryArea(
      /**
      * New value for property `primaryArea`
      */
    sPrimaryArea: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof DynamicPageTitleArea * / any */ String
    ): this.type = js.native
    def setPrimaryArea(/**
      * New value for property `primaryArea`
      */
    sPrimaryArea: DynamicPageTitleArea): this.type = js.native
    
    /**
      * @SINCE 1.52
      *
      * Sets the aggregated {@link #getSnappedHeading snappedHeading}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setSnappedHeading(
      /**
      * The snappedHeading to set
      */
    oSnappedHeading: typings.openui5.sapUiCoreControlMod.default
    ): this.type = js.native
    
    /**
      * @SINCE 1.63
      *
      * Sets the aggregated {@link #getSnappedTitleOnMobile snappedTitleOnMobile}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setSnappedTitleOnMobile(
      /**
      * The snappedTitleOnMobile to set
      */
    oSnappedTitleOnMobile: typings.openui5.sapMTitleMod.default
    ): this.type = js.native
  }
  
  trait DynamicPageTitleSettings
    extends StObject
       with ControlSettings {
    
    /**
      * The `DynamicPageTitle` actions.
      * **Note:** The `actions` aggregation accepts any UI5 control, but it`s recommended to use controls, suitable
      * for {@link sap.m.Toolbar} and {@link sap.m.OverflowToolbar}.
      *
      * **Note:** If the `snappedTitleOnMobile` aggregation is set, its content overrides this aggregation when
      * the control is viewed on a phone mobile device and the `DynamicPageHeader` is in its collapsed (snapped)
      * state.
      */
    var actions: js.UndefOr[
        js.Array[typings.openui5.sapUiCoreControlMod.default] | typings.openui5.sapUiCoreControlMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @SINCE 1.54
      *
      * Assigns shrinking ratio to the `DynamicPageTitle` areas (Heading, Content, Actions). The greater value
      * a section has the faster it shrinks when the screen size is being reduced.
      *
      * The value must be set in `Heading:Content:Actions` format where Title, Content and Actions are numbers
      * greater than or equal to 0. If set to 0, the respective area will not shrink.
      *
      * For example, if `2:7:1` is set, the Content area will shrink seven times faster than the Actions area.
      * So, when all three areas have width of 500px and the available space is reduced by 100px the Title area
      * will reduced by 20px, the Content area - by 70px and the Actions area - by 10px.
      *
      * If all the areas have assigned values greater than 1, the numbers are scaled so that at least one of
      * them is equal to 1. For example, value of `2:4:8` is equal to `1:2:4`.
      *
      *  When this property is set the `primaryArea` property has no effect.
      */
    var areaShrinkRatio: js.UndefOr[
        DynamicPageTitleShrinkRatio | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @SINCE 1.78
      *
      * Association to controls / IDs which describe this control (see WAI-ARIA attribute aria-describedby).
      */
    var ariaDescribedBy: js.UndefOr[js.Array[typings.openui5.sapUiCoreControlMod.default | String]] = js.undefined
    
    /**
      * @SINCE 1.58
      *
      * Determines the background color of the `DynamicPageTitle`.
      *
      * **Note:** The default value of `backgroundDesign` property is null. If the property is not set, the color
      * of the background is `@sapUiObjectHeaderBackground`, which depends on the specific theme.
      */
    var backgroundDesign: js.UndefOr[
        BackgroundDesign | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof BackgroundDesign * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * @SINCE 1.52
      *
      * The breadcrumbs displayed in the `DynamicPageTitle` top-left area.
      */
    var breadcrumbs: js.UndefOr[IBreadcrumbs] = js.undefined
    
    /**
      * @SINCE 1.50
      *
      * The content is positioned in the `DynamicPageTitle` middle area and displayed in both expanded and collapsed
      * (snapped) states.
      *
      * **Note:** If the `snappedTitleOnMobile` aggregation is set, its content overrides this aggregation when
      * the control is viewed on a phone mobile device and the `DynamicPageHeader` is in its collapsed (snapped)
      * state.
      */
    var content: js.UndefOr[
        js.Array[typings.openui5.sapUiCoreControlMod.default] | typings.openui5.sapUiCoreControlMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * The content that is displayed in the `DynamicPageTitle` in expanded state.
      */
    var expandedContent: js.UndefOr[
        js.Array[typings.openui5.sapUiCoreControlMod.default] | typings.openui5.sapUiCoreControlMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @SINCE 1.52
      *
      * The `expandedHeading` is positioned in the `DynamicPageTitle` left area and is displayed when the header
      * is in expanded state only. Use this aggregation to display a title (or any other UI5 control that serves
      * as a heading) that has to be present in expanded state only.
      *
      * **Note:** In order for `expandedHeading` to be taken into account, `heading` has to be empty. Combine
      * `expandedHeading` with `snappedHeading` to switch content when the header switches state.
      */
    var expandedHeading: js.UndefOr[typings.openui5.sapUiCoreControlMod.default] = js.undefined
    
    /**
      * The `heading` is positioned in the `DynamicPageTitle` left area and is displayed in both expanded and
      * collapsed (snapped) states of the header. Use this aggregation to display a title (or any other UI5 control
      * that serves as a heading) that has to be present in both expanded and collapsed states of the header.
      *
      * **Notes:**
      * 	 - `heading` is mutually exclusive with `snappedHeading` and `expandedHeading`. If `heading` is provided,
      * 			both `snappedHeading` and `expandedHeading` are ignored. `heading` is useful when the content of `snappedHeading`
      * 			and `expandedHeading` needs to be the same as it replaces them both.
      * 	 - If the `snappedTitleOnMobile` aggregation is set, its content overrides this aggregation when the
      * 			control is viewed on a phone mobile device and the `DynamicPageHeader` is in its collapsed (snapped)
      * 			state.
      */
    var heading: js.UndefOr[typings.openui5.sapUiCoreControlMod.default] = js.undefined
    
    /**
      * @SINCE 1.52
      *
      * The `DynamicPageTitle` navigation actions.
      *
      * **Notes:**
      * 	 - The `navigationActions` position depends on the control size. If the control size is 1280px or bigger,
      * 			they are rendered right next to the `actions`. Otherwise, they are rendered in the top-right area, above
      * 			the `actions`. If a large number of elements(buttons) are used, there could be visual degradations as
      * 			the space for the `navigationActions` is limited.
      * 	 - If the `snappedTitleOnMobile` aggregation is set, its content overrides this aggregation when the
      * 			control is viewed on a phone mobile device and the `DynamicPageHeader` is in its collapsed (snapped)
      * 			state.
      */
    var navigationActions: js.UndefOr[
        js.Array[typings.openui5.sapMButtonMod.default] | typings.openui5.sapMButtonMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @SINCE 1.50
      * @deprecated (since 1.54) - Please use the `areaShrinkRatio` property instead. The value of `areaShrinkRatio`
      * must be set in `Heading:Content:Actions` format where Heading, Content and Actions are numbers greater
      * than or equal to 0. The greater value a section has the faster it shrinks when the screen size is being
      * reduced.
      *
      * `primaryArea=Begin` can be achieved by setting a low number for the Heading area to `areaShrinkRatio`,
      * for example `1:1.6:1.6`.
      *
      * `primaryArea=Middle` can be achieved by setting a low number for the Content area to `areaShrinkRatio`,
      * for example `1.6:1:1.6`.
      *
      * Determines which of the `DynamicPageTitle` areas (Begin, Middle) is primary.
      *
      * **Note:** The primary area is shrinking at lower rate, remaining visible as much as it can.
      */
    var primaryArea: js.UndefOr[
        DynamicPageTitleArea | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof DynamicPageTitleArea * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * The content that is displayed in the `DynamicPageTitle` in collapsed (snapped) state.
      *
      * **Note:** If the `snappedTitleOnMobile` aggregation is set, its content overrides this aggregation when
      * the control is viewed on a phone mobile device and the `DynamicPageHeader` is in its collapsed (snapped)
      * state.
      */
    var snappedContent: js.UndefOr[
        js.Array[typings.openui5.sapUiCoreControlMod.default] | typings.openui5.sapUiCoreControlMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @SINCE 1.52
      *
      * The `snappedHeading` is positioned in the `DynamicPageTitle` left area and is displayed when the header
      * is in collapsed (snapped) state only. Use this aggregation to display a title (or any other UI5 control
      * that serves as a heading) that has to be present in collapsed state only.
      *
      * **Notes:**
      * 	 - In order for `snappedHeading` to be taken into account, `heading` has to be empty. Combine `snappedHeading`
      * 			with `expandedHeading` to switch content when the header switches state.
      * 	 - If the `snappedTitleOnMobile` aggregation is set, its content overrides this aggregation when the
      * 			control is viewed on a phone mobile device and the `DynamicPageHeader` is in its collapsed (snapped)
      * 			state.
      */
    var snappedHeading: js.UndefOr[typings.openui5.sapUiCoreControlMod.default] = js.undefined
    
    /**
      * @SINCE 1.63
      *
      * The only content that is displayed in the `DynamicPageTitle` when it is viewed on a phone mobile device
      * and the `DynamicPageHeader` is in collapsed (snapped) state.
      *
      * Using this aggregation enables you to provide a simple, single-line title that takes less space on the
      * smaller phone screens when the `DynamicPageHeader` is in its collapsed (snapped) state.
      *
      * **Note:** The content set in this aggregation overrides all the other `DynamicPageTitle` aggregations
      * and is only visible on phone mobile devices in collapsed (snapped) state of the `DynamicPageHeader`.
      */
    var snappedTitleOnMobile: js.UndefOr[typings.openui5.sapMTitleMod.default] = js.undefined
    
    /**
      * @SINCE 1.54
      *
      * Fired when the title state (expanded/collapsed) is toggled by user interaction. For example, scrolling,
      * title clicking/tapping, using expand/collapse button.
      *
      * Also fired when the developer toggles the title state by programmatically changing the scroll position
      * of the scrollbar of `DynamicPage`.
      */
    var stateChange: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
  }
  object DynamicPageTitleSettings {
    
    inline def apply(): DynamicPageTitleSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DynamicPageTitleSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DynamicPageTitleSettings] (val x: Self) extends AnyVal {
      
      inline def setActions(
        value: js.Array[typings.openui5.sapUiCoreControlMod.default] | typings.openui5.sapUiCoreControlMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
      
      inline def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
      
      inline def setActionsVarargs(value: typings.openui5.sapUiCoreControlMod.default*): Self = StObject.set(x, "actions", js.Array(value*))
      
      inline def setAreaShrinkRatio(
        value: DynamicPageTitleShrinkRatio | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "areaShrinkRatio", value.asInstanceOf[js.Any])
      
      inline def setAreaShrinkRatioUndefined: Self = StObject.set(x, "areaShrinkRatio", js.undefined)
      
      inline def setAriaDescribedBy(value: js.Array[typings.openui5.sapUiCoreControlMod.default | String]): Self = StObject.set(x, "ariaDescribedBy", value.asInstanceOf[js.Any])
      
      inline def setAriaDescribedByUndefined: Self = StObject.set(x, "ariaDescribedBy", js.undefined)
      
      inline def setAriaDescribedByVarargs(value: (typings.openui5.sapUiCoreControlMod.default | String)*): Self = StObject.set(x, "ariaDescribedBy", js.Array(value*))
      
      inline def setBackgroundDesign(
        value: BackgroundDesign | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof BackgroundDesign * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "backgroundDesign", value.asInstanceOf[js.Any])
      
      inline def setBackgroundDesignUndefined: Self = StObject.set(x, "backgroundDesign", js.undefined)
      
      inline def setBreadcrumbs(value: IBreadcrumbs): Self = StObject.set(x, "breadcrumbs", value.asInstanceOf[js.Any])
      
      inline def setBreadcrumbsUndefined: Self = StObject.set(x, "breadcrumbs", js.undefined)
      
      inline def setContent(
        value: js.Array[typings.openui5.sapUiCoreControlMod.default] | typings.openui5.sapUiCoreControlMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setContentVarargs(value: typings.openui5.sapUiCoreControlMod.default*): Self = StObject.set(x, "content", js.Array(value*))
      
      inline def setExpandedContent(
        value: js.Array[typings.openui5.sapUiCoreControlMod.default] | typings.openui5.sapUiCoreControlMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "expandedContent", value.asInstanceOf[js.Any])
      
      inline def setExpandedContentUndefined: Self = StObject.set(x, "expandedContent", js.undefined)
      
      inline def setExpandedContentVarargs(value: typings.openui5.sapUiCoreControlMod.default*): Self = StObject.set(x, "expandedContent", js.Array(value*))
      
      inline def setExpandedHeading(value: typings.openui5.sapUiCoreControlMod.default): Self = StObject.set(x, "expandedHeading", value.asInstanceOf[js.Any])
      
      inline def setExpandedHeadingUndefined: Self = StObject.set(x, "expandedHeading", js.undefined)
      
      inline def setHeading(value: typings.openui5.sapUiCoreControlMod.default): Self = StObject.set(x, "heading", value.asInstanceOf[js.Any])
      
      inline def setHeadingUndefined: Self = StObject.set(x, "heading", js.undefined)
      
      inline def setNavigationActions(
        value: js.Array[typings.openui5.sapMButtonMod.default] | typings.openui5.sapMButtonMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "navigationActions", value.asInstanceOf[js.Any])
      
      inline def setNavigationActionsUndefined: Self = StObject.set(x, "navigationActions", js.undefined)
      
      inline def setNavigationActionsVarargs(value: typings.openui5.sapMButtonMod.default*): Self = StObject.set(x, "navigationActions", js.Array(value*))
      
      inline def setPrimaryArea(
        value: DynamicPageTitleArea | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof DynamicPageTitleArea * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "primaryArea", value.asInstanceOf[js.Any])
      
      inline def setPrimaryAreaUndefined: Self = StObject.set(x, "primaryArea", js.undefined)
      
      inline def setSnappedContent(
        value: js.Array[typings.openui5.sapUiCoreControlMod.default] | typings.openui5.sapUiCoreControlMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "snappedContent", value.asInstanceOf[js.Any])
      
      inline def setSnappedContentUndefined: Self = StObject.set(x, "snappedContent", js.undefined)
      
      inline def setSnappedContentVarargs(value: typings.openui5.sapUiCoreControlMod.default*): Self = StObject.set(x, "snappedContent", js.Array(value*))
      
      inline def setSnappedHeading(value: typings.openui5.sapUiCoreControlMod.default): Self = StObject.set(x, "snappedHeading", value.asInstanceOf[js.Any])
      
      inline def setSnappedHeadingUndefined: Self = StObject.set(x, "snappedHeading", js.undefined)
      
      inline def setSnappedTitleOnMobile(value: typings.openui5.sapMTitleMod.default): Self = StObject.set(x, "snappedTitleOnMobile", value.asInstanceOf[js.Any])
      
      inline def setSnappedTitleOnMobileUndefined: Self = StObject.set(x, "snappedTitleOnMobile", js.undefined)
      
      inline def setStateChange(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "stateChange", js.Any.fromFunction1(value))
      
      inline def setStateChangeUndefined: Self = StObject.set(x, "stateChange", js.undefined)
    }
  }
}
