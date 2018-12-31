package typings
package openui5Lib.sapNs.mNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.m.NavContainer")
@js.native
class NavContainer protected ()
  extends openui5Lib.sapNs.uiNs.coreNs.Control {
  /**
    * Constructor for a new NavContainer.Accepts an object literal <code>mSettings</code> that defines
    * initialproperty values, aggregated and associated objects as well as event handlers.See {@link
    * sap.ui.base.ManagedObject#constructor} for a general description of the syntax of the settings
    * object.
    * @param sId id for the new control, generated automatically if no id is given
    * @param mSettings initial settings for the new control
    */
  def this(sId: java.lang.String) = this()
  def this(sId: java.lang.String, mSettings: js.Any) = this()
  /**
    * Adds a custom transition to the NavContainer type (not to a particular instance!). The transition is
    * identified by a "name". Make sure to only use names that will not collide with transitions which may
    * be added to the NavContainer later. A suggestion is to use the prefix "c_" or "_" for your custom
    * transitions to ensure this."to" and "back" are the transition functions for the forward and backward
    * navigation.Both will be called with the following parameters:- oFromPage: the Control which is
    * currently being displayed by the NavContainer- oToPage: the Control which should be displayed by the
    * NavContainer after the transition- fCallback: a function which MUST be called when the transition
    * has completed- oTransitionParameters: a data object that can be given by application code when
    * triggering the transition by calling to() or back(); this object could give additional information
    * to the transition function, like the DOM element which triggered the transition or the desired
    * transition durationThe contract for "to" and "back" is that they may do an animation of their
    * choice, but it should not take "too long". At the beginning of the transition the target page
    * "oToPage" does have the CSS class "sapMNavItemHidden" which initially hides the target page
    * (visibility:hidden). The transition can do any preparation (e.g. move that page out of the screen or
    * make it transparent) and then should remove this CSS class.After the animation the target page
    * "oToPage" should cover the entire screen and the source page "oFromPage" should not be visible
    * anymore. This page should then have the CSS class "sapMNavItemHidden".For adding/removing this or
    * other CSS classes, the transition can use the addStyleClass/removeStyleClass
    * method:oFromPage.addStyleClass("sapMNavItemHidden");When the transition is complete, it MUST call
    * the given fCallback method to inform the NavContainer that navigation has finished!Hint: if the
    * target page of your transition stays black on iPhone, try wrapping the animation start into
    * asetTimeout(..., 0)block (delayed, but without waiting).This method can be called on any
    * NavContainer instance or statically on the sap.m.NavContainer type. However, the transition will
    * always be registered for the type (and ALL instances), not for the single instance on which this
    * method was invoked.Returns the sap.m.NavContainer type if called statically, or "this" (to allow
    * method chaining) if called on a particular NavContainer instance.
    * @param sName The name of the transition. This name can be used by the application to choose this
    * transition when navigating "to()" or "back()": the "transitionName" parameter of "NavContainer.to()"
    * corresponds to this name, the back() navigation will automatically use the same transition.       
    * Make sure to only use names that will not collide with transitions which may be added to the
    * NavContainer later. A suggestion is to use the prefix "c_" or "_" for your custom transitions to
    * ensure this.
    * @param oTo The function which will be called by the NavContainer when the application navigates
    * "to()", using this animation's name. The NavContainer instance is the "this" context within the
    * animation function.        See the documentation of NavContainer.addCustomTransitions for more
    * details about this function.
    * @param oBack The function which will be called by the NavContainer when the application navigates
    * "back()" from a page where it had navigated to using this animation's name. The NavContainer
    * instance is the "this" context within the animation function.        See the documentation of
    * NavContainer.addCustomTransitions for more details about this function.
    */
  def addCustomTransition(sName: java.lang.String, oTo: js.Any, oBack: js.Any): NavContainer = js.native
  /**
    * Adds some page to the aggregation <code>pages</code>.
    * @param oPage the page to add; if empty, nothing is inserted
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def addPage(oPage: openui5Lib.sapNs.uiNs.coreNs.Control): NavContainer = js.native
  /**
    * Attaches event handler <code>fnFunction</code> to the <code>afterNavigate</code> event of this
    * <code>sap.m.NavContainer</code>.When called, the context of the event handler (its
    * <code>this</code>) will be bound to <code>oListener</code> if specified, otherwise it will be bound
    * to this <code>sap.m.NavContainer</code> itself.The event is fired when navigation between two pages
    * has completed. In case of animated transitions this event is fired with some delay after the
    * "navigate" event.
    * @since 1.7.1
    * @param oData An application-specific payload object that will be passed to the event handler along
    * with the event object when firing the event
    * @param fnFunction The function to be called when the event occurs
    * @param oListener Context object to call the event handler with. Defaults to this
    * <code>sap.m.NavContainer</code> itself
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def attachAfterNavigate(oData: js.Any, fnFunction: js.Any): NavContainer = js.native
  def attachAfterNavigate(oData: js.Any, fnFunction: js.Any, oListener: js.Any): NavContainer = js.native
  /**
    * Attaches event handler <code>fnFunction</code> to the <code>navigate</code> event of this
    * <code>sap.m.NavContainer</code>.When called, the context of the event handler (its
    * <code>this</code>) will be bound to <code>oListener</code> if specified, otherwise it will be bound
    * to this <code>sap.m.NavContainer</code> itself.The event is fired when navigation between two pages
    * has been triggered. The transition (if any) to the new page has not started yet.This event can be
    * aborted by the application with preventDefault(), which means that there will be no navigation.
    * @since 1.7.1
    * @param oData An application-specific payload object that will be passed to the event handler along
    * with the event object when firing the event
    * @param fnFunction The function to be called when the event occurs
    * @param oListener Context object to call the event handler with. Defaults to this
    * <code>sap.m.NavContainer</code> itself
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def attachNavigate(oData: js.Any, fnFunction: js.Any): NavContainer = js.native
  def attachNavigate(oData: js.Any, fnFunction: js.Any, oListener: js.Any): NavContainer = js.native
  /**
    * Navigates back one level. If already on the initial page and there is no place to go back, nothing
    * happens.Calling this navigation method triggers first the (cancelable) "navigate" event on the
    * NavContainer, then the "beforeHide" pseudo event on the source page and "beforeFirstShow" (if
    * applicable) and"beforeShow" on the target page. Later - after the transition has completed - the
    * "afterShow" pseudo event is triggered on the target page and "afterHide" on the page which has been
    * left. The given backData object is available in the "beforeFirstShow", "beforeShow" and "afterShow"
    * event object as "data" property. The original "data" object from the "to" navigation is also
    * available in these event objects.
    * @param oBackData Since version 1.7.1. This optional object can carry any payload data which should
    * be made available to the target page of the back navigation. The event on the target page will
    * contain this data object as "backData" property. (The original data from the "to()" navigation will
    * still be available as "data" property.)        In scenarios where the entity triggering the
    * navigation can or should not directly initialize the target page, it can fill this object and the
    * target page itself (or a listener on it) can take over the initialization, using the given data.    
    *    For back navigation this can be used e.g. when returning from a detail page to transfer any
    * settings done there.        When the "transitionParameters" object is used, this "data" object must
    * also be given (either as object or as null) in order to have a proper parameter order.
    * @param oTransitionParameters Since version 1.7.1. This optional object can give additional
    * information to the transition function, like the DOM element which triggered the transition or the
    * desired transition duration.        The animation type can NOT be selected here - it is always the
    * inverse of the "to" navigation.        In order to use the "transitionParameters" property, the
    * "data" property must be used (at least "null" must be given) for a proper parameter order.       
    * NOTE: it depends on the transition function how the object should be structured and which parameters
    * are actually used to influence the transition.
    */
  def back(oBackData: js.Any): NavContainer = js.native
  def back(oBackData: js.Any, oTransitionParameters: js.Any): NavContainer = js.native
  /**
    * Navigates back to the nearest previous page in the NavContainer history with the given ID. If there
    * is no such page among the previous pages, nothing happens.The transition effect which had been used
    * to get to the current page is inverted and used for this navigation.Calling this navigation method
    * triggers first the (cancelable) "navigate" event on the NavContainer, then the "beforeHide" pseudo
    * event on the source page and "beforeFirstShow" (if applicable) and"beforeShow" on the target page.
    * Later - after the transition has completed - the "afterShow" pseudo event is triggered on the target
    * page and "afterHide" on the page which has been left. The given backData object is available in the
    * "beforeFirstShow", "beforeShow" and "afterShow" event object as "data" property. The original "data"
    * object from the "to" navigation is also available in these event objects.
    * @since 1.7.2
    * @param sPageId The ID of the screen to which back navigation should happen. The ID or the control
    * itself can be given. The nearest such page among the previous pages in the history stack will be
    * used.
    * @param oBackData This optional object can carry any payload data which should be made available to
    * the target page of the "backToPage" navigation. The event on the target page will contain this data
    * object as "backData" property.        When the "transitionParameters" object is used, this "data"
    * object must also be given (either as object or as null) in order to have a proper parameter order.
    * @param oTransitionParameters This optional object can give additional information to the transition
    * function, like the DOM element which triggered the transition or the desired transition duration.   
    *     The animation type can NOT be selected here - it is always the inverse of the "to" navigation.  
    *      In order to use the "transitionParameters" property, the "data" property must be used (at least
    * "null" must be given) for a proper parameter order.        NOTE: it depends on the transition
    * function how the object should be structured and which parameters are actually used to influence the
    * transition.
    */
  def backToPage(sPageId: java.lang.String): NavContainer = js.native
  def backToPage(sPageId: java.lang.String, oBackData: js.Any): NavContainer = js.native
  def backToPage(sPageId: java.lang.String, oBackData: js.Any, oTransitionParameters: js.Any): NavContainer = js.native
  /**
    * Navigates back to the initial/top level (this is the element aggregated as "initialPage", or the
    * first added element). If already on the initial page, nothing happens.The transition effect which
    * had been used to get to the current page is inverted and used for this navigation.Calling this
    * navigation method triggers first the (cancelable) "navigate" event on the NavContainer, then the
    * "beforeHide" pseudo event on the source page and "beforeFirstShow" (if applicable) and"beforeShow"
    * on the target page. Later - after the transition has completed - the "afterShow" pseudo event is
    * triggered on the target page and "afterHide" on the page which has been left. The given backData
    * object is available in the "beforeFirstShow", "beforeShow" and "afterShow" event object as "data"
    * property.
    * @since 1.7.1
    * @param oBackData This optional object can carry any payload data which should be made available to
    * the target page of the "backToTop" navigation. The event on the target page will contain this data
    * object as "backData" property.        When the "transitionParameters" object is used, this "data"
    * object must also be given (either as object or as null) in order to have a proper parameter order.
    * @param oTransitionParameters This optional object can give additional information to the transition
    * function, like the DOM element which triggered the transition or the desired transition duration.   
    *     The animation type can NOT be selected here - it is always the inverse of the "to" navigation.  
    *      In order to use the "transitionParameters" property, the "data" property must be used (at least
    * "null" must be given) for a proper parameter order.        NOTE: it depends on the transition
    * function how the object should be structured and which parameters are actually used to influence the
    * transition.
    */
  def backToTop(oBackData: js.Any): NavContainer = js.native
  def backToTop(oBackData: js.Any, oTransitionParameters: js.Any): NavContainer = js.native
  /**
    * Returns whether the current page is the top/initial page.Note: going to the initial page again with
    * a row of "to" navigations causes the initial page to be displayed again, but logically one is not at
    * the top level, so this method returns "false" in this case.
    */
  def currentPageIsTopPage(): scala.Boolean = js.native
  /**
    * Destroys all the pages in the aggregation <code>pages</code>.
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def destroyPages(): NavContainer = js.native
  /**
    * Detaches event handler <code>fnFunction</code> from the <code>afterNavigate</code> event of this
    * <code>sap.m.NavContainer</code>.The passed function and listener object must match the ones used for
    * event registration.
    * @since 1.7.1
    * @param fnFunction The function to be called, when the event occurs
    * @param oListener Context object on which the given function had to be called
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def detachAfterNavigate(fnFunction: js.Any, oListener: js.Any): NavContainer = js.native
  /**
    * Detaches event handler <code>fnFunction</code> from the <code>navigate</code> event of this
    * <code>sap.m.NavContainer</code>.The passed function and listener object must match the ones used for
    * event registration.
    * @since 1.7.1
    * @param fnFunction The function to be called, when the event occurs
    * @param oListener Context object on which the given function had to be called
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def detachNavigate(fnFunction: js.Any, oListener: js.Any): NavContainer = js.native
  /**
    * Fires event <code>afterNavigate</code> to attached listeners.Expects the following event
    * parameters:<ul><li><code>from</code> of type <code>sap.ui.core.Control</code>The page which had been
    * shown before navigation.</li><li><code>fromId</code> of type <code>string</code>The ID of the page
    * which had been shown before navigation.</li><li><code>to</code> of type
    * <code>sap.ui.core.Control</code>The page which is now shown after
    * navigation.</li><li><code>toId</code> of type <code>string</code>The ID of the page which is now
    * shown after navigation.</li><li><code>firstTime</code> of type <code>boolean</code>Whether the "to"
    * page (more precisely: a control with the ID of the page which has been navigated to) had not been
    * shown/navigated to before.</li><li><code>isTo</code> of type <code>boolean</code>Whether was a
    * forward navigation, triggered by "to()".</li><li><code>isBack</code> of type
    * <code>boolean</code>Whether this was a back navigation, triggered by
    * "back()".</li><li><code>isBackToTop</code> of type <code>boolean</code>Whether this was a navigation
    * to the root page, triggered by "backToTop()".</li><li><code>isBackToPage</code> of type
    * <code>boolean</code>Whether this was a navigation to a specific page, triggered by
    * "backToPage()".</li><li><code>direction</code> of type <code>string</code>How the navigation was
    * triggered, possible values are "to", "back", "backToPage", and "backToTop".</li></ul>
    * @since 1.7.1
    * @param mArguments The arguments to pass along with the event
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def fireAfterNavigate(mArguments: js.Any): NavContainer = js.native
  /**
    * Fires event <code>navigate</code> to attached listeners.Listeners may prevent the default action of
    * this event by using the <code>preventDefault</code>-method on the event object.Expects the following
    * event parameters:<ul><li><code>from</code> of type <code>sap.ui.core.Control</code>The page which
    * was shown before the current navigation.</li><li><code>fromId</code> of type <code>string</code>The
    * ID of the page which was shown before the current navigation.</li><li><code>to</code> of type
    * <code>sap.ui.core.Control</code>The page which will be shown after the current
    * navigation.</li><li><code>toId</code> of type <code>string</code>The ID of the page which will be
    * shown after the current navigation.</li><li><code>firstTime</code> of type
    * <code>boolean</code>Whether the "to" page (more precisely: a control with the ID of the page which
    * is currently navigated to) has not been shown/navigated to before.</li><li><code>isTo</code> of type
    * <code>boolean</code>Whether this is a forward navigation, triggered by
    * "to()".</li><li><code>isBack</code> of type <code>boolean</code>Whether this is a back navigation,
    * triggered by "back()".</li><li><code>isBackToTop</code> of type <code>boolean</code>Whether this is
    * a navigation to the root page, triggered by "backToTop()".</li><li><code>isBackToPage</code> of type
    * <code>boolean</code>Whether this was a navigation to a specific page, triggered by
    * "backToPage()".</li><li><code>direction</code> of type <code>string</code>How the navigation was
    * triggered, possible values are "to", "back", "backToPage", and "backToTop".</li></ul>
    * @since 1.7.1
    * @param mArguments The arguments to pass along with the event
    * @returns Whether or not to prevent the default action
    */
  def fireNavigate(mArguments: js.Any): scala.Boolean = js.native
  /**
    * Gets current value of property <code>autoFocus</code>.Determines whether the initial focus is set
    * automatically on first rendering and after navigating to a new page.This is useful when on touch
    * devices the keyboard pops out due to the focus being automatically set on an input field.If
    * necessary the "afterShow" event can be used to focus another element.Default value is
    * <code>true</code>.
    * @since 1.30
    * @returns Value of property <code>autoFocus</code>
    */
  def getAutoFocus(): scala.Boolean = js.native
  /**
    * Returns the currently displayed page-level control. Note: it is not necessarily an instance of
    * sap.m.Page, but it could also be a sap.ui.core.View, sap.m.Carousel, or whatever is
    * aggregated.Returns undefined if no page has been added yet.
    */
  def getCurrentPage(): openui5Lib.sapNs.uiNs.coreNs.Control = js.native
  /**
    * Gets current value of property <code>defaultTransitionName</code>.The type of the
    * transition/animation to apply when "to()" is called without defining a transition type to use. The
    * default is "slide". Other options are: "fade", "flip" and "show" - and the names of any registered
    * custom transitions.Default value is <code>slide</code>.
    * @since 1.7.1
    * @returns Value of property <code>defaultTransitionName</code>
    */
  def getDefaultTransitionName(): java.lang.String = js.native
  /**
    * Gets current value of property <code>height</code>.The height of the NavContainer. Can be changed
    * when the NavContainer should not cover the whole available area.Default value is <code>100%</code>.
    * @returns Value of property <code>height</code>
    */
  def getHeight(): js.Any = js.native
  /**
    * ID of the element which is the current target of the association <code>initialPage</code>, or
    * <code>null</code>.
    */
  def getInitialPage(): js.Any = js.native
  /**
    * Returns the control with the given ID from the "pages" aggregation (if available).
    * @param sId The ID of the aggregated control to find.
    */
  def getPage(sId: java.lang.String): openui5Lib.sapNs.uiNs.coreNs.Control = js.native
  /**
    * Gets content of aggregation <code>pages</code>.The content entities between which this NavContainer
    * navigates. These can be of type sap.m.Page, sap.ui.core.View, sap.m.Carousel or any other control
    * with fullscreen/page semantics.These aggregated controls will receive navigation events like {@link
    * sap.m.NavContainerChild#beforeShow beforeShow}, they are documented in the pseudo interface {@link
    * sap.m.NavContainerChild sap.m.NavContainerChild}
    */
  def getPages(): js.Array[openui5Lib.sapNs.uiNs.coreNs.Control] = js.native
  /**
    * Returns the previous page (the page from which the user drilled down to the current page with
    * "to()").Note: this is not the page which the user has seen before, but the page which is the target
    * of the next "back()" navigation.If there is no previous page, "undefined" is returned.
    * @since 1.7.1
    */
  def getPreviousPage(): openui5Lib.sapNs.uiNs.coreNs.Control = js.native
  /**
    * Gets current value of property <code>width</code>.The width of the NavContainer. Can be changed when
    * the NavContainer should not cover the whole available area.Default value is <code>100%</code>.
    * @returns Value of property <code>width</code>
    */
  def getWidth(): js.Any = js.native
  /**
    * Checks for the provided <code>sap.ui.core.Control</code> in the aggregation <code>pages</code>.and
    * returns its index if found or -1 otherwise.
    * @param oPage The page whose index is looked for
    * @returns The index of the provided control in the aggregation if found, or -1 otherwise
    */
  def indexOfPage(oPage: openui5Lib.sapNs.uiNs.coreNs.Control): scala.Double = js.native
  /**
    * Inserts a page into the aggregation <code>pages</code>.
    * @param oPage the page to insert; if empty, nothing is inserted
    * @param iIndex the <code>0</code>-based index the page should be inserted at; for             a
    * negative value of <code>iIndex</code>, the page is inserted at position 0; for a value            
    * greater than the current size of the aggregation, the page is inserted at             the last
    * position
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def insertPage(oPage: openui5Lib.sapNs.uiNs.coreNs.Control, iIndex: scala.Double): NavContainer = js.native
  /**
    * Inserts the page/control with the specified ID into the navigation history stack of the
    * NavContainer.This can be used for deep-linking when the user directly reached a drilldown detail
    * page using a bookmark and then wants to navigate up in the drilldown hierarchy. Normally such a back
    * navigation would not be possible because there is no previous page in the NavContainer's history
    * stack.
    * @since 1.16.1
    * @param sPageId The ID of the control/page/screen which is inserted into the history stack. The
    * respective control must be aggregated by the NavContainer, otherwise this will cause an error.
    * @param sTransitionName The type of the transition/animation which would have been used to navigate
    * from the (inserted) previous page to the current page. When navigating back, the inverse animation
    * will be applied.        This parameter can be omitted; then the default is "slide" (horizontal
    * movement from the right).
    * @param oData This optional object can carry any payload data which would have been given to the
    * inserted previous page if the user would have done a normal forward navigation to it.
    */
  def insertPreviousPage(sPageId: java.lang.String): NavContainer = js.native
  def insertPreviousPage(sPageId: java.lang.String, sTransitionName: java.lang.String): NavContainer = js.native
  def insertPreviousPage(sPageId: java.lang.String, sTransitionName: java.lang.String, oData: js.Any): NavContainer = js.native
  /**
    * Removes all the controls from the aggregation <code>pages</code>.Additionally, it unregisters them
    * from the hosting UIArea.
    * @returns An array of the removed elements (might be empty)
    */
  def removeAllPages(): js.Array[openui5Lib.sapNs.uiNs.coreNs.Control] = js.native
  def removePage(vPage: java.lang.String): openui5Lib.sapNs.uiNs.coreNs.Control = js.native
  def removePage(vPage: openui5Lib.sapNs.uiNs.coreNs.Control): openui5Lib.sapNs.uiNs.coreNs.Control = js.native
  /**
    * Removes a page from the aggregation <code>pages</code>.
    * @param vPage The page to remove or its index or id
    * @returns The removed page or <code>null</code>
    */
  def removePage(vPage: scala.Double): openui5Lib.sapNs.uiNs.coreNs.Control = js.native
  /**
    * Sets a new value for property <code>autoFocus</code>.Determines whether the initial focus is set
    * automatically on first rendering and after navigating to a new page.This is useful when on touch
    * devices the keyboard pops out due to the focus being automatically set on an input field.If
    * necessary the "afterShow" event can be used to focus another element.When called with a value of
    * <code>null</code> or <code>undefined</code>, the default value of the property will be
    * restored.Default value is <code>true</code>.
    * @since 1.30
    * @param bAutoFocus New value for property <code>autoFocus</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setAutoFocus(bAutoFocus: scala.Boolean): NavContainer = js.native
  /**
    * Sets a new value for property <code>defaultTransitionName</code>.The type of the
    * transition/animation to apply when "to()" is called without defining a transition type to use. The
    * default is "slide". Other options are: "fade", "flip" and "show" - and the names of any registered
    * custom transitions.When called with a value of <code>null</code> or <code>undefined</code>, the
    * default value of the property will be restored.Default value is <code>slide</code>.
    * @since 1.7.1
    * @param sDefaultTransitionName New value for property <code>defaultTransitionName</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setDefaultTransitionName(sDefaultTransitionName: java.lang.String): NavContainer = js.native
  /**
    * Sets a new value for property <code>height</code>.The height of the NavContainer. Can be changed
    * when the NavContainer should not cover the whole available area.When called with a value of
    * <code>null</code> or <code>undefined</code>, the default value of the property will be
    * restored.Default value is <code>100%</code>.
    * @param sHeight New value for property <code>height</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setHeight(sHeight: js.Any): NavContainer = js.native
  /**
    * Sets the associated <code>initialPage</code>.
    * @param oInitialPage ID of an element which becomes the new target of this initialPage association;
    * alternatively, an element instance may be given
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setInitialPage(oInitialPage: js.Any): NavContainer = js.native
  def setInitialPage(oInitialPage: openui5Lib.sapNs.uiNs.coreNs.Control): NavContainer = js.native
  /**
    * Sets a new value for property <code>width</code>.The width of the NavContainer. Can be changed when
    * the NavContainer should not cover the whole available area.When called with a value of
    * <code>null</code> or <code>undefined</code>, the default value of the property will be
    * restored.Default value is <code>100%</code>.
    * @param sWidth New value for property <code>width</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setWidth(sWidth: js.Any): NavContainer = js.native
  /**
    * Navigates to the next page (with drill-down semantic) with the given (or default) animation. This
    * creates a new history item inside the NavContainer and allows going back.Note that any modifications
    * to the target page (like setting its title, or anything else that could cause a re-rendering) should
    * be done BEFORE calling to(), in order to avoid unwanted side effects, e.g. related to the page
    * animation.Available transitions currently include "slide" (default), "fade", "flip", and "show".
    * None of these is currently making use of any given transitionParameters.Calling this navigation
    * method triggers first the (cancelable) "navigate" event on the NavContainer, then the "beforeHide"
    * pseudo event on the source page and "beforeFirstShow" (if applicable) and"beforeShow" on the target
    * page. Later - after the transition has completed - the "afterShow" pseudo event is triggered on the
    * target page and "afterHide" on the page which has been left. The given data object is available in
    * the "beforeFirstShow", "beforeShow" and "afterShow" event object as "data" property.
    * @param sPageId The screen to which drilldown should happen. The ID or the control itself can be
    * given.
    * @param sTransitionName The type of the transition/animation to apply. This parameter can be omitted;
    * then the default is "slide" (horizontal movement from the right).        Other options are: "fade",
    * "flip", and "show" and the names of any registered custom transitions.        None of the standard
    * transitions is currently making use of any given transition parameters.
    * @param oData Since version 1.7.1. This optional object can carry any payload data which should be
    * made available to the target page. The "beforeShow" event on the target page will contain this data
    * object as "data" property.        Use case: in scenarios where the entity triggering the navigation
    * can or should not directly initialize the target page, it can fill this object and the target page
    * itself (or a listener on it) can take over the initialization, using the given data.        When the
    * "transitionParameters" object is used, this "data" object must also be given (either as object or as
    * null) in order to have a proper parameter order.
    * @param oTransitionParameters Since version 1.7.1. This optional object can contain additional
    * information for the transition function, like the DOM element which triggered the transition or the
    * desired transition duration.        For a proper parameter order, the "data" parameter must be given
    * when the "transitionParameters" parameter is used. (it can be given as "null")        NOTE: it
    * depends on the transition function how the object should be structured and which parameters are
    * actually used to influence the transition.        The "show", "slide" and "fade" transitions do not
    * use any parameter.
    */
  def to(sPageId: java.lang.String): NavContainer = js.native
  def to(sPageId: java.lang.String, sTransitionName: java.lang.String): NavContainer = js.native
  def to(sPageId: java.lang.String, sTransitionName: java.lang.String, oData: js.Any): NavContainer = js.native
  def to(
    sPageId: java.lang.String,
    sTransitionName: java.lang.String,
    oData: js.Any,
    oTransitionParameters: js.Any
  ): NavContainer = js.native
}

