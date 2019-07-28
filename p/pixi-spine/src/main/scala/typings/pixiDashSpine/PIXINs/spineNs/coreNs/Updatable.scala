package typings.pixiDashSpine.PIXINs.spineNs.coreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Updatable extends js.Object {
  def update(): Unit
}

object Updatable {
  @scala.inline
  def apply(update: () => Unit): Updatable = {
    val __obj = js.Dynamic.literal(update = js.Any.fromFunction0(update))
  
    __obj.asInstanceOf[Updatable]
  }
}

