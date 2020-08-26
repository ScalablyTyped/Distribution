package typings.officeUiFabricReact.searchBoxTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISearchBox extends js.Object {
  /**
    * Sets focus inside the search input box.
    */
  def focus(): Unit = js.native
  /**
    * Returns whether or not the SearchBox has focus
    */
  def hasFocus(): Boolean = js.native
}

object ISearchBox {
  @scala.inline
  def apply(focus: () => Unit, hasFocus: () => Boolean): ISearchBox = {
    val __obj = js.Dynamic.literal(focus = js.Any.fromFunction0(focus), hasFocus = js.Any.fromFunction0(hasFocus))
    __obj.asInstanceOf[ISearchBox]
  }
  @scala.inline
  implicit class ISearchBoxOps[Self <: ISearchBox] (val x: Self) extends AnyVal {
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
    def setFocus(value: () => Unit): Self = this.set("focus", js.Any.fromFunction0(value))
    @scala.inline
    def setHasFocus(value: () => Boolean): Self = this.set("hasFocus", js.Any.fromFunction0(value))
  }
  
}

