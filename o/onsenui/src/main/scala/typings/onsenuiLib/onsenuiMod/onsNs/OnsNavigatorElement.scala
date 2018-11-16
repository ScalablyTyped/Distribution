package typings
package onsenuiLib.onsenuiMod.onsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
   * @description A component that provides page stack management and navigation. This component does not have a visible content
   */
@js.native
trait OnsNavigatorElement
  extends stdLib.HTMLElement {
  var onDeviceBackButton: js.Any = js.native
  /**
       * @param {Number} index Decimal ratio of the current swipe.
       * @param {Object} animationOptions Object containing duration and timing.
       * @description Hook called whenever the user slides the navigator.
       **/
  var onSwipe: js.UndefOr[js.Function] = js.native
  /**
       * @description Default options object. Attributes have priority over this property.
       */
  var options: onsenuiLib.onsenuiMod.NavigatorOptions = js.native
  var page: js.Any = js.native
  var pageLoader: js.Any = js.native
   //attribute length in future?
  /**
       * @description Navigator's page stack.
       */
  var pages: js.Any = js.native
  /**
       * @return {HTMLElement}
       * @description Current top page element. Use this method to access options passed by `pushPage()`-like methods.
       */
  var topPage: stdLib.HTMLElement = js.native
  /**
       * @param {any} item
       * @param {Object} [options]
       * @description Page URL or index of an existing page in navigator's stack.
       */
  def bringPageTop(item: js.Any): stdLib.Promise[stdLib.HTMLElement] = js.native
  /**
       * @param {any} item
       * @param {Object} [options]
       * @description Page URL or index of an existing page in navigator's stack.
       */
  def bringPageTop(item: js.Any, options: js.Object): stdLib.Promise[stdLib.HTMLElement] = js.native
  /**
       * @param {Number} index The index where it should be inserted
       * @param {*} page Page URL. Can be either a HTML document or a <code>&lt;ons-template&gt;</code>
       * @param {Object} [options] Parameter object
       * @param {String} [options.animation] Animation name. Available animations are "slide", "simpleslide", "lift", "fade" and "none"
       * @description Insert the specified page into the page stack with specified index
       */
  def insertPage(index: scala.Double, page: js.Any): stdLib.Promise[stdLib.HTMLElement] = js.native
  /**
       * @param {Number} index The index where it should be inserted
       * @param {*} page Page URL. Can be either a HTML document or a <code>&lt;ons-template&gt;</code>
       * @param {Object} [options] Parameter object
       * @param {String} [options.animation] Animation name. Available animations are "slide", "simpleslide", "lift", "fade" and "none"
       * @description Insert the specified page into the page stack with specified index
       */
  def insertPage(index: scala.Double, page: js.Any, options: onsenuiLib.onsenuiMod.NavigatorOptions): stdLib.Promise[stdLib.HTMLElement] = js.native
  /**
       * @param {Object} [options] Parameter object
       * @param {Function} [options.callback] Function that is called when the transition has ended
       * @description Pops the current page from the page stack. The previous page will be displayed
       */
  def popPage(): stdLib.Promise[stdLib.HTMLElement] = js.native
  /**
       * @param {Object} [options] Parameter object
       * @param {Function} [options.callback] Function that is called when the transition has ended
       * @description Pops the current page from the page stack. The previous page will be displayed
       */
  def popPage(options: onsenuiLib.onsenuiMod.NavigatorOptions): stdLib.Promise[stdLib.HTMLElement] = js.native
  /**
       * @param {*} page Page URL. Can be either a HTML document or a <code>&lt;ons-template&gt;</code>
       * @param {Object} [options] Parameter object
       * @param {String} [options.animation] Animation name. Available animations are "slide", "simpleslide", "lift", "fade" and "none"
       * @param {Function} [options.callback] Function that is called when the transition has ended
       * @return Promise which resolves to the pushed page.
       * @description Pushes the specified pageUrl into the page stack.
       */
  def pushPage(page: js.Any): stdLib.Promise[stdLib.HTMLElement] = js.native
  /**
       * @param {*} page Page URL. Can be either a HTML document or a <code>&lt;ons-template&gt;</code>
       * @param {Object} [options] Parameter object
       * @param {String} [options.animation] Animation name. Available animations are "slide", "simpleslide", "lift", "fade" and "none"
       * @param {Function} [options.callback] Function that is called when the transition has ended
       * @return Promise which resolves to the pushed page.
       * @description Pushes the specified pageUrl into the page stack.
       */
  def pushPage(page: js.Any, options: onsenuiLib.onsenuiMod.PushPageOptions): stdLib.Promise[stdLib.HTMLElement] = js.native
  def removePage(args: js.Any*): js.Any = js.native
  /**
       * @return Promise which resolves to the inserted page
       * @description Replaces the current page with the specified one. Extends pushPage parameters.
       */
  def replacePage(page: js.Any): stdLib.Promise[stdLib.HTMLElement] = js.native
  /**
       * @return Promise which resolves to the inserted page
       * @description Replaces the current page with the specified one. Extends pushPage parameters.
       */
  def replacePage(page: js.Any, options: onsenuiLib.onsenuiMod.PushPageOptions): stdLib.Promise[stdLib.HTMLElement] = js.native
  /**
       * @param {*} page Page URL. Can be either a HTML document or an <code>&lt;ons-template&gt;</code>
       * @param {Object} [options] Parameter object
       * @param {String} [options.animation] Animation name. Available animations are "slide", "simpleslide", "lift", "fade" and "none"
       * @param {Function} [options.callback] Function that is called when the transition has ended
       * @description Clears page stack and adds the specified pageUrl to the page stack
       */
  def resetToPage(page: js.Any): stdLib.Promise[stdLib.HTMLElement] = js.native
  /**
       * @param {*} page Page URL. Can be either a HTML document or an <code>&lt;ons-template&gt;</code>
       * @param {Object} [options] Parameter object
       * @param {String} [options.animation] Animation name. Available animations are "slide", "simpleslide", "lift", "fade" and "none"
       * @param {Function} [options.callback] Function that is called when the transition has ended
       * @description Clears page stack and adds the specified pageUrl to the page stack
       */
  def resetToPage(page: js.Any, options: onsenuiLib.onsenuiMod.NavigatorOptions): stdLib.Promise[stdLib.HTMLElement] = js.native
}

