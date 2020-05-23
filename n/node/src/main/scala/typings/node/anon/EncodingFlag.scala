package typings.node.anon

import typings.node.BufferEncoding
import typings.node.fsMod.OpenMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EncodingFlag extends js.Object {
  var encoding: BufferEncoding
  var flag: js.UndefOr[OpenMode] = js.undefined
}

object EncodingFlag {
  @scala.inline
  def apply(encoding: BufferEncoding, flag: OpenMode = null): EncodingFlag = {
    val __obj = js.Dynamic.literal(encoding = encoding.asInstanceOf[js.Any])
    if (flag != null) __obj.updateDynamic("flag")(flag.asInstanceOf[js.Any])
    __obj.asInstanceOf[EncodingFlag]
  }
}

