package typings.openui5.sap.ui.core

import typings.jquery.JQueryStatic
import typings.openui5.anon.TypeofDock
import typings.openui5.sap.ui.base.ManagedObject
import typings.std.Number
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Popup extends ManagedObject {
  /**
    * Attaches event handler <code>fnFunction</code> to the <code>closed</code> event of this
    * <code>sap.ui.core.Popup</code>.When called, the context of the event handler (its <code>this</code>)
    * will be bound to <code>oListener</code> if specified, otherwise it will be bound to this
    * <code>sap.ui.core.Popup</code> itself.
    * @param oData An application-specific payload object that will be passed to the event handler along
    * with the event object when firing the event
    * @param fnFunction The function to be called when the event occurs
    * @param oListener Context object to call the event handler with. Defaults to this
    * <code>sap.ui.core.Popup</code> itself
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def attachClosed(oData: js.Any, fnFunction: js.Any): Popup = js.native
  def attachClosed(oData: js.Any, fnFunction: js.Any, oListener: js.Any): Popup = js.native
  /**
    * Attaches event handler <code>fnFunction</code> to the <code>opened</code> event of this
    * <code>sap.ui.core.Popup</code>.When called, the context of the event handler (its <code>this</code>)
    * will be bound to <code>oListener</code> if specified, otherwise it will be bound to this
    * <code>sap.ui.core.Popup</code> itself.
    * @param oData An application-specific payload object that will be passed to the event handler along
    * with the event object when firing the event
    * @param fnFunction The function to be called when the event occurs
    * @param oListener Context object to call the event handler with. Defaults to this
    * <code>sap.ui.core.Popup</code> itself
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def attachOpened(oData: js.Any, fnFunction: js.Any): Popup = js.native
  def attachOpened(oData: js.Any, fnFunction: js.Any, oListener: js.Any): Popup = js.native
  /**
    * Closes the popup.If the Popup is already closed or in the process of closing, calling this method
    * does nothing.If the Popup is in the process of being opened and closed with a duration of 0, calling
    * this method does nothing.If the Popup is in the process of being opened and closed with an animation
    * duration, the animation will be chained, but this functionality is dangerous,may lead to
    * inconsistent behavior and is thus not recommended and may even be removed.
    * @param iDuration animation duration in milliseconds; default is the jQuery preset "fast".  For
    * iDuration == 0 the closing happens synchronously without animation.
    */
  def close(iDuration: Double): Unit = js.native
  /**
    * Detaches event handler <code>fnFunction</code> from the <code>closed</code> event of this
    * <code>sap.ui.core.Popup</code>.The passed function and listener object must match the ones used for
    * event registration.
    * @param fnFunction The function to be called, when the event occurs
    * @param oListener Context object on which the given function had to be called
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def detachClosed(fnFunction: js.Any, oListener: js.Any): Popup = js.native
  /**
    * Detaches event handler <code>fnFunction</code> from the <code>opened</code> event of this
    * <code>sap.ui.core.Popup</code>.The passed function and listener object must match the ones used for
    * event registration.
    * @param fnFunction The function to be called, when the event occurs
    * @param oListener Context object on which the given function had to be called
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def detachOpened(fnFunction: js.Any, oListener: js.Any): Popup = js.native
  /**
    * When the Popup is being destroyed all corresponding references should bedeleted as well to prevent
    * any memory leaks.
    */
  def exit(): Unit = js.native
  /**
    * Fires event <code>closed</code> to attached listeners.
    * @param mArguments The arguments to pass along with the event
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def fireClosed(mArguments: js.Any): Popup = js.native
  /**
    * Fires event <code>opened</code> to attached listeners.
    * @param mArguments The arguments to pass along with the event
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def fireOpened(mArguments: js.Any): Popup = js.native
  /**
    * Determines whether the pop-up should auto closes or not.
    * @since 1.16
    */
  def getAutoClose(): Boolean = js.native
  /**
    * Returns this Popup's content.
    * @returns the content that has been set previously (if any)
    */
  def getContent(): Control | js.Any = js.native
  /**
    * This returns true/false if the default followOf method should be used. If a separate
    * followOf-handler was previously addedthe correspodning function is returned.
    * @since 1.13.0
    * @returns if a function was set it is returned otherwise a boolean value whether the follow of is
    * activated
    */
  def getFollowOf(): Boolean | js.Any = js.native
  /**
    * Returns the last z-index that has been handed out. does not increase the internal z-index counter.
    */
  def getLastZIndex(): Number = js.native
  /**
    * Returns the value if a Popup is of modal type
    */
  def getModal(): Unit = js.native
  /**
    * Returns the next available z-index on top of the existing/previous popups. Each call increases the
    * internal z-index counter and the returned z-index.
    * @returns the next z-index on top of the Popup stack
    */
  def getNextZIndex(): Number = js.native
  /**
    * Returns whether the Popup is currently open, closed, or transitioning between these states.
    * @returns whether the Popup is opened
    */
  def getOpenState(): OpenState = js.native
  /**
    * Returns whether the Popup is currently open (this includes opening andclosing animations).
    * @returns whether the Popup is opened (or currently being                           opened or closed)
    */
  def isOpen(): Boolean = js.native
  /**
    * Opens the popup's content at the position either specified here or beforehand via {@link
    * #setPosition}.Content must be capable of being positioned via "position:absolute;"All parameters are
    * optional (open() may be called without any parameters). iDuration may just be omitted, but if any of
    * "at", "of", "offset", "collision" is given, also the preceding positioning parameters ("my",
    * at",...) must be given.If the Popup's OpenState is different from "CLOSED" (i.e. if the Popup is
    * already open, opening or closing), the call is ignored.
    * @param iDuration animation duration in milliseconds; default is the jQuery preset "fast". For
    * iDuration == 0 the opening happens synchronously without animation.
    * @param my the popup content's reference position for docking
    * @param at the "of" element's reference point for docking to
    * @param of specifies the reference element to which the given content should dock to
    * @param offset the offset relative to the docking point, specified as a string with space-separated
    * pixel values (e.g. "0 10" to move the popup 10 pixels to the right). If the docking of both "my" and
    * "at" are both RTL-sensitive ("begin" or "end"), this offset is automatically mirrored in the RTL
    * case as well.
    * @param collision defines how the position of an element should be adjusted in case it overflows the
    * window in some direction.
    * @param followOf defines whether the popup should follow the dock reference when the reference
    * changes its position.
    */
  def open(
    iDuration: Double,
    my: js.UndefOr[TypeofDock],
    at: js.UndefOr[TypeofDock],
    of: js.UndefOr[String | Element | js.Any | JQueryStatic],
    offset: js.UndefOr[String],
    collision: js.UndefOr[String],
    followOf: js.UndefOr[Boolean]
  ): Unit = js.native
  /**
    * Sets the animation functions to use for opening and closing the Popup. Any null value will be
    * ignored and not change the respective animation function.When called, the animation functions
    * receive three parameters:- the jQuery object wrapping the DomRef of the popup- the requested
    * animation duration- a function that MUST be called once the animation has completed
    * @param fnOpen undefined
    * @param fnClose undefined
    * @returns <code>this</code> to allow method chaining
    */
  def setAnimations(fnOpen: js.Any, fnClose: js.Any): Popup = js.native
  /**
    * Used to specify whether the Popup should close as soon as- for non-touch environment: the focus
    * leaves- for touch environment: user clicks the area which is outside the popup itself, the dom
    * elemnt which popup aligns to (except document), and one of the autoCloseAreas set by calling
    * setAutoCloseAreas.
    * @param bAutoClose whether the Popup should close as soon as the focus leaves
    * @returns <code>this</code> to allow method chaining
    */
  def setAutoClose(bAutoClose: Boolean): Popup = js.native
  /**
    * Sets the additional areas in the page that are considered part of the Popup when autoclose is
    * enabled.- non-touch environment: if the focus leaves the Popup but immediately enters one of these
    * areas, the Popup does NOT close.- touch environment: if user clicks one of these areas, the Popup
    * does NOT close.
    * @param aAutoCloseAreas an array containing DOM elements considered part of the Popup; a value of
    * null removes all previous areas
    * @returns <code>this</code> to allow method chaining
    */
  def setAutoCloseAreas(aAutoCloseAreas: js.Any): Popup = js.native
  def setContent(oContent: js.Any): Popup = js.native
  /**
    * Sets the content this instance of the Popup should render.Content must be capable of being
    * positioned via position:absolute;
    * @param oContent undefined
    * @returns <code>this</code> to allow method chaining
    */
  def setContent(oContent: Control): Popup = js.native
  /**
    * Sets the durations for opening and closing animations.Null values and values < 0 are ignored.A
    * duration of 0 means no animation.Default value is "fast" which is the jQuery constant for "200 ms".
    * @param iOpenDuration in milliseconds
    * @param iCloseDuration in milliseconds
    * @returns <code>this</code> to allow method chaining
    */
  def setDurations(iOpenDuration: Double, iCloseDuration: Double): Popup = js.native
  def setFollowOf(followOf: js.Any): Unit = js.native
  /**
    * This enabled/disables the Popup to follow its opening reference. If the Popup is open and a followOf
    * shouldbe set the corresponding listener will be attached.
    * @since 1.13.0
    * @param followOf a boolean value enabled/disables the default followOf-Handler. Or an individual
    * handler can be given.null deletes all followOf settings.
    */
  def setFollowOf(followOf: Boolean): Unit = js.native
  /**
    * Sets the ID of the element that should be focused once the popup opens.If the given ID is the ID of
    * an existing Control, this Control's focusDomRef will be focused instead, which may be an HTML
    * element with a different ID (usually a sub-element inside the Control).If no existing element ID is
    * supplied and the Popup is modal or auto-close, the Popup will instead focus the first focusable
    * element.
    * @param sId the ID of the DOM element to focus
    */
  def setInitialFocusId(sId: String): Unit = js.native
  /**
    * Set an initial z-index that should be used by all Popup so all Popups start at leastwith the set
    * z-index.If the given z-index is lower than any current available z-index the highest z-index will be
    * used.
    * @since 1.30.0
    * @param iInitialZIndex is the initial z-index
    */
  def setInitialZIndex(iInitialZIndex: Number): Unit = js.native
  /**
    * Used to specify whether the Popup should be modal. A modal popup will put some fading "block layer"
    * over the background andprevent attempts to put the focus outside/below the popup.Setting this while
    * the popup is open will change "block layer" immediately.
    * @param bModal whether the Popup is of modal type
    * @param sModalCSSClass a CSS class (or space-separated list of classes) that should be added to the
    * block layer
    * @returns <code>this</code> to allow method chaining
    */
  def setModal(bModal: Boolean): Popup = js.native
  def setModal(bModal: Boolean, sModalCSSClass: String): Popup = js.native
  def setPosition(my: TypeofDock, at: js.Any): Popup = js.native
  def setPosition(
    my: TypeofDock,
    at: js.Any,
    of: js.UndefOr[scala.Nothing],
    offset: js.UndefOr[scala.Nothing],
    collision: String
  ): Popup = js.native
  def setPosition(my: TypeofDock, at: js.Any, of: js.UndefOr[scala.Nothing], offset: String): Popup = js.native
  def setPosition(my: TypeofDock, at: js.Any, of: js.UndefOr[scala.Nothing], offset: String, collision: String): Popup = js.native
  def setPosition(my: TypeofDock, at: js.Any, of: String): Popup = js.native
  def setPosition(my: TypeofDock, at: js.Any, of: String, offset: js.UndefOr[scala.Nothing], collision: String): Popup = js.native
  def setPosition(my: TypeofDock, at: js.Any, of: String, offset: String): Popup = js.native
  def setPosition(my: TypeofDock, at: js.Any, of: String, offset: String, collision: String): Popup = js.native
  def setPosition(my: TypeofDock, at: js.Any, of: js.Any): Popup = js.native
  def setPosition(my: TypeofDock, at: js.Any, of: js.Any, offset: js.UndefOr[scala.Nothing], collision: String): Popup = js.native
  def setPosition(my: TypeofDock, at: js.Any, of: js.Any, offset: String): Popup = js.native
  def setPosition(my: TypeofDock, at: js.Any, of: js.Any, offset: String, collision: String): Popup = js.native
  def setPosition(my: TypeofDock, at: js.Any, of: JQueryStatic): Popup = js.native
  def setPosition(my: TypeofDock, at: js.Any, of: JQueryStatic, offset: js.UndefOr[scala.Nothing], collision: String): Popup = js.native
  def setPosition(my: TypeofDock, at: js.Any, of: JQueryStatic, offset: String): Popup = js.native
  def setPosition(my: TypeofDock, at: js.Any, of: JQueryStatic, offset: String, collision: String): Popup = js.native
  def setPosition(my: TypeofDock, at: js.Any, of: Element): Popup = js.native
  def setPosition(my: TypeofDock, at: js.Any, of: Element, offset: js.UndefOr[scala.Nothing], collision: String): Popup = js.native
  def setPosition(my: TypeofDock, at: js.Any, of: Element, offset: String): Popup = js.native
  def setPosition(my: TypeofDock, at: js.Any, of: Element, offset: String, collision: String): Popup = js.native
  /**
    * Sets the position of the Popup (if you refer to a Control as anchor then do notuse the DOMRef of the
    * control which might change after re-renderings).Optional parameters can only be omitted when all
    * subsequent parameters are omitted as well.
    * @param my specifies which point of the given Content should be aligned
    * @param at specifies the point of the reference element to which the given Content should be aligned
    * @param of specifies the reference element to which the given content should be aligned as specified
    * in the other parameters
    * @param offset the offset relative to the docking point, specified as a string with space-separated
    * pixel values (e.g. "0 10" to move the popup 10 pixels to the right). If the docking of both "my" and
    * "at" are both RTL-sensitive ("begin" or "end"), this offset is automatically mirrored in the RTL
    * case as well.
    * @param collision defines how the position of an element should be adjusted in case it overflows the
    * window in some direction. The valid values that refer to jQuery-UI's position parameters are "flip",
    * "fit" and "none".
    * @returns <code>this</code> to allow method chaining
    */
  def setPosition(my: TypeofDock, at: TypeofDock): Popup = js.native
  def setPosition(
    my: TypeofDock,
    at: TypeofDock,
    of: js.UndefOr[scala.Nothing],
    offset: js.UndefOr[scala.Nothing],
    collision: String
  ): Popup = js.native
  def setPosition(my: TypeofDock, at: TypeofDock, of: js.UndefOr[scala.Nothing], offset: String): Popup = js.native
  def setPosition(my: TypeofDock, at: TypeofDock, of: js.UndefOr[scala.Nothing], offset: String, collision: String): Popup = js.native
  def setPosition(my: TypeofDock, at: TypeofDock, of: String): Popup = js.native
  def setPosition(my: TypeofDock, at: TypeofDock, of: String, offset: js.UndefOr[scala.Nothing], collision: String): Popup = js.native
  def setPosition(my: TypeofDock, at: TypeofDock, of: String, offset: String): Popup = js.native
  def setPosition(my: TypeofDock, at: TypeofDock, of: String, offset: String, collision: String): Popup = js.native
  def setPosition(my: TypeofDock, at: TypeofDock, of: js.Any): Popup = js.native
  def setPosition(my: TypeofDock, at: TypeofDock, of: js.Any, offset: js.UndefOr[scala.Nothing], collision: String): Popup = js.native
  def setPosition(my: TypeofDock, at: TypeofDock, of: js.Any, offset: String): Popup = js.native
  def setPosition(my: TypeofDock, at: TypeofDock, of: js.Any, offset: String, collision: String): Popup = js.native
  def setPosition(my: TypeofDock, at: TypeofDock, of: JQueryStatic): Popup = js.native
  def setPosition(
    my: TypeofDock,
    at: TypeofDock,
    of: JQueryStatic,
    offset: js.UndefOr[scala.Nothing],
    collision: String
  ): Popup = js.native
  def setPosition(my: TypeofDock, at: TypeofDock, of: JQueryStatic, offset: String): Popup = js.native
  def setPosition(my: TypeofDock, at: TypeofDock, of: JQueryStatic, offset: String, collision: String): Popup = js.native
  def setPosition(my: TypeofDock, at: TypeofDock, of: Element): Popup = js.native
  def setPosition(my: TypeofDock, at: TypeofDock, of: Element, offset: js.UndefOr[scala.Nothing], collision: String): Popup = js.native
  def setPosition(my: TypeofDock, at: TypeofDock, of: Element, offset: String): Popup = js.native
  def setPosition(my: TypeofDock, at: TypeofDock, of: Element, offset: String, collision: String): Popup = js.native
  /**
    * Determines whether the Popup should have a shadow (in supporting browsers).This also affects a
    * currently open popup.
    * @param bShowShadow whether to show a shadow
    * @returns <code>this</code> to allow method chaining
    */
  def setShadow(bShowShadow: Boolean): Popup = js.native
}

