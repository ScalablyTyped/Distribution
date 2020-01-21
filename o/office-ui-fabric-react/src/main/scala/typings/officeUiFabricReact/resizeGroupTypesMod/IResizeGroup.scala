package typings.officeUiFabricReact.resizeGroupTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IResizeGroup extends js.Object {
  /**
    * Remeasures the available space.
    */
  def remeasure(): Unit
}

object IResizeGroup {
  @scala.inline
  def apply(remeasure: () => Unit): IResizeGroup = {
    val __obj = js.Dynamic.literal(remeasure = js.Any.fromFunction0(remeasure))
  
    __obj.asInstanceOf[IResizeGroup]
  }
}

