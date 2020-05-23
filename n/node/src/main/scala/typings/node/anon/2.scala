package typings.node.anon

import typings.node.fsMod.BufferEncodingOption
import typings.node.nodeStrings.buffer_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `2` extends BufferEncodingOption {
  var encoding: buffer_
}

object `2` {
  @scala.inline
  def apply(encoding: buffer_): `2` = {
    val __obj = js.Dynamic.literal(encoding = encoding.asInstanceOf[js.Any])
    __obj.asInstanceOf[`2`]
  }
}

