package typings.node.anon

import typings.node.BufferEncoding
import typings.node.fsMod.Mode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined node.fs.BaseEncodingOptions & {  mode ? :node.fs.Mode,   flag ? :string} */
trait BaseEncodingOptionsmodeMoEncoding extends js.Object {
  var encoding: js.UndefOr[BufferEncoding | Null] = js.undefined
  var flag: js.UndefOr[String] = js.undefined
  var mode: js.UndefOr[Mode] = js.undefined
}

object BaseEncodingOptionsmodeMoEncoding {
  @scala.inline
  def apply(encoding: js.UndefOr[Null | BufferEncoding] = js.undefined, flag: String = null, mode: Mode = null): BaseEncodingOptionsmodeMoEncoding = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(encoding)) __obj.updateDynamic("encoding")(encoding.asInstanceOf[js.Any])
    if (flag != null) __obj.updateDynamic("flag")(flag.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseEncodingOptionsmodeMoEncoding]
  }
}

