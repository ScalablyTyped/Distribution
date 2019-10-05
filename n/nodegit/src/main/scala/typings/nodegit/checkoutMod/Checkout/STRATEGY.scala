package typings.nodegit.checkoutMod.Checkout

import typings.nodegit.nodegitNumbers.`0`
import typings.nodegit.nodegitNumbers.`1024`
import typings.nodegit.nodegitNumbers.`1048576`
import typings.nodegit.nodegitNumbers.`128`
import typings.nodegit.nodegitNumbers.`131072`
import typings.nodegit.nodegitNumbers.`16`
import typings.nodegit.nodegitNumbers.`1`
import typings.nodegit.nodegitNumbers.`2048`
import typings.nodegit.nodegitNumbers.`2097152`
import typings.nodegit.nodegitNumbers.`256`
import typings.nodegit.nodegitNumbers.`262144`
import typings.nodegit.nodegitNumbers.`2`
import typings.nodegit.nodegitNumbers.`32`
import typings.nodegit.nodegitNumbers.`4096`
import typings.nodegit.nodegitNumbers.`4194304`
import typings.nodegit.nodegitNumbers.`4`
import typings.nodegit.nodegitNumbers.`512`
import typings.nodegit.nodegitNumbers.`524288`
import typings.nodegit.nodegitNumbers.`64`
import typings.nodegit.nodegitNumbers.`65536`
import typings.nodegit.nodegitNumbers.`8192`
import typings.nodegit.nodegitNumbers.`8388608`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.nodegit.nodegitNumbers.`0`
  - typings.nodegit.nodegitNumbers.`1`
  - typings.nodegit.nodegitNumbers.`2`
  - typings.nodegit.nodegitNumbers.`4`
  - typings.nodegit.nodegitNumbers.`16`
  - typings.nodegit.nodegitNumbers.`32`
  - typings.nodegit.nodegitNumbers.`64`
  - typings.nodegit.nodegitNumbers.`128`
  - typings.nodegit.nodegitNumbers.`256`
  - typings.nodegit.nodegitNumbers.`512`
  - typings.nodegit.nodegitNumbers.`1024`
  - typings.nodegit.nodegitNumbers.`2048`
  - typings.nodegit.nodegitNumbers.`4096`
  - typings.nodegit.nodegitNumbers.`8192`
  - typings.nodegit.nodegitNumbers.`262144`
  - typings.nodegit.nodegitNumbers.`524288`
  - typings.nodegit.nodegitNumbers.`1048576`
  - typings.nodegit.nodegitNumbers.`2097152`
  - typings.nodegit.nodegitNumbers.`4194304`
  - typings.nodegit.nodegitNumbers.`8388608`
  - typings.nodegit.nodegitNumbers.`65536`
  - typings.nodegit.nodegitNumbers.`131072`
*/
trait STRATEGY extends js.Object

object STRATEGY {
  @scala.inline
  def ALLOW_CONFLICTS: `16` = this.cast(16)
  @scala.inline
  def CONFLICT_STYLE_DIFF3: `2097152` = this.cast(2097152)
  @scala.inline
  def CONFLICT_STYLE_MERGE: `1048576` = this.cast(1048576)
  @scala.inline
  def DISABLE_PATHSPEC_MATCH: `8192` = this.cast(8192)
  @scala.inline
  def DONT_OVERWRITE_IGNORED: `524288` = this.cast(524288)
  @scala.inline
  def DONT_REMOVE_EXISTING: `4194304` = this.cast(4194304)
  @scala.inline
  def DONT_UPDATE_INDEX: `256` = this.cast(256)
  @scala.inline
  def DONT_WRITE_INDEX: `8388608` = this.cast(8388608)
  @scala.inline
  def FORCE: `2` = this.cast(2)
  @scala.inline
  def NONE: `0` = this.cast(0)
  @scala.inline
  def NO_REFRESH: `512` = this.cast(512)
  @scala.inline
  def RECREATE_MISSING: `4` = this.cast(4)
  @scala.inline
  def REMOVE_IGNORED: `64` = this.cast(64)
  @scala.inline
  def REMOVE_UNTRACKED: `32` = this.cast(32)
  @scala.inline
  def SAFE: `1` = this.cast(1)
  @scala.inline
  def SKIP_LOCKED_DIRECTORIES: `262144` = this.cast(262144)
  @scala.inline
  def SKIP_UNMERGED: `1024` = this.cast(1024)
  @scala.inline
  def UPDATE_ONLY: `128` = this.cast(128)
  @scala.inline
  def UPDATE_SUBMODULES: `65536` = this.cast(65536)
  @scala.inline
  def UPDATE_SUBMODULES_IF_CHANGED: `131072` = this.cast(131072)
  @scala.inline
  def USE_OURS: `2048` = this.cast(2048)
  @scala.inline
  def USE_THEIRS: `4096` = this.cast(4096)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

