package typings.openui5

import typings.openui5.anon.CurrentBreakpoint
import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.AggregationBindingInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreControlMod.ControlSettings
import typings.openui5.sapUiLayoutLibraryMod.SideContentFallDown
import typings.openui5.sapUiLayoutLibraryMod.SideContentPosition
import typings.openui5.sapUiLayoutLibraryMod.SideContentVisibility
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiLayoutDynamicSideContentMod {
  
  @JSImport("sap/ui/layout/DynamicSideContent", JSImport.Default)
  @js.native
  /**
    * Constructor for a new `DynamicSideContent`.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    * See:
    * 	{@link fiori:https://experience.sap.com/fiori-design-web/dynamic-side-content/ Dynamic Side Content}
    */
  open class default () extends DynamicSideContent {
    def this(/**
      * Initial settings for the new control
      */
    mSettings: DynamicSideContentSettings) = this()
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
    mSettings: DynamicSideContentSettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new control
      */
    mSettings: DynamicSideContentSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/layout/DynamicSideContent", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.layout.DynamicSideContent with name `sClassName` and enriches
      * it with the information contained in `oClassInfo`.
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
    oClassInfo: ClassInfo[T, DynamicSideContent]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, DynamicSideContent],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.layout.DynamicSideContent.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait DynamicSideContent
    extends typings.openui5.sapUiCoreControlMod.default {
    
    /**
      * Adds a control to the main content area. Only the main content part in the aggregation is re-rendered.
      *
      * @returns this pointer for chaining
      */
    def addMainContent(/**
      * Object to be added in the aggregation
      */
    oControl: js.Object): this.type = js.native
    
    /**
      * Adds a control to the side content area. Only the side content part in the aggregation is re-rendered.
      *
      * @returns this pointer for chaining
      */
    def addSideContent(/**
      * Object to be added in the aggregation
      */
    oControl: js.Object): this.type = js.native
    
    /**
      * @SINCE 1.32
      *
      * Attaches event handler `fnFunction` to the {@link #event:breakpointChanged breakpointChanged} event of
      * this `sap.ui.layout.DynamicSideContent`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.layout.DynamicSideContent` itself.
      *
      * Fires when the current breakpoint has been changed.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachBreakpointChanged(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachBreakpointChanged(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.layout.DynamicSideContent` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * @SINCE 1.32
      *
      * Attaches event handler `fnFunction` to the {@link #event:breakpointChanged breakpointChanged} event of
      * this `sap.ui.layout.DynamicSideContent`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.layout.DynamicSideContent` itself.
      *
      * Fires when the current breakpoint has been changed.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachBreakpointChanged(
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
    def attachBreakpointChanged(
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
      * Context object to call the event handler with. Defaults to this `sap.ui.layout.DynamicSideContent` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Destroys all the mainContent in the aggregation {@link #getMainContent mainContent}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyMainContent(): this.type = js.native
    
    /**
      * Destroys all the sideContent in the aggregation {@link #getSideContent sideContent}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroySideContent(): this.type = js.native
    
    /**
      * @SINCE 1.32
      *
      * Detaches event handler `fnFunction` from the {@link #event:breakpointChanged breakpointChanged} event
      * of this `sap.ui.layout.DynamicSideContent`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachBreakpointChanged(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachBreakpointChanged(
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
      * @SINCE 1.32
      *
      * Fires event {@link #event:breakpointChanged breakpointChanged} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireBreakpointChanged(): this.type = js.native
    def fireBreakpointChanged(/**
      * Parameters to pass along with the event
      */
    mParameters: CurrentBreakpoint): this.type = js.native
    
    /**
      * Gets current value of property {@link #getContainerQuery containerQuery}.
      *
      * If set to TRUE, then not the media Query (device screen size) but the size of the container, surrounding
      * the control, defines the current range.
      *
      * Default value is `false`.
      *
      * @returns Value of property `containerQuery`
      */
    def getContainerQuery(): Boolean = js.native
    
    /**
      * Returns the breakpoint for the current state of the control.
      *
      * If the control is not rendered yet, this method will return `undefined`, as current break point calculation
      * is based on the parent container width.
      *
      * @returns currentBreakpoint
      */
    def getCurrentBreakpoint(): String = js.native
    
    /**
      * Gets current value of property {@link #getEqualSplit equalSplit}.
      *
      * Defines whether the control is in equal split mode. In this mode, the side and the main content take
      * 50:50 percent of the container on all screen sizes except for phone, where the main and side contents
      * are switching visibility using the toggle method.
      *
      * Default value is `false`.
      *
      * @returns Value of property `equalSplit`
      */
    def getEqualSplit(): Boolean = js.native
    
    /**
      * Gets content of aggregation {@link #getMainContent mainContent}.
      *
      * Main content controls.
      */
    def getMainContent(): js.Array[typings.openui5.sapUiCoreControlMod.default] = js.native
    
    /**
      * @SINCE 1.78
      *
      * Returns a scroll helper object used to handle scrolling.
      *
      * @returns The scroll helper instance
      */
    def getScrollDelegate(/**
      * The control instance that requested the scroll helper
      */
    oControl: js.Object): typings.openui5.sapUiCoreDelegateScrollEnablementMod.default = js.native
    
    /**
      * Gets current value of property {@link #getShowMainContent showMainContent}.
      *
      * Determines whether the main content is visible or hidden.
      *
      * Default value is `true`.
      *
      * @returns Value of property `showMainContent`
      */
    def getShowMainContent(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getShowSideContent showSideContent}.
      *
      * Determines whether the side content is visible or hidden.
      *
      * **Note:** If both `showSideContent` and `showMainContent` properties are set to `true`, use the `toggle`
      * method for showing the side content on phone.
      *
      * Default value is `true`.
      *
      * @returns Value of property `showSideContent`
      */
    def getShowSideContent(): Boolean = js.native
    
    /**
      * Gets content of aggregation {@link #getSideContent sideContent}.
      *
      * Side content controls.
      */
    def getSideContent(): js.Array[typings.openui5.sapUiCoreControlMod.default] = js.native
    
    /**
      * Gets current value of property {@link #getSideContentFallDown sideContentFallDown}.
      *
      * Determines on which breakpoints the side content falls down below the main content.
      *
      * Default value is `OnMinimumWidth`.
      *
      * @returns Value of property `sideContentFallDown`
      */
    def getSideContentFallDown(): SideContentFallDown | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SideContentFallDown * / any */ String) = js.native
    
    /**
      * @SINCE 1.36
      *
      * Gets current value of property {@link #getSideContentPosition sideContentPosition}.
      *
      * Determines whether the side content is on the left or on the right side of the main content.
      *
      * Default value is `End`.
      *
      * @returns Value of property `sideContentPosition`
      */
    def getSideContentPosition(): SideContentPosition | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SideContentPosition * / any */ String) = js.native
    
    /**
      * Gets current value of property {@link #getSideContentVisibility sideContentVisibility}.
      *
      * Determines on which breakpoints the side content is visible.
      *
      * Default value is `ShowAboveS`.
      *
      * @returns Value of property `sideContentVisibility`
      */
    def getSideContentVisibility(): SideContentVisibility | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SideContentVisibility * / any */ String) = js.native
    
    /**
      * Checks for the provided `sap.ui.core.Control` in the aggregation {@link #getMainContent mainContent}.
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
      * Checks for the provided `sap.ui.core.Control` in the aggregation {@link #getSideContent sideContent}.
      * and returns its index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfSideContent(
      /**
      * The sideContent whose index is looked for
      */
    oSideContent: typings.openui5.sapUiCoreControlMod.default
    ): int = js.native
    
    /**
      * Inserts a mainContent into the aggregation {@link #getMainContent mainContent}.
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
      * Inserts a sideContent into the aggregation {@link #getSideContent sideContent}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def insertSideContent(
      /**
      * The sideContent to insert; if empty, nothing is inserted
      */
    oSideContent: typings.openui5.sapUiCoreControlMod.default,
      /**
      * The `0`-based index the sideContent should be inserted at; for a negative value of `iIndex`, the sideContent
      * is inserted at position 0; for a value greater than the current size of the aggregation, the sideContent
      * is inserted at the last position
      */
    iIndex: int
    ): this.type = js.native
    
    /**
      * Checks if the main content is visible.
      *
      * @returns Main content visibility state
      */
    def isMainContentVisible(): Boolean = js.native
    
    /**
      * Checks if the side content is visible.
      *
      * @returns Side content visibility state
      */
    def isSideContentVisible(): Boolean = js.native
    
    /**
      * Removes all the controls from the aggregation {@link #getMainContent mainContent}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllMainContent(): js.Array[typings.openui5.sapUiCoreControlMod.default] = js.native
    
    /**
      * Removes all the controls from the aggregation {@link #getSideContent sideContent}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllSideContent(): js.Array[typings.openui5.sapUiCoreControlMod.default] = js.native
    
    def removeMainContent(/**
      * The mainContent to remove or its index or id
      */
    vMainContent: String): typings.openui5.sapUiCoreControlMod.default | Null = js.native
    /**
      * Removes a mainContent from the aggregation {@link #getMainContent mainContent}.
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
    
    def removeSideContent(/**
      * The sideContent to remove or its index or id
      */
    vSideContent: String): typings.openui5.sapUiCoreControlMod.default | Null = js.native
    /**
      * Removes a sideContent from the aggregation {@link #getSideContent sideContent}.
      *
      * @returns The removed sideContent or `null`
      */
    def removeSideContent(/**
      * The sideContent to remove or its index or id
      */
    vSideContent: int): typings.openui5.sapUiCoreControlMod.default | Null = js.native
    def removeSideContent(
      /**
      * The sideContent to remove or its index or id
      */
    vSideContent: typings.openui5.sapUiCoreControlMod.default
    ): typings.openui5.sapUiCoreControlMod.default | Null = js.native
    
    /**
      * Sets a new value for property {@link #getContainerQuery containerQuery}.
      *
      * If set to TRUE, then not the media Query (device screen size) but the size of the container, surrounding
      * the control, defines the current range.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setContainerQuery(): this.type = js.native
    def setContainerQuery(/**
      * New value for property `containerQuery`
      */
    bContainerQuery: Boolean): this.type = js.native
    
    /**
      * Sets or unsets the page in equalSplit mode.
      *
      * @returns this pointer for chaining
      */
    def setEqualSplit(): this.type = js.native
    def setEqualSplit(/**
      * Determines if the page is set to equalSplit mode
      */
    bState: Boolean): this.type = js.native
    
    /**
      * Sets the showMainContent property.
      *
      * @returns this pointer for chaining
      */
    def setShowMainContent(
      /**
      * Determines if the main content part is visible
      */
    bVisible: Boolean,
      /**
      * Determines if the visual state is updated
      */
    bSuppressVisualUpdate: Boolean
    ): this.type = js.native
    
    /**
      * Sets the showSideContent property.
      *
      * @returns this pointer for chaining
      */
    def setShowSideContent(
      /**
      * Determines if the side content part is visible
      */
    bVisible: Boolean,
      /**
      * Determines if the visual state is updated
      */
    bSuppressVisualUpdate: Boolean
    ): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getSideContentFallDown sideContentFallDown}.
      *
      * Determines on which breakpoints the side content falls down below the main content.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `OnMinimumWidth`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setSideContentFallDown(): this.type = js.native
    def setSideContentFallDown(
      /**
      * New value for property `sideContentFallDown`
      */
    sSideContentFallDown: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SideContentFallDown * / any */ String
    ): this.type = js.native
    def setSideContentFallDown(
      /**
      * New value for property `sideContentFallDown`
      */
    sSideContentFallDown: SideContentFallDown
    ): this.type = js.native
    
    /**
      * @SINCE 1.36
      *
      * Sets a new value for property {@link #getSideContentPosition sideContentPosition}.
      *
      * Determines whether the side content is on the left or on the right side of the main content.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `End`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setSideContentPosition(): this.type = js.native
    def setSideContentPosition(
      /**
      * New value for property `sideContentPosition`
      */
    sSideContentPosition: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SideContentPosition * / any */ String
    ): this.type = js.native
    def setSideContentPosition(
      /**
      * New value for property `sideContentPosition`
      */
    sSideContentPosition: SideContentPosition
    ): this.type = js.native
    
    def setSideContentVisibility(
      /**
      * Determines on which breakpoints the side content is visible.
      */
    sVisibility: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SideContentVisibility * / any */ String,
      /**
      * Determines if the visual state is updated
      */
    bSuppressVisualUpdate: Boolean
    ): this.type = js.native
    /**
      * Sets the sideContentVisibility property.
      *
      * @returns this pointer for chaining
      */
    def setSideContentVisibility(
      /**
      * Determines on which breakpoints the side content is visible.
      */
    sVisibility: SideContentVisibility,
      /**
      * Determines if the visual state is updated
      */
    bSuppressVisualUpdate: Boolean
    ): this.type = js.native
    
    /**
      * Used for the toggle button functionality. When the control is on a phone screen size only, one control
      * area is visible. This helper method is used to implement a button/switch for changing between the main
      * and side content areas. Only works if the current breakpoint is "S".
      *
      * @returns this pointer for chaining
      */
    def toggle(): this.type = js.native
  }
  
  trait DynamicSideContentSettings
    extends StObject
       with ControlSettings {
    
    /**
      * @SINCE 1.32
      *
      * Fires when the current breakpoint has been changed.
      */
    var breakpointChanged: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * If set to TRUE, then not the media Query (device screen size) but the size of the container, surrounding
      * the control, defines the current range.
      */
    var containerQuery: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Defines whether the control is in equal split mode. In this mode, the side and the main content take
      * 50:50 percent of the container on all screen sizes except for phone, where the main and side contents
      * are switching visibility using the toggle method.
      */
    var equalSplit: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Main content controls.
      */
    var mainContent: js.UndefOr[
        js.Array[typings.openui5.sapUiCoreControlMod.default] | typings.openui5.sapUiCoreControlMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Determines whether the main content is visible or hidden.
      */
    var showMainContent: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Determines whether the side content is visible or hidden.
      *
      * **Note:** If both `showSideContent` and `showMainContent` properties are set to `true`, use the `toggle`
      * method for showing the side content on phone.
      */
    var showSideContent: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Side content controls.
      */
    var sideContent: js.UndefOr[
        js.Array[typings.openui5.sapUiCoreControlMod.default] | typings.openui5.sapUiCoreControlMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Determines on which breakpoints the side content falls down below the main content.
      */
    var sideContentFallDown: js.UndefOr[
        SideContentFallDown | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SideContentFallDown * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * @SINCE 1.36
      *
      * Determines whether the side content is on the left or on the right side of the main content.
      */
    var sideContentPosition: js.UndefOr[
        SideContentPosition | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SideContentPosition * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * Determines on which breakpoints the side content is visible.
      */
    var sideContentVisibility: js.UndefOr[
        SideContentVisibility | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SideContentVisibility * / any */ String) | PropertyBindingInfo
      ] = js.undefined
  }
  object DynamicSideContentSettings {
    
    inline def apply(): DynamicSideContentSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DynamicSideContentSettings]
    }
    
    extension [Self <: DynamicSideContentSettings](x: Self) {
      
      inline def setBreakpointChanged(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "breakpointChanged", js.Any.fromFunction1(value))
      
      inline def setBreakpointChangedUndefined: Self = StObject.set(x, "breakpointChanged", js.undefined)
      
      inline def setContainerQuery(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "containerQuery", value.asInstanceOf[js.Any])
      
      inline def setContainerQueryUndefined: Self = StObject.set(x, "containerQuery", js.undefined)
      
      inline def setEqualSplit(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "equalSplit", value.asInstanceOf[js.Any])
      
      inline def setEqualSplitUndefined: Self = StObject.set(x, "equalSplit", js.undefined)
      
      inline def setMainContent(
        value: js.Array[typings.openui5.sapUiCoreControlMod.default] | typings.openui5.sapUiCoreControlMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "mainContent", value.asInstanceOf[js.Any])
      
      inline def setMainContentUndefined: Self = StObject.set(x, "mainContent", js.undefined)
      
      inline def setMainContentVarargs(value: typings.openui5.sapUiCoreControlMod.default*): Self = StObject.set(x, "mainContent", js.Array(value*))
      
      inline def setShowMainContent(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "showMainContent", value.asInstanceOf[js.Any])
      
      inline def setShowMainContentUndefined: Self = StObject.set(x, "showMainContent", js.undefined)
      
      inline def setShowSideContent(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "showSideContent", value.asInstanceOf[js.Any])
      
      inline def setShowSideContentUndefined: Self = StObject.set(x, "showSideContent", js.undefined)
      
      inline def setSideContent(
        value: js.Array[typings.openui5.sapUiCoreControlMod.default] | typings.openui5.sapUiCoreControlMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "sideContent", value.asInstanceOf[js.Any])
      
      inline def setSideContentFallDown(
        value: SideContentFallDown | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SideContentFallDown * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "sideContentFallDown", value.asInstanceOf[js.Any])
      
      inline def setSideContentFallDownUndefined: Self = StObject.set(x, "sideContentFallDown", js.undefined)
      
      inline def setSideContentPosition(
        value: SideContentPosition | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SideContentPosition * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "sideContentPosition", value.asInstanceOf[js.Any])
      
      inline def setSideContentPositionUndefined: Self = StObject.set(x, "sideContentPosition", js.undefined)
      
      inline def setSideContentUndefined: Self = StObject.set(x, "sideContent", js.undefined)
      
      inline def setSideContentVarargs(value: typings.openui5.sapUiCoreControlMod.default*): Self = StObject.set(x, "sideContent", js.Array(value*))
      
      inline def setSideContentVisibility(
        value: SideContentVisibility | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SideContentVisibility * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "sideContentVisibility", value.asInstanceOf[js.Any])
      
      inline def setSideContentVisibilityUndefined: Self = StObject.set(x, "sideContentVisibility", js.undefined)
    }
  }
}
