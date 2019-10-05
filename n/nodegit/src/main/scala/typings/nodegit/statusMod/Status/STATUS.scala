package typings.nodegit.statusMod.Status

import typings.nodegit.nodegitNumbers.`0`
import typings.nodegit.nodegitNumbers.`1024`
import typings.nodegit.nodegitNumbers.`128`
import typings.nodegit.nodegitNumbers.`16384`
import typings.nodegit.nodegitNumbers.`16`
import typings.nodegit.nodegitNumbers.`1`
import typings.nodegit.nodegitNumbers.`2048`
import typings.nodegit.nodegitNumbers.`256`
import typings.nodegit.nodegitNumbers.`2`
import typings.nodegit.nodegitNumbers.`32768`
import typings.nodegit.nodegitNumbers.`4096`
import typings.nodegit.nodegitNumbers.`4`
import typings.nodegit.nodegitNumbers.`512`
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
  - typings.nodegit.nodegitNumbers.`128`
  - typings.nodegit.nodegitNumbers.`256`
  - typings.nodegit.nodegitNumbers.`512`
  - typings.nodegit.nodegitNumbers.`1024`
  - typings.nodegit.nodegitNumbers.`2048`
  - typings.nodegit.nodegitNumbers.`4096`
  - typings.nodegit.nodegitNumbers.`16384`
  - typings.nodegit.nodegitNumbers.`32768`
*/
trait STATUS extends js.Object

object STATUS {
  @scala.inline
  def CONFLICTED: `32768` = this.cast(32768)
  @scala.inline
  def CURRENT: `0` = this.cast(0)
  @scala.inline
  def IGNORED: `16384` = this.cast(16384)
  @scala.inline
  def INDEX_DELETED: `4` = this.cast(4)
  @scala.inline
  def INDEX_MODIFIED: `2` = this.cast(2)
  @scala.inline
  def INDEX_NEW: `1` = this.cast(1)
  @scala.inline
  def INDEX_RENAMED: `8` = this.cast(8)
  @scala.inline
  def INDEX_TYPECHANGE: `16` = this.cast(16)
  @scala.inline
  def WT_DELETED: `512` = this.cast(512)
  @scala.inline
  def WT_MODIFIED: `256` = this.cast(256)
  @scala.inline
  def WT_NEW: `128` = this.cast(128)
  @scala.inline
  def WT_RENAMED: `2048` = this.cast(2048)
  @scala.inline
  def WT_TYPECHANGE: `1024` = this.cast(1024)
  @scala.inline
  def WT_UNREADABLE: `4096` = this.cast(4096)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

