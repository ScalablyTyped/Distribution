package typings.openfin.GoldenLayout

import typings.jquery.JQuery
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Header extends js.Object {
  /**
    * The currently selected activeContentItem
    */
  var activeContentItem: ContentItem = js.native
  /**
    * The (jQuery) DOM element containing the close, maximise and popout button
    */
  var controlsContainer: JQuery[HTMLElement] = js.native
  /**
    * The outer (jQuery) DOM element of this Header
    */
  var element: JQuery[HTMLElement] = js.native
  /**
    * A reference to the LayoutManager instance
    */
  var layoutManager: typings.openfin.GoldenLayout.GoldenLayout = js.native
  /**
    * A reference to the Stack this Header belongs to
    */
  var parent: ContentItem = js.native
  /**
    * An array of the Tabs within this header
    */
  var tabs: js.Array[Tab] = js.native
  /**
    * The (jQuery) DOM element containing the tabs
    */
  var tabsContainer: JQuery[HTMLElement] = js.native
  /**
    * Creates a new tab and associates it with a content item
    * @param contentItem The content item the tab will be associated with
    * @param index A zero based index, specifying the position of the new tab
    */
  def createTab(contentItem: ContentItem): Unit = js.native
  def createTab(contentItem: ContentItem, index: Double): Unit = js.native
  /**
    * Finds a tab by its contentItem and removes it
    * @param contentItem The content item the tab is associated with
    */
  def removeTab(contentItem: ContentItem): Unit = js.native
  /**
    * Hides the currently selected contentItem, shows the specified one and highlights its tab.
    * @param contentItem The content item that will be selected
    */
  def setActiveContentItem(contentItem: ContentItem): Unit = js.native
}

