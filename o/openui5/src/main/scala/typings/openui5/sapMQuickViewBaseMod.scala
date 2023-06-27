package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.AggregationBindingInfo
import typings.openui5.sapUiCoreControlMod.ControlSettings
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapMQuickViewBaseMod {
  
  @JSImport("sap/m/QuickViewBase", JSImport.Default)
  @js.native
  /**
    * Constructor for a new QuickViewBase.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends QuickViewBase {
    def this(/**
      * Initial settings for the new control
      */
    mSettings: QuickViewBaseSettings) = this()
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
    mSettings: QuickViewBaseSettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new control
      */
    mSettings: QuickViewBaseSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/m/QuickViewBase", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.m.QuickViewBase with name `sClassName` and enriches it with the information
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
    oClassInfo: ClassInfo[T, QuickViewBase]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, QuickViewBase],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.m.QuickViewBase.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait QuickViewBase
    extends typings.openui5.sapUiCoreControlMod.default {
    
    /**
      * Adds some page to the aggregation {@link #getPages pages}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addPage(
      /**
      * The page to add; if empty, nothing is inserted
      */
    oPage: typings.openui5.sapMQuickViewPageMod.default
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:afterNavigate afterNavigate} event of this `sap.m.QuickViewBase`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.QuickViewBase` itself.
      *
      * The event is fired when navigation between two pages has completed. In case of animated transitions this
      * event is fired with some delay after the "navigate" event.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachAfterNavigate(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ QuickViewBaseAfterNavigateEvent, Unit]
    ): this.type = js.native
    def attachAfterNavigate(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ QuickViewBaseAfterNavigateEvent, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.QuickViewBase` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:afterNavigate afterNavigate} event of this `sap.m.QuickViewBase`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.QuickViewBase` itself.
      *
      * The event is fired when navigation between two pages has completed. In case of animated transitions this
      * event is fired with some delay after the "navigate" event.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachAfterNavigate(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ QuickViewBaseAfterNavigateEvent, Unit]
    ): this.type = js.native
    def attachAfterNavigate(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ QuickViewBaseAfterNavigateEvent, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.QuickViewBase` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:navigate navigate} event of this `sap.m.QuickViewBase`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.QuickViewBase` itself.
      *
      * The event is fired when navigation between two pages has been triggered. The transition (if any) to the
      * new page has not started yet.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachNavigate(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ QuickViewBaseNavigateEvent, Unit]
    ): this.type = js.native
    def attachNavigate(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ QuickViewBaseNavigateEvent, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.QuickViewBase` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:navigate navigate} event of this `sap.m.QuickViewBase`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.QuickViewBase` itself.
      *
      * The event is fired when navigation between two pages has been triggered. The transition (if any) to the
      * new page has not started yet.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachNavigate(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ QuickViewBaseNavigateEvent, Unit]
    ): this.type = js.native
    def attachNavigate(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ QuickViewBaseNavigateEvent, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.QuickViewBase` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Binds aggregation {@link #getPages pages} to model data.
      *
      * See {@link sap.ui.base.ManagedObject#bindAggregation ManagedObject.bindAggregation} for a detailed description
      * of the possible properties of `oBindingInfo`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def bindPages(/**
      * The binding information
      */
    oBindingInfo: AggregationBindingInfo): this.type = js.native
    
    /**
      * Destroys all the pages in the aggregation {@link #getPages pages}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyPages(): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:afterNavigate afterNavigate} event of this
      * `sap.m.QuickViewBase`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachAfterNavigate(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ QuickViewBaseAfterNavigateEvent, Unit]
    ): this.type = js.native
    def detachAfterNavigate(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ QuickViewBaseAfterNavigateEvent, Unit],
      /**
      * Context object on which the given function had to be called
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:navigate navigate} event of this `sap.m.QuickViewBase`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachNavigate(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ QuickViewBaseNavigateEvent, Unit]
    ): this.type = js.native
    def detachNavigate(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ QuickViewBaseNavigateEvent, Unit],
      /**
      * Context object on which the given function had to be called
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Fires event {@link #event:afterNavigate afterNavigate} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireAfterNavigate(): this.type = js.native
    def fireAfterNavigate(
      /**
      * Parameters to pass along with the event
      */
    mParameters: QuickViewBase$AfterNavigateEventParameters
    ): this.type = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Fires event {@link #event:navigate navigate} to attached listeners.
      *
      * Listeners may prevent the default action of this event by calling the `preventDefault` method on the
      * event object. The return value of this method indicates whether the default action should be executed.
      *
      * @returns Whether or not to prevent the default action
      */
    def fireNavigate(): Boolean = js.native
    def fireNavigate(
      /**
      * Parameters to pass along with the event
      */
    mParameters: QuickViewBase$NavigateEventParameters
    ): Boolean = js.native
    
    /**
      * Gets content of aggregation {@link #getPages pages}.
      *
      * Displays a page header, object icon or image, object name with short description, and object information
      * divided in groups
      */
    def getPages(): js.Array[typings.openui5.sapMQuickViewPageMod.default] = js.native
    
    /**
      * Checks for the provided `sap.m.QuickViewPage` in the aggregation {@link #getPages pages}. and returns
      * its index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfPage(
      /**
      * The page whose index is looked for
      */
    oPage: typings.openui5.sapMQuickViewPageMod.default
    ): int = js.native
    
    /**
      * Inserts a page into the aggregation {@link #getPages pages}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def insertPage(
      /**
      * The page to insert; if empty, nothing is inserted
      */
    oPage: typings.openui5.sapMQuickViewPageMod.default,
      /**
      * The `0`-based index the page should be inserted at; for a negative value of `iIndex`, the page is inserted
      * at position 0; for a value greater than the current size of the aggregation, the page is inserted at
      * the last position
      */
    iIndex: int
    ): this.type = js.native
    
    /**
      * Navigates to the previous page if there is such.
      */
    def navigateBack(): Unit = js.native
    
    /**
      * Removes all the controls from the aggregation {@link #getPages pages}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllPages(): js.Array[typings.openui5.sapMQuickViewPageMod.default] = js.native
    
    def removePage(/**
      * The page to remove or its index or id
      */
    vPage: String): typings.openui5.sapMQuickViewPageMod.default | Null = js.native
    /**
      * Removes a page from the aggregation {@link #getPages pages}.
      *
      * @returns The removed page or `null`
      */
    def removePage(/**
      * The page to remove or its index or id
      */
    vPage: int): typings.openui5.sapMQuickViewPageMod.default | Null = js.native
    def removePage(
      /**
      * The page to remove or its index or id
      */
    vPage: typings.openui5.sapMQuickViewPageMod.default
    ): typings.openui5.sapMQuickViewPageMod.default | Null = js.native
    
    /**
      * Unbinds aggregation {@link #getPages pages} from model data.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def unbindPages(): this.type = js.native
  }
  
  trait QuickViewBase$AfterNavigateEventParameters extends StObject {
    
    /**
      * Determines how the navigation was triggered, possible values are "to", "back", "backToPage", and "backToTop".
      */
    var direction: js.UndefOr[String] = js.undefined
    
    /**
      * Determines whether the "to" page (a control with the ID of the page, which has been navigated to) has
      * not been displayed/navigated to before.
      */
    var firstTime: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Determines the page, which has been displayed before navigation.
      */
    var from: js.UndefOr[typings.openui5.sapUiCoreControlMod.default] = js.undefined
    
    /**
      * Determines the ID of the page, which has been displayed before navigation.
      */
    var fromId: js.UndefOr[String] = js.undefined
    
    /**
      * Determines whether this was a back navigation.
      */
    var isBack: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Determines whether this was a navigation to a specific page.
      */
    var isBackToPage: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Determines whether this was a navigation to the root page.
      */
    var isBackToTop: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Determines whether this was a forward navigation.
      */
    var isTo: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Determines whether this is a navigation to the top page.
      */
    var isTopPage: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Determines which link initiated the navigation.
      */
    var navOrigin: js.UndefOr[typings.openui5.sapUiCoreControlMod.default] = js.undefined
    
    /**
      * Determines the page, which is now displayed after navigation.
      */
    var to: js.UndefOr[typings.openui5.sapUiCoreControlMod.default] = js.undefined
    
    /**
      * Determines the ID of the page, which is now displayed after navigation.
      */
    var toId: js.UndefOr[String] = js.undefined
  }
  object QuickViewBase$AfterNavigateEventParameters {
    
    inline def apply(): QuickViewBase$AfterNavigateEventParameters = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[QuickViewBase$AfterNavigateEventParameters]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: QuickViewBase$AfterNavigateEventParameters] (val x: Self) extends AnyVal {
      
      inline def setDirection(value: String): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      inline def setFirstTime(value: Boolean): Self = StObject.set(x, "firstTime", value.asInstanceOf[js.Any])
      
      inline def setFirstTimeUndefined: Self = StObject.set(x, "firstTime", js.undefined)
      
      inline def setFrom(value: typings.openui5.sapUiCoreControlMod.default): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setFromId(value: String): Self = StObject.set(x, "fromId", value.asInstanceOf[js.Any])
      
      inline def setFromIdUndefined: Self = StObject.set(x, "fromId", js.undefined)
      
      inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
      
      inline def setIsBack(value: Boolean): Self = StObject.set(x, "isBack", value.asInstanceOf[js.Any])
      
      inline def setIsBackToPage(value: Boolean): Self = StObject.set(x, "isBackToPage", value.asInstanceOf[js.Any])
      
      inline def setIsBackToPageUndefined: Self = StObject.set(x, "isBackToPage", js.undefined)
      
      inline def setIsBackToTop(value: Boolean): Self = StObject.set(x, "isBackToTop", value.asInstanceOf[js.Any])
      
      inline def setIsBackToTopUndefined: Self = StObject.set(x, "isBackToTop", js.undefined)
      
      inline def setIsBackUndefined: Self = StObject.set(x, "isBack", js.undefined)
      
      inline def setIsTo(value: Boolean): Self = StObject.set(x, "isTo", value.asInstanceOf[js.Any])
      
      inline def setIsToUndefined: Self = StObject.set(x, "isTo", js.undefined)
      
      inline def setIsTopPage(value: Boolean): Self = StObject.set(x, "isTopPage", value.asInstanceOf[js.Any])
      
      inline def setIsTopPageUndefined: Self = StObject.set(x, "isTopPage", js.undefined)
      
      inline def setNavOrigin(value: typings.openui5.sapUiCoreControlMod.default): Self = StObject.set(x, "navOrigin", value.asInstanceOf[js.Any])
      
      inline def setNavOriginUndefined: Self = StObject.set(x, "navOrigin", js.undefined)
      
      inline def setTo(value: typings.openui5.sapUiCoreControlMod.default): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      
      inline def setToId(value: String): Self = StObject.set(x, "toId", value.asInstanceOf[js.Any])
      
      inline def setToIdUndefined: Self = StObject.set(x, "toId", js.undefined)
      
      inline def setToUndefined: Self = StObject.set(x, "to", js.undefined)
    }
  }
  
  trait QuickViewBase$NavigateEventParameters extends StObject {
    
    /**
      * Determines how the navigation was triggered, possible values are "to", "back", "backToPage", and "backToTop".
      */
    var direction: js.UndefOr[String] = js.undefined
    
    /**
      * Determines whether the "to" page (a control with the ID of the page which is currently navigated to)
      * has not been displayed/navigated to before.
      */
    var firstTime: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The page which was displayed before the current navigation.
      */
    var from: js.UndefOr[typings.openui5.sapUiCoreControlMod.default] = js.undefined
    
    /**
      * The ID of the page which was displayed before the current navigation.
      */
    var fromId: js.UndefOr[String] = js.undefined
    
    /**
      * Determines whether this is a back navigation.
      */
    var isBack: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Determines whether this was a navigation to a specific page.
      */
    var isBackToPage: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Determines whether this is a navigation to the root page.
      */
    var isBackToTop: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Determines whether this is a forward navigation.
      */
    var isTo: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Determines which link initiated the navigation.
      */
    var navOrigin: js.UndefOr[typings.openui5.sapUiCoreControlMod.default] = js.undefined
    
    /**
      * The page which will be displayed after the current navigation.
      */
    var to: js.UndefOr[typings.openui5.sapUiCoreControlMod.default] = js.undefined
    
    /**
      * The ID of the page which will be displayed after the current navigation.
      */
    var toId: js.UndefOr[String] = js.undefined
  }
  object QuickViewBase$NavigateEventParameters {
    
    inline def apply(): QuickViewBase$NavigateEventParameters = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[QuickViewBase$NavigateEventParameters]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: QuickViewBase$NavigateEventParameters] (val x: Self) extends AnyVal {
      
      inline def setDirection(value: String): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      inline def setFirstTime(value: Boolean): Self = StObject.set(x, "firstTime", value.asInstanceOf[js.Any])
      
      inline def setFirstTimeUndefined: Self = StObject.set(x, "firstTime", js.undefined)
      
      inline def setFrom(value: typings.openui5.sapUiCoreControlMod.default): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setFromId(value: String): Self = StObject.set(x, "fromId", value.asInstanceOf[js.Any])
      
      inline def setFromIdUndefined: Self = StObject.set(x, "fromId", js.undefined)
      
      inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
      
      inline def setIsBack(value: Boolean): Self = StObject.set(x, "isBack", value.asInstanceOf[js.Any])
      
      inline def setIsBackToPage(value: Boolean): Self = StObject.set(x, "isBackToPage", value.asInstanceOf[js.Any])
      
      inline def setIsBackToPageUndefined: Self = StObject.set(x, "isBackToPage", js.undefined)
      
      inline def setIsBackToTop(value: Boolean): Self = StObject.set(x, "isBackToTop", value.asInstanceOf[js.Any])
      
      inline def setIsBackToTopUndefined: Self = StObject.set(x, "isBackToTop", js.undefined)
      
      inline def setIsBackUndefined: Self = StObject.set(x, "isBack", js.undefined)
      
      inline def setIsTo(value: Boolean): Self = StObject.set(x, "isTo", value.asInstanceOf[js.Any])
      
      inline def setIsToUndefined: Self = StObject.set(x, "isTo", js.undefined)
      
      inline def setNavOrigin(value: typings.openui5.sapUiCoreControlMod.default): Self = StObject.set(x, "navOrigin", value.asInstanceOf[js.Any])
      
      inline def setNavOriginUndefined: Self = StObject.set(x, "navOrigin", js.undefined)
      
      inline def setTo(value: typings.openui5.sapUiCoreControlMod.default): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      
      inline def setToId(value: String): Self = StObject.set(x, "toId", value.asInstanceOf[js.Any])
      
      inline def setToIdUndefined: Self = StObject.set(x, "toId", js.undefined)
      
      inline def setToUndefined: Self = StObject.set(x, "to", js.undefined)
    }
  }
  
  type QuickViewBaseAfterNavigateEvent = typings.openui5.sapUiBaseEventMod.default[QuickViewBase$AfterNavigateEventParameters]
  
  type QuickViewBaseAfterNavigateEventParameters = QuickViewBase$AfterNavigateEventParameters
  
  type QuickViewBaseNavigateEvent = typings.openui5.sapUiBaseEventMod.default[QuickViewBase$NavigateEventParameters]
  
  type QuickViewBaseNavigateEventParameters = QuickViewBase$NavigateEventParameters
  
  trait QuickViewBaseSettings
    extends StObject
       with ControlSettings {
    
    /**
      * The event is fired when navigation between two pages has completed. In case of animated transitions this
      * event is fired with some delay after the "navigate" event.
      */
    var afterNavigate: js.UndefOr[
        js.Function1[
          /* oEvent */ typings.openui5.sapUiBaseEventMod.default[QuickViewBase$AfterNavigateEventParameters], 
          Unit
        ]
      ] = js.undefined
    
    /**
      * The event is fired when navigation between two pages has been triggered. The transition (if any) to the
      * new page has not started yet.
      */
    var navigate: js.UndefOr[
        js.Function1[
          /* oEvent */ typings.openui5.sapUiBaseEventMod.default[QuickViewBase$NavigateEventParameters], 
          Unit
        ]
      ] = js.undefined
    
    /**
      * Displays a page header, object icon or image, object name with short description, and object information
      * divided in groups
      */
    var pages: js.UndefOr[
        js.Array[typings.openui5.sapMQuickViewPageMod.default] | typings.openui5.sapMQuickViewPageMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
  }
  object QuickViewBaseSettings {
    
    inline def apply(): QuickViewBaseSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[QuickViewBaseSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: QuickViewBaseSettings] (val x: Self) extends AnyVal {
      
      inline def setAfterNavigate(
        value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default[QuickViewBase$AfterNavigateEventParameters] => Unit
      ): Self = StObject.set(x, "afterNavigate", js.Any.fromFunction1(value))
      
      inline def setAfterNavigateUndefined: Self = StObject.set(x, "afterNavigate", js.undefined)
      
      inline def setNavigate(
        value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default[QuickViewBase$NavigateEventParameters] => Unit
      ): Self = StObject.set(x, "navigate", js.Any.fromFunction1(value))
      
      inline def setNavigateUndefined: Self = StObject.set(x, "navigate", js.undefined)
      
      inline def setPages(
        value: js.Array[typings.openui5.sapMQuickViewPageMod.default] | typings.openui5.sapMQuickViewPageMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "pages", value.asInstanceOf[js.Any])
      
      inline def setPagesUndefined: Self = StObject.set(x, "pages", js.undefined)
      
      inline def setPagesVarargs(value: typings.openui5.sapMQuickViewPageMod.default*): Self = StObject.set(x, "pages", js.Array(value*))
    }
  }
}
