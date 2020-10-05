package typings.onsenui.mod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnsSplitterSideElement extends HTMLElement {
  /**
    * @description Returns whether the popover is visible or not.
    * @return {Boolean} This value is `true` when the menu is open.
    */
  var isOpen: Boolean = js.native
  /**
    * @description Current mode. Possible values are "split", "collapse", "closed", "open" or "changing".
    */
  var mode: String = js.native
  /**
    * @param {Number} index Decimal ratio of the current swipe.
    * @param {Object} animationOptions Object containing duration and timing.
    * @description Hook called whenever the user slides the splitter.
    **/
  var onSwipe: js.UndefOr[js.Function] = js.native
  /**
    * @description Page element loaded in the splitter side.
    */
  var page: String = js.native
  var pageLoader: js.Any = js.native
  /**
    * @description Close menu in collapse mode.
    * @param {Object} [option]
    * @return Resolves to the splitter side element or false if not in collapse mode
    */
  def close(): js.Promise[HTMLElement | Boolean] = js.native
  def close(options: SplitterSideOptions): js.Promise[HTMLElement | Boolean] = js.native
  /**
    * @description Show the page specified in pageUrl in the right section
    * @param {*} page Page URL. Can be either an HTML document or an <ons-template>.
    * @param {Object} [option]
    * @return Resolves to the new page element
    */
  def load(page: js.Any): js.Promise[HTMLElement] = js.native
  def load(page: js.Any, options: SplitterSideOptions): js.Promise[HTMLElement] = js.native
  /**
    * @description Open menu in collapse mode.
    * @return Resolves to the splitter side element or false if not in collapse mode
    */
  def open(): js.Promise[HTMLElement | Boolean] = js.native
  def open(options: SplitterSideOptions): js.Promise[HTMLElement | Boolean] = js.native
  /**
    * @description Opens if it's closed. Closes if it's open.
    * @param {Object} [options]
    * @return Resolves to the splitter side element or false if not in collapse mode
    */
  def toggle(): js.Promise[HTMLElement | Boolean] = js.native
  def toggle(options: SplitterSideOptions): js.Promise[HTMLElement | Boolean] = js.native
}

