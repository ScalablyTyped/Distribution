package typings.mcustomscrollbar.anon

import typings.mcustomscrollbar.mcustomscrollbarStrings.auto
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AutoExpandHorizontalScroll extends js.Object {
  
  /**
    * Auto-expanding content's width on horizontal scrollbars, values: true, false. Set to true if you have horizontal scrollbr on content that change on-the-fly. Demo contains
    * blocks with images and horizontal scrollbars that use this option parameter
    */
  var autoExpandHorizontalScroll: js.UndefOr[Boolean] = js.native
  
  /**
    * Set the list of elements/selectors that will auto-scroll content to their position when focused.
    * For example, when pressing TAB key to focus input fields, if the field is out of the viewable area the content 
    * will scroll to its top/left position (same bahavior with browser’s native scrollbar).
    * To completely disable this functionality, set autoScrollOnFocus: false.
    * Default:
    *   "input,textarea,select,button,datalist,keygen,a[tabindex],area,object,[contenteditable='true']"
    */
  var autoScrollOnFocus: js.UndefOr[Boolean | String] = js.native
  
  /**
    * Set the auto-update timeout in milliseconds.
    * Default timeout: 60
    */            
  var autoUpdateTimeout: js.UndefOr[Double] = js.native
  
  /**
    * Add extra selector(s) that’ll release scrollbar dragging upon mouseup, pointerup, touchend etc.
    * Example: extraDraggableSelectors: ".myClass, #myID"
    */
  var extraDraggableSelectors: js.UndefOr[String] = js.native
  
  /**
    * Normalize mouse wheel delta (-1/1), values: true, false
    */
  var normalizeMouseWheelDelta: js.UndefOr[Boolean] = js.native
  
  /**
    * Add extra selector(s) that’ll allow scrollbar dragging upon mousemove/up, pointermove/up, touchend etc.
    * Example: releaseDraggableSelectors: ".myClass, #myID"
    */
  var releaseDraggableSelectors: js.UndefOr[String] = js.native
  
  /**
    * Update scrollbars on browser resize (for fluid content blocks and layouts based on percentages), values: true, false. Set to false only when you content has fixed dimensions
    */
  var updateOnBrowserResize: js.UndefOr[Boolean] = js.native
  
  /**
    * Auto-update scrollbars on content resize (useful when adding/changing content progrmatically), value: true, false. Setting this to true makes the script check for content
    * length changes (every few milliseconds) and automatically call plugin's update method to adjust the scrollbar accordingly
    */
  var updateOnContentResize: js.UndefOr[Boolean] = js.native
  
  /**
    * Update scrollbar(s) automatically each time an image inside the element is fully loaded.
    * Default value is auto which triggers the function only on "x" and "yx" axis (if needed).
    * The value should be true when your content contains images and you need the function to trigger on any axis.
    */
  var updateOnImageLoad: js.UndefOr[auto | Boolean] = js.native
  
  /**
    * Update scrollbar(s) automatically when the amount and size of specific selectors changes.
    * Useful when you need to update the scrollbar(s) automatically, each time a type of element is added, removed or changes its size.
    * For example, setting updateOnSelectorChange: "ul li" will update scrollbars each time list-items inside the element are changed.
    * Setting the value to true, will update scrollbars each time any element is changed.
    * To disable (default) set to false.
    */
  var updateOnSelectorChange: js.UndefOr[String | Boolean] = js.native
}
object AutoExpandHorizontalScroll {
  
  @scala.inline
  def apply(): AutoExpandHorizontalScroll = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoExpandHorizontalScroll]
  }
  
  @scala.inline
  implicit class AutoExpandHorizontalScrollOps[Self <: AutoExpandHorizontalScroll] (val x: Self) extends AnyVal {
    
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
    def setAutoExpandHorizontalScroll(value: Boolean): Self = this.set("autoExpandHorizontalScroll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoExpandHorizontalScroll: Self = this.set("autoExpandHorizontalScroll", js.undefined)
    
    @scala.inline
    def setAutoScrollOnFocus(value: Boolean | String): Self = this.set("autoScrollOnFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoScrollOnFocus: Self = this.set("autoScrollOnFocus", js.undefined)
    
    @scala.inline
    def setAutoUpdateTimeout(value: Double): Self = this.set("autoUpdateTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoUpdateTimeout: Self = this.set("autoUpdateTimeout", js.undefined)
    
    @scala.inline
    def setExtraDraggableSelectors(value: String): Self = this.set("extraDraggableSelectors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtraDraggableSelectors: Self = this.set("extraDraggableSelectors", js.undefined)
    
    @scala.inline
    def setNormalizeMouseWheelDelta(value: Boolean): Self = this.set("normalizeMouseWheelDelta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNormalizeMouseWheelDelta: Self = this.set("normalizeMouseWheelDelta", js.undefined)
    
    @scala.inline
    def setReleaseDraggableSelectors(value: String): Self = this.set("releaseDraggableSelectors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReleaseDraggableSelectors: Self = this.set("releaseDraggableSelectors", js.undefined)
    
    @scala.inline
    def setUpdateOnBrowserResize(value: Boolean): Self = this.set("updateOnBrowserResize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdateOnBrowserResize: Self = this.set("updateOnBrowserResize", js.undefined)
    
    @scala.inline
    def setUpdateOnContentResize(value: Boolean): Self = this.set("updateOnContentResize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdateOnContentResize: Self = this.set("updateOnContentResize", js.undefined)
    
    @scala.inline
    def setUpdateOnImageLoad(value: auto | Boolean): Self = this.set("updateOnImageLoad", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdateOnImageLoad: Self = this.set("updateOnImageLoad", js.undefined)
    
    @scala.inline
    def setUpdateOnSelectorChange(value: String | Boolean): Self = this.set("updateOnSelectorChange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdateOnSelectorChange: Self = this.set("updateOnSelectorChange", js.undefined)
  }
}
