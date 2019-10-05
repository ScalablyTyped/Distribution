package typings.nodegit.checkoutMod.Checkout

import typings.nodegit.nodegitNumbers.`0`
import typings.nodegit.nodegitNumbers.`16`
import typings.nodegit.nodegitNumbers.`1`
import typings.nodegit.nodegitNumbers.`2`
import typings.nodegit.nodegitNumbers.`4`
import typings.nodegit.nodegitNumbers.`65535`
import typings.nodegit.nodegitNumbers.`8`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.nodegit.nodegitNumbers.`0`
  - typings.nodegit.nodegitNumbers.`1`
  - typings.nodegit.nodegitNumbers.`2`
  - typings.nodegit.nodegitNumbers.`4`
  - typings.nodegit.nodegitNumbers.`8`
  - typings.nodegit.nodegitNumbers.`16`
  - typings.nodegit.nodegitNumbers.`65535`
*/
trait NOTIFY extends js.Object

object NOTIFY {
  @scala.inline
  def ALL: `65535` = this.cast(65535)
  @scala.inline
  def CONFLICT: `1` = this.cast(1)
  @scala.inline
  def DIRTY: `2` = this.cast(2)
  @scala.inline
  def IGNORED: `16` = this.cast(16)
  @scala.inline
  def NONE: `0` = this.cast(0)
  @scala.inline
  def UNTRACKED: `8` = this.cast(8)
  @scala.inline
  def UPDATED: `4` = this.cast(4)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

