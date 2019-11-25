package typings.phoenix.phoenixMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.phoenix.phoenixStrings.arraybuffer
  - typings.phoenix.phoenixStrings.blob
*/
trait BinaryType extends js.Object

object BinaryType {
  @scala.inline
  def arraybuffer: typings.phoenix.phoenixStrings.arraybuffer = this.cast("arraybuffer")
  @scala.inline
  def blob: typings.phoenix.phoenixStrings.blob = this.cast("blob")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

