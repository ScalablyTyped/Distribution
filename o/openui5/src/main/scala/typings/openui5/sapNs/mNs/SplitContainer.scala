package typings.openui5.sapNs.mNs

import typings.openui5.sapNs.uiNs.coreNs.Control
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.m.SplitContainer")
@js.native
class SplitContainer protected () extends Control {
  /**
    * Constructor for a new SplitContainer.Accepts an object literal <code>mSettings</code> that defines
    * initialproperty values, aggregated and associated objects as well as event handlers.See {@link
    * sap.ui.base.ManagedObject#constructor} for a general description of the syntax of the settings
    * object.
    * @param sId ID for the new control, generated automatically if no ID is given
    * @param mSettings Initial settings for the new control
    */
  def this(sId: String) = this()
  def this(sId: String, mSettings: js.Any) = this()
  /**
    * Adds some detailPage to the aggregation <code>detailPages</code>.
    * @param oDetailPage the detailPage to add; if empty, nothing is inserted
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def addDetailPage(oDetailPage: Control): SplitContainer = js.native
  /**
    * Adds some masterPage to the aggregation <code>masterPages</code>.
    * @param oMasterPage the masterPage to add; if empty, nothing is inserted
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def addMasterPage(oMasterPage: Control): SplitContainer = js.native
  /**
    * Adds a content entity either to master area or detail area depending on the master parameter.The
    * method is provided mainly for providing API consistency between sap.m.SplitContainer and sap.m.App.
    * So that the same code line can be reused.
    * @since 1.11.1
    * @param oPage The content entities between which this SplitContainer navigates in either master area
    * or detail area depending on the master parameter. These can be of type sap.m.Page, sap.ui.core.View,
    * sap.m.Carousel or any other control with fullscreen/page semantics.
    * @param bMaster States if the page should be added to the master area. If it's set to false, the page
    * is added to detail area.
    */
  def addPage(oPage: Control, bMaster: Boolean): SplitContainer = js.native
  /**
    * Attaches event handler <code>fnFunction</code> to the <code>afterDetailNavigate</code> event of this
    * <code>sap.m.SplitContainer</code>.When called, the context of the event handler (its
    * <code>this</code>) will be bound to <code>oListener</code> if specified, otherwise it will be bound
    * to this <code>sap.m.SplitContainer</code> itself.Fires when navigation between two pages in detail
    * area has completed.NOTE: In case of animated transitions this event is fired with some delay after
    * the "navigate" event.
    * @param oData An application-specific payload object that will be passed to the event handler along
    * with the event object when firing the event
    * @param fnFunction The function to be called when the event occurs
    * @param oListener Context object to call the event handler with. Defaults to this
    * <code>sap.m.SplitContainer</code> itself
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def attachAfterDetailNavigate(oData: js.Any, fnFunction: js.Any): SplitContainer = js.native
  def attachAfterDetailNavigate(oData: js.Any, fnFunction: js.Any, oListener: js.Any): SplitContainer = js.native
  /**
    * Attaches event handler <code>fnFunction</code> to the <code>afterMasterClose</code> event of this
    * <code>sap.m.SplitContainer</code>.When called, the context of the event handler (its
    * <code>this</code>) will be bound to <code>oListener</code> if specified, otherwise it will be bound
    * to this <code>sap.m.SplitContainer</code> itself.Fires when the master area is fully closed after
    * the animation (if any).
    * @param oData An application-specific payload object that will be passed to the event handler along
    * with the event object when firing the event
    * @param fnFunction The function to be called when the event occurs
    * @param oListener Context object to call the event handler with. Defaults to this
    * <code>sap.m.SplitContainer</code> itself
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def attachAfterMasterClose(oData: js.Any, fnFunction: js.Any): SplitContainer = js.native
  def attachAfterMasterClose(oData: js.Any, fnFunction: js.Any, oListener: js.Any): SplitContainer = js.native
  /**
    * Attaches event handler <code>fnFunction</code> to the <code>afterMasterNavigate</code> event of this
    * <code>sap.m.SplitContainer</code>.When called, the context of the event handler (its
    * <code>this</code>) will be bound to <code>oListener</code> if specified, otherwise it will be bound
    * to this <code>sap.m.SplitContainer</code> itself.Fires when navigation between two pages in master
    * area has completed.NOTE: In case of animated transitions this event is fired with some delay after
    * the navigate event.
    * @param oData An application-specific payload object that will be passed to the event handler along
    * with the event object when firing the event
    * @param fnFunction The function to be called when the event occurs
    * @param oListener Context object to call the event handler with. Defaults to this
    * <code>sap.m.SplitContainer</code> itself
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def attachAfterMasterNavigate(oData: js.Any, fnFunction: js.Any): SplitContainer = js.native
  def attachAfterMasterNavigate(oData: js.Any, fnFunction: js.Any, oListener: js.Any): SplitContainer = js.native
  /**
    * Attaches event handler <code>fnFunction</code> to the <code>afterMasterOpen</code> event of this
    * <code>sap.m.SplitContainer</code>.When called, the context of the event handler (its
    * <code>this</code>) will be bound to <code>oListener</code> if specified, otherwise it will be bound
    * to this <code>sap.m.SplitContainer</code> itself.Fires when the master area is fully opened after
    * animation if any.
    * @param oData An application-specific payload object that will be passed to the event handler along
    * with the event object when firing the event
    * @param fnFunction The function to be called when the event occurs
    * @param oListener Context object to call the event handler with. Defaults to this
    * <code>sap.m.SplitContainer</code> itself
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def attachAfterMasterOpen(oData: js.Any, fnFunction: js.Any): SplitContainer = js.native
  def attachAfterMasterOpen(oData: js.Any, fnFunction: js.Any, oListener: js.Any): SplitContainer = js.native
  /**
    * Attaches event handler <code>fnFunction</code> to the <code>beforeMasterClose</code> event of this
    * <code>sap.m.SplitContainer</code>.When called, the context of the event handler (its
    * <code>this</code>) will be bound to <code>oListener</code> if specified, otherwise it will be bound
    * to this <code>sap.m.SplitContainer</code> itself.Fires before the master area is closed.
    * @param oData An application-specific payload object that will be passed to the event handler along
    * with the event object when firing the event
    * @param fnFunction The function to be called when the event occurs
    * @param oListener Context object to call the event handler with. Defaults to this
    * <code>sap.m.SplitContainer</code> itself
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def attachBeforeMasterClose(oData: js.Any, fnFunction: js.Any): SplitContainer = js.native
  def attachBeforeMasterClose(oData: js.Any, fnFunction: js.Any, oListener: js.Any): SplitContainer = js.native
  /**
    * Attaches event handler <code>fnFunction</code> to the <code>beforeMasterOpen</code> event of this
    * <code>sap.m.SplitContainer</code>.When called, the context of the event handler (its
    * <code>this</code>) will be bound to <code>oListener</code> if specified, otherwise it will be bound
    * to this <code>sap.m.SplitContainer</code> itself.Fires before the master area is opened.
    * @param oData An application-specific payload object that will be passed to the event handler along
    * with the event object when firing the event
    * @param fnFunction The function to be called when the event occurs
    * @param oListener Context object to call the event handler with. Defaults to this
    * <code>sap.m.SplitContainer</code> itself
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def attachBeforeMasterOpen(oData: js.Any, fnFunction: js.Any): SplitContainer = js.native
  def attachBeforeMasterOpen(oData: js.Any, fnFunction: js.Any, oListener: js.Any): SplitContainer = js.native
  /**
    * Attaches event handler <code>fnFunction</code> to the <code>detailNavigate</code> event of this
    * <code>sap.m.SplitContainer</code>.When called, the context of the event handler (its
    * <code>this</code>) will be bound to <code>oListener</code> if specified, otherwise it will be bound
    * to this <code>sap.m.SplitContainer</code> itself.Fires when navigation between two pages in detail
    * area has been triggered.The transition (if any) to the new page has not started yet.NOTE: This event
    * can be aborted by the application with preventDefault(), which means that there will be no
    * navigation.
    * @param oData An application-specific payload object that will be passed to the event handler along
    * with the event object when firing the event
    * @param fnFunction The function to be called when the event occurs
    * @param oListener Context object to call the event handler with. Defaults to this
    * <code>sap.m.SplitContainer</code> itself
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def attachDetailNavigate(oData: js.Any, fnFunction: js.Any): SplitContainer = js.native
  def attachDetailNavigate(oData: js.Any, fnFunction: js.Any, oListener: js.Any): SplitContainer = js.native
  /**
    * Attaches event handler <code>fnFunction</code> to the <code>masterButton</code> event of this
    * <code>sap.m.SplitContainer</code>.When called, the context of the event handler (its
    * <code>this</code>) will be bound to <code>oListener</code> if specified, otherwise it will be bound
    * to this <code>sap.m.SplitContainer</code> itself.Fires when a Master Button needs to be shown or
    * hidden. This is necessary for custom headers when the SplitContainer control does not handle the
    * placement of the master button automatically.
    * @param oData An application-specific payload object that will be passed to the event handler along
    * with the event object when firing the event
    * @param fnFunction The function to be called when the event occurs
    * @param oListener Context object to call the event handler with. Defaults to this
    * <code>sap.m.SplitContainer</code> itself
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def attachMasterButton(oData: js.Any, fnFunction: js.Any): SplitContainer = js.native
  def attachMasterButton(oData: js.Any, fnFunction: js.Any, oListener: js.Any): SplitContainer = js.native
  /**
    * Attaches event handler <code>fnFunction</code> to the <code>masterNavigate</code> event of this
    * <code>sap.m.SplitContainer</code>.When called, the context of the event handler (its
    * <code>this</code>) will be bound to <code>oListener</code> if specified, otherwise it will be bound
    * to this <code>sap.m.SplitContainer</code> itself.Fires when navigation between two pages in master
    * area has been triggered. The transition (if any) to the new page has not started yet.This event can
    * be aborted by the application with preventDefault(), which means that there will be no navigation.
    * @param oData An application-specific payload object that will be passed to the event handler along
    * with the event object when firing the event
    * @param fnFunction The function to be called when the event occurs
    * @param oListener Context object to call the event handler with. Defaults to this
    * <code>sap.m.SplitContainer</code> itself
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def attachMasterNavigate(oData: js.Any, fnFunction: js.Any): SplitContainer = js.native
  def attachMasterNavigate(oData: js.Any, fnFunction: js.Any, oListener: js.Any): SplitContainer = js.native
  /**
    * Navigates back to the previous detail page found in the history.
    * @param oBackData This optional object can carry any payload data which should be made available to
    * the target page of the back navigation. The event on the target page will contain this data object
    * as backData property. (The original data from the to() navigation will still be available as data
    * property.)        In scenarios where the entity triggering the navigation can or should not directly
    * initialize the target page, it can fill this object and the target page itself (or a listener on it)
    * can take over the initialization, using the given data.        For back navigation this can be used,
    * for example, when returning from a detail page to transfer any settings done there.        When the
    * transitionParameters object is used, this data object must also be given (either as object or as
    * null) in order to have a proper parameter order.
    * @param oTransitionParameter This optional object can give additional information to the transition
    * function, like the DOM element, which triggered the transition or the desired transition duration.  
    *      The animation type can NOT be selected here - it is always the inverse of the "to" navigation. 
    *       In order to use the transitionParameters property, the data property must be used (at least
    * "null" must be given) for a proper parameter order.        NOTE: it depends on the transition
    * function how the object should be structured and which parameters are actually used to influence the
    * transition.
    */
  def backDetail(oBackData: js.Any, oTransitionParameter: js.Any): SplitContainer = js.native
  /**
    * Navigates back to the previous master page which is found in the history.
    * @param oBackData This optional object can carry any payload data which should be made available to
    * the target page of the back navigation.        The event on the target page will contain this data
    * object as backData property (the original data from the to() navigation will still be available as
    * data property).        In scenarios where the entity triggering the navigation can or should not
    * directly initialize the target page, it can fill this object and the target page itself (or a
    * listener on it) can take over the initialization, using the given data.        For back navigation
    * this can be used, for example, when returning from a detail page to transfer any settings done
    * there.        When the transitionParameters object is used, this data object must also be given
    * (either as object or as null) in order to have a proper parameter order.
    * @param oTransitionParameter This optional object can give additional information to the transition
    * function, like the DOM element, which triggered the transition or the desired transition duration.  
    *      The animation type can NOT be selected here - it is always the inverse of the "to" navigation. 
    *       In order to use the transitionParameters property, the data property must be used (at least
    * "null" must be given) for a proper parameter order.        NOTE: it depends on the transition
    * function how the object should be structured and which parameters are actually used to influence the
    * transition.
    */
  def backMaster(oBackData: js.Any, oTransitionParameter: js.Any): SplitContainer = js.native
  /**
    * Navigates back to the nearest previous page in the SplitContainer history with the given ID (if
    * there is no such page among the previous pages, nothing happens).The transition effect, which had
    * been used to get to the current page is inverted and used for this navigation.Calling this
    * navigation method, first triggers the (cancelable) navigate event on the SplitContainer,then the
    * beforeHide pseudo event on the source page, beforeFirstShow (if applicable),and beforeShow on the
    * target page. Later, after the transition has completed,the afterShow pseudo event is triggered on
    * the target page and afterHide - on the page, which has been left.The given backData object is
    * available in the beforeFirstShow, beforeShow, and afterShow event objects as dataproperty. The
    * original "data" object from the "to" navigation is also available in these event objects.
    * @since 1.10.0
    * @param sPageId The screen to which is being navigated to. The ID or the control itself can be given.
    * @param oBackData This optional object can carry any payload data which should be made available to
    * the target page of the back navigation.        The event on the target page will contain this data
    * object as backData property. (the original data from the to() navigation will still be available as
    * data property).        In scenarios, where the entity triggering the navigation can't or shouldn't
    * directly initialize the target page, it can fill this object and the target page itself (or a
    * listener on it) can take over the initialization, using the given data.        For back navigation
    * this can be used, for example, when returning from a detail page to transfer any settings done
    * there.        When the transitionParameters object is used, this data object must also be given
    * (either as object or as null) in order to have a proper parameter order.
    * @param oTransitionParameters This optional object can give additional information to the transition
    * function, like the DOM element, which triggered the transition or the desired transition duration.  
    *      The animation type can NOT be selected here - it is always the inverse of the "to" navigation. 
    *       In order to use the transitionParameters property, the data property must be used (at least
    * "null" must be given) for a proper parameter order.        NOTE: it depends on the transition
    * function how the object should be structured and which parameters are actually used to influence the
    * transition.
    */
  def backToPage(sPageId: String, oBackData: js.Any, oTransitionParameters: js.Any): SplitContainer = js.native
  /**
    * Navigates back to the initial/top level of Detail (this is the element aggregated as initialPage, or
    * the first added element).NOTE: If already on the initial page, nothing happens.The transition effect
    * which had been used to get to the current page is inverted and used for this navigation.
    * @param oBackData This optional object can carry any payload data which should be made available to
    * the target page of the back navigation. The event on the target page will contain this data object
    * as backData property (the original data from the to() navigation will still be available as data
    * property).        In scenarios where the entity triggering the navigation can or should not directly
    * initialize the target page, it can fill this object and the target page itself (or a listener on it)
    * can take over the initialization, using the given data.        For back navigation this can be used,
    * for example, when returning from a detail page to transfer any settings done there.        When the
    * transitionParameters object is used, this data object must also be given (either as object or as
    * null) in order to have a proper parameter order.
    * @param oTransitionParameter This optional object can give additional information to the transition
    * function, like the DOM element, which triggered the transition or the desired transition duration.  
    *      The animation type can NOT be selected here - it is always the inverse of the "to" navigation. 
    *       In order to use the transitionParameters property, the data property must be used (at least
    * "null" must be given) for a proper parameter order.        NOTE: it depends on the transition
    * function how the object should be structured and which parameters are actually used to influence the
    * transition.
    */
  def backToTopDetail(oBackData: js.Any, oTransitionParameter: js.Any): Control = js.native
  /**
    * Navigates back to the initial/top level of Master (this is the element aggregated as "initialPage",
    * or the first added element).NOTE: If already on the initial page, nothing happens.The transition
    * effect which had been used to get to the current page is inverted and used for this navigation.
    * @param oBackData This optional object can carry any payload data which should be made available to
    * the target page of the back navigation. The event on the target page will contain this data object
    * as "backData" property. (The original data from the "to()" navigation will still be available as
    * "data" property.)        In scenarios where the entity triggering the navigation can or should not
    * directly initialize the target page, it can fill this object and the target page itself (or a
    * listener on it) can take over the initialization, using the given data.        For back navigation
    * this can be used e.g. when returning from a detail page to transfer any settings done there.       
    * When the "transitionParameters" object is used, this "data" object must also be given (either as
    * object or as null) in order to have a proper parameter order.
    * @param oTransitionParameter This optional object can give additional information to the transition
    * function, like the DOM element which triggered the transition or the desired transition duration.   
    *     The animation type can NOT be selected here - it is always the inverse of the "to" navigation.  
    *      In order to use the transitionParameters property, the data property must be used (at least
    * "null" must be given) for a proper parameter order.        NOTE: it depends on the transition
    * function how the object should be structured and which parameters are actually used to influence the
    * transition.
    */
  def backToTopMaster(oBackData: js.Any, oTransitionParameter: js.Any): Control = js.native
  /**
    * Destroys all the detailPages in the aggregation <code>detailPages</code>.
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def destroyDetailPages(): SplitContainer = js.native
  /**
    * Destroys all the masterPages in the aggregation <code>masterPages</code>.
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def destroyMasterPages(): SplitContainer = js.native
  /**
    * Detaches event handler <code>fnFunction</code> from the <code>afterDetailNavigate</code> event of
    * this <code>sap.m.SplitContainer</code>.The passed function and listener object must match the ones
    * used for event registration.
    * @param fnFunction The function to be called, when the event occurs
    * @param oListener Context object on which the given function had to be called
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def detachAfterDetailNavigate(fnFunction: js.Any, oListener: js.Any): SplitContainer = js.native
  /**
    * Detaches event handler <code>fnFunction</code> from the <code>afterMasterClose</code> event of this
    * <code>sap.m.SplitContainer</code>.The passed function and listener object must match the ones used
    * for event registration.
    * @param fnFunction The function to be called, when the event occurs
    * @param oListener Context object on which the given function had to be called
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def detachAfterMasterClose(fnFunction: js.Any, oListener: js.Any): SplitContainer = js.native
  /**
    * Detaches event handler <code>fnFunction</code> from the <code>afterMasterNavigate</code> event of
    * this <code>sap.m.SplitContainer</code>.The passed function and listener object must match the ones
    * used for event registration.
    * @param fnFunction The function to be called, when the event occurs
    * @param oListener Context object on which the given function had to be called
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def detachAfterMasterNavigate(fnFunction: js.Any, oListener: js.Any): SplitContainer = js.native
  /**
    * Detaches event handler <code>fnFunction</code> from the <code>afterMasterOpen</code> event of this
    * <code>sap.m.SplitContainer</code>.The passed function and listener object must match the ones used
    * for event registration.
    * @param fnFunction The function to be called, when the event occurs
    * @param oListener Context object on which the given function had to be called
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def detachAfterMasterOpen(fnFunction: js.Any, oListener: js.Any): SplitContainer = js.native
  /**
    * Detaches event handler <code>fnFunction</code> from the <code>beforeMasterClose</code> event of this
    * <code>sap.m.SplitContainer</code>.The passed function and listener object must match the ones used
    * for event registration.
    * @param fnFunction The function to be called, when the event occurs
    * @param oListener Context object on which the given function had to be called
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def detachBeforeMasterClose(fnFunction: js.Any, oListener: js.Any): SplitContainer = js.native
  /**
    * Detaches event handler <code>fnFunction</code> from the <code>beforeMasterOpen</code> event of this
    * <code>sap.m.SplitContainer</code>.The passed function and listener object must match the ones used
    * for event registration.
    * @param fnFunction The function to be called, when the event occurs
    * @param oListener Context object on which the given function had to be called
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def detachBeforeMasterOpen(fnFunction: js.Any, oListener: js.Any): SplitContainer = js.native
  /**
    * Detaches event handler <code>fnFunction</code> from the <code>detailNavigate</code> event of this
    * <code>sap.m.SplitContainer</code>.The passed function and listener object must match the ones used
    * for event registration.
    * @param fnFunction The function to be called, when the event occurs
    * @param oListener Context object on which the given function had to be called
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def detachDetailNavigate(fnFunction: js.Any, oListener: js.Any): SplitContainer = js.native
  /**
    * Detaches event handler <code>fnFunction</code> from the <code>masterButton</code> event of this
    * <code>sap.m.SplitContainer</code>.The passed function and listener object must match the ones used
    * for event registration.
    * @param fnFunction The function to be called, when the event occurs
    * @param oListener Context object on which the given function had to be called
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def detachMasterButton(fnFunction: js.Any, oListener: js.Any): SplitContainer = js.native
  /**
    * Detaches event handler <code>fnFunction</code> from the <code>masterNavigate</code> event of this
    * <code>sap.m.SplitContainer</code>.The passed function and listener object must match the ones used
    * for event registration.
    * @param fnFunction The function to be called, when the event occurs
    * @param oListener Context object on which the given function had to be called
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def detachMasterNavigate(fnFunction: js.Any, oListener: js.Any): SplitContainer = js.native
  /**
    * Fires event <code>afterDetailNavigate</code> to attached listeners.Expects the following event
    * parameters:<ul><li><code>from</code> of type <code>sap.ui.core.Control</code>The page, which had
    * been displayed before navigation.</li><li><code>fromId</code> of type <code>string</code>The ID of
    * the page, which had been displayed before navigation.</li><li><code>to</code> of type
    * <code>sap.ui.core.Control</code>The page, which is now displayed after
    * navigation.</li><li><code>toId</code> of type <code>string</code>The ID of the page, which is now
    * displayed after navigation.</li><li><code>firstTime</code> of type <code>boolean</code>Determines
    * whether the "to" page (more precisely: a control with the ID of the page,which has been navigated
    * to) has not been displayed/navigated to before.</li><li><code>isTo</code> of type
    * <code>boolean</code>Determines whether was a forward navigation, triggered by
    * to().</li><li><code>isBack</code> of type <code>boolean</code>Determines whether this was a back
    * navigation, triggered by back().</li><li><code>isBackToTop</code> of type
    * <code>boolean</code>Determines whether this was a navigation to the root page, triggered by
    * backToTop().</li><li><code>isBackToPage</code> of type <code>boolean</code>Determines whether this
    * was a navigation to a specific page, triggered by backToPage().</li><li><code>direction</code> of
    * type <code>string</code>Determines how the navigation was triggered, possible values are "to",
    * "back", "backToPage", and "backToTop".</li></ul>
    * @param mArguments The arguments to pass along with the event
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def fireAfterDetailNavigate(mArguments: js.Any): SplitContainer = js.native
  /**
    * Fires event <code>afterMasterClose</code> to attached listeners.
    * @param mArguments The arguments to pass along with the event
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def fireAfterMasterClose(mArguments: js.Any): SplitContainer = js.native
  /**
    * Fires event <code>afterMasterNavigate</code> to attached listeners.Expects the following event
    * parameters:<ul><li><code>from</code> of type <code>sap.ui.core.Control</code>The page, which had
    * been displayed before navigation.</li><li><code>fromId</code> of type <code>string</code>The ID of
    * the page, which had been displayed before navigation.</li><li><code>to</code> of type
    * <code>sap.ui.core.Control</code>The page, which is now displayed after
    * navigation.</li><li><code>toId</code> of type <code>string</code>The ID of the page, which is now
    * displayed after navigation.</li><li><code>firstTime</code> of type <code>boolean</code>Whether the
    * "to" page (more precisely: a control with the ID of the page, which has been navigated to)has not
    * been displayed/navigated to before.</li><li><code>isTo</code> of type <code>boolean</code>Determines
    * whether was a forward navigation, triggered by to().</li><li><code>isBack</code> of type
    * <code>boolean</code>Determines whether this was a back navigation, triggered by
    * back().</li><li><code>isBackToTop</code> of type <code>boolean</code>Determines whether this was a
    * navigation to the root page, triggered by backToTop().</li><li><code>isBackToPage</code> of type
    * <code>boolean</code>Determines whether this was a navigation to a specific page, triggered by
    * backToPage().</li><li><code>direction</code> of type <code>string</code>Determines how the
    * navigation was triggered, possible values are "to", "back", "backToPage", and "backToTop".</li></ul>
    * @param mArguments The arguments to pass along with the event
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def fireAfterMasterNavigate(mArguments: js.Any): SplitContainer = js.native
  /**
    * Fires event <code>afterMasterOpen</code> to attached listeners.
    * @param mArguments The arguments to pass along with the event
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def fireAfterMasterOpen(mArguments: js.Any): SplitContainer = js.native
  /**
    * Fires event <code>beforeMasterClose</code> to attached listeners.
    * @param mArguments The arguments to pass along with the event
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def fireBeforeMasterClose(mArguments: js.Any): SplitContainer = js.native
  /**
    * Fires event <code>beforeMasterOpen</code> to attached listeners.
    * @param mArguments The arguments to pass along with the event
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def fireBeforeMasterOpen(mArguments: js.Any): SplitContainer = js.native
  /**
    * Fires event <code>detailNavigate</code> to attached listeners.Listeners may prevent the default
    * action of this event by using the <code>preventDefault</code>-method on the event object.Expects the
    * following event parameters:<ul><li><code>from</code> of type <code>sap.ui.core.Control</code>The
    * page, which was displayed before the current navigation.</li><li><code>fromId</code> of type
    * <code>string</code>The ID of the page, which was displayed before the current
    * navigation.</li><li><code>to</code> of type <code>sap.ui.core.Control</code>The page, which will be
    * displayed after the current navigation.</li><li><code>toId</code> of type <code>string</code>The ID
    * of the page, which will be displayed after the current navigation.</li><li><code>firstTime</code> of
    * type <code>boolean</code>Determines whether the "to" page (more precisely: a control with the ID of
    * the page,which is currently navigated to) has not been displayed/navigated to
    * before.</li><li><code>isTo</code> of type <code>boolean</code>Determines whether this is a forward
    * navigation, triggered by to().</li><li><code>isBack</code> of type <code>boolean</code>Determines
    * whether this is a back navigation, triggered by back().</li><li><code>isBackToTop</code> of type
    * <code>boolean</code>Determines whether this is a navigation to the root page, triggered by
    * backToTop().</li><li><code>isBackToPage</code> of type <code>boolean</code>Determines whether this
    * was a navigation to a specific page, triggered by backToPage().</li><li><code>direction</code> of
    * type <code>string</code>Determines how the navigation was triggered, possible values are "to",
    * "back", "backToPage", and "backToTop".</li></ul>
    * @param mArguments The arguments to pass along with the event
    * @returns Whether or not to prevent the default action
    */
  def fireDetailNavigate(mArguments: js.Any): Boolean = js.native
  /**
    * Fires event <code>masterButton</code> to attached listeners.
    * @param mArguments The arguments to pass along with the event
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def fireMasterButton(mArguments: js.Any): SplitContainer = js.native
  /**
    * Fires event <code>masterNavigate</code> to attached listeners.Listeners may prevent the default
    * action of this event by using the <code>preventDefault</code>-method on the event object.Expects the
    * following event parameters:<ul><li><code>from</code> of type <code>sap.ui.core.Control</code>The
    * page, which was displayed before the current navigation.</li><li><code>fromId</code> of type
    * <code>string</code>The ID of the page, which was displayed before the current
    * navigation.</li><li><code>to</code> of type <code>sap.ui.core.Control</code>The page, which will be
    * displayed after the current navigation.</li><li><code>toId</code> of type <code>string</code>The ID
    * of the page, which will be displayed after the current navigation.</li><li><code>firstTime</code> of
    * type <code>boolean</code>Determines whether the "to" page (more precisely: a control with the ID of
    * the page,which is currently being navigated to) has not been displayed/navigated to
    * before.</li><li><code>isTo</code> of type <code>boolean</code>Determines whether this is a forward
    * navigation, triggered by to().</li><li><code>isBack</code> of type <code>boolean</code>Determines
    * whether this is a back navigation, triggered by back().</li><li><code>isBackToTop</code> of type
    * <code>boolean</code>Determines whether this is a navigation to the root page, triggered by
    * backToTop().</li><li><code>isBackToPage</code> of type <code>boolean</code>Determines whether this
    * was a navigation to a specific page, triggered by backToPage().</li><li><code>direction</code> of
    * type <code>string</code>Determines how the navigation was triggered, possible values are "to",
    * "back", "backToPage", and "backToTop".</li></ul>
    * @param mArguments The arguments to pass along with the event
    * @returns Whether or not to prevent the default action
    */
  def fireMasterNavigate(mArguments: js.Any): Boolean = js.native
  /**
    * Gets current value of property <code>backgroundColor</code>.Determines the background color of the
    * SplitContainer. If set, this color overrides the default one,which is defined by the theme (should
    * only be used when really required).Any configured background image will be placed above this colored
    * background,but any theme adaptation in the Theme Designer will override this setting.Use the
    * backgroundRepeat property to define whether this image should be stretchedto cover the complete
    * SplitContainer or whether it should be tiled.
    * @since 1.11.2
    * @returns Value of property <code>backgroundColor</code>
    */
  def getBackgroundColor(): String = js.native
  /**
    * Gets current value of property <code>backgroundImage</code>.Sets the background image of the
    * SplitContainer. When set, this image overridesthe default background defined by the theme (should
    * only be used when really required).This background image will be placed above any color set for the
    * background,but any theme adaptation in the Theme Designer will override this image setting.Use the
    * backgroundRepeat property to define whether this image should be stretchedto cover the complete
    * SplitContainer or whether it should be tiled.
    * @since 1.11.2
    * @returns Value of property <code>backgroundImage</code>
    */
  def getBackgroundImage(): js.Any = js.native
  /**
    * Gets current value of property <code>backgroundOpacity</code>.Defines the opacity of the background
    * image - between 0 (fully transparent) and 1 (fully opaque).This can be used to improve the content
    * visibility by making the background image partly transparent.Default value is <code>1</code>.
    * @since 1.11.2
    * @returns Value of property <code>backgroundOpacity</code>
    */
  def getBackgroundOpacity(): Double = js.native
  /**
    * Gets current value of property <code>backgroundRepeat</code>.Defines whether the background image
    * (if configured) is proportionally stretchedto cover the whole SplitContainer (false) or whether it
    * should be tiled (true).Default value is <code>false</code>.
    * @since 1.11.2
    * @returns Value of property <code>backgroundRepeat</code>
    */
  def getBackgroundRepeat(): Boolean = js.native
  /**
    * Returns the current displayed detail page.
    */
  def getCurrentDetailPage(): Control = js.native
  /**
    * Returns the current displayed master page.
    */
  def getCurrentMasterPage(): Control = js.native
  /**
    * Returns the currently displayed page either in master area or in detail area.When the parameter is
    * set to true, the current page in master area is returned, otherwise, the current page in detail area
    * is returned.This method is provided mainly for API consistency between sap.m.SplitContainer and
    * sap.m.App, so that the same code line can be reused.
    * @since 1.11.1
    * @param bMaster States if this function returns the current page in master area. If it's set to
    * false, the current page in detail area will be returned.
    */
  def getCurrentPage(bMaster: Boolean): Control = js.native
  /**
    * Gets current value of property <code>defaultTransitionNameDetail</code>.Determines the type of the
    * transition/animation to apply when to() is called without defining thetransition to use. The default
    * is "slide", other options are "fade", "show", and the names of any registered custom
    * transitions.Default value is <code>slide</code>.
    * @returns Value of property <code>defaultTransitionNameDetail</code>
    */
  def getDefaultTransitionNameDetail(): String = js.native
  /**
    * Gets current value of property <code>defaultTransitionNameMaster</code>.Determines the type of the
    * transition/animation to apply when to() is called, without defining thetransition to use. The
    * default is "slide", other options are "fade", "show", and the names of any registered custom
    * transitions.Default value is <code>slide</code>.
    * @returns Value of property <code>defaultTransitionNameMaster</code>
    */
  def getDefaultTransitionNameMaster(): String = js.native
  /**
    * Returns the page with the given ID in detail area. If there's no page that has the given ID, null is
    * returned.
    * @since 1.11.1
    * @param sId The ID of the page that needs to be fetched.
    */
  def getDetailPage(sId: String): Control = js.native
  /**
    * Gets content of aggregation <code>detailPages</code>.Determines the content entities, between which
    * the SplitContainer navigates in detail area.These can be of type sap.m.Page, sap.ui.core.View,
    * sap.m.Carousel or any other control with fullscreen/page semantics.These aggregated controls receive
    * navigation events like {@link sap.m.NavContainerChild#beforeShow beforeShow},they are documented in
    * the pseudo interface {@link sap.m.NavContainerChild sap.m.NavContainerChild}.
    */
  def getDetailPages(): js.Array[Control] = js.native
  /**
    * ID of the element which is the current target of the association <code>initialDetail</code>, or
    * <code>null</code>.
    */
  def getInitialDetail(): js.Any = js.native
  /**
    * ID of the element which is the current target of the association <code>initialMaster</code>, or
    * <code>null</code>.
    */
  def getInitialMaster(): js.Any = js.native
  /**
    * Gets current value of property <code>masterButtonText</code>.Determines the text displayed in master
    * button, which has a default value "Navigation".This text is only displayed in iOS platform and the
    * icon from the current page in detail area isdisplayed in the master button for the other
    * platforms.The master button is shown/hidden depending on the orientation of the device and
    * whetherthe master area is opened or not. SplitContainer manages the show/hide of the master button
    * by itselfonly when the pages added to the detail area are sap.m.Page with built-in header or
    * sap.m.Pagewith built-in header, which is wrapped by one or several sap.ui.core.mvc.View.Otherwise,
    * the show/hide of master button needs to be managed by the application.
    * @returns Value of property <code>masterButtonText</code>
    */
  def getMasterButtonText(): String = js.native
  /**
    * Returns the page with the given ID in master area (if there's no page that has the given ID, null is
    * returned).
    * @since 1.11.1
    * @param sId The ID of the page that needs to be fetched
    */
  def getMasterPage(sId: String): Control = js.native
  /**
    * Gets content of aggregation <code>masterPages</code>.Determines the content entities, between which
    * the SplitContainer navigates in master area.These can be of type sap.m.Page, sap.ui.core.View,
    * sap.m.Carousel or any other control with fullscreen/page semantics.These aggregated controls receive
    * navigation events like {@link sap.m.NavContainerChild#beforeShow beforeShow},they are documented in
    * the pseudo interface {@link sap.m.NavContainerChild sap.m.NavContainerChild}.
    */
  def getMasterPages(): js.Array[Control] = js.native
  /**
    * Gets current value of property <code>mode</code>.Defines whether the master page will always be
    * displayed (in portrait and landscape mode - StretchCompressMode),or if it should be hidden when in
    * portrait mode (ShowHideMode). Default is ShowHideMode.Other possible values are Hide (Master is
    * always hidden) and Popover (master is displayed in popover).Default value is
    * <code>ShowHideMode</code>.
    * @returns Value of property <code>mode</code>
    */
  def getMode(): SplitAppMode = js.native
  /**
    * Returns the page with the given ID from either master area, or detail area depending on the master
    * parameter (if there's no page that has the given ID, null is returned).
    * @since 1.11.1
    * @param sId The ID of the page that needs to be fetched
    * @param bMaster If the page with given ID should be fetched from the master area. If it's set to
    * false, the page will be fetched from detail area.
    */
  def getPage(sId: String, bMaster: Boolean): Control = js.native
  /**
    * Returns the previous page (the page, from which the user drilled down to the current page with
    * to()).Note: this is not the page, which the user has seen before, but the page which is the target
    * of the next back() navigation.If there is no previous page, "undefined" is returned.
    * @param bMaster States if this function returns the previous page in master area. If it's set to
    * false, the previous page in detail area will be returned.
    */
  def getPreviousPage(bMaster: Boolean): Control = js.native
  /**
    * Used to hide the master page when in ShowHideMode and the device is in portrait mode.
    */
  def hideMaster(): SplitContainer = js.native
  /**
    * Checks for the provided <code>sap.ui.core.Control</code> in the aggregation
    * <code>detailPages</code>.and returns its index if found or -1 otherwise.
    * @param oDetailPage The detailPage whose index is looked for
    * @returns The index of the provided control in the aggregation if found, or -1 otherwise
    */
  def indexOfDetailPage(oDetailPage: Control): Double = js.native
  /**
    * Checks for the provided <code>sap.ui.core.Control</code> in the aggregation
    * <code>masterPages</code>.and returns its index if found or -1 otherwise.
    * @param oMasterPage The masterPage whose index is looked for
    * @returns The index of the provided control in the aggregation if found, or -1 otherwise
    */
  def indexOfMasterPage(oMasterPage: Control): Double = js.native
  /**
    * Inserts a detailPage into the aggregation <code>detailPages</code>.
    * @param oDetailPage the detailPage to insert; if empty, nothing is inserted
    * @param iIndex the <code>0</code>-based index the detailPage should be inserted at; for             a
    * negative value of <code>iIndex</code>, the detailPage is inserted at position 0; for a value        
    *     greater than the current size of the aggregation, the detailPage is inserted at             the
    * last position
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def insertDetailPage(oDetailPage: Control, iIndex: Double): SplitContainer = js.native
  /**
    * Inserts a masterPage into the aggregation <code>masterPages</code>.
    * @param oMasterPage the masterPage to insert; if empty, nothing is inserted
    * @param iIndex the <code>0</code>-based index the masterPage should be inserted at; for             a
    * negative value of <code>iIndex</code>, the masterPage is inserted at position 0; for a value        
    *     greater than the current size of the aggregation, the masterPage is inserted at             the
    * last position
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def insertMasterPage(oMasterPage: Control, iIndex: Double): SplitContainer = js.native
  /**
    * Inserts the page/control with the specified ID into the navigation history stack of the
    * NavContainer.This can be used for deep-linking when the user directly reached a drilldown detail
    * page using a bookmark and then wants to navigate up in the drilldown hierarchy.Normally, such a back
    * navigation would not be possible as there is no previous page in the SplitContainer's history stack.
    * @param sPageId The ID of the control/page/screen, which is inserted into the history stack. The
    * respective control must be aggregated by the SplitContainer, otherwise this will cause an error.
    * @param sTransitionName The type of the transition/animation, which would have been used to navigate
    * from the (inserted) previous page to the current page. When navigating back, the inverse animation
    * will be applied.        This parameter can be omitted; then the default value is "slide" (horizontal
    * movement from the right).
    * @param oData This optional object can carry any payload data which would have been given to the
    * inserted previous page if the user would have done a normal forward navigation to it.
    */
  def insertPreviousPage(sPageId: String, sTransitionName: String, oData: js.Any): SplitContainer = js.native
  /**
    * Returns whether master area is currently displayed on the screen.In desktop browser or tablet, this
    * method returns true when master area is displayed on the screen, regardless if in portrait or
    * landscape mode.On mobile phone devices, this method returns true when the currently displayed page
    * is from the pages, which are added to the master area, otherwise, it returns false.
    * @since 1.16.5
    */
  def isMasterShown(): Boolean = js.native
  /**
    * Removes all the controls from the aggregation <code>detailPages</code>.Additionally, it unregisters
    * them from the hosting UIArea.
    * @returns An array of the removed elements (might be empty)
    */
  def removeAllDetailPages(): js.Array[Control] = js.native
  /**
    * Removes all the controls from the aggregation <code>masterPages</code>.Additionally, it unregisters
    * them from the hosting UIArea.
    * @returns An array of the removed elements (might be empty)
    */
  def removeAllMasterPages(): js.Array[Control] = js.native
  def removeDetailPage(vDetailPage: String): Control = js.native
  /**
    * Removes a detailPage from the aggregation <code>detailPages</code>.
    * @param vDetailPage The detailPage to remove or its index or id
    * @returns The removed detailPage or <code>null</code>
    */
  def removeDetailPage(vDetailPage: Double): Control = js.native
  def removeDetailPage(vDetailPage: Control): Control = js.native
  def removeMasterPage(vMasterPage: String): Control = js.native
  /**
    * Removes a masterPage from the aggregation <code>masterPages</code>.
    * @param vMasterPage The masterPage to remove or its index or id
    * @returns The removed masterPage or <code>null</code>
    */
  def removeMasterPage(vMasterPage: Double): Control = js.native
  def removeMasterPage(vMasterPage: Control): Control = js.native
  /**
    * Sets a new value for property <code>backgroundColor</code>.Determines the background color of the
    * SplitContainer. If set, this color overrides the default one,which is defined by the theme (should
    * only be used when really required).Any configured background image will be placed above this colored
    * background,but any theme adaptation in the Theme Designer will override this setting.Use the
    * backgroundRepeat property to define whether this image should be stretchedto cover the complete
    * SplitContainer or whether it should be tiled.When called with a value of <code>null</code> or
    * <code>undefined</code>, the default value of the property will be restored.
    * @since 1.11.2
    * @param sBackgroundColor New value for property <code>backgroundColor</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setBackgroundColor(sBackgroundColor: String): SplitContainer = js.native
  /**
    * Sets a new value for property <code>backgroundImage</code>.Sets the background image of the
    * SplitContainer. When set, this image overridesthe default background defined by the theme (should
    * only be used when really required).This background image will be placed above any color set for the
    * background,but any theme adaptation in the Theme Designer will override this image setting.Use the
    * backgroundRepeat property to define whether this image should be stretchedto cover the complete
    * SplitContainer or whether it should be tiled.When called with a value of <code>null</code> or
    * <code>undefined</code>, the default value of the property will be restored.
    * @since 1.11.2
    * @param sBackgroundImage New value for property <code>backgroundImage</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setBackgroundImage(sBackgroundImage: js.Any): SplitContainer = js.native
  /**
    * Sets a new value for property <code>backgroundOpacity</code>.Defines the opacity of the background
    * image - between 0 (fully transparent) and 1 (fully opaque).This can be used to improve the content
    * visibility by making the background image partly transparent.When called with a value of
    * <code>null</code> or <code>undefined</code>, the default value of the property will be
    * restored.Default value is <code>1</code>.
    * @since 1.11.2
    * @param fBackgroundOpacity New value for property <code>backgroundOpacity</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setBackgroundOpacity(fBackgroundOpacity: Double): SplitContainer = js.native
  /**
    * Sets a new value for property <code>backgroundRepeat</code>.Defines whether the background image (if
    * configured) is proportionally stretchedto cover the whole SplitContainer (false) or whether it
    * should be tiled (true).When called with a value of <code>null</code> or <code>undefined</code>, the
    * default value of the property will be restored.Default value is <code>false</code>.
    * @since 1.11.2
    * @param bBackgroundRepeat New value for property <code>backgroundRepeat</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setBackgroundRepeat(bBackgroundRepeat: Boolean): SplitContainer = js.native
  /**
    * Sets a new value for property <code>defaultTransitionNameDetail</code>.Determines the type of the
    * transition/animation to apply when to() is called without defining thetransition to use. The default
    * is "slide", other options are "fade", "show", and the names of any registered custom
    * transitions.When called with a value of <code>null</code> or <code>undefined</code>, the default
    * value of the property will be restored.Default value is <code>slide</code>.
    * @param sDefaultTransitionNameDetail New value for property <code>defaultTransitionNameDetail</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setDefaultTransitionNameDetail(sDefaultTransitionNameDetail: String): SplitContainer = js.native
  /**
    * Sets a new value for property <code>defaultTransitionNameMaster</code>.Determines the type of the
    * transition/animation to apply when to() is called, without defining thetransition to use. The
    * default is "slide", other options are "fade", "show", and the names of any registered custom
    * transitions.When called with a value of <code>null</code> or <code>undefined</code>, the default
    * value of the property will be restored.Default value is <code>slide</code>.
    * @param sDefaultTransitionNameMaster New value for property <code>defaultTransitionNameMaster</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setDefaultTransitionNameMaster(sDefaultTransitionNameMaster: String): SplitContainer = js.native
  /**
    * Sets the associated <code>initialDetail</code>.
    * @param oInitialDetail ID of an element which becomes the new target of this initialDetail
    * association; alternatively, an element instance may be given
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setInitialDetail(oInitialDetail: js.Any): SplitContainer = js.native
  def setInitialDetail(oInitialDetail: Control): SplitContainer = js.native
  /**
    * Sets the associated <code>initialMaster</code>.
    * @param oInitialMaster ID of an element which becomes the new target of this initialMaster
    * association; alternatively, an element instance may be given
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setInitialMaster(oInitialMaster: js.Any): SplitContainer = js.native
  def setInitialMaster(oInitialMaster: Control): SplitContainer = js.native
  /**
    * Sets a new value for property <code>masterButtonText</code>.Determines the text displayed in master
    * button, which has a default value "Navigation".This text is only displayed in iOS platform and the
    * icon from the current page in detail area isdisplayed in the master button for the other
    * platforms.The master button is shown/hidden depending on the orientation of the device and
    * whetherthe master area is opened or not. SplitContainer manages the show/hide of the master button
    * by itselfonly when the pages added to the detail area are sap.m.Page with built-in header or
    * sap.m.Pagewith built-in header, which is wrapped by one or several sap.ui.core.mvc.View.Otherwise,
    * the show/hide of master button needs to be managed by the application.When called with a value of
    * <code>null</code> or <code>undefined</code>, the default value of the property will be restored.
    * @param sMasterButtonText New value for property <code>masterButtonText</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setMasterButtonText(sMasterButtonText: String): SplitContainer = js.native
  /**
    * Sets a new value for property <code>mode</code>.Defines whether the master page will always be
    * displayed (in portrait and landscape mode - StretchCompressMode),or if it should be hidden when in
    * portrait mode (ShowHideMode). Default is ShowHideMode.Other possible values are Hide (Master is
    * always hidden) and Popover (master is displayed in popover).When called with a value of
    * <code>null</code> or <code>undefined</code>, the default value of the property will be
    * restored.Default value is <code>ShowHideMode</code>.
    * @param sMode New value for property <code>mode</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setMode(sMode: SplitAppMode): SplitContainer = js.native
  /**
    * Used to make the master page visible when in ShowHideMode and the device is in portrait mode.
    */
  def showMaster(): SplitContainer = js.native
  /**
    * Navigates to the given page inside the SplitContainer.The navigation is done inside the master area
    * if the page has been added,otherwise, it tries to do the page navigation in the detail area.
    * @since 1.10.0
    * @param sPageId The screen to which we are navigating to. The ID or the control itself can be given.
    * @param sTransitionName The type of the transition/animation to apply. This parameter can be omitted;
    * then the default value is "slide" (horizontal movement from the right).        Other options are:
    * "fade", "flip", and "show" and the names of any registered custom transitions.        None of the
    * standard transitions is currently making use of any given transition parameters.
    * @param oData This optional object can carry any payload data which should be made available to the
    * target page. The beforeShow event on the target page will contain this data object as data property.
    *        Use case: in scenarios where the entity triggering the navigation can or should not directly
    * initialize the target page, it can fill this object and the target page itself (or a listener on it)
    * can take over the initialization, using the given data.        When the transitionParameters object
    * is used, this "data" object must also be given (either as object or as null) in order to have a
    * proper parameter order.
    * @param oTransitionParameters This optional object can contain additional information for the
    * transition function, like the DOM element which triggered the transition or the desired transition
    * duration.        For a proper parameter order, the "data" parameter must be given when the
    * transitionParameters parameter is used (it can be given as "null").        NOTE: It depends on the
    * transition function how the object should be structured and which parameters are actually used to
    * influence the transition.        The "show", "slide" and "fade" transitions do not use any
    * parameter.
    */
  def to(sPageId: String, sTransitionName: String, oData: js.Any, oTransitionParameters: js.Any): SplitContainer = js.native
  /**
    * Navigates to a given detail page.
    * @param sPageId undefined
    * @param sTransitionName The type of the transition/animation to apply. This parameter can be omitted;
    * then the default is "slide" (horizontal movement from the right).        Other options are: "fade",
    * "flip", and "show" and the names of any registered custom transitions.        None of the standard
    * transitions is currently making use of any given transition parameters.
    * @param oData This optional object can carry any payload data which should be made available to the
    * target page. The beforeShow event on the target page will contain this data object as data property.
    *        Use case: in scenarios where the entity triggering the navigation can or should not directly
    * initialize the target page, it can fill this object and the target page itself (or a listener on it)
    * can take over the initialization, using the given data.        When the transitionParameters object
    * is used, this data object must also be given (either as object or as null) in order to have a proper
    * parameter order.
    * @param oTransitionParameter This optional object can contain additional information for the
    * transition function, like the DOM element, which triggered the transition or the desired transition
    * duration.        For a proper parameter order, the data parameter must be given when the
    * transitionParameters parameter is used (it can be given as "null").        NOTE: it depends on the
    * transition function how the object should be structured and which parameters are actually used to
    * influence the transition.        The "show", "slide" and "fade" transitions do not use any
    * parameter.
    */
  def toDetail(sPageId: String, sTransitionName: String, oData: js.Any, oTransitionParameter: js.Any): SplitContainer = js.native
  /**
    * Navigates to a given master page.
    * @param sPageId The screen to which drilldown should happen. The ID or the control itself can be
    * given.
    * @param sTransitionName The type of the transition/animation to apply. This parameter can be omitted;
    * then the default value is "slide" (horizontal movement from the right).        Other options are:
    * "fade", "flip", and "show" and the names of any registered custom transitions.        None of the
    * standard transitions is currently making use of any given transition parameters.
    * @param oData Since version 1.7.1. This optional object can carry any payload data which should be
    * made available to the target page. The beforeShow event on the target page will contain this data
    * object as data property.        Use case: in scenarios where the entity triggering the navigation
    * can't or shouldn't directly initialize the target page, it can fill this object and the target page
    * itself (or a listener on it) can take over the initialization, using the given data.        When the
    * transitionParameters object is used, this data object must also be given (either as object or as
    * null) in order to have a proper parameter order.
    * @param oTransitionParameters Since version 1.7.1. This optional object can contain additional
    * information for the transition function, like the DOM element, which triggered the transition or the
    * desired transition duration.        For a proper parameter order, the data parameter must be given
    * when the transitionParameters parameter is used (it can be given as "null").        NOTE: it depends
    * on the transition function how the object should be structured and which parameters are actually
    * used to influence the transition.        The "show", "slide" and "fade" transitions do not use any
    * parameter.
    */
  def toMaster(sPageId: String, sTransitionName: String, oData: js.Any, oTransitionParameters: js.Any): SplitContainer = js.native
}

