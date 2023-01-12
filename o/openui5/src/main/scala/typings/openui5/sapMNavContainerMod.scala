package typings.openui5

import typings.openui5.anon.Direction
import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.AggregationBindingInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreControlMod.ControlSettings
import typings.openui5.sapUiCoreLibraryMod.CSSSize
import typings.openui5.sapUiCoreLibraryMod.ID
import typings.openui5.sapUiCoreLibraryMod.IPlaceholderSupport
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapMNavContainerMod {
  
  @JSImport("sap/m/NavContainer", JSImport.Default)
  @js.native
  /**
    * Constructor for a new `NavContainer`.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    * See:
    * 	{@link topic:a4afb138acf64a61a038aa5b91a4f082 Nav Container}
    */
  open class default () extends NavContainer {
    def this(/**
      * Initial settings for the new control
      */
    mSettings: NavContainerSettings) = this()
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
    mSettings: NavContainerSettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new control
      */
    mSettings: NavContainerSettings
    ) = this()
    
    /* CompleteClass */
    var __implements__sap_ui_core_IPlaceholderSupport: Boolean = js.native
  }
  /* static members */
  object default {
    
    @JSImport("sap/m/NavContainer", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.m.NavContainer with name `sClassName` and enriches it with the information
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
    oClassInfo: ClassInfo[T, NavContainer]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, NavContainer],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.m.NavContainer.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait NavContainer
    extends typings.openui5.sapUiCoreControlMod.default
       with IPlaceholderSupport {
    
    /**
      * Adds a custom transition to the NavContainer type (not to a particular instance!). The transition is
      * identified by a "name". Make sure to only use names that will not collide with transitions which may
      * be added to the NavContainer later. A suggestion is to use the prefix "c_" or "_" for your custom transitions
      * to ensure this.
      *
      * "to" and "back" are the transition functions for the forward and backward navigation. Both will be called
      * with the following parameters: - oFromPage: the Control which is currently being displayed by the NavContainer
      * - oToPage: the Control which should be displayed by the NavContainer after the transition - fCallback:
      * a function which MUST be called when the transition has completed - oTransitionParameters: a data object
      * that can be given by application code when triggering the transition by calling to() or back(); this
      * object could give additional information to the transition function, like the DOM element which triggered
      * the transition or the desired transition duration
      *
      * The contract for "to" and "back" is that they may do an animation of their choice, but it should not
      * take "too long". At the beginning of the transition the target page "oToPage" does have the CSS class
      * "sapMNavItemHidden" which initially hides the target page (visibility:hidden). The transition can do
      * any preparation (e.g. move that page out of the screen or make it transparent) and then should remove
      * this CSS class. After the animation the target page "oToPage" should cover the entire screen and the
      * source page "oFromPage" should not be visible anymore. This page should then have the CSS class "sapMNavItemHidden".
      * For adding/removing this or other CSS classes, the transition can use the addStyleClass/removeStyleClass
      * method: oFromPage.addStyleClass("sapMNavItemHidden"); When the transition is complete, it MUST call the
      * given fCallback method to inform the NavContainer that navigation has finished!
      *
      * Hint: if the target page of your transition stays black on iPhone, try wrapping the animation start into
      * a setTimeout(..., 0) block (delayed, but without waiting).
      *
      * This method can be called on any NavContainer instance or statically on the sap.m.NavContainer type.
      * However, the transition will always be registered for the type (and ALL instances), not for the single
      * instance on which this method was invoked.
      *
      * Returns the sap.m.NavContainer type if called statically, or "this" (to allow method chaining) if called
      * on a particular NavContainer instance.
      *
      * @returns The `sap.m.NavContainer` instance
      */
    def addCustomTransition(
      /**
      * The name of the transition. This name can be used by the application to choose this transition when navigating
      * "to()" or "back()": the "transitionName" parameter of "NavContainer.to()" corresponds to this name, the
      * back() navigation will automatically use the same transition.
      *
      * Make sure to only use names that will not collide with transitions which may be added to the NavContainer
      * later. A suggestion is to use the prefix "c_" or "_" for your custom transitions to ensure this.
      */
    sName: String,
      /**
      * The function which will be called by the NavContainer when the application navigates "to()", using this
      * animation's name. The NavContainer instance is the "this" context within the animation function.
      *
      * See the documentation of NavContainer.addCustomTransitions for more details about this function.
      */
    fTo: js.Object,
      /**
      * The function which will be called by the NavContainer when the application navigates "back()" from a
      * page where it had navigated to using this animation's name. The NavContainer instance is the "this" context
      * within the animation function.
      *
      * See the documentation of NavContainer.addCustomTransitions for more details about this function.
      */
    fBack: js.Object
    ): this.type = js.native
    
    /**
      * Adds some page to the aggregation {@link #getPages pages}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addPage(
      /**
      * The page to add; if empty, nothing is inserted
      */
    oPage: typings.openui5.sapUiCoreControlMod.default
    ): this.type = js.native
    
    /**
      * @SINCE 1.7.1
      *
      * Attaches event handler `fnFunction` to the {@link #event:afterNavigate afterNavigate} event of this `sap.m.NavContainer`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.NavContainer` itself.
      *
      * The event is fired when navigation between two pages has completed (once all events to the child controls
      * have been fired). In case of animated transitions this event is fired with some delay after the "navigate"
      * event.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachAfterNavigate(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachAfterNavigate(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.NavContainer` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * @SINCE 1.7.1
      *
      * Attaches event handler `fnFunction` to the {@link #event:afterNavigate afterNavigate} event of this `sap.m.NavContainer`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.NavContainer` itself.
      *
      * The event is fired when navigation between two pages has completed (once all events to the child controls
      * have been fired). In case of animated transitions this event is fired with some delay after the "navigate"
      * event.
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
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
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
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.NavContainer` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * @SINCE 1.7.1
      *
      * Attaches event handler `fnFunction` to the {@link #event:navigate navigate} event of this `sap.m.NavContainer`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.NavContainer` itself.
      *
      * The event is fired when navigation between two pages has been triggered (before any events to the child
      * controls are fired). The transition (if any) to the new page has not started yet. This event can be aborted
      * by the application with preventDefault(), which means that there will be no navigation.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachNavigate(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachNavigate(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.NavContainer` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * @SINCE 1.7.1
      *
      * Attaches event handler `fnFunction` to the {@link #event:navigate navigate} event of this `sap.m.NavContainer`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.NavContainer` itself.
      *
      * The event is fired when navigation between two pages has been triggered (before any events to the child
      * controls are fired). The transition (if any) to the new page has not started yet. This event can be aborted
      * by the application with preventDefault(), which means that there will be no navigation.
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
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
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
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.NavContainer` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Navigates back one level. If already on the initial page and there is no place to go back, nothing happens.
      *
      * Calling this navigation method triggers first the (cancelable) "navigate" event on the NavContainer,
      * then the "BeforeHide" pseudo event on the source page and "BeforeFirstShow" (if applicable) and"BeforeShow"
      * on the target page. Later - after the transition has completed - the "AfterShow" pseudo event is triggered
      * on the target page and "AfterHide" on the page which has been left. The given backData object is available
      * in the "BeforeFirstShow", "BeforeShow" and "AfterShow" event object as "data" property. The original
      * "data" object from the "to" navigation is also available in these event objects.
      *
      * @returns The `sap.m.NavContainer` instance
      */
    def back(): this.type = js.native
    def back(
      /**
      * Since version 1.7.1. This optional object can carry any payload data which should be made available to
      * the target page of the back navigation. The event on the target page will contain this data object as
      * "backData" property. (The original data from the "to()" navigation will still be available as "data"
      * property.)
      *
      * In scenarios where the entity triggering the navigation can or should not directly initialize the target
      * page, it can fill this object and the target page itself (or a listener on it) can take over the initialization,
      * using the given data. For back navigation this can be used e.g. when returning from a detail page to
      * transfer any settings done there.
      *
      * When the `oTransitionParameters` parameter is used, this `backData` parameter must also be given (either
      * as object or as `null` or `undefined`) in order to have a proper parameter order.
      */
    backData: js.Object
    ): this.type = js.native
    def back(
      /**
      * Since version 1.7.1. This optional object can carry any payload data which should be made available to
      * the target page of the back navigation. The event on the target page will contain this data object as
      * "backData" property. (The original data from the "to()" navigation will still be available as "data"
      * property.)
      *
      * In scenarios where the entity triggering the navigation can or should not directly initialize the target
      * page, it can fill this object and the target page itself (or a listener on it) can take over the initialization,
      * using the given data. For back navigation this can be used e.g. when returning from a detail page to
      * transfer any settings done there.
      *
      * When the `oTransitionParameters` parameter is used, this `backData` parameter must also be given (either
      * as object or as `null` or `undefined`) in order to have a proper parameter order.
      */
    backData: js.Object,
      /**
      * Since version 1.7.1. This optional object can give additional information to the transition function,
      * like the DOM element which triggered the transition or the desired transition duration. The animation
      * type can NOT be selected here - it is always the inverse of the "to" navigation.
      *
      * In order to use the `oTransitionParameters parameter, the backData` parameter must be used
      * (at least `null` or `undefined` must be given) for a proper parameter order.
      *
      * NOTE: it depends on the transition function how the object should be structured and which parameters
      * are actually used to influence the transition.
      */
    oTransitionParameters: js.Object
    ): this.type = js.native
    def back(
      /**
      * Since version 1.7.1. This optional object can carry any payload data which should be made available to
      * the target page of the back navigation. The event on the target page will contain this data object as
      * "backData" property. (The original data from the "to()" navigation will still be available as "data"
      * property.)
      *
      * In scenarios where the entity triggering the navigation can or should not directly initialize the target
      * page, it can fill this object and the target page itself (or a listener on it) can take over the initialization,
      * using the given data. For back navigation this can be used e.g. when returning from a detail page to
      * transfer any settings done there.
      *
      * When the `oTransitionParameters` parameter is used, this `backData` parameter must also be given (either
      * as object or as `null` or `undefined`) in order to have a proper parameter order.
      */
    backData: Unit,
      /**
      * Since version 1.7.1. This optional object can give additional information to the transition function,
      * like the DOM element which triggered the transition or the desired transition duration. The animation
      * type can NOT be selected here - it is always the inverse of the "to" navigation.
      *
      * In order to use the `oTransitionParameters parameter, the backData` parameter must be used
      * (at least `null` or `undefined` must be given) for a proper parameter order.
      *
      * NOTE: it depends on the transition function how the object should be structured and which parameters
      * are actually used to influence the transition.
      */
    oTransitionParameters: js.Object
    ): this.type = js.native
    
    /**
      * @SINCE 1.7.2
      *
      * Navigates back to the nearest previous page in the NavContainer history with the given ID. If there is
      * no such page among the previous pages, nothing happens. The transition effect which had been used to
      * get to the current page is inverted and used for this navigation.
      *
      * Calling this navigation method triggers first the (cancelable) "navigate" event on the NavContainer,
      * then the "BeforeHide" pseudo event on the source page and "BeforeFirstShow" (if applicable) and"BeforeShow"
      * on the target page. Later - after the transition has completed - the "AfterShow" pseudo event is triggered
      * on the target page and "AfterHide" on the page which has been left. The given backData object is available
      * in the "BeforeFirstShow", "BeforeShow" and "AfterShow" event object as "data" property. The original
      * "data" object from the "to" navigation is also available in these event objects.
      *
      * @returns The `sap.m.NavContainer` instance
      */
    def backToPage(
      /**
      * The ID of the screen to which back navigation should happen. The ID or the control itself can be given.
      * The nearest such page among the previous pages in the history stack will be used.
      */
    pageId: String
    ): this.type = js.native
    def backToPage(
      /**
      * The ID of the screen to which back navigation should happen. The ID or the control itself can be given.
      * The nearest such page among the previous pages in the history stack will be used.
      */
    pageId: String,
      /**
      * This optional object can carry any payload data which should be made available to the target page of
      * the "backToPage" navigation. The event on the target page will contain this data object as "backData"
      * property.
      *
      * When the `oTransitionParameters` parameter is used, this `backData` parameter must also be given (either
      * as object or as `null` or `undefined`) in order to have a proper parameter order.
      */
    backData: js.Object
    ): this.type = js.native
    def backToPage(
      /**
      * The ID of the screen to which back navigation should happen. The ID or the control itself can be given.
      * The nearest such page among the previous pages in the history stack will be used.
      */
    pageId: String,
      /**
      * This optional object can carry any payload data which should be made available to the target page of
      * the "backToPage" navigation. The event on the target page will contain this data object as "backData"
      * property.
      *
      * When the `oTransitionParameters` parameter is used, this `backData` parameter must also be given (either
      * as object or as `null` or `undefined`) in order to have a proper parameter order.
      */
    backData: js.Object,
      /**
      * This optional object can give additional information to the transition function, like the DOM element
      * which triggered the transition or the desired transition duration. The animation type can NOT be selected
      * here - it is always the inverse of the "to" navigation.
      *
      * In order to use the `oTransitionParameters parameter, the backData` parameter must be used
      * (at least `null` or `undefined` must be given) for a proper parameter order.
      *
      * NOTE: it depends on the transition function how the object should be structured and which parameters
      * are actually used to influence the transition.
      */
    oTransitionParameters: js.Object
    ): this.type = js.native
    def backToPage(
      /**
      * The ID of the screen to which back navigation should happen. The ID or the control itself can be given.
      * The nearest such page among the previous pages in the history stack will be used.
      */
    pageId: String,
      /**
      * This optional object can carry any payload data which should be made available to the target page of
      * the "backToPage" navigation. The event on the target page will contain this data object as "backData"
      * property.
      *
      * When the `oTransitionParameters` parameter is used, this `backData` parameter must also be given (either
      * as object or as `null` or `undefined`) in order to have a proper parameter order.
      */
    backData: Unit,
      /**
      * This optional object can give additional information to the transition function, like the DOM element
      * which triggered the transition or the desired transition duration. The animation type can NOT be selected
      * here - it is always the inverse of the "to" navigation.
      *
      * In order to use the `oTransitionParameters parameter, the backData` parameter must be used
      * (at least `null` or `undefined` must be given) for a proper parameter order.
      *
      * NOTE: it depends on the transition function how the object should be structured and which parameters
      * are actually used to influence the transition.
      */
    oTransitionParameters: js.Object
    ): this.type = js.native
    
    /**
      * @SINCE 1.7.1
      *
      * Navigates back to the initial/top level (this is the element aggregated as "initialPage", or the first
      * added element). If already on the initial page, nothing happens. The transition effect which had been
      * used to get to the current page is inverted and used for this navigation.
      *
      * Calling this navigation method triggers first the (cancelable) "navigate" event on the NavContainer,
      * then the "BeforeHide" pseudo event on the source page and "BeforeFirstShow" (if applicable) and "BeforeShow"
      * on the target page. Later - after the transition has completed - the "AfterShow" pseudo event is triggered
      * on the target page and "AfterHide" on the page which has been left. The given backData object is available
      * in the "BeforeFirstShow", "BeforeShow" and "AfterShow" event object as "data" property.
      */
    def backToTop(): this.type = js.native
    def backToTop(
      /**
      * This optional object can carry any payload data which should be made available to the target page of
      * the "backToTop" navigation. The event on the target page will contain this data object as "backData"
      * property.
      *
      * When the `oTransitionParameters` parameter is used, this `backData` parameter must also be given (either
      * as object or as `null` or `undefined`) in order to have a proper parameter order.
      */
    backData: js.Object
    ): this.type = js.native
    def backToTop(
      /**
      * This optional object can carry any payload data which should be made available to the target page of
      * the "backToTop" navigation. The event on the target page will contain this data object as "backData"
      * property.
      *
      * When the `oTransitionParameters` parameter is used, this `backData` parameter must also be given (either
      * as object or as `null` or `undefined`) in order to have a proper parameter order.
      */
    backData: js.Object,
      /**
      * This optional object can give additional information to the transition function, like the DOM element
      * which triggered the transition or the desired transition duration. The animation type can NOT be selected
      * here - it is always the inverse of the "to" navigation.
      *
      * In order to use the `oTransitionParameters parameter, the backData` parameter must be used
      * (at least `null` or `undefined` must be given) for a proper parameter order.
      *
      * NOTE: it depends on the transition function how the object should be structured and which parameters
      * are actually used to influence the transition.
      */
    oTransitionParameters: js.Object
    ): this.type = js.native
    def backToTop(
      /**
      * This optional object can carry any payload data which should be made available to the target page of
      * the "backToTop" navigation. The event on the target page will contain this data object as "backData"
      * property.
      *
      * When the `oTransitionParameters` parameter is used, this `backData` parameter must also be given (either
      * as object or as `null` or `undefined`) in order to have a proper parameter order.
      */
    backData: Unit,
      /**
      * This optional object can give additional information to the transition function, like the DOM element
      * which triggered the transition or the desired transition duration. The animation type can NOT be selected
      * here - it is always the inverse of the "to" navigation.
      *
      * In order to use the `oTransitionParameters parameter, the backData` parameter must be used
      * (at least `null` or `undefined` must be given) for a proper parameter order.
      *
      * NOTE: it depends on the transition function how the object should be structured and which parameters
      * are actually used to influence the transition.
      */
    oTransitionParameters: js.Object
    ): this.type = js.native
    
    /**
      * Returns whether the current page is the top/initial page.
      *
      * **Note:** going to the initial page again with a row of "to" navigations causes the initial page to be
      * displayed again, but logically one is not at the top level, so this method returns "false" in this case.
      *
      * @returns Whether the current page is a top page
      */
    def currentPageIsTopPage(): Boolean = js.native
    
    /**
      * Destroys all the pages in the aggregation {@link #getPages pages}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyPages(): this.type = js.native
    
    /**
      * @SINCE 1.7.1
      *
      * Detaches event handler `fnFunction` from the {@link #event:afterNavigate afterNavigate} event of this
      * `sap.m.NavContainer`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachAfterNavigate(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachAfterNavigate(
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
      * @SINCE 1.7.1
      *
      * Detaches event handler `fnFunction` from the {@link #event:navigate navigate} event of this `sap.m.NavContainer`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachNavigate(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachNavigate(
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
      * @SINCE 1.7.1
      *
      * Fires event {@link #event:afterNavigate afterNavigate} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireAfterNavigate(): this.type = js.native
    def fireAfterNavigate(/**
      * Parameters to pass along with the event
      */
    mParameters: Direction): this.type = js.native
    
    /**
      * @SINCE 1.7.1
      *
      * Fires event {@link #event:navigate navigate} to attached listeners.
      *
      * Listeners may prevent the default action of this event by calling the `preventDefault` method on the
      * event object. The return value of this method indicates whether the default action should be executed.
      *
      * @returns Whether or not to prevent the default action
      */
    def fireNavigate(): Boolean = js.native
    def fireNavigate(/**
      * Parameters to pass along with the event
      */
    mParameters: Direction): Boolean = js.native
    
    /**
      * @SINCE 1.30
      *
      * Gets current value of property {@link #getAutoFocus autoFocus}.
      *
      * Determines whether the initial focus is set automatically on first rendering and after navigating to
      * a new page. This is useful when on touch devices the keyboard pops out due to the focus being automatically
      * set on an input field. If necessary, the `AfterShow` event can be used to focus another element, only
      * if `autoFocus` is set to `false`.
      *
      * **Note:** The following scenarios are possible, depending on where the focus was before navigation to
      * a new page:
      * 	 - If `autoFocus` is set to `true` and the focus was inside the current page, the focus will be moved
      * 			automatically on the new page.
      * 	 - If `autoFocus` is set to `false` and the focus was inside the current page, the focus will disappear.
      * 			If the focus was outside the current page, after the navigation it will remain unchanged regardless
      * 			of what is set to the `autoFocus` property.
      * 	 - If the `autoFocus` is set to `false` and at the same time another wrapping control has its own logic
      * 			for focus restoring upon rerendering, the focus will still appear.
      *
      * Default value is `true`.
      *
      * @returns Value of property `autoFocus`
      */
    def getAutoFocus(): Boolean = js.native
    
    /**
      * Returns the currently displayed page-level control.
      *
      * **Note:** Returns `undefined` if no page has been added yet, otherwise returns an instance of `sap.m.Page`,
      * `sap.ui.core.mvc.View`, `sap.m.Carousel` or whatever is aggregated.
      *
      * @returns The current page
      */
    def getCurrentPage(): typings.openui5.sapUiCoreControlMod.default = js.native
    
    /**
      * @SINCE 1.7.1
      *
      * Gets current value of property {@link #getDefaultTransitionName defaultTransitionName}.
      *
      * The type of the transition/animation to apply when "to()" is called without defining a transition type
      * to use. The default is "slide". Other options are: "baseSlide", "fade", "flip" and "show" - and the names
      * of any registered custom transitions.
      *
      * Default value is `"slide"`.
      *
      * @returns Value of property `defaultTransitionName`
      */
    def getDefaultTransitionName(): String = js.native
    
    /**
      * Gets current value of property {@link #getHeight height}.
      *
      * The height of the NavContainer. Can be changed when the NavContainer should not cover the whole available
      * area.
      *
      * Default value is `'100%'`.
      *
      * @returns Value of property `height`
      */
    def getHeight(): CSSSize = js.native
    
    /**
      * ID of the element which is the current target of the association {@link #getInitialPage initialPage},
      * or `null`.
      */
    def getInitialPage(): ID = js.native
    
    /**
      * Returns the control with the given ID from the `pages` aggregation (if available).
      *
      * @returns The control with the given ID or `null` if it doesn't exist
      */
    def getPage(/**
      * The ID of the aggregated control to find
      */
    pageId: String): typings.openui5.sapUiCoreControlMod.default | Null = js.native
    
    /**
      * Gets content of aggregation {@link #getPages pages}.
      *
      * The content entities between which this NavContainer navigates. These can be of type sap.m.Page, sap.ui.core.mvc.View,
      * sap.m.Carousel or any other control with fullscreen/page semantics.
      *
      * These aggregated controls will receive navigation events like {@link sap.m.NavContainerChild#event:BeforeShow
      * BeforeShow}, they are documented in the pseudo interface {@link sap.m.NavContainerChild sap.m.NavContainerChild}
      */
    def getPages(): js.Array[typings.openui5.sapUiCoreControlMod.default] = js.native
    
    /**
      * @SINCE 1.7.1
      *
      * Returns the previous page (the page from which the user drilled down to the current page with "to()").
      *
      * **Note:** this is not the page which the user has seen before, but the page which is the target of the
      * next "back()" navigation. If there is no previous page, `undefined` is returned.
      *
      * @returns The previous page
      */
    def getPreviousPage(): typings.openui5.sapUiCoreControlMod.default = js.native
    
    /**
      * Gets current value of property {@link #getWidth width}.
      *
      * The width of the NavContainer. Can be changed when the NavContainer should not cover the whole available
      * area.
      *
      * Default value is `'100%'`.
      *
      * @returns Value of property `width`
      */
    def getWidth(): CSSSize = js.native
    
    /**
      * Checks for the provided `sap.ui.core.Control` in the aggregation {@link #getPages pages}. and returns
      * its index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfPage(/**
      * The page whose index is looked for
      */
    oPage: typings.openui5.sapUiCoreControlMod.default): int = js.native
    
    /**
      * Inserts a page into the aggregation {@link #getPages pages}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def insertPage(
      /**
      * The page to insert; if empty, nothing is inserted
      */
    oPage: typings.openui5.sapUiCoreControlMod.default,
      /**
      * The `0`-based index the page should be inserted at; for a negative value of `iIndex`, the page is inserted
      * at position 0; for a value greater than the current size of the aggregation, the page is inserted at
      * the last position
      */
    iIndex: int
    ): this.type = js.native
    
    /**
      * @SINCE 1.16.1
      *
      * Inserts the page/control with the specified ID into the navigation history stack of the NavContainer.
      *
      * This can be used for deep-linking when the user directly reached a drilldown detail page using a bookmark
      * and then wants to navigate up in the drilldown hierarchy. Normally such a back navigation would not be
      * possible because there is no previous page in the NavContainer's history stack.
      *
      * @returns The `sap.m.NavContainer` instance
      */
    def insertPreviousPage(
      /**
      * The ID of the control/page/screen which is inserted into the history stack. The respective control must
      * be aggregated by the NavContainer, otherwise this will cause an error.
      */
    pageId: String,
      /**
      * This optional object can carry any payload data which would have been given to the inserted previous
      * page if the user would have done a normal forward navigation to it.
      */
    data: js.Object
    ): this.type = js.native
    /**
      * @SINCE 1.16.1
      *
      * Inserts the page/control with the specified ID into the navigation history stack of the NavContainer.
      *
      * This can be used for deep-linking when the user directly reached a drilldown detail page using a bookmark
      * and then wants to navigate up in the drilldown hierarchy. Normally such a back navigation would not be
      * possible because there is no previous page in the NavContainer's history stack.
      *
      * @returns The `sap.m.NavContainer` instance
      */
    def insertPreviousPage(
      /**
      * The ID of the control/page/screen which is inserted into the history stack. The respective control must
      * be aggregated by the NavContainer, otherwise this will cause an error.
      */
    pageId: String,
      /**
      * The type of the transition/animation which would have been used to navigate from the (inserted) previous
      * page to the current page. When navigating back, the inverse animation will be applied. Options are "slide"
      * (horizontal movement from the right), "baseSlide", "fade", "flip", and "show" and the names of any registered
      * custom transitions.
      */
    transitionName: String,
      /**
      * This optional object can carry any payload data which would have been given to the inserted previous
      * page if the user would have done a normal forward navigation to it.
      */
    data: js.Object
    ): this.type = js.native
    
    /**
      * Removes all the controls from the aggregation {@link #getPages pages}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllPages(): js.Array[typings.openui5.sapUiCoreControlMod.default] = js.native
    
    def removePage(
      /**
      * the position or ID of the `Control` that should be removed or that `Control` itself; if `vPage` is invalid,
      * a negative value or a value greater or equal than the current size of the aggregation, nothing is removed.
      */
    vPage: String
    ): typings.openui5.sapUiCoreControlMod.default | Null = js.native
    /**
      * Removes a page.
      *
      * @returns the removed page or `null`
      */
    def removePage(
      /**
      * the position or ID of the `Control` that should be removed or that `Control` itself; if `vPage` is invalid,
      * a negative value or a value greater or equal than the current size of the aggregation, nothing is removed.
      */
    vPage: int
    ): typings.openui5.sapUiCoreControlMod.default | Null = js.native
    def removePage(
      /**
      * the position or ID of the `Control` that should be removed or that `Control` itself; if `vPage` is invalid,
      * a negative value or a value greater or equal than the current size of the aggregation, nothing is removed.
      */
    vPage: typings.openui5.sapUiCoreControlMod.default
    ): typings.openui5.sapUiCoreControlMod.default | Null = js.native
    
    /**
      * @SINCE 1.30
      *
      * Sets a new value for property {@link #getAutoFocus autoFocus}.
      *
      * Determines whether the initial focus is set automatically on first rendering and after navigating to
      * a new page. This is useful when on touch devices the keyboard pops out due to the focus being automatically
      * set on an input field. If necessary, the `AfterShow` event can be used to focus another element, only
      * if `autoFocus` is set to `false`.
      *
      * **Note:** The following scenarios are possible, depending on where the focus was before navigation to
      * a new page:
      * 	 - If `autoFocus` is set to `true` and the focus was inside the current page, the focus will be moved
      * 			automatically on the new page.
      * 	 - If `autoFocus` is set to `false` and the focus was inside the current page, the focus will disappear.
      * 			If the focus was outside the current page, after the navigation it will remain unchanged regardless
      * 			of what is set to the `autoFocus` property.
      * 	 - If the `autoFocus` is set to `false` and at the same time another wrapping control has its own logic
      * 			for focus restoring upon rerendering, the focus will still appear.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setAutoFocus(): this.type = js.native
    def setAutoFocus(/**
      * New value for property `autoFocus`
      */
    bAutoFocus: Boolean): this.type = js.native
    
    /**
      * @SINCE 1.7.1
      *
      * Sets a new value for property {@link #getDefaultTransitionName defaultTransitionName}.
      *
      * The type of the transition/animation to apply when "to()" is called without defining a transition type
      * to use. The default is "slide". Other options are: "baseSlide", "fade", "flip" and "show" - and the names
      * of any registered custom transitions.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `"slide"`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setDefaultTransitionName(): this.type = js.native
    def setDefaultTransitionName(/**
      * New value for property `defaultTransitionName`
      */
    sDefaultTransitionName: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getHeight height}.
      *
      * The height of the NavContainer. Can be changed when the NavContainer should not cover the whole available
      * area.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `'100%'`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setHeight(): this.type = js.native
    def setHeight(/**
      * New value for property `height`
      */
    sHeight: CSSSize): this.type = js.native
    
    def setInitialPage(
      /**
      * ID of an element which becomes the new target of this initialPage association; alternatively, an element
      * instance may be given
      */
    oInitialPage: typings.openui5.sapUiCoreControlMod.default
    ): this.type = js.native
    /**
      * Sets the associated {@link #getInitialPage initialPage}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setInitialPage(
      /**
      * ID of an element which becomes the new target of this initialPage association; alternatively, an element
      * instance may be given
      */
    oInitialPage: ID
    ): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getWidth width}.
      *
      * The width of the NavContainer. Can be changed when the NavContainer should not cover the whole available
      * area.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `'100%'`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setWidth(): this.type = js.native
    def setWidth(/**
      * New value for property `width`
      */
    sWidth: CSSSize): this.type = js.native
    
    /**
      * Navigates to the next page (with drill-down semantic) with the given (or default) animation. This creates
      * a new history item inside the NavContainer and allows going back.
      *
      * Note that any modifications to the target page (like setting its title, or anything else that could cause
      * a re-rendering) should be done BEFORE calling to(), in order to avoid unwanted side effects, e.g. related
      * to the page animation.
      *
      * Available transitions currently include "slide" (default), "baseSlide", "fade", "flip", and "show". None
      * of these is currently making use of any given transitionParameters.
      *
      * Calling this navigation method triggers first the (cancelable) "navigate" event on the NavContainer,
      * then the "BeforeHide" pseudo event on the source page and "BeforeFirstShow" (if applicable) and"BeforeShow"
      * on the target page. Later - after the transition has completed - the "AfterShow" pseudo event is triggered
      * on the target page and "AfterHide" on the page which has been left. The given data object is available
      * in the "BeforeFirstShow", "BeforeShow" and "AfterShow" event object as "data" property.
      *
      * @returns The `sap.m.NavContainer` instance
      */
    def to(
      /**
      * The screen to which drilldown should happen. The ID or the control itself can be given.
      */
    vPageIdOrControl: String
    ): this.type = js.native
    def to(
      /**
      * The screen to which drilldown should happen. The ID or the control itself can be given.
      */
    vPageIdOrControl: String,
      /**
      * The type of the transition/animation to apply. Options are "slide" (horizontal movement from the right),
      * "baseSlide", "fade", "flip", and "show" and the names of any registered custom transitions.
      *
      * None of the standard transitions is currently making use of any given transition parameters.
      */
    sTransitionName: String
    ): this.type = js.native
    def to(
      /**
      * The screen to which drilldown should happen. The ID or the control itself can be given.
      */
    vPageIdOrControl: String,
      /**
      * The type of the transition/animation to apply. Options are "slide" (horizontal movement from the right),
      * "baseSlide", "fade", "flip", and "show" and the names of any registered custom transitions.
      *
      * None of the standard transitions is currently making use of any given transition parameters.
      */
    sTransitionName: String,
      /**
      * Since version 1.7.1. This optional object can carry any payload data which should be made available to
      * the target page. The "BeforeShow" event on the target page will contain this data object as "data" property.
      * Use case: in scenarios where the entity triggering the navigation can or should not directly initialize
      * the target page, it can fill this object and the target page itself (or a listener on it) can take over
      * the initialization, using the given data.
      *
      * When the `oTransitionParameters` parameter is used, this `oData` parameter must also be given (either
      * as object or as `null` or `undefined`) in order to have a proper parameter order.
      */
    oData: js.Object
    ): this.type = js.native
    def to(
      /**
      * The screen to which drilldown should happen. The ID or the control itself can be given.
      */
    vPageIdOrControl: String,
      /**
      * The type of the transition/animation to apply. Options are "slide" (horizontal movement from the right),
      * "baseSlide", "fade", "flip", and "show" and the names of any registered custom transitions.
      *
      * None of the standard transitions is currently making use of any given transition parameters.
      */
    sTransitionName: String,
      /**
      * Since version 1.7.1. This optional object can carry any payload data which should be made available to
      * the target page. The "BeforeShow" event on the target page will contain this data object as "data" property.
      * Use case: in scenarios where the entity triggering the navigation can or should not directly initialize
      * the target page, it can fill this object and the target page itself (or a listener on it) can take over
      * the initialization, using the given data.
      *
      * When the `oTransitionParameters` parameter is used, this `oData` parameter must also be given (either
      * as object or as `null` or `undefined`) in order to have a proper parameter order.
      */
    oData: js.Object,
      /**
      * Since version 1.7.1. This optional object can contain additional information for the transition function,
      * like the DOM element which triggered the transition or the desired transition duration.
      *
      * For a proper parameter order, the `oData` parameter must be given when the `oTransitionParameters` parameter
      * is used (it can be given as `null` or `undefined`).
      *
      * NOTE: it depends on the transition function how the object should be structured and which parameters
      * are actually used to influence the transition. The "show", "slide", "baseSlide" and "fade" transitions
      * do not use any parameter.
      */
    oTransitionParameters: js.Object
    ): this.type = js.native
    def to(
      /**
      * The screen to which drilldown should happen. The ID or the control itself can be given.
      */
    vPageIdOrControl: String,
      /**
      * The type of the transition/animation to apply. Options are "slide" (horizontal movement from the right),
      * "baseSlide", "fade", "flip", and "show" and the names of any registered custom transitions.
      *
      * None of the standard transitions is currently making use of any given transition parameters.
      */
    sTransitionName: String,
      /**
      * Since version 1.7.1. This optional object can carry any payload data which should be made available to
      * the target page. The "BeforeShow" event on the target page will contain this data object as "data" property.
      * Use case: in scenarios where the entity triggering the navigation can or should not directly initialize
      * the target page, it can fill this object and the target page itself (or a listener on it) can take over
      * the initialization, using the given data.
      *
      * When the `oTransitionParameters` parameter is used, this `oData` parameter must also be given (either
      * as object or as `null` or `undefined`) in order to have a proper parameter order.
      */
    oData: Unit,
      /**
      * Since version 1.7.1. This optional object can contain additional information for the transition function,
      * like the DOM element which triggered the transition or the desired transition duration.
      *
      * For a proper parameter order, the `oData` parameter must be given when the `oTransitionParameters` parameter
      * is used (it can be given as `null` or `undefined`).
      *
      * NOTE: it depends on the transition function how the object should be structured and which parameters
      * are actually used to influence the transition. The "show", "slide", "baseSlide" and "fade" transitions
      * do not use any parameter.
      */
    oTransitionParameters: js.Object
    ): this.type = js.native
    def to(
      /**
      * The screen to which drilldown should happen. The ID or the control itself can be given.
      */
    vPageIdOrControl: String,
      /**
      * The type of the transition/animation to apply. Options are "slide" (horizontal movement from the right),
      * "baseSlide", "fade", "flip", and "show" and the names of any registered custom transitions.
      *
      * None of the standard transitions is currently making use of any given transition parameters.
      */
    sTransitionName: Unit,
      /**
      * Since version 1.7.1. This optional object can carry any payload data which should be made available to
      * the target page. The "BeforeShow" event on the target page will contain this data object as "data" property.
      * Use case: in scenarios where the entity triggering the navigation can or should not directly initialize
      * the target page, it can fill this object and the target page itself (or a listener on it) can take over
      * the initialization, using the given data.
      *
      * When the `oTransitionParameters` parameter is used, this `oData` parameter must also be given (either
      * as object or as `null` or `undefined`) in order to have a proper parameter order.
      */
    oData: js.Object
    ): this.type = js.native
    def to(
      /**
      * The screen to which drilldown should happen. The ID or the control itself can be given.
      */
    vPageIdOrControl: String,
      /**
      * The type of the transition/animation to apply. Options are "slide" (horizontal movement from the right),
      * "baseSlide", "fade", "flip", and "show" and the names of any registered custom transitions.
      *
      * None of the standard transitions is currently making use of any given transition parameters.
      */
    sTransitionName: Unit,
      /**
      * Since version 1.7.1. This optional object can carry any payload data which should be made available to
      * the target page. The "BeforeShow" event on the target page will contain this data object as "data" property.
      * Use case: in scenarios where the entity triggering the navigation can or should not directly initialize
      * the target page, it can fill this object and the target page itself (or a listener on it) can take over
      * the initialization, using the given data.
      *
      * When the `oTransitionParameters` parameter is used, this `oData` parameter must also be given (either
      * as object or as `null` or `undefined`) in order to have a proper parameter order.
      */
    oData: js.Object,
      /**
      * Since version 1.7.1. This optional object can contain additional information for the transition function,
      * like the DOM element which triggered the transition or the desired transition duration.
      *
      * For a proper parameter order, the `oData` parameter must be given when the `oTransitionParameters` parameter
      * is used (it can be given as `null` or `undefined`).
      *
      * NOTE: it depends on the transition function how the object should be structured and which parameters
      * are actually used to influence the transition. The "show", "slide", "baseSlide" and "fade" transitions
      * do not use any parameter.
      */
    oTransitionParameters: js.Object
    ): this.type = js.native
    def to(
      /**
      * The screen to which drilldown should happen. The ID or the control itself can be given.
      */
    vPageIdOrControl: String,
      /**
      * The type of the transition/animation to apply. Options are "slide" (horizontal movement from the right),
      * "baseSlide", "fade", "flip", and "show" and the names of any registered custom transitions.
      *
      * None of the standard transitions is currently making use of any given transition parameters.
      */
    sTransitionName: Unit,
      /**
      * Since version 1.7.1. This optional object can carry any payload data which should be made available to
      * the target page. The "BeforeShow" event on the target page will contain this data object as "data" property.
      * Use case: in scenarios where the entity triggering the navigation can or should not directly initialize
      * the target page, it can fill this object and the target page itself (or a listener on it) can take over
      * the initialization, using the given data.
      *
      * When the `oTransitionParameters` parameter is used, this `oData` parameter must also be given (either
      * as object or as `null` or `undefined`) in order to have a proper parameter order.
      */
    oData: Unit,
      /**
      * Since version 1.7.1. This optional object can contain additional information for the transition function,
      * like the DOM element which triggered the transition or the desired transition duration.
      *
      * For a proper parameter order, the `oData` parameter must be given when the `oTransitionParameters` parameter
      * is used (it can be given as `null` or `undefined`).
      *
      * NOTE: it depends on the transition function how the object should be structured and which parameters
      * are actually used to influence the transition. The "show", "slide", "baseSlide" and "fade" transitions
      * do not use any parameter.
      */
    oTransitionParameters: js.Object
    ): this.type = js.native
    def to(
      /**
      * The screen to which drilldown should happen. The ID or the control itself can be given.
      */
    vPageIdOrControl: typings.openui5.sapUiCoreControlMod.default
    ): this.type = js.native
    def to(
      /**
      * The screen to which drilldown should happen. The ID or the control itself can be given.
      */
    vPageIdOrControl: typings.openui5.sapUiCoreControlMod.default,
      /**
      * The type of the transition/animation to apply. Options are "slide" (horizontal movement from the right),
      * "baseSlide", "fade", "flip", and "show" and the names of any registered custom transitions.
      *
      * None of the standard transitions is currently making use of any given transition parameters.
      */
    sTransitionName: String
    ): this.type = js.native
    def to(
      /**
      * The screen to which drilldown should happen. The ID or the control itself can be given.
      */
    vPageIdOrControl: typings.openui5.sapUiCoreControlMod.default,
      /**
      * The type of the transition/animation to apply. Options are "slide" (horizontal movement from the right),
      * "baseSlide", "fade", "flip", and "show" and the names of any registered custom transitions.
      *
      * None of the standard transitions is currently making use of any given transition parameters.
      */
    sTransitionName: String,
      /**
      * Since version 1.7.1. This optional object can carry any payload data which should be made available to
      * the target page. The "BeforeShow" event on the target page will contain this data object as "data" property.
      * Use case: in scenarios where the entity triggering the navigation can or should not directly initialize
      * the target page, it can fill this object and the target page itself (or a listener on it) can take over
      * the initialization, using the given data.
      *
      * When the `oTransitionParameters` parameter is used, this `oData` parameter must also be given (either
      * as object or as `null` or `undefined`) in order to have a proper parameter order.
      */
    oData: js.Object
    ): this.type = js.native
    def to(
      /**
      * The screen to which drilldown should happen. The ID or the control itself can be given.
      */
    vPageIdOrControl: typings.openui5.sapUiCoreControlMod.default,
      /**
      * The type of the transition/animation to apply. Options are "slide" (horizontal movement from the right),
      * "baseSlide", "fade", "flip", and "show" and the names of any registered custom transitions.
      *
      * None of the standard transitions is currently making use of any given transition parameters.
      */
    sTransitionName: String,
      /**
      * Since version 1.7.1. This optional object can carry any payload data which should be made available to
      * the target page. The "BeforeShow" event on the target page will contain this data object as "data" property.
      * Use case: in scenarios where the entity triggering the navigation can or should not directly initialize
      * the target page, it can fill this object and the target page itself (or a listener on it) can take over
      * the initialization, using the given data.
      *
      * When the `oTransitionParameters` parameter is used, this `oData` parameter must also be given (either
      * as object or as `null` or `undefined`) in order to have a proper parameter order.
      */
    oData: js.Object,
      /**
      * Since version 1.7.1. This optional object can contain additional information for the transition function,
      * like the DOM element which triggered the transition or the desired transition duration.
      *
      * For a proper parameter order, the `oData` parameter must be given when the `oTransitionParameters` parameter
      * is used (it can be given as `null` or `undefined`).
      *
      * NOTE: it depends on the transition function how the object should be structured and which parameters
      * are actually used to influence the transition. The "show", "slide", "baseSlide" and "fade" transitions
      * do not use any parameter.
      */
    oTransitionParameters: js.Object
    ): this.type = js.native
    def to(
      /**
      * The screen to which drilldown should happen. The ID or the control itself can be given.
      */
    vPageIdOrControl: typings.openui5.sapUiCoreControlMod.default,
      /**
      * The type of the transition/animation to apply. Options are "slide" (horizontal movement from the right),
      * "baseSlide", "fade", "flip", and "show" and the names of any registered custom transitions.
      *
      * None of the standard transitions is currently making use of any given transition parameters.
      */
    sTransitionName: String,
      /**
      * Since version 1.7.1. This optional object can carry any payload data which should be made available to
      * the target page. The "BeforeShow" event on the target page will contain this data object as "data" property.
      * Use case: in scenarios where the entity triggering the navigation can or should not directly initialize
      * the target page, it can fill this object and the target page itself (or a listener on it) can take over
      * the initialization, using the given data.
      *
      * When the `oTransitionParameters` parameter is used, this `oData` parameter must also be given (either
      * as object or as `null` or `undefined`) in order to have a proper parameter order.
      */
    oData: Unit,
      /**
      * Since version 1.7.1. This optional object can contain additional information for the transition function,
      * like the DOM element which triggered the transition or the desired transition duration.
      *
      * For a proper parameter order, the `oData` parameter must be given when the `oTransitionParameters` parameter
      * is used (it can be given as `null` or `undefined`).
      *
      * NOTE: it depends on the transition function how the object should be structured and which parameters
      * are actually used to influence the transition. The "show", "slide", "baseSlide" and "fade" transitions
      * do not use any parameter.
      */
    oTransitionParameters: js.Object
    ): this.type = js.native
    def to(
      /**
      * The screen to which drilldown should happen. The ID or the control itself can be given.
      */
    vPageIdOrControl: typings.openui5.sapUiCoreControlMod.default,
      /**
      * The type of the transition/animation to apply. Options are "slide" (horizontal movement from the right),
      * "baseSlide", "fade", "flip", and "show" and the names of any registered custom transitions.
      *
      * None of the standard transitions is currently making use of any given transition parameters.
      */
    sTransitionName: Unit,
      /**
      * Since version 1.7.1. This optional object can carry any payload data which should be made available to
      * the target page. The "BeforeShow" event on the target page will contain this data object as "data" property.
      * Use case: in scenarios where the entity triggering the navigation can or should not directly initialize
      * the target page, it can fill this object and the target page itself (or a listener on it) can take over
      * the initialization, using the given data.
      *
      * When the `oTransitionParameters` parameter is used, this `oData` parameter must also be given (either
      * as object or as `null` or `undefined`) in order to have a proper parameter order.
      */
    oData: js.Object
    ): this.type = js.native
    def to(
      /**
      * The screen to which drilldown should happen. The ID or the control itself can be given.
      */
    vPageIdOrControl: typings.openui5.sapUiCoreControlMod.default,
      /**
      * The type of the transition/animation to apply. Options are "slide" (horizontal movement from the right),
      * "baseSlide", "fade", "flip", and "show" and the names of any registered custom transitions.
      *
      * None of the standard transitions is currently making use of any given transition parameters.
      */
    sTransitionName: Unit,
      /**
      * Since version 1.7.1. This optional object can carry any payload data which should be made available to
      * the target page. The "BeforeShow" event on the target page will contain this data object as "data" property.
      * Use case: in scenarios where the entity triggering the navigation can or should not directly initialize
      * the target page, it can fill this object and the target page itself (or a listener on it) can take over
      * the initialization, using the given data.
      *
      * When the `oTransitionParameters` parameter is used, this `oData` parameter must also be given (either
      * as object or as `null` or `undefined`) in order to have a proper parameter order.
      */
    oData: js.Object,
      /**
      * Since version 1.7.1. This optional object can contain additional information for the transition function,
      * like the DOM element which triggered the transition or the desired transition duration.
      *
      * For a proper parameter order, the `oData` parameter must be given when the `oTransitionParameters` parameter
      * is used (it can be given as `null` or `undefined`).
      *
      * NOTE: it depends on the transition function how the object should be structured and which parameters
      * are actually used to influence the transition. The "show", "slide", "baseSlide" and "fade" transitions
      * do not use any parameter.
      */
    oTransitionParameters: js.Object
    ): this.type = js.native
    def to(
      /**
      * The screen to which drilldown should happen. The ID or the control itself can be given.
      */
    vPageIdOrControl: typings.openui5.sapUiCoreControlMod.default,
      /**
      * The type of the transition/animation to apply. Options are "slide" (horizontal movement from the right),
      * "baseSlide", "fade", "flip", and "show" and the names of any registered custom transitions.
      *
      * None of the standard transitions is currently making use of any given transition parameters.
      */
    sTransitionName: Unit,
      /**
      * Since version 1.7.1. This optional object can carry any payload data which should be made available to
      * the target page. The "BeforeShow" event on the target page will contain this data object as "data" property.
      * Use case: in scenarios where the entity triggering the navigation can or should not directly initialize
      * the target page, it can fill this object and the target page itself (or a listener on it) can take over
      * the initialization, using the given data.
      *
      * When the `oTransitionParameters` parameter is used, this `oData` parameter must also be given (either
      * as object or as `null` or `undefined`) in order to have a proper parameter order.
      */
    oData: Unit,
      /**
      * Since version 1.7.1. This optional object can contain additional information for the transition function,
      * like the DOM element which triggered the transition or the desired transition duration.
      *
      * For a proper parameter order, the `oData` parameter must be given when the `oTransitionParameters` parameter
      * is used (it can be given as `null` or `undefined`).
      *
      * NOTE: it depends on the transition function how the object should be structured and which parameters
      * are actually used to influence the transition. The "show", "slide", "baseSlide" and "fade" transitions
      * do not use any parameter.
      */
    oTransitionParameters: js.Object
    ): this.type = js.native
  }
  
  trait NavContainerChild extends StObject {
    
    var __implements__sap_m_NavContainerChild: Boolean
  }
  object NavContainerChild {
    
    inline def apply(__implements__sap_m_NavContainerChild: Boolean): NavContainerChild = {
      val __obj = js.Dynamic.literal(__implements__sap_m_NavContainerChild = __implements__sap_m_NavContainerChild.asInstanceOf[js.Any])
      __obj.asInstanceOf[NavContainerChild]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NavContainerChild] (val x: Self) extends AnyVal {
      
      inline def set__implements__sap_m_NavContainerChild(value: Boolean): Self = StObject.set(x, "__implements__sap_m_NavContainerChild", value.asInstanceOf[js.Any])
    }
  }
  
  trait NavContainerSettings
    extends StObject
       with ControlSettings {
    
    /**
      * @SINCE 1.7.1
      *
      * The event is fired when navigation between two pages has completed (once all events to the child controls
      * have been fired). In case of animated transitions this event is fired with some delay after the "navigate"
      * event.
      */
    var afterNavigate: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * @SINCE 1.30
      *
      * Determines whether the initial focus is set automatically on first rendering and after navigating to
      * a new page. This is useful when on touch devices the keyboard pops out due to the focus being automatically
      * set on an input field. If necessary, the `AfterShow` event can be used to focus another element, only
      * if `autoFocus` is set to `false`.
      *
      * **Note:** The following scenarios are possible, depending on where the focus was before navigation to
      * a new page:
      * 	 - If `autoFocus` is set to `true` and the focus was inside the current page, the focus will be moved
      * 			automatically on the new page.
      * 	 - If `autoFocus` is set to `false` and the focus was inside the current page, the focus will disappear.
      * 			If the focus was outside the current page, after the navigation it will remain unchanged regardless
      * 			of what is set to the `autoFocus` property.
      * 	 - If the `autoFocus` is set to `false` and at the same time another wrapping control has its own logic
      * 			for focus restoring upon rerendering, the focus will still appear.
      */
    var autoFocus: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @SINCE 1.7.1
      *
      * The type of the transition/animation to apply when "to()" is called without defining a transition type
      * to use. The default is "slide". Other options are: "baseSlide", "fade", "flip" and "show" - and the names
      * of any registered custom transitions.
      */
    var defaultTransitionName: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * The height of the NavContainer. Can be changed when the NavContainer should not cover the whole available
      * area.
      */
    var height: js.UndefOr[
        CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * This association can be used to define which page is displayed initially. If the given page does not
      * exist or no page is given, the first page which has been added is considered as initial page. This value
      * should be set initially and not set/modified while the application is running.
      *
      * This could be used not only for the initial display, but also if the user wants to navigate "up to top",
      * so this page serves as a sort of "home/root page".
      */
    var initialPage: js.UndefOr[typings.openui5.sapUiCoreControlMod.default | String] = js.undefined
    
    /**
      * @SINCE 1.7.1
      *
      * The event is fired when navigation between two pages has been triggered (before any events to the child
      * controls are fired). The transition (if any) to the new page has not started yet. This event can be aborted
      * by the application with preventDefault(), which means that there will be no navigation.
      */
    var navigate: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * The content entities between which this NavContainer navigates. These can be of type sap.m.Page, sap.ui.core.mvc.View,
      * sap.m.Carousel or any other control with fullscreen/page semantics.
      *
      * These aggregated controls will receive navigation events like {@link sap.m.NavContainerChild#event:BeforeShow
      * BeforeShow}, they are documented in the pseudo interface {@link sap.m.NavContainerChild sap.m.NavContainerChild}
      */
    var pages: js.UndefOr[
        js.Array[typings.openui5.sapUiCoreControlMod.default] | typings.openui5.sapUiCoreControlMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * The width of the NavContainer. Can be changed when the NavContainer should not cover the whole available
      * area.
      */
    var width: js.UndefOr[
        CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
  }
  object NavContainerSettings {
    
    inline def apply(): NavContainerSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NavContainerSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NavContainerSettings] (val x: Self) extends AnyVal {
      
      inline def setAfterNavigate(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "afterNavigate", js.Any.fromFunction1(value))
      
      inline def setAfterNavigateUndefined: Self = StObject.set(x, "afterNavigate", js.undefined)
      
      inline def setAutoFocus(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
      
      inline def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
      
      inline def setDefaultTransitionName(value: String | PropertyBindingInfo): Self = StObject.set(x, "defaultTransitionName", value.asInstanceOf[js.Any])
      
      inline def setDefaultTransitionNameUndefined: Self = StObject.set(x, "defaultTransitionName", js.undefined)
      
      inline def setHeight(value: CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setInitialPage(value: typings.openui5.sapUiCoreControlMod.default | String): Self = StObject.set(x, "initialPage", value.asInstanceOf[js.Any])
      
      inline def setInitialPageUndefined: Self = StObject.set(x, "initialPage", js.undefined)
      
      inline def setNavigate(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "navigate", js.Any.fromFunction1(value))
      
      inline def setNavigateUndefined: Self = StObject.set(x, "navigate", js.undefined)
      
      inline def setPages(
        value: js.Array[typings.openui5.sapUiCoreControlMod.default] | typings.openui5.sapUiCoreControlMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "pages", value.asInstanceOf[js.Any])
      
      inline def setPagesUndefined: Self = StObject.set(x, "pages", js.undefined)
      
      inline def setPagesVarargs(value: typings.openui5.sapUiCoreControlMod.default*): Self = StObject.set(x, "pages", js.Array(value*))
      
      inline def setWidth(value: CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
