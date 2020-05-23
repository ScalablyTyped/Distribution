package typings.openfin.GoldenLayout

import typings.jquery.JQuery
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Tab extends js.Object {
  var _dragListener: EventEmitter
  /**
    * The (jQuery) DOM element that closes the tab
    */
  var closeElement: JQuery[HTMLElement]
  /**
    * A reference to the content item this tab relates to
    */
  var contentItem: ContentItem
  /**
    * The tabs outer (jQuery) DOM element
    */
  var element: JQuery[HTMLElement]
  /**
    * A reference to the header this tab is a child of
    */
  var header: Header
  /**
    * True if this tab is the selected tab
    */
  var isActive: Boolean
  /**
    * The (jQuery) DOM element containing the title
    */
  var titleElement: JQuery[HTMLElement]
  /**
    * Sets this tab's active state. To programmatically switch tabs, use header.setActiveContentItem( item ) instead.
    * @param isActive Whether the tab is active
    */
  def setActive(isActive: Boolean): Unit
  /**
    * Sets the tab's title. Does not affect the contentItem's title!
    * @param title The new title
    */
  def setTitle(title: String): Unit
}

object Tab {
  @scala.inline
  def apply(
    _dragListener: EventEmitter,
    closeElement: JQuery[HTMLElement],
    contentItem: ContentItem,
    element: JQuery[HTMLElement],
    header: Header,
    isActive: Boolean,
    setActive: Boolean => Unit,
    setTitle: String => Unit,
    titleElement: JQuery[HTMLElement]
  ): Tab = {
    val __obj = js.Dynamic.literal(_dragListener = _dragListener.asInstanceOf[js.Any], closeElement = closeElement.asInstanceOf[js.Any], contentItem = contentItem.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], isActive = isActive.asInstanceOf[js.Any], setActive = js.Any.fromFunction1(setActive), setTitle = js.Any.fromFunction1(setTitle), titleElement = titleElement.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tab]
  }
}

