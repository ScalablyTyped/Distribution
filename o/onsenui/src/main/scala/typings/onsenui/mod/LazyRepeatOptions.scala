package typings.onsenui.mod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LazyRepeatOptions extends js.Object {
  /**
    * @description Should return the height of an item. The index is provided as an argument. This is important when rendering lists where the items have different height. The function is optional and if it isn't present the height of the first item will be automatically calculated and used for all other items.
    */
  var calculateItemHeight: js.UndefOr[Double] = js.native
  /**
    * @description Function which recieves an index and the scope for the item. Can be used to configure values in the item scope.
    */
  var configureItemScope: js.UndefOr[Double] = js.native
  /**
    * @description Should return the number of items in the list.
    */
  var countItems: js.UndefOr[Double] = js.native
  /**
    * @description This function should return a `HTMLElement`. To help rendering the element, the current index and a template is supplied as arguments. The template is the initial content of the `<ons-lazy-repeat>` element.
    */
  var createItemContent: js.UndefOr[HTMLElement] = js.native
  /**
    * @description This function is used called when an item is removed from the DOM. The index and DOM element is provided as arguments. The function is optional but may be important in order to avoid memory leaks.
    */
  var destroyItem: js.UndefOr[String] = js.native
}

object LazyRepeatOptions {
  @scala.inline
  def apply(): LazyRepeatOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LazyRepeatOptions]
  }
  @scala.inline
  implicit class LazyRepeatOptionsOps[Self <: LazyRepeatOptions] (val x: Self) extends AnyVal {
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
    def setCalculateItemHeight(value: Double): Self = this.set("calculateItemHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCalculateItemHeight: Self = this.set("calculateItemHeight", js.undefined)
    @scala.inline
    def setConfigureItemScope(value: Double): Self = this.set("configureItemScope", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConfigureItemScope: Self = this.set("configureItemScope", js.undefined)
    @scala.inline
    def setCountItems(value: Double): Self = this.set("countItems", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCountItems: Self = this.set("countItems", js.undefined)
    @scala.inline
    def setCreateItemContent(value: HTMLElement): Self = this.set("createItemContent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreateItemContent: Self = this.set("createItemContent", js.undefined)
    @scala.inline
    def setDestroyItem(value: String): Self = this.set("destroyItem", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDestroyItem: Self = this.set("destroyItem", js.undefined)
  }
  
}

