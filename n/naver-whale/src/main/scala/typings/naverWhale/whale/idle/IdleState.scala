package typings.naverWhale.whale.idle

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.naverWhale.naverWhaleStrings.active
  - typings.naverWhale.naverWhaleStrings.idle
  - typings.naverWhale.naverWhaleStrings.locked
*/
trait IdleState extends js.Object

object IdleState {
  @scala.inline
  def active: typings.naverWhale.naverWhaleStrings.active = this.cast("active")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def idle: typings.naverWhale.naverWhaleStrings.idle = this.cast("idle")
  @scala.inline
  def locked: typings.naverWhale.naverWhaleStrings.locked = this.cast("locked")
}

