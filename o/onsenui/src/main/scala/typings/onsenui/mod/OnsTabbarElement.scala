package typings.onsenui.mod

import typings.std.AddEventListenerOptions
import typings.std.EventListenerOptions
import typings.std.EventListenerOrEventListenerObject
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @description A component to display a tab bar on the bottom of a page. Used with ons-tab to manage pages using tabs
  */
@js.native
trait OnsTabbarElement
  extends StObject
     with HTMLElement {
  
  var activeIndex: Double = js.native
  
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
    * @return {Number} The index of the currently active tab
    * @description Returns tab index on current active tab. If active tab is not found, returns -1
    */
  def getActiveTabIndex(): Double = js.native
  
  var hideTabs: Boolean = js.native
  
  /**
    * @param {*} url Page URL. Can be either an HTML document or an <code>&lt;template&gt;</code>
    * @return Resolves to the new page element.
    * @description Displays a new page without changing the active index
    */
  def loadPage(page: Any): js.Promise[HTMLElement] = js.native
  def loadPage(page: Any, options: TabbarOptions): js.Promise[HTMLElement] = js.native
  
  /**
    * @param {Number} index Decimal index of the current swipe.
    * @param {Object} animationOptions Object containing duration and timing.
    * @description Hook called whenever the user slides the tabbar.
    **/
  var onSwipe: js.UndefOr[js.Function] = js.native
  
  /* InferMemberOverrides */
  override def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject): Unit = js.native
  /* InferMemberOverrides */
  override def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
  /* InferMemberOverrides */
  override def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: EventListenerOptions): Unit = js.native
  
  /**
    * @param {Number} index Tab index
    * @param {Object} [options] Parameter object
    * @param {Boolean} [options.keepPage] If true the page will not be changed
    * @param {String} [options.animation] Animation name. Available animations are `"fade"`, `"slide"` and `"none"`.
    * @return Resolves to the new page element.
    * @description Show specified tab page. Animations and other options can be specified by the second parameter
    */
  def setActiveTab(index: Double): js.Promise[HTMLElement] = js.native
  def setActiveTab(index: Double, options: TabbarOptions): js.Promise[HTMLElement] = js.native
  
  /**
    * @description Used to hide or show the tab bar.
    */
  def setTabbarVisibility(visible: Boolean): Unit = js.native
  
  /**
    * @description true if the tabbar is swipeable.
    **/
  var swipeable: Boolean = js.native
  
  /**
    * @description If this property is set the tabs show a dynamic bottom border. Only works for iOS flat design since the border is always visible in Material Design.
    **/
  var tabBorder: Boolean = js.native
  
  var visible: Any = js.native
}
