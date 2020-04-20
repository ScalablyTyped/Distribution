package typings.phaser.spine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Updatable extends js.Object {
  def isActive(): Boolean
  def update(): Unit
}

object Updatable {
  @scala.inline
  def apply(isActive: () => Boolean, update: () => Unit): Updatable = {
    val __obj = js.Dynamic.literal(isActive = js.Any.fromFunction0(isActive), update = js.Any.fromFunction0(update))
    __obj.asInstanceOf[Updatable]
  }
}

