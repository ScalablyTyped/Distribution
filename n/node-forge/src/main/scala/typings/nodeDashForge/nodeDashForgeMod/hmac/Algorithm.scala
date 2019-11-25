package typings.nodeDashForge.nodeDashForgeMod.hmac

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.nodeDashForge.nodeDashForgeStrings.sha1
  - typings.nodeDashForge.nodeDashForgeStrings.md5
  - typings.nodeDashForge.nodeDashForgeStrings.sha256
*/
trait Algorithm extends js.Object

object Algorithm {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def md5: typings.nodeDashForge.nodeDashForgeStrings.md5 = this.cast("md5")
  @scala.inline
  def sha1: typings.nodeDashForge.nodeDashForgeStrings.sha1 = this.cast("sha1")
  @scala.inline
  def sha256: typings.nodeDashForge.nodeDashForgeStrings.sha256 = this.cast("sha256")
}

