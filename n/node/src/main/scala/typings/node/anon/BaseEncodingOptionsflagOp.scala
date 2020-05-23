package typings.node.anon

import typings.node.BufferEncoding
import typings.node.fsMod.OpenMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined node.fs.BaseEncodingOptions & {  flag ? :node.fs.OpenMode} */
trait BaseEncodingOptionsflagOp extends js.Object {
  var encoding: js.UndefOr[BufferEncoding | Null] = js.undefined
  var flag: js.UndefOr[OpenMode] = js.undefined
}

object BaseEncodingOptionsflagOp {
  @scala.inline
  def apply(encoding: js.UndefOr[Null | BufferEncoding] = js.undefined, flag: OpenMode = null): BaseEncodingOptionsflagOp = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(encoding)) __obj.updateDynamic("encoding")(encoding.asInstanceOf[js.Any])
    if (flag != null) __obj.updateDynamic("flag")(flag.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseEncodingOptionsflagOp]
  }
}

