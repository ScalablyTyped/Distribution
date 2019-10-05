package typings.pixiDashSpine.PIXI.spine.core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Restorable extends js.Object {
  def restore(): Unit
}

object Restorable {
  @scala.inline
  def apply(restore: () => Unit): Restorable = {
    val __obj = js.Dynamic.literal(restore = js.Any.fromFunction0(restore))
  
    __obj.asInstanceOf[Restorable]
  }
}

