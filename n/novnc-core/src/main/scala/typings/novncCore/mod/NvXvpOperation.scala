package typings.novncCore.mod

import typings.novncCore.novncCoreNumbers.`0`
import typings.novncCore.novncCoreNumbers.`1`
import typings.novncCore.novncCoreNumbers.`2`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.novncCore.novncCoreNumbers.`2`
  - typings.novncCore.novncCoreNumbers.`0`
  - typings.novncCore.novncCoreNumbers.`1`
*/
trait NvXvpOperation extends js.Object

object NvXvpOperation {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def reboot: `0` = this.cast(0)
  @scala.inline
  def reset: `1` = this.cast(1)
  @scala.inline
  def shutdown: `2` = this.cast(2)
}

