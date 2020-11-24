package typings.packery.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PackeryOptions extends js.Object {
  
  /**
    * [columnWidth The width of a column of a horizontal grid. When set, Packery will align item elements horizontally to this grid]
    * @type {number}
    */
  var columnWidth: js.UndefOr[Double] = js.native
  
  /**
    * [containerStyle CSS styles that are applied to the container element. To disable Packery from setting any CSS to the container element, set containerStyle: null]
    * @type {Object}
    */
  var containerStyle: js.UndefOr[js.Object] = js.native
  
  /**
    * [gutter The space between item elements, both vertically and horizontally]
    * @type {number}
    */
  var gutter: js.UndefOr[Double] = js.native
  
  /**
    * [isHorizontal Arranges items horizontally instead of vertically]
    * @type {boolean}
    */
  var isHorizontal: js.UndefOr[Boolean] = js.native
  
  /**
    * [isInitLayout Enables layout on initialization. Set this to false to disable layout on initialization, so you can use methods or add events before the initial layout]
    * @type {boolean}
    */
  var isInitLayout: js.UndefOr[Boolean] = js.native
  
  /**
    * [isOriginLeft Controls the horizontal flow of the layout. By default, item elements start positioning at the left. Set to false for right-to-left layouts]
    * @type {boolean}
    */
  var isOriginLeft: js.UndefOr[Boolean] = js.native
  
  /**
    * [isOriginTop Controls the vertical flow of the layout. By default, item elements start positioning at the top. Set to false for bottom-up layouts. It’s like Tetris!]
    * @type {boolean}
    */
  var isOriginTop: js.UndefOr[Boolean] = js.native
  
  /**
    * [isResizeBound Binds layout to window resizing]
    * @type {boolean}
    */
  var isResizeBound: js.UndefOr[Boolean] = js.native
  
  /**
    * [itemSelector Specifies which child elements to be used as item elements. Setting itemSelector is always recommended. itemSelector is useful to exclude sizing elements]
    * @type {string}
    */
  var itemSelector: js.UndefOr[String] = js.native
  
  /**
    * [percentPosition Will set item position in percent values, rather than pixel values. percentPosition works well with percent-width items, as items will not transition their position on resize]
    * @type {boolean}
    */
  var percentPosition: js.UndefOr[Boolean] = js.native
  
  /**
    * [rowHeight Height of a row of a vertical grid. When set, Packery will align item elements vertically to this grid]
    * @type {number}
    */
  var rowHeight: js.UndefOr[Double] = js.native
  
  /**
    * [stamp Specifies which elements are stamped within the layout. These are special layout elements which will not be laid out by Packery. Rather, Packery will layout item elements around stamped elements]
    * @type {string}
    */
  var stamp: js.UndefOr[String] = js.native
  
  /**
    * [transitionDuration The time duration of transitions for item elements]
    * @type {string}
    */
  var transitionDuration: js.UndefOr[String] = js.native
}
object PackeryOptions {
  
  @scala.inline
  def apply(): PackeryOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PackeryOptions]
  }
  
  @scala.inline
  implicit class PackeryOptionsOps[Self <: PackeryOptions] (val x: Self) extends AnyVal {
    
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
    def setColumnWidth(value: Double): Self = this.set("columnWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumnWidth: Self = this.set("columnWidth", js.undefined)
    
    @scala.inline
    def setContainerStyle(value: js.Object): Self = this.set("containerStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainerStyle: Self = this.set("containerStyle", js.undefined)
    
    @scala.inline
    def setGutter(value: Double): Self = this.set("gutter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGutter: Self = this.set("gutter", js.undefined)
    
    @scala.inline
    def setIsHorizontal(value: Boolean): Self = this.set("isHorizontal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsHorizontal: Self = this.set("isHorizontal", js.undefined)
    
    @scala.inline
    def setIsInitLayout(value: Boolean): Self = this.set("isInitLayout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsInitLayout: Self = this.set("isInitLayout", js.undefined)
    
    @scala.inline
    def setIsOriginLeft(value: Boolean): Self = this.set("isOriginLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsOriginLeft: Self = this.set("isOriginLeft", js.undefined)
    
    @scala.inline
    def setIsOriginTop(value: Boolean): Self = this.set("isOriginTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsOriginTop: Self = this.set("isOriginTop", js.undefined)
    
    @scala.inline
    def setIsResizeBound(value: Boolean): Self = this.set("isResizeBound", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsResizeBound: Self = this.set("isResizeBound", js.undefined)
    
    @scala.inline
    def setItemSelector(value: String): Self = this.set("itemSelector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItemSelector: Self = this.set("itemSelector", js.undefined)
    
    @scala.inline
    def setPercentPosition(value: Boolean): Self = this.set("percentPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePercentPosition: Self = this.set("percentPosition", js.undefined)
    
    @scala.inline
    def setRowHeight(value: Double): Self = this.set("rowHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRowHeight: Self = this.set("rowHeight", js.undefined)
    
    @scala.inline
    def setStamp(value: String): Self = this.set("stamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStamp: Self = this.set("stamp", js.undefined)
    
    @scala.inline
    def setTransitionDuration(value: String): Self = this.set("transitionDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransitionDuration: Self = this.set("transitionDuration", js.undefined)
  }
}
