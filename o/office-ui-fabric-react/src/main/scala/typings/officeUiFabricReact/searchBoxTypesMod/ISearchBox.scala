package typings.officeUiFabricReact.searchBoxTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISearchBox extends js.Object {
  /**
    * Sets focus inside the search input box.
    */
  def focus(): Unit
  /**
    * Returns whether or not the SearchBox has focus
    */
  def hasFocus(): Boolean
}

object ISearchBox {
  @scala.inline
  def apply(focus: () => Unit, hasFocus: () => Boolean): ISearchBox = {
    val __obj = js.Dynamic.literal(focus = js.Any.fromFunction0(focus), hasFocus = js.Any.fromFunction0(hasFocus))
    __obj.asInstanceOf[ISearchBox]
  }
}

