package typings
package onsenuiLib.onsenuiMod.onsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @description A component to display a tab bar on the bottom of a page. Used with ons-tab to manage pages using tabs
  */
@js.native
trait OnsTabbarElement
  extends stdLib.HTMLElement {
  /**
    * @param {Number} index Decimal index of the current swipe.
    * @param {Object} animationOptions Object containing duration and timing.
    * @description Hook called whenever the user slides the tabbar.
    **/
  var onSwipe: js.UndefOr[coreDashJsLib.Function] = js.native
  /**
    * @description true if the tabbar is swipeable.
    **/
  var swipeable: scala.Boolean = js.native
  var visible: js.Any = js.native
  /**
    * @return {Number} The index of the currently active tab
    * @description Returns tab index on current active tab. If active tab is not found, returns -1
    */
  def getActiveTabIndex(): scala.Double = js.native
  /**
    * @param {*} url Page URL. Can be either an HTML document or an <code>&lt;ons-template&gt;</code>
    * @return Resolves to the new page element.
    * @description Displays a new page without changing the active index
    */
  def loadPage(page: js.Any): js.Promise[stdLib.HTMLElement] = js.native
  def loadPage(page: js.Any, options: onsenuiLib.onsenuiMod.TabbarOptions): js.Promise[stdLib.HTMLElement] = js.native
  /**
    * @param {Number} index Tab index
    * @param {Object} [options] Parameter object
    * @param {Boolean} [options.keepPage] If true the page will not be changed
    * @param {String} [options.animation] Animation name. Available animations are `"fade"`, `"slide"` and `"none"`.
    * @return Resolves to the new page element.
    * @description Show specified tab page. Animations and other options can be specified by the second parameter
    */
  def setActiveTab(index: scala.Double): js.Promise[stdLib.HTMLElement] = js.native
  def setActiveTab(index: scala.Double, options: onsenuiLib.onsenuiMod.TabbarOptions): js.Promise[stdLib.HTMLElement] = js.native
  /**
    * @description Used to hide or show the tab bar.
    */
  def setTabbarVisibility(visible: scala.Boolean): scala.Unit = js.native
}

