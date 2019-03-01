package typings
package nodeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BufferEncodingPersistent extends js.Object {
  var encoding: nodeLib.nodeLibStrings.buffer
  var persistent: js.UndefOr[scala.Boolean] = js.undefined
  var recursive: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_BufferEncodingPersistent {
  @scala.inline
  def apply(
    encoding: nodeLib.nodeLibStrings.buffer,
    persistent: js.UndefOr[scala.Boolean] = js.undefined,
    recursive: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_BufferEncodingPersistent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("encoding")(encoding)
    if (!js.isUndefined(persistent)) __obj.updateDynamic("persistent")(persistent)
    if (!js.isUndefined(recursive)) __obj.updateDynamic("recursive")(recursive)
    __obj.asInstanceOf[Anon_BufferEncodingPersistent]
  }
}

