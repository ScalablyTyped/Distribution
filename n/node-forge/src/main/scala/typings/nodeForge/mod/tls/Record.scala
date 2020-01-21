package typings.nodeForge.mod.tls

import typings.nodeForge.mod.util.ByteBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Record extends js.Object {
  var fragment: ByteBuffer
  var length: Double
  var ready: js.UndefOr[Boolean] = js.undefined
  var `type`: ContentType
  var version: ProtocolVersion
}

object Record {
  @scala.inline
  def apply(
    fragment: ByteBuffer,
    length: Double,
    `type`: ContentType,
    version: ProtocolVersion,
    ready: js.UndefOr[Boolean] = js.undefined
  ): Record = {
    val __obj = js.Dynamic.literal(fragment = fragment.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(ready)) __obj.updateDynamic("ready")(ready.asInstanceOf[js.Any])
    __obj.asInstanceOf[Record]
  }
}

