package typings.nodegit.blameMod.Blame

import typings.nodegit.nodegitNumbers.`0`
import typings.nodegit.nodegitNumbers.`16`
import typings.nodegit.nodegitNumbers.`1`
import typings.nodegit.nodegitNumbers.`2`
import typings.nodegit.nodegitNumbers.`4`
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
*/
trait FLAG extends js.Object

object FLAG {
  @scala.inline
  def FIRST_PARENT: `16` = this.cast(16)
  @scala.inline
  def NORMAL: `0` = this.cast(0)
  @scala.inline
  def TRACK_COPIES_ANY_COMMIT_COPIES: `8` = this.cast(8)
  @scala.inline
  def TRACK_COPIES_SAME_COMMIT_COPIES: `4` = this.cast(4)
  @scala.inline
  def TRACK_COPIES_SAME_COMMIT_MOVES: `2` = this.cast(2)
  @scala.inline
  def TRACK_COPIES_SAME_FILE: `1` = this.cast(1)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

