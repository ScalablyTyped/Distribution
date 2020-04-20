package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMFDocListCtrl extends js.Object {
  def AttachToListingWindow(shellListing: js.Any): Unit
}

object IMFDocListCtrl {
  @scala.inline
  def apply(AttachToListingWindow: js.Any => Unit): IMFDocListCtrl = {
    val __obj = js.Dynamic.literal(AttachToListingWindow = js.Any.fromFunction1(AttachToListingWindow))
    __obj.asInstanceOf[IMFDocListCtrl]
  }
}

