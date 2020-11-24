package typings.openfin.GoldenLayout

import typings.jquery.JQuery
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Tab extends js.Object {
  
  var _dragListener: EventEmitter = js.native
  
  /**
    * The (jQuery) DOM element that closes the tab
    */
  var closeElement: JQuery[HTMLElement] = js.native
  
  /**
    * A reference to the content item this tab relates to
    */
  var contentItem: ContentItem = js.native
  
  /**
    * The tabs outer (jQuery) DOM element
    */
  var element: JQuery[HTMLElement] = js.native
  
  /**
    * A reference to the header this tab is a child of
    */
  var header: Header = js.native
  
  /**
    * True if this tab is the selected tab
    */
  var isActive: Boolean = js.native
  
  /**
    * Sets this tab's active state. To programmatically switch tabs, use header.setActiveContentItem( item ) instead.
    * @param isActive Whether the tab is active
    */
  def setActive(isActive: Boolean): Unit = js.native
  
  /**
    * Sets the tab's title. Does not affect the contentItem's title!
    * @param title The new title
    */
  def setTitle(title: String): Unit = js.native
  
  /**
    * The (jQuery) DOM element containing the title
    */
  var titleElement: JQuery[HTMLElement] = js.native
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
  
  @scala.inline
  implicit class TabOps[Self <: Tab] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def set_dragListener(value: EventEmitter): Self = this.set("_dragListener", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloseElement(value: JQuery[HTMLElement]): Self = this.set("closeElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentItem(value: ContentItem): Self = this.set("contentItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElement(value: JQuery[HTMLElement]): Self = this.set("element", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeader(value: Header): Self = this.set("header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsActive(value: Boolean): Self = this.set("isActive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetActive(value: Boolean => Unit): Self = this.set("setActive", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetTitle(value: String => Unit): Self = this.set("setTitle", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTitleElement(value: JQuery[HTMLElement]): Self = this.set("titleElement", value.asInstanceOf[js.Any])
  }
}
