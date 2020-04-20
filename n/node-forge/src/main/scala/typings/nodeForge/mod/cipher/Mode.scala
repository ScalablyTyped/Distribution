package typings.nodeForge.mod.cipher

import typings.nodeForge.mod.util.ByteStringBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Mode extends js.Object {
  var tag: ByteStringBuffer
}

object Mode {
  @scala.inline
  def apply(tag: ByteStringBuffer): Mode = {
    val __obj = js.Dynamic.literal(tag = tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[Mode]
  }
}

