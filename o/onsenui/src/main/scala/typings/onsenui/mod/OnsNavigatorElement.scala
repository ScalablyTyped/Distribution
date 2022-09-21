package typings.onsenui.mod

import typings.std.AddEventListenerOptions
import typings.std.EventListenerOptions
import typings.std.EventListenerOrEventListenerObject
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @description A component that provides page stack management and navigation. This component does not have a visible content
  */
@js.native
trait OnsNavigatorElement
  extends StObject
     with HTMLElement {
  
  /* InferMemberOverrides */
  override def addEventListener(`type`: String, callback: EventListenerOrEventListenerObject): Unit = js.native
  /* InferMemberOverrides */
  override def addEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
  /* InferMemberOverrides */
  override def addEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: AddEventListenerOptions): Unit = js.native
  
  /**
    * @description Specify the animation's duration, timing and delay with an object literal. E.g. `{duration: 0.2, delay: 1, timing: 'ease-in'}`.
    **/
  var animationOptions: js.Object = js.native
  
  /**
    * @param {any} item
    * @param {Object} [options]
    * @description Page URL or index of an existing page in navigator's stack.
    */
  def bringPageTop(item: Any): js.Promise[HTMLElement] = js.native
  def bringPageTop(item: Any, options: js.Object): js.Promise[HTMLElement] = js.native
  
  /**
    * @param {Number} index The index where it should be inserted
    * @param {*} page Page URL. Can be either a HTML document or a <code>&lt;template&gt;</code>
    * @param {Object} [options] Parameter object
    * @param {String} [options.animation] Animation name. Available animations are "slide", "simpleslide", "lift", "fade" and "none"
    * @description Insert the specified page into the page stack with specified index
    */
  def insertPage(index: Double, page: Any): js.Promise[HTMLElement] = js.native
  def insertPage(index: Double, page: Any, options: NavigatorOptions): js.Promise[HTMLElement] = js.native
  
  var onDeviceBackButton: Any = js.native
  
  /**
    * @param {Number} index Decimal ratio of the current swipe.
    * @param {Object} animationOptions Object containing duration and timing.
    * @description Hook called whenever the user slides the navigator.
    **/
  var onSwipe: js.UndefOr[js.Function] = js.native
  
  /**
    * @description Default options object. Attributes have priority over this property.
    */
  var options: NavigatorOptions = js.native
  
  var page: Any = js.native
  
  var pageLoader: Any = js.native
  
  //attribute length in future?
  /**
    * @description Navigator's page stack.
    */
  var pages: Any = js.native
  
  /**
    * @param {Object} [options] Parameter object
    * @param {Function} [options.callback] Function that is called when the transition has ended
    * @description Pops the current page from the page stack. The previous page will be displayed
    */
  def popPage(): js.Promise[HTMLElement] = js.native
  def popPage(options: NavigatorOptions): js.Promise[HTMLElement] = js.native
  
  /**
    * @param {*} page Page URL. Can be either a HTML document or a <code>&lt;template&gt;</code>
    * @param {Object} [options] Parameter object
    * @param {String} [options.animation] Animation name. Available animations are "slide", "simpleslide", "lift", "fade" and "none"
    * @param {Function} [options.callback] Function that is called when the transition has ended
    * @return Promise which resolves to the pushed page.
    * @description Pushes the specified pageUrl into the page stack.
    */
  def pushPage(page: Any): js.Promise[HTMLElement] = js.native
  def pushPage(page: Any, options: PushPageOptions): js.Promise[HTMLElement] = js.native
  
  /* InferMemberOverrides */
  override def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject): Unit = js.native
  /* InferMemberOverrides */
  override def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
  /* InferMemberOverrides */
  override def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: EventListenerOptions): Unit = js.native
  
  def removePage(args: Any*): Any = js.native
  
  /**
    * @return Promise which resolves to the inserted page
    * @description Replaces the current page with the specified one. Extends pushPage parameters.
    */
  def replacePage(page: Any): js.Promise[HTMLElement] = js.native
  def replacePage(page: Any, options: PushPageOptions): js.Promise[HTMLElement] = js.native
  
  /**
    * @param {*} page Page URL. Can be either a HTML document or an <code>&lt;template&gt;</code>
    * @param {Object} [options] Parameter object
    * @param {String} [options.animation] Animation name. Available animations are "slide", "simpleslide", "lift", "fade" and "none"
    * @param {Function} [options.callback] Function that is called when the transition has ended
    * @description Clears page stack and adds the specified pageUrl to the page stack
    */
  def resetToPage(page: Any): js.Promise[HTMLElement] = js.native
  def resetToPage(page: Any, options: NavigatorOptions): js.Promise[HTMLElement] = js.native
  
  /**
    * @return {HTMLElement}
    * @description Current top page element. Use this method to access options passed by `pushPage()`-like methods.
    */
  var topPage: HTMLElement = js.native
}
