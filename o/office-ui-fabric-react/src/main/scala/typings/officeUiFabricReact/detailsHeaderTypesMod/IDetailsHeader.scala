package typings.officeUiFabricReact.detailsHeaderTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDetailsHeader extends js.Object {
  /** sets focus into the header */
  def focus(): Boolean
}

object IDetailsHeader {
  @scala.inline
  def apply(focus: () => Boolean): IDetailsHeader = {
    val __obj = js.Dynamic.literal(focus = js.Any.fromFunction0(focus))
  
    __obj.asInstanceOf[IDetailsHeader]
  }
}

