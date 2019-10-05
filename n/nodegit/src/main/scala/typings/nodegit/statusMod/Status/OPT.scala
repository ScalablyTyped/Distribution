package typings.nodegit.statusMod.Status

import typings.nodegit.nodegitNumbers.`1024`
import typings.nodegit.nodegitNumbers.`128`
import typings.nodegit.nodegitNumbers.`16384`
import typings.nodegit.nodegitNumbers.`16`
import typings.nodegit.nodegitNumbers.`1`
import typings.nodegit.nodegitNumbers.`2048`
import typings.nodegit.nodegitNumbers.`256`
import typings.nodegit.nodegitNumbers.`2`
import typings.nodegit.nodegitNumbers.`32768`
import typings.nodegit.nodegitNumbers.`32`
import typings.nodegit.nodegitNumbers.`4096`
import typings.nodegit.nodegitNumbers.`4`
import typings.nodegit.nodegitNumbers.`512`
import typings.nodegit.nodegitNumbers.`64`
import typings.nodegit.nodegitNumbers.`8192`
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
  - typings.nodegit.nodegitNumbers.`128`
  - typings.nodegit.nodegitNumbers.`256`
  - typings.nodegit.nodegitNumbers.`512`
  - typings.nodegit.nodegitNumbers.`1024`
  - typings.nodegit.nodegitNumbers.`2048`
  - typings.nodegit.nodegitNumbers.`4096`
  - typings.nodegit.nodegitNumbers.`8192`
  - typings.nodegit.nodegitNumbers.`16384`
  - typings.nodegit.nodegitNumbers.`32768`
*/
trait OPT extends js.Object

object OPT {
  @scala.inline
  def DISABLE_PATHSPEC_MATCH: `32` = this.cast(32)
  @scala.inline
  def EXCLUDE_SUBMODULES: `8` = this.cast(8)
  @scala.inline
  def INCLUDE_IGNORED: `2` = this.cast(2)
  @scala.inline
  def INCLUDE_UNMODIFIED: `4` = this.cast(4)
  @scala.inline
  def INCLUDE_UNREADABLE: `16384` = this.cast(16384)
  @scala.inline
  def INCLUDE_UNREADABLE_AS_UNTRACKED: `32768` = this.cast(32768)
  @scala.inline
  def INCLUDE_UNTRACKED: `1` = this.cast(1)
  @scala.inline
  def NO_REFRESH: `4096` = this.cast(4096)
  @scala.inline
  def RECURSE_IGNORED_DIRS: `64` = this.cast(64)
  @scala.inline
  def RECURSE_UNTRACKED_DIRS: `16` = this.cast(16)
  @scala.inline
  def RENAMES_FROM_REWRITES: `2048` = this.cast(2048)
  @scala.inline
  def RENAMES_HEAD_TO_INDEX: `128` = this.cast(128)
  @scala.inline
  def RENAMES_INDEX_TO_WORKDIR: `256` = this.cast(256)
  @scala.inline
  def SORT_CASE_INSENSITIVELY: `1024` = this.cast(1024)
  @scala.inline
  def SORT_CASE_SENSITIVELY: `512` = this.cast(512)
  @scala.inline
  def UPDATE_INDEX: `8192` = this.cast(8192)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

