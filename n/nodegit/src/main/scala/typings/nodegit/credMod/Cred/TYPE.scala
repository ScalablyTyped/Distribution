package typings.nodegit.credMod.Cred

import typings.nodegit.nodegitNumbers.`16`
import typings.nodegit.nodegitNumbers.`1`
import typings.nodegit.nodegitNumbers.`2`
import typings.nodegit.nodegitNumbers.`32`
import typings.nodegit.nodegitNumbers.`4`
import typings.nodegit.nodegitNumbers.`64`
import typings.nodegit.nodegitNumbers.`8`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.nodegit.nodegitNumbers.`1`
  - typings.nodegit.nodegitNumbers.`2`
  - typings.nodegit.nodegitNumbers.`4`
  - typings.nodegit.nodegitNumbers.`8`
  - typings.nodegit.nodegitNumbers.`16`
  - typings.nodegit.nodegitNumbers.`32`
  - typings.nodegit.nodegitNumbers.`64`
*/
trait TYPE extends js.Object

object TYPE {
  @scala.inline
  def DEFAULT: `8` = this.cast(8)
  @scala.inline
  def SSH_CUSTOM: `4` = this.cast(4)
  @scala.inline
  def SSH_INTERACTIVE: `16` = this.cast(16)
  @scala.inline
  def SSH_KEY: `2` = this.cast(2)
  @scala.inline
  def SSH_MEMORY: `64` = this.cast(64)
  @scala.inline
  def USERNAME: `32` = this.cast(32)
  @scala.inline
  def USERPASS_PLAINTEXT: `1` = this.cast(1)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

