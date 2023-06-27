package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.AggregationBindingInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreControlMod.ControlSettings
import typings.openui5.sapUiWebcFioriLibraryMod.SideContentFallDown
import typings.openui5.sapUiWebcFioriLibraryMod.SideContentPosition
import typings.openui5.sapUiWebcFioriLibraryMod.SideContentVisibility
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiWebcFioriDynamicSideContentMod {
  
  @JSImport("sap/ui/webc/fiori/DynamicSideContent", JSImport.Default)
  @js.native
  /**
    * Constructor for a new `DynamicSideContent`.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
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
    
    @JSImport("sap/ui/webc/fiori/DynamicSideContent", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.webc.fiori.DynamicSideContent with name `sClassName` and enriches
      * it with the information contained in `oClassInfo`.
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
      * Returns a metadata object for class sap.ui.webc.fiori.DynamicSideContent.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiWebcCommonWebComponentMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiWebcCommonWebComponentMetadataMod.default]
  }
  
  @js.native
  trait DynamicSideContent
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
      * Adds some sideContent to the aggregation {@link #getSideContent sideContent}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addSideContent(
      /**
      * The sideContent to add; if empty, nothing is inserted
      */
    oSideContent: typings.openui5.sapUiCoreControlMod.default
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:layoutChange layoutChange} event of this `sap.ui.webc.fiori.DynamicSideContent`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.webc.fiori.DynamicSideContent` itself.
      *
      * Fires when the current breakpoint has been changed.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachLayoutChange(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ DynamicSideContentLayoutChangeEvent, Unit]
    ): this.type = js.native
    def attachLayoutChange(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ DynamicSideContentLayoutChangeEvent, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.webc.fiori.DynamicSideContent`
      * itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:layoutChange layoutChange} event of this `sap.ui.webc.fiori.DynamicSideContent`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.webc.fiori.DynamicSideContent` itself.
      *
      * Fires when the current breakpoint has been changed.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachLayoutChange(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ DynamicSideContentLayoutChangeEvent, Unit]
    ): this.type = js.native
    def attachLayoutChange(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ DynamicSideContentLayoutChangeEvent, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.webc.fiori.DynamicSideContent`
      * itself
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
      * Destroys all the sideContent in the aggregation {@link #getSideContent sideContent}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroySideContent(): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:layoutChange layoutChange} event of this `sap.ui.webc.fiori.DynamicSideContent`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachLayoutChange(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ DynamicSideContentLayoutChangeEvent, Unit]
    ): this.type = js.native
    def detachLayoutChange(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ DynamicSideContentLayoutChangeEvent, Unit],
      /**
      * Context object on which the given function had to be called
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Fires event {@link #event:layoutChange layoutChange} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireLayoutChange(): this.type = js.native
    def fireLayoutChange(
      /**
      * Parameters to pass along with the event
      */
    mParameters: DynamicSideContent$LayoutChangeEventParameters
    ): this.type = js.native
    
    /**
      * Gets content of aggregation {@link #getContent content}.
      *
      * Defines the main content.
      */
    def getContent(): js.Array[typings.openui5.sapUiCoreControlMod.default] = js.native
    
    /**
      * Gets current value of property {@link #getEqualSplit equalSplit}.
      *
      * Defines whether the component is in equal split mode. In this mode, the side and the main content take
      * 50:50 percent of the container on all screen sizes except for phone, where the main and side contents
      * are switching visibility using the toggle method.
      *
      * Default value is `false`.
      *
      * @returns Value of property `equalSplit`
      */
    def getEqualSplit(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getHideMainContent hideMainContent}.
      *
      * Defines the visibility of the main content.
      *
      * Default value is `false`.
      *
      * @returns Value of property `hideMainContent`
      */
    def getHideMainContent(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getHideSideContent hideSideContent}.
      *
      * Defines the visibility of the side content.
      *
      * Default value is `false`.
      *
      * @returns Value of property `hideSideContent`
      */
    def getHideSideContent(): Boolean = js.native
    
    /**
      * Gets content of aggregation {@link #getSideContent sideContent}.
      *
      * Defines the side content.
      */
    def getSideContent(): js.Array[typings.openui5.sapUiCoreControlMod.default] = js.native
    
    /**
      * Gets current value of property {@link #getSideContentFallDown sideContentFallDown}.
      *
      * Defines on which breakpoints the side content falls down below the main content.
      *
      *
      *
      *  **The available values are:**
      *
      *
      * 	 - `BelowXL`
      * 	 - `BelowL`
      * 	 - `BelowM`
      * 	 - `OnMinimumWidth`
      *
      * Default value is `OnMinimumWidth`.
      *
      * @returns Value of property `sideContentFallDown`
      */
    def getSideContentFallDown(): SideContentFallDown | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SideContentFallDown * / any */ String) = js.native
    
    /**
      * Gets current value of property {@link #getSideContentPosition sideContentPosition}.
      *
      * Defines whether the side content is positioned before the main content (left side in LTR mode), or after
      * the the main content (right side in LTR mode).
      *
      *
      *
      *  **The available values are:**
      *
      *
      * 	 - `Start`
      * 	 - `End`
      *
      * Default value is `End`.
      *
      * @returns Value of property `sideContentPosition`
      */
    def getSideContentPosition(): SideContentPosition | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SideContentPosition * / any */ String) = js.native
    
    /**
      * Gets current value of property {@link #getSideContentVisibility sideContentVisibility}.
      *
      * Defines on which breakpoints the side content is visible.
      *
      *
      *
      *  **The available values are:**
      *
      *
      * 	 - `AlwaysShow`
      * 	 - `ShowAboveL`
      * 	 - `ShowAboveM`
      * 	 - `ShowAboveS`
      * 	 - `NeverShow`
      *
      * Default value is `ShowAboveS`.
      *
      * @returns Value of property `sideContentVisibility`
      */
    def getSideContentVisibility(): SideContentVisibility | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SideContentVisibility * / any */ String) = js.native
    
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
      * Removes all the controls from the aggregation {@link #getContent content}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllContent(): js.Array[typings.openui5.sapUiCoreControlMod.default] = js.native
    
    /**
      * Removes all the controls from the aggregation {@link #getSideContent sideContent}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllSideContent(): js.Array[typings.openui5.sapUiCoreControlMod.default] = js.native
    
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
      * Sets a new value for property {@link #getEqualSplit equalSplit}.
      *
      * Defines whether the component is in equal split mode. In this mode, the side and the main content take
      * 50:50 percent of the container on all screen sizes except for phone, where the main and side contents
      * are switching visibility using the toggle method.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setEqualSplit(): this.type = js.native
    def setEqualSplit(/**
      * New value for property `equalSplit`
      */
    bEqualSplit: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getHideMainContent hideMainContent}.
      *
      * Defines the visibility of the main content.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setHideMainContent(): this.type = js.native
    def setHideMainContent(/**
      * New value for property `hideMainContent`
      */
    bHideMainContent: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getHideSideContent hideSideContent}.
      *
      * Defines the visibility of the side content.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setHideSideContent(): this.type = js.native
    def setHideSideContent(/**
      * New value for property `hideSideContent`
      */
    bHideSideContent: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getSideContentFallDown sideContentFallDown}.
      *
      * Defines on which breakpoints the side content falls down below the main content.
      *
      *
      *
      *  **The available values are:**
      *
      *
      * 	 - `BelowXL`
      * 	 - `BelowL`
      * 	 - `BelowM`
      * 	 - `OnMinimumWidth`
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
      * Sets a new value for property {@link #getSideContentPosition sideContentPosition}.
      *
      * Defines whether the side content is positioned before the main content (left side in LTR mode), or after
      * the the main content (right side in LTR mode).
      *
      *
      *
      *  **The available values are:**
      *
      *
      * 	 - `Start`
      * 	 - `End`
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
    
    /**
      * Sets a new value for property {@link #getSideContentVisibility sideContentVisibility}.
      *
      * Defines on which breakpoints the side content is visible.
      *
      *
      *
      *  **The available values are:**
      *
      *
      * 	 - `AlwaysShow`
      * 	 - `ShowAboveL`
      * 	 - `ShowAboveM`
      * 	 - `ShowAboveS`
      * 	 - `NeverShow`
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `ShowAboveS`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setSideContentVisibility(): this.type = js.native
    def setSideContentVisibility(
      /**
      * New value for property `sideContentVisibility`
      */
    sSideContentVisibility: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SideContentVisibility * / any */ String
    ): this.type = js.native
    def setSideContentVisibility(
      /**
      * New value for property `sideContentVisibility`
      */
    sSideContentVisibility: SideContentVisibility
    ): this.type = js.native
    
    /**
      * Toggles visibility of main and side contents on S screen size (mobile device).
      */
    def toggleContents(): Unit = js.native
  }
  
  trait DynamicSideContent$LayoutChangeEventParameters extends StObject {
    
    /**
      * the current breakpoint.
      */
    var currentBreakpoint: js.UndefOr[String] = js.undefined
    
    /**
      * visibility of the main content.
      */
    var mainContentVisible: js.UndefOr[Boolean] = js.undefined
    
    /**
      * the breakpoint that was active before change to current breakpoint.
      */
    var previousBreakpoint: js.UndefOr[String] = js.undefined
    
    /**
      * visibility of the side content.
      */
    var sideContentVisible: js.UndefOr[Boolean] = js.undefined
  }
  object DynamicSideContent$LayoutChangeEventParameters {
    
    inline def apply(): DynamicSideContent$LayoutChangeEventParameters = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DynamicSideContent$LayoutChangeEventParameters]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DynamicSideContent$LayoutChangeEventParameters] (val x: Self) extends AnyVal {
      
      inline def setCurrentBreakpoint(value: String): Self = StObject.set(x, "currentBreakpoint", value.asInstanceOf[js.Any])
      
      inline def setCurrentBreakpointUndefined: Self = StObject.set(x, "currentBreakpoint", js.undefined)
      
      inline def setMainContentVisible(value: Boolean): Self = StObject.set(x, "mainContentVisible", value.asInstanceOf[js.Any])
      
      inline def setMainContentVisibleUndefined: Self = StObject.set(x, "mainContentVisible", js.undefined)
      
      inline def setPreviousBreakpoint(value: String): Self = StObject.set(x, "previousBreakpoint", value.asInstanceOf[js.Any])
      
      inline def setPreviousBreakpointUndefined: Self = StObject.set(x, "previousBreakpoint", js.undefined)
      
      inline def setSideContentVisible(value: Boolean): Self = StObject.set(x, "sideContentVisible", value.asInstanceOf[js.Any])
      
      inline def setSideContentVisibleUndefined: Self = StObject.set(x, "sideContentVisible", js.undefined)
    }
  }
  
  type DynamicSideContentLayoutChangeEvent = typings.openui5.sapUiBaseEventMod.default[DynamicSideContent$LayoutChangeEventParameters]
  
  type DynamicSideContentLayoutChangeEventParameters = DynamicSideContent$LayoutChangeEventParameters
  
  trait DynamicSideContentSettings
    extends StObject
       with ControlSettings {
    
    /**
      * Defines the main content.
      */
    var content: js.UndefOr[
        js.Array[typings.openui5.sapUiCoreControlMod.default] | typings.openui5.sapUiCoreControlMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Defines whether the component is in equal split mode. In this mode, the side and the main content take
      * 50:50 percent of the container on all screen sizes except for phone, where the main and side contents
      * are switching visibility using the toggle method.
      */
    var equalSplit: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Defines the visibility of the main content.
      */
    var hideMainContent: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Defines the visibility of the side content.
      */
    var hideSideContent: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Fires when the current breakpoint has been changed.
      */
    var layoutChange: js.UndefOr[
        js.Function1[
          /* oEvent */ typings.openui5.sapUiBaseEventMod.default[DynamicSideContent$LayoutChangeEventParameters], 
          Unit
        ]
      ] = js.undefined
    
    /**
      * Defines the side content.
      */
    var sideContent: js.UndefOr[
        js.Array[typings.openui5.sapUiCoreControlMod.default] | typings.openui5.sapUiCoreControlMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Defines on which breakpoints the side content falls down below the main content.
      *
      *
      *
      *  **The available values are:**
      *
      *
      * 	 - `BelowXL`
      * 	 - `BelowL`
      * 	 - `BelowM`
      * 	 - `OnMinimumWidth`
      */
    var sideContentFallDown: js.UndefOr[
        SideContentFallDown | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SideContentFallDown * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * Defines whether the side content is positioned before the main content (left side in LTR mode), or after
      * the the main content (right side in LTR mode).
      *
      *
      *
      *  **The available values are:**
      *
      *
      * 	 - `Start`
      * 	 - `End`
      */
    var sideContentPosition: js.UndefOr[
        SideContentPosition | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SideContentPosition * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * Defines on which breakpoints the side content is visible.
      *
      *
      *
      *  **The available values are:**
      *
      *
      * 	 - `AlwaysShow`
      * 	 - `ShowAboveL`
      * 	 - `ShowAboveM`
      * 	 - `ShowAboveS`
      * 	 - `NeverShow`
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DynamicSideContentSettings] (val x: Self) extends AnyVal {
      
      inline def setContent(
        value: js.Array[typings.openui5.sapUiCoreControlMod.default] | typings.openui5.sapUiCoreControlMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setContentVarargs(value: typings.openui5.sapUiCoreControlMod.default*): Self = StObject.set(x, "content", js.Array(value*))
      
      inline def setEqualSplit(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "equalSplit", value.asInstanceOf[js.Any])
      
      inline def setEqualSplitUndefined: Self = StObject.set(x, "equalSplit", js.undefined)
      
      inline def setHideMainContent(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "hideMainContent", value.asInstanceOf[js.Any])
      
      inline def setHideMainContentUndefined: Self = StObject.set(x, "hideMainContent", js.undefined)
      
      inline def setHideSideContent(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "hideSideContent", value.asInstanceOf[js.Any])
      
      inline def setHideSideContentUndefined: Self = StObject.set(x, "hideSideContent", js.undefined)
      
      inline def setLayoutChange(
        value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default[DynamicSideContent$LayoutChangeEventParameters] => Unit
      ): Self = StObject.set(x, "layoutChange", js.Any.fromFunction1(value))
      
      inline def setLayoutChangeUndefined: Self = StObject.set(x, "layoutChange", js.undefined)
      
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
