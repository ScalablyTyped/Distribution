package typings
package mcustomscrollbarLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AutoAutoExpandHorizontalScroll extends js.Object {
  /**
    * Auto-expanding content's width on horizontal scrollbars, values: true, false. Set to true if you have horizontal scrollbr on content that change on-the-fly. Demo contains
    * blocks with images and horizontal scrollbars that use this option parameter
    */
  var autoExpandHorizontalScroll: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Set the list of elements/selectors that will auto-scroll content to their position when focused.
    * For example, when pressing TAB key to focus input fields, if the field is out of the viewable area the content 
    * will scroll to its top/left position (same bahavior with browser’s native scrollbar).
    * To completely disable this functionality, set autoScrollOnFocus: false.
    * Default:
    *   "input,textarea,select,button,datalist,keygen,a[tabindex],area,object,[contenteditable='true']"
    */
  var autoScrollOnFocus: js.UndefOr[scala.Boolean | java.lang.String] = js.undefined
  /**
    * Set the auto-update timeout in milliseconds.
    * Default timeout: 60
    */            
  var autoUpdateTimeout: js.UndefOr[scala.Double] = js.undefined
  /**
    * Add extra selector(s) that’ll release scrollbar dragging upon mouseup, pointerup, touchend etc.
    * Example: extraDraggableSelectors: ".myClass, #myID"
    */
  var extraDraggableSelectors: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Normalize mouse wheel delta (-1/1), values: true, false
    */
  var normalizeMouseWheelDelta: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Add extra selector(s) that’ll allow scrollbar dragging upon mousemove/up, pointermove/up, touchend etc.
    * Example: releaseDraggableSelectors: ".myClass, #myID"
    */
  var releaseDraggableSelectors: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Update scrollbars on browser resize (for fluid content blocks and layouts based on percentages), values: true, false. Set to false only when you content has fixed dimensions
    */
  var updateOnBrowserResize: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Auto-update scrollbars on content resize (useful when adding/changing content progrmatically), value: true, false. Setting this to true makes the script check for content
    * length changes (every few milliseconds) and automatically call plugin's update method to adjust the scrollbar accordingly
    */
  var updateOnContentResize: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Update scrollbar(s) automatically each time an image inside the element is fully loaded.
    * Default value is auto which triggers the function only on "x" and "yx" axis (if needed).
    * The value should be true when your content contains images and you need the function to trigger on any axis.
    */
  var updateOnImageLoad: js.UndefOr[mcustomscrollbarLib.mcustomscrollbarLibStrings.auto | scala.Boolean] = js.undefined
  /**
    * Update scrollbar(s) automatically when the amount and size of specific selectors changes.
    * Useful when you need to update the scrollbar(s) automatically, each time a type of element is added, removed or changes its size.
    * For example, setting updateOnSelectorChange: "ul li" will update scrollbars each time list-items inside the element are changed.
    * Setting the value to true, will update scrollbars each time any element is changed.
    * To disable (default) set to false.
    */
  var updateOnSelectorChange: js.UndefOr[java.lang.String | scala.Boolean] = js.undefined
}

