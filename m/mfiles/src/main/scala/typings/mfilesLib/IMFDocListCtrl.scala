package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMFDocListCtrl extends js.Object {
  def AttachToListingWindow(shellListing: js.Any): scala.Unit
}

object IMFDocListCtrl {
  @scala.inline
  def apply(AttachToListingWindow: js.Function1[js.Any, scala.Unit]): IMFDocListCtrl = {
    val __obj = js.Dynamic.literal(AttachToListingWindow = AttachToListingWindow)
  
    __obj.asInstanceOf[IMFDocListCtrl]
  }
}

