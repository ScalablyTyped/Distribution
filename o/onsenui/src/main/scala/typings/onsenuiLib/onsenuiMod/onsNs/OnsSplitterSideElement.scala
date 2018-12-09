package typings
package onsenuiLib.onsenuiMod.onsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnsSplitterSideElement
  extends stdLib.HTMLElement {
  /**
       * @description Returns whether the popover is visible or not.
       * @return {Boolean} This value is `true` when the menu is open.
       */
  var isOpen: scala.Boolean = js.native
  /**
       * @description Current mode. Possible values are "split", "collapse", "closed", "open" or "changing".
       */
  var mode: java.lang.String = js.native
  /**
       * @param {Number} index Decimal ratio of the current swipe.
       * @param {Object} animationOptions Object containing duration and timing.
       * @description Hook called whenever the user slides the splitter.
       **/
  var onSwipe: js.UndefOr[coreDashJsLib.Function] = js.native
  /**
       * @description Page element loaded in the splitter side.
       */
  var page: java.lang.String = js.native
  var pageLoader: js.Any = js.native
  /**
       * @description Close menu in collapse mode.
       * @param {Object} [option]
       * @return Resolves to the splitter side element or false if not in collapse mode
       */
  def close(): js.Promise[stdLib.HTMLElement | scala.Boolean] = js.native
  /**
       * @description Close menu in collapse mode.
       * @param {Object} [option]
       * @return Resolves to the splitter side element or false if not in collapse mode
       */
  def close(options: onsenuiLib.onsenuiMod.SplitterSideOptions): js.Promise[stdLib.HTMLElement | scala.Boolean] = js.native
  /**
       * @description Show the page specified in pageUrl in the right section
       * @param {*} page Page URL. Can be either an HTML document or an <ons-template>.
       * @param {Object} [option]
       * @return Resolves to the new page element
       */
  def load(page: js.Any): js.Promise[stdLib.HTMLElement] = js.native
  /**
       * @description Show the page specified in pageUrl in the right section
       * @param {*} page Page URL. Can be either an HTML document or an <ons-template>.
       * @param {Object} [option]
       * @return Resolves to the new page element
       */
  def load(page: js.Any, options: onsenuiLib.onsenuiMod.SplitterSideOptions): js.Promise[stdLib.HTMLElement] = js.native
  /**
       * @description Open menu in collapse mode.
       * @return Resolves to the splitter side element or false if not in collapse mode
       */
  def open(): js.Promise[stdLib.HTMLElement | scala.Boolean] = js.native
  /**
       * @description Open menu in collapse mode.
       * @return Resolves to the splitter side element or false if not in collapse mode
       */
  def open(options: onsenuiLib.onsenuiMod.SplitterSideOptions): js.Promise[stdLib.HTMLElement | scala.Boolean] = js.native
  /**
       * @description Opens if it's closed. Closes if it's open.
       * @param {Object} [options]
       * @return Resolves to the splitter side element or false if not in collapse mode
       */
  def toggle(): js.Promise[stdLib.HTMLElement | scala.Boolean] = js.native
  /**
       * @description Opens if it's closed. Closes if it's open.
       * @param {Object} [options]
       * @return Resolves to the splitter side element or false if not in collapse mode
       */
  def toggle(options: onsenuiLib.onsenuiMod.SplitterSideOptions): js.Promise[stdLib.HTMLElement | scala.Boolean] = js.native
}

