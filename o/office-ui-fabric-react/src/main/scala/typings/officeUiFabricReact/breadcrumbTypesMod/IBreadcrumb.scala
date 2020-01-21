package typings.officeUiFabricReact.breadcrumbTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBreadcrumb extends js.Object {
  /**
    * Sets focus to the first breadcrumb link.
    */
  def focus(): Unit
}

object IBreadcrumb {
  @scala.inline
  def apply(focus: () => Unit): IBreadcrumb = {
    val __obj = js.Dynamic.literal(focus = js.Any.fromFunction0(focus))
  
    __obj.asInstanceOf[IBreadcrumb]
  }
}

